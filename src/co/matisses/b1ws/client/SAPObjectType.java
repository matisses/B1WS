package co.matisses.b1ws.client;

/**
 *
 * @author dbotero
 */
public enum SAPObjectType {
    INVOICE("13"), GOODS_ISSUE("60");
    private String code;

    private SAPObjectType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public SAPObjectType getObjectType(String code) {
        for (SAPObjectType type : values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return null;
    }

}
