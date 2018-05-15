package co.matisses.b1ws.client.goodsissue;

import java.util.Objects;

/**
 *
 * @author dbotero
 */
public class GoodsIssueLocationsDTO {

    private String binAbs;
    private String quantity;

    public GoodsIssueLocationsDTO() {
    }

    public String getBinAbs() {
        return binAbs;
    }

    public void setBinAbs(String binAbs) {
        this.binAbs = binAbs;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.binAbs);
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
        final GoodsIssueLocationsDTO other = (GoodsIssueLocationsDTO) obj;
        if (!Objects.equals(this.binAbs, other.binAbs)) {
            return false;
        }
        return true;
    }

}
