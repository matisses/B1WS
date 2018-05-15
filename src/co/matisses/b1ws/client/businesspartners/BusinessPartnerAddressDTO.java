package co.matisses.b1ws.client.businesspartners;

/**
 *
 * @author dbotero
 */
public class BusinessPartnerAddressDTO {

    private String stateCode;
    private String stateName;
    private String cityCode;
    private String cityName;
    private String addressName;
    private AddressType addressType;
    private String address;
    private String landLine;
    private String cellphone;
    private String email;
    private String country;
    private String taxCode;

    public BusinessPartnerAddressDTO() {
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLandLine() {
        return landLine;
    }

    public void setLandLine(String landLine) {
        this.landLine = landLine;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    @Override
    public String toString() {
        return "BusinessPartnerAddressDTO{" + "stateCode=" + stateCode + ", stateName=" + stateName + ", cityCode=" + cityCode + ", cityName=" + cityName + ", addressName=" + addressName + ", addressType=" + addressType + ", address=" + address + ", landLine=" + landLine + ", cellphone=" + cellphone + ", email=" + email + ", country=" + country + ", taxCode=" + taxCode + '}';
    }

    public enum AddressType {
        BILLING("B"), SHIPPING("S");
        private String type;

        private AddressType(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }
    }
}
