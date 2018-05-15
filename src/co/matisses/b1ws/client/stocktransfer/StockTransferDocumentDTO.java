package co.matisses.b1ws.client.stocktransfer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ygil
 */
public class StockTransferDocumentDTO {

    private final String journalMemo = "Traslado - ";
    private Long series;
    private Long salesPersonCode;
    private String cardCode;
    private String comments;
    private String fromWarehouse;
    private String toWarehouse;
    private List<StockTransferDocumentLinesDTO> stockTransferDocumentLines;

    public StockTransferDocumentDTO() {
        stockTransferDocumentLines = new ArrayList<>();
    }

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
    }

    public Long getSalesPersonCode() {
        return salesPersonCode;
    }

    public void setSalesPersonCode(Long salesPersonCode) {
        this.salesPersonCode = salesPersonCode;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getJournalMemo() {
        return journalMemo;
    }

    public String getFromWarehouse() {
        return fromWarehouse;
    }

    public void setFromWarehouse(String fromWarehouse) {
        this.fromWarehouse = fromWarehouse;
    }

    public String getToWarehouse() {
        return toWarehouse;
    }

    public void setToWarehouse(String toWarehouse) {
        this.toWarehouse = toWarehouse;
    }

    public List<StockTransferDocumentLinesDTO> getStockTransferDocumentLines() {
        return stockTransferDocumentLines;
    }

    public void setStockTransferDocumentLines(List<StockTransferDocumentLinesDTO> stockTransferDocumentLines) {
        this.stockTransferDocumentLines = stockTransferDocumentLines;
    }

    public void addLine(StockTransferDocumentLinesDTO line) {
        stockTransferDocumentLines.add(line);
    }

    @Override
    public String toString() {
        return "StockTransferDocumentDTO{" + "journalMemo=" + journalMemo + ", series=" + series + ", salesPersonCode=" + salesPersonCode + ", cardCode=" + cardCode + ", comments=" + comments + ", fromWarehouse=" + fromWarehouse + ", toWarehouse=" + toWarehouse + ", stockTransferDocumentLines=" + stockTransferDocumentLines + '}';
    }

}
