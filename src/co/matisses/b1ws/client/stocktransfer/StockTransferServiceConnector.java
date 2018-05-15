package co.matisses.b1ws.client.stocktransfer;

import co.matisses.b1ws.client.B1WSServiceInfo;
import co.matisses.b1ws.client.ObjectUtils;
import co.matisses.b1ws.stocktransfer.Add;
import co.matisses.b1ws.stocktransfer.AddResponse;
import co.matisses.b1ws.stocktransfer.MsgHeader;
import co.matisses.b1ws.stocktransfer.StockTransfer;
import co.matisses.b1ws.stocktransfer.StockTransferService;
import co.matisses.b1ws.stocktransfer.StockTransferServiceSoap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ygil
 */
public class StockTransferServiceConnector extends B1WSServiceInfo {

    private static final Logger log = Logger.getLogger(StockTransferServiceConnector.class.getSimpleName());

    private StockTransferService stockTransferService = null;
    private String sessionId = null;

    public StockTransferServiceConnector(StockTransferService stockTransferService, String sessionId) {
        this.stockTransferService = stockTransferService;
        this.sessionId = sessionId;
    }

    public Integer createStockTransferDocument(StockTransferDocumentDTO document) throws StockTransferServiceException {
        log.log(Level.INFO, document.toString());
        StockTransferServiceSoap port = stockTransferService.getStockTransferServiceSoap12();
        if (sessionId == null) {
            throw new StockTransferServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }

        //Configuracion del encabezado de la solicitud
        MsgHeader requestHeader = new MsgHeader();
        requestHeader.setSessionID(sessionId);
        requestHeader.setServiceName(STOCK_TRANSFER_SERVICE_WSDL_NAME);

        StockTransfer stockTransfer = new StockTransfer();

        //Se llenan los datos del encabezado
        stockTransfer.setSeries(document.getSeries());
        stockTransfer.setCardCode(document.getCardCode());
        stockTransfer.setComments(document.getComments());
        stockTransfer.setJournalMemo(document.getJournalMemo() + document.getCardCode());
        stockTransfer.setSalesPersonCode(document.getSalesPersonCode());
        stockTransfer.setFromWarehouse(document.getFromWarehouse());
        stockTransfer.setToWarehouse(document.getToWarehouse());
        stockTransfer.setUOrigen("T");

        //Se llenan los datos del detalle
        StockTransfer.StockTransferLines documentLines = new StockTransfer.StockTransferLines();

        long lineNum = 0;
        for (StockTransferDocumentLinesDTO linea : document.getStockTransferDocumentLines()) {
            StockTransfer.StockTransferLines.StockTransferLine line = new StockTransfer.StockTransferLines.StockTransferLine();

            line.setItemCode(linea.getItemCode());
            line.setQuantity(linea.getQuantity());
            line.setWarehouseCode(linea.getWarehouseCode());
            line.setFromWarehouseCode(linea.getFromWarehouseCode());
            line.setLineNum(lineNum);
            if (linea.getuNWRBase() != null && !linea.getuNWRBase().isEmpty()) {
                line.setUNWRBase(linea.getuNWRBase());
            }
            if (linea.getuComments() != null && !linea.getuComments().isEmpty()) {
                line.setUComments(linea.getuComments());
            }

            //Se llenan los datos de las ubicaciones correspondientes a la linea
            StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations binAllocations = new StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations();

            for (StockTransferDocumentBinAllocationDTO allocation : linea.getBinAllocations()) {
                StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations.StockTransferLinesBinAllocation binAllocation
                        = new StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations.StockTransferLinesBinAllocation();

                binAllocation.setBinAbsEntry(allocation.getBinAbsEntry());
                binAllocation.setQuantity(allocation.getQuantity());
                if (allocation.getAllowNegativeQuantity()) {
                    binAllocation.setAllowNegativeQuantity("tYES");
                } else {
                    binAllocation.setAllowNegativeQuantity("tNO");
                }
                if (allocation.getBinActionType().equals("entrada")) {
                    binAllocation.setBinActionType("batToWarehouse");
                } else if (allocation.getBinActionType().equals("salida")) {
                    binAllocation.setBinActionType("batFromWarehouse");
                }
                binAllocation.setBaseLineNumber(lineNum);

                binAllocations.getStockTransferLinesBinAllocation().add(binAllocation);
            }
            line.setStockTransferLinesBinAllocations(binAllocations);

            documentLines.getStockTransferLine().add(line);
            lineNum++;
        }

        stockTransfer.setStockTransferLines(documentLines);

        //Configura el cuerpo de la solicitud
        Add parameters = new Add();
        parameters.setStockTransfer(stockTransfer);

        log.info(ObjectUtils.toString(stockTransfer));

        Long docEntry = null;
        try {
            AddResponse resp = port.add(parameters, requestHeader);
            docEntry = resp.getStockTransferParams().getDocEntry();
        } catch (Exception e) {
            System.out.println("Ocurrio un error al crear el traslado. " + e.getMessage());
            //Logger.getLogger(StockTransferServiceConnector.class.getName()).log(Level.SEVERE, "Ocurrio un error al crear la factura. ", e);
            throw new StockTransferServiceException("No fue posible crear el traslado. " + e.getMessage());
        }

        System.out.println("Se creo el traslado #" + docEntry);
        return docEntry.intValue();
    }
}
