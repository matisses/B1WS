package co.matisses.b1ws.dto;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dbotero
 */
public class SalesDocumentDTO {

    private String binAbsEntry;
    private String cardCode;
    private String comments;
    private String salesCostingCode;
    private String logisticsCostingCode;
    private String paymentGroupCode;
    private String routeCostingCode;
    private String projectCode;
    private String seriesCode;
    private String wuid; 
    private String shippingStatus;
    private String source;
    private String refDocnum;
    private String creditNoteType;
    private String prestashopOrderID;
    private String uDiseno;
    private Date docDate;
    private Long posShiftId;
    private Long docEntry;
    private List<SalesDocumentLineDTO> documentLines;
    private List<SalesEmployeeDTO> salesEmployees;

    public SalesDocumentDTO() {
        documentLines = new ArrayList<>();
        salesEmployees = new ArrayList<>();
    }

    public String getCreditNoteType() {
        return creditNoteType;
    }

    public void setCreditNoteType(String creditNoteType) {
        this.creditNoteType = creditNoteType;
    }

    public Long getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(Long docEntry) {
        this.docEntry = docEntry;
    }

    public String getRefDocnum() {
        return refDocnum;
    }

    public void setRefDocnum(String refDocnum) {
        this.refDocnum = refDocnum;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getBinAbsEntry() {
        return binAbsEntry;
    }

    public void setBinAbsEntry(String binAbsEntry) {
        this.binAbsEntry = binAbsEntry;
    }

    public String getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(String shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public Long getPosShiftId() {
        return posShiftId;
    }

    public void setPosShiftId(Long posShiftId) {
        this.posShiftId = posShiftId;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getPrestashopOrderID() {
        return prestashopOrderID;
    }

    public void setPrestashopOrderID(String prestashopOrderID) {
        this.prestashopOrderID = prestashopOrderID;
    }

    public String getuDiseno() {
        return uDiseno;
    }

    public void setuDiseno(String uDiseno) {
        this.uDiseno = uDiseno;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public List<SalesDocumentLineDTO> getDocumentLines() {
        return documentLines;
    }

    public void setDocumentLines(List<SalesDocumentLineDTO> documentLines) {
        this.documentLines = documentLines;
    }

    public void addLine(SalesDocumentLineDTO line) {
        documentLines.add(line);
    }

    public List<SalesEmployeeDTO> getSalesEmployees() {
        return salesEmployees;
    }

    public void setSalesEmployees(List<SalesEmployeeDTO> salesEmployees) {
        this.salesEmployees = salesEmployees;
    }

    public void addSalesEmployee(SalesEmployeeDTO emp) {
        if (salesEmployees.contains(emp)) {
            return;
        }
        while (salesEmployees.size() >= 5) {
            salesEmployees.remove(0);
        }
        salesEmployees.add(emp);
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getLogisticsCostingCode() {
        return logisticsCostingCode;
    }

    public void setLogisticsCostingCode(String logisticsCostingCode) {
        this.logisticsCostingCode = logisticsCostingCode;
    }

    public String getRouteCostingCode() {
        return routeCostingCode;
    }

    public void setRouteCostingCode(String routeCostingCode) {
        this.routeCostingCode = routeCostingCode;
    }

    public String getSalesCostingCode() {
        return salesCostingCode;
    }

    public void setSalesCostingCode(String salesCostingCode) {
        this.salesCostingCode = salesCostingCode;
    }

    public String getSeriesCode() {
        return seriesCode;
    }

    public void setSeriesCode(String seriesCode) {
        this.seriesCode = seriesCode;
    }

    public String getWuid() {
        return wuid;
    }

    public void setWuid(String wuid) {
        this.wuid = wuid;
    }

    public String getPaymentGroupCode() {
        return paymentGroupCode;
    }

    public void setPaymentGroupCode(String paymentGroupCode) {
        this.paymentGroupCode = paymentGroupCode;
    }

    public static float calculateCommission(int salesPerson, int totalSalesPeople) {
        float total = 1.0f;
        Float part = total / totalSalesPeople;
        NumberFormat nf = new DecimalFormat("#.##");
        float realPart = Float.valueOf(nf.format(part));
        for (int i = 0; i < totalSalesPeople; i++) {
            if (i == salesPerson - 1) {
                if (total - realPart >= realPart) {
                    return realPart;
                } else {
                    return Float.valueOf(nf.format(total));
                }
            }
            total -= realPart;
        }
        return 0.0f;
    }

    @Override
    public String toString() {
        return "SalesDocumentDTO{" + "binAbsEntry=" + binAbsEntry + ", cardCode=" + cardCode + ", comments=" + comments + ", salesCostingCode=" + salesCostingCode + ", logisticsCostingCode=" + logisticsCostingCode + ", paymentGroupCode=" + paymentGroupCode + ", routeCostingCode=" + routeCostingCode + ", projectCode=" + projectCode + ", seriesCode=" + seriesCode + ", wuid=" + wuid + ", shippingStatus=" + shippingStatus + ", source=" + source + ", refDocnum=" + refDocnum + ", creditNoteType=" + creditNoteType + ", prestashopOrderID=" + prestashopOrderID + ", posShiftId=" + posShiftId + ", docEntry=" + docEntry + ", documentLines=" + documentLines + ", salesEmployees=" + salesEmployees + '}';
    }
}
