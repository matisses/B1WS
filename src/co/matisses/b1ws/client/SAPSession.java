package co.matisses.b1ws.client;

import java.util.Date;

/**
 *
 * @author dbotero
 */
public class SAPSession implements Comparable<SAPSession> {

    private String sessionId;
    private Date lastUsed;
    private Date created;

    public SAPSession() {
        created = new Date();
    }

    public SAPSession(String sessionId, Date lastUsed) {
        this.sessionId = sessionId;
        this.lastUsed = lastUsed;
        created = new Date();
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Date getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(Date lastUsed) {
        this.lastUsed = lastUsed;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public int compareTo(SAPSession o) {
        return lastUsed.compareTo(o.getLastUsed());
    }

    public boolean isExpired() {
        //Las sesiones expiran 24 horas despues de creadas (86400000 = 24 horas en milisegundos)
        return (System.currentTimeMillis() - created.getTime()) > 86400000;
    }
}
