package co.matisses.b1ws.dto;

import java.util.Objects;

/**
 *
 * @author dbotero
 */
public class SalesDocumentLineBinAllocationDTO {
    private Integer binAbsEntry;
    private Integer quantity;
    private String whsCode;

    public SalesDocumentLineBinAllocationDTO() {
    }

    public SalesDocumentLineBinAllocationDTO(Integer binAbsEntry, Integer quantity, String whsCode) {
        this.binAbsEntry = binAbsEntry;
        this.quantity = quantity;
        this.whsCode = whsCode;
    }

    public Integer getBinAbsEntry() {
        return binAbsEntry;
    }

    public void setBinAbsEntry(Integer binAbsEntry) {
        this.binAbsEntry = binAbsEntry;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.binAbsEntry);
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
        final SalesDocumentLineBinAllocationDTO other = (SalesDocumentLineBinAllocationDTO) obj;
        if (!Objects.equals(this.binAbsEntry, other.binAbsEntry)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalesDocumentLineBinAllocationDTO{" + "binAbsEntry=" + binAbsEntry + ", quantity=" + quantity + ", whsCode=" + whsCode + '}';
    }
}
