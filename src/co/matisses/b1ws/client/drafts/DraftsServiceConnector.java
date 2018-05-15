package co.matisses.b1ws.client.drafts;

import co.matisses.b1ws.client.B1WSServiceInfo;
import co.matisses.b1ws.client.SAPObjectType;
import co.matisses.b1ws.drafts.Add;
import co.matisses.b1ws.drafts.AddResponse;
import co.matisses.b1ws.drafts.Document;
import co.matisses.b1ws.drafts.DraftsService;
import co.matisses.b1ws.drafts.DraftsServiceSoap;
import co.matisses.b1ws.drafts.MsgHeader;
import java.util.logging.Logger;

/**
 *
 * @author dbotero
 */
public class DraftsServiceConnector extends B1WSServiceInfo {

    private static final Logger log = Logger.getLogger(DraftsServiceConnector.class.getSimpleName());
    private DraftsService service;
    private String sessionId;

    public DraftsServiceConnector(DraftsService service, String sessionId) {
        super();
        this.service = service;
        this.sessionId = sessionId;
    }

    public Long createGoodsIssueDraft(GoodsIssueDraftDTO dto) throws DraftServiceException {
        if (sessionId == null) {
            throw new DraftServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }
        DraftsServiceSoap port = service.getDraftsServiceSoap12();
        MsgHeader header = new MsgHeader();
        header.setServiceName(DRAFTS_SERVICE_WSDL_NAME);
        header.setSessionID(sessionId);

        Document document = new Document();
        document.setReference2(dto.getReference2());
        document.setComments(dto.getComments());
        document.setJournalMemo(dto.getJournalMemo());
        document.setSeries(dto.getSeries());
        document.setDocObjectCode(SAPObjectType.GOODS_ISSUE.getCode());
        document.setGroupNumber(dto.getGroupNumber());

        Document.DocumentLines lines = new Document.DocumentLines();
        for (GoodsIssueDraftDTO.GoodsIssueDraftDetailDTO detailDto : dto.getDetail()) {
            Document.DocumentLines.DocumentLine line = new Document.DocumentLines.DocumentLine();
            line.setAccountCode(line.getAccountCode());
            line.setLineNum(line.getLineNum());
            line.setQuantity(line.getQuantity());
            line.setWarehouseCode(line.getWarehouseCode());
            Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations bins = new Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations();
            for (GoodsIssueDraftDTO.GoodsIssueDraftDetailDTO.GoodsIssueDraftLocationsDTO location : detailDto.getLocations()) {
                Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation bin = new Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation();
                bin.setAllowNegativeQuantity(location.getAllowNegativeQuantity());
                bin.setBaseLineNumber(location.getBaseLineNum());
                bin.setBinAbsEntry(location.getBinAbsEntry());
                bin.setQuantity(location.getQuantity());
                bins.getDocumentLinesBinAllocation().add(bin);
            }

            line.setDocumentLinesBinAllocations(bins);
            lines.getDocumentLine().add(line);
        }
        document.setDocumentLines(lines);
        Add add = new Add();
        add.setDocument(document);
        try {
            AddResponse resp = port.add(add, header);
            return resp.getDocumentParams().getDocEntry();
        } catch (Exception e) {
            throw new DraftServiceException(e.getMessage());
        }
    }
}
