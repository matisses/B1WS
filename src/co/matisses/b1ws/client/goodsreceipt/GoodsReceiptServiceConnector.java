package co.matisses.b1ws.client.goodsreceipt;

import co.matisses.b1ws.client.B1WSServiceInfo;
import co.matisses.b1ws.goodsreceipt.Add;
import co.matisses.b1ws.goodsreceipt.AddResponse;
import co.matisses.b1ws.goodsreceipt.Document;
import co.matisses.b1ws.goodsreceipt.InventoryGenEntryService;
import co.matisses.b1ws.goodsreceipt.InventoryGenEntryServiceSoap;
import co.matisses.b1ws.goodsreceipt.MsgHeader;
import java.math.BigDecimal;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;

/**
 *
 * @author dbotero
 */
public class GoodsReceiptServiceConnector extends B1WSServiceInfo {

    private InventoryGenEntryService service;
    private String sessionId;

    public GoodsReceiptServiceConnector(InventoryGenEntryService service, String sessionId) {
        super();
        this.service = service;
        this.sessionId = sessionId;
    }

    public Long createDocument(GoodsReceiptDTO goodsReceiptDto) throws GoodsReceiptServiceException {
        InventoryGenEntryServiceSoap port = service.getInventoryGenEntryServiceSoap12();
        if (sessionId == null) {
            throw new GoodsReceiptServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }

        MsgHeader header = new MsgHeader();
        header.setServiceName(GOODS_RECEIPT_SERVICE_WSDL_NAME);
        header.setSessionID(sessionId);

        Document document = new Document();
        document.setReference2(goodsReceiptDto.getInvoiceNumber());
        document.setSeries(goodsReceiptDto.getSeries());
        document.setComments(goodsReceiptDto.getComments());
        document.setJournalMemo(goodsReceiptDto.getJournalMemo());
        document.setGroupNumber(goodsReceiptDto.getGroupNumber());
        document.setUOrigen(goodsReceiptDto.getOrigen());
        try {
            document.setTaxDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
        } catch (Exception e) {
            throw new GoodsReceiptServiceException("Ocurrio un error al configurar la fecha de causacion del documento. " + e.getMessage());
        }

        Document.DocumentLines docLines = new Document.DocumentLines();
        for (GoodsReceiptDetailDTO detail : goodsReceiptDto.getDetail()) {
            Document.DocumentLines.DocumentLine docLine = new Document.DocumentLines.DocumentLine();
            docLine.setAccountCode(detail.getAccountCode());
            docLine.setLineNum(detail.getLineNum());
            docLine.setItemCode(detail.getItemCode());
            docLine.setQuantity(Double.valueOf(detail.getQuantity()));
            docLine.setWarehouseCode(detail.getWhsCode());
            docLine.setUnitPrice(new BigDecimal(detail.getPrice()));

            Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations binAllocations = new Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations();
            for (GoodsReceiptLocationsDTO location : detail.getLocations()) {
                Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation binAllocation = new Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation();
                binAllocation.setAllowNegativeQuantity("N");
                binAllocation.setBaseLineNumber(detail.getLineNum());
                binAllocation.setBinAbsEntry(Long.valueOf(location.getBinAbs()));
                binAllocation.setQuantity(Double.valueOf(location.getQuantity()));

                binAllocations.getDocumentLinesBinAllocation().add(binAllocation);
            }

            docLine.setDocumentLinesBinAllocations(binAllocations);
            docLines.getDocumentLine().add(docLine);
        }

        document.setDocumentLines(docLines);

        Add add = new Add();
        add.setDocument(document);
        try {
            AddResponse response = port.add(add, header);
            return response.getDocumentParams().getDocEntry();
        } catch (Exception e) {
            throw new GoodsReceiptServiceException("No fue posible crear la entrada de mercancia. " + e.getMessage());
        }
    }
}
