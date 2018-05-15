package co.matisses.b1ws.client.quotations;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author ygil
 */
public class QuotationsDocumentDTO {

    private Long docEntry;
    private Long salesPersonCode;
    private Long paymentGroupCode;
    private Long contactPersonCode;
    private Long documentsOwner;
    private Long extraMonth;
    private Long extraDays;
    private String cardCode;
    private String cardName;
    private String address;
    private String address2;
    private String shipToCode;
    private String payToCode;
    private XMLGregorianCalendar docDate;
    private XMLGregorianCalendar docDueDate;
    private TaxExtensionDTO taxExtension;
    private AddressExtensionDTO addressExtension;
    private List<QuotationsDocumentLinesDTO> quotationsDocumentLines;

    public QuotationsDocumentDTO() {
        quotationsDocumentLines = new ArrayList<>();
    }

    public QuotationsDocumentDTO(Long salesPersonCode, String cardCode) {
        this.salesPersonCode = salesPersonCode;
        this.cardCode = cardCode;
    }

    public Long getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(Long docEntry) {
        this.docEntry = docEntry;
    }

    public Long getSalesPersonCode() {
        return salesPersonCode;
    }

    public void setSalesPersonCode(Long salesPersonCode) {
        this.salesPersonCode = salesPersonCode;
    }

    public Long getPaymentGroupCode() {
        return paymentGroupCode;
    }

    public void setPaymentGroupCode(Long paymentGroupCode) {
        this.paymentGroupCode = paymentGroupCode;
    }

    public Long getContactPersonCode() {
        return contactPersonCode;
    }

    public void setContactPersonCode(Long contactPersonCode) {
        this.contactPersonCode = contactPersonCode;
    }

    public Long getDocumentsOwner() {
        return documentsOwner;
    }

    public void setDocumentsOwner(Long documentsOwner) {
        this.documentsOwner = documentsOwner;
    }

    public Long getExtraMonth() {
        return extraMonth;
    }

    public void setExtraMonth(Long extraMonth) {
        this.extraMonth = extraMonth;
    }

    public Long getExtraDays() {
        return extraDays;
    }

    public void setExtraDays(Long extraDays) {
        this.extraDays = extraDays;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getShipToCode() {
        return shipToCode;
    }

    public void setShipToCode(String shipToCode) {
        this.shipToCode = shipToCode;
    }

    public String getPayToCode() {
        return payToCode;
    }

    public void setPayToCode(String payToCode) {
        this.payToCode = payToCode;
    }

    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    public void setDocDate(XMLGregorianCalendar docDate) {
        this.docDate = docDate;
    }

    public XMLGregorianCalendar getDocDueDate() {
        return docDueDate;
    }

    public void setDocDueDate(XMLGregorianCalendar docDueDate) {
        this.docDueDate = docDueDate;
    }

    public TaxExtensionDTO getTaxExtension() {
        return taxExtension;
    }

    public void setTaxExtension(TaxExtensionDTO taxExtension) {
        this.taxExtension = taxExtension;
    }

    public AddressExtensionDTO getAddressExtension() {
        return addressExtension;
    }

    public void setAddressExtension(AddressExtensionDTO addressExtension) {
        this.addressExtension = addressExtension;
    }

    public List<QuotationsDocumentLinesDTO> getQuotationsDocumentLines() {
        return quotationsDocumentLines;
    }

    public void setQuotationsDocumentLines(List<QuotationsDocumentLinesDTO> quotationsDocumentLines) {
        this.quotationsDocumentLines = quotationsDocumentLines;
    }
}
