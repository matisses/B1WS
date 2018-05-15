package co.matisses.b1ws.client;

import co.matisses.b1ws.login.LoginService;
import co.matisses.b1ws.login.LoginServiceSoap;
import co.matisses.b1ws.login.Logout;
import co.matisses.b1ws.login.MsgHeader;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dbotero
 */
public class SAPSessionManager extends B1WSServiceInfo {
    
    private static final Logger log = Logger.getLogger(SAPSessionManager.class.getSimpleName());
    private LoginService loginService = null;
    
    public SAPSessionManager() {
        try {
            loginService = new LoginService(new URL(String.format(RUTA_WSDL, "LoginService")));
        } catch (Exception e) {
            log.log(Level.SEVERE, "Ocurrio un error al inicializar el pool de sesiones de SAPB1WS. ", e);
        }
    }
    
    public String login() throws B1WSServiceUnavailableException {
        if (loginService == null) {
            throw new B1WSServiceUnavailableException("El servicio B1WS no se encuentra disponible. ");
        }
        log.log(Level.INFO, "Initializing SAP connection: {0} {1} {2} {3} {4} {5} ",
                new Object[]{DATABASE_SERVER, DATABASE_NAME, DATABASE_TYPE, COMPANY_USERNAME, LANGUAGE, LICENSE_SERVER});
        LoginServiceSoap port = loginService.getLoginServiceSoap12();
        return port.login(DATABASE_SERVER, DATABASE_NAME, DATABASE_TYPE, COMPANY_USERNAME, COMPANY_PASSWORD, LANGUAGE, LICENSE_SERVER);
    }
    
    public void logout(String sessionId) throws B1WSServiceUnavailableException {
        if (loginService == null) {
            throw new B1WSServiceUnavailableException("El servicio B1WS no se encuentra disponible. ");
        }
        MsgHeader requestHeader = new MsgHeader();
        requestHeader.setSessionID(sessionId);
        Logout parameters = new Logout();
        LoginServiceSoap port = loginService.getLoginServiceSoap12();
        try {
            port.logout(parameters, requestHeader);
        } catch (Exception e) {
            log.log(Level.WARNING, "No se pudo cerrar la sesion con ID {0}. {1}", new Object[]{sessionId, e.getMessage()});
        }
    }
}
