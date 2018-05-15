package co.matisses.b1ws.client.businesspartners;

import co.matisses.b1ws.businessparters.Add;
import co.matisses.b1ws.businessparters.AddResponse;
import co.matisses.b1ws.businessparters.BusinessPartner;
import co.matisses.b1ws.businessparters.BusinessPartnerParams;
import co.matisses.b1ws.businessparters.BusinessPartnersService;
import co.matisses.b1ws.businessparters.BusinessPartnersServiceSoap;
import co.matisses.b1ws.businessparters.GetByParams;
import co.matisses.b1ws.businessparters.MsgHeader;
import co.matisses.b1ws.businessparters.Update;
import co.matisses.b1ws.client.B1WSServiceInfo;
import static co.matisses.b1ws.client.B1WSServiceInfo.BUSINESS_PARTNERS_SERVICE_WSDL_NAME;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeFactory;

/**
 *
 * @author dbotero
 */
public class BusinessPartnersServiceConnector extends B1WSServiceInfo {

    private static final Logger log = Logger.getLogger(BusinessPartnersServiceConnector.class.getSimpleName());
    private BusinessPartnersService service;
    private String sessionId;

    public BusinessPartnersServiceConnector(BusinessPartnersService service, String sessionId) {
        super();
        this.service = service;
        this.sessionId = sessionId;
    }

    public BusinessPartner findBusinessPartner(String cardCode) throws BusinessPartnerServiceException {
        BusinessPartnersServiceSoap port = service.getBusinessPartnersServiceSoap12();
        if (sessionId == null) {
            throw new BusinessPartnerServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }

        MsgHeader header = new MsgHeader();
        header.setSessionID(sessionId);
        header.setServiceName(BUSINESS_PARTNERS_SERVICE_WSDL_NAME);

        if (cardCode != null && !cardCode.contains("CL")) {
            cardCode += "CL";
        } else if (cardCode == null || cardCode.isEmpty()) {
            return null;
        }

        BusinessPartnerParams customer = new BusinessPartnerParams();
        customer.setCardCode(cardCode);

        try {
            GetByParams value = new GetByParams();
            value.setBusinessPartnerParams(customer);
            log.log(Level.INFO, "Se obtuvo el cliente con nit {0} satisfactoriamente", customer.getCardCode());

            BusinessPartner businessPartner = (port.getByParams(value, header)).getBusinessPartner();

            log.log(Level.INFO, businessPartner.toString());

            return businessPartner;
        } catch (Exception e) {
            log.log(Level.SEVERE, "Ocurrio un error al obtener un cliente usando B1WS. ", e);
            throw new BusinessPartnerServiceException("No fue posible obtener el cliente. " + e.getMessage());
        }
    }

    public void editBusinessPartner(BusinessPartner business) throws BusinessPartnerServiceException {
        log.log(Level.INFO, business.toString());
        BusinessPartnersServiceSoap port = service.getBusinessPartnersServiceSoap12();
        if (sessionId == null) {
            throw new BusinessPartnerServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }

        MsgHeader header = new MsgHeader();
        header.setSessionID(sessionId);
        header.setServiceName(BUSINESS_PARTNERS_SERVICE_WSDL_NAME);

//        BusinessPartner customer = new BusinessPartner();
//        customer.setContactPerson(business.getContactPerson());
//        customer.setCardCode(business.getCardCode().toUpperCase());
//        customer.setCardType(business.getCardType());
//        customer.setCardName(business.getCardName().toUpperCase());
//        customer.setFederalTaxID(business.getFederalTaxID());//lictradnum
//        customer.setUEsAutorret(business.getUEsAutorret());//autorretenedor Y/N
//        customer.setUBPCORTC(business.getUBPCORTC());//regimen tributario
//        customer.setUBPCOTDC(business.getUBPCOTDC());//tipo documento
//        customer.setUBPCOTP(business.getUBPCOTP());//tipo persona
//        customer.setUBPCONombre(business.getUBPCONombre().toUpperCase());
//        customer.setUBPCO1Apellido(business.getUBPCO1Apellido().toUpperCase());
//        customer.setUBPCO2Apellido(business.getUBPCO2Apellido().toUpperCase());
//        customer.setUBPCOBPExt(business.getUBPCOBPExt());//nacional=01, extranjero=02
//        customer.setUBPCOTBPE(business.getUBPCOTBPE());//TODO: confirmar el valor para enviar
//        customer.setUSexo(business.getUSexo());
//        customer.setSalesPersonCode(business.getSalesPersonCode());
//        customer.setPriceListNum(1L);//Se manda 1 debido a que es el por defecto
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        GregorianCalendar cal = new GregorianCalendar();
//        try {
//            cal.setTime(sdf.parse(business.getUFechaNacimiento()));
//        } catch (Exception e) {
//            log.log(Level.SEVERE, "Ocurrio un error al formatear la fecha de nacimiento. Se configura fecha por defecto. ");
//            try {
//                cal.setTime(sdf.parse("1900-01-01"));
//            } catch (Exception ex) {
//            }
//        }
//        try {
//            customer.setUFechaNacimiento(business.getUFechaNacimiento());
//        } catch (Exception e) {
//        }
//        BusinessPartner.BPAddresses addresses = new BusinessPartner.BPAddresses();
//        for (BusinessPartner.BPAddresses.BPAddress addressDto : business.getBPAddresses().getBPAddress()) {
//            BusinessPartner.BPAddresses.BPAddress address = new BusinessPartner.BPAddresses.BPAddress();
//            address.setAddressName(addressDto.getAddressName().toUpperCase());
//            address.setAddressType(addressDto.getAddressType());
//            address.setBPCode(business.getCardCode().toUpperCase());
//            address.setStreet(addressDto.getStreet().toUpperCase());//direccion
//            address.setBlock(addressDto.getBlock().toUpperCase());//telefono fijo
//            address.setCity(addressDto.getCity().toUpperCase());//nombre ciudad
//            address.setCounty(addressDto.getCounty());//email
//            address.setState(addressDto.getState());//codigo dpto
//            address.setCountry(addressDto.getCountry());//CO
//            address.setTaxCode(addressDto.getTaxCode());//GENVT16
//            address.setBuildingFloorRoom(addressDto.getBuildingFloorRoom());//celular
//            address.setUMunicipio(addressDto.getUMunicipio());//codigo municipio
//            if (address.getAddressName().equals(business.getDefaultBillingAddress()) && address.getAddressType().equals("B")) {
//                customer.setUBPCOCS(addressDto.getCityCode().toUpperCase());//codigo mpio medios
//                customer.setUBPCOCity(addressDto.getCityCode().toUpperCase());//codigo mpio medios
//                customer.setUBPCOAddress(addressDto.getAddress().toUpperCase());
//                customer.setEmailAddress(addressDto.getEmail());
//                customer.setPhone1(addressDto.getLandLine());//telefono fijo
//                customer.setCellular(addressDto.getCellphone());
//            }
//            addresses.getBPAddress().add(address);
//        }
//        customer.setBPAddresses(addresses);
        try {
            Update value = new Update();
            value.setBusinessPartner(business);
            port.update(value, header);
            log.log(Level.INFO, "Se actualizo el cliente con nit {0} satisfactoriamente", business.getCardCode());
        } catch (Exception e) {
            log.log(Level.SEVERE, "Ocurrio un error al modificar un cliente usando B1WS. ", e);
            throw new BusinessPartnerServiceException("No fue posible modificar el cliente. " + e.getMessage());
        }
    }

    public void createBusinessPartner(BusinessPartner business) throws BusinessPartnerServiceException {
        log.log(Level.INFO, "Creando cliente {0} con sesion {1}", new Object[]{business, sessionId});
        BusinessPartnersServiceSoap port = service.getBusinessPartnersServiceSoap12();
        if (sessionId == null) {
            throw new BusinessPartnerServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }

        MsgHeader header = new MsgHeader();
        header.setSessionID(sessionId);
        header.setServiceName(BUSINESS_PARTNERS_SERVICE_WSDL_NAME);

//        BusinessPartner customer = new BusinessPartner();
//        customer.setCardCode(dto.getCardCode().toUpperCase());
//        customer.setCardType(dto.getCardType().getType());
//        customer.setCardName(dto.getCardName().toUpperCase());
//        customer.setCardForeignName(customer.getCardName());
//        customer.setSubjectToWithholdingTax("N");//TODO: pasar este valor desde el DTO
//        customer.setFederalTaxID(dto.getFiscalID());//lictradnum
//        customer.setUEsAutorret(dto.getSelfRetainer());//autorretenedor Y/N
//        customer.setUBPCORTC(dto.getTaxRegime().getRegime());//regimen tributario
//        customer.setUBPCOTDC(dto.getFiscalIdType().getType());//tipo documento
//        customer.setUBPCOTP(dto.getPersonType().getType());//tipo persona
//        if (dto.getPersonType().equals(BusinessPartnerDTO.PersonType.NATURAL)) {
//            customer.setUBPCONombre(dto.getFirstName().toUpperCase());
//            customer.setUBPCO1Apellido(dto.getLastName1().toUpperCase());
//            customer.setUBPCO2Apellido(dto.getLastName2().toUpperCase());
//        } else {
//            BusinessPartner.ContactEmployees contactEmployees = new BusinessPartner.ContactEmployees();
//            BusinessPartner.ContactEmployees.ContactEmployee employee = new BusinessPartner.ContactEmployees.ContactEmployee();
//            employee.setFirstName(dto.getFirstName());
//            employee.setLastName(dto.getLastName1() + " " + dto.getLastName2());
//            contactEmployees.getContactEmployee().add(employee);
//            customer.setContactEmployees(contactEmployees);
//        }
//        customer.setUBPCOBPExt(dto.getNationality().getType());//nacional=01, extranjero=02
//        customer.setUBPCOTBPE(dto.getForeignType().getType());//TODO: confirmar el valor para enviar
//        customer.setUSexo(dto.getGender().getGender());
//        customer.setSalesPersonCode(Long.parseLong(dto.getSalesPersonCode()));
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        GregorianCalendar cal = new GregorianCalendar();
//        try {
//            cal.setTime(sdf.parse(dto.getBirthDate()));
//        } catch (Exception e) {
//            log.log(Level.SEVERE, "Ocurrio un error al formatear la fecha de nacimiento. Se configura fecha por defecto. ");
//            try {
//                cal.setTime(sdf.parse("1900-01-01"));
//            } catch (Exception ex) {
//            }
//        }
//        try {
//            customer.setUFechaNacimiento(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));
//        } catch (Exception e) {
//        }
//
//        BusinessPartner.BPAddresses addresses = new BusinessPartner.BPAddresses();
//        for (BusinessPartnerAddressDTO addressDto : dto.getAddresses()) {
//            BusinessPartner.BPAddresses.BPAddress address = new BusinessPartner.BPAddresses.BPAddress();
//            address.setAddressName(addressDto.getAddressName().toUpperCase());
//            address.setAddressType(addressDto.getAddressType().getType());
//            address.setBPCode(dto.getCardCode().toUpperCase());
//            address.setStreet(addressDto.getAddress().toUpperCase());//direccion
//            address.setBlock(addressDto.getLandLine() != null ? addressDto.getLandLine().toUpperCase() : null);//telefono fijo
//            address.setCity(addressDto.getCityName().toUpperCase());//nombre ciudad
//            address.setCounty(addressDto.getEmail());//email
//            address.setState(addressDto.getStateCode());//codigo dpto
//            address.setCountry(addressDto.getCountry());//CO
//            address.setTaxCode(addressDto.getTaxCode());//GENVT16
//            address.setBuildingFloorRoom(addressDto.getCellphone());//celular
//            address.setUMunicipio(addressDto.getCityCode());//codigo municipio
//
//            if (addressDto.getAddressName().equalsIgnoreCase(dto.getDefaultBillingAddress()) && addressDto.getAddressType().equals(BusinessPartnerAddressDTO.AddressType.BILLING)) {
//                customer.setUBPCOCS(addressDto.getCityCode().toUpperCase());//codigo mpio medios
//                customer.setUBPCOCity(addressDto.getCityCode().toUpperCase());//codigo mpio medios
//                customer.setUBPCOAddress(addressDto.getAddress().toUpperCase());
//                customer.setEmailAddress(addressDto.getEmail());
//                customer.setPhone1(addressDto.getLandLine());//telefono fijo
//                customer.setCellular(addressDto.getCellphone());
//            }
//
//            addresses.getBPAddress().add(address);
//        }
//        customer.setBPAddresses(addresses);
        try {
            Add value = new Add();
            value.setBusinessPartner(business);
            AddResponse resp = port.add(value, header);
            log.log(Level.INFO, "Se registro el cliente con nit {0} satisfactoriamente", resp.getBusinessPartnerParams().getCardCode());
        } catch (Exception e) {
            log.log(Level.SEVERE, "Ocurrio un error al crear un nuevo cliente usando B1WS. ", e);
            throw new BusinessPartnerServiceException("No fue posible crear el cliente. " + e.getMessage());
        }
    }
    
    
    public void editBusinessPartner(BusinessPartnerDTO dto) throws BusinessPartnerServiceException {
        BusinessPartnersServiceSoap port = service.getBusinessPartnersServiceSoap12();
        if (sessionId == null) {
            throw new BusinessPartnerServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }

        MsgHeader header = new MsgHeader();
        header.setSessionID(sessionId);
        header.setServiceName(BUSINESS_PARTNERS_SERVICE_WSDL_NAME);

        BusinessPartner customer = new BusinessPartner();
        customer.setCardCode(dto.getCardCode().toUpperCase());
        customer.setCardType(dto.getCardType().getType());
        customer.setCardName(dto.getCardName().toUpperCase());
        customer.setFederalTaxID(dto.getFiscalID());//lictradnum
        customer.setUEsAutorret(dto.getSelfRetainer());//autorretenedor Y/N
        customer.setUBPCORTC(dto.getTaxRegime().getRegime());//regimen tributario
        customer.setUBPCOTDC(dto.getFiscalIdType().getType());//tipo documento
        customer.setUBPCOTP(dto.getPersonType().getType());//tipo persona
        customer.setUBPCONombre(dto.getFirstName().toUpperCase());
        customer.setUBPCO1Apellido(dto.getLastName1().toUpperCase());
        customer.setUBPCO2Apellido(dto.getLastName2().toUpperCase());
        customer.setUBPCOBPExt(dto.getNationality().getType());//nacional=01, extranjero=02
        customer.setUBPCOTBPE(dto.getForeignType().getType());//TODO: confirmar el valor para enviar
        customer.setUSexo(dto.getGender().getGender());
        customer.setSalesPersonCode(Long.parseLong(dto.getSalesPersonCode()));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        GregorianCalendar cal = new GregorianCalendar();
        try {
            cal.setTime(sdf.parse(dto.getBirthDate()));
        } catch (Exception e) {
            log.log(Level.SEVERE, "Ocurrio un error al formatear la fecha de nacimiento. Se configura fecha por defecto. ");
            try {
                cal.setTime(sdf.parse("1900-01-01"));
            } catch (Exception ex) {
            }
        }
        try {
            customer.setUFechaNacimiento(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));
        } catch (Exception e) {
        }

        BusinessPartner.BPAddresses addresses = new BusinessPartner.BPAddresses();
        for (BusinessPartnerAddressDTO addressDto : dto.getAddresses()) {
            BusinessPartner.BPAddresses.BPAddress address = new BusinessPartner.BPAddresses.BPAddress();
            address.setAddressName(addressDto.getAddressName().toUpperCase());
            address.setAddressType(addressDto.getAddressType().getType());
            address.setBPCode(dto.getCardCode().toUpperCase());
            address.setStreet(addressDto.getAddress().toUpperCase());//direccion
            address.setBlock(addressDto.getLandLine().toUpperCase());//telefono fijo
            address.setCity(addressDto.getCityName().toUpperCase());//nombre ciudad
            address.setCounty(addressDto.getEmail());//email
            address.setState(addressDto.getStateCode());//codigo dpto
            address.setCountry(addressDto.getCountry());//CO
            address.setTaxCode(addressDto.getTaxCode());//GENVT16
            address.setBuildingFloorRoom(addressDto.getCellphone());//celular
            address.setUMunicipio(addressDto.getCityCode());//codigo municipio

            if (address.getAddressName().equals(dto.getDefaultBillingAddress()) && address.getAddressType().equals("B")) {
                customer.setUBPCOCS(addressDto.getCityCode().toUpperCase());//codigo mpio medios
                customer.setUBPCOCity(addressDto.getCityCode().toUpperCase());//codigo mpio medios
                customer.setUBPCOAddress(addressDto.getAddress().toUpperCase());
                customer.setEmailAddress(addressDto.getEmail());
                customer.setPhone1(addressDto.getLandLine());//telefono fijo
                customer.setCellular(addressDto.getCellphone());
            }

            addresses.getBPAddress().add(address);
        }
        customer.setBPAddresses(addresses);

        try {
            Update value = new Update();
            value.setBusinessPartner(customer);
            port.update(value, header);
            log.log(Level.INFO, "Se actualizo el cliente con nit {0} satisfactoriamente", dto.getCardCode());
        } catch (Exception e) {
            log.log(Level.SEVERE, "Ocurrio un error al modificar un cliente usando B1WS. ", e);
            throw new BusinessPartnerServiceException("No fue posible modificar el cliente. " + e.getMessage());
        }
    }

    public void createBusinessPartner(BusinessPartnerDTO dto) throws BusinessPartnerServiceException {
        log.log(Level.INFO, "Creando cliente {0} con sesion {1}", new Object[]{dto, sessionId});
        BusinessPartnersServiceSoap port = service.getBusinessPartnersServiceSoap12();
        if (sessionId == null) {
            throw new BusinessPartnerServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }

        MsgHeader header = new MsgHeader();
        header.setSessionID(sessionId);
        header.setServiceName(BUSINESS_PARTNERS_SERVICE_WSDL_NAME);

        BusinessPartner customer = new BusinessPartner();
        customer.setCardCode(dto.getCardCode().toUpperCase());
        customer.setCardType(dto.getCardType().getType());
        customer.setCardName(dto.getCardName().toUpperCase());
        customer.setCardForeignName(customer.getCardName());
        customer.setSubjectToWithholdingTax("N");//TODO: pasar este valor desde el DTO
        customer.setFederalTaxID(dto.getFiscalID());//lictradnum
        customer.setUEsAutorret(dto.getSelfRetainer());//autorretenedor Y/N
        customer.setUBPCORTC(dto.getTaxRegime().getRegime());//regimen tributario
        customer.setUBPCOTDC(dto.getFiscalIdType().getType());//tipo documento
        customer.setUBPCOTP(dto.getPersonType().getType());//tipo persona
        if (dto.getPersonType().equals(BusinessPartnerDTO.PersonType.NATURAL)) {
            customer.setUBPCONombre(dto.getFirstName().toUpperCase());
            customer.setUBPCO1Apellido(dto.getLastName1().toUpperCase());
            customer.setUBPCO2Apellido(dto.getLastName2().toUpperCase());
        } else {
            BusinessPartner.ContactEmployees contactEmployees = new BusinessPartner.ContactEmployees();
            BusinessPartner.ContactEmployees.ContactEmployee employee = new BusinessPartner.ContactEmployees.ContactEmployee();
            employee.setFirstName(dto.getFirstName());
            employee.setLastName(dto.getLastName1() + " " + dto.getLastName2());
            contactEmployees.getContactEmployee().add(employee);
            customer.setContactEmployees(contactEmployees);
        }
        customer.setUBPCOBPExt(dto.getNationality().getType());//nacional=01, extranjero=02
        customer.setUBPCOTBPE(dto.getForeignType().getType());//TODO: confirmar el valor para enviar
        customer.setUSexo(dto.getGender().getGender());
        customer.setSalesPersonCode(Long.parseLong(dto.getSalesPersonCode()));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        GregorianCalendar cal = new GregorianCalendar();
        try {
            cal.setTime(sdf.parse(dto.getBirthDate()));
        } catch (Exception e) {
            log.log(Level.SEVERE, "Ocurrio un error al formatear la fecha de nacimiento. Se configura fecha por defecto. ");
            try {
                cal.setTime(sdf.parse("1900-01-01"));
            } catch (Exception ex) {
            }
        }
        try {
            customer.setUFechaNacimiento(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));
        } catch (Exception e) {
        }

        BusinessPartner.BPAddresses addresses = new BusinessPartner.BPAddresses();
        for (BusinessPartnerAddressDTO addressDto : dto.getAddresses()) {
            BusinessPartner.BPAddresses.BPAddress address = new BusinessPartner.BPAddresses.BPAddress();
            address.setAddressName(addressDto.getAddressName().toUpperCase());
            address.setAddressType(addressDto.getAddressType().getType());
            address.setBPCode(dto.getCardCode().toUpperCase());
            address.setStreet(addressDto.getAddress().toUpperCase());//direccion
            address.setBlock(addressDto.getLandLine() != null ? addressDto.getLandLine().toUpperCase() : null);//telefono fijo
            address.setCity(addressDto.getCityName().toUpperCase());//nombre ciudad
            address.setCounty(addressDto.getEmail());//email
            address.setState(addressDto.getStateCode());//codigo dpto
            address.setCountry(addressDto.getCountry());//CO
            address.setTaxCode(addressDto.getTaxCode());//GENVT16
            address.setBuildingFloorRoom(addressDto.getCellphone());//celular
            address.setUMunicipio(addressDto.getCityCode());//codigo municipio

            if (addressDto.getAddressName().equalsIgnoreCase(dto.getDefaultBillingAddress()) && addressDto.getAddressType().equals(BusinessPartnerAddressDTO.AddressType.BILLING)) {
                customer.setUBPCOCS(addressDto.getCityCode().toUpperCase());//codigo mpio medios
                customer.setUBPCOCity(addressDto.getCityCode().toUpperCase());//codigo mpio medios
                customer.setUBPCOAddress(addressDto.getAddress().toUpperCase());
                customer.setEmailAddress(addressDto.getEmail());
                customer.setPhone1(addressDto.getLandLine());//telefono fijo
                customer.setCellular(addressDto.getCellphone());
            }

            addresses.getBPAddress().add(address);
        }
        customer.setBPAddresses(addresses);

        try {
            Add value = new Add();
            value.setBusinessPartner(customer);
            AddResponse resp = port.add(value, header);
            log.log(Level.INFO, "Se registro el cliente con nit {0} satisfactoriamente", resp.getBusinessPartnerParams().getCardCode());
        } catch (Exception e) {
            log.log(Level.SEVERE, "Ocurrio un error al crear un nuevo cliente usando B1WS. ", e);
            throw new BusinessPartnerServiceException("No fue posible crear el cliente. " + e.getMessage());
        }
    }
}
