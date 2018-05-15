package co.matisses.b1ws.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dbotero
 */
public class JournalEntryDTO {

    private Date dueDate;
    private Date taxDate;
    private Date refDate;
    private String memo;
    private String ref1;
    private String ref2;
    private String ref3;
    private String transactionCode;
    private List<JournalEntryLineDTO> lines;

    public JournalEntryDTO() {
        lines = new ArrayList<>();
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getRefDate() {
        return refDate;
    }

    public void setRefDate(Date refDate) {
        this.refDate = refDate;
    }

    public Date getTaxDate() {
        return taxDate;
    }

    public void setTaxDate(Date taxDate) {
        this.taxDate = taxDate;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getRef1() {
        return ref1;
    }

    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    public String getRef2() {
        return ref2;
    }

    public void setRef2(String ref2) {
        this.ref2 = ref2;
    }

    public String getRef3() {
        return ref3;
    }

    public void setRef3(String ref3) {
        this.ref3 = ref3;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public List<JournalEntryLineDTO> getLines() {
        return lines;
    }

    public void addLine(JournalEntryLineDTO line) {
        this.lines.add(line);
    }

    @Override
    public String toString() {
        return "JournalEntryDTO{" + "dueDate=" + dueDate + ", taxDate=" + taxDate + ", refDate=" + refDate + ", memo=" + memo + ", ref1=" + ref1 + ", ref2=" + ref2 + ", ref3=" + ref3 + ", transactionCode=" + transactionCode + ", lines=" + lines + '}';
    }
}
