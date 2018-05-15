package co.matisses.b1ws.client.stocktransfer;

/**
 *
 * @author ygil
 */
public class StockTransferDocumentBinAllocationDTO {

    private Integer baseLineNumber;
    private Double quantity;
    private Long binAbsEntry;
    private Boolean allowNegativeQuantity;
    private String binActionType;

    public StockTransferDocumentBinAllocationDTO() {
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Boolean getAllowNegativeQuantity() {
        return allowNegativeQuantity;
    }

    public void setAllowNegativeQuantity(Boolean allowNegativeQuantity) {
        this.allowNegativeQuantity = allowNegativeQuantity;
    }

    public Long getBinAbsEntry() {
        return binAbsEntry;
    }

    public void setBinAbsEntry(Long binAbsEntry) {
        this.binAbsEntry = binAbsEntry;
    }

    public String getBinActionType() {
        return binActionType;
    }

    public void setBinActionType(String binActionType) {
        this.binActionType = binActionType;
    }

    public Integer getBaseLineNumber() {
        return baseLineNumber;
    }

    public void setBaseLineNumber(Integer baseLineNumber) {
        this.baseLineNumber = baseLineNumber;
    }

    @Override
    public String toString() {
        return "StockTransferDocumentBinAllocationDTO{" + "baseLineNumber=" + baseLineNumber + ", quantity=" + quantity + ", binAbsEntry=" + binAbsEntry + ", allowNegativeQuantity=" + allowNegativeQuantity + ", binActionType=" + binActionType + '}';
    }

}
