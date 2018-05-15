package co.matisses.b1ws.client.goodsreceipt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dbotero
 */
public class GoodsReceiptDetailDTO {

    private Long lineNum;
    private String itemName;
    private String itemCode;
    private Integer quantity;
    private Double price;
    private String whsCode;
    private String accountCode;
    private List<GoodsReceiptLocationsDTO> locations;

    public GoodsReceiptDetailDTO() {
        locations = new ArrayList<>();
    }

    public Long getLineNum() {
        return lineNum;
    }

    public void setLineNum(Long lineNum) {
        this.lineNum = lineNum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getWhsCode() {
        return whsCode;
    }

    public void setWhsCode(String whsCode) {
        this.whsCode = whsCode;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public List<GoodsReceiptLocationsDTO> getLocations() {
        return locations;
    }

    public void addLocation(GoodsReceiptLocationsDTO dto) {
        locations.add(dto);
    }
}
