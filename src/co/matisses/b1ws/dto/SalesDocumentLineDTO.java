package co.matisses.b1ws.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author dbotero
 */
public class SalesDocumentLineDTO {

    private Integer quantity;
    private Integer lineNum;
    private Double price;
    private Double discountPercent;
    private Long baseEntry;
    private Long baseLine;
    private String itemCode;
    private String whsCode;
    private String status;
    private List<SalesDocumentLineBinAllocationDTO> binAllocations;

    public SalesDocumentLineDTO() {
        binAllocations = new ArrayList<>();
    }

    public SalesDocumentLineDTO(String itemCode, String whsCode, Double price, Double discountPercent) {
        this.itemCode = itemCode;
        this.whsCode = whsCode;
        this.price = price;
        this.discountPercent = discountPercent;
        binAllocations = new ArrayList<>();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getWhsCode() {
        return whsCode;
    }

    public void setWhsCode(String whsCode) {
        this.whsCode = whsCode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Long getBaseEntry() {
        return baseEntry;
    }

    public void setBaseEntry(Long baseEntry) {
        this.baseEntry = baseEntry;
    }

    public Long getBaseLine() {
        return baseLine;
    }

    public void setBaseLine(Long baseLine) {
        this.baseLine = baseLine;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addBinAllocation(SalesDocumentLineBinAllocationDTO alloc) {
        if (alloc != null && alloc.getBinAbsEntry() != null && alloc.getBinAbsEntry() > 0 && alloc.getQuantity() > 0) {
            int pos = binAllocations.indexOf(alloc);
            if (pos >= 0) {
                SalesDocumentLineBinAllocationDTO tmp = binAllocations.get(pos);
                tmp.setQuantity(alloc.getQuantity() + tmp.getQuantity());
                binAllocations.set(pos, tmp);
            } else {
                binAllocations.add(alloc);
            }
        }
    }

    public List<SalesDocumentLineBinAllocationDTO> getBinAllocations() {
        return binAllocations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.itemCode);
        hash = 59 * hash + Objects.hashCode(this.whsCode);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SalesDocumentLineDTO other = (SalesDocumentLineDTO) obj;
        if (!Objects.equals(this.itemCode, other.itemCode)) {
            return false;
        }
        if (!Objects.equals(this.whsCode, other.whsCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalesDocumentLineDTO{" + "itemCode=" + itemCode + ", whsCode=" + whsCode + ", quantity=" + quantity + ", lineNum=" + lineNum + ", price=" + price + ", binAllocations=" + binAllocations + '}';
    }
}
