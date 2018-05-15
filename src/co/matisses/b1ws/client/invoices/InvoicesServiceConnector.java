package co.matisses.b1ws.client.invoices;

import co.matisses.b1ws.client.B1WSServiceInfo;
import co.matisses.b1ws.dto.SalesDocumentDTO;
import co.matisses.b1ws.dto.SalesDocumentLineBinAllocationDTO;
import co.matisses.b1ws.dto.SalesDocumentLineDTO;
import co.matisses.b1ws.invoices.Add;
import co.matisses.b1ws.invoices.AddResponse;
import co.matisses.b1ws.invoices.Document;
import co.matisses.b1ws.invoices.InvoicesService;
import co.matisses.b1ws.invoices.InvoicesServiceSoap;
import co.matisses.b1ws.invoices.MsgHeader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dbotero
 */
public class InvoicesServiceConnector extends B1WSServiceInfo {

    private static final Logger log = Logger.getLogger(InvoicesServiceConnector.class.getSimpleName());
    private InvoicesService invoicesService = null;
    private String sessionId = null;

    public InvoicesServiceConnector(InvoicesService invoicesService, String sessionId) {
        super();
        this.sessionId = sessionId;
        this.invoicesService = invoicesService;
    }

    private Document createBasicDocument(SalesDocumentDTO docDto) {
        Document document = new Document();
        document.setCardCode(docDto.getCardCode());
        if (docDto.getComments() != null && docDto.getComments().length() > 254) {
            docDto.setComments(docDto.getComments().substring(0, 254));
        }
        document.setComments(docDto.getComments());

        //assign sales people and commissions
        for (int i = 0; i < 5; i++) {
            int salesEmployees = docDto.getSalesEmployees().size();
            if (i < salesEmployees) {
                String slpName = docDto.getSalesEmployees().get(i).getName();
                switch (i) {
                    case 0:
                        document.setUVendedor1(slpName);
                        document.setUComVend1(String.valueOf(SalesDocumentDTO.calculateCommission(1, salesEmployees)));
                        break;
                    case 1:
                        document.setUVendedor2(slpName);
                        document.setUComVend2(String.valueOf(SalesDocumentDTO.calculateCommission(2, salesEmployees)));
                        break;
                    case 2:
                        document.setUVendedor3(slpName);
                        document.setUComVend3(String.valueOf(SalesDocumentDTO.calculateCommission(3, salesEmployees)));
                        break;
                    case 3:
                        document.setUVendedor4(slpName);
                        document.setUComVend4(String.valueOf(SalesDocumentDTO.calculateCommission(4, salesEmployees)));
                        break;
                    case 4:
                        document.setUVendedor5(slpName);
                        document.setUComVend5(String.valueOf(SalesDocumentDTO.calculateCommission(5, salesEmployees)));
                        break;
                    default:
                        break;
                }
            }
        }

        document.setUOrigen(docDto.getSource());
        document.setSalesPersonCode(98L);
        document.setSeries(Long.parseLong(docDto.getSeriesCode()));
        document.setPaymentGroupCode(Long.parseLong(docDto.getPaymentGroupCode()));
        document.setUWUID(docDto.getWuid());
        document.setPOSCashierNumber(docDto.getPosShiftId());
        document.setNumAtCard(docDto.getRefDocnum());
        document.setUPrestashopID(docDto.getPrestashopOrderID());

        Document.DocumentLines documentLines = new Document.DocumentLines();
        long lineNum = 0;
        for (SalesDocumentLineDTO docLine : docDto.getDocumentLines()) {
            Document.DocumentLines.DocumentLine line = new Document.DocumentLines.DocumentLine();
            line.setItemCode(docLine.getItemCode());
            line.setQuantity(docLine.getQuantity().doubleValue());
            line.setWarehouseCode(docLine.getWhsCode());
            //ventas
            line.setCostingCode2(docDto.getSalesCostingCode());
            //logistica
            line.setCostingCode3(docDto.getLogisticsCostingCode());
            //ruta
            line.setCostingCode4(docDto.getRouteCostingCode());
            line.setProjectCode(docDto.getProjectCode());
            if (docDto.getShippingStatus() == null || docDto.getShippingStatus().trim().isEmpty()) {
                line.setUEstadoP(ESTADO_PRODUCTO_DESPACHADO);
            } else {
                line.setUEstadoP(docDto.getShippingStatus());
            }
            if (docLine.getDiscountPercent() != null && docLine.getDiscountPercent() != 0) {
                line.setDiscountPercent(docLine.getDiscountPercent());
            }
            line.setLineNum(lineNum);

            Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations binAllocations = new Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations();

            for (SalesDocumentLineBinAllocationDTO binAllocDto : docLine.getBinAllocations()) {
                Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation binAllocation = new Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation();
                binAllocation.setBinAbsEntry(Long.valueOf(binAllocDto.getBinAbsEntry()));
                binAllocation.setBaseLineNumber(lineNum);
                binAllocation.setQuantity(binAllocDto.getQuantity().doubleValue());

                binAllocations.getDocumentLinesBinAllocation().add(binAllocation);
            }
            line.setDocumentLinesBinAllocations(binAllocations);

            documentLines.getDocumentLine().add(line);
            lineNum++;
        }
        document.setDocumentLines(documentLines);
        return document;
    }

    public Long createInvoice(SalesDocumentDTO docDto) throws InvoiceServiceException {
        if (docDto != null) {
            log.log(Level.INFO, docDto.toString());
        }
        InvoicesServiceSoap port = invoicesService.getInvoicesServiceSoap12();
        if (sessionId == null) {
            throw new InvoiceServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }

        //Configura el encabezado de la solicitud
        MsgHeader requestHeader = new MsgHeader();
        requestHeader.setSessionID(sessionId);
        requestHeader.setServiceName(INVOICES_SERVICE_WSDL_NAME);

        Document document = createBasicDocument(docDto);

        //Configura el cuerpo de la solicitud
        Add parameters = new Add();
        parameters.setDocument(document);

        Long invoiceNumber = null;
        try {
            AddResponse resp = port.add(parameters, requestHeader);
            invoiceNumber = resp.getDocumentParams().getDocEntry();
        } catch (Exception e) {
            Logger.getLogger(InvoicesServiceConnector.class.getName()).log(Level.SEVERE, "Ocurrio un error al crear la factura. ", e);
            throw new InvoiceServiceException("No fue posible crear la factura. " + e.getMessage());
        }

        return invoiceNumber;
    }

    public Long createFurnitureInvoice(SalesDocumentDTO salesDocument) throws InvoiceServiceException {
        InvoicesServiceSoap port = invoicesService.getInvoicesServiceSoap12();
        if (sessionId == null) {
            throw new InvoiceServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }

        //Configura el encabezado de la solicitud
        MsgHeader requestHeader = new MsgHeader();
        requestHeader.setSessionID(sessionId);
        requestHeader.setServiceName(INVOICES_SERVICE_WSDL_NAME);

        Document document = new Document();

        document.setCardCode(salesDocument.getCardCode());
        document.setSeries(Long.parseLong(salesDocument.getSeriesCode()));
        document.setUWUID(salesDocument.getWuid());
        document.setDocumentLines(new Document.DocumentLines());
        document.setPaymentGroupCode(15L);
        document.setUOrigen("T");
        document.setComments("FACTURA creada por 360 - " + salesDocument.getComments());
        document.setNumAtCard(salesDocument.getRefDocnum());
        document.setUDiseno(salesDocument.getuDiseno());

        //assign sales people and commissions
        for (int i = 0; i < 5; i++) {
            int salesEmployees = salesDocument.getSalesEmployees().size();
            if (i < salesEmployees) {
                String slpName = salesDocument.getSalesEmployees().get(i).getName();
                switch (i) {
                    case 0:
                        document.setUVendedor1(slpName);
                        document.setUComVend1(String.valueOf(SalesDocumentDTO.calculateCommission(1, salesEmployees)));
                        break;
                    case 1:
                        document.setUVendedor2(slpName);
                        document.setUComVend2(String.valueOf(SalesDocumentDTO.calculateCommission(2, salesEmployees)));
                        break;
                    case 2:
                        document.setUVendedor3(slpName);
                        document.setUComVend3(String.valueOf(SalesDocumentDTO.calculateCommission(3, salesEmployees)));
                        break;
                    case 3:
                        document.setUVendedor4(slpName);
                        document.setUComVend4(String.valueOf(SalesDocumentDTO.calculateCommission(4, salesEmployees)));
                        break;
                    case 4:
                        document.setUVendedor5(slpName);
                        document.setUComVend5(String.valueOf(SalesDocumentDTO.calculateCommission(5, salesEmployees)));
                        break;
                    default:
                        break;
                }
            }
        }

        for (SalesDocumentLineDTO line : salesDocument.getDocumentLines()) {
            Document.DocumentLines.DocumentLine l = new Document.DocumentLines.DocumentLine();

            l.setItemCode(line.getItemCode());
            l.setWarehouseCode(line.getWhsCode());
            l.setQuantity(line.getQuantity().doubleValue());
            l.setCostingCode2(salesDocument.getSalesCostingCode());
            l.setCostingCode3(salesDocument.getLogisticsCostingCode());
            l.setCostingCode4(salesDocument.getRouteCostingCode());
            l.setProjectCode(salesDocument.getProjectCode());
            l.setUEstadoP(line.getStatus());
            l.setLineNum(line.getLineNum().longValue());
            l.setDocumentLinesBinAllocations(new Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations());
            if (line.getBaseLine() != null && line.getBaseEntry() != null && line.getBaseEntry() != 0) {
                l.setBaseLine(line.getBaseLine());
                l.setBaseEntry(line.getBaseEntry());
                l.setBaseType(23L);
            }

            for (SalesDocumentLineBinAllocationDTO allocation : line.getBinAllocations()) {
                Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation b = new Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation();

                b.setBaseLineNumber(line.getLineNum().longValue());
                b.setBinAbsEntry(allocation.getBinAbsEntry().longValue());
                b.setQuantity(allocation.getQuantity().doubleValue());

                l.getDocumentLinesBinAllocations().getDocumentLinesBinAllocation().add(b);
            }

            document.getDocumentLines().getDocumentLine().add(l);
        }

        //Configura el cuerpo de la solicitud
        Add parameters = new Add();
        parameters.setDocument(document);

        Long invoiceNumber = null;
        try {
            AddResponse resp = port.add(parameters, requestHeader);
            invoiceNumber = resp.getDocumentParams().getDocEntry();
        } catch (Exception e) {
            Logger.getLogger(InvoicesServiceConnector.class.getName()).log(Level.SEVERE, "Ocurrio un error al crear la factura. ", e);
            throw new InvoiceServiceException("No fue posible crear la factura. " + e.getMessage());
        }

        return invoiceNumber;
    }

    /**
     * Se elimina el metodo de anulacion de facturas a traves de taskcentre ya
     * que se debe usar la funcionalidad de anulaciones directa del modulo b1ws
     * client
     */
//    public void voidInvoice(Long docEntry) throws InvoiceServiceException {
//        InvoicesServiceSoap port = invoicesService.getInvoicesServiceSoap12();
//        if (sessionId == null) {
//            throw new InvoiceServiceException("No se recibio un ID de sesion de B1WS valido. ");
//        }
//
//        //Configura el encabezado de la solicitud
//        MsgHeader requestHeader = new MsgHeader();
//        requestHeader.setSessionID(sessionId);
//        requestHeader.setServiceName(INVOICES_SERVICE_WSDL_NAME);
//
//        Document doc = new Document();
//        doc.setDocEntry(docEntry);
//        doc.setUCreaNC("A");
//
//        Update request = new Update();
//        request.setDocument(doc);
//        try {
//            port.update(request, requestHeader);
//        } catch (Exception e) {
//            Logger.getLogger(InvoicesServiceConnector.class.getName()).log(Level.SEVERE, "Ocurrio un error al anular la factura. ", e);
//            throw new InvoiceServiceException("No fue posible anular la factura. " + e.getMessage());
//        }
//    }
}
