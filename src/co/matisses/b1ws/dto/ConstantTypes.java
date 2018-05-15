package co.matisses.b1ws.dto;

/**
 *
 * @author dbotero
 */
public class ConstantTypes {

    public static enum DocType {
        INVOICE(13), CREDIT_NOTE(14);
        public int value;

        private DocType(int value) {
            this.value = value;
        }
    }

    public static enum BPType {
        CUSTOMER("C"), VENDOR("S"), ACCOUNT("A");
        public String value;

        private BPType(String value) {
            this.value = value;
        }
    }
}
