package co.matisses.b1ws.client.quotations;

/**
 *
 * @author ygil
 */
public class AddressExtensionDTO {

    private String shipToStreet;
    private String shipToBlock;
    private String shipToBuilding;
    private String shipToCity;
    private String shipToCounty;
    private String shipToState;
    private String shipToCountry;
    private String billToStreet;
    private String billToBlock;
    private String billToBuilding;
    private String billToCity;
    private String billToCounty;
    private String billToState;
    private String billToCountry;

    public AddressExtensionDTO() {
    }

    public AddressExtensionDTO(String shipToStreet, String shipToBlock, String shipToBuilding, String shipToCity, String shipToCounty, String shipToState,
            String shipToCountry, String billToStreet, String billToBlock, String billToBuilding, String billToCity, String billToCounty, String billToState, String billToCountry) {
        this.shipToStreet = shipToStreet;
        this.shipToBlock = shipToBlock;
        this.shipToBuilding = shipToBuilding;
        this.shipToCity = shipToCity;
        this.shipToCounty = shipToCounty;
        this.shipToState = shipToState;
        this.shipToCountry = shipToCountry;
        this.billToStreet = billToStreet;
        this.billToBlock = billToBlock;
        this.billToBuilding = billToBuilding;
        this.billToCity = billToCity;
        this.billToCounty = billToCounty;
        this.billToState = billToState;
        this.billToCountry = billToCountry;
    }

    public String getShipToStreet() {
        return shipToStreet;
    }

    public void setShipToStreet(String shipToStreet) {
        this.shipToStreet = shipToStreet;
    }

    public String getShipToBlock() {
        return shipToBlock;
    }

    public void setShipToBlock(String shipToBlock) {
        this.shipToBlock = shipToBlock;
    }

    public String getShipToBuilding() {
        return shipToBuilding;
    }

    public void setShipToBuilding(String shipToBuilding) {
        this.shipToBuilding = shipToBuilding;
    }

    public String getShipToCity() {
        return shipToCity;
    }

    public void setShipToCity(String shipToCity) {
        this.shipToCity = shipToCity;
    }

    public String getShipToCounty() {
        return shipToCounty;
    }

    public void setShipToCounty(String shipToCounty) {
        this.shipToCounty = shipToCounty;
    }

    public String getShipToState() {
        return shipToState;
    }

    public void setShipToState(String shipToState) {
        this.shipToState = shipToState;
    }

    public String getShipToCountry() {
        return shipToCountry;
    }

    public void setShipToCountry(String shipToCountry) {
        this.shipToCountry = shipToCountry;
    }

    public String getBillToStreet() {
        return billToStreet;
    }

    public void setBillToStreet(String billToStreet) {
        this.billToStreet = billToStreet;
    }

    public String getBillToBlock() {
        return billToBlock;
    }

    public void setBillToBlock(String billToBlock) {
        this.billToBlock = billToBlock;
    }

    public String getBillToBuilding() {
        return billToBuilding;
    }

    public void setBillToBuilding(String billToBuilding) {
        this.billToBuilding = billToBuilding;
    }

    public String getBillToCity() {
        return billToCity;
    }

    public void setBillToCity(String billToCity) {
        this.billToCity = billToCity;
    }

    public String getBillToCounty() {
        return billToCounty;
    }

    public void setBillToCounty(String billToCounty) {
        this.billToCounty = billToCounty;
    }

    public String getBillToState() {
        return billToState;
    }

    public void setBillToState(String billToState) {
        this.billToState = billToState;
    }

    public String getBillToCountry() {
        return billToCountry;
    }

    public void setBillToCountry(String billToCountry) {
        this.billToCountry = billToCountry;
    }
}
