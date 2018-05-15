package co.matisses.b1ws.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author dbotero
 */
public class ItemDTO {

    private Double salesUnitHeight;
    private Double salesUnitLength;
    private Double salesUnitWeight;
    private Double salesUnitWidth;
    private Long itemsGroupCode;
    private Long uCojineria;
    private Long uFactorRedondeo;
    private String itemCode;
    private String itemName;
    private String barCode;
    private String foreignName;
    private String productSource;
    private String uGrupo;
    private String uSubGrupo;
    private String uURefPro;
    private String uURefAduana;
    private String uUDesAduana;
    private String uUCodAran;
    private String uUCarat;
    private String uUColEstru;
    private String uUPalCla;
    private String uUAlt;
    private String uUHabDes;
    private String uDescripciona;
    private String uCuidados;
    private String uType;
    private String uMateriales;
    private String uNumpartes;
    private String uModelo;
    private String uFotosOK;
    private String uDescCorta;
    private String uModelado;
    private String uCodigoEan;
    private String uCodigoMarca;
    private String uColeccion;
    private String uRegistroCambio;
    private Date uUActQn;
    private List<ItemPricesLineDTO> itemPrices;

    public ItemDTO() {
        itemPrices = new ArrayList<>();
    }

    public Double getSalesUnitHeight() {
        return salesUnitHeight;
    }

    public void setSalesUnitHeight(Double salesUnitHeight) {
        this.salesUnitHeight = salesUnitHeight;
    }

    public Double getSalesUnitLength() {
        return salesUnitLength;
    }

    public void setSalesUnitLength(Double salesUnitLength) {
        this.salesUnitLength = salesUnitLength;
    }

    public Double getSalesUnitWeight() {
        return salesUnitWeight;
    }

    public void setSalesUnitWeight(Double salesUnitWeight) {
        this.salesUnitWeight = salesUnitWeight;
    }

    public Double getSalesUnitWidth() {
        return salesUnitWidth;
    }

    public void setSalesUnitWidth(Double salesUnitWidth) {
        this.salesUnitWidth = salesUnitWidth;
    }

    public Long getItemsGroupCode() {
        return itemsGroupCode;
    }

    public void setItemsGroupCode(Long itemsGroupCode) {
        this.itemsGroupCode = itemsGroupCode;
    }

    public Long getuCojineria() {
        return uCojineria;
    }

    public void setuCojineria(Long uCojineria) {
        this.uCojineria = uCojineria;
    }

    public Long getuFactorRedondeo() {
        return uFactorRedondeo;
    }

    public void setuFactorRedondeo(Long uFactorRedondeo) {
        this.uFactorRedondeo = uFactorRedondeo;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getForeignName() {
        return foreignName;
    }

    public void setForeignName(String foreignName) {
        this.foreignName = foreignName;
    }

    public String getProductSource() {
        return productSource;
    }

    public void setProductSource(String productSource) {
        this.productSource = productSource;
    }

    public String getuGrupo() {
        return uGrupo;
    }

    public void setuGrupo(String uGrupo) {
        this.uGrupo = uGrupo;
    }

    public String getuSubGrupo() {
        return uSubGrupo;
    }

    public void setuSubGrupo(String uSubGrupo) {
        this.uSubGrupo = uSubGrupo;
    }

    public String getuURefPro() {
        return uURefPro;
    }

    public void setuURefPro(String uURefPro) {
        this.uURefPro = uURefPro;
    }

    public String getuURefAduana() {
        return uURefAduana;
    }

    public void setuURefAduana(String uURefAduana) {
        this.uURefAduana = uURefAduana;
    }

    public String getuUDesAduana() {
        return uUDesAduana;
    }

    public void setuUDesAduana(String uUDesAduana) {
        this.uUDesAduana = uUDesAduana;
    }

    public String getuUCodAran() {
        return uUCodAran;
    }

    public void setuUCodAran(String uUCodAran) {
        this.uUCodAran = uUCodAran;
    }

    public String getuUCarat() {
        return uUCarat;
    }

    public void setuUCarat(String uUCarat) {
        this.uUCarat = uUCarat;
    }

    public String getuUColEstru() {
        return uUColEstru;
    }

    public void setuUColEstru(String uUColEstru) {
        this.uUColEstru = uUColEstru;
    }

    public String getuUPalCla() {
        return uUPalCla;
    }

    public void setuUPalCla(String uUPalCla) {
        this.uUPalCla = uUPalCla;
    }

    public String getuUAlt() {
        return uUAlt;
    }

    public void setuUAlt(String uUAlt) {
        this.uUAlt = uUAlt;
    }

    public String getuUHabDes() {
        return uUHabDes;
    }

    public void setuUHabDes(String uUHabDes) {
        this.uUHabDes = uUHabDes;
    }

    public String getuDescripciona() {
        return uDescripciona;
    }

    public void setuDescripciona(String uDescripciona) {
        this.uDescripciona = uDescripciona;
    }

    public String getuCuidados() {
        return uCuidados;
    }

    public void setuCuidados(String uCuidados) {
        this.uCuidados = uCuidados;
    }

    public String getuType() {
        return uType;
    }

    public void setuType(String uType) {
        this.uType = uType;
    }

    public String getuMateriales() {
        return uMateriales;
    }

    public void setuMateriales(String uMateriales) {
        this.uMateriales = uMateriales;
    }

    public String getuNumpartes() {
        return uNumpartes;
    }

    public void setuNumpartes(String uNumpartes) {
        this.uNumpartes = uNumpartes;
    }

    public String getuModelo() {
        return uModelo;
    }

    public void setuModelo(String uModelo) {
        this.uModelo = uModelo;
    }

    public String getuFotosOK() {
        return uFotosOK;
    }

    public void setuFotosOK(String uFotosOK) {
        this.uFotosOK = uFotosOK;
    }

    public String getuDescCorta() {
        return uDescCorta;
    }

    public void setuDescCorta(String uDescCorta) {
        this.uDescCorta = uDescCorta;
    }

    public String getuModelado() {
        return uModelado;
    }

    public void setuModelado(String uModelado) {
        this.uModelado = uModelado;
    }

    public String getuCodigoEan() {
        return uCodigoEan;
    }

    public void setuCodigoEan(String uCodigoEan) {
        this.uCodigoEan = uCodigoEan;
    }

    public String getuCodigoMarca() {
        return uCodigoMarca;
    }

    public void setuCodigoMarca(String uCodigoMarca) {
        this.uCodigoMarca = uCodigoMarca;
    }

    public String getuColeccion() {
        return uColeccion;
    }

    public void setuColeccion(String uColeccion) {
        this.uColeccion = uColeccion;
    }

    public String getuRegistroCambio() {
        return uRegistroCambio;
    }

    public void setuRegistroCambio(String uRegistroCambio) {
        this.uRegistroCambio = uRegistroCambio;
    }

    public Date getuUActQn() {
        return uUActQn;
    }

    public void setuUActQn(Date uUActQn) {
        this.uUActQn = uUActQn;
    }

    public List<ItemPricesLineDTO> getItemPrices() {
        return itemPrices;
    }

    public void setItemPrices(List<ItemPricesLineDTO> itemPrices) {
        this.itemPrices = itemPrices;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.itemCode);
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
        final ItemDTO other = (ItemDTO) obj;
        if (!Objects.equals(this.itemCode, other.itemCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemDTO{" + "salesUnitHeight=" + salesUnitHeight + ", salesUnitLength=" + salesUnitLength + ", salesUnitWeight=" + salesUnitWeight
                + ", salesUnitWidth=" + salesUnitWidth + ", itemsGroupCode=" + itemsGroupCode + ", uCojineria=" + uCojineria
                + ", uFactorRedondeo=" + uFactorRedondeo + ", itemCode=" + itemCode + ", itemName=" + itemName + ", barCode=" + barCode
                + ", foreignName=" + foreignName + ", productSource=" + productSource + ", uGrupo=" + uGrupo + ", uSubGrupo=" + uSubGrupo
                + ", uURefPro=" + uURefPro + ", uURefAduana=" + uURefAduana + ", uUDesAduana=" + uUDesAduana + ", uUCodAran=" + uUCodAran
                + ", uUCarat=" + uUCarat + ", uUColEstru=" + uUColEstru + ", uUPalCla=" + uUPalCla + ", uUAlt=" + uUAlt + ", uUHabDes=" + uUHabDes
                + ", uDescripciona=" + uDescripciona + ", uCuidados=" + uCuidados + ", uType=" + uType + ", uMateriales=" + uMateriales
                + ", uNumpartes=" + uNumpartes + ", uModelo=" + uModelo + ", uFotosOK=" + uFotosOK + ", uDescCorta=" + uDescCorta
                + ", uModelado=" + uModelado + ", uCodigoEan=" + uCodigoEan + ", uCodigoMarca=" + uCodigoMarca + ", uColeccion=" + uColeccion
                + ", uRegistroCambio=" + uRegistroCambio + ", uUActQn=" + uUActQn + ", itemPrices=" + itemPrices + '}';
    }
}
