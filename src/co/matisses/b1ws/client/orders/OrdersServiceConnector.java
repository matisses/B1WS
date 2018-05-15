package co.matisses.b1ws.client.orders;

import co.matisses.b1ws.client.B1WSServiceInfo;
import co.matisses.b1ws.dto.OrderDTO;
import co.matisses.b1ws.dto.OrderDetailDTO;
import co.matisses.b1ws.orders.Add;
import co.matisses.b1ws.orders.AddResponse;
import co.matisses.b1ws.orders.Cancel;
import co.matisses.b1ws.orders.Document;
import co.matisses.b1ws.orders.DocumentParams;
import co.matisses.b1ws.orders.MsgHeader;
import co.matisses.b1ws.orders.OrdersService;
import co.matisses.b1ws.orders.OrdersServiceSoap;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeFactory;

/**
 *
 * @author dbotero
 */
public class OrdersServiceConnector extends B1WSServiceInfo {

    private static final Logger log = Logger.getLogger(OrdersServiceConnector.class.getSimpleName());
    private OrdersService service;
    private String sessionId;

    public OrdersServiceConnector(OrdersService service, String sessionId) {
        super();
        this.service = service;
        this.sessionId = sessionId;
    }

    public Long createOrder(OrderDTO orderDto) throws OrderServiceException {
        log.log(Level.INFO, "Se recibio una orden para crear. {0}", orderDto);
        OrdersServiceSoap port = service.getOrdersServiceSoap12();
        if (sessionId == null) {
            throw new OrderServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }

        MsgHeader header = new MsgHeader();
        header.setServiceName(ORDER_SERVICE_WSDL_NAME);
        header.setSessionID(sessionId);

        Document document = new Document();
        document.setCardCode(orderDto.getCardCode());
        document.setSeries(orderDto.getSeries());
        document.setNumAtCard(orderDto.getInvoiceNumber());
        try {
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(orderDto.getDocDate());
            GregorianCalendar cal2 = new GregorianCalendar();
            cal2.setTime(orderDto.getDocDueDate());
            document.setDocDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));
            document.setDocDueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal2));
            document.setTaxDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));
        } catch (Exception e) {
            log.log(Level.WARNING, "No se pudieron configurar las fechas de la orden. ", e);
        }

        document.setComments(orderDto.getComments());
        document.setSalesPersonCode(orderDto.getSalesPersonCode());
        document.setUOrigen(orderDto.getOrigen());
        document.setUNumFact(orderDto.getInvoiceNumber());
        document.setConfirmed("N");

        Document.DocumentLines docLines = new Document.DocumentLines();
        for (OrderDetailDTO dto : orderDto.getDetail()) {
            Document.DocumentLines.DocumentLine docLine = new Document.DocumentLines.DocumentLine();
            docLine.setLineNum(dto.getLineNum());
            docLine.setItemCode(dto.getItemCode());
            docLine.setQuantity(dto.getQuantity());
            docLine.setWarehouseCode(dto.getWarehouseCode());
            docLine.setULineNumFv(dto.getLineNum());
            docLine.setUEstadoP(dto.getEstado());
            docLine.setBaseType(orderDto.getBaseType());
            docLine.setBaseEntry(orderDto.getBaseEntry());
            docLine.setBaseLine(dto.getLineNum());
            docLine.setUNWRBase(orderDto.getInvoiceNumber());
            try {
                GregorianCalendar cal2 = new GregorianCalendar();
                cal2.setTime(orderDto.getDocDueDate());
                docLine.setUCustDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal2));
            } catch (Exception e) {
            }

            docLines.getDocumentLine().add(docLine);
        }
        document.setDocumentLines(docLines);

        Add add = new Add();
        add.setDocument(document);

        try {
            AddResponse response = port.add(add, header);
            return response.getDocumentParams().getDocEntry();
        } catch (Exception e) {
            log.log(Level.SEVERE, "Ocurrio un error al crear la orden. ", e);
            throw new OrderServiceException("Ocurrio un error al crear la orden de venta. " + e.getMessage());
        }
    }

    public void cancelOrder(Long docEntry) throws OrderServiceException {
        log.log(Level.INFO, "Se recibio una orden para cancelar. {0}", docEntry);
        OrdersServiceSoap port = service.getOrdersServiceSoap12();
        if (sessionId == null) {
            throw new OrderServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }

        MsgHeader header = new MsgHeader();
        header.setServiceName(ORDER_SERVICE_WSDL_NAME);
        header.setSessionID(sessionId);
        try {
            DocumentParams params = new DocumentParams();
            params.setDocEntry(docEntry);

            Cancel req = new Cancel();
            req.setDocumentParams(params);

            port.cancel(req, header);
        } catch (Exception e) {
            log.log(Level.SEVERE, "Ocurrio un error al cancelar la orden de venta. ", e);
            throw new OrderServiceException("Ocurrio un error al cancelar la orden de venta. " + e);
        }
    }
}
