package co.matisses.b1ws.dto;

/**
 *
 * @author dbotero
 */
public class JournalEntryLineDTO {

    private Long lineId;
    private String shortName;
    private Double credit;
    private Double debit;
    private String lineMemo;
    private String ocrCode2;
    private String project;
    private String ref1;
    private String ref2;
    private String infoCo01;
    private String contraAccount;

    public JournalEntryLineDTO() {
    }

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Double getDebit() {
        return debit;
    }

    public void setDebit(Double debit) {
        this.debit = debit;
    }

    public String getLineMemo() {
        return lineMemo;
    }

    public void setLineMemo(String lineMemo) {
        this.lineMemo = lineMemo;
    }

    public String getOcrCode2() {
        return ocrCode2;
    }

    public void setOcrCode2(String ocrCode2) {
        this.ocrCode2 = ocrCode2;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
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

    public String getInfoCo01() {
        return infoCo01;
    }

    public void setInfoCo01(String infoCo01) {
        this.infoCo01 = infoCo01;
    }

    public String getContraAccount() {
        return contraAccount;
    }

    public void setContraAccount(String contraAccount) {
        this.contraAccount = contraAccount;
    }

    @Override
    public String toString() {
        return "JournalEntryLineDTO{" + "lineId=" + lineId + ", shortName=" + shortName + ", credit=" + credit + ", debit=" + debit + ", lineMemo=" + lineMemo + ", ocrCode2=" + ocrCode2 + ", project=" + project + ", ref1=" + ref1 + ", ref2=" + ref2 + ", infoCo01=" + infoCo01 + ", contraAccount=" + contraAccount + '}';
    }

}
