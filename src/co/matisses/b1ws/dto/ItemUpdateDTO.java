package co.matisses.b1ws.dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dbotero
 */
public class ItemUpdateDTO {

    private String itemCode;
    private List<ItemUpdateFieldDTO> fields;

    public ItemUpdateDTO() {
        fields = new ArrayList<>();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public List<ItemUpdateFieldDTO> getFields() {
        return fields;
    }

    public void setFields(List<ItemUpdateFieldDTO> fields) {
        this.fields = fields;
    }

    public void addField(ItemUpdateFieldDTO field) {
        this.fields.add(field);
    }

    @Override
    public String toString() {
        return "ItemUpdateDTO{" + "itemCode=" + itemCode + ", fields=" + fields + '}';
    }
}
