package co.matisses.b1ws.client.drafts;

import co.matisses.b1ws.client.ObjectUtils;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dbotero
 */
public final class GoodsIssueDraftDTO {

    private String documentType;
    private Long series;
    private Long groupNumber;
    private String comments;
    private String journalMemo;
    private String reference2;
    private List<GoodsIssueDraftDetailDTO> detail;

    public GoodsIssueDraftDTO() {
        detail = new ArrayList<>();
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
    }

    public Long getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Long groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getJournalMemo() {
        return journalMemo;
    }

    public void setJournalMemo(String journalMemo) {
        this.journalMemo = journalMemo;
    }

    public String getReference2() {
        return reference2;
    }

    public void setReference2(String reference2) {
        this.reference2 = reference2;
    }

    public List<GoodsIssueDraftDetailDTO> getDetail() {
        return detail;
    }

    public void addDetail(GoodsIssueDraftDetailDTO detail) {
        this.detail.add(detail);
    }

    @Override
    public String toString() {
        return ObjectUtils.toString(this);
    }

    public class GoodsIssueDraftDetailDTO {

        private String accountCode;
        private Long lineNum;
        private String itemCode;
        private Double quantity;
        private String whsCode;
        private List<GoodsIssueDraftLocationsDTO> locations;

        public GoodsIssueDraftDetailDTO() {
            locations = new ArrayList<>();
        }

        public String getAccountCode() {
            return accountCode;
        }

        public void setAccountCode(String accountCode) {
            this.accountCode = accountCode;
        }

        public Long getLineNum() {
            return lineNum;
        }

        public void setLineNum(Long lineNum) {
            this.lineNum = lineNum;
        }

        public String getItemCode() {
            return itemCode;
        }

        public void setItemCode(String itemCode) {
            this.itemCode = itemCode;
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

        public List<GoodsIssueDraftLocationsDTO> getLocations() {
            return locations;
        }

        public void addLocation(GoodsIssueDraftLocationsDTO location) {
            this.locations.add(location);
        }

        @Override
        public String toString() {
            return ObjectUtils.toString(this);
        }

        public class GoodsIssueDraftLocationsDTO {

            private Long binAbsEntry;
            private Double quantity;
            private String allowNegativeQuantity;
            private Long baseLineNum;

            public GoodsIssueDraftLocationsDTO() {
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

            @Override
            public String toString() {
                return ObjectUtils.toString(this);
            }
        }
    }
}
