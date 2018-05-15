package co.matisses.b1ws.client.goodsreceipt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dbotero
 */
public class GoodsReceiptDTO {

    private Long series;
    private Long groupNumber;
    private String invoiceNumber;
    private String comments;
    private String journalMemo;
    private String origen;
    private List<GoodsReceiptDetailDTO> detail;

    public GoodsReceiptDTO() {
        detail = new ArrayList<>();
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Long getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Long groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getJournalMemo() {
        return journalMemo;
    }

    public void setJournalMemo(String journalMemo) {
        this.journalMemo = journalMemo;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
    }

    public void addDetail(GoodsReceiptDetailDTO dto) {
        detail.add(dto);
    }

    public List<GoodsReceiptDetailDTO> getDetail() {
        return detail;
    }

}
