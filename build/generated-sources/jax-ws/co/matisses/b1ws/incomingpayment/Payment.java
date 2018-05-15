
package co.matisses.b1ws.incomingpayment;

import java.math.BigDecimal;
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
 *         &lt;element name="DocNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DocType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="rCustomer"/>
 *               &lt;enumeration value="rAccount"/>
 *               &lt;enumeration value="rSupplier"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HandWritten" minOccurs="0">
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
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CashAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CashSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CheckAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransferAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransferSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TransferDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TransferReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalCurrency" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DocRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Reference1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounterReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JournalRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SplitTransaction" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContactPersonCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ApplyVAT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TaxDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Series" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyIsLocal" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductionPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DeductionSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CashSumFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CashSumSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BoeAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillOfExchangeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BillofExchangeStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="boes_Created"/>
 *               &lt;enumeration value="boes_Sent"/>
 *               &lt;enumeration value="boes_Deposited"/>
 *               &lt;enumeration value="boes_Paid"/>
 *               &lt;enumeration value="boes_Cancelled"/>
 *               &lt;enumeration value="boes_Closed"/>
 *               &lt;enumeration value="boes_Failed"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BillOfExchangeAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BillOfExchangeAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BillOfExchangeAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WTAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WTAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WTAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WTTaxableAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Proforma" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PayToBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToBankBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToBankAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToBankCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPayToBank" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PaymentPriority" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="bopp_Priority_1"/>
 *               &lt;enumeration value="bopp_Priority_2"/>
 *               &lt;enumeration value="bopp_Priority_3"/>
 *               &lt;enumeration value="bopp_Priority_4"/>
 *               &lt;enumeration value="bopp_Priority_5"/>
 *               &lt;enumeration value="bopp_Priority_6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TaxGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankChargeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BankChargeAmountInFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BankChargeAmountInSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="UnderOverpaymentdifference" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="UnderOverpaymentdiffSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WtBaseSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WtBaseSumFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WtBaseSumSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="VatDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="bopt_None"/>
 *               &lt;enumeration value="bopt_Electronic"/>
 *               &lt;enumeration value="bopt_Post"/>
 *               &lt;enumeration value="bopt_Telegraph"/>
 *               &lt;enumeration value="bopt_Express"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TransferRealAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DocObjectCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="bopot_IncomingPayments"/>
 *               &lt;enumeration value="bopot_OutgoingPayments"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DocTypte" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="rCustomer"/>
 *               &lt;enumeration value="rAccount"/>
 *               &lt;enumeration value="rSupplier"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Cancelled" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ControlAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnderOverpaymentdiffFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AuthorizationStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="pasWithout"/>
 *               &lt;enumeration value="pasPending"/>
 *               &lt;enumeration value="pasApproved"/>
 *               &lt;enumeration value="pasRejected"/>
 *               &lt;enumeration value="pasGenerated"/>
 *               &lt;enumeration value="pasGeneratedbyAuthorizer"/>
 *               &lt;enumeration value="pasCancelled"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BPLID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BPLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VATRegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_BP_Confd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_BP_DocNr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="U_BP_Seque" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="U_OK1_IFRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_asesor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_PagoBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentChecks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentCheck" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccounttNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Trnsfrable" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CheckSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CheckAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="CheckAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ManualCheck" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FiscalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OriginallyIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Endorse" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="EndorsableCheckNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="U_Aprobacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="U_Asesor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="U_CR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="U_Fecha_Conf" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="U_Manejo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="PaymentInvoices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentInvoice" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="SumApplied" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AppliedFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AppliedSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="DocRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="DocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="InvoiceType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="it_AllTransactions"/>
 *                                   &lt;enumeration value="it_OpeningBalance"/>
 *                                   &lt;enumeration value="it_ClosingBalance"/>
 *                                   &lt;enumeration value="it_Invoice"/>
 *                                   &lt;enumeration value="it_CredItnote"/>
 *                                   &lt;enumeration value="it_TaxInvoice"/>
 *                                   &lt;enumeration value="it_Return"/>
 *                                   &lt;enumeration value="it_PurchaseInvoice"/>
 *                                   &lt;enumeration value="it_PurchaseCreditNote"/>
 *                                   &lt;enumeration value="it_PurchaseDeliveryNote"/>
 *                                   &lt;enumeration value="it_PurchaseReturn"/>
 *                                   &lt;enumeration value="it_Receipt"/>
 *                                   &lt;enumeration value="it_Deposit"/>
 *                                   &lt;enumeration value="it_JournalEntry"/>
 *                                   &lt;enumeration value="it_PaymentAdvice"/>
 *                                   &lt;enumeration value="it_ChequesForPayment"/>
 *                                   &lt;enumeration value="it_StockReconciliations"/>
 *                                   &lt;enumeration value="it_GeneralReceiptToStock"/>
 *                                   &lt;enumeration value="it_GeneralReleaseFromStock"/>
 *                                   &lt;enumeration value="it_TransferBetweenWarehouses"/>
 *                                   &lt;enumeration value="it_WorkInstructions"/>
 *                                   &lt;enumeration value="it_DeferredDeposit"/>
 *                                   &lt;enumeration value="it_CorrectionInvoice"/>
 *                                   &lt;enumeration value="it_APCorrectionInvoice"/>
 *                                   &lt;enumeration value="it_ARCorrectionInvoice"/>
 *                                   &lt;enumeration value="it_DownPayment"/>
 *                                   &lt;enumeration value="it_PurchaseDownPayment"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="PaidSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="InstallmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="WitholdingTaxApplied" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="WitholdingTaxAppliedFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="WitholdingTaxAppliedSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="LinkDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TotalDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TotalDiscountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TotalDiscountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="U_me_pago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="PaymentCreditCards" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentCreditCard" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="CreditCard" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="CreditAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CardValidUntil" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="VoucherNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OwnerIdNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OwnerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PaymentMethodCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="NumOfPayments" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="FirstPaymentDue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="FirstPaymentSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AdditionalPaymentSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="CreditSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="CreditCur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CreditRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="ConfirmationNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NumOfCreditPayments" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="CreditType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="cr_Regular"/>
 *                                   &lt;enumeration value="cr_Telephone"/>
 *                                   &lt;enumeration value="cr_InternetTransaction"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SplitPayments" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
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
 *         &lt;element name="PaymentAccounts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentAccount" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SumPaid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="SumPaidFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Decription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="VatGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GrossAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="ProfitCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="VatAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="ProfitCenter2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProfitCenter3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProfitCenter4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProfitCenter5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="EqualizationVatAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="U_Tercero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="BillOfExchange" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="BillOfExchangeNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="BillOfExchangeDueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PaymentMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BPBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BPBankAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BPBankCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ControlKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PaymentEngineStatus1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PaymentEngineStatus2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PaymentEngineStatus3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="StampTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="StampTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="FolioNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="FolioPrefixString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="InterestAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="FineAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="InterestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="DiscountDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="FineDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="IOFAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="ServiceFeeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="OtherExpensesAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="OtherIncomesAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="WithholdingTaxCertificatesCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="WithholdingTaxCertificatesData" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="POICodeRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="POICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Certificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WTaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PeriodIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WhtAbsId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Series" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="SumVATAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="SumDocTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="SumBaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="SumAccumAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="SumPercAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="WTGroupsCollection" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="WTGroups" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="WTAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="SumVATAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="SumDocTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="SumBaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="SumAccumAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="SumPerceptAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="DocsInWTGroupsCollection" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="DocsInWTGroups" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;all>
 *                                                                     &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                                     &lt;element name="DocObjType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="VATAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                                     &lt;element name="DocTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                                     &lt;element name="BaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                                     &lt;element name="AccumAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                                     &lt;element name="PerceptAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                                     &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                                   &lt;/all>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
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
 *         &lt;element name="Payments_ApprovalRequests" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Payments_ApprovalRequest" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="ApprovalTemplatesID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
 *         &lt;element name="WithholdingTaxDataWTXCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="WithholdingTaxDataWTX" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="WTAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="WTAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="WTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="WithholdingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TaxableAmountinSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TaxableAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AppliedWTAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AppliedWTAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AppliedWTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="GLAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BaseDocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BaseDocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BaseDocType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WTAbsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ExemptRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="BaseNetAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="BaseNetAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="BaseNetAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="BaseVatmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="BaseVatmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="BaseVatmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AccumBaseAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AccumBaseAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AccumBaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AccumWTaxAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AccumWTaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AccumWTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
@XmlRootElement(name = "Payment")
public class Payment {

    @XmlElement(name = "DocNum")
    protected Long docNum;
    @XmlElement(name = "DocType")
    protected String docType;
    @XmlElement(name = "HandWritten")
    protected String handWritten;
    @XmlElement(name = "Printed")
    protected String printed;
    @XmlElement(name = "DocDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDate;
    @XmlElement(name = "CardCode")
    protected String cardCode;
    @XmlElement(name = "CardName")
    protected String cardName;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "CashAccount")
    protected String cashAccount;
    @XmlElement(name = "DocCurrency")
    protected String docCurrency;
    @XmlElement(name = "CashSum")
    protected BigDecimal cashSum;
    @XmlElement(name = "CheckAccount")
    protected String checkAccount;
    @XmlElement(name = "TransferAccount")
    protected String transferAccount;
    @XmlElement(name = "TransferSum")
    protected BigDecimal transferSum;
    @XmlElement(name = "TransferDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transferDate;
    @XmlElement(name = "TransferReference")
    protected String transferReference;
    @XmlElement(name = "LocalCurrency")
    protected String localCurrency;
    @XmlElement(name = "DocRate")
    protected BigDecimal docRate;
    @XmlElement(name = "Reference1")
    protected String reference1;
    @XmlElement(name = "Reference2")
    protected String reference2;
    @XmlElement(name = "CounterReference")
    protected String counterReference;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "JournalRemarks")
    protected String journalRemarks;
    @XmlElement(name = "SplitTransaction")
    protected String splitTransaction;
    @XmlElement(name = "ContactPersonCode")
    protected Long contactPersonCode;
    @XmlElement(name = "ApplyVAT")
    protected String applyVAT;
    @XmlElement(name = "TaxDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxDate;
    @XmlElement(name = "Series")
    protected Long series;
    @XmlElement(name = "BankCode")
    protected String bankCode;
    @XmlElement(name = "BankAccount")
    protected String bankAccount;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "ProjectCode")
    protected String projectCode;
    @XmlElement(name = "CurrencyIsLocal")
    protected String currencyIsLocal;
    @XmlElement(name = "DeductionPercent")
    protected BigDecimal deductionPercent;
    @XmlElement(name = "DeductionSum")
    protected BigDecimal deductionSum;
    @XmlElement(name = "CashSumFC")
    protected BigDecimal cashSumFC;
    @XmlElement(name = "CashSumSys")
    protected BigDecimal cashSumSys;
    @XmlElement(name = "BoeAccount")
    protected String boeAccount;
    @XmlElement(name = "BillOfExchangeAmount")
    protected BigDecimal billOfExchangeAmount;
    @XmlElement(name = "BillofExchangeStatus")
    protected String billofExchangeStatus;
    @XmlElement(name = "BillOfExchangeAmountFC")
    protected BigDecimal billOfExchangeAmountFC;
    @XmlElement(name = "BillOfExchangeAmountSC")
    protected BigDecimal billOfExchangeAmountSC;
    @XmlElement(name = "BillOfExchangeAgent")
    protected String billOfExchangeAgent;
    @XmlElement(name = "WTCode")
    protected String wtCode;
    @XmlElement(name = "WTAmount")
    protected BigDecimal wtAmount;
    @XmlElement(name = "WTAmountFC")
    protected BigDecimal wtAmountFC;
    @XmlElement(name = "WTAmountSC")
    protected BigDecimal wtAmountSC;
    @XmlElement(name = "WTAccount")
    protected String wtAccount;
    @XmlElement(name = "WTTaxableAmount")
    protected BigDecimal wtTaxableAmount;
    @XmlElement(name = "Proforma")
    protected String proforma;
    @XmlElement(name = "PayToBankCode")
    protected String payToBankCode;
    @XmlElement(name = "PayToBankBranch")
    protected String payToBankBranch;
    @XmlElement(name = "PayToBankAccountNo")
    protected String payToBankAccountNo;
    @XmlElement(name = "PayToCode")
    protected String payToCode;
    @XmlElement(name = "PayToBankCountry")
    protected String payToBankCountry;
    @XmlElement(name = "IsPayToBank")
    protected String isPayToBank;
    @XmlElement(name = "DocEntry")
    protected Long docEntry;
    @XmlElement(name = "PaymentPriority")
    protected String paymentPriority;
    @XmlElement(name = "TaxGroup")
    protected String taxGroup;
    @XmlElement(name = "BankChargeAmount")
    protected BigDecimal bankChargeAmount;
    @XmlElement(name = "BankChargeAmountInFC")
    protected BigDecimal bankChargeAmountInFC;
    @XmlElement(name = "BankChargeAmountInSC")
    protected BigDecimal bankChargeAmountInSC;
    @XmlElement(name = "UnderOverpaymentdifference")
    protected BigDecimal underOverpaymentdifference;
    @XmlElement(name = "UnderOverpaymentdiffSC")
    protected BigDecimal underOverpaymentdiffSC;
    @XmlElement(name = "WtBaseSum")
    protected BigDecimal wtBaseSum;
    @XmlElement(name = "WtBaseSumFC")
    protected BigDecimal wtBaseSumFC;
    @XmlElement(name = "WtBaseSumSC")
    protected BigDecimal wtBaseSumSC;
    @XmlElement(name = "VatDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vatDate;
    @XmlElement(name = "TransactionCode")
    protected String transactionCode;
    @XmlElement(name = "PaymentType")
    protected String paymentType;
    @XmlElement(name = "TransferRealAmount")
    protected BigDecimal transferRealAmount;
    @XmlElement(name = "DocObjectCode")
    protected String docObjectCode;
    @XmlElement(name = "DocTypte")
    protected String docTypte;
    @XmlElement(name = "DueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "LocationCode")
    protected Long locationCode;
    @XmlElement(name = "Cancelled")
    protected String cancelled;
    @XmlElement(name = "ControlAccount")
    protected String controlAccount;
    @XmlElement(name = "UnderOverpaymentdiffFC")
    protected BigDecimal underOverpaymentdiffFC;
    @XmlElement(name = "AuthorizationStatus")
    protected String authorizationStatus;
    @XmlElement(name = "BPLID")
    protected Long bplid;
    @XmlElement(name = "BPLName")
    protected String bplName;
    @XmlElement(name = "VATRegNum")
    protected String vatRegNum;
    @XmlElement(name = "U_BP_Confd")
    protected String ubpConfd;
    @XmlElement(name = "U_BP_DocNr")
    protected Long ubpDocNr;
    @XmlElement(name = "U_BP_Seque")
    protected Long ubpSeque;
    @XmlElement(name = "U_OK1_IFRS")
    protected String uok1IFRS;
    @XmlElement(name = "U_asesor")
    protected String uAsesor;
    @XmlElement(name = "U_PagoBeneficiario")
    protected String uPagoBeneficiario;
    @XmlElement(name = "PaymentChecks")
    protected Payment.PaymentChecks paymentChecks;
    @XmlElement(name = "PaymentInvoices")
    protected Payment.PaymentInvoices paymentInvoices;
    @XmlElement(name = "PaymentCreditCards")
    protected Payment.PaymentCreditCards paymentCreditCards;
    @XmlElement(name = "PaymentAccounts")
    protected Payment.PaymentAccounts paymentAccounts;
    @XmlElement(name = "BillOfExchange")
    protected Payment.BillOfExchange billOfExchange;
    @XmlElement(name = "WithholdingTaxCertificatesCollection")
    protected Payment.WithholdingTaxCertificatesCollection withholdingTaxCertificatesCollection;
    @XmlElement(name = "CashFlowAssignments")
    protected Payment.CashFlowAssignments cashFlowAssignments;
    @XmlElement(name = "Payments_ApprovalRequests")
    protected Payment.PaymentsApprovalRequests paymentsApprovalRequests;
    @XmlElement(name = "WithholdingTaxDataWTXCollection")
    protected Payment.WithholdingTaxDataWTXCollection withholdingTaxDataWTXCollection;

    /**
     * Obtiene el valor de la propiedad docNum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocNum() {
        return docNum;
    }

    /**
     * Define el valor de la propiedad docNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocNum(Long value) {
        this.docNum = value;
    }

    /**
     * Obtiene el valor de la propiedad docType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Define el valor de la propiedad docType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * Obtiene el valor de la propiedad handWritten.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandWritten() {
        return handWritten;
    }

    /**
     * Define el valor de la propiedad handWritten.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandWritten(String value) {
        this.handWritten = value;
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
     * Obtiene el valor de la propiedad docDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Define el valor de la propiedad docDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Obtiene el valor de la propiedad cardCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * Define el valor de la propiedad cardCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCode(String value) {
        this.cardCode = value;
    }

    /**
     * Obtiene el valor de la propiedad cardName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * Define el valor de la propiedad cardName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardName(String value) {
        this.cardName = value;
    }

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad cashAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashAccount() {
        return cashAccount;
    }

    /**
     * Define el valor de la propiedad cashAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashAccount(String value) {
        this.cashAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad docCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocCurrency() {
        return docCurrency;
    }

    /**
     * Define el valor de la propiedad docCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocCurrency(String value) {
        this.docCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad cashSum.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashSum() {
        return cashSum;
    }

    /**
     * Define el valor de la propiedad cashSum.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashSum(BigDecimal value) {
        this.cashSum = value;
    }

    /**
     * Obtiene el valor de la propiedad checkAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckAccount() {
        return checkAccount;
    }

    /**
     * Define el valor de la propiedad checkAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckAccount(String value) {
        this.checkAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad transferAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferAccount() {
        return transferAccount;
    }

    /**
     * Define el valor de la propiedad transferAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferAccount(String value) {
        this.transferAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad transferSum.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransferSum() {
        return transferSum;
    }

    /**
     * Define el valor de la propiedad transferSum.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransferSum(BigDecimal value) {
        this.transferSum = value;
    }

    /**
     * Obtiene el valor de la propiedad transferDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransferDate() {
        return transferDate;
    }

    /**
     * Define el valor de la propiedad transferDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransferDate(XMLGregorianCalendar value) {
        this.transferDate = value;
    }

    /**
     * Obtiene el valor de la propiedad transferReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferReference() {
        return transferReference;
    }

    /**
     * Define el valor de la propiedad transferReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferReference(String value) {
        this.transferReference = value;
    }

    /**
     * Obtiene el valor de la propiedad localCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCurrency() {
        return localCurrency;
    }

    /**
     * Define el valor de la propiedad localCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCurrency(String value) {
        this.localCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad docRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocRate() {
        return docRate;
    }

    /**
     * Define el valor de la propiedad docRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocRate(BigDecimal value) {
        this.docRate = value;
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
     * Obtiene el valor de la propiedad counterReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterReference() {
        return counterReference;
    }

    /**
     * Define el valor de la propiedad counterReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterReference(String value) {
        this.counterReference = value;
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
     * Obtiene el valor de la propiedad journalRemarks.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalRemarks() {
        return journalRemarks;
    }

    /**
     * Define el valor de la propiedad journalRemarks.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalRemarks(String value) {
        this.journalRemarks = value;
    }

    /**
     * Obtiene el valor de la propiedad splitTransaction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitTransaction() {
        return splitTransaction;
    }

    /**
     * Define el valor de la propiedad splitTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitTransaction(String value) {
        this.splitTransaction = value;
    }

    /**
     * Obtiene el valor de la propiedad contactPersonCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactPersonCode() {
        return contactPersonCode;
    }

    /**
     * Define el valor de la propiedad contactPersonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactPersonCode(Long value) {
        this.contactPersonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad applyVAT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyVAT() {
        return applyVAT;
    }

    /**
     * Define el valor de la propiedad applyVAT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyVAT(String value) {
        this.applyVAT = value;
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
     * Obtiene el valor de la propiedad discountPercent.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Define el valor de la propiedad discountPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
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
     * Obtiene el valor de la propiedad currencyIsLocal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyIsLocal() {
        return currencyIsLocal;
    }

    /**
     * Define el valor de la propiedad currencyIsLocal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyIsLocal(String value) {
        this.currencyIsLocal = value;
    }

    /**
     * Obtiene el valor de la propiedad deductionPercent.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductionPercent() {
        return deductionPercent;
    }

    /**
     * Define el valor de la propiedad deductionPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductionPercent(BigDecimal value) {
        this.deductionPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad deductionSum.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductionSum() {
        return deductionSum;
    }

    /**
     * Define el valor de la propiedad deductionSum.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductionSum(BigDecimal value) {
        this.deductionSum = value;
    }

    /**
     * Obtiene el valor de la propiedad cashSumFC.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashSumFC() {
        return cashSumFC;
    }

    /**
     * Define el valor de la propiedad cashSumFC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashSumFC(BigDecimal value) {
        this.cashSumFC = value;
    }

    /**
     * Obtiene el valor de la propiedad cashSumSys.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashSumSys() {
        return cashSumSys;
    }

    /**
     * Define el valor de la propiedad cashSumSys.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashSumSys(BigDecimal value) {
        this.cashSumSys = value;
    }

    /**
     * Obtiene el valor de la propiedad boeAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoeAccount() {
        return boeAccount;
    }

    /**
     * Define el valor de la propiedad boeAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoeAccount(String value) {
        this.boeAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad billOfExchangeAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillOfExchangeAmount() {
        return billOfExchangeAmount;
    }

    /**
     * Define el valor de la propiedad billOfExchangeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillOfExchangeAmount(BigDecimal value) {
        this.billOfExchangeAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad billofExchangeStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillofExchangeStatus() {
        return billofExchangeStatus;
    }

    /**
     * Define el valor de la propiedad billofExchangeStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillofExchangeStatus(String value) {
        this.billofExchangeStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad billOfExchangeAmountFC.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillOfExchangeAmountFC() {
        return billOfExchangeAmountFC;
    }

    /**
     * Define el valor de la propiedad billOfExchangeAmountFC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillOfExchangeAmountFC(BigDecimal value) {
        this.billOfExchangeAmountFC = value;
    }

    /**
     * Obtiene el valor de la propiedad billOfExchangeAmountSC.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillOfExchangeAmountSC() {
        return billOfExchangeAmountSC;
    }

    /**
     * Define el valor de la propiedad billOfExchangeAmountSC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillOfExchangeAmountSC(BigDecimal value) {
        this.billOfExchangeAmountSC = value;
    }

    /**
     * Obtiene el valor de la propiedad billOfExchangeAgent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillOfExchangeAgent() {
        return billOfExchangeAgent;
    }

    /**
     * Define el valor de la propiedad billOfExchangeAgent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillOfExchangeAgent(String value) {
        this.billOfExchangeAgent = value;
    }

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
     * Obtiene el valor de la propiedad wtAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWTAmount() {
        return wtAmount;
    }

    /**
     * Define el valor de la propiedad wtAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWTAmount(BigDecimal value) {
        this.wtAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad wtAmountFC.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWTAmountFC() {
        return wtAmountFC;
    }

    /**
     * Define el valor de la propiedad wtAmountFC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWTAmountFC(BigDecimal value) {
        this.wtAmountFC = value;
    }

    /**
     * Obtiene el valor de la propiedad wtAmountSC.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWTAmountSC() {
        return wtAmountSC;
    }

    /**
     * Define el valor de la propiedad wtAmountSC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWTAmountSC(BigDecimal value) {
        this.wtAmountSC = value;
    }

    /**
     * Obtiene el valor de la propiedad wtAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTAccount() {
        return wtAccount;
    }

    /**
     * Define el valor de la propiedad wtAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTAccount(String value) {
        this.wtAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad wtTaxableAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWTTaxableAmount() {
        return wtTaxableAmount;
    }

    /**
     * Define el valor de la propiedad wtTaxableAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWTTaxableAmount(BigDecimal value) {
        this.wtTaxableAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad proforma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProforma() {
        return proforma;
    }

    /**
     * Define el valor de la propiedad proforma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProforma(String value) {
        this.proforma = value;
    }

    /**
     * Obtiene el valor de la propiedad payToBankCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToBankCode() {
        return payToBankCode;
    }

    /**
     * Define el valor de la propiedad payToBankCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToBankCode(String value) {
        this.payToBankCode = value;
    }

    /**
     * Obtiene el valor de la propiedad payToBankBranch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToBankBranch() {
        return payToBankBranch;
    }

    /**
     * Define el valor de la propiedad payToBankBranch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToBankBranch(String value) {
        this.payToBankBranch = value;
    }

    /**
     * Obtiene el valor de la propiedad payToBankAccountNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToBankAccountNo() {
        return payToBankAccountNo;
    }

    /**
     * Define el valor de la propiedad payToBankAccountNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToBankAccountNo(String value) {
        this.payToBankAccountNo = value;
    }

    /**
     * Obtiene el valor de la propiedad payToCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToCode() {
        return payToCode;
    }

    /**
     * Define el valor de la propiedad payToCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToCode(String value) {
        this.payToCode = value;
    }

    /**
     * Obtiene el valor de la propiedad payToBankCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToBankCountry() {
        return payToBankCountry;
    }

    /**
     * Define el valor de la propiedad payToBankCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToBankCountry(String value) {
        this.payToBankCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad isPayToBank.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPayToBank() {
        return isPayToBank;
    }

    /**
     * Define el valor de la propiedad isPayToBank.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPayToBank(String value) {
        this.isPayToBank = value;
    }

    /**
     * Obtiene el valor de la propiedad docEntry.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocEntry() {
        return docEntry;
    }

    /**
     * Define el valor de la propiedad docEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocEntry(Long value) {
        this.docEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentPriority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPriority() {
        return paymentPriority;
    }

    /**
     * Define el valor de la propiedad paymentPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPriority(String value) {
        this.paymentPriority = value;
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
     * Obtiene el valor de la propiedad bankChargeAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBankChargeAmount() {
        return bankChargeAmount;
    }

    /**
     * Define el valor de la propiedad bankChargeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBankChargeAmount(BigDecimal value) {
        this.bankChargeAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad bankChargeAmountInFC.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBankChargeAmountInFC() {
        return bankChargeAmountInFC;
    }

    /**
     * Define el valor de la propiedad bankChargeAmountInFC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBankChargeAmountInFC(BigDecimal value) {
        this.bankChargeAmountInFC = value;
    }

    /**
     * Obtiene el valor de la propiedad bankChargeAmountInSC.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBankChargeAmountInSC() {
        return bankChargeAmountInSC;
    }

    /**
     * Define el valor de la propiedad bankChargeAmountInSC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBankChargeAmountInSC(BigDecimal value) {
        this.bankChargeAmountInSC = value;
    }

    /**
     * Obtiene el valor de la propiedad underOverpaymentdifference.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnderOverpaymentdifference() {
        return underOverpaymentdifference;
    }

    /**
     * Define el valor de la propiedad underOverpaymentdifference.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnderOverpaymentdifference(BigDecimal value) {
        this.underOverpaymentdifference = value;
    }

    /**
     * Obtiene el valor de la propiedad underOverpaymentdiffSC.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnderOverpaymentdiffSC() {
        return underOverpaymentdiffSC;
    }

    /**
     * Define el valor de la propiedad underOverpaymentdiffSC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnderOverpaymentdiffSC(BigDecimal value) {
        this.underOverpaymentdiffSC = value;
    }

    /**
     * Obtiene el valor de la propiedad wtBaseSum.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWtBaseSum() {
        return wtBaseSum;
    }

    /**
     * Define el valor de la propiedad wtBaseSum.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWtBaseSum(BigDecimal value) {
        this.wtBaseSum = value;
    }

    /**
     * Obtiene el valor de la propiedad wtBaseSumFC.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWtBaseSumFC() {
        return wtBaseSumFC;
    }

    /**
     * Define el valor de la propiedad wtBaseSumFC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWtBaseSumFC(BigDecimal value) {
        this.wtBaseSumFC = value;
    }

    /**
     * Obtiene el valor de la propiedad wtBaseSumSC.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWtBaseSumSC() {
        return wtBaseSumSC;
    }

    /**
     * Define el valor de la propiedad wtBaseSumSC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWtBaseSumSC(BigDecimal value) {
        this.wtBaseSumSC = value;
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
     * Obtiene el valor de la propiedad paymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Define el valor de la propiedad paymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Obtiene el valor de la propiedad transferRealAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransferRealAmount() {
        return transferRealAmount;
    }

    /**
     * Define el valor de la propiedad transferRealAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransferRealAmount(BigDecimal value) {
        this.transferRealAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad docObjectCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocObjectCode() {
        return docObjectCode;
    }

    /**
     * Define el valor de la propiedad docObjectCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocObjectCode(String value) {
        this.docObjectCode = value;
    }

    /**
     * Obtiene el valor de la propiedad docTypte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTypte() {
        return docTypte;
    }

    /**
     * Define el valor de la propiedad docTypte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTypte(String value) {
        this.docTypte = value;
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
     * Obtiene el valor de la propiedad cancelled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelled() {
        return cancelled;
    }

    /**
     * Define el valor de la propiedad cancelled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelled(String value) {
        this.cancelled = value;
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
     * Obtiene el valor de la propiedad underOverpaymentdiffFC.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnderOverpaymentdiffFC() {
        return underOverpaymentdiffFC;
    }

    /**
     * Define el valor de la propiedad underOverpaymentdiffFC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnderOverpaymentdiffFC(BigDecimal value) {
        this.underOverpaymentdiffFC = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizationStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationStatus() {
        return authorizationStatus;
    }

    /**
     * Define el valor de la propiedad authorizationStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationStatus(String value) {
        this.authorizationStatus = value;
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
     * Obtiene el valor de la propiedad ubpConfd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBPConfd() {
        return ubpConfd;
    }

    /**
     * Define el valor de la propiedad ubpConfd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBPConfd(String value) {
        this.ubpConfd = value;
    }

    /**
     * Obtiene el valor de la propiedad ubpDocNr.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUBPDocNr() {
        return ubpDocNr;
    }

    /**
     * Define el valor de la propiedad ubpDocNr.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUBPDocNr(Long value) {
        this.ubpDocNr = value;
    }

    /**
     * Obtiene el valor de la propiedad ubpSeque.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUBPSeque() {
        return ubpSeque;
    }

    /**
     * Define el valor de la propiedad ubpSeque.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUBPSeque(Long value) {
        this.ubpSeque = value;
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
     * Obtiene el valor de la propiedad uAsesor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUAsesor() {
        return uAsesor;
    }

    /**
     * Define el valor de la propiedad uAsesor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUAsesor(String value) {
        this.uAsesor = value;
    }

    /**
     * Obtiene el valor de la propiedad uPagoBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPagoBeneficiario() {
        return uPagoBeneficiario;
    }

    /**
     * Define el valor de la propiedad uPagoBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPagoBeneficiario(String value) {
        this.uPagoBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentChecks.
     * 
     * @return
     *     possible object is
     *     {@link Payment.PaymentChecks }
     *     
     */
    public Payment.PaymentChecks getPaymentChecks() {
        return paymentChecks;
    }

    /**
     * Define el valor de la propiedad paymentChecks.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment.PaymentChecks }
     *     
     */
    public void setPaymentChecks(Payment.PaymentChecks value) {
        this.paymentChecks = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentInvoices.
     * 
     * @return
     *     possible object is
     *     {@link Payment.PaymentInvoices }
     *     
     */
    public Payment.PaymentInvoices getPaymentInvoices() {
        return paymentInvoices;
    }

    /**
     * Define el valor de la propiedad paymentInvoices.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment.PaymentInvoices }
     *     
     */
    public void setPaymentInvoices(Payment.PaymentInvoices value) {
        this.paymentInvoices = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentCreditCards.
     * 
     * @return
     *     possible object is
     *     {@link Payment.PaymentCreditCards }
     *     
     */
    public Payment.PaymentCreditCards getPaymentCreditCards() {
        return paymentCreditCards;
    }

    /**
     * Define el valor de la propiedad paymentCreditCards.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment.PaymentCreditCards }
     *     
     */
    public void setPaymentCreditCards(Payment.PaymentCreditCards value) {
        this.paymentCreditCards = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentAccounts.
     * 
     * @return
     *     possible object is
     *     {@link Payment.PaymentAccounts }
     *     
     */
    public Payment.PaymentAccounts getPaymentAccounts() {
        return paymentAccounts;
    }

    /**
     * Define el valor de la propiedad paymentAccounts.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment.PaymentAccounts }
     *     
     */
    public void setPaymentAccounts(Payment.PaymentAccounts value) {
        this.paymentAccounts = value;
    }

    /**
     * Obtiene el valor de la propiedad billOfExchange.
     * 
     * @return
     *     possible object is
     *     {@link Payment.BillOfExchange }
     *     
     */
    public Payment.BillOfExchange getBillOfExchange() {
        return billOfExchange;
    }

    /**
     * Define el valor de la propiedad billOfExchange.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment.BillOfExchange }
     *     
     */
    public void setBillOfExchange(Payment.BillOfExchange value) {
        this.billOfExchange = value;
    }

    /**
     * Obtiene el valor de la propiedad withholdingTaxCertificatesCollection.
     * 
     * @return
     *     possible object is
     *     {@link Payment.WithholdingTaxCertificatesCollection }
     *     
     */
    public Payment.WithholdingTaxCertificatesCollection getWithholdingTaxCertificatesCollection() {
        return withholdingTaxCertificatesCollection;
    }

    /**
     * Define el valor de la propiedad withholdingTaxCertificatesCollection.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment.WithholdingTaxCertificatesCollection }
     *     
     */
    public void setWithholdingTaxCertificatesCollection(Payment.WithholdingTaxCertificatesCollection value) {
        this.withholdingTaxCertificatesCollection = value;
    }

    /**
     * Obtiene el valor de la propiedad cashFlowAssignments.
     * 
     * @return
     *     possible object is
     *     {@link Payment.CashFlowAssignments }
     *     
     */
    public Payment.CashFlowAssignments getCashFlowAssignments() {
        return cashFlowAssignments;
    }

    /**
     * Define el valor de la propiedad cashFlowAssignments.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment.CashFlowAssignments }
     *     
     */
    public void setCashFlowAssignments(Payment.CashFlowAssignments value) {
        this.cashFlowAssignments = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentsApprovalRequests.
     * 
     * @return
     *     possible object is
     *     {@link Payment.PaymentsApprovalRequests }
     *     
     */
    public Payment.PaymentsApprovalRequests getPaymentsApprovalRequests() {
        return paymentsApprovalRequests;
    }

    /**
     * Define el valor de la propiedad paymentsApprovalRequests.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment.PaymentsApprovalRequests }
     *     
     */
    public void setPaymentsApprovalRequests(Payment.PaymentsApprovalRequests value) {
        this.paymentsApprovalRequests = value;
    }

    /**
     * Obtiene el valor de la propiedad withholdingTaxDataWTXCollection.
     * 
     * @return
     *     possible object is
     *     {@link Payment.WithholdingTaxDataWTXCollection }
     *     
     */
    public Payment.WithholdingTaxDataWTXCollection getWithholdingTaxDataWTXCollection() {
        return withholdingTaxDataWTXCollection;
    }

    /**
     * Define el valor de la propiedad withholdingTaxDataWTXCollection.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment.WithholdingTaxDataWTXCollection }
     *     
     */
    public void setWithholdingTaxDataWTXCollection(Payment.WithholdingTaxDataWTXCollection value) {
        this.withholdingTaxDataWTXCollection = value;
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
     *         &lt;element name="BillOfExchangeNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="BillOfExchangeDueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PaymentMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BPBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BPBankAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BPBankCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ControlKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PaymentEngineStatus1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PaymentEngineStatus2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PaymentEngineStatus3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="StampTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="StampTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="FolioNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="FolioPrefixString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="InterestAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="FineAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="InterestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="DiscountDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="FineDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="IOFAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="ServiceFeeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="OtherExpensesAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="OtherIncomesAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    public static class BillOfExchange {

        @XmlElement(name = "BillOfExchangeNo")
        protected Long billOfExchangeNo;
        @XmlElement(name = "BillOfExchangeDueDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar billOfExchangeDueDate;
        @XmlElement(name = "Details")
        protected String details;
        @XmlElement(name = "ReferenceNo")
        protected String referenceNo;
        @XmlElement(name = "Remarks")
        protected String remarks;
        @XmlElement(name = "PaymentMethodCode")
        protected String paymentMethodCode;
        @XmlElement(name = "BPBankCode")
        protected String bpBankCode;
        @XmlElement(name = "BPBankAct")
        protected String bpBankAct;
        @XmlElement(name = "BPBankCountry")
        protected String bpBankCountry;
        @XmlElement(name = "ControlKey")
        protected String controlKey;
        @XmlElement(name = "PaymentEngineStatus1")
        protected String paymentEngineStatus1;
        @XmlElement(name = "PaymentEngineStatus2")
        protected String paymentEngineStatus2;
        @XmlElement(name = "PaymentEngineStatus3")
        protected String paymentEngineStatus3;
        @XmlElement(name = "StampTaxCode")
        protected String stampTaxCode;
        @XmlElement(name = "StampTaxAmount")
        protected BigDecimal stampTaxAmount;
        @XmlElement(name = "FolioNumber")
        protected Long folioNumber;
        @XmlElement(name = "FolioPrefixString")
        protected String folioPrefixString;
        @XmlElement(name = "InterestAmount")
        protected BigDecimal interestAmount;
        @XmlElement(name = "DiscountAmount")
        protected BigDecimal discountAmount;
        @XmlElement(name = "FineAmount")
        protected BigDecimal fineAmount;
        @XmlElement(name = "InterestDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar interestDate;
        @XmlElement(name = "DiscountDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar discountDate;
        @XmlElement(name = "FineDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fineDate;
        @XmlElement(name = "IOFAmount")
        protected BigDecimal iofAmount;
        @XmlElement(name = "ServiceFeeAmount")
        protected BigDecimal serviceFeeAmount;
        @XmlElement(name = "OtherExpensesAmount")
        protected BigDecimal otherExpensesAmount;
        @XmlElement(name = "OtherIncomesAmount")
        protected BigDecimal otherIncomesAmount;

        /**
         * Obtiene el valor de la propiedad billOfExchangeNo.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getBillOfExchangeNo() {
            return billOfExchangeNo;
        }

        /**
         * Define el valor de la propiedad billOfExchangeNo.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setBillOfExchangeNo(Long value) {
            this.billOfExchangeNo = value;
        }

        /**
         * Obtiene el valor de la propiedad billOfExchangeDueDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBillOfExchangeDueDate() {
            return billOfExchangeDueDate;
        }

        /**
         * Define el valor de la propiedad billOfExchangeDueDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBillOfExchangeDueDate(XMLGregorianCalendar value) {
            this.billOfExchangeDueDate = value;
        }

        /**
         * Obtiene el valor de la propiedad details.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetails() {
            return details;
        }

        /**
         * Define el valor de la propiedad details.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDetails(String value) {
            this.details = value;
        }

        /**
         * Obtiene el valor de la propiedad referenceNo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceNo() {
            return referenceNo;
        }

        /**
         * Define el valor de la propiedad referenceNo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceNo(String value) {
            this.referenceNo = value;
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
         * Obtiene el valor de la propiedad paymentMethodCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentMethodCode() {
            return paymentMethodCode;
        }

        /**
         * Define el valor de la propiedad paymentMethodCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentMethodCode(String value) {
            this.paymentMethodCode = value;
        }

        /**
         * Obtiene el valor de la propiedad bpBankCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBPBankCode() {
            return bpBankCode;
        }

        /**
         * Define el valor de la propiedad bpBankCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBPBankCode(String value) {
            this.bpBankCode = value;
        }

        /**
         * Obtiene el valor de la propiedad bpBankAct.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBPBankAct() {
            return bpBankAct;
        }

        /**
         * Define el valor de la propiedad bpBankAct.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBPBankAct(String value) {
            this.bpBankAct = value;
        }

        /**
         * Obtiene el valor de la propiedad bpBankCountry.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBPBankCountry() {
            return bpBankCountry;
        }

        /**
         * Define el valor de la propiedad bpBankCountry.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBPBankCountry(String value) {
            this.bpBankCountry = value;
        }

        /**
         * Obtiene el valor de la propiedad controlKey.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getControlKey() {
            return controlKey;
        }

        /**
         * Define el valor de la propiedad controlKey.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setControlKey(String value) {
            this.controlKey = value;
        }

        /**
         * Obtiene el valor de la propiedad paymentEngineStatus1.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentEngineStatus1() {
            return paymentEngineStatus1;
        }

        /**
         * Define el valor de la propiedad paymentEngineStatus1.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentEngineStatus1(String value) {
            this.paymentEngineStatus1 = value;
        }

        /**
         * Obtiene el valor de la propiedad paymentEngineStatus2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentEngineStatus2() {
            return paymentEngineStatus2;
        }

        /**
         * Define el valor de la propiedad paymentEngineStatus2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentEngineStatus2(String value) {
            this.paymentEngineStatus2 = value;
        }

        /**
         * Obtiene el valor de la propiedad paymentEngineStatus3.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentEngineStatus3() {
            return paymentEngineStatus3;
        }

        /**
         * Define el valor de la propiedad paymentEngineStatus3.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentEngineStatus3(String value) {
            this.paymentEngineStatus3 = value;
        }

        /**
         * Obtiene el valor de la propiedad stampTaxCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStampTaxCode() {
            return stampTaxCode;
        }

        /**
         * Define el valor de la propiedad stampTaxCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStampTaxCode(String value) {
            this.stampTaxCode = value;
        }

        /**
         * Obtiene el valor de la propiedad stampTaxAmount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getStampTaxAmount() {
            return stampTaxAmount;
        }

        /**
         * Define el valor de la propiedad stampTaxAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setStampTaxAmount(BigDecimal value) {
            this.stampTaxAmount = value;
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
         * Obtiene el valor de la propiedad interestAmount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getInterestAmount() {
            return interestAmount;
        }

        /**
         * Define el valor de la propiedad interestAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setInterestAmount(BigDecimal value) {
            this.interestAmount = value;
        }

        /**
         * Obtiene el valor de la propiedad discountAmount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDiscountAmount() {
            return discountAmount;
        }

        /**
         * Define el valor de la propiedad discountAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDiscountAmount(BigDecimal value) {
            this.discountAmount = value;
        }

        /**
         * Obtiene el valor de la propiedad fineAmount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFineAmount() {
            return fineAmount;
        }

        /**
         * Define el valor de la propiedad fineAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFineAmount(BigDecimal value) {
            this.fineAmount = value;
        }

        /**
         * Obtiene el valor de la propiedad interestDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getInterestDate() {
            return interestDate;
        }

        /**
         * Define el valor de la propiedad interestDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setInterestDate(XMLGregorianCalendar value) {
            this.interestDate = value;
        }

        /**
         * Obtiene el valor de la propiedad discountDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDiscountDate() {
            return discountDate;
        }

        /**
         * Define el valor de la propiedad discountDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDiscountDate(XMLGregorianCalendar value) {
            this.discountDate = value;
        }

        /**
         * Obtiene el valor de la propiedad fineDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFineDate() {
            return fineDate;
        }

        /**
         * Define el valor de la propiedad fineDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFineDate(XMLGregorianCalendar value) {
            this.fineDate = value;
        }

        /**
         * Obtiene el valor de la propiedad iofAmount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getIOFAmount() {
            return iofAmount;
        }

        /**
         * Define el valor de la propiedad iofAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setIOFAmount(BigDecimal value) {
            this.iofAmount = value;
        }

        /**
         * Obtiene el valor de la propiedad serviceFeeAmount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getServiceFeeAmount() {
            return serviceFeeAmount;
        }

        /**
         * Define el valor de la propiedad serviceFeeAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setServiceFeeAmount(BigDecimal value) {
            this.serviceFeeAmount = value;
        }

        /**
         * Obtiene el valor de la propiedad otherExpensesAmount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOtherExpensesAmount() {
            return otherExpensesAmount;
        }

        /**
         * Define el valor de la propiedad otherExpensesAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOtherExpensesAmount(BigDecimal value) {
            this.otherExpensesAmount = value;
        }

        /**
         * Obtiene el valor de la propiedad otherIncomesAmount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOtherIncomesAmount() {
            return otherIncomesAmount;
        }

        /**
         * Define el valor de la propiedad otherIncomesAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOtherIncomesAmount(BigDecimal value) {
            this.otherIncomesAmount = value;
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
        protected List<Payment.CashFlowAssignments.CashFlowAssignment> cashFlowAssignment;

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
         * {@link Payment.CashFlowAssignments.CashFlowAssignment }
         * 
         * 
         */
        public List<Payment.CashFlowAssignments.CashFlowAssignment> getCashFlowAssignment() {
            if (cashFlowAssignment == null) {
                cashFlowAssignment = new ArrayList<Payment.CashFlowAssignments.CashFlowAssignment>();
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
            protected BigDecimal credit;
            @XmlElement(name = "PaymentMeans")
            protected String paymentMeans;
            @XmlElement(name = "CheckNumber")
            protected String checkNumber;
            @XmlElement(name = "AmountLC")
            protected BigDecimal amountLC;
            @XmlElement(name = "AmountFC")
            protected BigDecimal amountFC;
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
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCredit() {
                return credit;
            }

            /**
             * Define el valor de la propiedad credit.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCredit(BigDecimal value) {
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
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmountLC() {
                return amountLC;
            }

            /**
             * Define el valor de la propiedad amountLC.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmountLC(BigDecimal value) {
                this.amountLC = value;
            }

            /**
             * Obtiene el valor de la propiedad amountFC.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmountFC() {
                return amountFC;
            }

            /**
             * Define el valor de la propiedad amountFC.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmountFC(BigDecimal value) {
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
     *         &lt;element name="PaymentAccount" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SumPaid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="SumPaidFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Decription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="VatGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GrossAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="ProfitCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="VatAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="ProfitCenter2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProfitCenter3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProfitCenter4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProfitCenter5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="EqualizationVatAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="U_Tercero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "paymentAccount"
    })
    public static class PaymentAccounts {

        @XmlElement(name = "PaymentAccount")
        protected List<Payment.PaymentAccounts.PaymentAccount> paymentAccount;

        /**
         * Gets the value of the paymentAccount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentAccount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Payment.PaymentAccounts.PaymentAccount }
         * 
         * 
         */
        public List<Payment.PaymentAccounts.PaymentAccount> getPaymentAccount() {
            if (paymentAccount == null) {
                paymentAccount = new ArrayList<Payment.PaymentAccounts.PaymentAccount>();
            }
            return this.paymentAccount;
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
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SumPaid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="SumPaidFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Decription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="VatGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GrossAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="ProfitCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="VatAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="ProfitCenter2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProfitCenter3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProfitCenter4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProfitCenter5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="EqualizationVatAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="U_Tercero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        public static class PaymentAccount {

            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "AccountCode")
            protected String accountCode;
            @XmlElement(name = "SumPaid")
            protected BigDecimal sumPaid;
            @XmlElement(name = "SumPaidFC")
            protected BigDecimal sumPaidFC;
            @XmlElement(name = "Decription")
            protected String decription;
            @XmlElement(name = "VatGroup")
            protected String vatGroup;
            @XmlElement(name = "AccountName")
            protected String accountName;
            @XmlElement(name = "GrossAmount")
            protected BigDecimal grossAmount;
            @XmlElement(name = "ProfitCenter")
            protected String profitCenter;
            @XmlElement(name = "ProjectCode")
            protected String projectCode;
            @XmlElement(name = "VatAmount")
            protected BigDecimal vatAmount;
            @XmlElement(name = "ProfitCenter2")
            protected String profitCenter2;
            @XmlElement(name = "ProfitCenter3")
            protected String profitCenter3;
            @XmlElement(name = "ProfitCenter4")
            protected String profitCenter4;
            @XmlElement(name = "ProfitCenter5")
            protected String profitCenter5;
            @XmlElement(name = "LocationCode")
            protected Long locationCode;
            @XmlElement(name = "EqualizationVatAmount")
            protected BigDecimal equalizationVatAmount;
            @XmlElement(name = "U_Tercero")
            protected String uTercero;

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
             * Obtiene el valor de la propiedad sumPaid.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSumPaid() {
                return sumPaid;
            }

            /**
             * Define el valor de la propiedad sumPaid.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSumPaid(BigDecimal value) {
                this.sumPaid = value;
            }

            /**
             * Obtiene el valor de la propiedad sumPaidFC.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSumPaidFC() {
                return sumPaidFC;
            }

            /**
             * Define el valor de la propiedad sumPaidFC.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSumPaidFC(BigDecimal value) {
                this.sumPaidFC = value;
            }

            /**
             * Obtiene el valor de la propiedad decription.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDecription() {
                return decription;
            }

            /**
             * Define el valor de la propiedad decription.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDecription(String value) {
                this.decription = value;
            }

            /**
             * Obtiene el valor de la propiedad vatGroup.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVatGroup() {
                return vatGroup;
            }

            /**
             * Define el valor de la propiedad vatGroup.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVatGroup(String value) {
                this.vatGroup = value;
            }

            /**
             * Obtiene el valor de la propiedad accountName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountName() {
                return accountName;
            }

            /**
             * Define el valor de la propiedad accountName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountName(String value) {
                this.accountName = value;
            }

            /**
             * Obtiene el valor de la propiedad grossAmount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getGrossAmount() {
                return grossAmount;
            }

            /**
             * Define el valor de la propiedad grossAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setGrossAmount(BigDecimal value) {
                this.grossAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad profitCenter.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfitCenter() {
                return profitCenter;
            }

            /**
             * Define el valor de la propiedad profitCenter.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfitCenter(String value) {
                this.profitCenter = value;
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
             * Obtiene el valor de la propiedad vatAmount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVatAmount() {
                return vatAmount;
            }

            /**
             * Define el valor de la propiedad vatAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVatAmount(BigDecimal value) {
                this.vatAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad profitCenter2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfitCenter2() {
                return profitCenter2;
            }

            /**
             * Define el valor de la propiedad profitCenter2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfitCenter2(String value) {
                this.profitCenter2 = value;
            }

            /**
             * Obtiene el valor de la propiedad profitCenter3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfitCenter3() {
                return profitCenter3;
            }

            /**
             * Define el valor de la propiedad profitCenter3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfitCenter3(String value) {
                this.profitCenter3 = value;
            }

            /**
             * Obtiene el valor de la propiedad profitCenter4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfitCenter4() {
                return profitCenter4;
            }

            /**
             * Define el valor de la propiedad profitCenter4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfitCenter4(String value) {
                this.profitCenter4 = value;
            }

            /**
             * Obtiene el valor de la propiedad profitCenter5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfitCenter5() {
                return profitCenter5;
            }

            /**
             * Define el valor de la propiedad profitCenter5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfitCenter5(String value) {
                this.profitCenter5 = value;
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
             * Obtiene el valor de la propiedad equalizationVatAmount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getEqualizationVatAmount() {
                return equalizationVatAmount;
            }

            /**
             * Define el valor de la propiedad equalizationVatAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setEqualizationVatAmount(BigDecimal value) {
                this.equalizationVatAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad uTercero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUTercero() {
                return uTercero;
            }

            /**
             * Define el valor de la propiedad uTercero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUTercero(String value) {
                this.uTercero = value;
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
     *         &lt;element name="PaymentCheck" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccounttNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Trnsfrable" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CheckSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CheckAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="CheckAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ManualCheck" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FiscalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OriginallyIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Endorse" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="EndorsableCheckNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="U_Aprobacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_Asesor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_CR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_Fecha_Conf" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="U_Manejo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "paymentCheck"
    })
    public static class PaymentChecks {

        @XmlElement(name = "PaymentCheck")
        protected List<Payment.PaymentChecks.PaymentCheck> paymentCheck;

        /**
         * Gets the value of the paymentCheck property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentCheck property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentCheck().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Payment.PaymentChecks.PaymentCheck }
         * 
         * 
         */
        public List<Payment.PaymentChecks.PaymentCheck> getPaymentCheck() {
            if (paymentCheck == null) {
                paymentCheck = new ArrayList<Payment.PaymentChecks.PaymentCheck>();
            }
            return this.paymentCheck;
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
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccounttNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Trnsfrable" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CheckSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CheckAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="CheckAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ManualCheck" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FiscalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OriginallyIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Endorse" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="EndorsableCheckNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="U_Aprobacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_Asesor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_CR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_Fecha_Conf" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="U_Manejo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        public static class PaymentCheck {

            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "DueDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dueDate;
            @XmlElement(name = "CheckNumber")
            protected Long checkNumber;
            @XmlElement(name = "BankCode")
            protected String bankCode;
            @XmlElement(name = "Branch")
            protected String branch;
            @XmlElement(name = "AccounttNum")
            protected String accounttNum;
            @XmlElement(name = "Details")
            protected String details;
            @XmlElement(name = "Trnsfrable")
            protected String trnsfrable;
            @XmlElement(name = "CheckSum")
            protected BigDecimal checkSum;
            @XmlElement(name = "Currency")
            protected String currency;
            @XmlElement(name = "CountryCode")
            protected String countryCode;
            @XmlElement(name = "CheckAbsEntry")
            protected Long checkAbsEntry;
            @XmlElement(name = "CheckAccount")
            protected String checkAccount;
            @XmlElement(name = "ManualCheck")
            protected String manualCheck;
            @XmlElement(name = "FiscalID")
            protected String fiscalID;
            @XmlElement(name = "OriginallyIssuedBy")
            protected String originallyIssuedBy;
            @XmlElement(name = "Endorse")
            protected String endorse;
            @XmlElement(name = "EndorsableCheckNo")
            protected Long endorsableCheckNo;
            @XmlElement(name = "U_Aprobacion")
            protected String uAprobacion;
            @XmlElement(name = "U_Asesor")
            protected String uAsesor;
            @XmlElement(name = "U_CR")
            protected String ucr;
            @XmlElement(name = "U_Fecha_Conf")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar uFechaConf;
            @XmlElement(name = "U_Manejo")
            protected String uManejo;

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
             * Obtiene el valor de la propiedad checkNumber.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getCheckNumber() {
                return checkNumber;
            }

            /**
             * Define el valor de la propiedad checkNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setCheckNumber(Long value) {
                this.checkNumber = value;
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
             * Obtiene el valor de la propiedad branch.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranch() {
                return branch;
            }

            /**
             * Define el valor de la propiedad branch.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranch(String value) {
                this.branch = value;
            }

            /**
             * Obtiene el valor de la propiedad accounttNum.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccounttNum() {
                return accounttNum;
            }

            /**
             * Define el valor de la propiedad accounttNum.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccounttNum(String value) {
                this.accounttNum = value;
            }

            /**
             * Obtiene el valor de la propiedad details.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDetails() {
                return details;
            }

            /**
             * Define el valor de la propiedad details.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDetails(String value) {
                this.details = value;
            }

            /**
             * Obtiene el valor de la propiedad trnsfrable.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrnsfrable() {
                return trnsfrable;
            }

            /**
             * Define el valor de la propiedad trnsfrable.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrnsfrable(String value) {
                this.trnsfrable = value;
            }

            /**
             * Obtiene el valor de la propiedad checkSum.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCheckSum() {
                return checkSum;
            }

            /**
             * Define el valor de la propiedad checkSum.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCheckSum(BigDecimal value) {
                this.checkSum = value;
            }

            /**
             * Obtiene el valor de la propiedad currency.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrency() {
                return currency;
            }

            /**
             * Define el valor de la propiedad currency.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrency(String value) {
                this.currency = value;
            }

            /**
             * Obtiene el valor de la propiedad countryCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryCode() {
                return countryCode;
            }

            /**
             * Define el valor de la propiedad countryCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryCode(String value) {
                this.countryCode = value;
            }

            /**
             * Obtiene el valor de la propiedad checkAbsEntry.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getCheckAbsEntry() {
                return checkAbsEntry;
            }

            /**
             * Define el valor de la propiedad checkAbsEntry.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setCheckAbsEntry(Long value) {
                this.checkAbsEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad checkAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckAccount() {
                return checkAccount;
            }

            /**
             * Define el valor de la propiedad checkAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckAccount(String value) {
                this.checkAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad manualCheck.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getManualCheck() {
                return manualCheck;
            }

            /**
             * Define el valor de la propiedad manualCheck.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setManualCheck(String value) {
                this.manualCheck = value;
            }

            /**
             * Obtiene el valor de la propiedad fiscalID.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFiscalID() {
                return fiscalID;
            }

            /**
             * Define el valor de la propiedad fiscalID.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFiscalID(String value) {
                this.fiscalID = value;
            }

            /**
             * Obtiene el valor de la propiedad originallyIssuedBy.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginallyIssuedBy() {
                return originallyIssuedBy;
            }

            /**
             * Define el valor de la propiedad originallyIssuedBy.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginallyIssuedBy(String value) {
                this.originallyIssuedBy = value;
            }

            /**
             * Obtiene el valor de la propiedad endorse.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEndorse() {
                return endorse;
            }

            /**
             * Define el valor de la propiedad endorse.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEndorse(String value) {
                this.endorse = value;
            }

            /**
             * Obtiene el valor de la propiedad endorsableCheckNo.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getEndorsableCheckNo() {
                return endorsableCheckNo;
            }

            /**
             * Define el valor de la propiedad endorsableCheckNo.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setEndorsableCheckNo(Long value) {
                this.endorsableCheckNo = value;
            }

            /**
             * Obtiene el valor de la propiedad uAprobacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUAprobacion() {
                return uAprobacion;
            }

            /**
             * Define el valor de la propiedad uAprobacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUAprobacion(String value) {
                this.uAprobacion = value;
            }

            /**
             * Obtiene el valor de la propiedad uAsesor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUAsesor() {
                return uAsesor;
            }

            /**
             * Define el valor de la propiedad uAsesor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUAsesor(String value) {
                this.uAsesor = value;
            }

            /**
             * Obtiene el valor de la propiedad ucr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUCR() {
                return ucr;
            }

            /**
             * Define el valor de la propiedad ucr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUCR(String value) {
                this.ucr = value;
            }

            /**
             * Obtiene el valor de la propiedad uFechaConf.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getUFechaConf() {
                return uFechaConf;
            }

            /**
             * Define el valor de la propiedad uFechaConf.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setUFechaConf(XMLGregorianCalendar value) {
                this.uFechaConf = value;
            }

            /**
             * Obtiene el valor de la propiedad uManejo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUManejo() {
                return uManejo;
            }

            /**
             * Define el valor de la propiedad uManejo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUManejo(String value) {
                this.uManejo = value;
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
     *         &lt;element name="PaymentCreditCard" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="CreditCard" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="CreditAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CardValidUntil" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="VoucherNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OwnerIdNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OwnerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PaymentMethodCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="NumOfPayments" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="FirstPaymentDue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="FirstPaymentSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AdditionalPaymentSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="CreditSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="CreditCur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CreditRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="ConfirmationNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NumOfCreditPayments" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="CreditType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="cr_Regular"/>
     *                         &lt;enumeration value="cr_Telephone"/>
     *                         &lt;enumeration value="cr_InternetTransaction"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SplitPayments" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
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
        "paymentCreditCard"
    })
    public static class PaymentCreditCards {

        @XmlElement(name = "PaymentCreditCard")
        protected List<Payment.PaymentCreditCards.PaymentCreditCard> paymentCreditCard;

        /**
         * Gets the value of the paymentCreditCard property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentCreditCard property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentCreditCard().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Payment.PaymentCreditCards.PaymentCreditCard }
         * 
         * 
         */
        public List<Payment.PaymentCreditCards.PaymentCreditCard> getPaymentCreditCard() {
            if (paymentCreditCard == null) {
                paymentCreditCard = new ArrayList<Payment.PaymentCreditCards.PaymentCreditCard>();
            }
            return this.paymentCreditCard;
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
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="CreditCard" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="CreditAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CardValidUntil" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="VoucherNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OwnerIdNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OwnerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PaymentMethodCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="NumOfPayments" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="FirstPaymentDue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="FirstPaymentSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AdditionalPaymentSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="CreditSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="CreditCur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CreditRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="ConfirmationNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NumOfCreditPayments" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="CreditType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="cr_Regular"/>
         *               &lt;enumeration value="cr_Telephone"/>
         *               &lt;enumeration value="cr_InternetTransaction"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SplitPayments" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
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
        public static class PaymentCreditCard {

            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "CreditCard")
            protected Long creditCard;
            @XmlElement(name = "CreditAcct")
            protected String creditAcct;
            @XmlElement(name = "CreditCardNumber")
            protected String creditCardNumber;
            @XmlElement(name = "CardValidUntil")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar cardValidUntil;
            @XmlElement(name = "VoucherNum")
            protected String voucherNum;
            @XmlElement(name = "OwnerIdNum")
            protected String ownerIdNum;
            @XmlElement(name = "OwnerPhone")
            protected String ownerPhone;
            @XmlElement(name = "PaymentMethodCode")
            protected Long paymentMethodCode;
            @XmlElement(name = "NumOfPayments")
            protected Long numOfPayments;
            @XmlElement(name = "FirstPaymentDue")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar firstPaymentDue;
            @XmlElement(name = "FirstPaymentSum")
            protected BigDecimal firstPaymentSum;
            @XmlElement(name = "AdditionalPaymentSum")
            protected BigDecimal additionalPaymentSum;
            @XmlElement(name = "CreditSum")
            protected BigDecimal creditSum;
            @XmlElement(name = "CreditCur")
            protected String creditCur;
            @XmlElement(name = "CreditRate")
            protected BigDecimal creditRate;
            @XmlElement(name = "ConfirmationNum")
            protected String confirmationNum;
            @XmlElement(name = "NumOfCreditPayments")
            protected Long numOfCreditPayments;
            @XmlElement(name = "CreditType")
            protected String creditType;
            @XmlElement(name = "SplitPayments")
            protected String splitPayments;

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
             * Obtiene el valor de la propiedad creditCard.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getCreditCard() {
                return creditCard;
            }

            /**
             * Define el valor de la propiedad creditCard.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setCreditCard(Long value) {
                this.creditCard = value;
            }

            /**
             * Obtiene el valor de la propiedad creditAcct.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreditAcct() {
                return creditAcct;
            }

            /**
             * Define el valor de la propiedad creditAcct.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreditAcct(String value) {
                this.creditAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad creditCardNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreditCardNumber() {
                return creditCardNumber;
            }

            /**
             * Define el valor de la propiedad creditCardNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreditCardNumber(String value) {
                this.creditCardNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad cardValidUntil.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCardValidUntil() {
                return cardValidUntil;
            }

            /**
             * Define el valor de la propiedad cardValidUntil.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCardValidUntil(XMLGregorianCalendar value) {
                this.cardValidUntil = value;
            }

            /**
             * Obtiene el valor de la propiedad voucherNum.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVoucherNum() {
                return voucherNum;
            }

            /**
             * Define el valor de la propiedad voucherNum.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVoucherNum(String value) {
                this.voucherNum = value;
            }

            /**
             * Obtiene el valor de la propiedad ownerIdNum.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnerIdNum() {
                return ownerIdNum;
            }

            /**
             * Define el valor de la propiedad ownerIdNum.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwnerIdNum(String value) {
                this.ownerIdNum = value;
            }

            /**
             * Obtiene el valor de la propiedad ownerPhone.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnerPhone() {
                return ownerPhone;
            }

            /**
             * Define el valor de la propiedad ownerPhone.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwnerPhone(String value) {
                this.ownerPhone = value;
            }

            /**
             * Obtiene el valor de la propiedad paymentMethodCode.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getPaymentMethodCode() {
                return paymentMethodCode;
            }

            /**
             * Define el valor de la propiedad paymentMethodCode.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setPaymentMethodCode(Long value) {
                this.paymentMethodCode = value;
            }

            /**
             * Obtiene el valor de la propiedad numOfPayments.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getNumOfPayments() {
                return numOfPayments;
            }

            /**
             * Define el valor de la propiedad numOfPayments.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setNumOfPayments(Long value) {
                this.numOfPayments = value;
            }

            /**
             * Obtiene el valor de la propiedad firstPaymentDue.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFirstPaymentDue() {
                return firstPaymentDue;
            }

            /**
             * Define el valor de la propiedad firstPaymentDue.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFirstPaymentDue(XMLGregorianCalendar value) {
                this.firstPaymentDue = value;
            }

            /**
             * Obtiene el valor de la propiedad firstPaymentSum.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFirstPaymentSum() {
                return firstPaymentSum;
            }

            /**
             * Define el valor de la propiedad firstPaymentSum.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFirstPaymentSum(BigDecimal value) {
                this.firstPaymentSum = value;
            }

            /**
             * Obtiene el valor de la propiedad additionalPaymentSum.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAdditionalPaymentSum() {
                return additionalPaymentSum;
            }

            /**
             * Define el valor de la propiedad additionalPaymentSum.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAdditionalPaymentSum(BigDecimal value) {
                this.additionalPaymentSum = value;
            }

            /**
             * Obtiene el valor de la propiedad creditSum.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCreditSum() {
                return creditSum;
            }

            /**
             * Define el valor de la propiedad creditSum.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCreditSum(BigDecimal value) {
                this.creditSum = value;
            }

            /**
             * Obtiene el valor de la propiedad creditCur.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreditCur() {
                return creditCur;
            }

            /**
             * Define el valor de la propiedad creditCur.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreditCur(String value) {
                this.creditCur = value;
            }

            /**
             * Obtiene el valor de la propiedad creditRate.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCreditRate() {
                return creditRate;
            }

            /**
             * Define el valor de la propiedad creditRate.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCreditRate(BigDecimal value) {
                this.creditRate = value;
            }

            /**
             * Obtiene el valor de la propiedad confirmationNum.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConfirmationNum() {
                return confirmationNum;
            }

            /**
             * Define el valor de la propiedad confirmationNum.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConfirmationNum(String value) {
                this.confirmationNum = value;
            }

            /**
             * Obtiene el valor de la propiedad numOfCreditPayments.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getNumOfCreditPayments() {
                return numOfCreditPayments;
            }

            /**
             * Define el valor de la propiedad numOfCreditPayments.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setNumOfCreditPayments(Long value) {
                this.numOfCreditPayments = value;
            }

            /**
             * Obtiene el valor de la propiedad creditType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreditType() {
                return creditType;
            }

            /**
             * Define el valor de la propiedad creditType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreditType(String value) {
                this.creditType = value;
            }

            /**
             * Obtiene el valor de la propiedad splitPayments.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSplitPayments() {
                return splitPayments;
            }

            /**
             * Define el valor de la propiedad splitPayments.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSplitPayments(String value) {
                this.splitPayments = value;
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
     *         &lt;element name="PaymentInvoice" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="SumApplied" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AppliedFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AppliedSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="DocRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="DocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="InvoiceType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="it_AllTransactions"/>
     *                         &lt;enumeration value="it_OpeningBalance"/>
     *                         &lt;enumeration value="it_ClosingBalance"/>
     *                         &lt;enumeration value="it_Invoice"/>
     *                         &lt;enumeration value="it_CredItnote"/>
     *                         &lt;enumeration value="it_TaxInvoice"/>
     *                         &lt;enumeration value="it_Return"/>
     *                         &lt;enumeration value="it_PurchaseInvoice"/>
     *                         &lt;enumeration value="it_PurchaseCreditNote"/>
     *                         &lt;enumeration value="it_PurchaseDeliveryNote"/>
     *                         &lt;enumeration value="it_PurchaseReturn"/>
     *                         &lt;enumeration value="it_Receipt"/>
     *                         &lt;enumeration value="it_Deposit"/>
     *                         &lt;enumeration value="it_JournalEntry"/>
     *                         &lt;enumeration value="it_PaymentAdvice"/>
     *                         &lt;enumeration value="it_ChequesForPayment"/>
     *                         &lt;enumeration value="it_StockReconciliations"/>
     *                         &lt;enumeration value="it_GeneralReceiptToStock"/>
     *                         &lt;enumeration value="it_GeneralReleaseFromStock"/>
     *                         &lt;enumeration value="it_TransferBetweenWarehouses"/>
     *                         &lt;enumeration value="it_WorkInstructions"/>
     *                         &lt;enumeration value="it_DeferredDeposit"/>
     *                         &lt;enumeration value="it_CorrectionInvoice"/>
     *                         &lt;enumeration value="it_APCorrectionInvoice"/>
     *                         &lt;enumeration value="it_ARCorrectionInvoice"/>
     *                         &lt;enumeration value="it_DownPayment"/>
     *                         &lt;enumeration value="it_PurchaseDownPayment"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="PaidSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="InstallmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="WitholdingTaxApplied" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="WitholdingTaxAppliedFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="WitholdingTaxAppliedSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="LinkDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TotalDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TotalDiscountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TotalDiscountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="U_me_pago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "paymentInvoice"
    })
    public static class PaymentInvoices {

        @XmlElement(name = "PaymentInvoice")
        protected List<Payment.PaymentInvoices.PaymentInvoice> paymentInvoice;

        /**
         * Gets the value of the paymentInvoice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentInvoice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentInvoice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Payment.PaymentInvoices.PaymentInvoice }
         * 
         * 
         */
        public List<Payment.PaymentInvoices.PaymentInvoice> getPaymentInvoice() {
            if (paymentInvoice == null) {
                paymentInvoice = new ArrayList<Payment.PaymentInvoices.PaymentInvoice>();
            }
            return this.paymentInvoice;
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
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="SumApplied" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AppliedFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AppliedSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="DocRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="DocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="InvoiceType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="it_AllTransactions"/>
         *               &lt;enumeration value="it_OpeningBalance"/>
         *               &lt;enumeration value="it_ClosingBalance"/>
         *               &lt;enumeration value="it_Invoice"/>
         *               &lt;enumeration value="it_CredItnote"/>
         *               &lt;enumeration value="it_TaxInvoice"/>
         *               &lt;enumeration value="it_Return"/>
         *               &lt;enumeration value="it_PurchaseInvoice"/>
         *               &lt;enumeration value="it_PurchaseCreditNote"/>
         *               &lt;enumeration value="it_PurchaseDeliveryNote"/>
         *               &lt;enumeration value="it_PurchaseReturn"/>
         *               &lt;enumeration value="it_Receipt"/>
         *               &lt;enumeration value="it_Deposit"/>
         *               &lt;enumeration value="it_JournalEntry"/>
         *               &lt;enumeration value="it_PaymentAdvice"/>
         *               &lt;enumeration value="it_ChequesForPayment"/>
         *               &lt;enumeration value="it_StockReconciliations"/>
         *               &lt;enumeration value="it_GeneralReceiptToStock"/>
         *               &lt;enumeration value="it_GeneralReleaseFromStock"/>
         *               &lt;enumeration value="it_TransferBetweenWarehouses"/>
         *               &lt;enumeration value="it_WorkInstructions"/>
         *               &lt;enumeration value="it_DeferredDeposit"/>
         *               &lt;enumeration value="it_CorrectionInvoice"/>
         *               &lt;enumeration value="it_APCorrectionInvoice"/>
         *               &lt;enumeration value="it_ARCorrectionInvoice"/>
         *               &lt;enumeration value="it_DownPayment"/>
         *               &lt;enumeration value="it_PurchaseDownPayment"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="PaidSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="InstallmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="WitholdingTaxApplied" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="WitholdingTaxAppliedFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="WitholdingTaxAppliedSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="LinkDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TotalDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TotalDiscountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TotalDiscountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="U_me_pago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        public static class PaymentInvoice {

            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "DocEntry")
            protected Long docEntry;
            @XmlElement(name = "SumApplied")
            protected BigDecimal sumApplied;
            @XmlElement(name = "AppliedFC")
            protected BigDecimal appliedFC;
            @XmlElement(name = "AppliedSys")
            protected BigDecimal appliedSys;
            @XmlElement(name = "DocRate")
            protected BigDecimal docRate;
            @XmlElement(name = "DocLine")
            protected Long docLine;
            @XmlElement(name = "InvoiceType")
            protected String invoiceType;
            @XmlElement(name = "DiscountPercent")
            protected BigDecimal discountPercent;
            @XmlElement(name = "PaidSum")
            protected BigDecimal paidSum;
            @XmlElement(name = "InstallmentId")
            protected Long installmentId;
            @XmlElement(name = "WitholdingTaxApplied")
            protected BigDecimal witholdingTaxApplied;
            @XmlElement(name = "WitholdingTaxAppliedFC")
            protected BigDecimal witholdingTaxAppliedFC;
            @XmlElement(name = "WitholdingTaxAppliedSC")
            protected BigDecimal witholdingTaxAppliedSC;
            @XmlElement(name = "LinkDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar linkDate;
            @XmlElement(name = "DistributionRule")
            protected String distributionRule;
            @XmlElement(name = "DistributionRule2")
            protected String distributionRule2;
            @XmlElement(name = "DistributionRule3")
            protected String distributionRule3;
            @XmlElement(name = "DistributionRule4")
            protected String distributionRule4;
            @XmlElement(name = "DistributionRule5")
            protected String distributionRule5;
            @XmlElement(name = "TotalDiscount")
            protected BigDecimal totalDiscount;
            @XmlElement(name = "TotalDiscountFC")
            protected BigDecimal totalDiscountFC;
            @XmlElement(name = "TotalDiscountSC")
            protected BigDecimal totalDiscountSC;
            @XmlElement(name = "U_me_pago")
            protected String uMePago;

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
             * Obtiene el valor de la propiedad docEntry.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getDocEntry() {
                return docEntry;
            }

            /**
             * Define el valor de la propiedad docEntry.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setDocEntry(Long value) {
                this.docEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad sumApplied.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSumApplied() {
                return sumApplied;
            }

            /**
             * Define el valor de la propiedad sumApplied.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSumApplied(BigDecimal value) {
                this.sumApplied = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedFC.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAppliedFC() {
                return appliedFC;
            }

            /**
             * Define el valor de la propiedad appliedFC.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAppliedFC(BigDecimal value) {
                this.appliedFC = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedSys.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAppliedSys() {
                return appliedSys;
            }

            /**
             * Define el valor de la propiedad appliedSys.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAppliedSys(BigDecimal value) {
                this.appliedSys = value;
            }

            /**
             * Obtiene el valor de la propiedad docRate.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDocRate() {
                return docRate;
            }

            /**
             * Define el valor de la propiedad docRate.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDocRate(BigDecimal value) {
                this.docRate = value;
            }

            /**
             * Obtiene el valor de la propiedad docLine.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getDocLine() {
                return docLine;
            }

            /**
             * Define el valor de la propiedad docLine.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setDocLine(Long value) {
                this.docLine = value;
            }

            /**
             * Obtiene el valor de la propiedad invoiceType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvoiceType() {
                return invoiceType;
            }

            /**
             * Define el valor de la propiedad invoiceType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvoiceType(String value) {
                this.invoiceType = value;
            }

            /**
             * Obtiene el valor de la propiedad discountPercent.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDiscountPercent() {
                return discountPercent;
            }

            /**
             * Define el valor de la propiedad discountPercent.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDiscountPercent(BigDecimal value) {
                this.discountPercent = value;
            }

            /**
             * Obtiene el valor de la propiedad paidSum.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPaidSum() {
                return paidSum;
            }

            /**
             * Define el valor de la propiedad paidSum.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPaidSum(BigDecimal value) {
                this.paidSum = value;
            }

            /**
             * Obtiene el valor de la propiedad installmentId.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getInstallmentId() {
                return installmentId;
            }

            /**
             * Define el valor de la propiedad installmentId.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setInstallmentId(Long value) {
                this.installmentId = value;
            }

            /**
             * Obtiene el valor de la propiedad witholdingTaxApplied.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getWitholdingTaxApplied() {
                return witholdingTaxApplied;
            }

            /**
             * Define el valor de la propiedad witholdingTaxApplied.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setWitholdingTaxApplied(BigDecimal value) {
                this.witholdingTaxApplied = value;
            }

            /**
             * Obtiene el valor de la propiedad witholdingTaxAppliedFC.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getWitholdingTaxAppliedFC() {
                return witholdingTaxAppliedFC;
            }

            /**
             * Define el valor de la propiedad witholdingTaxAppliedFC.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setWitholdingTaxAppliedFC(BigDecimal value) {
                this.witholdingTaxAppliedFC = value;
            }

            /**
             * Obtiene el valor de la propiedad witholdingTaxAppliedSC.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getWitholdingTaxAppliedSC() {
                return witholdingTaxAppliedSC;
            }

            /**
             * Define el valor de la propiedad witholdingTaxAppliedSC.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setWitholdingTaxAppliedSC(BigDecimal value) {
                this.witholdingTaxAppliedSC = value;
            }

            /**
             * Obtiene el valor de la propiedad linkDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getLinkDate() {
                return linkDate;
            }

            /**
             * Define el valor de la propiedad linkDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setLinkDate(XMLGregorianCalendar value) {
                this.linkDate = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDistributionRule() {
                return distributionRule;
            }

            /**
             * Define el valor de la propiedad distributionRule.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDistributionRule(String value) {
                this.distributionRule = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDistributionRule2() {
                return distributionRule2;
            }

            /**
             * Define el valor de la propiedad distributionRule2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDistributionRule2(String value) {
                this.distributionRule2 = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDistributionRule3() {
                return distributionRule3;
            }

            /**
             * Define el valor de la propiedad distributionRule3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDistributionRule3(String value) {
                this.distributionRule3 = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDistributionRule4() {
                return distributionRule4;
            }

            /**
             * Define el valor de la propiedad distributionRule4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDistributionRule4(String value) {
                this.distributionRule4 = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDistributionRule5() {
                return distributionRule5;
            }

            /**
             * Define el valor de la propiedad distributionRule5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDistributionRule5(String value) {
                this.distributionRule5 = value;
            }

            /**
             * Obtiene el valor de la propiedad totalDiscount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalDiscount() {
                return totalDiscount;
            }

            /**
             * Define el valor de la propiedad totalDiscount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalDiscount(BigDecimal value) {
                this.totalDiscount = value;
            }

            /**
             * Obtiene el valor de la propiedad totalDiscountFC.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalDiscountFC() {
                return totalDiscountFC;
            }

            /**
             * Define el valor de la propiedad totalDiscountFC.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalDiscountFC(BigDecimal value) {
                this.totalDiscountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad totalDiscountSC.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalDiscountSC() {
                return totalDiscountSC;
            }

            /**
             * Define el valor de la propiedad totalDiscountSC.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalDiscountSC(BigDecimal value) {
                this.totalDiscountSC = value;
            }

            /**
             * Obtiene el valor de la propiedad uMePago.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUMePago() {
                return uMePago;
            }

            /**
             * Define el valor de la propiedad uMePago.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUMePago(String value) {
                this.uMePago = value;
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
     *         &lt;element name="Payments_ApprovalRequest" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="ApprovalTemplatesID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
        "paymentsApprovalRequest"
    })
    public static class PaymentsApprovalRequests {

        @XmlElement(name = "Payments_ApprovalRequest")
        protected List<Payment.PaymentsApprovalRequests.PaymentsApprovalRequest> paymentsApprovalRequest;

        /**
         * Gets the value of the paymentsApprovalRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentsApprovalRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentsApprovalRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Payment.PaymentsApprovalRequests.PaymentsApprovalRequest }
         * 
         * 
         */
        public List<Payment.PaymentsApprovalRequests.PaymentsApprovalRequest> getPaymentsApprovalRequest() {
            if (paymentsApprovalRequest == null) {
                paymentsApprovalRequest = new ArrayList<Payment.PaymentsApprovalRequests.PaymentsApprovalRequest>();
            }
            return this.paymentsApprovalRequest;
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
         *         &lt;element name="ApprovalTemplatesID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
        public static class PaymentsApprovalRequest {

            @XmlElement(name = "ApprovalTemplatesID")
            protected Long approvalTemplatesID;
            @XmlElement(name = "Remarks")
            protected String remarks;

            /**
             * Obtiene el valor de la propiedad approvalTemplatesID.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getApprovalTemplatesID() {
                return approvalTemplatesID;
            }

            /**
             * Define el valor de la propiedad approvalTemplatesID.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setApprovalTemplatesID(Long value) {
                this.approvalTemplatesID = value;
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
     *         &lt;element name="WithholdingTaxCertificatesData" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="POICodeRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="POICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Certificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WTaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PeriodIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WhtAbsId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Series" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="SumVATAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="SumDocTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="SumBaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="SumAccumAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="SumPercAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="WTGroupsCollection" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="WTGroups" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="WTAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="SumVATAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="SumDocTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="SumBaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="SumAccumAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="SumPerceptAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="DocsInWTGroupsCollection" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="DocsInWTGroups" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;all>
     *                                                           &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                                           &lt;element name="DocObjType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="VATAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                                           &lt;element name="DocTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                                           &lt;element name="BaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                                           &lt;element name="AccumAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                                           &lt;element name="PerceptAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                                           &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                                         &lt;/all>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
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
        "withholdingTaxCertificatesData"
    })
    public static class WithholdingTaxCertificatesCollection {

        @XmlElement(name = "WithholdingTaxCertificatesData")
        protected List<Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData> withholdingTaxCertificatesData;

        /**
         * Gets the value of the withholdingTaxCertificatesData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the withholdingTaxCertificatesData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWithholdingTaxCertificatesData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData }
         * 
         * 
         */
        public List<Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData> getWithholdingTaxCertificatesData() {
            if (withholdingTaxCertificatesData == null) {
                withholdingTaxCertificatesData = new ArrayList<Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData>();
            }
            return this.withholdingTaxCertificatesData;
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
         *         &lt;element name="POICodeRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="POICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Certificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WTaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PeriodIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WhtAbsId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Series" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="SumVATAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="SumDocTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="SumBaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="SumAccumAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="SumPercAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="WTGroupsCollection" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="WTGroups" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="WTAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="SumVATAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="SumDocTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="SumBaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="SumAccumAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="SumPerceptAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="DocsInWTGroupsCollection" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="DocsInWTGroups" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;all>
         *                                                 &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                                                 &lt;element name="DocObjType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="VATAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                                                 &lt;element name="DocTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                                                 &lt;element name="BaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                                                 &lt;element name="AccumAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                                                 &lt;element name="PerceptAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                                                 &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        public static class WithholdingTaxCertificatesData {

            @XmlElement(name = "POICodeRef")
            protected String poiCodeRef;
            @XmlElement(name = "POICode")
            protected String poiCode;
            @XmlElement(name = "Certificate")
            protected String certificate;
            @XmlElement(name = "WTaxType")
            protected String wTaxType;
            @XmlElement(name = "PeriodIndicator")
            protected String periodIndicator;
            @XmlElement(name = "WhtAbsId")
            protected Long whtAbsId;
            @XmlElement(name = "Series")
            protected Long series;
            @XmlElement(name = "Number")
            protected Long number;
            @XmlElement(name = "IssueDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar issueDate;
            @XmlElement(name = "SumVATAmount")
            protected BigDecimal sumVATAmount;
            @XmlElement(name = "SumDocTotal")
            protected BigDecimal sumDocTotal;
            @XmlElement(name = "SumBaseAmount")
            protected BigDecimal sumBaseAmount;
            @XmlElement(name = "SumAccumAmount")
            protected BigDecimal sumAccumAmount;
            @XmlElement(name = "SumPercAmount")
            protected BigDecimal sumPercAmount;
            @XmlElement(name = "WTGroupsCollection")
            protected Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection wtGroupsCollection;

            /**
             * Obtiene el valor de la propiedad poiCodeRef.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPOICodeRef() {
                return poiCodeRef;
            }

            /**
             * Define el valor de la propiedad poiCodeRef.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPOICodeRef(String value) {
                this.poiCodeRef = value;
            }

            /**
             * Obtiene el valor de la propiedad poiCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPOICode() {
                return poiCode;
            }

            /**
             * Define el valor de la propiedad poiCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPOICode(String value) {
                this.poiCode = value;
            }

            /**
             * Obtiene el valor de la propiedad certificate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCertificate() {
                return certificate;
            }

            /**
             * Define el valor de la propiedad certificate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCertificate(String value) {
                this.certificate = value;
            }

            /**
             * Obtiene el valor de la propiedad wTaxType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWTaxType() {
                return wTaxType;
            }

            /**
             * Define el valor de la propiedad wTaxType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWTaxType(String value) {
                this.wTaxType = value;
            }

            /**
             * Obtiene el valor de la propiedad periodIndicator.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPeriodIndicator() {
                return periodIndicator;
            }

            /**
             * Define el valor de la propiedad periodIndicator.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPeriodIndicator(String value) {
                this.periodIndicator = value;
            }

            /**
             * Obtiene el valor de la propiedad whtAbsId.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getWhtAbsId() {
                return whtAbsId;
            }

            /**
             * Define el valor de la propiedad whtAbsId.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setWhtAbsId(Long value) {
                this.whtAbsId = value;
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
             * Obtiene el valor de la propiedad issueDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getIssueDate() {
                return issueDate;
            }

            /**
             * Define el valor de la propiedad issueDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setIssueDate(XMLGregorianCalendar value) {
                this.issueDate = value;
            }

            /**
             * Obtiene el valor de la propiedad sumVATAmount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSumVATAmount() {
                return sumVATAmount;
            }

            /**
             * Define el valor de la propiedad sumVATAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSumVATAmount(BigDecimal value) {
                this.sumVATAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad sumDocTotal.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSumDocTotal() {
                return sumDocTotal;
            }

            /**
             * Define el valor de la propiedad sumDocTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSumDocTotal(BigDecimal value) {
                this.sumDocTotal = value;
            }

            /**
             * Obtiene el valor de la propiedad sumBaseAmount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSumBaseAmount() {
                return sumBaseAmount;
            }

            /**
             * Define el valor de la propiedad sumBaseAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSumBaseAmount(BigDecimal value) {
                this.sumBaseAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad sumAccumAmount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSumAccumAmount() {
                return sumAccumAmount;
            }

            /**
             * Define el valor de la propiedad sumAccumAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSumAccumAmount(BigDecimal value) {
                this.sumAccumAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad sumPercAmount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSumPercAmount() {
                return sumPercAmount;
            }

            /**
             * Define el valor de la propiedad sumPercAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSumPercAmount(BigDecimal value) {
                this.sumPercAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad wtGroupsCollection.
             * 
             * @return
             *     possible object is
             *     {@link Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection }
             *     
             */
            public Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection getWTGroupsCollection() {
                return wtGroupsCollection;
            }

            /**
             * Define el valor de la propiedad wtGroupsCollection.
             * 
             * @param value
             *     allowed object is
             *     {@link Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection }
             *     
             */
            public void setWTGroupsCollection(Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection value) {
                this.wtGroupsCollection = value;
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
             *         &lt;element name="WTGroups" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="WTAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="SumVATAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="SumDocTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="SumBaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="SumAccumAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="SumPerceptAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="DocsInWTGroupsCollection" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="DocsInWTGroups" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;all>
             *                                       &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                                       &lt;element name="DocObjType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="VATAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                                       &lt;element name="DocTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                                       &lt;element name="BaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                                       &lt;element name="AccumAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                                       &lt;element name="PerceptAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                                       &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                "wtGroups"
            })
            public static class WTGroupsCollection {

                @XmlElement(name = "WTGroups")
                protected List<Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection.WTGroups> wtGroups;

                /**
                 * Gets the value of the wtGroups property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the wtGroups property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getWTGroups().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection.WTGroups }
                 * 
                 * 
                 */
                public List<Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection.WTGroups> getWTGroups() {
                    if (wtGroups == null) {
                        wtGroups = new ArrayList<Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection.WTGroups>();
                    }
                    return this.wtGroups;
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
                 *         &lt;element name="WTAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="SumVATAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="SumDocTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="SumBaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="SumAccumAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="SumPerceptAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="DocsInWTGroupsCollection" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="DocsInWTGroups" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;all>
                 *                             &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *                             &lt;element name="DocObjType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="VATAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *                             &lt;element name="DocTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *                             &lt;element name="BaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *                             &lt;element name="AccumAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *                             &lt;element name="PerceptAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *                             &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                public static class WTGroups {

                    @XmlElement(name = "WTAbsEntry")
                    protected Long wtAbsEntry;
                    @XmlElement(name = "Percent")
                    protected BigDecimal percent;
                    @XmlElement(name = "SumVATAmount")
                    protected BigDecimal sumVATAmount;
                    @XmlElement(name = "SumDocTotal")
                    protected BigDecimal sumDocTotal;
                    @XmlElement(name = "SumBaseAmount")
                    protected BigDecimal sumBaseAmount;
                    @XmlElement(name = "SumAccumAmount")
                    protected BigDecimal sumAccumAmount;
                    @XmlElement(name = "SumPerceptAmount")
                    protected BigDecimal sumPerceptAmount;
                    @XmlElement(name = "DocsInWTGroupsCollection")
                    protected Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection.WTGroups.DocsInWTGroupsCollection docsInWTGroupsCollection;

                    /**
                     * Obtiene el valor de la propiedad wtAbsEntry.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getWTAbsEntry() {
                        return wtAbsEntry;
                    }

                    /**
                     * Define el valor de la propiedad wtAbsEntry.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setWTAbsEntry(Long value) {
                        this.wtAbsEntry = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad percent.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getPercent() {
                        return percent;
                    }

                    /**
                     * Define el valor de la propiedad percent.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setPercent(BigDecimal value) {
                        this.percent = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad sumVATAmount.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getSumVATAmount() {
                        return sumVATAmount;
                    }

                    /**
                     * Define el valor de la propiedad sumVATAmount.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setSumVATAmount(BigDecimal value) {
                        this.sumVATAmount = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad sumDocTotal.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getSumDocTotal() {
                        return sumDocTotal;
                    }

                    /**
                     * Define el valor de la propiedad sumDocTotal.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setSumDocTotal(BigDecimal value) {
                        this.sumDocTotal = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad sumBaseAmount.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getSumBaseAmount() {
                        return sumBaseAmount;
                    }

                    /**
                     * Define el valor de la propiedad sumBaseAmount.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setSumBaseAmount(BigDecimal value) {
                        this.sumBaseAmount = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad sumAccumAmount.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getSumAccumAmount() {
                        return sumAccumAmount;
                    }

                    /**
                     * Define el valor de la propiedad sumAccumAmount.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setSumAccumAmount(BigDecimal value) {
                        this.sumAccumAmount = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad sumPerceptAmount.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getSumPerceptAmount() {
                        return sumPerceptAmount;
                    }

                    /**
                     * Define el valor de la propiedad sumPerceptAmount.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setSumPerceptAmount(BigDecimal value) {
                        this.sumPerceptAmount = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad docsInWTGroupsCollection.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection.WTGroups.DocsInWTGroupsCollection }
                     *     
                     */
                    public Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection.WTGroups.DocsInWTGroupsCollection getDocsInWTGroupsCollection() {
                        return docsInWTGroupsCollection;
                    }

                    /**
                     * Define el valor de la propiedad docsInWTGroupsCollection.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection.WTGroups.DocsInWTGroupsCollection }
                     *     
                     */
                    public void setDocsInWTGroupsCollection(Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection.WTGroups.DocsInWTGroupsCollection value) {
                        this.docsInWTGroupsCollection = value;
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
                     *         &lt;element name="DocsInWTGroups" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;all>
                     *                   &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                     *                   &lt;element name="DocObjType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="VATAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                     *                   &lt;element name="DocTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                     *                   &lt;element name="BaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                     *                   &lt;element name="AccumAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                     *                   &lt;element name="PerceptAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                     *                   &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                        "docsInWTGroups"
                    })
                    public static class DocsInWTGroupsCollection {

                        @XmlElement(name = "DocsInWTGroups")
                        protected List<Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection.WTGroups.DocsInWTGroupsCollection.DocsInWTGroups> docsInWTGroups;

                        /**
                         * Gets the value of the docsInWTGroups property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the docsInWTGroups property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getDocsInWTGroups().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection.WTGroups.DocsInWTGroupsCollection.DocsInWTGroups }
                         * 
                         * 
                         */
                        public List<Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection.WTGroups.DocsInWTGroupsCollection.DocsInWTGroups> getDocsInWTGroups() {
                            if (docsInWTGroups == null) {
                                docsInWTGroups = new ArrayList<Payment.WithholdingTaxCertificatesCollection.WithholdingTaxCertificatesData.WTGroupsCollection.WTGroups.DocsInWTGroupsCollection.DocsInWTGroups>();
                            }
                            return this.docsInWTGroups;
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
                         *         &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                         *         &lt;element name="DocObjType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="VATAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                         *         &lt;element name="DocTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                         *         &lt;element name="BaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                         *         &lt;element name="AccumAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                         *         &lt;element name="PerceptAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                         *         &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                        public static class DocsInWTGroups {

                            @XmlElement(name = "DocEntry")
                            protected Long docEntry;
                            @XmlElement(name = "DocObjType")
                            protected String docObjType;
                            @XmlElement(name = "VATAmount")
                            protected BigDecimal vatAmount;
                            @XmlElement(name = "DocTotal")
                            protected BigDecimal docTotal;
                            @XmlElement(name = "BaseAmount")
                            protected BigDecimal baseAmount;
                            @XmlElement(name = "AccumAmount")
                            protected BigDecimal accumAmount;
                            @XmlElement(name = "PerceptAmount")
                            protected BigDecimal perceptAmount;
                            @XmlElement(name = "Percent")
                            protected BigDecimal percent;

                            /**
                             * Obtiene el valor de la propiedad docEntry.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Long }
                             *     
                             */
                            public Long getDocEntry() {
                                return docEntry;
                            }

                            /**
                             * Define el valor de la propiedad docEntry.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Long }
                             *     
                             */
                            public void setDocEntry(Long value) {
                                this.docEntry = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad docObjType.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getDocObjType() {
                                return docObjType;
                            }

                            /**
                             * Define el valor de la propiedad docObjType.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setDocObjType(String value) {
                                this.docObjType = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad vatAmount.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVATAmount() {
                                return vatAmount;
                            }

                            /**
                             * Define el valor de la propiedad vatAmount.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVATAmount(BigDecimal value) {
                                this.vatAmount = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad docTotal.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getDocTotal() {
                                return docTotal;
                            }

                            /**
                             * Define el valor de la propiedad docTotal.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setDocTotal(BigDecimal value) {
                                this.docTotal = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad baseAmount.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getBaseAmount() {
                                return baseAmount;
                            }

                            /**
                             * Define el valor de la propiedad baseAmount.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setBaseAmount(BigDecimal value) {
                                this.baseAmount = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad accumAmount.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getAccumAmount() {
                                return accumAmount;
                            }

                            /**
                             * Define el valor de la propiedad accumAmount.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setAccumAmount(BigDecimal value) {
                                this.accumAmount = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad perceptAmount.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getPerceptAmount() {
                                return perceptAmount;
                            }

                            /**
                             * Define el valor de la propiedad perceptAmount.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setPerceptAmount(BigDecimal value) {
                                this.perceptAmount = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad percent.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getPercent() {
                                return percent;
                            }

                            /**
                             * Define el valor de la propiedad percent.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setPercent(BigDecimal value) {
                                this.percent = value;
                            }

                        }

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
     *         &lt;element name="WithholdingTaxDataWTX" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="WTAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="WTAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="WTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="WithholdingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TaxableAmountinSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TaxableAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AppliedWTAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AppliedWTAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AppliedWTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="GLAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseDocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseDocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseDocType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WTAbsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ExemptRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="BaseNetAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="BaseNetAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="BaseNetAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="BaseVatmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="BaseVatmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="BaseVatmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AccumBaseAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AccumBaseAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AccumBaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AccumWTaxAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AccumWTaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AccumWTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        "withholdingTaxDataWTX"
    })
    public static class WithholdingTaxDataWTXCollection {

        @XmlElement(name = "WithholdingTaxDataWTX")
        protected List<Payment.WithholdingTaxDataWTXCollection.WithholdingTaxDataWTX> withholdingTaxDataWTX;

        /**
         * Gets the value of the withholdingTaxDataWTX property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the withholdingTaxDataWTX property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWithholdingTaxDataWTX().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Payment.WithholdingTaxDataWTXCollection.WithholdingTaxDataWTX }
         * 
         * 
         */
        public List<Payment.WithholdingTaxDataWTXCollection.WithholdingTaxDataWTX> getWithholdingTaxDataWTX() {
            if (withholdingTaxDataWTX == null) {
                withholdingTaxDataWTX = new ArrayList<Payment.WithholdingTaxDataWTXCollection.WithholdingTaxDataWTX>();
            }
            return this.withholdingTaxDataWTX;
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
         *         &lt;element name="WTAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="WTAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="WTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="WithholdingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TaxableAmountinSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TaxableAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AppliedWTAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AppliedWTAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AppliedWTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="GLAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseDocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseDocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseDocType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WTAbsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ExemptRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="BaseNetAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="BaseNetAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="BaseNetAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="BaseVatmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="BaseVatmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="BaseVatmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AccumBaseAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AccumBaseAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AccumBaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AccumWTaxAmountSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AccumWTaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AccumWTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        public static class WithholdingTaxDataWTX {

            @XmlElement(name = "WTAmountSys")
            protected BigDecimal wtAmountSys;
            @XmlElement(name = "WTAmountFC")
            protected BigDecimal wtAmountFC;
            @XmlElement(name = "WTAmount")
            protected BigDecimal wtAmount;
            @XmlElement(name = "WithholdingType")
            protected String withholdingType;
            @XmlElement(name = "TaxableAmountinSys")
            protected BigDecimal taxableAmountinSys;
            @XmlElement(name = "TaxableAmountFC")
            protected BigDecimal taxableAmountFC;
            @XmlElement(name = "TaxableAmount")
            protected BigDecimal taxableAmount;
            @XmlElement(name = "Rate")
            protected BigDecimal rate;
            @XmlElement(name = "Category")
            protected String category;
            @XmlElement(name = "BaseType")
            protected String baseType;
            @XmlElement(name = "AppliedWTAmountSys")
            protected BigDecimal appliedWTAmountSys;
            @XmlElement(name = "AppliedWTAmountFC")
            protected BigDecimal appliedWTAmountFC;
            @XmlElement(name = "AppliedWTAmount")
            protected BigDecimal appliedWTAmount;
            @XmlElement(name = "GLAccount")
            protected String glAccount;
            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "BaseDocEntry")
            protected Long baseDocEntry;
            @XmlElement(name = "BaseDocLine")
            protected Long baseDocLine;
            @XmlElement(name = "BaseDocType")
            protected String baseDocType;
            @XmlElement(name = "WTAbsId")
            protected String wtAbsId;
            @XmlElement(name = "ExemptRate")
            protected BigDecimal exemptRate;
            @XmlElement(name = "BaseNetAmountSys")
            protected BigDecimal baseNetAmountSys;
            @XmlElement(name = "BaseNetAmountFC")
            protected BigDecimal baseNetAmountFC;
            @XmlElement(name = "BaseNetAmount")
            protected BigDecimal baseNetAmount;
            @XmlElement(name = "BaseVatmountSys")
            protected BigDecimal baseVatmountSys;
            @XmlElement(name = "BaseVatmountFC")
            protected BigDecimal baseVatmountFC;
            @XmlElement(name = "BaseVatmount")
            protected BigDecimal baseVatmount;
            @XmlElement(name = "AccumBaseAmountSys")
            protected BigDecimal accumBaseAmountSys;
            @XmlElement(name = "AccumBaseAmountFC")
            protected BigDecimal accumBaseAmountFC;
            @XmlElement(name = "AccumBaseAmount")
            protected BigDecimal accumBaseAmount;
            @XmlElement(name = "AccumWTaxAmountSys")
            protected BigDecimal accumWTaxAmountSys;
            @XmlElement(name = "AccumWTaxAmountFC")
            protected BigDecimal accumWTaxAmountFC;
            @XmlElement(name = "AccumWTaxAmount")
            protected BigDecimal accumWTaxAmount;

            /**
             * Obtiene el valor de la propiedad wtAmountSys.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getWTAmountSys() {
                return wtAmountSys;
            }

            /**
             * Define el valor de la propiedad wtAmountSys.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setWTAmountSys(BigDecimal value) {
                this.wtAmountSys = value;
            }

            /**
             * Obtiene el valor de la propiedad wtAmountFC.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getWTAmountFC() {
                return wtAmountFC;
            }

            /**
             * Define el valor de la propiedad wtAmountFC.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setWTAmountFC(BigDecimal value) {
                this.wtAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad wtAmount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getWTAmount() {
                return wtAmount;
            }

            /**
             * Define el valor de la propiedad wtAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setWTAmount(BigDecimal value) {
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
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTaxableAmountinSys() {
                return taxableAmountinSys;
            }

            /**
             * Define el valor de la propiedad taxableAmountinSys.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTaxableAmountinSys(BigDecimal value) {
                this.taxableAmountinSys = value;
            }

            /**
             * Obtiene el valor de la propiedad taxableAmountFC.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTaxableAmountFC() {
                return taxableAmountFC;
            }

            /**
             * Define el valor de la propiedad taxableAmountFC.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTaxableAmountFC(BigDecimal value) {
                this.taxableAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad taxableAmount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTaxableAmount() {
                return taxableAmount;
            }

            /**
             * Define el valor de la propiedad taxableAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTaxableAmount(BigDecimal value) {
                this.taxableAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad rate.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getRate() {
                return rate;
            }

            /**
             * Define el valor de la propiedad rate.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setRate(BigDecimal value) {
                this.rate = value;
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
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAppliedWTAmountSys() {
                return appliedWTAmountSys;
            }

            /**
             * Define el valor de la propiedad appliedWTAmountSys.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAppliedWTAmountSys(BigDecimal value) {
                this.appliedWTAmountSys = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedWTAmountFC.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAppliedWTAmountFC() {
                return appliedWTAmountFC;
            }

            /**
             * Define el valor de la propiedad appliedWTAmountFC.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAppliedWTAmountFC(BigDecimal value) {
                this.appliedWTAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedWTAmount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAppliedWTAmount() {
                return appliedWTAmount;
            }

            /**
             * Define el valor de la propiedad appliedWTAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAppliedWTAmount(BigDecimal value) {
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
             *     {@link String }
             *     
             */
            public String getBaseDocType() {
                return baseDocType;
            }

            /**
             * Define el valor de la propiedad baseDocType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBaseDocType(String value) {
                this.baseDocType = value;
            }

            /**
             * Obtiene el valor de la propiedad wtAbsId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWTAbsId() {
                return wtAbsId;
            }

            /**
             * Define el valor de la propiedad wtAbsId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWTAbsId(String value) {
                this.wtAbsId = value;
            }

            /**
             * Obtiene el valor de la propiedad exemptRate.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getExemptRate() {
                return exemptRate;
            }

            /**
             * Define el valor de la propiedad exemptRate.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setExemptRate(BigDecimal value) {
                this.exemptRate = value;
            }

            /**
             * Obtiene el valor de la propiedad baseNetAmountSys.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseNetAmountSys() {
                return baseNetAmountSys;
            }

            /**
             * Define el valor de la propiedad baseNetAmountSys.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseNetAmountSys(BigDecimal value) {
                this.baseNetAmountSys = value;
            }

            /**
             * Obtiene el valor de la propiedad baseNetAmountFC.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseNetAmountFC() {
                return baseNetAmountFC;
            }

            /**
             * Define el valor de la propiedad baseNetAmountFC.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseNetAmountFC(BigDecimal value) {
                this.baseNetAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad baseNetAmount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseNetAmount() {
                return baseNetAmount;
            }

            /**
             * Define el valor de la propiedad baseNetAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseNetAmount(BigDecimal value) {
                this.baseNetAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad baseVatmountSys.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseVatmountSys() {
                return baseVatmountSys;
            }

            /**
             * Define el valor de la propiedad baseVatmountSys.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseVatmountSys(BigDecimal value) {
                this.baseVatmountSys = value;
            }

            /**
             * Obtiene el valor de la propiedad baseVatmountFC.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseVatmountFC() {
                return baseVatmountFC;
            }

            /**
             * Define el valor de la propiedad baseVatmountFC.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseVatmountFC(BigDecimal value) {
                this.baseVatmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad baseVatmount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseVatmount() {
                return baseVatmount;
            }

            /**
             * Define el valor de la propiedad baseVatmount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseVatmount(BigDecimal value) {
                this.baseVatmount = value;
            }

            /**
             * Obtiene el valor de la propiedad accumBaseAmountSys.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAccumBaseAmountSys() {
                return accumBaseAmountSys;
            }

            /**
             * Define el valor de la propiedad accumBaseAmountSys.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAccumBaseAmountSys(BigDecimal value) {
                this.accumBaseAmountSys = value;
            }

            /**
             * Obtiene el valor de la propiedad accumBaseAmountFC.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAccumBaseAmountFC() {
                return accumBaseAmountFC;
            }

            /**
             * Define el valor de la propiedad accumBaseAmountFC.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAccumBaseAmountFC(BigDecimal value) {
                this.accumBaseAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad accumBaseAmount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAccumBaseAmount() {
                return accumBaseAmount;
            }

            /**
             * Define el valor de la propiedad accumBaseAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAccumBaseAmount(BigDecimal value) {
                this.accumBaseAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad accumWTaxAmountSys.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAccumWTaxAmountSys() {
                return accumWTaxAmountSys;
            }

            /**
             * Define el valor de la propiedad accumWTaxAmountSys.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAccumWTaxAmountSys(BigDecimal value) {
                this.accumWTaxAmountSys = value;
            }

            /**
             * Obtiene el valor de la propiedad accumWTaxAmountFC.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAccumWTaxAmountFC() {
                return accumWTaxAmountFC;
            }

            /**
             * Define el valor de la propiedad accumWTaxAmountFC.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAccumWTaxAmountFC(BigDecimal value) {
                this.accumWTaxAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad accumWTaxAmount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAccumWTaxAmount() {
                return accumWTaxAmount;
            }

            /**
             * Define el valor de la propiedad accumWTaxAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAccumWTaxAmount(BigDecimal value) {
                this.accumWTaxAmount = value;
            }

        }

    }

}
