package co.matisses.b1ws.client.quotations;

import co.matisses.b1ws.client.B1WSServiceInfo;
import co.matisses.b1ws.quotations.Add;
import co.matisses.b1ws.quotations.AddResponse;
import co.matisses.b1ws.quotations.Document;
import co.matisses.b1ws.quotations.MsgHeader;
import co.matisses.b1ws.quotations.QuotationsService;
import co.matisses.b1ws.quotations.QuotationsServiceSoap;
import co.matisses.b1ws.quotations.Update;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

/**
 *
 * @author dbotero
 */
public class QuotationsServiceConnector extends B1WSServiceInfo {

    private static final Logger log = Logger.getLogger(QuotationsServiceConnector.class.getSimpleName());
    private final String sessionId;
    private final QuotationsService service;

    public QuotationsServiceConnector(QuotationsService service, String sessionId) {
        super();
        this.sessionId = sessionId;
        this.service = service;
    }

    public QuotationsServiceConnector(String sessionId) {
        this.sessionId = sessionId;
        this.service = new QuotationsService();
    }

    public Long createQuotationDocument(QuotationsDocumentDTO document) throws QuotationsServiceException {
        QuotationsServiceSoap port = service.getQuotationsServiceSoap12();
        if (sessionId == null) {
            throw new QuotationsServiceException("No se recibio un Id de sesion de B1WS valido.");
        }

        MsgHeader requestHeader = new MsgHeader();
        requestHeader.setSessionID(sessionId);
        requestHeader.setServiceName(QUOTATIONS_SERVICE_WSDL_NAME);

        Document quotation = new Document();

        quotation.setCardCode(document.getCardCode());
        quotation.setSalesPersonCode(document.getSalesPersonCode());
        quotation.setJournalMemo("Oferta de ventas - " + document.getCardCode());
        quotation.setSeries(20L);
        quotation.setComments("Cotización creada desde 360.");
        quotation.setUOrigen("T");

        Document.DocumentLines lines = new Document.DocumentLines();

        long lineNum = 0;
        for (QuotationsDocumentLinesDTO line : document.getQuotationsDocumentLines()) {
            Document.DocumentLines.DocumentLine linea = new Document.DocumentLines.DocumentLine();

            linea.setItemCode(line.getItemCode());
            linea.setQuantity(line.getQuantity().doubleValue());
            linea.setWarehouseCode(line.getWarehouseCode());
            linea.setLineNum(lineNum);

            lines.getDocumentLine().add(linea);
            lineNum++;
        }

        quotation.setDocumentLines(lines);

        Add parameters = new Add();
        parameters.setDocument(quotation);

        try {
            log.log(Level.INFO, quotation.toString());
            AddResponse resp = port.add(parameters, requestHeader);
            return resp.getDocumentParams().getDocEntry();
        } catch (Exception e) {
            log.log(Level.SEVERE, "Ocurrio un error al crear la cotizacion.", e);
            throw new QuotationsServiceException(e.getMessage());
        }
    }

    public void editQuotation(QuotationsDocumentDTO document) throws QuotationsServiceException {
        QuotationsServiceSoap port = service.getQuotationsServiceSoap12();
        if (sessionId == null) {
            throw new QuotationsServiceException("No se recibio un Id de sesion de B1WS valido.");
        }

        MsgHeader requestHeader = new MsgHeader();
        requestHeader.setSessionID(sessionId);
        requestHeader.setServiceName(QUOTATIONS_SERVICE_WSDL_NAME);

        Document quotation = new Document();

        quotation.setDocEntry(document.getDocEntry());
        quotation.setDocNum(document.getDocEntry());
        quotation.setDocDate(document.getDocDate());
        quotation.setDocDueDate(document.getDocDueDate());
        quotation.setCardCode(document.getCardCode());
        quotation.setCardName(document.getCardName());
        quotation.setAddress(document.getAddress());
        quotation.setJournalMemo("Oferta de ventas - " + document.getCardCode());
        quotation.setComments("Cotización modificada desde 360.");
        quotation.setPaymentGroupCode(document.getPaymentGroupCode());
        quotation.setSalesPersonCode(document.getSalesPersonCode());
        quotation.setContactPersonCode(document.getContactPersonCode());
        quotation.setShipToCode(document.getShipToCode());
        quotation.setDocumentsOwner(document.getDocumentsOwner());
        quotation.setAddress2(document.getAddress2());
        quotation.setPayToCode(document.getPayToCode());
        quotation.setControlAccount("13050501");
        quotation.setExtraMonth(document.getExtraMonth());
        quotation.setExtraDays(document.getExtraDays());
        quotation.setStartFrom("pdt_None");
        quotation.setDownPaymentStatus("so_Open");
        quotation.setApplyCurrentVATRatesForDownPaymentsToDraw("tNO");
        quotation.setDocumentDelivery("ddtNoneSeleted");
        quotation.setUOrigen("T");

        Document.DocumentLines lines = new Document.DocumentLines();

        long linea = 0L;
        for (QuotationsDocumentLinesDTO l : document.getQuotationsDocumentLines()) {
            Document.DocumentLines.DocumentLine line = new Document.DocumentLines.DocumentLine();

            line.setItemCode(l.getItemCode());
            line.setQuantity(l.getQuantity().doubleValue());
            line.setCurrency("COP");
            line.setWarehouseCode(l.getWarehouseCode());
            line.setFactor1(1.0);
            line.setFactor2(1.0);
            line.setFactor3(1.0);
            line.setFactor4(1.0);
            line.setTaxCode(l.getTaxCode());
            line.setInventoryQuantity(l.getQuantity().doubleValue());
            if (l.getLinea() > 0) {
                line.setLineNum(l.getLinea().longValue());
                linea = l.getLinea();
            } else {
                line.setLineNum(linea);
            }

            lines.getDocumentLine().add(line);
            linea++;
        }

        quotation.setDocumentLines(lines);

        Document.TaxExtension taxExtension = new Document.TaxExtension();

        taxExtension.setStreetS(document.getTaxExtension().getStreetS());
        taxExtension.setBlockS(document.getTaxExtension().getBlockS());
        taxExtension.setBuildingS(document.getTaxExtension().getBuildingS());
        taxExtension.setCityS(document.getTaxExtension().getCityS());
        taxExtension.setCountyS(document.getTaxExtension().getCountyS());
        taxExtension.setStateS(document.getTaxExtension().getStateS());
        taxExtension.setCountryS(document.getTaxExtension().getCountryS());
        taxExtension.setStreetB(document.getTaxExtension().getStreetB());
        taxExtension.setBlockB(document.getTaxExtension().getBlockB());
        taxExtension.setBuildingB(document.getTaxExtension().getBuildingB());
        taxExtension.setCityB(document.getTaxExtension().getCityB());
        taxExtension.setCountyB(document.getTaxExtension().getCountyB());
        taxExtension.setStateB(document.getTaxExtension().getStateB());
        taxExtension.setCountryB(document.getTaxExtension().getCountryB());

        quotation.setTaxExtension(taxExtension);

        Document.AddressExtension addressExtension = new Document.AddressExtension();

        addressExtension.setShipToStreet(document.getAddressExtension().getShipToStreet());
        addressExtension.setShipToBlock(document.getAddressExtension().getShipToBlock());
        addressExtension.setShipToBuilding(document.getAddressExtension().getShipToBuilding());
        addressExtension.setShipToCity(document.getAddressExtension().getShipToCity());
        addressExtension.setShipToCounty(document.getAddressExtension().getShipToCounty());
        addressExtension.setShipToState(document.getAddressExtension().getShipToState());
        addressExtension.setShipToCountry(document.getAddressExtension().getShipToCountry());
        addressExtension.setBillToStreet(document.getAddressExtension().getBillToStreet());
        addressExtension.setBillToBlock(document.getAddressExtension().getBillToBlock());
        addressExtension.setBillToBuilding(document.getAddressExtension().getBillToBuilding());
        addressExtension.setBillToCity(document.getAddressExtension().getBillToCity());
        addressExtension.setBillToCounty(document.getAddressExtension().getBillToCounty());
        addressExtension.setBillToState(document.getAddressExtension().getBillToState());
        addressExtension.setBillToCountry(document.getAddressExtension().getBillToCountry());

        quotation.setAddressExtension(addressExtension);

        try {
            Update update = new Update();
            update.setDocument(quotation);
            port.update(update, requestHeader);
            log.log(Level.INFO, "Se actualizo la cotizacion {0} satisfactoriamente", document.getDocEntry());
        } catch (Exception e) {
            log.log(Level.SEVERE, "Ocurrio un error al modificar la cotizacion. ", e);
            throw new QuotationsServiceException("No fue posible modificar la cotizacion. " + e.getMessage());
        }
    }

    public static void main(String[] args) throws QuotationsServiceException, DatatypeConfigurationException, ParseException {
        QuotationsDocumentDTO document = new QuotationsDocumentDTO();

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse("2017-02-27"));
        GregorianCalendar calendar2 = new GregorianCalendar();
        calendar2.setTime(new SimpleDateFormat("yyyy-MM-dd").parse("2017-03-27"));

        document.setDocEntry(34654L);
        document.setDocDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar));
        document.setDocDueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar2));
        document.setCardCode("1040748191CL");
        document.setCardName("GIL JARAMILLO YEISON");
        document.setAddress("CLL 5 3 B CALDAS (Boyacá) COLOMBIA");
        document.setPaymentGroupCode(-1L);
        document.setSalesPersonCode(240L);
        document.setContactPersonCode(2278L);
        document.setShipToCode("ABUELA");
        document.setDocumentsOwner(190L);
        document.setAddress2("CLL 5 3 B CALDAS (Boyacá) COLOMBIA");
        document.setPayToCode("ABUELA");
        document.setExtraMonth(0L);
        document.setExtraDays(0L);

        QuotationsDocumentLinesDTO lines = new QuotationsDocumentLinesDTO();

        lines.setItemCode("22200000000000000005");
        lines.setQuantity(3);
        lines.setWarehouseCode("0104");
        lines.setTaxCode("IGV19");
        lines.setLinea(0);

        document.getQuotationsDocumentLines().add(lines);

        TaxExtensionDTO taxExtension = new TaxExtensionDTO();

        taxExtension.setStreetS("CLL 5 3 B");
        taxExtension.setBlockS("3004123077");
        taxExtension.setBuildingS("3004123077");
        taxExtension.setCityS("CALDAS (Boyacá)");
        taxExtension.setCountyS("GILYEISON@GMAIL.COM");
        taxExtension.setStateS("15");
        taxExtension.setCountryS("CO");
        taxExtension.setStreetB("CLL 5 3 B");
        taxExtension.setBlockB("3004123077");
        taxExtension.setBuildingB("3004123077");
        taxExtension.setCityB("CALDAS (Boyacá)");
        taxExtension.setCountyB("GILYEISON@GMAIL.COM");
        taxExtension.setStateB("15");
        taxExtension.setCountryB("CO");

        document.setTaxExtension(taxExtension);

        AddressExtensionDTO addressExtension = new AddressExtensionDTO();

        addressExtension.setShipToStreet("CLL 5 3 B");
        addressExtension.setShipToBlock("3004123077");
        addressExtension.setShipToBuilding("3004123077");
        addressExtension.setShipToCity("CALDAS (Boyacá)");
        addressExtension.setShipToCounty("GILYEISON@GMAIL.COM");
        addressExtension.setShipToState("15");
        addressExtension.setShipToCountry("CO");
        addressExtension.setBillToStreet("CLL 5 3 B");
        addressExtension.setBillToBlock("3004123077");
        addressExtension.setBillToBuilding("3004123077");
        addressExtension.setBillToCity("CALDAS (Boyacá)");
        addressExtension.setBillToCounty("GILYEISON@GMAIL.COM");
        addressExtension.setBillToState("15");
        addressExtension.setBillToCountry("CO");

        document.setAddressExtension(addressExtension);

        QuotationsServiceConnector connector = new QuotationsServiceConnector("EB6153BE-24E0-46B8-B6D4-D0B01AC245C7");

        connector.editQuotation(document);
    }
}
