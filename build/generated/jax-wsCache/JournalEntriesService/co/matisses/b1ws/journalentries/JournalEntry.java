
package co.matisses.b1ws.journalentries;

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
 *         &lt;element name="ReferenceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="JdtNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseAutoStorno" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StornoDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="VatDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Series" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StampTax" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="AutoVAT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FolioNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FolioPrefixString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportEU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Report347" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Printed" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="psNo"/>
 *               &lt;enumeration value="psYes"/>
 *               &lt;enumeration value="psAmended"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OriginalJournal" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ttAllTransactions"/>
 *               &lt;enumeration value="ttOpeningBalance"/>
 *               &lt;enumeration value="ttClosingBalance"/>
 *               &lt;enumeration value="ttARInvoice"/>
 *               &lt;enumeration value="ttARCredItnote"/>
 *               &lt;enumeration value="ttDelivery"/>
 *               &lt;enumeration value="ttReturn"/>
 *               &lt;enumeration value="ttAPInvoice"/>
 *               &lt;enumeration value="ttAPCreditNote"/>
 *               &lt;enumeration value="ttPurchaseDeliveryNote"/>
 *               &lt;enumeration value="ttPurchaseReturn"/>
 *               &lt;enumeration value="ttReceipt"/>
 *               &lt;enumeration value="ttDeposit"/>
 *               &lt;enumeration value="ttJournalEntry"/>
 *               &lt;enumeration value="ttVendorPayment"/>
 *               &lt;enumeration value="ttChequesForPayment"/>
 *               &lt;enumeration value="ttStockList"/>
 *               &lt;enumeration value="ttGeneralReceiptToStock"/>
 *               &lt;enumeration value="ttGeneralReleaseFromStock"/>
 *               &lt;enumeration value="ttTransferBetweenWarehouses"/>
 *               &lt;enumeration value="ttWorkInstructions"/>
 *               &lt;enumeration value="ttLandedCosts"/>
 *               &lt;enumeration value="ttDeferredDeposit"/>
 *               &lt;enumeration value="ttCorrectionInvoice"/>
 *               &lt;enumeration value="ttInventoryValuation"/>
 *               &lt;enumeration value="ttAPCorrectionInvoice"/>
 *               &lt;enumeration value="ttAPCorrectionInvoiceReversal"/>
 *               &lt;enumeration value="ttARCorrectionInvoice"/>
 *               &lt;enumeration value="ttARCorrectionInvoiceReversal"/>
 *               &lt;enumeration value="ttBoETransaction"/>
 *               &lt;enumeration value="ttProductionOrder"/>
 *               &lt;enumeration value="ttDownPayment"/>
 *               &lt;enumeration value="ttPurchaseDownPayment"/>
 *               &lt;enumeration value="ttInternalReconciliation"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Original" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BaseReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BlockDunningLetter" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AutomaticWT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WTSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WTSumSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WTSumFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SignatureInputMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignatureDigest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrivateKeyVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Corisptivi" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Reference3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeferredTax" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BlanketAgreementNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OperationCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="octSummaryInvoicesEntry"/>
 *               &lt;enumeration value="octSummaryReceiptsEntry"/>
 *               &lt;enumeration value="octInvoicewithSeveralVATRates"/>
 *               &lt;enumeration value="octCorrectionInvoice"/>
 *               &lt;enumeration value="octDueVATPendingInvoiceIssuance"/>
 *               &lt;enumeration value="octExpensesIncurredbyTravelAgentforCustomers"/>
 *               &lt;enumeration value="octSpecialRegulationforVATGroup"/>
 *               &lt;enumeration value="octSpecialRegulationforGoldInvestment"/>
 *               &lt;enumeration value="octReverseChargeProcedure"/>
 *               &lt;enumeration value="octUnsummarizedReceipts"/>
 *               &lt;enumeration value="octIdentificationofErrorTransactions"/>
 *               &lt;enumeration value="octTransactionswithEntrepreneursIssuingReceiptsforAgriculturalCompensation"/>
 *               &lt;enumeration value="octServiceInvoicingbyTravelAgenciesonBehalfofThirdParties"/>
 *               &lt;enumeration value="octBusinessOfficeRental"/>
 *               &lt;enumeration value="octSubsidies"/>
 *               &lt;enumeration value="octIncomingPaymentsforIndustrialandIntellectualPropertyRights"/>
 *               &lt;enumeration value="octInsuranceTransactions"/>
 *               &lt;enumeration value="octPurchasesfromTravelAgencies"/>
 *               &lt;enumeration value="octTransactionsSubjecttoProductionServiceandImportTaxesinCeutaandMelilla"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResidenceNumberType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="rntSpanishFiscalID"/>
 *               &lt;enumeration value="rntVATRegistrationNumber"/>
 *               &lt;enumeration value="rntPassport"/>
 *               &lt;enumeration value="rntFiscalIDIssuedbytheResidenceCountry"/>
 *               &lt;enumeration value="rntCertificateofFiscalResidence"/>
 *               &lt;enumeration value="rntOtherDocument"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ECDPostingType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ecdNormal"/>
 *               &lt;enumeration value="ecdStatement"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExposedTransNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PointOfIssueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Letter" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="fLetterA"/>
 *               &lt;enumeration value="fLetterB"/>
 *               &lt;enumeration value="fLetterC"/>
 *               &lt;enumeration value="fLetterE"/>
 *               &lt;enumeration value="fLetterM"/>
 *               &lt;enumeration value="fLetterR"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FolioNumberFrom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FolioNumberTo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="U_ClaveDoc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="U_TipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_VrAct" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="U_BA_TCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_BA_REF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_OK1_IFRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_SerieDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_DifCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JournalEntryLines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="JournalEntryLine" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="Line_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Debit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="FCDebit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="FCCredit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="FCCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ContraAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LineMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ReferenceDate1" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="ReferenceDate2" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="Reference1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Reference2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CostingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TaxDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="BaseSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TaxGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DebitSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="CreditSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="VatDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="VatLine" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SystemBaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="VatAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="SystemVatAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="GrossValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AdditionalReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CheckAbs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="CostingCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CostingCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CostingCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TaxPostAccount" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tpa_Default"/>
 *                                   &lt;enumeration value="tpa_SalesTaxAccount"/>
 *                                   &lt;enumeration value="tpa_PurchaseTaxAccount"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CostingCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="ControlAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EqualizationTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="SystemEqualizationTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="SystemTotalTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="WTLiable" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="WTRow" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PaymentBlock" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="BlockReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="FederalTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BPLID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BPLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="VATRegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PaymentOrdered" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ExposedTransNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="U_InfoCo01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="U_InfoCo03" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="U_CodRet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="U_BaseRet" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="U_TarifaRet" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="U_BD_Exp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="CashFlowAssignments" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CashFlowAssignment" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="CashFlowAssignmentsID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="CashFlowLineItemID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="PaymentMeans" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="pmtNotAssigned"/>
 *                                                       &lt;enumeration value="pmtChecks"/>
 *                                                       &lt;enumeration value="pmtBankTransfer"/>
 *                                                       &lt;enumeration value="pmtCash"/>
 *                                                       &lt;enumeration value="pmtCreditCard"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="AmountLC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="AmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="JDTLineId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
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
 *         &lt;element name="WithholdingTaxDataCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="WithholdingTaxData" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="WTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WTAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="WTAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="WTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="WithholdingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TaxableAmountinSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TaxableAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="RoundingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AppliedWTAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AppliedWTAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AppliedWTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="GLAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BaseDocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BaseDocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BaseDocType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BaseDocumentReference" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Status" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="bost_Open"/>
 *                                   &lt;enumeration value="bost_Close"/>
 *                                   &lt;enumeration value="bost_Paid"/>
 *                                   &lt;enumeration value="bost_Delivered"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TargetAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="TargetDocumentType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="U_Base_ML" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="U_Base_MS" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="U_Base_ME" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="U_Tarifa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="U_Fuente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="U_Ret_ML" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="U_Ret_MS" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="U_Ret_ME" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
@XmlRootElement(name = "JournalEntry")
public class JournalEntry {

    @XmlElement(name = "ReferenceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar referenceDate;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElement(name = "Reference2")
    protected String reference2;
    @XmlElement(name = "TransactionCode")
    protected String transactionCode;
    @XmlElement(name = "ProjectCode")
    protected String projectCode;
    @XmlElement(name = "TaxDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxDate;
    @XmlElement(name = "JdtNum")
    protected Long jdtNum;
    @XmlElement(name = "Indicator")
    protected String indicator;
    @XmlElement(name = "UseAutoStorno")
    protected String useAutoStorno;
    @XmlElement(name = "StornoDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stornoDate;
    @XmlElement(name = "VatDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vatDate;
    @XmlElement(name = "Series")
    protected Long series;
    @XmlElement(name = "StampTax")
    protected String stampTax;
    @XmlElement(name = "DueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "AutoVAT")
    protected String autoVAT;
    @XmlElement(name = "Number")
    protected Long number;
    @XmlElement(name = "FolioNumber")
    protected Long folioNumber;
    @XmlElement(name = "FolioPrefixString")
    protected String folioPrefixString;
    @XmlElement(name = "ReportEU")
    protected String reportEU;
    @XmlElement(name = "Report347")
    protected String report347;
    @XmlElement(name = "Printed")
    protected String printed;
    @XmlElement(name = "LocationCode")
    protected Long locationCode;
    @XmlElement(name = "OriginalJournal")
    protected String originalJournal;
    @XmlElement(name = "Original")
    protected Long original;
    @XmlElement(name = "BaseReference")
    protected String baseReference;
    @XmlElement(name = "BlockDunningLetter")
    protected String blockDunningLetter;
    @XmlElement(name = "AutomaticWT")
    protected String automaticWT;
    @XmlElement(name = "WTSum")
    protected Double wtSum;
    @XmlElement(name = "WTSumSC")
    protected Double wtSumSC;
    @XmlElement(name = "WTSumFC")
    protected Double wtSumFC;
    @XmlElement(name = "SignatureInputMessage")
    protected String signatureInputMessage;
    @XmlElement(name = "SignatureDigest")
    protected String signatureDigest;
    @XmlElement(name = "CertificationNumber")
    protected String certificationNumber;
    @XmlElement(name = "PrivateKeyVersion")
    protected Long privateKeyVersion;
    @XmlElement(name = "Corisptivi")
    protected String corisptivi;
    @XmlElement(name = "Reference3")
    protected String reference3;
    @XmlElement(name = "DocumentType")
    protected String documentType;
    @XmlElement(name = "DeferredTax")
    protected String deferredTax;
    @XmlElement(name = "BlanketAgreementNumber")
    protected Long blanketAgreementNumber;
    @XmlElement(name = "OperationCode")
    protected String operationCode;
    @XmlElement(name = "ResidenceNumberType")
    protected String residenceNumberType;
    @XmlElement(name = "ECDPostingType")
    protected String ecdPostingType;
    @XmlElement(name = "ExposedTransNumber")
    protected Long exposedTransNumber;
    @XmlElement(name = "PointOfIssueCode")
    protected String pointOfIssueCode;
    @XmlElement(name = "Letter")
    protected String letter;
    @XmlElement(name = "FolioNumberFrom")
    protected Long folioNumberFrom;
    @XmlElement(name = "FolioNumberTo")
    protected Long folioNumberTo;
    @XmlElement(name = "U_ClaveDoc")
    protected Long uClaveDoc;
    @XmlElement(name = "U_TipoDoc")
    protected String uTipoDoc;
    @XmlElement(name = "U_VrAct")
    protected Double uVrAct;
    @XmlElement(name = "U_BA_TCODE")
    protected String ubatcode;
    @XmlElement(name = "U_BA_REF")
    protected String ubaref;
    @XmlElement(name = "U_OK1_IFRS")
    protected String uok1IFRS;
    @XmlElement(name = "U_SerieDoc")
    protected String uSerieDoc;
    @XmlElement(name = "U_DifCode")
    protected String uDifCode;
    @XmlElement(name = "JournalEntryLines")
    protected JournalEntry.JournalEntryLines journalEntryLines;
    @XmlElement(name = "WithholdingTaxDataCollection")
    protected JournalEntry.WithholdingTaxDataCollection withholdingTaxDataCollection;

    /**
     * Obtiene el valor de la propiedad referenceDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReferenceDate() {
        return referenceDate;
    }

    /**
     * Define el valor de la propiedad referenceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReferenceDate(XMLGregorianCalendar value) {
        this.referenceDate = value;
    }

    /**
     * Obtiene el valor de la propiedad memo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Define el valor de la propiedad memo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Obtiene el valor de la propiedad reference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Define el valor de la propiedad reference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Obtiene el valor de la propiedad reference2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference2() {
        return reference2;
    }

    /**
     * Define el valor de la propiedad reference2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference2(String value) {
        this.reference2 = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Define el valor de la propiedad transactionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad projectCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * Define el valor de la propiedad projectCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectCode(String value) {
        this.projectCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxDate() {
        return taxDate;
    }

    /**
     * Define el valor de la propiedad taxDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxDate(XMLGregorianCalendar value) {
        this.taxDate = value;
    }

    /**
     * Obtiene el valor de la propiedad jdtNum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getJdtNum() {
        return jdtNum;
    }

    /**
     * Define el valor de la propiedad jdtNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setJdtNum(Long value) {
        this.jdtNum = value;
    }

    /**
     * Obtiene el valor de la propiedad indicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * Define el valor de la propiedad indicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator(String value) {
        this.indicator = value;
    }

    /**
     * Obtiene el valor de la propiedad useAutoStorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseAutoStorno() {
        return useAutoStorno;
    }

    /**
     * Define el valor de la propiedad useAutoStorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseAutoStorno(String value) {
        this.useAutoStorno = value;
    }

    /**
     * Obtiene el valor de la propiedad stornoDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStornoDate() {
        return stornoDate;
    }

    /**
     * Define el valor de la propiedad stornoDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStornoDate(XMLGregorianCalendar value) {
        this.stornoDate = value;
    }

    /**
     * Obtiene el valor de la propiedad vatDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVatDate() {
        return vatDate;
    }

    /**
     * Define el valor de la propiedad vatDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVatDate(XMLGregorianCalendar value) {
        this.vatDate = value;
    }

    /**
     * Obtiene el valor de la propiedad series.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeries() {
        return series;
    }

    /**
     * Define el valor de la propiedad series.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeries(Long value) {
        this.series = value;
    }

    /**
     * Obtiene el valor de la propiedad stampTax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStampTax() {
        return stampTax;
    }

    /**
     * Define el valor de la propiedad stampTax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStampTax(String value) {
        this.stampTax = value;
    }

    /**
     * Obtiene el valor de la propiedad dueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Define el valor de la propiedad dueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad autoVAT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoVAT() {
        return autoVAT;
    }

    /**
     * Define el valor de la propiedad autoVAT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoVAT(String value) {
        this.autoVAT = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumber(Long value) {
        this.number = value;
    }

    /**
     * Obtiene el valor de la propiedad folioNumber.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolioNumber() {
        return folioNumber;
    }

    /**
     * Define el valor de la propiedad folioNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolioNumber(Long value) {
        this.folioNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad folioPrefixString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioPrefixString() {
        return folioPrefixString;
    }

    /**
     * Define el valor de la propiedad folioPrefixString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioPrefixString(String value) {
        this.folioPrefixString = value;
    }

    /**
     * Obtiene el valor de la propiedad reportEU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportEU() {
        return reportEU;
    }

    /**
     * Define el valor de la propiedad reportEU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportEU(String value) {
        this.reportEU = value;
    }

    /**
     * Obtiene el valor de la propiedad report347.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReport347() {
        return report347;
    }

    /**
     * Define el valor de la propiedad report347.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReport347(String value) {
        this.report347 = value;
    }

    /**
     * Obtiene el valor de la propiedad printed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinted() {
        return printed;
    }

    /**
     * Define el valor de la propiedad printed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinted(String value) {
        this.printed = value;
    }

    /**
     * Obtiene el valor de la propiedad locationCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationCode() {
        return locationCode;
    }

    /**
     * Define el valor de la propiedad locationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationCode(Long value) {
        this.locationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad originalJournal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalJournal() {
        return originalJournal;
    }

    /**
     * Define el valor de la propiedad originalJournal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalJournal(String value) {
        this.originalJournal = value;
    }

    /**
     * Obtiene el valor de la propiedad original.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginal() {
        return original;
    }

    /**
     * Define el valor de la propiedad original.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginal(Long value) {
        this.original = value;
    }

    /**
     * Obtiene el valor de la propiedad baseReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseReference() {
        return baseReference;
    }

    /**
     * Define el valor de la propiedad baseReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseReference(String value) {
        this.baseReference = value;
    }

    /**
     * Obtiene el valor de la propiedad blockDunningLetter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockDunningLetter() {
        return blockDunningLetter;
    }

    /**
     * Define el valor de la propiedad blockDunningLetter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockDunningLetter(String value) {
        this.blockDunningLetter = value;
    }

    /**
     * Obtiene el valor de la propiedad automaticWT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticWT() {
        return automaticWT;
    }

    /**
     * Define el valor de la propiedad automaticWT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticWT(String value) {
        this.automaticWT = value;
    }

    /**
     * Obtiene el valor de la propiedad wtSum.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWTSum() {
        return wtSum;
    }

    /**
     * Define el valor de la propiedad wtSum.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWTSum(Double value) {
        this.wtSum = value;
    }

    /**
     * Obtiene el valor de la propiedad wtSumSC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWTSumSC() {
        return wtSumSC;
    }

    /**
     * Define el valor de la propiedad wtSumSC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWTSumSC(Double value) {
        this.wtSumSC = value;
    }

    /**
     * Obtiene el valor de la propiedad wtSumFC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWTSumFC() {
        return wtSumFC;
    }

    /**
     * Define el valor de la propiedad wtSumFC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWTSumFC(Double value) {
        this.wtSumFC = value;
    }

    /**
     * Obtiene el valor de la propiedad signatureInputMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureInputMessage() {
        return signatureInputMessage;
    }

    /**
     * Define el valor de la propiedad signatureInputMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureInputMessage(String value) {
        this.signatureInputMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad signatureDigest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureDigest() {
        return signatureDigest;
    }

    /**
     * Define el valor de la propiedad signatureDigest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureDigest(String value) {
        this.signatureDigest = value;
    }

    /**
     * Obtiene el valor de la propiedad certificationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationNumber() {
        return certificationNumber;
    }

    /**
     * Define el valor de la propiedad certificationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationNumber(String value) {
        this.certificationNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad privateKeyVersion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrivateKeyVersion() {
        return privateKeyVersion;
    }

    /**
     * Define el valor de la propiedad privateKeyVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrivateKeyVersion(Long value) {
        this.privateKeyVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad corisptivi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorisptivi() {
        return corisptivi;
    }

    /**
     * Define el valor de la propiedad corisptivi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorisptivi(String value) {
        this.corisptivi = value;
    }

    /**
     * Obtiene el valor de la propiedad reference3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference3() {
        return reference3;
    }

    /**
     * Define el valor de la propiedad reference3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference3(String value) {
        this.reference3 = value;
    }

    /**
     * Obtiene el valor de la propiedad documentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Define el valor de la propiedad documentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Obtiene el valor de la propiedad deferredTax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeferredTax() {
        return deferredTax;
    }

    /**
     * Define el valor de la propiedad deferredTax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeferredTax(String value) {
        this.deferredTax = value;
    }

    /**
     * Obtiene el valor de la propiedad blanketAgreementNumber.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBlanketAgreementNumber() {
        return blanketAgreementNumber;
    }

    /**
     * Define el valor de la propiedad blanketAgreementNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBlanketAgreementNumber(Long value) {
        this.blanketAgreementNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad operationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * Define el valor de la propiedad operationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationCode(String value) {
        this.operationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad residenceNumberType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceNumberType() {
        return residenceNumberType;
    }

    /**
     * Define el valor de la propiedad residenceNumberType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceNumberType(String value) {
        this.residenceNumberType = value;
    }

    /**
     * Obtiene el valor de la propiedad ecdPostingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECDPostingType() {
        return ecdPostingType;
    }

    /**
     * Define el valor de la propiedad ecdPostingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECDPostingType(String value) {
        this.ecdPostingType = value;
    }

    /**
     * Obtiene el valor de la propiedad exposedTransNumber.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExposedTransNumber() {
        return exposedTransNumber;
    }

    /**
     * Define el valor de la propiedad exposedTransNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExposedTransNumber(Long value) {
        this.exposedTransNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad pointOfIssueCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfIssueCode() {
        return pointOfIssueCode;
    }

    /**
     * Define el valor de la propiedad pointOfIssueCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfIssueCode(String value) {
        this.pointOfIssueCode = value;
    }

    /**
     * Obtiene el valor de la propiedad letter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetter() {
        return letter;
    }

    /**
     * Define el valor de la propiedad letter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetter(String value) {
        this.letter = value;
    }

    /**
     * Obtiene el valor de la propiedad folioNumberFrom.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolioNumberFrom() {
        return folioNumberFrom;
    }

    /**
     * Define el valor de la propiedad folioNumberFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolioNumberFrom(Long value) {
        this.folioNumberFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad folioNumberTo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolioNumberTo() {
        return folioNumberTo;
    }

    /**
     * Define el valor de la propiedad folioNumberTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolioNumberTo(Long value) {
        this.folioNumberTo = value;
    }

    /**
     * Obtiene el valor de la propiedad uClaveDoc.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUClaveDoc() {
        return uClaveDoc;
    }

    /**
     * Define el valor de la propiedad uClaveDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUClaveDoc(Long value) {
        this.uClaveDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad uTipoDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTipoDoc() {
        return uTipoDoc;
    }

    /**
     * Define el valor de la propiedad uTipoDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTipoDoc(String value) {
        this.uTipoDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad uVrAct.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUVrAct() {
        return uVrAct;
    }

    /**
     * Define el valor de la propiedad uVrAct.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUVrAct(Double value) {
        this.uVrAct = value;
    }

    /**
     * Obtiene el valor de la propiedad ubatcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBATCODE() {
        return ubatcode;
    }

    /**
     * Define el valor de la propiedad ubatcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBATCODE(String value) {
        this.ubatcode = value;
    }

    /**
     * Obtiene el valor de la propiedad ubaref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBAREF() {
        return ubaref;
    }

    /**
     * Define el valor de la propiedad ubaref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBAREF(String value) {
        this.ubaref = value;
    }

    /**
     * Obtiene el valor de la propiedad uok1IFRS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOK1IFRS() {
        return uok1IFRS;
    }

    /**
     * Define el valor de la propiedad uok1IFRS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOK1IFRS(String value) {
        this.uok1IFRS = value;
    }

    /**
     * Obtiene el valor de la propiedad uSerieDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSerieDoc() {
        return uSerieDoc;
    }

    /**
     * Define el valor de la propiedad uSerieDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSerieDoc(String value) {
        this.uSerieDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad uDifCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDifCode() {
        return uDifCode;
    }

    /**
     * Define el valor de la propiedad uDifCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDifCode(String value) {
        this.uDifCode = value;
    }

    /**
     * Obtiene el valor de la propiedad journalEntryLines.
     * 
     * @return
     *     possible object is
     *     {@link JournalEntry.JournalEntryLines }
     *     
     */
    public JournalEntry.JournalEntryLines getJournalEntryLines() {
        return journalEntryLines;
    }

    /**
     * Define el valor de la propiedad journalEntryLines.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntry.JournalEntryLines }
     *     
     */
    public void setJournalEntryLines(JournalEntry.JournalEntryLines value) {
        this.journalEntryLines = value;
    }

    /**
     * Obtiene el valor de la propiedad withholdingTaxDataCollection.
     * 
     * @return
     *     possible object is
     *     {@link JournalEntry.WithholdingTaxDataCollection }
     *     
     */
    public JournalEntry.WithholdingTaxDataCollection getWithholdingTaxDataCollection() {
        return withholdingTaxDataCollection;
    }

    /**
     * Define el valor de la propiedad withholdingTaxDataCollection.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntry.WithholdingTaxDataCollection }
     *     
     */
    public void setWithholdingTaxDataCollection(JournalEntry.WithholdingTaxDataCollection value) {
        this.withholdingTaxDataCollection = value;
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
     *         &lt;element name="JournalEntryLine" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="Line_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Debit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="FCDebit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="FCCredit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="FCCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ContraAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LineMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ReferenceDate1" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="ReferenceDate2" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="Reference1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Reference2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CostingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TaxDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="BaseSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TaxGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DebitSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="CreditSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="VatDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="VatLine" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SystemBaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="VatAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="SystemVatAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="GrossValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AdditionalReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CheckAbs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="CostingCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CostingCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CostingCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TaxPostAccount" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tpa_Default"/>
     *                         &lt;enumeration value="tpa_SalesTaxAccount"/>
     *                         &lt;enumeration value="tpa_PurchaseTaxAccount"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CostingCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ControlAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EqualizationTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="SystemEqualizationTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="SystemTotalTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="WTLiable" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="WTRow" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PaymentBlock" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="BlockReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="FederalTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BPLID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BPLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="VATRegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PaymentOrdered" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ExposedTransNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="U_InfoCo01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_InfoCo03" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_CodRet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_BaseRet" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="U_TarifaRet" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="U_BD_Exp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="CashFlowAssignments" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CashFlowAssignment" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="CashFlowAssignmentsID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="CashFlowLineItemID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="PaymentMeans" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="pmtNotAssigned"/>
     *                                             &lt;enumeration value="pmtChecks"/>
     *                                             &lt;enumeration value="pmtBankTransfer"/>
     *                                             &lt;enumeration value="pmtCash"/>
     *                                             &lt;enumeration value="pmtCreditCard"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="AmountLC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="AmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="JDTLineId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
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
        "journalEntryLine"
    })
    public static class JournalEntryLines {

        @XmlElement(name = "JournalEntryLine")
        protected List<JournalEntry.JournalEntryLines.JournalEntryLine> journalEntryLine;

        /**
         * Gets the value of the journalEntryLine property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the journalEntryLine property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJournalEntryLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JournalEntry.JournalEntryLines.JournalEntryLine }
         * 
         * 
         */
        public List<JournalEntry.JournalEntryLines.JournalEntryLine> getJournalEntryLine() {
            if (journalEntryLine == null) {
                journalEntryLine = new ArrayList<JournalEntry.JournalEntryLines.JournalEntryLine>();
            }
            return this.journalEntryLine;
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
         *         &lt;element name="Line_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Debit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="FCDebit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="FCCredit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="FCCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ContraAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LineMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ReferenceDate1" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="ReferenceDate2" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="Reference1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Reference2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CostingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TaxDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="BaseSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TaxGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DebitSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="CreditSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="VatDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="VatLine" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SystemBaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="VatAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="SystemVatAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="GrossValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AdditionalReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CheckAbs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="CostingCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CostingCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CostingCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TaxPostAccount" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tpa_Default"/>
         *               &lt;enumeration value="tpa_SalesTaxAccount"/>
         *               &lt;enumeration value="tpa_PurchaseTaxAccount"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CostingCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="ControlAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EqualizationTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="SystemEqualizationTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="SystemTotalTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="WTLiable" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="WTRow" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PaymentBlock" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="BlockReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="FederalTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BPLID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BPLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="VATRegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PaymentOrdered" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ExposedTransNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="U_InfoCo01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_InfoCo03" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_CodRet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_BaseRet" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="U_TarifaRet" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="U_BD_Exp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="CashFlowAssignments" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CashFlowAssignment" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="CashFlowAssignmentsID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="CashFlowLineItemID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="PaymentMeans" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value="pmtNotAssigned"/>
         *                                   &lt;enumeration value="pmtChecks"/>
         *                                   &lt;enumeration value="pmtBankTransfer"/>
         *                                   &lt;enumeration value="pmtCash"/>
         *                                   &lt;enumeration value="pmtCreditCard"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="AmountLC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="AmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="JDTLineId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
        public static class JournalEntryLine {

            @XmlElement(name = "Line_ID")
            protected Long lineID;
            @XmlElement(name = "AccountCode")
            protected String accountCode;
            @XmlElement(name = "Debit")
            protected Double debit;
            @XmlElement(name = "Credit")
            protected Double credit;
            @XmlElement(name = "FCDebit")
            protected Double fcDebit;
            @XmlElement(name = "FCCredit")
            protected Double fcCredit;
            @XmlElement(name = "FCCurrency")
            protected String fcCurrency;
            @XmlElement(name = "DueDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dueDate;
            @XmlElement(name = "ShortName")
            protected String shortName;
            @XmlElement(name = "ContraAccount")
            protected String contraAccount;
            @XmlElement(name = "LineMemo")
            protected String lineMemo;
            @XmlElement(name = "ReferenceDate1")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar referenceDate1;
            @XmlElement(name = "ReferenceDate2")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar referenceDate2;
            @XmlElement(name = "Reference1")
            protected String reference1;
            @XmlElement(name = "Reference2")
            protected String reference2;
            @XmlElement(name = "ProjectCode")
            protected String projectCode;
            @XmlElement(name = "CostingCode")
            protected String costingCode;
            @XmlElement(name = "TaxDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar taxDate;
            @XmlElement(name = "BaseSum")
            protected Double baseSum;
            @XmlElement(name = "TaxGroup")
            protected String taxGroup;
            @XmlElement(name = "DebitSys")
            protected Double debitSys;
            @XmlElement(name = "CreditSys")
            protected Double creditSys;
            @XmlElement(name = "VatDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar vatDate;
            @XmlElement(name = "VatLine")
            protected String vatLine;
            @XmlElement(name = "SystemBaseAmount")
            protected Double systemBaseAmount;
            @XmlElement(name = "VatAmount")
            protected Double vatAmount;
            @XmlElement(name = "SystemVatAmount")
            protected Double systemVatAmount;
            @XmlElement(name = "GrossValue")
            protected Double grossValue;
            @XmlElement(name = "AdditionalReference")
            protected String additionalReference;
            @XmlElement(name = "CheckAbs")
            protected Long checkAbs;
            @XmlElement(name = "CostingCode2")
            protected String costingCode2;
            @XmlElement(name = "CostingCode3")
            protected String costingCode3;
            @XmlElement(name = "CostingCode4")
            protected String costingCode4;
            @XmlElement(name = "TaxCode")
            protected String taxCode;
            @XmlElement(name = "TaxPostAccount")
            protected String taxPostAccount;
            @XmlElement(name = "CostingCode5")
            protected String costingCode5;
            @XmlElement(name = "LocationCode")
            protected Long locationCode;
            @XmlElement(name = "ControlAccount")
            protected String controlAccount;
            @XmlElement(name = "EqualizationTaxAmount")
            protected Double equalizationTaxAmount;
            @XmlElement(name = "SystemEqualizationTaxAmount")
            protected Double systemEqualizationTaxAmount;
            @XmlElement(name = "TotalTax")
            protected Double totalTax;
            @XmlElement(name = "SystemTotalTax")
            protected Double systemTotalTax;
            @XmlElement(name = "WTLiable")
            protected String wtLiable;
            @XmlElement(name = "WTRow")
            protected String wtRow;
            @XmlElement(name = "PaymentBlock")
            protected String paymentBlock;
            @XmlElement(name = "BlockReason")
            protected Long blockReason;
            @XmlElement(name = "FederalTaxID")
            protected String federalTaxID;
            @XmlElement(name = "BPLID")
            protected Long bplid;
            @XmlElement(name = "BPLName")
            protected String bplName;
            @XmlElement(name = "VATRegNum")
            protected String vatRegNum;
            @XmlElement(name = "PaymentOrdered")
            protected String paymentOrdered;
            @XmlElement(name = "ExposedTransNumber")
            protected Long exposedTransNumber;
            @XmlElement(name = "U_InfoCo01")
            protected String uInfoCo01;
            @XmlElement(name = "U_InfoCo03")
            protected String uInfoCo03;
            @XmlElement(name = "U_CodRet")
            protected String uCodRet;
            @XmlElement(name = "U_BaseRet")
            protected Double uBaseRet;
            @XmlElement(name = "U_TarifaRet")
            protected Double uTarifaRet;
            @XmlElement(name = "U_BD_Exp")
            protected Long ubdExp;
            @XmlElement(name = "CashFlowAssignments")
            protected JournalEntry.JournalEntryLines.JournalEntryLine.CashFlowAssignments cashFlowAssignments;

            /**
             * Obtiene el valor de la propiedad lineID.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getLineID() {
                return lineID;
            }

            /**
             * Define el valor de la propiedad lineID.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setLineID(Long value) {
                this.lineID = value;
            }

            /**
             * Obtiene el valor de la propiedad accountCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountCode() {
                return accountCode;
            }

            /**
             * Define el valor de la propiedad accountCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountCode(String value) {
                this.accountCode = value;
            }

            /**
             * Obtiene el valor de la propiedad debit.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getDebit() {
                return debit;
            }

            /**
             * Define el valor de la propiedad debit.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setDebit(Double value) {
                this.debit = value;
            }

            /**
             * Obtiene el valor de la propiedad credit.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getCredit() {
                return credit;
            }

            /**
             * Define el valor de la propiedad credit.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setCredit(Double value) {
                this.credit = value;
            }

            /**
             * Obtiene el valor de la propiedad fcDebit.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getFCDebit() {
                return fcDebit;
            }

            /**
             * Define el valor de la propiedad fcDebit.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setFCDebit(Double value) {
                this.fcDebit = value;
            }

            /**
             * Obtiene el valor de la propiedad fcCredit.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getFCCredit() {
                return fcCredit;
            }

            /**
             * Define el valor de la propiedad fcCredit.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setFCCredit(Double value) {
                this.fcCredit = value;
            }

            /**
             * Obtiene el valor de la propiedad fcCurrency.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFCCurrency() {
                return fcCurrency;
            }

            /**
             * Define el valor de la propiedad fcCurrency.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFCCurrency(String value) {
                this.fcCurrency = value;
            }

            /**
             * Obtiene el valor de la propiedad dueDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDueDate() {
                return dueDate;
            }

            /**
             * Define el valor de la propiedad dueDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDueDate(XMLGregorianCalendar value) {
                this.dueDate = value;
            }

            /**
             * Obtiene el valor de la propiedad shortName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShortName() {
                return shortName;
            }

            /**
             * Define el valor de la propiedad shortName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShortName(String value) {
                this.shortName = value;
            }

            /**
             * Obtiene el valor de la propiedad contraAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContraAccount() {
                return contraAccount;
            }

            /**
             * Define el valor de la propiedad contraAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContraAccount(String value) {
                this.contraAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad lineMemo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLineMemo() {
                return lineMemo;
            }

            /**
             * Define el valor de la propiedad lineMemo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLineMemo(String value) {
                this.lineMemo = value;
            }

            /**
             * Obtiene el valor de la propiedad referenceDate1.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getReferenceDate1() {
                return referenceDate1;
            }

            /**
             * Define el valor de la propiedad referenceDate1.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setReferenceDate1(XMLGregorianCalendar value) {
                this.referenceDate1 = value;
            }

            /**
             * Obtiene el valor de la propiedad referenceDate2.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getReferenceDate2() {
                return referenceDate2;
            }

            /**
             * Define el valor de la propiedad referenceDate2.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setReferenceDate2(XMLGregorianCalendar value) {
                this.referenceDate2 = value;
            }

            /**
             * Obtiene el valor de la propiedad reference1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReference1() {
                return reference1;
            }

            /**
             * Define el valor de la propiedad reference1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReference1(String value) {
                this.reference1 = value;
            }

            /**
             * Obtiene el valor de la propiedad reference2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReference2() {
                return reference2;
            }

            /**
             * Define el valor de la propiedad reference2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReference2(String value) {
                this.reference2 = value;
            }

            /**
             * Obtiene el valor de la propiedad projectCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProjectCode() {
                return projectCode;
            }

            /**
             * Define el valor de la propiedad projectCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProjectCode(String value) {
                this.projectCode = value;
            }

            /**
             * Obtiene el valor de la propiedad costingCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCostingCode() {
                return costingCode;
            }

            /**
             * Define el valor de la propiedad costingCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCostingCode(String value) {
                this.costingCode = value;
            }

            /**
             * Obtiene el valor de la propiedad taxDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTaxDate() {
                return taxDate;
            }

            /**
             * Define el valor de la propiedad taxDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTaxDate(XMLGregorianCalendar value) {
                this.taxDate = value;
            }

            /**
             * Obtiene el valor de la propiedad baseSum.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getBaseSum() {
                return baseSum;
            }

            /**
             * Define el valor de la propiedad baseSum.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setBaseSum(Double value) {
                this.baseSum = value;
            }

            /**
             * Obtiene el valor de la propiedad taxGroup.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxGroup() {
                return taxGroup;
            }

            /**
             * Define el valor de la propiedad taxGroup.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxGroup(String value) {
                this.taxGroup = value;
            }

            /**
             * Obtiene el valor de la propiedad debitSys.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getDebitSys() {
                return debitSys;
            }

            /**
             * Define el valor de la propiedad debitSys.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setDebitSys(Double value) {
                this.debitSys = value;
            }

            /**
             * Obtiene el valor de la propiedad creditSys.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getCreditSys() {
                return creditSys;
            }

            /**
             * Define el valor de la propiedad creditSys.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setCreditSys(Double value) {
                this.creditSys = value;
            }

            /**
             * Obtiene el valor de la propiedad vatDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getVatDate() {
                return vatDate;
            }

            /**
             * Define el valor de la propiedad vatDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setVatDate(XMLGregorianCalendar value) {
                this.vatDate = value;
            }

            /**
             * Obtiene el valor de la propiedad vatLine.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVatLine() {
                return vatLine;
            }

            /**
             * Define el valor de la propiedad vatLine.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVatLine(String value) {
                this.vatLine = value;
            }

            /**
             * Obtiene el valor de la propiedad systemBaseAmount.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getSystemBaseAmount() {
                return systemBaseAmount;
            }

            /**
             * Define el valor de la propiedad systemBaseAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setSystemBaseAmount(Double value) {
                this.systemBaseAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad vatAmount.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getVatAmount() {
                return vatAmount;
            }

            /**
             * Define el valor de la propiedad vatAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setVatAmount(Double value) {
                this.vatAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad systemVatAmount.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getSystemVatAmount() {
                return systemVatAmount;
            }

            /**
             * Define el valor de la propiedad systemVatAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setSystemVatAmount(Double value) {
                this.systemVatAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad grossValue.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getGrossValue() {
                return grossValue;
            }

            /**
             * Define el valor de la propiedad grossValue.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setGrossValue(Double value) {
                this.grossValue = value;
            }

            /**
             * Obtiene el valor de la propiedad additionalReference.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalReference() {
                return additionalReference;
            }

            /**
             * Define el valor de la propiedad additionalReference.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalReference(String value) {
                this.additionalReference = value;
            }

            /**
             * Obtiene el valor de la propiedad checkAbs.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getCheckAbs() {
                return checkAbs;
            }

            /**
             * Define el valor de la propiedad checkAbs.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setCheckAbs(Long value) {
                this.checkAbs = value;
            }

            /**
             * Obtiene el valor de la propiedad costingCode2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCostingCode2() {
                return costingCode2;
            }

            /**
             * Define el valor de la propiedad costingCode2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCostingCode2(String value) {
                this.costingCode2 = value;
            }

            /**
             * Obtiene el valor de la propiedad costingCode3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCostingCode3() {
                return costingCode3;
            }

            /**
             * Define el valor de la propiedad costingCode3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCostingCode3(String value) {
                this.costingCode3 = value;
            }

            /**
             * Obtiene el valor de la propiedad costingCode4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCostingCode4() {
                return costingCode4;
            }

            /**
             * Define el valor de la propiedad costingCode4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCostingCode4(String value) {
                this.costingCode4 = value;
            }

            /**
             * Obtiene el valor de la propiedad taxCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxCode() {
                return taxCode;
            }

            /**
             * Define el valor de la propiedad taxCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxCode(String value) {
                this.taxCode = value;
            }

            /**
             * Obtiene el valor de la propiedad taxPostAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxPostAccount() {
                return taxPostAccount;
            }

            /**
             * Define el valor de la propiedad taxPostAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxPostAccount(String value) {
                this.taxPostAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad costingCode5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCostingCode5() {
                return costingCode5;
            }

            /**
             * Define el valor de la propiedad costingCode5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCostingCode5(String value) {
                this.costingCode5 = value;
            }

            /**
             * Obtiene el valor de la propiedad locationCode.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getLocationCode() {
                return locationCode;
            }

            /**
             * Define el valor de la propiedad locationCode.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setLocationCode(Long value) {
                this.locationCode = value;
            }

            /**
             * Obtiene el valor de la propiedad controlAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getControlAccount() {
                return controlAccount;
            }

            /**
             * Define el valor de la propiedad controlAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setControlAccount(String value) {
                this.controlAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad equalizationTaxAmount.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getEqualizationTaxAmount() {
                return equalizationTaxAmount;
            }

            /**
             * Define el valor de la propiedad equalizationTaxAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setEqualizationTaxAmount(Double value) {
                this.equalizationTaxAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad systemEqualizationTaxAmount.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getSystemEqualizationTaxAmount() {
                return systemEqualizationTaxAmount;
            }

            /**
             * Define el valor de la propiedad systemEqualizationTaxAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setSystemEqualizationTaxAmount(Double value) {
                this.systemEqualizationTaxAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad totalTax.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTotalTax() {
                return totalTax;
            }

            /**
             * Define el valor de la propiedad totalTax.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTotalTax(Double value) {
                this.totalTax = value;
            }

            /**
             * Obtiene el valor de la propiedad systemTotalTax.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getSystemTotalTax() {
                return systemTotalTax;
            }

            /**
             * Define el valor de la propiedad systemTotalTax.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setSystemTotalTax(Double value) {
                this.systemTotalTax = value;
            }

            /**
             * Obtiene el valor de la propiedad wtLiable.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWTLiable() {
                return wtLiable;
            }

            /**
             * Define el valor de la propiedad wtLiable.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWTLiable(String value) {
                this.wtLiable = value;
            }

            /**
             * Obtiene el valor de la propiedad wtRow.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWTRow() {
                return wtRow;
            }

            /**
             * Define el valor de la propiedad wtRow.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWTRow(String value) {
                this.wtRow = value;
            }

            /**
             * Obtiene el valor de la propiedad paymentBlock.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentBlock() {
                return paymentBlock;
            }

            /**
             * Define el valor de la propiedad paymentBlock.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentBlock(String value) {
                this.paymentBlock = value;
            }

            /**
             * Obtiene el valor de la propiedad blockReason.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBlockReason() {
                return blockReason;
            }

            /**
             * Define el valor de la propiedad blockReason.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBlockReason(Long value) {
                this.blockReason = value;
            }

            /**
             * Obtiene el valor de la propiedad federalTaxID.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFederalTaxID() {
                return federalTaxID;
            }

            /**
             * Define el valor de la propiedad federalTaxID.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFederalTaxID(String value) {
                this.federalTaxID = value;
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
             * Obtiene el valor de la propiedad bplName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBPLName() {
                return bplName;
            }

            /**
             * Define el valor de la propiedad bplName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBPLName(String value) {
                this.bplName = value;
            }

            /**
             * Obtiene el valor de la propiedad vatRegNum.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVATRegNum() {
                return vatRegNum;
            }

            /**
             * Define el valor de la propiedad vatRegNum.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVATRegNum(String value) {
                this.vatRegNum = value;
            }

            /**
             * Obtiene el valor de la propiedad paymentOrdered.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentOrdered() {
                return paymentOrdered;
            }

            /**
             * Define el valor de la propiedad paymentOrdered.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentOrdered(String value) {
                this.paymentOrdered = value;
            }

            /**
             * Obtiene el valor de la propiedad exposedTransNumber.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getExposedTransNumber() {
                return exposedTransNumber;
            }

            /**
             * Define el valor de la propiedad exposedTransNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setExposedTransNumber(Long value) {
                this.exposedTransNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad uInfoCo01.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUInfoCo01() {
                return uInfoCo01;
            }

            /**
             * Define el valor de la propiedad uInfoCo01.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUInfoCo01(String value) {
                this.uInfoCo01 = value;
            }

            /**
             * Obtiene el valor de la propiedad uInfoCo03.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUInfoCo03() {
                return uInfoCo03;
            }

            /**
             * Define el valor de la propiedad uInfoCo03.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUInfoCo03(String value) {
                this.uInfoCo03 = value;
            }

            /**
             * Obtiene el valor de la propiedad uCodRet.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUCodRet() {
                return uCodRet;
            }

            /**
             * Define el valor de la propiedad uCodRet.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUCodRet(String value) {
                this.uCodRet = value;
            }

            /**
             * Obtiene el valor de la propiedad uBaseRet.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getUBaseRet() {
                return uBaseRet;
            }

            /**
             * Define el valor de la propiedad uBaseRet.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setUBaseRet(Double value) {
                this.uBaseRet = value;
            }

            /**
             * Obtiene el valor de la propiedad uTarifaRet.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getUTarifaRet() {
                return uTarifaRet;
            }

            /**
             * Define el valor de la propiedad uTarifaRet.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setUTarifaRet(Double value) {
                this.uTarifaRet = value;
            }

            /**
             * Obtiene el valor de la propiedad ubdExp.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getUBDExp() {
                return ubdExp;
            }

            /**
             * Define el valor de la propiedad ubdExp.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setUBDExp(Long value) {
                this.ubdExp = value;
            }

            /**
             * Obtiene el valor de la propiedad cashFlowAssignments.
             * 
             * @return
             *     possible object is
             *     {@link JournalEntry.JournalEntryLines.JournalEntryLine.CashFlowAssignments }
             *     
             */
            public JournalEntry.JournalEntryLines.JournalEntryLine.CashFlowAssignments getCashFlowAssignments() {
                return cashFlowAssignments;
            }

            /**
             * Define el valor de la propiedad cashFlowAssignments.
             * 
             * @param value
             *     allowed object is
             *     {@link JournalEntry.JournalEntryLines.JournalEntryLine.CashFlowAssignments }
             *     
             */
            public void setCashFlowAssignments(JournalEntry.JournalEntryLines.JournalEntryLine.CashFlowAssignments value) {
                this.cashFlowAssignments = value;
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
             *         &lt;element name="CashFlowAssignment" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="CashFlowAssignmentsID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="CashFlowLineItemID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="PaymentMeans" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value="pmtNotAssigned"/>
             *                         &lt;enumeration value="pmtChecks"/>
             *                         &lt;enumeration value="pmtBankTransfer"/>
             *                         &lt;enumeration value="pmtCash"/>
             *                         &lt;enumeration value="pmtCreditCard"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="AmountLC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="AmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="JDTLineId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
                "cashFlowAssignment"
            })
            public static class CashFlowAssignments {

                @XmlElement(name = "CashFlowAssignment")
                protected List<JournalEntry.JournalEntryLines.JournalEntryLine.CashFlowAssignments.CashFlowAssignment> cashFlowAssignment;

                /**
                 * Gets the value of the cashFlowAssignment property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the cashFlowAssignment property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCashFlowAssignment().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link JournalEntry.JournalEntryLines.JournalEntryLine.CashFlowAssignments.CashFlowAssignment }
                 * 
                 * 
                 */
                public List<JournalEntry.JournalEntryLines.JournalEntryLine.CashFlowAssignments.CashFlowAssignment> getCashFlowAssignment() {
                    if (cashFlowAssignment == null) {
                        cashFlowAssignment = new ArrayList<JournalEntry.JournalEntryLines.JournalEntryLine.CashFlowAssignments.CashFlowAssignment>();
                    }
                    return this.cashFlowAssignment;
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
                 *         &lt;element name="CashFlowAssignmentsID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="CashFlowLineItemID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="PaymentMeans" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value="pmtNotAssigned"/>
                 *               &lt;enumeration value="pmtChecks"/>
                 *               &lt;enumeration value="pmtBankTransfer"/>
                 *               &lt;enumeration value="pmtCash"/>
                 *               &lt;enumeration value="pmtCreditCard"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="AmountLC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="AmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="JDTLineId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
                public static class CashFlowAssignment {

                    @XmlElement(name = "CashFlowAssignmentsID")
                    protected Long cashFlowAssignmentsID;
                    @XmlElement(name = "CashFlowLineItemID")
                    protected Long cashFlowLineItemID;
                    @XmlElement(name = "Credit")
                    protected Double credit;
                    @XmlElement(name = "PaymentMeans")
                    protected String paymentMeans;
                    @XmlElement(name = "CheckNumber")
                    protected String checkNumber;
                    @XmlElement(name = "AmountLC")
                    protected Double amountLC;
                    @XmlElement(name = "AmountFC")
                    protected Double amountFC;
                    @XmlElement(name = "JDTLineId")
                    protected Long jdtLineId;

                    /**
                     * Obtiene el valor de la propiedad cashFlowAssignmentsID.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getCashFlowAssignmentsID() {
                        return cashFlowAssignmentsID;
                    }

                    /**
                     * Define el valor de la propiedad cashFlowAssignmentsID.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setCashFlowAssignmentsID(Long value) {
                        this.cashFlowAssignmentsID = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad cashFlowLineItemID.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getCashFlowLineItemID() {
                        return cashFlowLineItemID;
                    }

                    /**
                     * Define el valor de la propiedad cashFlowLineItemID.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setCashFlowLineItemID(Long value) {
                        this.cashFlowLineItemID = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad credit.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getCredit() {
                        return credit;
                    }

                    /**
                     * Define el valor de la propiedad credit.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setCredit(Double value) {
                        this.credit = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad paymentMeans.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPaymentMeans() {
                        return paymentMeans;
                    }

                    /**
                     * Define el valor de la propiedad paymentMeans.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPaymentMeans(String value) {
                        this.paymentMeans = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad checkNumber.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCheckNumber() {
                        return checkNumber;
                    }

                    /**
                     * Define el valor de la propiedad checkNumber.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCheckNumber(String value) {
                        this.checkNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad amountLC.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getAmountLC() {
                        return amountLC;
                    }

                    /**
                     * Define el valor de la propiedad amountLC.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setAmountLC(Double value) {
                        this.amountLC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad amountFC.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getAmountFC() {
                        return amountFC;
                    }

                    /**
                     * Define el valor de la propiedad amountFC.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setAmountFC(Double value) {
                        this.amountFC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad jdtLineId.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getJDTLineId() {
                        return jdtLineId;
                    }

                    /**
                     * Define el valor de la propiedad jdtLineId.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setJDTLineId(Long value) {
                        this.jdtLineId = value;
                    }

                }

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
     *         &lt;element name="WithholdingTaxData" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="WTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WTAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="WTAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="WTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="WithholdingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TaxableAmountinSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TaxableAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="RoundingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AppliedWTAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AppliedWTAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AppliedWTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="GLAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseDocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseDocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseDocType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseDocumentReference" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Status" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="bost_Open"/>
     *                         &lt;enumeration value="bost_Close"/>
     *                         &lt;enumeration value="bost_Paid"/>
     *                         &lt;enumeration value="bost_Delivered"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TargetAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="TargetDocumentType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="U_Base_ML" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="U_Base_MS" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="U_Base_ME" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="U_Tarifa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="U_Fuente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_Ret_ML" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="U_Ret_MS" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="U_Ret_ME" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        "withholdingTaxData"
    })
    public static class WithholdingTaxDataCollection {

        @XmlElement(name = "WithholdingTaxData")
        protected List<JournalEntry.WithholdingTaxDataCollection.WithholdingTaxData> withholdingTaxData;

        /**
         * Gets the value of the withholdingTaxData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the withholdingTaxData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWithholdingTaxData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JournalEntry.WithholdingTaxDataCollection.WithholdingTaxData }
         * 
         * 
         */
        public List<JournalEntry.WithholdingTaxDataCollection.WithholdingTaxData> getWithholdingTaxData() {
            if (withholdingTaxData == null) {
                withholdingTaxData = new ArrayList<JournalEntry.WithholdingTaxDataCollection.WithholdingTaxData>();
            }
            return this.withholdingTaxData;
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
         *         &lt;element name="WTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WTAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="WTAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="WTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="WithholdingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TaxableAmountinSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TaxableAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="RoundingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AppliedWTAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AppliedWTAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AppliedWTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="GLAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseDocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseDocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseDocType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseDocumentReference" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Status" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="bost_Open"/>
         *               &lt;enumeration value="bost_Close"/>
         *               &lt;enumeration value="bost_Paid"/>
         *               &lt;enumeration value="bost_Delivered"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TargetAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="TargetDocumentType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="U_Base_ML" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="U_Base_MS" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="U_Base_ME" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="U_Tarifa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="U_Fuente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_Ret_ML" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="U_Ret_MS" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="U_Ret_ME" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        public static class WithholdingTaxData {

            @XmlElement(name = "WTCode")
            protected String wtCode;
            @XmlElement(name = "WTAmountSys")
            protected Double wtAmountSys;
            @XmlElement(name = "WTAmountFC")
            protected Double wtAmountFC;
            @XmlElement(name = "WTAmount")
            protected Double wtAmount;
            @XmlElement(name = "WithholdingType")
            protected String withholdingType;
            @XmlElement(name = "TaxableAmountinSys")
            protected Double taxableAmountinSys;
            @XmlElement(name = "TaxableAmountFC")
            protected Double taxableAmountFC;
            @XmlElement(name = "TaxableAmount")
            protected Double taxableAmount;
            @XmlElement(name = "RoundingType")
            protected String roundingType;
            @XmlElement(name = "Rate")
            protected Double rate;
            @XmlElement(name = "Criteria")
            protected String criteria;
            @XmlElement(name = "Category")
            protected String category;
            @XmlElement(name = "BaseType")
            protected String baseType;
            @XmlElement(name = "AppliedWTAmountSys")
            protected Double appliedWTAmountSys;
            @XmlElement(name = "AppliedWTAmountFC")
            protected Double appliedWTAmountFC;
            @XmlElement(name = "AppliedWTAmount")
            protected Double appliedWTAmount;
            @XmlElement(name = "GLAccount")
            protected String glAccount;
            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "BaseDocEntry")
            protected Long baseDocEntry;
            @XmlElement(name = "BaseDocLine")
            protected Long baseDocLine;
            @XmlElement(name = "BaseDocType")
            protected Long baseDocType;
            @XmlElement(name = "BaseDocumentReference")
            protected Long baseDocumentReference;
            @XmlElement(name = "Status")
            protected String status;
            @XmlElement(name = "TargetAbsEntry")
            protected Long targetAbsEntry;
            @XmlElement(name = "TargetDocumentType")
            protected Long targetDocumentType;
            @XmlElement(name = "U_Base_ML")
            protected Double uBaseML;
            @XmlElement(name = "U_Base_MS")
            protected Double uBaseMS;
            @XmlElement(name = "U_Base_ME")
            protected Double uBaseME;
            @XmlElement(name = "U_Tarifa")
            protected Double uTarifa;
            @XmlElement(name = "U_Fuente")
            protected String uFuente;
            @XmlElement(name = "U_Ret_ML")
            protected Double uRetML;
            @XmlElement(name = "U_Ret_MS")
            protected Double uRetMS;
            @XmlElement(name = "U_Ret_ME")
            protected Double uRetME;

            /**
             * Obtiene el valor de la propiedad wtCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWTCode() {
                return wtCode;
            }

            /**
             * Define el valor de la propiedad wtCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWTCode(String value) {
                this.wtCode = value;
            }

            /**
             * Obtiene el valor de la propiedad wtAmountSys.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getWTAmountSys() {
                return wtAmountSys;
            }

            /**
             * Define el valor de la propiedad wtAmountSys.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setWTAmountSys(Double value) {
                this.wtAmountSys = value;
            }

            /**
             * Obtiene el valor de la propiedad wtAmountFC.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getWTAmountFC() {
                return wtAmountFC;
            }

            /**
             * Define el valor de la propiedad wtAmountFC.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setWTAmountFC(Double value) {
                this.wtAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad wtAmount.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getWTAmount() {
                return wtAmount;
            }

            /**
             * Define el valor de la propiedad wtAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setWTAmount(Double value) {
                this.wtAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad withholdingType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWithholdingType() {
                return withholdingType;
            }

            /**
             * Define el valor de la propiedad withholdingType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWithholdingType(String value) {
                this.withholdingType = value;
            }

            /**
             * Obtiene el valor de la propiedad taxableAmountinSys.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTaxableAmountinSys() {
                return taxableAmountinSys;
            }

            /**
             * Define el valor de la propiedad taxableAmountinSys.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTaxableAmountinSys(Double value) {
                this.taxableAmountinSys = value;
            }

            /**
             * Obtiene el valor de la propiedad taxableAmountFC.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTaxableAmountFC() {
                return taxableAmountFC;
            }

            /**
             * Define el valor de la propiedad taxableAmountFC.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTaxableAmountFC(Double value) {
                this.taxableAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad taxableAmount.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTaxableAmount() {
                return taxableAmount;
            }

            /**
             * Define el valor de la propiedad taxableAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTaxableAmount(Double value) {
                this.taxableAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad roundingType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoundingType() {
                return roundingType;
            }

            /**
             * Define el valor de la propiedad roundingType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoundingType(String value) {
                this.roundingType = value;
            }

            /**
             * Obtiene el valor de la propiedad rate.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getRate() {
                return rate;
            }

            /**
             * Define el valor de la propiedad rate.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setRate(Double value) {
                this.rate = value;
            }

            /**
             * Obtiene el valor de la propiedad criteria.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCriteria() {
                return criteria;
            }

            /**
             * Define el valor de la propiedad criteria.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCriteria(String value) {
                this.criteria = value;
            }

            /**
             * Obtiene el valor de la propiedad category.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCategory() {
                return category;
            }

            /**
             * Define el valor de la propiedad category.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCategory(String value) {
                this.category = value;
            }

            /**
             * Obtiene el valor de la propiedad baseType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBaseType() {
                return baseType;
            }

            /**
             * Define el valor de la propiedad baseType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBaseType(String value) {
                this.baseType = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedWTAmountSys.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAppliedWTAmountSys() {
                return appliedWTAmountSys;
            }

            /**
             * Define el valor de la propiedad appliedWTAmountSys.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAppliedWTAmountSys(Double value) {
                this.appliedWTAmountSys = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedWTAmountFC.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAppliedWTAmountFC() {
                return appliedWTAmountFC;
            }

            /**
             * Define el valor de la propiedad appliedWTAmountFC.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAppliedWTAmountFC(Double value) {
                this.appliedWTAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedWTAmount.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAppliedWTAmount() {
                return appliedWTAmount;
            }

            /**
             * Define el valor de la propiedad appliedWTAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAppliedWTAmount(Double value) {
                this.appliedWTAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad glAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGLAccount() {
                return glAccount;
            }

            /**
             * Define el valor de la propiedad glAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGLAccount(String value) {
                this.glAccount = value;
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
             * Obtiene el valor de la propiedad baseDocEntry.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBaseDocEntry() {
                return baseDocEntry;
            }

            /**
             * Define el valor de la propiedad baseDocEntry.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBaseDocEntry(Long value) {
                this.baseDocEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad baseDocLine.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBaseDocLine() {
                return baseDocLine;
            }

            /**
             * Define el valor de la propiedad baseDocLine.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBaseDocLine(Long value) {
                this.baseDocLine = value;
            }

            /**
             * Obtiene el valor de la propiedad baseDocType.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBaseDocType() {
                return baseDocType;
            }

            /**
             * Define el valor de la propiedad baseDocType.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBaseDocType(Long value) {
                this.baseDocType = value;
            }

            /**
             * Obtiene el valor de la propiedad baseDocumentReference.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBaseDocumentReference() {
                return baseDocumentReference;
            }

            /**
             * Define el valor de la propiedad baseDocumentReference.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBaseDocumentReference(Long value) {
                this.baseDocumentReference = value;
            }

            /**
             * Obtiene el valor de la propiedad status.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Define el valor de la propiedad status.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Obtiene el valor de la propiedad targetAbsEntry.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getTargetAbsEntry() {
                return targetAbsEntry;
            }

            /**
             * Define el valor de la propiedad targetAbsEntry.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setTargetAbsEntry(Long value) {
                this.targetAbsEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad targetDocumentType.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getTargetDocumentType() {
                return targetDocumentType;
            }

            /**
             * Define el valor de la propiedad targetDocumentType.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setTargetDocumentType(Long value) {
                this.targetDocumentType = value;
            }

            /**
             * Obtiene el valor de la propiedad uBaseML.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getUBaseML() {
                return uBaseML;
            }

            /**
             * Define el valor de la propiedad uBaseML.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setUBaseML(Double value) {
                this.uBaseML = value;
            }

            /**
             * Obtiene el valor de la propiedad uBaseMS.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getUBaseMS() {
                return uBaseMS;
            }

            /**
             * Define el valor de la propiedad uBaseMS.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setUBaseMS(Double value) {
                this.uBaseMS = value;
            }

            /**
             * Obtiene el valor de la propiedad uBaseME.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getUBaseME() {
                return uBaseME;
            }

            /**
             * Define el valor de la propiedad uBaseME.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setUBaseME(Double value) {
                this.uBaseME = value;
            }

            /**
             * Obtiene el valor de la propiedad uTarifa.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getUTarifa() {
                return uTarifa;
            }

            /**
             * Define el valor de la propiedad uTarifa.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setUTarifa(Double value) {
                this.uTarifa = value;
            }

            /**
             * Obtiene el valor de la propiedad uFuente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUFuente() {
                return uFuente;
            }

            /**
             * Define el valor de la propiedad uFuente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUFuente(String value) {
                this.uFuente = value;
            }

            /**
             * Obtiene el valor de la propiedad uRetML.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getURetML() {
                return uRetML;
            }

            /**
             * Define el valor de la propiedad uRetML.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setURetML(Double value) {
                this.uRetML = value;
            }

            /**
             * Obtiene el valor de la propiedad uRetMS.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getURetMS() {
                return uRetMS;
            }

            /**
             * Define el valor de la propiedad uRetMS.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setURetMS(Double value) {
                this.uRetMS = value;
            }

            /**
             * Obtiene el valor de la propiedad uRetME.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getURetME() {
                return uRetME;
            }

            /**
             * Define el valor de la propiedad uRetME.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setURetME(Double value) {
                this.uRetME = value;
            }

        }

    }

}
