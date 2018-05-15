package co.matisses.b1ws.client;

import co.matisses.b1ws.login.LoginService;
import co.matisses.b1ws.login.LoginServiceSoap;
import co.matisses.b1ws.login.Logout;
import co.matisses.b1ws.login.MsgHeader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dbotero
 */
public class SAPSessionPool extends B1WSServiceInfo {

    private static final Logger log = Logger.getLogger(SAPSessionPool.class.getSimpleName());
    private static List<SAPSession> sessions;
    private int maxSessions = 1;

    private LoginService loginService = null;

    public SAPSessionPool(boolean autoStartPool, int maxSessions) {
        super();
        this.maxSessions = maxSessions;
        sessions = new ArrayList<>();
        try {
            //System.out.println(String.format(RUTA_WSDL, "LoginService"));
            loginService = new LoginService(new URL(String.format(RUTA_WSDL, "LoginService")));
            if (autoStartPool) {
                initializeSessions();
            }
        } catch (Exception e) {
            log.log(Level.SEVERE, "Ocurrio un error al inicializar el pool de sesiones de SAPB1WS. ", e);
        }
    }

    public String getSessionId(boolean createIfNeeded) {
        if ((sessions == null || sessions.isEmpty()) && !createIfNeeded) {
            return null;
        }
        if ((sessions == null || sessions.isEmpty()) && createIfNeeded) {
            sessions.add(new SAPSession(login(), new Date()));
        }

        Collections.sort(sessions);
        SAPSession session = sessions.get(0);
        if (session.isExpired()) {
            String oldSessionId = session.getSessionId();
            closeSession(session.getSessionId());
            session = new SAPSession(login(), new Date());
            log.log(Level.WARNING, "La sesion de SAP {0} ha expirado y fue reemplazada por la sesion {1}. ", new Object[]{oldSessionId, session.getSessionId()});
        } else {
            log.log(Level.INFO, "Usando la sesion de SAP {0}", session.getSessionId());
            session.setLastUsed(new Date());
        }
        sessions.set(0, session);
        return session.getSessionId();
    }

    private void initializeSessions() {
        for (int i = 0; i < maxSessions; i++) {
            sessions.add(new SAPSession(login(), new Date()));
            //System.out.println("session created " + sessions.get(i).getSessionId());
        }
    }

    public void closeSessions() {
        while (!sessions.isEmpty()) {
            SAPSession session = sessions.get(0);
            logout(session.getSessionId());
            //System.out.println("session " + session.getSessionId() + " has been closed");
            sessions.remove(0);
        }
    }

    public void closeSession(String sessionId) {
        if (sessions == null || sessions.isEmpty() || sessionId == null) {
            return;
        }
        for (int i = 0; i < sessions.size(); i++) {
            SAPSession session = sessions.get(i);
            if (session.getSessionId().equals(sessionId)) {
                logout(session.getSessionId());
                //System.out.println("session " + session.getSessionId() + " has been closed");
                sessions.remove(i);
                return;
            }
        }
    }

    private String login() {
        log.log(Level.INFO, "Initializing SAP connection: {0} {1} {2} {3} {4} {5} ",
                new Object[]{DATABASE_SERVER, DATABASE_NAME, DATABASE_TYPE, COMPANY_USERNAME, LANGUAGE, LICENSE_SERVER});
        LoginServiceSoap port = loginService.getLoginServiceSoap12();
        return port.login(DATABASE_SERVER, DATABASE_NAME, DATABASE_TYPE, COMPANY_USERNAME, COMPANY_PASSWORD, LANGUAGE, LICENSE_SERVER);
    }

    private void logout(String sessionId) {
        MsgHeader requestHeader = new MsgHeader();
        requestHeader.setSessionID(sessionId);
        Logout parameters = new Logout();
        LoginServiceSoap port = loginService.getLoginServiceSoap12();
        port.logout(parameters, requestHeader);
    }
}
