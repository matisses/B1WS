package co.matisses.b1ws.client.goodsreceipt;

/**
 *
 * @author dbotero
 */
public class GoodsReceiptLocationsDTO {

    private Integer binAbs;
    private Integer quantity;

    public GoodsReceiptLocationsDTO() {
    }

    public Integer getBinAbs() {
        return binAbs;
    }

    public void setBinAbs(Integer binAbs) {
        this.binAbs = binAbs;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
