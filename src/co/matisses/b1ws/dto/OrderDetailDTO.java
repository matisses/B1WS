package co.matisses.b1ws.dto;

/**
 *
 * @author dbotero
 */
public class OrderDetailDTO {

    private Long lineNum;
    private String itemCode;
    private Double quantity;
    private String warehouseCode;
    private String estado;

    public OrderDetailDTO() {
    }

    public Long getLineNum() {
        return lineNum;
    }

    public void setLineNum(Long lineNum) {
        this.lineNum = lineNum;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "OrderDetailDTO{" + "lineNum=" + lineNum + ", itemCode=" + itemCode + ", quantity=" + quantity + ", warehouseCode=" + warehouseCode + ", estado=" + estado + '}';
    }
}
