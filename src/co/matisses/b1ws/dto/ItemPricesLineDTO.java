package co.matisses.b1ws.dto;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author ygil
 */
public class ItemPricesLineDTO {

    private Integer priceList;
    private BigDecimal price;
    private String currency;

    public ItemPricesLineDTO() {
    }

    public Integer getPriceList() {
        return priceList;
    }

    public void setPriceList(Integer priceList) {
        this.priceList = priceList;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.priceList);
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
        final ItemPricesLineDTO other = (ItemPricesLineDTO) obj;
        if (!Objects.equals(this.priceList, other.priceList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemPricesLineDTO{" + "priceList=" + priceList + ", price=" + price + ", currency=" + currency + '}';
    }
}
