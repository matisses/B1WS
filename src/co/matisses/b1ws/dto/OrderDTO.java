package co.matisses.b1ws.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dbotero
 */
public class OrderDTO {

    private String cardCode;
    private Long series;
    private String invoiceNumber;
    private Date docDate;
    private Date docDueDate;
    private String comments;
    private Long salesPersonCode;
    private String origen;
    private Long baseEntry;
    private Long baseType;
    private List<OrderDetailDTO> detail;

    public OrderDTO() {
        detail = new ArrayList<>();
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public Date getDocDueDate() {
        return docDueDate;
    }

    public void setDocDueDate(Date docDueDate) {
        this.docDueDate = docDueDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Long getSalesPersonCode() {
        return salesPersonCode;
    }

    public void setSalesPersonCode(Long salesPersonCode) {
        this.salesPersonCode = salesPersonCode;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public List<OrderDetailDTO> getDetail() {
        return detail;
    }

    public void addLine(OrderDetailDTO detail) {
        this.detail.add(detail);
    }

    public Long getBaseEntry() {
        return baseEntry;
    }

    public void setBaseEntry(Long baseEntry) {
        this.baseEntry = baseEntry;
    }

    public Long getBaseType() {
        return baseType;
    }

    public void setBaseType(Long baseType) {
        this.baseType = baseType;
    }

    @Override
    public String toString() {
        return "OrderDTO{" + "cardCode=" + cardCode + ", baseType=" + baseType + ", baseEntry=" + baseEntry + ", series=" + series + ", invoiceNumber=" + invoiceNumber + ", docDate=" + docDate + ", docDueDate=" + docDueDate + ", comments=" + comments + ", salesPersonCode=" + salesPersonCode + ", origen=" + origen + ", detail=" + detail + '}';
    }
}
