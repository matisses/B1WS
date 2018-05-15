package co.matisses.b1ws.client.goodsissue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dbotero
 */
public class GoodsIssueDTO {

    private String comments;
    private String groupNum;
    private String series;
    private String journalMemo;
    private String invoiceNumber;
    private List<GoodsIssueDetailDTO> detail;

    public GoodsIssueDTO() {
        detail = new ArrayList<>();
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<GoodsIssueDetailDTO> getDetail() {
        return detail;
    }

    public void addDetail(GoodsIssueDetailDTO dto) {
        detail.add(dto);
    }

    public String getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
    }

    public String getJournalMemo() {
        return journalMemo;
    }

    public void setJournalMemo(String journalMemo) {
        this.journalMemo = journalMemo;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

}
