package co.matisses.b1ws.client.drafts;

import co.matisses.b1ws.client.ObjectUtils;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dbotero
 */
public class GenericDraftDTO {

    private String documentType;
    private Long series;
    private Long objectCode;
    private Long groupNumber;
    private String comments;
    private String journalMemo;
    private String reference2;
    private List<GenericDraftDetailDTO> detail;

    public GenericDraftDTO() {
        detail = new ArrayList<>();
    }

    public Long getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Long groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Long getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(Long objectCode) {
        this.objectCode = objectCode;
    }

    public String getReference2() {
        return reference2;
    }

    public void setReference2(String reference2) {
        this.reference2 = reference2;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<GenericDraftDetailDTO> getDetail() {
        return detail;
    }

    public void addDetail(GenericDraftDetailDTO detail) {
        this.detail.add(detail);
    }

    public String getJournalMemo() {
        return journalMemo;
    }

    public void setJournalMemo(String journalMemo) {
        this.journalMemo = journalMemo;
    }

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return ObjectUtils.toString(this);
    }

    public class GenericDraftDetailDTO {

        private Long lineNum;
        private String itemCode;
        private Double quantity;
        private String whsCode;
        private List<GenericDraftLocationsDTO> locations;

        public GenericDraftDetailDTO() {
            locations = new ArrayList<>();
        }

        public String getItemCode() {
            return itemCode;
        }

        public void setItemCode(String itemCode) {
            this.itemCode = itemCode;
        }

        public Long getLineNum() {
            return lineNum;
        }

        public void setLineNum(Long lineNum) {
            this.lineNum = lineNum;
        }

        public Double getQuantity() {
            return quantity;
        }

        public void setQuantity(Double quantity) {
            this.quantity = quantity;
        }

        public String getWhsCode() {
            return whsCode;
        }

        public void setWhsCode(String whsCode) {
            this.whsCode = whsCode;
        }

        public List<GenericDraftLocationsDTO> getLocations() {
            return locations;
        }

        public void addLocations(GenericDraftLocationsDTO locations) {
            this.locations.add(locations);
        }

        @Override
        public String toString() {
            return ObjectUtils.toString(this);
        }

        public class GenericDraftLocationsDTO {

            private Long binAbsEntry;
            private Double quantity;
            private String allowNegativeQuantity;
            private Long baseLineNum;

            public GenericDraftLocationsDTO() {
            }

            public String getAllowNegativeQuantity() {
                return allowNegativeQuantity;
            }

            public void setAllowNegativeQuantity(String allowNegativeQuantity) {
                this.allowNegativeQuantity = allowNegativeQuantity;
            }

            public Long getBaseLineNum() {
                return baseLineNum;
            }

            public void setBaseLineNum(Long baseLineNum) {
                this.baseLineNum = baseLineNum;
            }

            public Long getBinAbsEntry() {
                return binAbsEntry;
            }

            public void setBinAbsEntry(Long binAbsEntry) {
                this.binAbsEntry = binAbsEntry;
            }

            public Double getQuantity() {
                return quantity;
            }

            public void setQuantity(Double quantity) {
                this.quantity = quantity;
            }

            @Override
            public String toString() {
                return ObjectUtils.toString(this);
            }
        }

    }

}
