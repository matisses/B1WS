package co.matisses.b1ws.client.stocktransfer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ygil
 */
public class StockTransferDocumentLinesDTO {

    private Integer lineNum;
    private Double quantity;
    private String itemCode;
    private String warehouseCode;
    private String fromWarehouseCode;
    private String uNWRBase;
    private String uComments;
    private List<StockTransferDocumentBinAllocationDTO> binAllocations;

    public StockTransferDocumentLinesDTO() {
        binAllocations = new ArrayList<>();
    }

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getFromWarehouseCode() {
        return fromWarehouseCode;
    }

    public void setFromWarehouseCode(String fromWarehouseCode) {
        this.fromWarehouseCode = fromWarehouseCode;
    }

    public String getuNWRBase() {
        return uNWRBase;
    }

    public void setuNWRBase(String uNWRBase) {
        this.uNWRBase = uNWRBase;
    }

    public String getuComments() {
        return uComments;
    }

    public void setuComments(String uComments) {
        this.uComments = uComments;
    }

    public List<StockTransferDocumentBinAllocationDTO> getBinAllocations() {
        return binAllocations;
    }

    public void setBinAllocations(List<StockTransferDocumentBinAllocationDTO> binAllocations) {
        this.binAllocations = binAllocations;
    }

    public void addBinAllocation(StockTransferDocumentBinAllocationDTO binAllocation) {
        binAllocations.add(binAllocation);
    }

    @Override
    public String toString() {
        return "StockTransferDocumentLinesDTO{" + "lineNum=" + lineNum + ", quantity=" + quantity + ", itemCode=" + itemCode + ", warehouseCode=" + warehouseCode + ", fromWarehouseCode=" + fromWarehouseCode + ", uNWRBase=" + uNWRBase + ", uComments=" + uComments + ", binAllocations=" + binAllocations + '}';
    }

}
