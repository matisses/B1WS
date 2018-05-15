package co.matisses.b1ws.client.journalentries;

import co.matisses.b1ws.client.B1WSServiceInfo;
import co.matisses.b1ws.dto.JournalEntryDTO;
import co.matisses.b1ws.dto.JournalEntryLineDTO;
import co.matisses.b1ws.journalentries.Add;
import co.matisses.b1ws.journalentries.AddResponse;
import co.matisses.b1ws.journalentries.JournalEntriesService;
import co.matisses.b1ws.journalentries.JournalEntriesServiceSoap;
import co.matisses.b1ws.journalentries.JournalEntry;
import co.matisses.b1ws.journalentries.MsgHeader;
import java.math.BigDecimal;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeFactory;

/**
 *
 * @author dbotero
 */
public class JournalEntriesServiceConnector extends B1WSServiceInfo {

    private static final Logger log = Logger.getLogger(JournalEntriesServiceConnector.class.getSimpleName());
    private JournalEntriesService service;
    private String sessionId;

    public JournalEntriesServiceConnector(JournalEntriesService service, String sessionId) {
        super();
        this.service = service;
        this.sessionId = sessionId;
    }

    public Long createJournalEntry(JournalEntryDTO jEntry) throws JournalEntryServiceException {
        log.log(Level.INFO, "Se recibio un asiento para crear. {0}", jEntry);
        JournalEntriesServiceSoap port = service.getJournalEntriesServiceSoap12();
        if (sessionId == null) {
            throw new JournalEntryServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }

        MsgHeader header = new MsgHeader();
        header.setServiceName(JOURNAL_ENTRIES_SERVICE_WSDL_NAME);
        header.setSessionID(sessionId);

        JournalEntry enc = new JournalEntry();
        try {
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(jEntry.getDueDate());
            enc.setDueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));

            cal.setTime(jEntry.getRefDate());
            enc.setReferenceDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));

            cal.setTime(jEntry.getTaxDate());
            enc.setTaxDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));
        } catch (Exception e) {
            throw new JournalEntryServiceException("Ocurrio un error al configurar la fecha de causacion del documento. " + e.getMessage());
        }
        enc.setMemo(jEntry.getMemo());
        enc.setReference(jEntry.getRef1());
        enc.setReference2(jEntry.getRef2());
        enc.setReference3(jEntry.getRef3());
        enc.setTransactionCode(jEntry.getTransactionCode());

        JournalEntry.JournalEntryLines lines = new JournalEntry.JournalEntryLines();
        for (JournalEntryLineDTO jEntryLine : jEntry.getLines()) {
            JournalEntry.JournalEntryLines.JournalEntryLine line = new JournalEntry.JournalEntryLines.JournalEntryLine();
            line.setLineID(jEntryLine.getLineId());
            line.setShortName(jEntryLine.getShortName());
            line.setCredit(new BigDecimal(jEntryLine.getCredit()));
            line.setDebit(new BigDecimal(jEntryLine.getDebit()));
            line.setLineMemo(jEntryLine.getLineMemo());
            line.setCostingCode2(jEntryLine.getOcrCode2());
            line.setProjectCode(jEntryLine.getProject());
            line.setReference1(jEntryLine.getRef1());
            line.setReference2(jEntryLine.getRef2());
            line.setUInfoCo01(jEntryLine.getInfoCo01());
            line.setContraAccount(jEntryLine.getContraAccount());
            try {
                GregorianCalendar cal = new GregorianCalendar();
                cal.setTime(jEntry.getDueDate());
                line.setDueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));

                cal.setTime(jEntry.getRefDate());
                line.setReferenceDate1(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));

                cal.setTime(jEntry.getTaxDate());
                line.setTaxDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));
            } catch (Exception e) {
                throw new JournalEntryServiceException("Ocurrio un error al configurar la fecha de causacion del documento. " + e.getMessage());
            }
            lines.getJournalEntryLine().add(line);
        }
        enc.setJournalEntryLines(lines);

        Add addParams = new Add();
        addParams.setJournalEntry(enc);
        try {
            AddResponse resp = port.add(addParams, header);
            return resp.getJournalEntryParams().getJdtNum();
        } catch (Exception e) {
            throw new JournalEntryServiceException("No fue posible crear el asiento. " + e.getMessage());
        }
    }
}
