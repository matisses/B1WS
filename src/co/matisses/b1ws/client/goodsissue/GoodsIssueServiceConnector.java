package co.matisses.b1ws.client.goodsissue;

import co.matisses.b1ws.client.B1WSServiceInfo;
import co.matisses.b1ws.goodsissue.Add;
import co.matisses.b1ws.goodsissue.AddResponse;
import co.matisses.b1ws.goodsissue.Document;
import co.matisses.b1ws.goodsissue.InventoryGenExitService;
import co.matisses.b1ws.goodsissue.InventoryGenExitServiceSoap;
import co.matisses.b1ws.goodsissue.MsgHeader;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeFactory;

/**
 *
 * @author dbotero
 */
public class GoodsIssueServiceConnector extends B1WSServiceInfo {

    private static final Logger log = Logger.getLogger(GoodsIssueServiceConnector.class.getSimpleName());
    private InventoryGenExitService service;
    private String sessionId;

    public GoodsIssueServiceConnector(InventoryGenExitService service, String sessionId) {
        super();
        this.service = service;
        this.sessionId = sessionId;
    }

    public Long createDocument(GoodsIssueDTO goodsIssueDto) throws GoodsIssueServiceException {
        InventoryGenExitServiceSoap port = service.getInventoryGenExitServiceSoap12();
        if (sessionId == null) {
            throw new GoodsIssueServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }

        MsgHeader header = new MsgHeader();
        header.setServiceName(GOODS_ISSUE_SERVICE_WSDL_NAME);
        header.setSessionID(sessionId);

        Document document = new Document();
        document.setComments(goodsIssueDto.getComments());
        document.setGroupNumber(Long.valueOf(goodsIssueDto.getGroupNum()));
        document.setSeries(Long.valueOf(goodsIssueDto.getSeries()));
        document.setJournalMemo(goodsIssueDto.getJournalMemo());
        document.setReference2(goodsIssueDto.getInvoiceNumber());
        try {
            document.setTaxDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
        } catch (Exception e) {
            throw new GoodsIssueServiceException("Ocurrio un error al configurar la fecha de causacion de la salida. " + e.getMessage());
        }

        Document.DocumentLines docLines = new Document.DocumentLines();
        for (GoodsIssueDetailDTO detail : goodsIssueDto.getDetail()) {
            Document.DocumentLines.DocumentLine docLine = new Document.DocumentLines.DocumentLine();
            docLine.setAccountCode(detail.getAccountCode());
            docLine.setLineNum(Long.valueOf(detail.getLineNum()));
            docLine.setItemCode(detail.getItemCode());
            docLine.setQuantity(Double.valueOf(detail.getQuantity()));
            docLine.setWarehouseCode(detail.getWhsCode());

            Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations binAllocations = new Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations();
            for (GoodsIssueLocationsDTO location : detail.getLocations()) {
                Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation binAllocation = new Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation();
                binAllocation.setAllowNegativeQuantity("N");
                binAllocation.setBaseLineNumber(Long.valueOf(detail.getLineNum()));
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
        log.log(Level.INFO, "{0}", document.toString());

        try {
            AddResponse response = port.add(add, header);
            return response.getDocumentParams().getDocEntry();
        } catch (Exception e) {
            throw new GoodsIssueServiceException("No fue posible crear la salida de mercancia. " + e.getMessage());
        }
    }
}
