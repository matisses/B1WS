package co.matisses.b1ws.dto;

import co.matisses.b1ws.client.ObjectUtils;

/**
 *
 * @author dbotero
 */
public class ServiceCallDTO {

    private Long assigneeCode;
    private Long series;
    private Long callType;
    private String cardCode;
    private String description;
    private String itemCode;
    private String subject;
    private String invoiceNumber;
    private Origin origin;
    private Priority priority;
    private ProblemType problemType;

    public ServiceCallDTO() {
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Long getAssigneeCode() {
        return assigneeCode;
    }

    public void setAssigneeCode(Long assigneeCode) {
        this.assigneeCode = assigneeCode;
    }

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
    }

    public Long getCallType() {
        return callType;
    }

    public void setCallType(Long callType) {
        this.callType = callType;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public ProblemType getProblemType() {
        return problemType;
    }

    public void setProblemType(ProblemType problemType) {
        this.problemType = problemType;
    }

    @Override
    public String toString() {
        return ObjectUtils.toString(this);
    }

    public enum Priority {
        HIGH("H"), MEDIUM("M"), LOW("L");
        private String priority;

        private Priority(String priority) {
            this.priority = priority;
        }

        public String getPriority() {
            return priority;
        }

        public Priority getPriority(String priority) {
            for (Priority p : values()) {
                if (p.getPriority().equals(priority)) {
                    return p;
                }
            }
            return null;
        }
    }

    public enum Origin {
        WEB(-1L), EMAIL(-3L), PHONE_CALL(-2L), N_A(1L), SMS(2L), CHAT(3L), LETTER(4L), INTERNAL_MESSAGE(5L);
        private Long origin;

        private Origin(Long origin) {
            this.origin = origin;
        }

        public Long getOrigin() {
            return origin;
        }

        public Origin getOrigin(Long origin) {
            for (Origin o : values()) {
                if (o.getOrigin().equals(origin)) {
                    return o;
                }
            }
            return null;
        }
    }

    public enum ProblemType {
        HIGH(1L), MEDIUM(2L), LOW(3L);

        private Long type;

        private ProblemType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return type;
        }

        public ProblemType getOrigin(Long type) {
            for (ProblemType t : values()) {
                if (t.getType().equals(type)) {
                    return t;
                }
            }
            return null;
        }
    }
}
