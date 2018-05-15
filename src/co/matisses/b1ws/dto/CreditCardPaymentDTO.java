package co.matisses.b1ws.dto;

/**
 *
 * @author dbotero
 */
public class CreditCardPaymentDTO {

    private String creditCardCode;
    private String creditCardNumber;
    private String validUntil;
    private String voucherNumber;
    private String numberOfPayments;
    private String paidSum;

    public CreditCardPaymentDTO() {
    }

    public String getCreditCardCode() {
        return creditCardCode;
    }

    public void setCreditCardCode(String creditCardCode) {
        this.creditCardCode = creditCardCode;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }

    public String getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }

    public String getNumberOfPayments() {
        return numberOfPayments;
    }

    public void setNumberOfPayments(String numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    public String getPaidSum() {
        return paidSum;
    }

    public void setPaidSum(String paidSum) {
        this.paidSum = paidSum;
    }

    @Override
    public String toString() {
        return "CreditCardPaymentDTO{" + "creditCardCode=" + creditCardCode + ", creditCardNumber=" + creditCardNumber + ", validUntil=" + validUntil + ", voucherNumber=" + voucherNumber + ", numberOfPayments=" + numberOfPayments + ", paidSum=" + paidSum + '}';
    }
}
