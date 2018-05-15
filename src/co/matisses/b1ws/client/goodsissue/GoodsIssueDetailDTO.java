package co.matisses.b1ws.client.goodsissue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dbotero
 */
public class GoodsIssueDetailDTO {

    private String lineNum;
    private String itemName;
    private String itemCode;
    private String quantity;
    private String whsCode;
    private String accountCode;
    private String providerCode;
    private List<GoodsIssueLocationsDTO> locations;

    public GoodsIssueDetailDTO() {
        locations = new ArrayList<>();
    }

    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
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

    public List<GoodsIssueLocationsDTO> getLocations() {
        return locations;
    }

    public void addLocation(GoodsIssueLocationsDTO dto) {
        int pos = locations.indexOf(dto);
        if (pos >= 0) {
            Integer qty1 = Integer.valueOf(locations.get(pos).getQuantity());
            Integer qty2 = Integer.valueOf(dto.getQuantity());
            locations.get(pos).setQuantity(Integer.toString(qty1 + qty2));
        } else {
            locations.add(dto);
        }
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }
}
