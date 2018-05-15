package co.matisses.b1ws.dto;

/**
 *
 * @author dbotero
 */
public class ItemUpdateFieldDTO {

    private String fieldName;
    private String fieldValue;

    public ItemUpdateFieldDTO() {
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    @Override
    public String toString() {
        return "ItemUpdateFieldDTO{" + "fieldName=" + fieldName + ", fieldValue=" + fieldValue + '}';
    }

}
