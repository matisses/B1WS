package co.matisses.b1ws.client.businesspartners;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dbotero
 */
public class BusinessPartnerDTO {

    private String birthDate;
    private String cardCode;
    private String cardName;
    private String defaultShippingAddress;
    private String defaultBillingAddress;
    private String firstName;
    private String lastName1;
    private String lastName2;
    private String fiscalID;
    private String selfRetainer;
    private String salesPersonCode;
    private String cntctPrsn;
    private CardType cardType;
    private FiscalIdType fiscalIdType;
    private ForeignType foreignType;
    private Gender gender;
    private Nationality nationality;
    private PersonType personType;
    private TaxRegime taxRegime;
    private List<BusinessPartnerAddressDTO> addresses;

    public BusinessPartnerDTO() {
        addresses = new ArrayList<>();
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getCardTypeStr() {
        return cardType.type;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2 == null ? "" : lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getFiscalID() {
        return fiscalID;
    }

    public void setFiscalID(String fiscalID) {
        this.fiscalID = fiscalID;
    }

    public String getSelfRetainer() {
        return selfRetainer;
    }

    public void setSelfRetainer(String selfRetainer) {
        this.selfRetainer = selfRetainer;
    }

    public TaxRegime getTaxRegime() {
        return taxRegime;
    }

    public void setTaxRegime(TaxRegime taxRegime) {
        this.taxRegime = taxRegime;
    }

    public String getFiscalIdTypeStr() {
        return fiscalIdType.type;
    }

    public FiscalIdType getFiscalIdType() {
        return fiscalIdType;
    }

    public void setFiscalIdType(FiscalIdType fiscalIdType) {
        this.fiscalIdType = fiscalIdType;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public ForeignType getForeignType() {
        return foreignType;
    }

    public void setForeignType(ForeignType foreignType) {
        this.foreignType = foreignType;
    }

    public String getDefaultBillingAddress() {
        return defaultBillingAddress;
    }

    public void setDefaultBillingAddress(String defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
    }

    public String getDefaultShippingAddress() {
        return defaultShippingAddress;
    }

    public void setDefaultShippingAddress(String defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSalesPersonCode() {
        return salesPersonCode;
    }

    public void setSalesPersonCode(String salesPersonCode) {
        this.salesPersonCode = salesPersonCode;
    }

    public String getCntctPrsn() {
        return cntctPrsn;
    }

    public void setCntctPrsn(String cntctPrsn) {
        this.cntctPrsn = cntctPrsn;
    }

    public List<BusinessPartnerAddressDTO> getAddresses() {
        return addresses;
    }

    public void addAddress(BusinessPartnerAddressDTO address) {
        addresses.add(address);
    }

    @Override
    public String toString() {
        return "BusinessPartnerDTO{" + "cardCode=" + cardCode + ", cardType=" + cardType + ", cardName=" + cardName + ", firstName=" + firstName + ", lastName1=" + lastName1 + ", lastName2=" + lastName2 + ", fiscalID=" + fiscalID + ", selfRetainer=" + selfRetainer + ", taxRegime=" + taxRegime + ", fiscalIdType=" + fiscalIdType + ", personType=" + personType + ", nationality=" + nationality + ", foreignType=" + foreignType + ", defaultShippingAddress=" + defaultShippingAddress + ", defaultBillingAddress=" + defaultBillingAddress + ", birthDate=" + birthDate + ", gender=" + gender + ", salesPersonCode=" + salesPersonCode + ", addresses=" + addresses + '}';
    }

    public enum Nationality {
        NATIONAL("01"), FOREIGN("02");
        private final String type;

        private Nationality(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }

        public static Nationality getNationallity(String type) {
            for (Nationality n : values()) {
                if (n.getType().equals(type)) {
                    return n;
                }
            }
            return null;
        }
    }

    public enum PersonType {
        NATURAL("01"), JURIDICA("02");
        private final String type;

        private PersonType(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }

        public static PersonType getType(String type) {
            for (PersonType p : values()) {
                if (p.getType().equals(type)) {
                    return p;
                }
            }
            return null;
        }
    }

    public enum Gender {
        MASCULINO("1"), FEMENINO("2"), NINGUNO("3");
        private final String gender;

        private Gender(String gender) {
            this.gender = gender;
        }

        public String getGender() {
            return this.gender;
        }

        public static Gender getGender(String gender) {
            for (Gender g : values()) {
                if (g.getGender().equals(gender)) {
                    return g;
                }
            }
            return null;
        }
    }

    public enum TaxRegime {
        EXTERIOR("EXT"),
        GRAN_CONTRIBUYENTE("GC"),
        NO_RESPONSABLE("NR"),
        REGIMEN_COMUN("RC"),
        REGIMEN_SIMPLIFICADO("RS");
        private final String regime;

        private TaxRegime(String regime) {
            this.regime = regime;
        }

        public String getRegime() {
            return this.regime;
        }

        public static TaxRegime getType(String regime) {
            for (TaxRegime r : values()) {
                if (r.getRegime().equals(regime)) {
                    return r;
                }
            }
            return null;
        }
    }

    public enum FiscalIdType {
        REGISTRO_CIVIL("11"),
        TARJETA_IDENTIDAD("12"),
        CEDULA_CIUDADANIA("13"),
        TARJETA_EXTRANJERIA("21"),
        CEDULA_EXTRANJERIA("22"),
        NIT("31"),
        PASAPORTE("41"),
        TIPO_DOC_EXTRANJERO("42"),
        DOC_INFO_EXOGENA("43");
        private final String type;

        private FiscalIdType(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }

        public static FiscalIdType getType(String type) {
            for (FiscalIdType en : values()) {
                if (en.getType().equals(type)) {
                    return en;
                }
            }
            return null;
        }
    }

    public enum ForeignType {
        NO_APLICA("-"), CON_CLAVE("01"), SIN_CLAVE("02");
        private final String type;

        private ForeignType(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }

        public static ForeignType getType(String type) {
            for (ForeignType t : values()) {
                if (t.getType().equals(type)) {
                    return t;
                }
            }
            return null;
        }
    }

    public enum CardType {
        SUPPLIER("S"), CUSTOMER("C"), LEAD("L");
        private final String type;

        private CardType(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }

        public static CardType getType(String type) {
            for (CardType t : values()) {
                if (t.getType().equals(type)) {
                    return t;
                }
            }
            return null;
        }
    }
}
