
package co.matisses.b1ws.employeesinfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="gt_Female"/>
 *               &lt;enumeration value="gt_Male"/>
 *               &lt;enumeration value="gt_Undefined"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Branch" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="WorkStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkStateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manager" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ApplicationUserID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesPersonCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OfficePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfficeExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Salary" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SalaryUnit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="scu_Hour"/>
 *               &lt;enumeration value="scu_Day"/>
 *               &lt;enumeration value="scu_Week"/>
 *               &lt;enumeration value="scu_Month"/>
 *               &lt;enumeration value="scu_Year"/>
 *               &lt;enumeration value="scu_Semimonthly"/>
 *               &lt;enumeration value="scu_Biweekly"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmployeeCosts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EmployeeCostUnit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="scu_Hour"/>
 *               &lt;enumeration value="scu_Day"/>
 *               &lt;enumeration value="scu_Week"/>
 *               &lt;enumeration value="scu_Month"/>
 *               &lt;enumeration value="scu_Year"/>
 *               &lt;enumeration value="scu_Semimonthly"/>
 *               &lt;enumeration value="scu_Biweekly"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TerminationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TreminationReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankBranchNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CountryOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MartialStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="mts_Single"/>
 *               &lt;enumeration value="mts_Married"/>
 *               &lt;enumeration value="mts_Divorced"/>
 *               &lt;enumeration value="mts_Widowed"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumOfChildren" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CitizenshipCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassportExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Picture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalaryCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeCostsCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkBuildingFloorRoom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeBuildingFloorRoom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AttachmentEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CostCenterCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VacationPreviousYear" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VacationCurrentYear" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MunicipalityKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncomeTaxLiability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Religion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerReligion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExemptionAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ExemptionUnit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="eeu_None"/>
 *               &lt;enumeration value="eeu_Yearly"/>
 *               &lt;enumeration value="eeu_Monthly"/>
 *               &lt;enumeration value="eeu_Weekly"/>
 *               &lt;enumeration value="eeu_Daily"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExemptionCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AdditionalUnit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="eeu_None"/>
 *               &lt;enumeration value="eeu_Yearly"/>
 *               &lt;enumeration value="eeu_Monthly"/>
 *               &lt;enumeration value="eeu_Weekly"/>
 *               &lt;enumeration value="eeu_Daily"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AdditionalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxOfficeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HealthInsuranceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HealthInsuranceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HealthInsuranceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SocialInsuranceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfessionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobTitleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankCodeForDATEV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviatingBankAccountOwner" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SpouseFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpouseSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalEmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="epm_None"/>
 *               &lt;enumeration value="epm_BankTransfer"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STDCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRCNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountantResponsible" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LegalRepresentative" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DIRFResponsible" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CRCState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BPLID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PassportIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PassportIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualificationCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="spedNA"/>
 *               &lt;enumeration value="spedDiretor"/>
 *               &lt;enumeration value="spedConselheiroDeAdministracao"/>
 *               &lt;enumeration value="spedAdministrador"/>
 *               &lt;enumeration value="spedAdministradorDoGrupo"/>
 *               &lt;enumeration value="spedAdministradorDeSociedadeFiliada"/>
 *               &lt;enumeration value="spedAdministradorJudicialPessoaFisica"/>
 *               &lt;enumeration value="spedAdministradorJudicialPessoaJuridicaProfissionalResponsavel"/>
 *               &lt;enumeration value="spedAdministradorJudicialGestor"/>
 *               &lt;enumeration value="spedGestorJudicial"/>
 *               &lt;enumeration value="spedProcurador"/>
 *               &lt;enumeration value="spedInventariante"/>
 *               &lt;enumeration value="spedLiquidante"/>
 *               &lt;enumeration value="spedInterventor"/>
 *               &lt;enumeration value="spedEmpresario"/>
 *               &lt;enumeration value="spedContador"/>
 *               &lt;enumeration value="spedOutros"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRWebAccess" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PreviousPRWebAccess" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmployeeAbsenceInfoLines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EmployeeAbsenceInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ApprovedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ConfirmerNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EmployeeEducationInfoLines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EmployeeEducationInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="EmployeeNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="EducationType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Institute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Major" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Diploma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EmployeeReviewsInfoLines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EmployeeReviewsInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="EmployeeNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="ReviewDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Manager" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EmployeePreviousEmpoymentInfoLines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EmployeePreviousEmpoymentInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="EmployeeNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="FromDtae" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="Employer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EmployeeRolesInfoLines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EmployeeRolesInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="RoleID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EmployeeSavingsPaymentInfoLines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EmployeeSavingsPaymentInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="ContractName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PaymentNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AN" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="ANcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AG" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AGcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Sequence" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="cs_Monthly"/>
 *                                   &lt;enumeration value="cs_Quarterly"/>
 *                                   &lt;enumeration value="cs_SemiAnnually"/>
 *                                   &lt;enumeration value="cs_Yearly"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "EmployeeInfo")
public class EmployeeInfo {

    @XmlElement(name = "EmployeeID")
    protected Long employeeID;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "EmployeeType")
    protected Long employeeType;
    @XmlElement(name = "Department")
    protected Long department;
    @XmlElement(name = "Branch")
    protected Long branch;
    @XmlElement(name = "WorkStreet")
    protected String workStreet;
    @XmlElement(name = "WorkBlock")
    protected String workBlock;
    @XmlElement(name = "WorkZipCode")
    protected String workZipCode;
    @XmlElement(name = "WorkCity")
    protected String workCity;
    @XmlElement(name = "WorkCounty")
    protected String workCounty;
    @XmlElement(name = "WorkCountryCode")
    protected String workCountryCode;
    @XmlElement(name = "WorkStateCode")
    protected String workStateCode;
    @XmlElement(name = "Manager")
    protected Long manager;
    @XmlElement(name = "ApplicationUserID")
    protected Long applicationUserID;
    @XmlElement(name = "SalesPersonCode")
    protected Long salesPersonCode;
    @XmlElement(name = "OfficePhone")
    protected String officePhone;
    @XmlElement(name = "OfficeExtension")
    protected String officeExtension;
    @XmlElement(name = "MobilePhone")
    protected String mobilePhone;
    @XmlElement(name = "Pager")
    protected String pager;
    @XmlElement(name = "HomePhone")
    protected String homePhone;
    @XmlElement(name = "Fax")
    protected String fax;
    protected String eMail;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "StatusCode")
    protected Long statusCode;
    @XmlElement(name = "Salary")
    protected Double salary;
    @XmlElement(name = "SalaryUnit")
    protected String salaryUnit;
    @XmlElement(name = "EmployeeCosts")
    protected Double employeeCosts;
    @XmlElement(name = "EmployeeCostUnit")
    protected String employeeCostUnit;
    @XmlElement(name = "TerminationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminationDate;
    @XmlElement(name = "TreminationReason")
    protected Long treminationReason;
    @XmlElement(name = "BankCode")
    protected String bankCode;
    @XmlElement(name = "BankBranch")
    protected String bankBranch;
    @XmlElement(name = "BankBranchNum")
    protected String bankBranchNum;
    @XmlElement(name = "BankAccount")
    protected String bankAccount;
    @XmlElement(name = "HomeStreet")
    protected String homeStreet;
    @XmlElement(name = "HomeBlock")
    protected String homeBlock;
    @XmlElement(name = "HomeZipCode")
    protected String homeZipCode;
    @XmlElement(name = "HomeCity")
    protected String homeCity;
    @XmlElement(name = "HomeCounty")
    protected String homeCounty;
    @XmlElement(name = "HomeCountry")
    protected String homeCountry;
    @XmlElement(name = "HomeState")
    protected String homeState;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "CountryOfBirth")
    protected String countryOfBirth;
    @XmlElement(name = "MartialStatus")
    protected String martialStatus;
    @XmlElement(name = "NumOfChildren")
    protected Long numOfChildren;
    @XmlElement(name = "IdNumber")
    protected String idNumber;
    @XmlElement(name = "CitizenshipCountryCode")
    protected String citizenshipCountryCode;
    @XmlElement(name = "PassportNumber")
    protected String passportNumber;
    @XmlElement(name = "PassportExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar passportExpirationDate;
    @XmlElement(name = "Picture")
    protected String picture;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "SalaryCurrency")
    protected String salaryCurrency;
    @XmlElement(name = "EmployeeCostsCurrency")
    protected String employeeCostsCurrency;
    @XmlElement(name = "WorkBuildingFloorRoom")
    protected String workBuildingFloorRoom;
    @XmlElement(name = "HomeBuildingFloorRoom")
    protected String homeBuildingFloorRoom;
    @XmlElement(name = "Position")
    protected Long position;
    @XmlElement(name = "AttachmentEntry")
    protected Long attachmentEntry;
    @XmlElement(name = "CostCenterCode")
    protected String costCenterCode;
    @XmlElement(name = "CompanyNumber")
    protected String companyNumber;
    @XmlElement(name = "VacationPreviousYear")
    protected Long vacationPreviousYear;
    @XmlElement(name = "VacationCurrentYear")
    protected Long vacationCurrentYear;
    @XmlElement(name = "MunicipalityKey")
    protected String municipalityKey;
    @XmlElement(name = "TaxClass")
    protected String taxClass;
    @XmlElement(name = "IncomeTaxLiability")
    protected String incomeTaxLiability;
    @XmlElement(name = "Religion")
    protected String religion;
    @XmlElement(name = "PartnerReligion")
    protected String partnerReligion;
    @XmlElement(name = "ExemptionAmount")
    protected Double exemptionAmount;
    @XmlElement(name = "ExemptionUnit")
    protected String exemptionUnit;
    @XmlElement(name = "ExemptionCurrency")
    protected String exemptionCurrency;
    @XmlElement(name = "AdditionalAmount")
    protected Double additionalAmount;
    @XmlElement(name = "AdditionalUnit")
    protected String additionalUnit;
    @XmlElement(name = "AdditionalCurrency")
    protected String additionalCurrency;
    @XmlElement(name = "TaxOfficeName")
    protected String taxOfficeName;
    @XmlElement(name = "TaxOfficeNumber")
    protected String taxOfficeNumber;
    @XmlElement(name = "HealthInsuranceName")
    protected String healthInsuranceName;
    @XmlElement(name = "HealthInsuranceCode")
    protected String healthInsuranceCode;
    @XmlElement(name = "HealthInsuranceType")
    protected String healthInsuranceType;
    @XmlElement(name = "SocialInsuranceNumber")
    protected String socialInsuranceNumber;
    @XmlElement(name = "ProfessionStatus")
    protected String professionStatus;
    @XmlElement(name = "EducationStatus")
    protected String educationStatus;
    @XmlElement(name = "PersonGroup")
    protected String personGroup;
    @XmlElement(name = "JobTitleCode")
    protected String jobTitleCode;
    @XmlElement(name = "BankCodeForDATEV")
    protected String bankCodeForDATEV;
    @XmlElement(name = "DeviatingBankAccountOwner")
    protected String deviatingBankAccountOwner;
    @XmlElement(name = "SpouseFirstName")
    protected String spouseFirstName;
    @XmlElement(name = "SpouseSurname")
    protected String spouseSurname;
    @XmlElement(name = "ExternalEmployeeNumber")
    protected String externalEmployeeNumber;
    @XmlElement(name = "BirthPlace")
    protected String birthPlace;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;
    @XmlElement(name = "STDCode")
    protected Long stdCode;
    @XmlElement(name = "CPF")
    protected String cpf;
    @XmlElement(name = "CRCNumber")
    protected String crcNumber;
    @XmlElement(name = "AccountantResponsible")
    protected String accountantResponsible;
    @XmlElement(name = "LegalRepresentative")
    protected String legalRepresentative;
    @XmlElement(name = "DIRFResponsible")
    protected String dirfResponsible;
    @XmlElement(name = "CRCState")
    protected String crcState;
    @XmlElement(name = "Active")
    protected String active;
    @XmlElement(name = "IDType")
    protected String idType;
    @XmlElement(name = "BPLID")
    protected Long bplid;
    @XmlElement(name = "PassportIssueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar passportIssueDate;
    @XmlElement(name = "PassportIssuer")
    protected String passportIssuer;
    @XmlElement(name = "QualificationCode")
    protected String qualificationCode;
    @XmlElement(name = "PRWebAccess")
    protected String prWebAccess;
    @XmlElement(name = "PreviousPRWebAccess")
    protected String previousPRWebAccess;
    @XmlElement(name = "EmployeeAbsenceInfoLines")
    protected EmployeeInfo.EmployeeAbsenceInfoLines employeeAbsenceInfoLines;
    @XmlElement(name = "EmployeeEducationInfoLines")
    protected EmployeeInfo.EmployeeEducationInfoLines employeeEducationInfoLines;
    @XmlElement(name = "EmployeeReviewsInfoLines")
    protected EmployeeInfo.EmployeeReviewsInfoLines employeeReviewsInfoLines;
    @XmlElement(name = "EmployeePreviousEmpoymentInfoLines")
    protected EmployeeInfo.EmployeePreviousEmpoymentInfoLines employeePreviousEmpoymentInfoLines;
    @XmlElement(name = "EmployeeRolesInfoLines")
    protected EmployeeInfo.EmployeeRolesInfoLines employeeRolesInfoLines;
    @XmlElement(name = "EmployeeSavingsPaymentInfoLines")
    protected EmployeeInfo.EmployeeSavingsPaymentInfoLines employeeSavingsPaymentInfoLines;

    /**
     * Obtiene el valor de la propiedad employeeID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmployeeID() {
        return employeeID;
    }

    /**
     * Define el valor de la propiedad employeeID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmployeeID(Long value) {
        this.employeeID = value;
    }

    /**
     * Obtiene el valor de la propiedad lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define el valor de la propiedad lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtiene el valor de la propiedad firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Define el valor de la propiedad firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Obtiene el valor de la propiedad middleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Define el valor de la propiedad middleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Obtiene el valor de la propiedad gender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Define el valor de la propiedad gender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Obtiene el valor de la propiedad jobTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Define el valor de la propiedad jobTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Obtiene el valor de la propiedad employeeType.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmployeeType() {
        return employeeType;
    }

    /**
     * Define el valor de la propiedad employeeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmployeeType(Long value) {
        this.employeeType = value;
    }

    /**
     * Obtiene el valor de la propiedad department.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDepartment() {
        return department;
    }

    /**
     * Define el valor de la propiedad department.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDepartment(Long value) {
        this.department = value;
    }

    /**
     * Obtiene el valor de la propiedad branch.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBranch() {
        return branch;
    }

    /**
     * Define el valor de la propiedad branch.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBranch(Long value) {
        this.branch = value;
    }

    /**
     * Obtiene el valor de la propiedad workStreet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkStreet() {
        return workStreet;
    }

    /**
     * Define el valor de la propiedad workStreet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkStreet(String value) {
        this.workStreet = value;
    }

    /**
     * Obtiene el valor de la propiedad workBlock.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkBlock() {
        return workBlock;
    }

    /**
     * Define el valor de la propiedad workBlock.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkBlock(String value) {
        this.workBlock = value;
    }

    /**
     * Obtiene el valor de la propiedad workZipCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkZipCode() {
        return workZipCode;
    }

    /**
     * Define el valor de la propiedad workZipCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkZipCode(String value) {
        this.workZipCode = value;
    }

    /**
     * Obtiene el valor de la propiedad workCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkCity() {
        return workCity;
    }

    /**
     * Define el valor de la propiedad workCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkCity(String value) {
        this.workCity = value;
    }

    /**
     * Obtiene el valor de la propiedad workCounty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkCounty() {
        return workCounty;
    }

    /**
     * Define el valor de la propiedad workCounty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkCounty(String value) {
        this.workCounty = value;
    }

    /**
     * Obtiene el valor de la propiedad workCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkCountryCode() {
        return workCountryCode;
    }

    /**
     * Define el valor de la propiedad workCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkCountryCode(String value) {
        this.workCountryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad workStateCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkStateCode() {
        return workStateCode;
    }

    /**
     * Define el valor de la propiedad workStateCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkStateCode(String value) {
        this.workStateCode = value;
    }

    /**
     * Obtiene el valor de la propiedad manager.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManager() {
        return manager;
    }

    /**
     * Define el valor de la propiedad manager.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManager(Long value) {
        this.manager = value;
    }

    /**
     * Obtiene el valor de la propiedad applicationUserID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationUserID() {
        return applicationUserID;
    }

    /**
     * Define el valor de la propiedad applicationUserID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationUserID(Long value) {
        this.applicationUserID = value;
    }

    /**
     * Obtiene el valor de la propiedad salesPersonCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesPersonCode() {
        return salesPersonCode;
    }

    /**
     * Define el valor de la propiedad salesPersonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesPersonCode(Long value) {
        this.salesPersonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad officePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * Define el valor de la propiedad officePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhone(String value) {
        this.officePhone = value;
    }

    /**
     * Obtiene el valor de la propiedad officeExtension.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeExtension() {
        return officeExtension;
    }

    /**
     * Define el valor de la propiedad officeExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeExtension(String value) {
        this.officeExtension = value;
    }

    /**
     * Obtiene el valor de la propiedad mobilePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Define el valor de la propiedad mobilePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Obtiene el valor de la propiedad pager.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPager() {
        return pager;
    }

    /**
     * Define el valor de la propiedad pager.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPager(String value) {
        this.pager = value;
    }

    /**
     * Obtiene el valor de la propiedad homePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Define el valor de la propiedad homePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Obtiene el valor de la propiedad fax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Define el valor de la propiedad fax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Obtiene el valor de la propiedad eMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Define el valor de la propiedad eMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad statusCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatusCode() {
        return statusCode;
    }

    /**
     * Define el valor de la propiedad statusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatusCode(Long value) {
        this.statusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad salary.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * Define el valor de la propiedad salary.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalary(Double value) {
        this.salary = value;
    }

    /**
     * Obtiene el valor de la propiedad salaryUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaryUnit() {
        return salaryUnit;
    }

    /**
     * Define el valor de la propiedad salaryUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaryUnit(String value) {
        this.salaryUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad employeeCosts.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEmployeeCosts() {
        return employeeCosts;
    }

    /**
     * Define el valor de la propiedad employeeCosts.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEmployeeCosts(Double value) {
        this.employeeCosts = value;
    }

    /**
     * Obtiene el valor de la propiedad employeeCostUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeCostUnit() {
        return employeeCostUnit;
    }

    /**
     * Define el valor de la propiedad employeeCostUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeCostUnit(String value) {
        this.employeeCostUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad terminationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationDate() {
        return terminationDate;
    }

    /**
     * Define el valor de la propiedad terminationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminationDate(XMLGregorianCalendar value) {
        this.terminationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad treminationReason.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTreminationReason() {
        return treminationReason;
    }

    /**
     * Define el valor de la propiedad treminationReason.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTreminationReason(Long value) {
        this.treminationReason = value;
    }

    /**
     * Obtiene el valor de la propiedad bankCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Define el valor de la propiedad bankCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Obtiene el valor de la propiedad bankBranch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranch() {
        return bankBranch;
    }

    /**
     * Define el valor de la propiedad bankBranch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranch(String value) {
        this.bankBranch = value;
    }

    /**
     * Obtiene el valor de la propiedad bankBranchNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranchNum() {
        return bankBranchNum;
    }

    /**
     * Define el valor de la propiedad bankBranchNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranchNum(String value) {
        this.bankBranchNum = value;
    }

    /**
     * Obtiene el valor de la propiedad bankAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * Define el valor de la propiedad bankAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccount(String value) {
        this.bankAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad homeStreet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeStreet() {
        return homeStreet;
    }

    /**
     * Define el valor de la propiedad homeStreet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeStreet(String value) {
        this.homeStreet = value;
    }

    /**
     * Obtiene el valor de la propiedad homeBlock.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeBlock() {
        return homeBlock;
    }

    /**
     * Define el valor de la propiedad homeBlock.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeBlock(String value) {
        this.homeBlock = value;
    }

    /**
     * Obtiene el valor de la propiedad homeZipCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeZipCode() {
        return homeZipCode;
    }

    /**
     * Define el valor de la propiedad homeZipCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeZipCode(String value) {
        this.homeZipCode = value;
    }

    /**
     * Obtiene el valor de la propiedad homeCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeCity() {
        return homeCity;
    }

    /**
     * Define el valor de la propiedad homeCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeCity(String value) {
        this.homeCity = value;
    }

    /**
     * Obtiene el valor de la propiedad homeCounty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeCounty() {
        return homeCounty;
    }

    /**
     * Define el valor de la propiedad homeCounty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeCounty(String value) {
        this.homeCounty = value;
    }

    /**
     * Obtiene el valor de la propiedad homeCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeCountry() {
        return homeCountry;
    }

    /**
     * Define el valor de la propiedad homeCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeCountry(String value) {
        this.homeCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad homeState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeState() {
        return homeState;
    }

    /**
     * Define el valor de la propiedad homeState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeState(String value) {
        this.homeState = value;
    }

    /**
     * Obtiene el valor de la propiedad dateOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Define el valor de la propiedad dateOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Obtiene el valor de la propiedad countryOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * Define el valor de la propiedad countryOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfBirth(String value) {
        this.countryOfBirth = value;
    }

    /**
     * Obtiene el valor de la propiedad martialStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMartialStatus() {
        return martialStatus;
    }

    /**
     * Define el valor de la propiedad martialStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMartialStatus(String value) {
        this.martialStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad numOfChildren.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumOfChildren() {
        return numOfChildren;
    }

    /**
     * Define el valor de la propiedad numOfChildren.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumOfChildren(Long value) {
        this.numOfChildren = value;
    }

    /**
     * Obtiene el valor de la propiedad idNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Define el valor de la propiedad idNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad citizenshipCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenshipCountryCode() {
        return citizenshipCountryCode;
    }

    /**
     * Define el valor de la propiedad citizenshipCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenshipCountryCode(String value) {
        this.citizenshipCountryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad passportNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Define el valor de la propiedad passportNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad passportExpirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPassportExpirationDate() {
        return passportExpirationDate;
    }

    /**
     * Define el valor de la propiedad passportExpirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPassportExpirationDate(XMLGregorianCalendar value) {
        this.passportExpirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad picture.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Define el valor de la propiedad picture.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicture(String value) {
        this.picture = value;
    }

    /**
     * Obtiene el valor de la propiedad remarks.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Define el valor de la propiedad remarks.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Obtiene el valor de la propiedad salaryCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaryCurrency() {
        return salaryCurrency;
    }

    /**
     * Define el valor de la propiedad salaryCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaryCurrency(String value) {
        this.salaryCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad employeeCostsCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeCostsCurrency() {
        return employeeCostsCurrency;
    }

    /**
     * Define el valor de la propiedad employeeCostsCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeCostsCurrency(String value) {
        this.employeeCostsCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad workBuildingFloorRoom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkBuildingFloorRoom() {
        return workBuildingFloorRoom;
    }

    /**
     * Define el valor de la propiedad workBuildingFloorRoom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkBuildingFloorRoom(String value) {
        this.workBuildingFloorRoom = value;
    }

    /**
     * Obtiene el valor de la propiedad homeBuildingFloorRoom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeBuildingFloorRoom() {
        return homeBuildingFloorRoom;
    }

    /**
     * Define el valor de la propiedad homeBuildingFloorRoom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeBuildingFloorRoom(String value) {
        this.homeBuildingFloorRoom = value;
    }

    /**
     * Obtiene el valor de la propiedad position.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPosition() {
        return position;
    }

    /**
     * Define el valor de la propiedad position.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPosition(Long value) {
        this.position = value;
    }

    /**
     * Obtiene el valor de la propiedad attachmentEntry.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAttachmentEntry() {
        return attachmentEntry;
    }

    /**
     * Define el valor de la propiedad attachmentEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAttachmentEntry(Long value) {
        this.attachmentEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad costCenterCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenterCode() {
        return costCenterCode;
    }

    /**
     * Define el valor de la propiedad costCenterCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenterCode(String value) {
        this.costCenterCode = value;
    }

    /**
     * Obtiene el valor de la propiedad companyNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNumber() {
        return companyNumber;
    }

    /**
     * Define el valor de la propiedad companyNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNumber(String value) {
        this.companyNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad vacationPreviousYear.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVacationPreviousYear() {
        return vacationPreviousYear;
    }

    /**
     * Define el valor de la propiedad vacationPreviousYear.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVacationPreviousYear(Long value) {
        this.vacationPreviousYear = value;
    }

    /**
     * Obtiene el valor de la propiedad vacationCurrentYear.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVacationCurrentYear() {
        return vacationCurrentYear;
    }

    /**
     * Define el valor de la propiedad vacationCurrentYear.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVacationCurrentYear(Long value) {
        this.vacationCurrentYear = value;
    }

    /**
     * Obtiene el valor de la propiedad municipalityKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalityKey() {
        return municipalityKey;
    }

    /**
     * Define el valor de la propiedad municipalityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalityKey(String value) {
        this.municipalityKey = value;
    }

    /**
     * Obtiene el valor de la propiedad taxClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass() {
        return taxClass;
    }

    /**
     * Define el valor de la propiedad taxClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass(String value) {
        this.taxClass = value;
    }

    /**
     * Obtiene el valor de la propiedad incomeTaxLiability.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeTaxLiability() {
        return incomeTaxLiability;
    }

    /**
     * Define el valor de la propiedad incomeTaxLiability.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeTaxLiability(String value) {
        this.incomeTaxLiability = value;
    }

    /**
     * Obtiene el valor de la propiedad religion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligion() {
        return religion;
    }

    /**
     * Define el valor de la propiedad religion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligion(String value) {
        this.religion = value;
    }

    /**
     * Obtiene el valor de la propiedad partnerReligion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerReligion() {
        return partnerReligion;
    }

    /**
     * Define el valor de la propiedad partnerReligion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerReligion(String value) {
        this.partnerReligion = value;
    }

    /**
     * Obtiene el valor de la propiedad exemptionAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExemptionAmount() {
        return exemptionAmount;
    }

    /**
     * Define el valor de la propiedad exemptionAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExemptionAmount(Double value) {
        this.exemptionAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad exemptionUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptionUnit() {
        return exemptionUnit;
    }

    /**
     * Define el valor de la propiedad exemptionUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptionUnit(String value) {
        this.exemptionUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad exemptionCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptionCurrency() {
        return exemptionCurrency;
    }

    /**
     * Define el valor de la propiedad exemptionCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptionCurrency(String value) {
        this.exemptionCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdditionalAmount() {
        return additionalAmount;
    }

    /**
     * Define el valor de la propiedad additionalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdditionalAmount(Double value) {
        this.additionalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalUnit() {
        return additionalUnit;
    }

    /**
     * Define el valor de la propiedad additionalUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalUnit(String value) {
        this.additionalUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalCurrency() {
        return additionalCurrency;
    }

    /**
     * Define el valor de la propiedad additionalCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalCurrency(String value) {
        this.additionalCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad taxOfficeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxOfficeName() {
        return taxOfficeName;
    }

    /**
     * Define el valor de la propiedad taxOfficeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxOfficeName(String value) {
        this.taxOfficeName = value;
    }

    /**
     * Obtiene el valor de la propiedad taxOfficeNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxOfficeNumber() {
        return taxOfficeNumber;
    }

    /**
     * Define el valor de la propiedad taxOfficeNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxOfficeNumber(String value) {
        this.taxOfficeNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad healthInsuranceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthInsuranceName() {
        return healthInsuranceName;
    }

    /**
     * Define el valor de la propiedad healthInsuranceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthInsuranceName(String value) {
        this.healthInsuranceName = value;
    }

    /**
     * Obtiene el valor de la propiedad healthInsuranceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthInsuranceCode() {
        return healthInsuranceCode;
    }

    /**
     * Define el valor de la propiedad healthInsuranceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthInsuranceCode(String value) {
        this.healthInsuranceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad healthInsuranceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthInsuranceType() {
        return healthInsuranceType;
    }

    /**
     * Define el valor de la propiedad healthInsuranceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthInsuranceType(String value) {
        this.healthInsuranceType = value;
    }

    /**
     * Obtiene el valor de la propiedad socialInsuranceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialInsuranceNumber() {
        return socialInsuranceNumber;
    }

    /**
     * Define el valor de la propiedad socialInsuranceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialInsuranceNumber(String value) {
        this.socialInsuranceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad professionStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionStatus() {
        return professionStatus;
    }

    /**
     * Define el valor de la propiedad professionStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionStatus(String value) {
        this.professionStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad educationStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationStatus() {
        return educationStatus;
    }

    /**
     * Define el valor de la propiedad educationStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationStatus(String value) {
        this.educationStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad personGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonGroup() {
        return personGroup;
    }

    /**
     * Define el valor de la propiedad personGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonGroup(String value) {
        this.personGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad jobTitleCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitleCode() {
        return jobTitleCode;
    }

    /**
     * Define el valor de la propiedad jobTitleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitleCode(String value) {
        this.jobTitleCode = value;
    }

    /**
     * Obtiene el valor de la propiedad bankCodeForDATEV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCodeForDATEV() {
        return bankCodeForDATEV;
    }

    /**
     * Define el valor de la propiedad bankCodeForDATEV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCodeForDATEV(String value) {
        this.bankCodeForDATEV = value;
    }

    /**
     * Obtiene el valor de la propiedad deviatingBankAccountOwner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviatingBankAccountOwner() {
        return deviatingBankAccountOwner;
    }

    /**
     * Define el valor de la propiedad deviatingBankAccountOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviatingBankAccountOwner(String value) {
        this.deviatingBankAccountOwner = value;
    }

    /**
     * Obtiene el valor de la propiedad spouseFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseFirstName() {
        return spouseFirstName;
    }

    /**
     * Define el valor de la propiedad spouseFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseFirstName(String value) {
        this.spouseFirstName = value;
    }

    /**
     * Obtiene el valor de la propiedad spouseSurname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseSurname() {
        return spouseSurname;
    }

    /**
     * Define el valor de la propiedad spouseSurname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseSurname(String value) {
        this.spouseSurname = value;
    }

    /**
     * Obtiene el valor de la propiedad externalEmployeeNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalEmployeeNumber() {
        return externalEmployeeNumber;
    }

    /**
     * Define el valor de la propiedad externalEmployeeNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalEmployeeNumber(String value) {
        this.externalEmployeeNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad birthPlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Define el valor de la propiedad birthPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Define el valor de la propiedad paymentMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad stdCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSTDCode() {
        return stdCode;
    }

    /**
     * Define el valor de la propiedad stdCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSTDCode(Long value) {
        this.stdCode = value;
    }

    /**
     * Obtiene el valor de la propiedad cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * Define el valor de la propiedad cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPF(String value) {
        this.cpf = value;
    }

    /**
     * Obtiene el valor de la propiedad crcNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRCNumber() {
        return crcNumber;
    }

    /**
     * Define el valor de la propiedad crcNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRCNumber(String value) {
        this.crcNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad accountantResponsible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountantResponsible() {
        return accountantResponsible;
    }

    /**
     * Define el valor de la propiedad accountantResponsible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountantResponsible(String value) {
        this.accountantResponsible = value;
    }

    /**
     * Obtiene el valor de la propiedad legalRepresentative.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    /**
     * Define el valor de la propiedad legalRepresentative.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalRepresentative(String value) {
        this.legalRepresentative = value;
    }

    /**
     * Obtiene el valor de la propiedad dirfResponsible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRFResponsible() {
        return dirfResponsible;
    }

    /**
     * Define el valor de la propiedad dirfResponsible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRFResponsible(String value) {
        this.dirfResponsible = value;
    }

    /**
     * Obtiene el valor de la propiedad crcState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRCState() {
        return crcState;
    }

    /**
     * Define el valor de la propiedad crcState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRCState(String value) {
        this.crcState = value;
    }

    /**
     * Obtiene el valor de la propiedad active.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        return active;
    }

    /**
     * Define el valor de la propiedad active.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
    }

    /**
     * Obtiene el valor de la propiedad idType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDType() {
        return idType;
    }

    /**
     * Define el valor de la propiedad idType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDType(String value) {
        this.idType = value;
    }

    /**
     * Obtiene el valor de la propiedad bplid.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBPLID() {
        return bplid;
    }

    /**
     * Define el valor de la propiedad bplid.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBPLID(Long value) {
        this.bplid = value;
    }

    /**
     * Obtiene el valor de la propiedad passportIssueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPassportIssueDate() {
        return passportIssueDate;
    }

    /**
     * Define el valor de la propiedad passportIssueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPassportIssueDate(XMLGregorianCalendar value) {
        this.passportIssueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad passportIssuer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportIssuer() {
        return passportIssuer;
    }

    /**
     * Define el valor de la propiedad passportIssuer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportIssuer(String value) {
        this.passportIssuer = value;
    }

    /**
     * Obtiene el valor de la propiedad qualificationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationCode() {
        return qualificationCode;
    }

    /**
     * Define el valor de la propiedad qualificationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationCode(String value) {
        this.qualificationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad prWebAccess.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRWebAccess() {
        return prWebAccess;
    }

    /**
     * Define el valor de la propiedad prWebAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRWebAccess(String value) {
        this.prWebAccess = value;
    }

    /**
     * Obtiene el valor de la propiedad previousPRWebAccess.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousPRWebAccess() {
        return previousPRWebAccess;
    }

    /**
     * Define el valor de la propiedad previousPRWebAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousPRWebAccess(String value) {
        this.previousPRWebAccess = value;
    }

    /**
     * Obtiene el valor de la propiedad employeeAbsenceInfoLines.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeInfo.EmployeeAbsenceInfoLines }
     *     
     */
    public EmployeeInfo.EmployeeAbsenceInfoLines getEmployeeAbsenceInfoLines() {
        return employeeAbsenceInfoLines;
    }

    /**
     * Define el valor de la propiedad employeeAbsenceInfoLines.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeInfo.EmployeeAbsenceInfoLines }
     *     
     */
    public void setEmployeeAbsenceInfoLines(EmployeeInfo.EmployeeAbsenceInfoLines value) {
        this.employeeAbsenceInfoLines = value;
    }

    /**
     * Obtiene el valor de la propiedad employeeEducationInfoLines.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeInfo.EmployeeEducationInfoLines }
     *     
     */
    public EmployeeInfo.EmployeeEducationInfoLines getEmployeeEducationInfoLines() {
        return employeeEducationInfoLines;
    }

    /**
     * Define el valor de la propiedad employeeEducationInfoLines.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeInfo.EmployeeEducationInfoLines }
     *     
     */
    public void setEmployeeEducationInfoLines(EmployeeInfo.EmployeeEducationInfoLines value) {
        this.employeeEducationInfoLines = value;
    }

    /**
     * Obtiene el valor de la propiedad employeeReviewsInfoLines.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeInfo.EmployeeReviewsInfoLines }
     *     
     */
    public EmployeeInfo.EmployeeReviewsInfoLines getEmployeeReviewsInfoLines() {
        return employeeReviewsInfoLines;
    }

    /**
     * Define el valor de la propiedad employeeReviewsInfoLines.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeInfo.EmployeeReviewsInfoLines }
     *     
     */
    public void setEmployeeReviewsInfoLines(EmployeeInfo.EmployeeReviewsInfoLines value) {
        this.employeeReviewsInfoLines = value;
    }

    /**
     * Obtiene el valor de la propiedad employeePreviousEmpoymentInfoLines.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeInfo.EmployeePreviousEmpoymentInfoLines }
     *     
     */
    public EmployeeInfo.EmployeePreviousEmpoymentInfoLines getEmployeePreviousEmpoymentInfoLines() {
        return employeePreviousEmpoymentInfoLines;
    }

    /**
     * Define el valor de la propiedad employeePreviousEmpoymentInfoLines.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeInfo.EmployeePreviousEmpoymentInfoLines }
     *     
     */
    public void setEmployeePreviousEmpoymentInfoLines(EmployeeInfo.EmployeePreviousEmpoymentInfoLines value) {
        this.employeePreviousEmpoymentInfoLines = value;
    }

    /**
     * Obtiene el valor de la propiedad employeeRolesInfoLines.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeInfo.EmployeeRolesInfoLines }
     *     
     */
    public EmployeeInfo.EmployeeRolesInfoLines getEmployeeRolesInfoLines() {
        return employeeRolesInfoLines;
    }

    /**
     * Define el valor de la propiedad employeeRolesInfoLines.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeInfo.EmployeeRolesInfoLines }
     *     
     */
    public void setEmployeeRolesInfoLines(EmployeeInfo.EmployeeRolesInfoLines value) {
        this.employeeRolesInfoLines = value;
    }

    /**
     * Obtiene el valor de la propiedad employeeSavingsPaymentInfoLines.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeInfo.EmployeeSavingsPaymentInfoLines }
     *     
     */
    public EmployeeInfo.EmployeeSavingsPaymentInfoLines getEmployeeSavingsPaymentInfoLines() {
        return employeeSavingsPaymentInfoLines;
    }

    /**
     * Define el valor de la propiedad employeeSavingsPaymentInfoLines.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeInfo.EmployeeSavingsPaymentInfoLines }
     *     
     */
    public void setEmployeeSavingsPaymentInfoLines(EmployeeInfo.EmployeeSavingsPaymentInfoLines value) {
        this.employeeSavingsPaymentInfoLines = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EmployeeAbsenceInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ApprovedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ConfirmerNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "employeeAbsenceInfo"
    })
    public static class EmployeeAbsenceInfoLines {

        @XmlElement(name = "EmployeeAbsenceInfo")
        protected List<EmployeeInfo.EmployeeAbsenceInfoLines.EmployeeAbsenceInfo> employeeAbsenceInfo;

        /**
         * Gets the value of the employeeAbsenceInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employeeAbsenceInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmployeeAbsenceInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EmployeeInfo.EmployeeAbsenceInfoLines.EmployeeAbsenceInfo }
         * 
         * 
         */
        public List<EmployeeInfo.EmployeeAbsenceInfoLines.EmployeeAbsenceInfo> getEmployeeAbsenceInfo() {
            if (employeeAbsenceInfo == null) {
                employeeAbsenceInfo = new ArrayList<EmployeeInfo.EmployeeAbsenceInfoLines.EmployeeAbsenceInfo>();
            }
            return this.employeeAbsenceInfo;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ApprovedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ConfirmerNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class EmployeeAbsenceInfo {

            @XmlElement(name = "EmployeeID")
            protected Long employeeID;
            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "FromDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar fromDate;
            @XmlElement(name = "ToDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar toDate;
            @XmlElement(name = "Reason")
            protected String reason;
            @XmlElement(name = "ApprovedBy")
            protected String approvedBy;
            @XmlElement(name = "ConfirmerNumber")
            protected Long confirmerNumber;

            /**
             * Obtiene el valor de la propiedad employeeID.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getEmployeeID() {
                return employeeID;
            }

            /**
             * Define el valor de la propiedad employeeID.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setEmployeeID(Long value) {
                this.employeeID = value;
            }

            /**
             * Obtiene el valor de la propiedad lineNum.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getLineNum() {
                return lineNum;
            }

            /**
             * Define el valor de la propiedad lineNum.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setLineNum(Long value) {
                this.lineNum = value;
            }

            /**
             * Obtiene el valor de la propiedad fromDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFromDate() {
                return fromDate;
            }

            /**
             * Define el valor de la propiedad fromDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFromDate(XMLGregorianCalendar value) {
                this.fromDate = value;
            }

            /**
             * Obtiene el valor de la propiedad toDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getToDate() {
                return toDate;
            }

            /**
             * Define el valor de la propiedad toDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setToDate(XMLGregorianCalendar value) {
                this.toDate = value;
            }

            /**
             * Obtiene el valor de la propiedad reason.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReason() {
                return reason;
            }

            /**
             * Define el valor de la propiedad reason.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReason(String value) {
                this.reason = value;
            }

            /**
             * Obtiene el valor de la propiedad approvedBy.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApprovedBy() {
                return approvedBy;
            }

            /**
             * Define el valor de la propiedad approvedBy.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApprovedBy(String value) {
                this.approvedBy = value;
            }

            /**
             * Obtiene el valor de la propiedad confirmerNumber.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getConfirmerNumber() {
                return confirmerNumber;
            }

            /**
             * Define el valor de la propiedad confirmerNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setConfirmerNumber(Long value) {
                this.confirmerNumber = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EmployeeEducationInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="EmployeeNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="EducationType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Institute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Major" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Diploma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "employeeEducationInfo"
    })
    public static class EmployeeEducationInfoLines {

        @XmlElement(name = "EmployeeEducationInfo")
        protected List<EmployeeInfo.EmployeeEducationInfoLines.EmployeeEducationInfo> employeeEducationInfo;

        /**
         * Gets the value of the employeeEducationInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employeeEducationInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmployeeEducationInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EmployeeInfo.EmployeeEducationInfoLines.EmployeeEducationInfo }
         * 
         * 
         */
        public List<EmployeeInfo.EmployeeEducationInfoLines.EmployeeEducationInfo> getEmployeeEducationInfo() {
            if (employeeEducationInfo == null) {
                employeeEducationInfo = new ArrayList<EmployeeInfo.EmployeeEducationInfoLines.EmployeeEducationInfo>();
            }
            return this.employeeEducationInfo;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="EmployeeNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="EducationType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Institute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Major" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Diploma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class EmployeeEducationInfo {

            @XmlElement(name = "EmployeeNo")
            protected Long employeeNo;
            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "FromDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar fromDate;
            @XmlElement(name = "ToDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar toDate;
            @XmlElement(name = "EducationType")
            protected Long educationType;
            @XmlElement(name = "Institute")
            protected String institute;
            @XmlElement(name = "Major")
            protected String major;
            @XmlElement(name = "Diploma")
            protected String diploma;

            /**
             * Obtiene el valor de la propiedad employeeNo.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getEmployeeNo() {
                return employeeNo;
            }

            /**
             * Define el valor de la propiedad employeeNo.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setEmployeeNo(Long value) {
                this.employeeNo = value;
            }

            /**
             * Obtiene el valor de la propiedad lineNum.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getLineNum() {
                return lineNum;
            }

            /**
             * Define el valor de la propiedad lineNum.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setLineNum(Long value) {
                this.lineNum = value;
            }

            /**
             * Obtiene el valor de la propiedad fromDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFromDate() {
                return fromDate;
            }

            /**
             * Define el valor de la propiedad fromDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFromDate(XMLGregorianCalendar value) {
                this.fromDate = value;
            }

            /**
             * Obtiene el valor de la propiedad toDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getToDate() {
                return toDate;
            }

            /**
             * Define el valor de la propiedad toDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setToDate(XMLGregorianCalendar value) {
                this.toDate = value;
            }

            /**
             * Obtiene el valor de la propiedad educationType.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getEducationType() {
                return educationType;
            }

            /**
             * Define el valor de la propiedad educationType.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setEducationType(Long value) {
                this.educationType = value;
            }

            /**
             * Obtiene el valor de la propiedad institute.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInstitute() {
                return institute;
            }

            /**
             * Define el valor de la propiedad institute.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInstitute(String value) {
                this.institute = value;
            }

            /**
             * Obtiene el valor de la propiedad major.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMajor() {
                return major;
            }

            /**
             * Define el valor de la propiedad major.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMajor(String value) {
                this.major = value;
            }

            /**
             * Obtiene el valor de la propiedad diploma.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDiploma() {
                return diploma;
            }

            /**
             * Define el valor de la propiedad diploma.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDiploma(String value) {
                this.diploma = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EmployeePreviousEmpoymentInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="EmployeeNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="FromDtae" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="Employer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "employeePreviousEmpoymentInfo"
    })
    public static class EmployeePreviousEmpoymentInfoLines {

        @XmlElement(name = "EmployeePreviousEmpoymentInfo")
        protected List<EmployeeInfo.EmployeePreviousEmpoymentInfoLines.EmployeePreviousEmpoymentInfo> employeePreviousEmpoymentInfo;

        /**
         * Gets the value of the employeePreviousEmpoymentInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employeePreviousEmpoymentInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmployeePreviousEmpoymentInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EmployeeInfo.EmployeePreviousEmpoymentInfoLines.EmployeePreviousEmpoymentInfo }
         * 
         * 
         */
        public List<EmployeeInfo.EmployeePreviousEmpoymentInfoLines.EmployeePreviousEmpoymentInfo> getEmployeePreviousEmpoymentInfo() {
            if (employeePreviousEmpoymentInfo == null) {
                employeePreviousEmpoymentInfo = new ArrayList<EmployeeInfo.EmployeePreviousEmpoymentInfoLines.EmployeePreviousEmpoymentInfo>();
            }
            return this.employeePreviousEmpoymentInfo;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="EmployeeNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="FromDtae" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="Employer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class EmployeePreviousEmpoymentInfo {

            @XmlElement(name = "EmployeeNo")
            protected Long employeeNo;
            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "FromDtae")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar fromDtae;
            @XmlElement(name = "ToDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar toDate;
            @XmlElement(name = "Employer")
            protected String employer;
            @XmlElement(name = "Position")
            protected String position;
            @XmlElement(name = "Remarks")
            protected String remarks;

            /**
             * Obtiene el valor de la propiedad employeeNo.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getEmployeeNo() {
                return employeeNo;
            }

            /**
             * Define el valor de la propiedad employeeNo.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setEmployeeNo(Long value) {
                this.employeeNo = value;
            }

            /**
             * Obtiene el valor de la propiedad lineNum.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getLineNum() {
                return lineNum;
            }

            /**
             * Define el valor de la propiedad lineNum.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setLineNum(Long value) {
                this.lineNum = value;
            }

            /**
             * Obtiene el valor de la propiedad fromDtae.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFromDtae() {
                return fromDtae;
            }

            /**
             * Define el valor de la propiedad fromDtae.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFromDtae(XMLGregorianCalendar value) {
                this.fromDtae = value;
            }

            /**
             * Obtiene el valor de la propiedad toDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getToDate() {
                return toDate;
            }

            /**
             * Define el valor de la propiedad toDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setToDate(XMLGregorianCalendar value) {
                this.toDate = value;
            }

            /**
             * Obtiene el valor de la propiedad employer.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmployer() {
                return employer;
            }

            /**
             * Define el valor de la propiedad employer.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmployer(String value) {
                this.employer = value;
            }

            /**
             * Obtiene el valor de la propiedad position.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPosition() {
                return position;
            }

            /**
             * Define el valor de la propiedad position.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPosition(String value) {
                this.position = value;
            }

            /**
             * Obtiene el valor de la propiedad remarks.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemarks() {
                return remarks;
            }

            /**
             * Define el valor de la propiedad remarks.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemarks(String value) {
                this.remarks = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EmployeeReviewsInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="EmployeeNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="ReviewDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Manager" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "employeeReviewsInfo"
    })
    public static class EmployeeReviewsInfoLines {

        @XmlElement(name = "EmployeeReviewsInfo")
        protected List<EmployeeInfo.EmployeeReviewsInfoLines.EmployeeReviewsInfo> employeeReviewsInfo;

        /**
         * Gets the value of the employeeReviewsInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employeeReviewsInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmployeeReviewsInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EmployeeInfo.EmployeeReviewsInfoLines.EmployeeReviewsInfo }
         * 
         * 
         */
        public List<EmployeeInfo.EmployeeReviewsInfoLines.EmployeeReviewsInfo> getEmployeeReviewsInfo() {
            if (employeeReviewsInfo == null) {
                employeeReviewsInfo = new ArrayList<EmployeeInfo.EmployeeReviewsInfoLines.EmployeeReviewsInfo>();
            }
            return this.employeeReviewsInfo;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="EmployeeNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="ReviewDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Manager" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class EmployeeReviewsInfo {

            @XmlElement(name = "EmployeeNo")
            protected Long employeeNo;
            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "Date")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar date;
            @XmlElement(name = "ReviewDescription")
            protected String reviewDescription;
            @XmlElement(name = "Manager")
            protected Long manager;
            @XmlElement(name = "Grade")
            protected String grade;
            @XmlElement(name = "Remarks")
            protected String remarks;

            /**
             * Obtiene el valor de la propiedad employeeNo.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getEmployeeNo() {
                return employeeNo;
            }

            /**
             * Define el valor de la propiedad employeeNo.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setEmployeeNo(Long value) {
                this.employeeNo = value;
            }

            /**
             * Obtiene el valor de la propiedad lineNum.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getLineNum() {
                return lineNum;
            }

            /**
             * Define el valor de la propiedad lineNum.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setLineNum(Long value) {
                this.lineNum = value;
            }

            /**
             * Obtiene el valor de la propiedad date.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDate() {
                return date;
            }

            /**
             * Define el valor de la propiedad date.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDate(XMLGregorianCalendar value) {
                this.date = value;
            }

            /**
             * Obtiene el valor de la propiedad reviewDescription.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReviewDescription() {
                return reviewDescription;
            }

            /**
             * Define el valor de la propiedad reviewDescription.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReviewDescription(String value) {
                this.reviewDescription = value;
            }

            /**
             * Obtiene el valor de la propiedad manager.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getManager() {
                return manager;
            }

            /**
             * Define el valor de la propiedad manager.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setManager(Long value) {
                this.manager = value;
            }

            /**
             * Obtiene el valor de la propiedad grade.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGrade() {
                return grade;
            }

            /**
             * Define el valor de la propiedad grade.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGrade(String value) {
                this.grade = value;
            }

            /**
             * Obtiene el valor de la propiedad remarks.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemarks() {
                return remarks;
            }

            /**
             * Define el valor de la propiedad remarks.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemarks(String value) {
                this.remarks = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EmployeeRolesInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="RoleID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "employeeRolesInfo"
    })
    public static class EmployeeRolesInfoLines {

        @XmlElement(name = "EmployeeRolesInfo")
        protected List<EmployeeInfo.EmployeeRolesInfoLines.EmployeeRolesInfo> employeeRolesInfo;

        /**
         * Gets the value of the employeeRolesInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employeeRolesInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmployeeRolesInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EmployeeInfo.EmployeeRolesInfoLines.EmployeeRolesInfo }
         * 
         * 
         */
        public List<EmployeeInfo.EmployeeRolesInfoLines.EmployeeRolesInfo> getEmployeeRolesInfo() {
            if (employeeRolesInfo == null) {
                employeeRolesInfo = new ArrayList<EmployeeInfo.EmployeeRolesInfoLines.EmployeeRolesInfo>();
            }
            return this.employeeRolesInfo;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="RoleID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class EmployeeRolesInfo {

            @XmlElement(name = "EmployeeID")
            protected Long employeeID;
            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "RoleID")
            protected Long roleID;

            /**
             * Obtiene el valor de la propiedad employeeID.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getEmployeeID() {
                return employeeID;
            }

            /**
             * Define el valor de la propiedad employeeID.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setEmployeeID(Long value) {
                this.employeeID = value;
            }

            /**
             * Obtiene el valor de la propiedad lineNum.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getLineNum() {
                return lineNum;
            }

            /**
             * Define el valor de la propiedad lineNum.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setLineNum(Long value) {
                this.lineNum = value;
            }

            /**
             * Obtiene el valor de la propiedad roleID.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getRoleID() {
                return roleID;
            }

            /**
             * Define el valor de la propiedad roleID.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setRoleID(Long value) {
                this.roleID = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EmployeeSavingsPaymentInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ContractName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PaymentNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AN" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="ANcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AG" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AGcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Sequence" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="cs_Monthly"/>
     *                         &lt;enumeration value="cs_Quarterly"/>
     *                         &lt;enumeration value="cs_SemiAnnually"/>
     *                         &lt;enumeration value="cs_Yearly"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "employeeSavingsPaymentInfo"
    })
    public static class EmployeeSavingsPaymentInfoLines {

        @XmlElement(name = "EmployeeSavingsPaymentInfo")
        protected List<EmployeeInfo.EmployeeSavingsPaymentInfoLines.EmployeeSavingsPaymentInfo> employeeSavingsPaymentInfo;

        /**
         * Gets the value of the employeeSavingsPaymentInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employeeSavingsPaymentInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmployeeSavingsPaymentInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EmployeeInfo.EmployeeSavingsPaymentInfoLines.EmployeeSavingsPaymentInfo }
         * 
         * 
         */
        public List<EmployeeInfo.EmployeeSavingsPaymentInfoLines.EmployeeSavingsPaymentInfo> getEmployeeSavingsPaymentInfo() {
            if (employeeSavingsPaymentInfo == null) {
                employeeSavingsPaymentInfo = new ArrayList<EmployeeInfo.EmployeeSavingsPaymentInfoLines.EmployeeSavingsPaymentInfo>();
            }
            return this.employeeSavingsPaymentInfo;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="ContractName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PaymentNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AN" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="ANcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AG" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AGcurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Sequence" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="cs_Monthly"/>
         *               &lt;enumeration value="cs_Quarterly"/>
         *               &lt;enumeration value="cs_SemiAnnually"/>
         *               &lt;enumeration value="cs_Yearly"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class EmployeeSavingsPaymentInfo {

            @XmlElement(name = "EmployeeID")
            protected Long employeeID;
            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "ContractName")
            protected String contractName;
            @XmlElement(name = "PaymentNotes")
            protected String paymentNotes;
            @XmlElement(name = "AN")
            protected Double an;
            @XmlElement(name = "ANcurrency")
            protected String aNcurrency;
            @XmlElement(name = "AG")
            protected Double ag;
            @XmlElement(name = "AGcurrency")
            protected String aGcurrency;
            @XmlElement(name = "BankName")
            protected String bankName;
            @XmlElement(name = "BankCode")
            protected String bankCode;
            @XmlElement(name = "BankAccount")
            protected String bankAccount;
            @XmlElement(name = "Sequence")
            protected String sequence;

            /**
             * Obtiene el valor de la propiedad employeeID.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getEmployeeID() {
                return employeeID;
            }

            /**
             * Define el valor de la propiedad employeeID.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setEmployeeID(Long value) {
                this.employeeID = value;
            }

            /**
             * Obtiene el valor de la propiedad lineNum.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getLineNum() {
                return lineNum;
            }

            /**
             * Define el valor de la propiedad lineNum.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setLineNum(Long value) {
                this.lineNum = value;
            }

            /**
             * Obtiene el valor de la propiedad contractName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContractName() {
                return contractName;
            }

            /**
             * Define el valor de la propiedad contractName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContractName(String value) {
                this.contractName = value;
            }

            /**
             * Obtiene el valor de la propiedad paymentNotes.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentNotes() {
                return paymentNotes;
            }

            /**
             * Define el valor de la propiedad paymentNotes.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentNotes(String value) {
                this.paymentNotes = value;
            }

            /**
             * Obtiene el valor de la propiedad an.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAN() {
                return an;
            }

            /**
             * Define el valor de la propiedad an.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAN(Double value) {
                this.an = value;
            }

            /**
             * Obtiene el valor de la propiedad aNcurrency.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getANcurrency() {
                return aNcurrency;
            }

            /**
             * Define el valor de la propiedad aNcurrency.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setANcurrency(String value) {
                this.aNcurrency = value;
            }

            /**
             * Obtiene el valor de la propiedad ag.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAG() {
                return ag;
            }

            /**
             * Define el valor de la propiedad ag.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAG(Double value) {
                this.ag = value;
            }

            /**
             * Obtiene el valor de la propiedad aGcurrency.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAGcurrency() {
                return aGcurrency;
            }

            /**
             * Define el valor de la propiedad aGcurrency.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAGcurrency(String value) {
                this.aGcurrency = value;
            }

            /**
             * Obtiene el valor de la propiedad bankName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankName() {
                return bankName;
            }

            /**
             * Define el valor de la propiedad bankName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankName(String value) {
                this.bankName = value;
            }

            /**
             * Obtiene el valor de la propiedad bankCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankCode() {
                return bankCode;
            }

            /**
             * Define el valor de la propiedad bankCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankCode(String value) {
                this.bankCode = value;
            }

            /**
             * Obtiene el valor de la propiedad bankAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankAccount() {
                return bankAccount;
            }

            /**
             * Define el valor de la propiedad bankAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankAccount(String value) {
                this.bankAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad sequence.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSequence() {
                return sequence;
            }

            /**
             * Define el valor de la propiedad sequence.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSequence(String value) {
                this.sequence = value;
            }

        }

    }

}
