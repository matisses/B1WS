
package co.matisses.b1ws.goodsissue;

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
 *         &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DocNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DocType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="dDocument_Items"/>
 *               &lt;enumeration value="dDocument_Service"/>
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
 *               &lt;enumeration value="psNo"/>
 *               &lt;enumeration value="psYes"/>
 *               &lt;enumeration value="psAmended"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DocDueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumAtCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AttachmentEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DocCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Reference1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JournalMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentGroupCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DocTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="SalesPersonCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TransportationCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Confirmed" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ImportFileNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SummeryType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="dNoSummary"/>
 *               &lt;enumeration value="dByItems"/>
 *               &lt;enumeration value="dByDocuments"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContactPersonCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ShowSCN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Series" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TaxDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PartialSupply" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DocObjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FederalTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PaymentReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="UpdateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FinancialPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TransNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VatSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="VatSumSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="VatSumFc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NetProcedure" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DocTotalFc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DocTotalSys" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Form1099" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Box1099" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevisionPo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RequriedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CancelDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BlockDunning" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Submitted" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Segment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PickStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Pick" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentBlock" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaymentBlockEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CentralBankIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaximumCashDiscount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Reserve" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExemptionValidityDateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExemptionValidityDateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="WareHouseUpdateType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="dwh_No"/>
 *               &lt;enumeration value="dwh_OrdersFromVendors"/>
 *               &lt;enumeration value="dwh_CustomerOrders"/>
 *               &lt;enumeration value="dwh_Consignment"/>
 *               &lt;enumeration value="dwh_Stock"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Rounding" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExternalCorrectedDocNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalCorrectedDocNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NextCorrectingDocument" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DeferredTax" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TaxExemptionLetterNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WTApplied" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WTAppliedFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BillOfExchangeReserved" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AgentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WTAppliedSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalEqualizationTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalEqualizationTaxFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalEqualizationTaxSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NumberOfInstallments" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ApplyTaxOnFirstInstallment" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WTNonSubjectAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WTNonSubjectAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WTNonSubjectAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WTExemptedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WTExemptedAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WTExemptedAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BaseAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BaseAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WTAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WTAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="VatDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DocumentsOwner" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FolioPrefixString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FolioNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DocumentSubType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="bod_None"/>
 *               &lt;enumeration value="bod_InvoiceExempt"/>
 *               &lt;enumeration value="bod_DebitMemo"/>
 *               &lt;enumeration value="bod_Bill"/>
 *               &lt;enumeration value="bod_ExemptBill"/>
 *               &lt;enumeration value="bod_PurchaseDebitMemo"/>
 *               &lt;enumeration value="bod_ExportInvoice"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BPChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BPChannelContact" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="bost_Open"/>
 *               &lt;enumeration value="bost_Close"/>
 *               &lt;enumeration value="bost_Paid"/>
 *               &lt;enumeration value="bost_Delivered"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PeriodIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManualNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseShpdGoodsAct" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IsPayToBank" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PayToBankCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToBankAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayToBankBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BPL_IDAssignedToInvoice" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DownPayment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ReserveInvoice" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClosingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SequenceCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SequenceSerial" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SeriesString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubSeriesString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SequenceModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseCorrectionVATGroup" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DownPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DownPaymentPercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DownPaymentType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="dptRequest"/>
 *               &lt;enumeration value="dptInvoice"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DownPaymentAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DownPaymentAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="VatPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ServiceGrossProfitPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OpeningRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClosingRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoundingDiffAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RoundingDiffAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RoundingDiffAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Cancelled" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SignatureInputMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignatureDigest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrivateKeyVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ControlAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuranceOperation347" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ArchiveNonremovableSalesQuotation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GTSChecker" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GTSPayee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ExtraMonth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ExtraDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CashDiscountDateOffset" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StartFrom" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="pdt_MonthEnd"/>
 *               &lt;enumeration value="pdt_HalfMonth"/>
 *               &lt;enumeration value="pdt_MonthStart"/>
 *               &lt;enumeration value="pdt_None"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NTSApproved" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ETaxWebSite" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ETaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NTSApprovedNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDocGenerationType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="edocGenerate"/>
 *               &lt;enumeration value="edocGenerateLater"/>
 *               &lt;enumeration value="edocNotRelevant"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EDocSeries" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EDocNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDocExportFormat" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EDocStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="edoc_New"/>
 *               &lt;enumeration value="edoc_Pending"/>
 *               &lt;enumeration value="edoc_Sent"/>
 *               &lt;enumeration value="edoc_Error"/>
 *               &lt;enumeration value="edoc_Ok"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EDocErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDocErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DownPaymentStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="so_Open"/>
 *               &lt;enumeration value="so_Closed"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GroupSeries" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GroupNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GroupHandWritten" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReopenOriginalDocument" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReopenManuallyClosedOrCanceledDocument" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CreateOnlineQuotation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POSEquipmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSCashierNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ApplyCurrentVATRatesForDownPaymentsToDraw" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ClosingOption" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="coByCurrentSystemDate"/>
 *               &lt;enumeration value="coByOriginalDocumentDate"/>
 *               &lt;enumeration value="coBySpecifiedDate"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SpecifiedClosingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="OpenForLandedCosts" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AuthorizationStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="dasWithout"/>
 *               &lt;enumeration value="dasPending"/>
 *               &lt;enumeration value="dasApproved"/>
 *               &lt;enumeration value="dasRejected"/>
 *               &lt;enumeration value="dasGenerated"/>
 *               &lt;enumeration value="dasGeneratedbyAuthorizer"/>
 *               &lt;enumeration value="dasCancelled"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalDiscountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalDiscountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RelevantToGTS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BPLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VATRegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnualInvoiceDeclarationReference" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Supplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Releaser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Receiver" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BlanketAgreementNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IsAlteration" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CancelStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="csYes"/>
 *               &lt;enumeration value="csNo"/>
 *               &lt;enumeration value="csCancellation"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AssetValueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DocumentDelivery" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ddtNoneSeleted"/>
 *               &lt;enumeration value="ddtCreateOnlineDocument"/>
 *               &lt;enumeration value="ddtPostToAribaNetwork"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StartDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="EndDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EndDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="VehiclePlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATDocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ElecCommStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ecsApproved"/>
 *               &lt;enumeration value="ecsPendingApproval"/>
 *               &lt;enumeration value="ecsRejected"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ElecCommMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReuseDocumentNum" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReuseNotaFiscalNum" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PrintSEPADirect" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FiscalDocNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSDailySummaryNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="POSReceiptNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
 *         &lt;element name="InterimType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="boidt_None"/>
 *               &lt;enumeration value="boidt_ExchangeRate"/>
 *               &lt;enumeration value="boidt_CashDiscount"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RelatedType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RelatedEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="U_Autorret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_BPCOST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_WUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_TipoNota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_Retefue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_ReteIca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_OK1_IVAPA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_OK1_IFRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_Diseno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_diseno2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_comdeco1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="U_comdeco2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="U_Vendedor1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_Vendedor2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_Vendedor3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_Vendedor4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_Vendedor5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_Factor" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="U_NWR_PicS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_NWR_BRet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_nwr_PAut" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="U_nwr_Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_nwr_Tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_nwr_Frgt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="U_NWR_NORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_TypeExped" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_CreaNC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_NumFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_Aprobado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_ComVend1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_ComVend2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_ComVend3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_ComVend4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_ComVend5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_Act_Costo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_DocEntryLeg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="U_idLineLeg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_serieLeg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="U_EsIndep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_firma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_cedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_DifCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_CatRet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_Origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Document_ApprovalRequests" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Document_ApprovalRequest" maxOccurs="unbounded" minOccurs="0">
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
 *         &lt;element name="DocumentLines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DocumentLine" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="PriceAfterVAT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="VendorNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SalesPersonCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="CommisionPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TreeType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="iNotATree"/>
 *                                   &lt;enumeration value="iAssemblyTree"/>
 *                                   &lt;enumeration value="iSalesTree"/>
 *                                   &lt;enumeration value="iProductionTree"/>
 *                                   &lt;enumeration value="iTemplateTree"/>
 *                                   &lt;enumeration value="iIngredient"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="UseBaseUnits" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SupplierCatNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CostingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="VatGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Hight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Lengh1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Lengh1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Lengh2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Lengh2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Factor1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Factor2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Factor3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Factor4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BaseEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TaxType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tt_Yes"/>
 *                                   &lt;enumeration value="tt_No"/>
 *                                   &lt;enumeration value="tt_UseTax"/>
 *                                   &lt;enumeration value="tt_OffsetTax"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TaxLiable" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PickStatus" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PickQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="PickListIdNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="OriginalItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BackOrder" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FreeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ShippingMethod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="POTargetNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="POTargetEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="POTargetRowNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="CorrectionInvoiceItem" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="ciis_Was"/>
 *                                   &lt;enumeration value="ciis_ShouldBe"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CorrInvAmountToStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="CorrInvAmountToDiffAcct" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AppliedTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AppliedTaxFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AppliedTaxSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="WTLiable" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DeferredTax" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="EqualizationTaxPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TotalEqualizationTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TotalEqualizationTaxFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TotalEqualizationTaxSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="NetTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="NetTaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="NetTaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="UnitsOfMeasurment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="LineTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TaxPercentagePerRow" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TaxTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="ConsumerSalesForecast" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ExciseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TaxPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TotalInclTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="CountryOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SWW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TransactionType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="botrntComplete"/>
 *                                   &lt;enumeration value="botrntReject"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DistributeExpense" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ShipToCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RowTotalFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="RowTotalSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="LastBuyInmPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="LastBuyDistributeSumFc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="LastBuyDistributeSumSc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="LastBuyDistributeSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="StockDistributesumForeign" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="StockDistributesumSystem" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="StockDistributesum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="StockInmPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="PickStatusEx" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="dlps_Picked"/>
 *                                   &lt;enumeration value="dlps_NotPicked"/>
 *                                   &lt;enumeration value="dlps_ReleasedForPicking"/>
 *                                   &lt;enumeration value="dlps_PartiallyPicked"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TaxBeforeDPM" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TaxBeforeDPMFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="TaxBeforeDPMSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="CFOPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CSTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Usage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="TaxOnly" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="VisualOrder" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BaseOpenQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="LineStatus" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="bost_Open"/>
 *                                   &lt;enumeration value="bost_Close"/>
 *                                   &lt;enumeration value="bost_Paid"/>
 *                                   &lt;enumeration value="bost_Delivered"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PackageQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LineType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="dlt_Regular"/>
 *                                   &lt;enumeration value="dlt_Alternative"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="COGSCostingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="COGSAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ChangeAssemlyBoMWarehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GrossBuyPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="GrossBase" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="GrossProfitTotalBasePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="CostingCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CostingCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CostingCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CostingCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ItemDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="ActualDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="RemainingOpenQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="OpenAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="OpenAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="OpenAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="ExLineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RequiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="RequiredQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="COGSCostingCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="COGSCostingCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="COGSCostingCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="COGSCostingCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CSTforIPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CSTforPIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CSTforCOFINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CreditOriginCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WithoutInventoryMovement" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AgreementNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="AgreementRowNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="ShipToDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ActualBaseEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="ActualBaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Surpluses" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="DefectAndBreakup" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Shortages" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="ConsiderQuantity" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PartialRetirement" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RetirementQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="RetirementAPC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="ThirdParty" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="UoMCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InventoryQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="RemainingOpenInventoryQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="ParentLineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Incoterms" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="TransportMode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="ItemType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="dit_Item"/>
 *                                   &lt;enumeration value="dit_Resource"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ChangeInventoryQuantityIndependently" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FreeOfChargeBP" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="U_IVCDone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="U_EstadoP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="U_NWR_Base" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="U_CustDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="U_NWR_QtyAllocated" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="U_ReclamQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="U_QAMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="U_IncomingQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="U_Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="U_DI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="U_lineNumFv" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="U_Images" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="U_numPartes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="U_Averias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LineTaxJurisdictions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="LineTaxJurisdiction" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
 *                             &lt;element name="SerialNumbers" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SerialNumber" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="ManufactureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="ReceptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="WarrantyStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="WarrantyEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="BatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="SystemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
 *                             &lt;element name="BatchNumbers" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BatchNumber" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="BatchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="ManufacturingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="AddmisionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
 *                             &lt;element name="DocumentLinesBinAllocations" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DocumentLinesBinAllocation" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="BinAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="AllowNegativeQuantity" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="tNO"/>
 *                                                       &lt;enumeration value="tYES"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="SerialAndBatchNumbersBaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
 *         &lt;element name="TaxExtension" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="TaxId0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TaxId1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TaxId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TaxId3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TaxId4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TaxId5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TaxId6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TaxId7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TaxId8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TaxId9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Incoterms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="VehicleState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NFRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PackQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="PackDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ShipUnitNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="NetWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="GrossWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="StreetS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BlockS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BuildingS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CityS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ZipCodeS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CountyS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="StateS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CountryS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="StreetB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BlockB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BuildingB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CityB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ZipCodeB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CountyB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="StateB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CountryB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ImportOrExport" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="tNO"/>
 *                         &lt;enumeration value="tYES"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="MainUsage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="GlobalLocationNumberS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GlobalLocationNumberB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TaxId12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TaxId13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AddressExtension" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="ShipToStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ShipToStreetNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ShipToBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ShipToBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ShipToZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ShipToCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ShipToAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BillToStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BillToStreetNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BillToBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BillToBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BillToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BillToZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BillToCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BillToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BillToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BillToAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ShipToGlobalLocationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BillToGlobalLocationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ShipToAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BillToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BillToAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
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
@XmlRootElement(name = "Document")
public class Document {

    @XmlElement(name = "DocEntry")
    protected Long docEntry;
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
    @XmlElement(name = "DocDueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDueDate;
    @XmlElement(name = "CardCode")
    protected String cardCode;
    @XmlElement(name = "CardName")
    protected String cardName;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "NumAtCard")
    protected String numAtCard;
    @XmlElement(name = "DocTotal")
    protected Double docTotal;
    @XmlElement(name = "AttachmentEntry")
    protected Long attachmentEntry;
    @XmlElement(name = "DocCurrency")
    protected String docCurrency;
    @XmlElement(name = "DocRate")
    protected Double docRate;
    @XmlElement(name = "Reference1")
    protected String reference1;
    @XmlElement(name = "Reference2")
    protected String reference2;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "JournalMemo")
    protected String journalMemo;
    @XmlElement(name = "PaymentGroupCode")
    protected Long paymentGroupCode;
    @XmlElement(name = "DocTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar docTime;
    @XmlElement(name = "SalesPersonCode")
    protected Long salesPersonCode;
    @XmlElement(name = "TransportationCode")
    protected Long transportationCode;
    @XmlElement(name = "Confirmed")
    protected String confirmed;
    @XmlElement(name = "ImportFileNum")
    protected Long importFileNum;
    @XmlElement(name = "SummeryType")
    protected String summeryType;
    @XmlElement(name = "ContactPersonCode")
    protected Long contactPersonCode;
    @XmlElement(name = "ShowSCN")
    protected String showSCN;
    @XmlElement(name = "Series")
    protected Long series;
    @XmlElement(name = "TaxDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxDate;
    @XmlElement(name = "PartialSupply")
    protected String partialSupply;
    @XmlElement(name = "DocObjectCode")
    protected String docObjectCode;
    @XmlElement(name = "ShipToCode")
    protected String shipToCode;
    @XmlElement(name = "Indicator")
    protected String indicator;
    @XmlElement(name = "FederalTaxID")
    protected String federalTaxID;
    @XmlElement(name = "DiscountPercent")
    protected Double discountPercent;
    @XmlElement(name = "PaymentReference")
    protected String paymentReference;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "UpdateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updateDate;
    @XmlElement(name = "FinancialPeriod")
    protected Long financialPeriod;
    @XmlElement(name = "TransNum")
    protected Long transNum;
    @XmlElement(name = "VatSum")
    protected Double vatSum;
    @XmlElement(name = "VatSumSys")
    protected Double vatSumSys;
    @XmlElement(name = "VatSumFc")
    protected Double vatSumFc;
    @XmlElement(name = "NetProcedure")
    protected String netProcedure;
    @XmlElement(name = "DocTotalFc")
    protected Double docTotalFc;
    @XmlElement(name = "DocTotalSys")
    protected Double docTotalSys;
    @XmlElement(name = "Form1099")
    protected Long form1099;
    @XmlElement(name = "Box1099")
    protected String box1099;
    @XmlElement(name = "RevisionPo")
    protected String revisionPo;
    @XmlElement(name = "RequriedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requriedDate;
    @XmlElement(name = "CancelDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cancelDate;
    @XmlElement(name = "BlockDunning")
    protected String blockDunning;
    @XmlElement(name = "Submitted")
    protected String submitted;
    @XmlElement(name = "Segment")
    protected Long segment;
    @XmlElement(name = "PickStatus")
    protected String pickStatus;
    @XmlElement(name = "Pick")
    protected String pick;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;
    @XmlElement(name = "PaymentBlock")
    protected String paymentBlock;
    @XmlElement(name = "PaymentBlockEntry")
    protected Long paymentBlockEntry;
    @XmlElement(name = "CentralBankIndicator")
    protected String centralBankIndicator;
    @XmlElement(name = "MaximumCashDiscount")
    protected String maximumCashDiscount;
    @XmlElement(name = "Reserve")
    protected String reserve;
    @XmlElement(name = "Project")
    protected String project;
    @XmlElement(name = "ExemptionValidityDateFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exemptionValidityDateFrom;
    @XmlElement(name = "ExemptionValidityDateTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exemptionValidityDateTo;
    @XmlElement(name = "WareHouseUpdateType")
    protected String wareHouseUpdateType;
    @XmlElement(name = "Rounding")
    protected String rounding;
    @XmlElement(name = "ExternalCorrectedDocNum")
    protected String externalCorrectedDocNum;
    @XmlElement(name = "InternalCorrectedDocNum")
    protected Long internalCorrectedDocNum;
    @XmlElement(name = "NextCorrectingDocument")
    protected Long nextCorrectingDocument;
    @XmlElement(name = "DeferredTax")
    protected String deferredTax;
    @XmlElement(name = "TaxExemptionLetterNum")
    protected String taxExemptionLetterNum;
    @XmlElement(name = "WTApplied")
    protected Double wtApplied;
    @XmlElement(name = "WTAppliedFC")
    protected Double wtAppliedFC;
    @XmlElement(name = "BillOfExchangeReserved")
    protected String billOfExchangeReserved;
    @XmlElement(name = "AgentCode")
    protected String agentCode;
    @XmlElement(name = "WTAppliedSC")
    protected Double wtAppliedSC;
    @XmlElement(name = "TotalEqualizationTax")
    protected Double totalEqualizationTax;
    @XmlElement(name = "TotalEqualizationTaxFC")
    protected Double totalEqualizationTaxFC;
    @XmlElement(name = "TotalEqualizationTaxSC")
    protected Double totalEqualizationTaxSC;
    @XmlElement(name = "NumberOfInstallments")
    protected Long numberOfInstallments;
    @XmlElement(name = "ApplyTaxOnFirstInstallment")
    protected String applyTaxOnFirstInstallment;
    @XmlElement(name = "WTNonSubjectAmount")
    protected Double wtNonSubjectAmount;
    @XmlElement(name = "WTNonSubjectAmountSC")
    protected Double wtNonSubjectAmountSC;
    @XmlElement(name = "WTNonSubjectAmountFC")
    protected Double wtNonSubjectAmountFC;
    @XmlElement(name = "WTExemptedAmount")
    protected Double wtExemptedAmount;
    @XmlElement(name = "WTExemptedAmountSC")
    protected Double wtExemptedAmountSC;
    @XmlElement(name = "WTExemptedAmountFC")
    protected Double wtExemptedAmountFC;
    @XmlElement(name = "BaseAmount")
    protected Double baseAmount;
    @XmlElement(name = "BaseAmountSC")
    protected Double baseAmountSC;
    @XmlElement(name = "BaseAmountFC")
    protected Double baseAmountFC;
    @XmlElement(name = "WTAmount")
    protected Double wtAmount;
    @XmlElement(name = "WTAmountSC")
    protected Double wtAmountSC;
    @XmlElement(name = "WTAmountFC")
    protected Double wtAmountFC;
    @XmlElement(name = "VatDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vatDate;
    @XmlElement(name = "DocumentsOwner")
    protected Long documentsOwner;
    @XmlElement(name = "FolioPrefixString")
    protected String folioPrefixString;
    @XmlElement(name = "FolioNumber")
    protected Long folioNumber;
    @XmlElement(name = "DocumentSubType")
    protected String documentSubType;
    @XmlElement(name = "BPChannelCode")
    protected String bpChannelCode;
    @XmlElement(name = "BPChannelContact")
    protected Long bpChannelContact;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "DocumentStatus")
    protected String documentStatus;
    @XmlElement(name = "PeriodIndicator")
    protected String periodIndicator;
    @XmlElement(name = "PayToCode")
    protected String payToCode;
    @XmlElement(name = "ManualNumber")
    protected String manualNumber;
    @XmlElement(name = "UseShpdGoodsAct")
    protected String useShpdGoodsAct;
    @XmlElement(name = "IsPayToBank")
    protected String isPayToBank;
    @XmlElement(name = "PayToBankCountry")
    protected String payToBankCountry;
    @XmlElement(name = "PayToBankCode")
    protected String payToBankCode;
    @XmlElement(name = "PayToBankAccountNo")
    protected String payToBankAccountNo;
    @XmlElement(name = "PayToBankBranch")
    protected String payToBankBranch;
    @XmlElement(name = "BPL_IDAssignedToInvoice")
    protected Long bplidAssignedToInvoice;
    @XmlElement(name = "DownPayment")
    protected Double downPayment;
    @XmlElement(name = "ReserveInvoice")
    protected String reserveInvoice;
    @XmlElement(name = "LanguageCode")
    protected Long languageCode;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "PickRemark")
    protected String pickRemark;
    @XmlElement(name = "ClosingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar closingDate;
    @XmlElement(name = "SequenceCode")
    protected Long sequenceCode;
    @XmlElement(name = "SequenceSerial")
    protected Long sequenceSerial;
    @XmlElement(name = "SeriesString")
    protected String seriesString;
    @XmlElement(name = "SubSeriesString")
    protected String subSeriesString;
    @XmlElement(name = "SequenceModel")
    protected String sequenceModel;
    @XmlElement(name = "UseCorrectionVATGroup")
    protected String useCorrectionVATGroup;
    @XmlElement(name = "TotalDiscount")
    protected Double totalDiscount;
    @XmlElement(name = "DownPaymentAmount")
    protected Double downPaymentAmount;
    @XmlElement(name = "DownPaymentPercentage")
    protected Double downPaymentPercentage;
    @XmlElement(name = "DownPaymentType")
    protected String downPaymentType;
    @XmlElement(name = "DownPaymentAmountSC")
    protected Double downPaymentAmountSC;
    @XmlElement(name = "DownPaymentAmountFC")
    protected Double downPaymentAmountFC;
    @XmlElement(name = "VatPercent")
    protected Double vatPercent;
    @XmlElement(name = "ServiceGrossProfitPercent")
    protected Double serviceGrossProfitPercent;
    @XmlElement(name = "OpeningRemarks")
    protected String openingRemarks;
    @XmlElement(name = "ClosingRemarks")
    protected String closingRemarks;
    @XmlElement(name = "RoundingDiffAmount")
    protected Double roundingDiffAmount;
    @XmlElement(name = "RoundingDiffAmountFC")
    protected Double roundingDiffAmountFC;
    @XmlElement(name = "RoundingDiffAmountSC")
    protected Double roundingDiffAmountSC;
    @XmlElement(name = "Cancelled")
    protected String cancelled;
    @XmlElement(name = "SignatureInputMessage")
    protected String signatureInputMessage;
    @XmlElement(name = "SignatureDigest")
    protected String signatureDigest;
    @XmlElement(name = "CertificationNumber")
    protected String certificationNumber;
    @XmlElement(name = "PrivateKeyVersion")
    protected Long privateKeyVersion;
    @XmlElement(name = "ControlAccount")
    protected String controlAccount;
    @XmlElement(name = "InsuranceOperation347")
    protected String insuranceOperation347;
    @XmlElement(name = "ArchiveNonremovableSalesQuotation")
    protected String archiveNonremovableSalesQuotation;
    @XmlElement(name = "GTSChecker")
    protected Long gtsChecker;
    @XmlElement(name = "GTSPayee")
    protected Long gtsPayee;
    @XmlElement(name = "ExtraMonth")
    protected Long extraMonth;
    @XmlElement(name = "ExtraDays")
    protected Long extraDays;
    @XmlElement(name = "CashDiscountDateOffset")
    protected Long cashDiscountDateOffset;
    @XmlElement(name = "StartFrom")
    protected String startFrom;
    @XmlElement(name = "NTSApproved")
    protected String ntsApproved;
    @XmlElement(name = "ETaxWebSite")
    protected Long eTaxWebSite;
    @XmlElement(name = "ETaxNumber")
    protected String eTaxNumber;
    @XmlElement(name = "NTSApprovedNumber")
    protected String ntsApprovedNumber;
    @XmlElement(name = "EDocGenerationType")
    protected String eDocGenerationType;
    @XmlElement(name = "EDocSeries")
    protected Long eDocSeries;
    @XmlElement(name = "EDocNum")
    protected String eDocNum;
    @XmlElement(name = "EDocExportFormat")
    protected Long eDocExportFormat;
    @XmlElement(name = "EDocStatus")
    protected String eDocStatus;
    @XmlElement(name = "EDocErrorCode")
    protected String eDocErrorCode;
    @XmlElement(name = "EDocErrorMessage")
    protected String eDocErrorMessage;
    @XmlElement(name = "DownPaymentStatus")
    protected String downPaymentStatus;
    @XmlElement(name = "GroupSeries")
    protected Long groupSeries;
    @XmlElement(name = "GroupNumber")
    protected Long groupNumber;
    @XmlElement(name = "GroupHandWritten")
    protected String groupHandWritten;
    @XmlElement(name = "ReopenOriginalDocument")
    protected String reopenOriginalDocument;
    @XmlElement(name = "ReopenManuallyClosedOrCanceledDocument")
    protected String reopenManuallyClosedOrCanceledDocument;
    @XmlElement(name = "CreateOnlineQuotation")
    protected String createOnlineQuotation;
    @XmlElement(name = "POSEquipmentNumber")
    protected String posEquipmentNumber;
    @XmlElement(name = "POSManufacturerSerialNumber")
    protected String posManufacturerSerialNumber;
    @XmlElement(name = "POSCashierNumber")
    protected Long posCashierNumber;
    @XmlElement(name = "ApplyCurrentVATRatesForDownPaymentsToDraw")
    protected String applyCurrentVATRatesForDownPaymentsToDraw;
    @XmlElement(name = "ClosingOption")
    protected String closingOption;
    @XmlElement(name = "SpecifiedClosingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar specifiedClosingDate;
    @XmlElement(name = "OpenForLandedCosts")
    protected String openForLandedCosts;
    @XmlElement(name = "AuthorizationStatus")
    protected String authorizationStatus;
    @XmlElement(name = "TotalDiscountFC")
    protected Double totalDiscountFC;
    @XmlElement(name = "TotalDiscountSC")
    protected Double totalDiscountSC;
    @XmlElement(name = "RelevantToGTS")
    protected String relevantToGTS;
    @XmlElement(name = "BPLName")
    protected String bplName;
    @XmlElement(name = "VATRegNum")
    protected String vatRegNum;
    @XmlElement(name = "AnnualInvoiceDeclarationReference")
    protected Long annualInvoiceDeclarationReference;
    @XmlElement(name = "Supplier")
    protected String supplier;
    @XmlElement(name = "Releaser")
    protected Long releaser;
    @XmlElement(name = "Receiver")
    protected Long receiver;
    @XmlElement(name = "BlanketAgreementNumber")
    protected Long blanketAgreementNumber;
    @XmlElement(name = "IsAlteration")
    protected String isAlteration;
    @XmlElement(name = "CancelStatus")
    protected String cancelStatus;
    @XmlElement(name = "AssetValueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar assetValueDate;
    @XmlElement(name = "DocumentDelivery")
    protected String documentDelivery;
    @XmlElement(name = "AuthorizationCode")
    protected String authorizationCode;
    @XmlElement(name = "StartDeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDeliveryDate;
    @XmlElement(name = "StartDeliveryTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startDeliveryTime;
    @XmlElement(name = "EndDeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDeliveryDate;
    @XmlElement(name = "EndDeliveryTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endDeliveryTime;
    @XmlElement(name = "VehiclePlate")
    protected String vehiclePlate;
    @XmlElement(name = "ATDocumentType")
    protected String atDocumentType;
    @XmlElement(name = "ElecCommStatus")
    protected String elecCommStatus;
    @XmlElement(name = "ElecCommMessage")
    protected String elecCommMessage;
    @XmlElement(name = "ReuseDocumentNum")
    protected String reuseDocumentNum;
    @XmlElement(name = "ReuseNotaFiscalNum")
    protected String reuseNotaFiscalNum;
    @XmlElement(name = "PrintSEPADirect")
    protected String printSEPADirect;
    @XmlElement(name = "FiscalDocNum")
    protected String fiscalDocNum;
    @XmlElement(name = "POSDailySummaryNo")
    protected Long posDailySummaryNo;
    @XmlElement(name = "POSReceiptNo")
    protected Long posReceiptNo;
    @XmlElement(name = "PointOfIssueCode")
    protected String pointOfIssueCode;
    @XmlElement(name = "Letter")
    protected String letter;
    @XmlElement(name = "FolioNumberFrom")
    protected Long folioNumberFrom;
    @XmlElement(name = "FolioNumberTo")
    protected Long folioNumberTo;
    @XmlElement(name = "InterimType")
    protected String interimType;
    @XmlElement(name = "RelatedType")
    protected Long relatedType;
    @XmlElement(name = "RelatedEntry")
    protected Long relatedEntry;
    @XmlElement(name = "U_Autorret")
    protected String uAutorret;
    @XmlElement(name = "U_BPCOST")
    protected String ubpcost;
    @XmlElement(name = "U_WUID")
    protected String uwuid;
    @XmlElement(name = "U_TipoNota")
    protected String uTipoNota;
    @XmlElement(name = "U_Retefue")
    protected String uRetefue;
    @XmlElement(name = "U_ReteIca")
    protected String uReteIca;
    @XmlElement(name = "U_OK1_IVAPA")
    protected String uok1IVAPA;
    @XmlElement(name = "U_OK1_IFRS")
    protected String uok1IFRS;
    @XmlElement(name = "U_Diseno")
    protected String uDiseno;
    @XmlElement(name = "U_diseno2")
    protected String uDiseno2;
    @XmlElement(name = "U_comdeco1")
    protected Long uComdeco1;
    @XmlElement(name = "U_comdeco2")
    protected Long uComdeco2;
    @XmlElement(name = "U_Vendedor1")
    protected String uVendedor1;
    @XmlElement(name = "U_Vendedor2")
    protected String uVendedor2;
    @XmlElement(name = "U_Vendedor3")
    protected String uVendedor3;
    @XmlElement(name = "U_Vendedor4")
    protected String uVendedor4;
    @XmlElement(name = "U_Vendedor5")
    protected String uVendedor5;
    @XmlElement(name = "U_Factor")
    protected Long uFactor;
    @XmlElement(name = "U_NWR_PicS")
    protected String unwrPicS;
    @XmlElement(name = "U_NWR_BRet")
    protected String unwrbRet;
    @XmlElement(name = "U_nwr_PAut")
    protected Long uNwrPAut;
    @XmlElement(name = "U_nwr_Note")
    protected String uNwrNote;
    @XmlElement(name = "U_nwr_Tag")
    protected String uNwrTag;
    @XmlElement(name = "U_nwr_Frgt")
    protected Double uNwrFrgt;
    @XmlElement(name = "U_NWR_NORM")
    protected String unwrnorm;
    @XmlElement(name = "U_TypeExped")
    protected String uTypeExped;
    @XmlElement(name = "U_CreaNC")
    protected String uCreaNC;
    @XmlElement(name = "U_NumFact")
    protected String uNumFact;
    @XmlElement(name = "U_Aprobado")
    protected String uAprobado;
    @XmlElement(name = "U_ComVend1")
    protected String uComVend1;
    @XmlElement(name = "U_ComVend2")
    protected String uComVend2;
    @XmlElement(name = "U_ComVend3")
    protected String uComVend3;
    @XmlElement(name = "U_ComVend4")
    protected String uComVend4;
    @XmlElement(name = "U_ComVend5")
    protected String uComVend5;
    @XmlElement(name = "U_Act_Costo")
    protected String uActCosto;
    @XmlElement(name = "U_DocEntryLeg")
    protected Long uDocEntryLeg;
    @XmlElement(name = "U_idLineLeg")
    protected String uIdLineLeg;
    @XmlElement(name = "U_serieLeg")
    protected Long uSerieLeg;
    @XmlElement(name = "U_EsIndep")
    protected String uEsIndep;
    @XmlElement(name = "U_firma")
    protected String uFirma;
    @XmlElement(name = "U_cedula")
    protected String uCedula;
    @XmlElement(name = "U_DifCode")
    protected String uDifCode;
    @XmlElement(name = "U_CatRet")
    protected String uCatRet;
    @XmlElement(name = "U_Origen")
    protected String uOrigen;
    @XmlElement(name = "Document_ApprovalRequests")
    protected Document.DocumentApprovalRequests documentApprovalRequests;
    @XmlElement(name = "DocumentLines")
    protected Document.DocumentLines documentLines;
    @XmlElement(name = "TaxExtension")
    protected Document.TaxExtension taxExtension;
    @XmlElement(name = "AddressExtension")
    protected Document.AddressExtension addressExtension;

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
     * Obtiene el valor de la propiedad docDueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDueDate() {
        return docDueDate;
    }

    /**
     * Define el valor de la propiedad docDueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDueDate(XMLGregorianCalendar value) {
        this.docDueDate = value;
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
     * Obtiene el valor de la propiedad numAtCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumAtCard() {
        return numAtCard;
    }

    /**
     * Define el valor de la propiedad numAtCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumAtCard(String value) {
        this.numAtCard = value;
    }

    /**
     * Obtiene el valor de la propiedad docTotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDocTotal() {
        return docTotal;
    }

    /**
     * Define el valor de la propiedad docTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDocTotal(Double value) {
        this.docTotal = value;
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
     * Obtiene el valor de la propiedad docRate.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDocRate() {
        return docRate;
    }

    /**
     * Define el valor de la propiedad docRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDocRate(Double value) {
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
     * Obtiene el valor de la propiedad comments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Define el valor de la propiedad comments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Obtiene el valor de la propiedad journalMemo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalMemo() {
        return journalMemo;
    }

    /**
     * Define el valor de la propiedad journalMemo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalMemo(String value) {
        this.journalMemo = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentGroupCode() {
        return paymentGroupCode;
    }

    /**
     * Define el valor de la propiedad paymentGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentGroupCode(Long value) {
        this.paymentGroupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad docTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocTime() {
        return docTime;
    }

    /**
     * Define el valor de la propiedad docTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocTime(XMLGregorianCalendar value) {
        this.docTime = value;
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
     * Obtiene el valor de la propiedad transportationCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransportationCode() {
        return transportationCode;
    }

    /**
     * Define el valor de la propiedad transportationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransportationCode(Long value) {
        this.transportationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad confirmed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmed() {
        return confirmed;
    }

    /**
     * Define el valor de la propiedad confirmed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmed(String value) {
        this.confirmed = value;
    }

    /**
     * Obtiene el valor de la propiedad importFileNum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImportFileNum() {
        return importFileNum;
    }

    /**
     * Define el valor de la propiedad importFileNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImportFileNum(Long value) {
        this.importFileNum = value;
    }

    /**
     * Obtiene el valor de la propiedad summeryType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummeryType() {
        return summeryType;
    }

    /**
     * Define el valor de la propiedad summeryType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummeryType(String value) {
        this.summeryType = value;
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
     * Obtiene el valor de la propiedad showSCN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowSCN() {
        return showSCN;
    }

    /**
     * Define el valor de la propiedad showSCN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowSCN(String value) {
        this.showSCN = value;
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
     * Obtiene el valor de la propiedad partialSupply.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialSupply() {
        return partialSupply;
    }

    /**
     * Define el valor de la propiedad partialSupply.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialSupply(String value) {
        this.partialSupply = value;
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
     * Obtiene el valor de la propiedad shipToCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCode() {
        return shipToCode;
    }

    /**
     * Define el valor de la propiedad shipToCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCode(String value) {
        this.shipToCode = value;
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
     * Obtiene el valor de la propiedad discountPercent.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Define el valor de la propiedad discountPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountPercent(Double value) {
        this.discountPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReference() {
        return paymentReference;
    }

    /**
     * Define el valor de la propiedad paymentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReference(String value) {
        this.paymentReference = value;
    }

    /**
     * Obtiene el valor de la propiedad creationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Define el valor de la propiedad creationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad updateDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Define el valor de la propiedad updateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Obtiene el valor de la propiedad financialPeriod.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinancialPeriod() {
        return financialPeriod;
    }

    /**
     * Define el valor de la propiedad financialPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinancialPeriod(Long value) {
        this.financialPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad transNum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransNum() {
        return transNum;
    }

    /**
     * Define el valor de la propiedad transNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransNum(Long value) {
        this.transNum = value;
    }

    /**
     * Obtiene el valor de la propiedad vatSum.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVatSum() {
        return vatSum;
    }

    /**
     * Define el valor de la propiedad vatSum.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVatSum(Double value) {
        this.vatSum = value;
    }

    /**
     * Obtiene el valor de la propiedad vatSumSys.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVatSumSys() {
        return vatSumSys;
    }

    /**
     * Define el valor de la propiedad vatSumSys.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVatSumSys(Double value) {
        this.vatSumSys = value;
    }

    /**
     * Obtiene el valor de la propiedad vatSumFc.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVatSumFc() {
        return vatSumFc;
    }

    /**
     * Define el valor de la propiedad vatSumFc.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVatSumFc(Double value) {
        this.vatSumFc = value;
    }

    /**
     * Obtiene el valor de la propiedad netProcedure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetProcedure() {
        return netProcedure;
    }

    /**
     * Define el valor de la propiedad netProcedure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetProcedure(String value) {
        this.netProcedure = value;
    }

    /**
     * Obtiene el valor de la propiedad docTotalFc.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDocTotalFc() {
        return docTotalFc;
    }

    /**
     * Define el valor de la propiedad docTotalFc.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDocTotalFc(Double value) {
        this.docTotalFc = value;
    }

    /**
     * Obtiene el valor de la propiedad docTotalSys.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDocTotalSys() {
        return docTotalSys;
    }

    /**
     * Define el valor de la propiedad docTotalSys.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDocTotalSys(Double value) {
        this.docTotalSys = value;
    }

    /**
     * Obtiene el valor de la propiedad form1099.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getForm1099() {
        return form1099;
    }

    /**
     * Define el valor de la propiedad form1099.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setForm1099(Long value) {
        this.form1099 = value;
    }

    /**
     * Obtiene el valor de la propiedad box1099.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBox1099() {
        return box1099;
    }

    /**
     * Define el valor de la propiedad box1099.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBox1099(String value) {
        this.box1099 = value;
    }

    /**
     * Obtiene el valor de la propiedad revisionPo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionPo() {
        return revisionPo;
    }

    /**
     * Define el valor de la propiedad revisionPo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionPo(String value) {
        this.revisionPo = value;
    }

    /**
     * Obtiene el valor de la propiedad requriedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequriedDate() {
        return requriedDate;
    }

    /**
     * Define el valor de la propiedad requriedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequriedDate(XMLGregorianCalendar value) {
        this.requriedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelDate() {
        return cancelDate;
    }

    /**
     * Define el valor de la propiedad cancelDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelDate(XMLGregorianCalendar value) {
        this.cancelDate = value;
    }

    /**
     * Obtiene el valor de la propiedad blockDunning.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockDunning() {
        return blockDunning;
    }

    /**
     * Define el valor de la propiedad blockDunning.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockDunning(String value) {
        this.blockDunning = value;
    }

    /**
     * Obtiene el valor de la propiedad submitted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitted() {
        return submitted;
    }

    /**
     * Define el valor de la propiedad submitted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitted(String value) {
        this.submitted = value;
    }

    /**
     * Obtiene el valor de la propiedad segment.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSegment() {
        return segment;
    }

    /**
     * Define el valor de la propiedad segment.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSegment(Long value) {
        this.segment = value;
    }

    /**
     * Obtiene el valor de la propiedad pickStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickStatus() {
        return pickStatus;
    }

    /**
     * Define el valor de la propiedad pickStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickStatus(String value) {
        this.pickStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad pick.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPick() {
        return pick;
    }

    /**
     * Define el valor de la propiedad pick.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPick(String value) {
        this.pick = value;
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
     * Obtiene el valor de la propiedad paymentBlockEntry.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentBlockEntry() {
        return paymentBlockEntry;
    }

    /**
     * Define el valor de la propiedad paymentBlockEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentBlockEntry(Long value) {
        this.paymentBlockEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad centralBankIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentralBankIndicator() {
        return centralBankIndicator;
    }

    /**
     * Define el valor de la propiedad centralBankIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentralBankIndicator(String value) {
        this.centralBankIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumCashDiscount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumCashDiscount() {
        return maximumCashDiscount;
    }

    /**
     * Define el valor de la propiedad maximumCashDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumCashDiscount(String value) {
        this.maximumCashDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad reserve.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * Define el valor de la propiedad reserve.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserve(String value) {
        this.reserve = value;
    }

    /**
     * Obtiene el valor de la propiedad project.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProject() {
        return project;
    }

    /**
     * Define el valor de la propiedad project.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProject(String value) {
        this.project = value;
    }

    /**
     * Obtiene el valor de la propiedad exemptionValidityDateFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExemptionValidityDateFrom() {
        return exemptionValidityDateFrom;
    }

    /**
     * Define el valor de la propiedad exemptionValidityDateFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExemptionValidityDateFrom(XMLGregorianCalendar value) {
        this.exemptionValidityDateFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad exemptionValidityDateTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExemptionValidityDateTo() {
        return exemptionValidityDateTo;
    }

    /**
     * Define el valor de la propiedad exemptionValidityDateTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExemptionValidityDateTo(XMLGregorianCalendar value) {
        this.exemptionValidityDateTo = value;
    }

    /**
     * Obtiene el valor de la propiedad wareHouseUpdateType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWareHouseUpdateType() {
        return wareHouseUpdateType;
    }

    /**
     * Define el valor de la propiedad wareHouseUpdateType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWareHouseUpdateType(String value) {
        this.wareHouseUpdateType = value;
    }

    /**
     * Obtiene el valor de la propiedad rounding.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRounding() {
        return rounding;
    }

    /**
     * Define el valor de la propiedad rounding.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRounding(String value) {
        this.rounding = value;
    }

    /**
     * Obtiene el valor de la propiedad externalCorrectedDocNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCorrectedDocNum() {
        return externalCorrectedDocNum;
    }

    /**
     * Define el valor de la propiedad externalCorrectedDocNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCorrectedDocNum(String value) {
        this.externalCorrectedDocNum = value;
    }

    /**
     * Obtiene el valor de la propiedad internalCorrectedDocNum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInternalCorrectedDocNum() {
        return internalCorrectedDocNum;
    }

    /**
     * Define el valor de la propiedad internalCorrectedDocNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInternalCorrectedDocNum(Long value) {
        this.internalCorrectedDocNum = value;
    }

    /**
     * Obtiene el valor de la propiedad nextCorrectingDocument.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNextCorrectingDocument() {
        return nextCorrectingDocument;
    }

    /**
     * Define el valor de la propiedad nextCorrectingDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNextCorrectingDocument(Long value) {
        this.nextCorrectingDocument = value;
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
     * Obtiene el valor de la propiedad taxExemptionLetterNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExemptionLetterNum() {
        return taxExemptionLetterNum;
    }

    /**
     * Define el valor de la propiedad taxExemptionLetterNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExemptionLetterNum(String value) {
        this.taxExemptionLetterNum = value;
    }

    /**
     * Obtiene el valor de la propiedad wtApplied.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWTApplied() {
        return wtApplied;
    }

    /**
     * Define el valor de la propiedad wtApplied.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWTApplied(Double value) {
        this.wtApplied = value;
    }

    /**
     * Obtiene el valor de la propiedad wtAppliedFC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWTAppliedFC() {
        return wtAppliedFC;
    }

    /**
     * Define el valor de la propiedad wtAppliedFC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWTAppliedFC(Double value) {
        this.wtAppliedFC = value;
    }

    /**
     * Obtiene el valor de la propiedad billOfExchangeReserved.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillOfExchangeReserved() {
        return billOfExchangeReserved;
    }

    /**
     * Define el valor de la propiedad billOfExchangeReserved.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillOfExchangeReserved(String value) {
        this.billOfExchangeReserved = value;
    }

    /**
     * Obtiene el valor de la propiedad agentCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * Define el valor de la propiedad agentCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCode(String value) {
        this.agentCode = value;
    }

    /**
     * Obtiene el valor de la propiedad wtAppliedSC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWTAppliedSC() {
        return wtAppliedSC;
    }

    /**
     * Define el valor de la propiedad wtAppliedSC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWTAppliedSC(Double value) {
        this.wtAppliedSC = value;
    }

    /**
     * Obtiene el valor de la propiedad totalEqualizationTax.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalEqualizationTax() {
        return totalEqualizationTax;
    }

    /**
     * Define el valor de la propiedad totalEqualizationTax.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalEqualizationTax(Double value) {
        this.totalEqualizationTax = value;
    }

    /**
     * Obtiene el valor de la propiedad totalEqualizationTaxFC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalEqualizationTaxFC() {
        return totalEqualizationTaxFC;
    }

    /**
     * Define el valor de la propiedad totalEqualizationTaxFC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalEqualizationTaxFC(Double value) {
        this.totalEqualizationTaxFC = value;
    }

    /**
     * Obtiene el valor de la propiedad totalEqualizationTaxSC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalEqualizationTaxSC() {
        return totalEqualizationTaxSC;
    }

    /**
     * Define el valor de la propiedad totalEqualizationTaxSC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalEqualizationTaxSC(Double value) {
        this.totalEqualizationTaxSC = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfInstallments.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfInstallments() {
        return numberOfInstallments;
    }

    /**
     * Define el valor de la propiedad numberOfInstallments.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfInstallments(Long value) {
        this.numberOfInstallments = value;
    }

    /**
     * Obtiene el valor de la propiedad applyTaxOnFirstInstallment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyTaxOnFirstInstallment() {
        return applyTaxOnFirstInstallment;
    }

    /**
     * Define el valor de la propiedad applyTaxOnFirstInstallment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyTaxOnFirstInstallment(String value) {
        this.applyTaxOnFirstInstallment = value;
    }

    /**
     * Obtiene el valor de la propiedad wtNonSubjectAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWTNonSubjectAmount() {
        return wtNonSubjectAmount;
    }

    /**
     * Define el valor de la propiedad wtNonSubjectAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWTNonSubjectAmount(Double value) {
        this.wtNonSubjectAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad wtNonSubjectAmountSC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWTNonSubjectAmountSC() {
        return wtNonSubjectAmountSC;
    }

    /**
     * Define el valor de la propiedad wtNonSubjectAmountSC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWTNonSubjectAmountSC(Double value) {
        this.wtNonSubjectAmountSC = value;
    }

    /**
     * Obtiene el valor de la propiedad wtNonSubjectAmountFC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWTNonSubjectAmountFC() {
        return wtNonSubjectAmountFC;
    }

    /**
     * Define el valor de la propiedad wtNonSubjectAmountFC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWTNonSubjectAmountFC(Double value) {
        this.wtNonSubjectAmountFC = value;
    }

    /**
     * Obtiene el valor de la propiedad wtExemptedAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWTExemptedAmount() {
        return wtExemptedAmount;
    }

    /**
     * Define el valor de la propiedad wtExemptedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWTExemptedAmount(Double value) {
        this.wtExemptedAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad wtExemptedAmountSC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWTExemptedAmountSC() {
        return wtExemptedAmountSC;
    }

    /**
     * Define el valor de la propiedad wtExemptedAmountSC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWTExemptedAmountSC(Double value) {
        this.wtExemptedAmountSC = value;
    }

    /**
     * Obtiene el valor de la propiedad wtExemptedAmountFC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWTExemptedAmountFC() {
        return wtExemptedAmountFC;
    }

    /**
     * Define el valor de la propiedad wtExemptedAmountFC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWTExemptedAmountFC(Double value) {
        this.wtExemptedAmountFC = value;
    }

    /**
     * Obtiene el valor de la propiedad baseAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseAmount() {
        return baseAmount;
    }

    /**
     * Define el valor de la propiedad baseAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseAmount(Double value) {
        this.baseAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad baseAmountSC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseAmountSC() {
        return baseAmountSC;
    }

    /**
     * Define el valor de la propiedad baseAmountSC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseAmountSC(Double value) {
        this.baseAmountSC = value;
    }

    /**
     * Obtiene el valor de la propiedad baseAmountFC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseAmountFC() {
        return baseAmountFC;
    }

    /**
     * Define el valor de la propiedad baseAmountFC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseAmountFC(Double value) {
        this.baseAmountFC = value;
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
     * Obtiene el valor de la propiedad wtAmountSC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWTAmountSC() {
        return wtAmountSC;
    }

    /**
     * Define el valor de la propiedad wtAmountSC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWTAmountSC(Double value) {
        this.wtAmountSC = value;
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
     * Obtiene el valor de la propiedad documentsOwner.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocumentsOwner() {
        return documentsOwner;
    }

    /**
     * Define el valor de la propiedad documentsOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocumentsOwner(Long value) {
        this.documentsOwner = value;
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
     * Obtiene el valor de la propiedad documentSubType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentSubType() {
        return documentSubType;
    }

    /**
     * Define el valor de la propiedad documentSubType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentSubType(String value) {
        this.documentSubType = value;
    }

    /**
     * Obtiene el valor de la propiedad bpChannelCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPChannelCode() {
        return bpChannelCode;
    }

    /**
     * Define el valor de la propiedad bpChannelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPChannelCode(String value) {
        this.bpChannelCode = value;
    }

    /**
     * Obtiene el valor de la propiedad bpChannelContact.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBPChannelContact() {
        return bpChannelContact;
    }

    /**
     * Define el valor de la propiedad bpChannelContact.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBPChannelContact(Long value) {
        this.bpChannelContact = value;
    }

    /**
     * Obtiene el valor de la propiedad address2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Define el valor de la propiedad address2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Obtiene el valor de la propiedad documentStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentStatus() {
        return documentStatus;
    }

    /**
     * Define el valor de la propiedad documentStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentStatus(String value) {
        this.documentStatus = value;
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
     * Obtiene el valor de la propiedad manualNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManualNumber() {
        return manualNumber;
    }

    /**
     * Define el valor de la propiedad manualNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManualNumber(String value) {
        this.manualNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad useShpdGoodsAct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseShpdGoodsAct() {
        return useShpdGoodsAct;
    }

    /**
     * Define el valor de la propiedad useShpdGoodsAct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseShpdGoodsAct(String value) {
        this.useShpdGoodsAct = value;
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
     * Obtiene el valor de la propiedad bplidAssignedToInvoice.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBPLIDAssignedToInvoice() {
        return bplidAssignedToInvoice;
    }

    /**
     * Define el valor de la propiedad bplidAssignedToInvoice.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBPLIDAssignedToInvoice(Long value) {
        this.bplidAssignedToInvoice = value;
    }

    /**
     * Obtiene el valor de la propiedad downPayment.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDownPayment() {
        return downPayment;
    }

    /**
     * Define el valor de la propiedad downPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDownPayment(Double value) {
        this.downPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad reserveInvoice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveInvoice() {
        return reserveInvoice;
    }

    /**
     * Define el valor de la propiedad reserveInvoice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveInvoice(String value) {
        this.reserveInvoice = value;
    }

    /**
     * Obtiene el valor de la propiedad languageCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLanguageCode() {
        return languageCode;
    }

    /**
     * Define el valor de la propiedad languageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLanguageCode(Long value) {
        this.languageCode = value;
    }

    /**
     * Obtiene el valor de la propiedad trackingNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Define el valor de la propiedad trackingNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad pickRemark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickRemark() {
        return pickRemark;
    }

    /**
     * Define el valor de la propiedad pickRemark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickRemark(String value) {
        this.pickRemark = value;
    }

    /**
     * Obtiene el valor de la propiedad closingDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosingDate() {
        return closingDate;
    }

    /**
     * Define el valor de la propiedad closingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosingDate(XMLGregorianCalendar value) {
        this.closingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad sequenceCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceCode() {
        return sequenceCode;
    }

    /**
     * Define el valor de la propiedad sequenceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceCode(Long value) {
        this.sequenceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad sequenceSerial.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceSerial() {
        return sequenceSerial;
    }

    /**
     * Define el valor de la propiedad sequenceSerial.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceSerial(Long value) {
        this.sequenceSerial = value;
    }

    /**
     * Obtiene el valor de la propiedad seriesString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesString() {
        return seriesString;
    }

    /**
     * Define el valor de la propiedad seriesString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesString(String value) {
        this.seriesString = value;
    }

    /**
     * Obtiene el valor de la propiedad subSeriesString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSeriesString() {
        return subSeriesString;
    }

    /**
     * Define el valor de la propiedad subSeriesString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSeriesString(String value) {
        this.subSeriesString = value;
    }

    /**
     * Obtiene el valor de la propiedad sequenceModel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceModel() {
        return sequenceModel;
    }

    /**
     * Define el valor de la propiedad sequenceModel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceModel(String value) {
        this.sequenceModel = value;
    }

    /**
     * Obtiene el valor de la propiedad useCorrectionVATGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCorrectionVATGroup() {
        return useCorrectionVATGroup;
    }

    /**
     * Define el valor de la propiedad useCorrectionVATGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCorrectionVATGroup(String value) {
        this.useCorrectionVATGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDiscount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalDiscount() {
        return totalDiscount;
    }

    /**
     * Define el valor de la propiedad totalDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalDiscount(Double value) {
        this.totalDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad downPaymentAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDownPaymentAmount() {
        return downPaymentAmount;
    }

    /**
     * Define el valor de la propiedad downPaymentAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDownPaymentAmount(Double value) {
        this.downPaymentAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad downPaymentPercentage.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDownPaymentPercentage() {
        return downPaymentPercentage;
    }

    /**
     * Define el valor de la propiedad downPaymentPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDownPaymentPercentage(Double value) {
        this.downPaymentPercentage = value;
    }

    /**
     * Obtiene el valor de la propiedad downPaymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownPaymentType() {
        return downPaymentType;
    }

    /**
     * Define el valor de la propiedad downPaymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownPaymentType(String value) {
        this.downPaymentType = value;
    }

    /**
     * Obtiene el valor de la propiedad downPaymentAmountSC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDownPaymentAmountSC() {
        return downPaymentAmountSC;
    }

    /**
     * Define el valor de la propiedad downPaymentAmountSC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDownPaymentAmountSC(Double value) {
        this.downPaymentAmountSC = value;
    }

    /**
     * Obtiene el valor de la propiedad downPaymentAmountFC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDownPaymentAmountFC() {
        return downPaymentAmountFC;
    }

    /**
     * Define el valor de la propiedad downPaymentAmountFC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDownPaymentAmountFC(Double value) {
        this.downPaymentAmountFC = value;
    }

    /**
     * Obtiene el valor de la propiedad vatPercent.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVatPercent() {
        return vatPercent;
    }

    /**
     * Define el valor de la propiedad vatPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVatPercent(Double value) {
        this.vatPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceGrossProfitPercent.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getServiceGrossProfitPercent() {
        return serviceGrossProfitPercent;
    }

    /**
     * Define el valor de la propiedad serviceGrossProfitPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setServiceGrossProfitPercent(Double value) {
        this.serviceGrossProfitPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad openingRemarks.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningRemarks() {
        return openingRemarks;
    }

    /**
     * Define el valor de la propiedad openingRemarks.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningRemarks(String value) {
        this.openingRemarks = value;
    }

    /**
     * Obtiene el valor de la propiedad closingRemarks.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingRemarks() {
        return closingRemarks;
    }

    /**
     * Define el valor de la propiedad closingRemarks.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingRemarks(String value) {
        this.closingRemarks = value;
    }

    /**
     * Obtiene el valor de la propiedad roundingDiffAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRoundingDiffAmount() {
        return roundingDiffAmount;
    }

    /**
     * Define el valor de la propiedad roundingDiffAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRoundingDiffAmount(Double value) {
        this.roundingDiffAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad roundingDiffAmountFC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRoundingDiffAmountFC() {
        return roundingDiffAmountFC;
    }

    /**
     * Define el valor de la propiedad roundingDiffAmountFC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRoundingDiffAmountFC(Double value) {
        this.roundingDiffAmountFC = value;
    }

    /**
     * Obtiene el valor de la propiedad roundingDiffAmountSC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRoundingDiffAmountSC() {
        return roundingDiffAmountSC;
    }

    /**
     * Define el valor de la propiedad roundingDiffAmountSC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRoundingDiffAmountSC(Double value) {
        this.roundingDiffAmountSC = value;
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
     * Obtiene el valor de la propiedad insuranceOperation347.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceOperation347() {
        return insuranceOperation347;
    }

    /**
     * Define el valor de la propiedad insuranceOperation347.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceOperation347(String value) {
        this.insuranceOperation347 = value;
    }

    /**
     * Obtiene el valor de la propiedad archiveNonremovableSalesQuotation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiveNonremovableSalesQuotation() {
        return archiveNonremovableSalesQuotation;
    }

    /**
     * Define el valor de la propiedad archiveNonremovableSalesQuotation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveNonremovableSalesQuotation(String value) {
        this.archiveNonremovableSalesQuotation = value;
    }

    /**
     * Obtiene el valor de la propiedad gtsChecker.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGTSChecker() {
        return gtsChecker;
    }

    /**
     * Define el valor de la propiedad gtsChecker.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGTSChecker(Long value) {
        this.gtsChecker = value;
    }

    /**
     * Obtiene el valor de la propiedad gtsPayee.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGTSPayee() {
        return gtsPayee;
    }

    /**
     * Define el valor de la propiedad gtsPayee.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGTSPayee(Long value) {
        this.gtsPayee = value;
    }

    /**
     * Obtiene el valor de la propiedad extraMonth.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExtraMonth() {
        return extraMonth;
    }

    /**
     * Define el valor de la propiedad extraMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExtraMonth(Long value) {
        this.extraMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad extraDays.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExtraDays() {
        return extraDays;
    }

    /**
     * Define el valor de la propiedad extraDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExtraDays(Long value) {
        this.extraDays = value;
    }

    /**
     * Obtiene el valor de la propiedad cashDiscountDateOffset.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCashDiscountDateOffset() {
        return cashDiscountDateOffset;
    }

    /**
     * Define el valor de la propiedad cashDiscountDateOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCashDiscountDateOffset(Long value) {
        this.cashDiscountDateOffset = value;
    }

    /**
     * Obtiene el valor de la propiedad startFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartFrom() {
        return startFrom;
    }

    /**
     * Define el valor de la propiedad startFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartFrom(String value) {
        this.startFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad ntsApproved.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTSApproved() {
        return ntsApproved;
    }

    /**
     * Define el valor de la propiedad ntsApproved.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTSApproved(String value) {
        this.ntsApproved = value;
    }

    /**
     * Obtiene el valor de la propiedad eTaxWebSite.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getETaxWebSite() {
        return eTaxWebSite;
    }

    /**
     * Define el valor de la propiedad eTaxWebSite.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setETaxWebSite(Long value) {
        this.eTaxWebSite = value;
    }

    /**
     * Obtiene el valor de la propiedad eTaxNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETaxNumber() {
        return eTaxNumber;
    }

    /**
     * Define el valor de la propiedad eTaxNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETaxNumber(String value) {
        this.eTaxNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad ntsApprovedNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTSApprovedNumber() {
        return ntsApprovedNumber;
    }

    /**
     * Define el valor de la propiedad ntsApprovedNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTSApprovedNumber(String value) {
        this.ntsApprovedNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad eDocGenerationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDocGenerationType() {
        return eDocGenerationType;
    }

    /**
     * Define el valor de la propiedad eDocGenerationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDocGenerationType(String value) {
        this.eDocGenerationType = value;
    }

    /**
     * Obtiene el valor de la propiedad eDocSeries.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEDocSeries() {
        return eDocSeries;
    }

    /**
     * Define el valor de la propiedad eDocSeries.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEDocSeries(Long value) {
        this.eDocSeries = value;
    }

    /**
     * Obtiene el valor de la propiedad eDocNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDocNum() {
        return eDocNum;
    }

    /**
     * Define el valor de la propiedad eDocNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDocNum(String value) {
        this.eDocNum = value;
    }

    /**
     * Obtiene el valor de la propiedad eDocExportFormat.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEDocExportFormat() {
        return eDocExportFormat;
    }

    /**
     * Define el valor de la propiedad eDocExportFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEDocExportFormat(Long value) {
        this.eDocExportFormat = value;
    }

    /**
     * Obtiene el valor de la propiedad eDocStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDocStatus() {
        return eDocStatus;
    }

    /**
     * Define el valor de la propiedad eDocStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDocStatus(String value) {
        this.eDocStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad eDocErrorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDocErrorCode() {
        return eDocErrorCode;
    }

    /**
     * Define el valor de la propiedad eDocErrorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDocErrorCode(String value) {
        this.eDocErrorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad eDocErrorMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDocErrorMessage() {
        return eDocErrorMessage;
    }

    /**
     * Define el valor de la propiedad eDocErrorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDocErrorMessage(String value) {
        this.eDocErrorMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad downPaymentStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownPaymentStatus() {
        return downPaymentStatus;
    }

    /**
     * Define el valor de la propiedad downPaymentStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownPaymentStatus(String value) {
        this.downPaymentStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad groupSeries.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupSeries() {
        return groupSeries;
    }

    /**
     * Define el valor de la propiedad groupSeries.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupSeries(Long value) {
        this.groupSeries = value;
    }

    /**
     * Obtiene el valor de la propiedad groupNumber.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupNumber() {
        return groupNumber;
    }

    /**
     * Define el valor de la propiedad groupNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupNumber(Long value) {
        this.groupNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad groupHandWritten.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupHandWritten() {
        return groupHandWritten;
    }

    /**
     * Define el valor de la propiedad groupHandWritten.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupHandWritten(String value) {
        this.groupHandWritten = value;
    }

    /**
     * Obtiene el valor de la propiedad reopenOriginalDocument.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReopenOriginalDocument() {
        return reopenOriginalDocument;
    }

    /**
     * Define el valor de la propiedad reopenOriginalDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReopenOriginalDocument(String value) {
        this.reopenOriginalDocument = value;
    }

    /**
     * Obtiene el valor de la propiedad reopenManuallyClosedOrCanceledDocument.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReopenManuallyClosedOrCanceledDocument() {
        return reopenManuallyClosedOrCanceledDocument;
    }

    /**
     * Define el valor de la propiedad reopenManuallyClosedOrCanceledDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReopenManuallyClosedOrCanceledDocument(String value) {
        this.reopenManuallyClosedOrCanceledDocument = value;
    }

    /**
     * Obtiene el valor de la propiedad createOnlineQuotation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateOnlineQuotation() {
        return createOnlineQuotation;
    }

    /**
     * Define el valor de la propiedad createOnlineQuotation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateOnlineQuotation(String value) {
        this.createOnlineQuotation = value;
    }

    /**
     * Obtiene el valor de la propiedad posEquipmentNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSEquipmentNumber() {
        return posEquipmentNumber;
    }

    /**
     * Define el valor de la propiedad posEquipmentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSEquipmentNumber(String value) {
        this.posEquipmentNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad posManufacturerSerialNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSManufacturerSerialNumber() {
        return posManufacturerSerialNumber;
    }

    /**
     * Define el valor de la propiedad posManufacturerSerialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSManufacturerSerialNumber(String value) {
        this.posManufacturerSerialNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad posCashierNumber.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPOSCashierNumber() {
        return posCashierNumber;
    }

    /**
     * Define el valor de la propiedad posCashierNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPOSCashierNumber(Long value) {
        this.posCashierNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad applyCurrentVATRatesForDownPaymentsToDraw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyCurrentVATRatesForDownPaymentsToDraw() {
        return applyCurrentVATRatesForDownPaymentsToDraw;
    }

    /**
     * Define el valor de la propiedad applyCurrentVATRatesForDownPaymentsToDraw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyCurrentVATRatesForDownPaymentsToDraw(String value) {
        this.applyCurrentVATRatesForDownPaymentsToDraw = value;
    }

    /**
     * Obtiene el valor de la propiedad closingOption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingOption() {
        return closingOption;
    }

    /**
     * Define el valor de la propiedad closingOption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingOption(String value) {
        this.closingOption = value;
    }

    /**
     * Obtiene el valor de la propiedad specifiedClosingDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecifiedClosingDate() {
        return specifiedClosingDate;
    }

    /**
     * Define el valor de la propiedad specifiedClosingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecifiedClosingDate(XMLGregorianCalendar value) {
        this.specifiedClosingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad openForLandedCosts.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenForLandedCosts() {
        return openForLandedCosts;
    }

    /**
     * Define el valor de la propiedad openForLandedCosts.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenForLandedCosts(String value) {
        this.openForLandedCosts = value;
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
     * Obtiene el valor de la propiedad totalDiscountFC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalDiscountFC() {
        return totalDiscountFC;
    }

    /**
     * Define el valor de la propiedad totalDiscountFC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalDiscountFC(Double value) {
        this.totalDiscountFC = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDiscountSC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalDiscountSC() {
        return totalDiscountSC;
    }

    /**
     * Define el valor de la propiedad totalDiscountSC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalDiscountSC(Double value) {
        this.totalDiscountSC = value;
    }

    /**
     * Obtiene el valor de la propiedad relevantToGTS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelevantToGTS() {
        return relevantToGTS;
    }

    /**
     * Define el valor de la propiedad relevantToGTS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelevantToGTS(String value) {
        this.relevantToGTS = value;
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
     * Obtiene el valor de la propiedad annualInvoiceDeclarationReference.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnnualInvoiceDeclarationReference() {
        return annualInvoiceDeclarationReference;
    }

    /**
     * Define el valor de la propiedad annualInvoiceDeclarationReference.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnnualInvoiceDeclarationReference(Long value) {
        this.annualInvoiceDeclarationReference = value;
    }

    /**
     * Obtiene el valor de la propiedad supplier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * Define el valor de la propiedad supplier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplier(String value) {
        this.supplier = value;
    }

    /**
     * Obtiene el valor de la propiedad releaser.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReleaser() {
        return releaser;
    }

    /**
     * Define el valor de la propiedad releaser.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReleaser(Long value) {
        this.releaser = value;
    }

    /**
     * Obtiene el valor de la propiedad receiver.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReceiver() {
        return receiver;
    }

    /**
     * Define el valor de la propiedad receiver.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReceiver(Long value) {
        this.receiver = value;
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
     * Obtiene el valor de la propiedad isAlteration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAlteration() {
        return isAlteration;
    }

    /**
     * Define el valor de la propiedad isAlteration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAlteration(String value) {
        this.isAlteration = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelStatus() {
        return cancelStatus;
    }

    /**
     * Define el valor de la propiedad cancelStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelStatus(String value) {
        this.cancelStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad assetValueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssetValueDate() {
        return assetValueDate;
    }

    /**
     * Define el valor de la propiedad assetValueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssetValueDate(XMLGregorianCalendar value) {
        this.assetValueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad documentDelivery.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDelivery() {
        return documentDelivery;
    }

    /**
     * Define el valor de la propiedad documentDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDelivery(String value) {
        this.documentDelivery = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Define el valor de la propiedad authorizationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad startDeliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDeliveryDate() {
        return startDeliveryDate;
    }

    /**
     * Define el valor de la propiedad startDeliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDeliveryDate(XMLGregorianCalendar value) {
        this.startDeliveryDate = value;
    }

    /**
     * Obtiene el valor de la propiedad startDeliveryTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDeliveryTime() {
        return startDeliveryTime;
    }

    /**
     * Define el valor de la propiedad startDeliveryTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDeliveryTime(XMLGregorianCalendar value) {
        this.startDeliveryTime = value;
    }

    /**
     * Obtiene el valor de la propiedad endDeliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDeliveryDate() {
        return endDeliveryDate;
    }

    /**
     * Define el valor de la propiedad endDeliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDeliveryDate(XMLGregorianCalendar value) {
        this.endDeliveryDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDeliveryTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDeliveryTime() {
        return endDeliveryTime;
    }

    /**
     * Define el valor de la propiedad endDeliveryTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDeliveryTime(XMLGregorianCalendar value) {
        this.endDeliveryTime = value;
    }

    /**
     * Obtiene el valor de la propiedad vehiclePlate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehiclePlate() {
        return vehiclePlate;
    }

    /**
     * Define el valor de la propiedad vehiclePlate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehiclePlate(String value) {
        this.vehiclePlate = value;
    }

    /**
     * Obtiene el valor de la propiedad atDocumentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATDocumentType() {
        return atDocumentType;
    }

    /**
     * Define el valor de la propiedad atDocumentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATDocumentType(String value) {
        this.atDocumentType = value;
    }

    /**
     * Obtiene el valor de la propiedad elecCommStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElecCommStatus() {
        return elecCommStatus;
    }

    /**
     * Define el valor de la propiedad elecCommStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElecCommStatus(String value) {
        this.elecCommStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad elecCommMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElecCommMessage() {
        return elecCommMessage;
    }

    /**
     * Define el valor de la propiedad elecCommMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElecCommMessage(String value) {
        this.elecCommMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad reuseDocumentNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuseDocumentNum() {
        return reuseDocumentNum;
    }

    /**
     * Define el valor de la propiedad reuseDocumentNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReuseDocumentNum(String value) {
        this.reuseDocumentNum = value;
    }

    /**
     * Obtiene el valor de la propiedad reuseNotaFiscalNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuseNotaFiscalNum() {
        return reuseNotaFiscalNum;
    }

    /**
     * Define el valor de la propiedad reuseNotaFiscalNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReuseNotaFiscalNum(String value) {
        this.reuseNotaFiscalNum = value;
    }

    /**
     * Obtiene el valor de la propiedad printSEPADirect.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintSEPADirect() {
        return printSEPADirect;
    }

    /**
     * Define el valor de la propiedad printSEPADirect.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintSEPADirect(String value) {
        this.printSEPADirect = value;
    }

    /**
     * Obtiene el valor de la propiedad fiscalDocNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalDocNum() {
        return fiscalDocNum;
    }

    /**
     * Define el valor de la propiedad fiscalDocNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalDocNum(String value) {
        this.fiscalDocNum = value;
    }

    /**
     * Obtiene el valor de la propiedad posDailySummaryNo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPOSDailySummaryNo() {
        return posDailySummaryNo;
    }

    /**
     * Define el valor de la propiedad posDailySummaryNo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPOSDailySummaryNo(Long value) {
        this.posDailySummaryNo = value;
    }

    /**
     * Obtiene el valor de la propiedad posReceiptNo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPOSReceiptNo() {
        return posReceiptNo;
    }

    /**
     * Define el valor de la propiedad posReceiptNo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPOSReceiptNo(Long value) {
        this.posReceiptNo = value;
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
     * Obtiene el valor de la propiedad interimType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterimType() {
        return interimType;
    }

    /**
     * Define el valor de la propiedad interimType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterimType(String value) {
        this.interimType = value;
    }

    /**
     * Obtiene el valor de la propiedad relatedType.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRelatedType() {
        return relatedType;
    }

    /**
     * Define el valor de la propiedad relatedType.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRelatedType(Long value) {
        this.relatedType = value;
    }

    /**
     * Obtiene el valor de la propiedad relatedEntry.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRelatedEntry() {
        return relatedEntry;
    }

    /**
     * Define el valor de la propiedad relatedEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRelatedEntry(Long value) {
        this.relatedEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad uAutorret.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUAutorret() {
        return uAutorret;
    }

    /**
     * Define el valor de la propiedad uAutorret.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUAutorret(String value) {
        this.uAutorret = value;
    }

    /**
     * Obtiene el valor de la propiedad ubpcost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBPCOST() {
        return ubpcost;
    }

    /**
     * Define el valor de la propiedad ubpcost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBPCOST(String value) {
        this.ubpcost = value;
    }

    /**
     * Obtiene el valor de la propiedad uwuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUWUID() {
        return uwuid;
    }

    /**
     * Define el valor de la propiedad uwuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUWUID(String value) {
        this.uwuid = value;
    }

    /**
     * Obtiene el valor de la propiedad uTipoNota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTipoNota() {
        return uTipoNota;
    }

    /**
     * Define el valor de la propiedad uTipoNota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTipoNota(String value) {
        this.uTipoNota = value;
    }

    /**
     * Obtiene el valor de la propiedad uRetefue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURetefue() {
        return uRetefue;
    }

    /**
     * Define el valor de la propiedad uRetefue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURetefue(String value) {
        this.uRetefue = value;
    }

    /**
     * Obtiene el valor de la propiedad uReteIca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUReteIca() {
        return uReteIca;
    }

    /**
     * Define el valor de la propiedad uReteIca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUReteIca(String value) {
        this.uReteIca = value;
    }

    /**
     * Obtiene el valor de la propiedad uok1IVAPA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOK1IVAPA() {
        return uok1IVAPA;
    }

    /**
     * Define el valor de la propiedad uok1IVAPA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOK1IVAPA(String value) {
        this.uok1IVAPA = value;
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
     * Obtiene el valor de la propiedad uDiseno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDiseno() {
        return uDiseno;
    }

    /**
     * Define el valor de la propiedad uDiseno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDiseno(String value) {
        this.uDiseno = value;
    }

    /**
     * Obtiene el valor de la propiedad uDiseno2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDiseno2() {
        return uDiseno2;
    }

    /**
     * Define el valor de la propiedad uDiseno2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDiseno2(String value) {
        this.uDiseno2 = value;
    }

    /**
     * Obtiene el valor de la propiedad uComdeco1.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUComdeco1() {
        return uComdeco1;
    }

    /**
     * Define el valor de la propiedad uComdeco1.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUComdeco1(Long value) {
        this.uComdeco1 = value;
    }

    /**
     * Obtiene el valor de la propiedad uComdeco2.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUComdeco2() {
        return uComdeco2;
    }

    /**
     * Define el valor de la propiedad uComdeco2.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUComdeco2(Long value) {
        this.uComdeco2 = value;
    }

    /**
     * Obtiene el valor de la propiedad uVendedor1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVendedor1() {
        return uVendedor1;
    }

    /**
     * Define el valor de la propiedad uVendedor1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVendedor1(String value) {
        this.uVendedor1 = value;
    }

    /**
     * Obtiene el valor de la propiedad uVendedor2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVendedor2() {
        return uVendedor2;
    }

    /**
     * Define el valor de la propiedad uVendedor2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVendedor2(String value) {
        this.uVendedor2 = value;
    }

    /**
     * Obtiene el valor de la propiedad uVendedor3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVendedor3() {
        return uVendedor3;
    }

    /**
     * Define el valor de la propiedad uVendedor3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVendedor3(String value) {
        this.uVendedor3 = value;
    }

    /**
     * Obtiene el valor de la propiedad uVendedor4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVendedor4() {
        return uVendedor4;
    }

    /**
     * Define el valor de la propiedad uVendedor4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVendedor4(String value) {
        this.uVendedor4 = value;
    }

    /**
     * Obtiene el valor de la propiedad uVendedor5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVendedor5() {
        return uVendedor5;
    }

    /**
     * Define el valor de la propiedad uVendedor5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVendedor5(String value) {
        this.uVendedor5 = value;
    }

    /**
     * Obtiene el valor de la propiedad uFactor.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUFactor() {
        return uFactor;
    }

    /**
     * Define el valor de la propiedad uFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUFactor(Long value) {
        this.uFactor = value;
    }

    /**
     * Obtiene el valor de la propiedad unwrPicS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNWRPicS() {
        return unwrPicS;
    }

    /**
     * Define el valor de la propiedad unwrPicS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNWRPicS(String value) {
        this.unwrPicS = value;
    }

    /**
     * Obtiene el valor de la propiedad unwrbRet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNWRBRet() {
        return unwrbRet;
    }

    /**
     * Define el valor de la propiedad unwrbRet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNWRBRet(String value) {
        this.unwrbRet = value;
    }

    /**
     * Obtiene el valor de la propiedad uNwrPAut.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUNwrPAut() {
        return uNwrPAut;
    }

    /**
     * Define el valor de la propiedad uNwrPAut.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUNwrPAut(Long value) {
        this.uNwrPAut = value;
    }

    /**
     * Obtiene el valor de la propiedad uNwrNote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNwrNote() {
        return uNwrNote;
    }

    /**
     * Define el valor de la propiedad uNwrNote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNwrNote(String value) {
        this.uNwrNote = value;
    }

    /**
     * Obtiene el valor de la propiedad uNwrTag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNwrTag() {
        return uNwrTag;
    }

    /**
     * Define el valor de la propiedad uNwrTag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNwrTag(String value) {
        this.uNwrTag = value;
    }

    /**
     * Obtiene el valor de la propiedad uNwrFrgt.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUNwrFrgt() {
        return uNwrFrgt;
    }

    /**
     * Define el valor de la propiedad uNwrFrgt.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUNwrFrgt(Double value) {
        this.uNwrFrgt = value;
    }

    /**
     * Obtiene el valor de la propiedad unwrnorm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNWRNORM() {
        return unwrnorm;
    }

    /**
     * Define el valor de la propiedad unwrnorm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNWRNORM(String value) {
        this.unwrnorm = value;
    }

    /**
     * Obtiene el valor de la propiedad uTypeExped.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTypeExped() {
        return uTypeExped;
    }

    /**
     * Define el valor de la propiedad uTypeExped.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTypeExped(String value) {
        this.uTypeExped = value;
    }

    /**
     * Obtiene el valor de la propiedad uCreaNC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCreaNC() {
        return uCreaNC;
    }

    /**
     * Define el valor de la propiedad uCreaNC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCreaNC(String value) {
        this.uCreaNC = value;
    }

    /**
     * Obtiene el valor de la propiedad uNumFact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNumFact() {
        return uNumFact;
    }

    /**
     * Define el valor de la propiedad uNumFact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNumFact(String value) {
        this.uNumFact = value;
    }

    /**
     * Obtiene el valor de la propiedad uAprobado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUAprobado() {
        return uAprobado;
    }

    /**
     * Define el valor de la propiedad uAprobado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUAprobado(String value) {
        this.uAprobado = value;
    }

    /**
     * Obtiene el valor de la propiedad uComVend1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUComVend1() {
        return uComVend1;
    }

    /**
     * Define el valor de la propiedad uComVend1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUComVend1(String value) {
        this.uComVend1 = value;
    }

    /**
     * Obtiene el valor de la propiedad uComVend2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUComVend2() {
        return uComVend2;
    }

    /**
     * Define el valor de la propiedad uComVend2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUComVend2(String value) {
        this.uComVend2 = value;
    }

    /**
     * Obtiene el valor de la propiedad uComVend3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUComVend3() {
        return uComVend3;
    }

    /**
     * Define el valor de la propiedad uComVend3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUComVend3(String value) {
        this.uComVend3 = value;
    }

    /**
     * Obtiene el valor de la propiedad uComVend4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUComVend4() {
        return uComVend4;
    }

    /**
     * Define el valor de la propiedad uComVend4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUComVend4(String value) {
        this.uComVend4 = value;
    }

    /**
     * Obtiene el valor de la propiedad uComVend5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUComVend5() {
        return uComVend5;
    }

    /**
     * Define el valor de la propiedad uComVend5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUComVend5(String value) {
        this.uComVend5 = value;
    }

    /**
     * Obtiene el valor de la propiedad uActCosto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUActCosto() {
        return uActCosto;
    }

    /**
     * Define el valor de la propiedad uActCosto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUActCosto(String value) {
        this.uActCosto = value;
    }

    /**
     * Obtiene el valor de la propiedad uDocEntryLeg.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUDocEntryLeg() {
        return uDocEntryLeg;
    }

    /**
     * Define el valor de la propiedad uDocEntryLeg.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUDocEntryLeg(Long value) {
        this.uDocEntryLeg = value;
    }

    /**
     * Obtiene el valor de la propiedad uIdLineLeg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIdLineLeg() {
        return uIdLineLeg;
    }

    /**
     * Define el valor de la propiedad uIdLineLeg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIdLineLeg(String value) {
        this.uIdLineLeg = value;
    }

    /**
     * Obtiene el valor de la propiedad uSerieLeg.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUSerieLeg() {
        return uSerieLeg;
    }

    /**
     * Define el valor de la propiedad uSerieLeg.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUSerieLeg(Long value) {
        this.uSerieLeg = value;
    }

    /**
     * Obtiene el valor de la propiedad uEsIndep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUEsIndep() {
        return uEsIndep;
    }

    /**
     * Define el valor de la propiedad uEsIndep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUEsIndep(String value) {
        this.uEsIndep = value;
    }

    /**
     * Obtiene el valor de la propiedad uFirma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUFirma() {
        return uFirma;
    }

    /**
     * Define el valor de la propiedad uFirma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUFirma(String value) {
        this.uFirma = value;
    }

    /**
     * Obtiene el valor de la propiedad uCedula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCedula() {
        return uCedula;
    }

    /**
     * Define el valor de la propiedad uCedula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCedula(String value) {
        this.uCedula = value;
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
     * Obtiene el valor de la propiedad uCatRet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCatRet() {
        return uCatRet;
    }

    /**
     * Define el valor de la propiedad uCatRet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCatRet(String value) {
        this.uCatRet = value;
    }

    /**
     * Obtiene el valor de la propiedad uOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOrigen() {
        return uOrigen;
    }

    /**
     * Define el valor de la propiedad uOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOrigen(String value) {
        this.uOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad documentApprovalRequests.
     * 
     * @return
     *     possible object is
     *     {@link Document.DocumentApprovalRequests }
     *     
     */
    public Document.DocumentApprovalRequests getDocumentApprovalRequests() {
        return documentApprovalRequests;
    }

    /**
     * Define el valor de la propiedad documentApprovalRequests.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.DocumentApprovalRequests }
     *     
     */
    public void setDocumentApprovalRequests(Document.DocumentApprovalRequests value) {
        this.documentApprovalRequests = value;
    }

    /**
     * Obtiene el valor de la propiedad documentLines.
     * 
     * @return
     *     possible object is
     *     {@link Document.DocumentLines }
     *     
     */
    public Document.DocumentLines getDocumentLines() {
        return documentLines;
    }

    /**
     * Define el valor de la propiedad documentLines.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.DocumentLines }
     *     
     */
    public void setDocumentLines(Document.DocumentLines value) {
        this.documentLines = value;
    }

    /**
     * Obtiene el valor de la propiedad taxExtension.
     * 
     * @return
     *     possible object is
     *     {@link Document.TaxExtension }
     *     
     */
    public Document.TaxExtension getTaxExtension() {
        return taxExtension;
    }

    /**
     * Define el valor de la propiedad taxExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.TaxExtension }
     *     
     */
    public void setTaxExtension(Document.TaxExtension value) {
        this.taxExtension = value;
    }

    /**
     * Obtiene el valor de la propiedad addressExtension.
     * 
     * @return
     *     possible object is
     *     {@link Document.AddressExtension }
     *     
     */
    public Document.AddressExtension getAddressExtension() {
        return addressExtension;
    }

    /**
     * Define el valor de la propiedad addressExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.AddressExtension }
     *     
     */
    public void setAddressExtension(Document.AddressExtension value) {
        this.addressExtension = value;
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
     *         &lt;element name="ShipToStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToStreetNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToStreetNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToGlobalLocationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToGlobalLocationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class AddressExtension {

        @XmlElement(name = "ShipToStreet")
        protected String shipToStreet;
        @XmlElement(name = "ShipToStreetNo")
        protected String shipToStreetNo;
        @XmlElement(name = "ShipToBlock")
        protected String shipToBlock;
        @XmlElement(name = "ShipToBuilding")
        protected String shipToBuilding;
        @XmlElement(name = "ShipToCity")
        protected String shipToCity;
        @XmlElement(name = "ShipToZipCode")
        protected String shipToZipCode;
        @XmlElement(name = "ShipToCounty")
        protected String shipToCounty;
        @XmlElement(name = "ShipToState")
        protected String shipToState;
        @XmlElement(name = "ShipToCountry")
        protected String shipToCountry;
        @XmlElement(name = "ShipToAddressType")
        protected String shipToAddressType;
        @XmlElement(name = "BillToStreet")
        protected String billToStreet;
        @XmlElement(name = "BillToStreetNo")
        protected String billToStreetNo;
        @XmlElement(name = "BillToBlock")
        protected String billToBlock;
        @XmlElement(name = "BillToBuilding")
        protected String billToBuilding;
        @XmlElement(name = "BillToCity")
        protected String billToCity;
        @XmlElement(name = "BillToZipCode")
        protected String billToZipCode;
        @XmlElement(name = "BillToCounty")
        protected String billToCounty;
        @XmlElement(name = "BillToState")
        protected String billToState;
        @XmlElement(name = "BillToCountry")
        protected String billToCountry;
        @XmlElement(name = "BillToAddressType")
        protected String billToAddressType;
        @XmlElement(name = "ShipToGlobalLocationNumber")
        protected String shipToGlobalLocationNumber;
        @XmlElement(name = "BillToGlobalLocationNumber")
        protected String billToGlobalLocationNumber;
        @XmlElement(name = "ShipToAddress2")
        protected String shipToAddress2;
        @XmlElement(name = "ShipToAddress3")
        protected String shipToAddress3;
        @XmlElement(name = "BillToAddress2")
        protected String billToAddress2;
        @XmlElement(name = "BillToAddress3")
        protected String billToAddress3;

        /**
         * Obtiene el valor de la propiedad shipToStreet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipToStreet() {
            return shipToStreet;
        }

        /**
         * Define el valor de la propiedad shipToStreet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipToStreet(String value) {
            this.shipToStreet = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToStreetNo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipToStreetNo() {
            return shipToStreetNo;
        }

        /**
         * Define el valor de la propiedad shipToStreetNo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipToStreetNo(String value) {
            this.shipToStreetNo = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToBlock.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipToBlock() {
            return shipToBlock;
        }

        /**
         * Define el valor de la propiedad shipToBlock.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipToBlock(String value) {
            this.shipToBlock = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToBuilding.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipToBuilding() {
            return shipToBuilding;
        }

        /**
         * Define el valor de la propiedad shipToBuilding.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipToBuilding(String value) {
            this.shipToBuilding = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToCity.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipToCity() {
            return shipToCity;
        }

        /**
         * Define el valor de la propiedad shipToCity.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipToCity(String value) {
            this.shipToCity = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToZipCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipToZipCode() {
            return shipToZipCode;
        }

        /**
         * Define el valor de la propiedad shipToZipCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipToZipCode(String value) {
            this.shipToZipCode = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToCounty.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipToCounty() {
            return shipToCounty;
        }

        /**
         * Define el valor de la propiedad shipToCounty.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipToCounty(String value) {
            this.shipToCounty = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToState.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipToState() {
            return shipToState;
        }

        /**
         * Define el valor de la propiedad shipToState.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipToState(String value) {
            this.shipToState = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToCountry.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipToCountry() {
            return shipToCountry;
        }

        /**
         * Define el valor de la propiedad shipToCountry.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipToCountry(String value) {
            this.shipToCountry = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToAddressType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipToAddressType() {
            return shipToAddressType;
        }

        /**
         * Define el valor de la propiedad shipToAddressType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipToAddressType(String value) {
            this.shipToAddressType = value;
        }

        /**
         * Obtiene el valor de la propiedad billToStreet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillToStreet() {
            return billToStreet;
        }

        /**
         * Define el valor de la propiedad billToStreet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillToStreet(String value) {
            this.billToStreet = value;
        }

        /**
         * Obtiene el valor de la propiedad billToStreetNo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillToStreetNo() {
            return billToStreetNo;
        }

        /**
         * Define el valor de la propiedad billToStreetNo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillToStreetNo(String value) {
            this.billToStreetNo = value;
        }

        /**
         * Obtiene el valor de la propiedad billToBlock.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillToBlock() {
            return billToBlock;
        }

        /**
         * Define el valor de la propiedad billToBlock.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillToBlock(String value) {
            this.billToBlock = value;
        }

        /**
         * Obtiene el valor de la propiedad billToBuilding.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillToBuilding() {
            return billToBuilding;
        }

        /**
         * Define el valor de la propiedad billToBuilding.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillToBuilding(String value) {
            this.billToBuilding = value;
        }

        /**
         * Obtiene el valor de la propiedad billToCity.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillToCity() {
            return billToCity;
        }

        /**
         * Define el valor de la propiedad billToCity.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillToCity(String value) {
            this.billToCity = value;
        }

        /**
         * Obtiene el valor de la propiedad billToZipCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillToZipCode() {
            return billToZipCode;
        }

        /**
         * Define el valor de la propiedad billToZipCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillToZipCode(String value) {
            this.billToZipCode = value;
        }

        /**
         * Obtiene el valor de la propiedad billToCounty.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillToCounty() {
            return billToCounty;
        }

        /**
         * Define el valor de la propiedad billToCounty.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillToCounty(String value) {
            this.billToCounty = value;
        }

        /**
         * Obtiene el valor de la propiedad billToState.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillToState() {
            return billToState;
        }

        /**
         * Define el valor de la propiedad billToState.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillToState(String value) {
            this.billToState = value;
        }

        /**
         * Obtiene el valor de la propiedad billToCountry.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillToCountry() {
            return billToCountry;
        }

        /**
         * Define el valor de la propiedad billToCountry.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillToCountry(String value) {
            this.billToCountry = value;
        }

        /**
         * Obtiene el valor de la propiedad billToAddressType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillToAddressType() {
            return billToAddressType;
        }

        /**
         * Define el valor de la propiedad billToAddressType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillToAddressType(String value) {
            this.billToAddressType = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToGlobalLocationNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipToGlobalLocationNumber() {
            return shipToGlobalLocationNumber;
        }

        /**
         * Define el valor de la propiedad shipToGlobalLocationNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipToGlobalLocationNumber(String value) {
            this.shipToGlobalLocationNumber = value;
        }

        /**
         * Obtiene el valor de la propiedad billToGlobalLocationNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillToGlobalLocationNumber() {
            return billToGlobalLocationNumber;
        }

        /**
         * Define el valor de la propiedad billToGlobalLocationNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillToGlobalLocationNumber(String value) {
            this.billToGlobalLocationNumber = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToAddress2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipToAddress2() {
            return shipToAddress2;
        }

        /**
         * Define el valor de la propiedad shipToAddress2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipToAddress2(String value) {
            this.shipToAddress2 = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToAddress3.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipToAddress3() {
            return shipToAddress3;
        }

        /**
         * Define el valor de la propiedad shipToAddress3.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipToAddress3(String value) {
            this.shipToAddress3 = value;
        }

        /**
         * Obtiene el valor de la propiedad billToAddress2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillToAddress2() {
            return billToAddress2;
        }

        /**
         * Define el valor de la propiedad billToAddress2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillToAddress2(String value) {
            this.billToAddress2 = value;
        }

        /**
         * Obtiene el valor de la propiedad billToAddress3.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillToAddress3() {
            return billToAddress3;
        }

        /**
         * Define el valor de la propiedad billToAddress3.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillToAddress3(String value) {
            this.billToAddress3 = value;
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
     *         &lt;element name="Document_ApprovalRequest" maxOccurs="unbounded" minOccurs="0">
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
        "documentApprovalRequest"
    })
    public static class DocumentApprovalRequests {

        @XmlElement(name = "Document_ApprovalRequest")
        protected List<Document.DocumentApprovalRequests.DocumentApprovalRequest> documentApprovalRequest;

        /**
         * Gets the value of the documentApprovalRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentApprovalRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentApprovalRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.DocumentApprovalRequests.DocumentApprovalRequest }
         * 
         * 
         */
        public List<Document.DocumentApprovalRequests.DocumentApprovalRequest> getDocumentApprovalRequest() {
            if (documentApprovalRequest == null) {
                documentApprovalRequest = new ArrayList<Document.DocumentApprovalRequests.DocumentApprovalRequest>();
            }
            return this.documentApprovalRequest;
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
        public static class DocumentApprovalRequest {

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
     *         &lt;element name="DocumentLine" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="PriceAfterVAT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="VendorNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SalesPersonCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="CommisionPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TreeType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="iNotATree"/>
     *                         &lt;enumeration value="iAssemblyTree"/>
     *                         &lt;enumeration value="iSalesTree"/>
     *                         &lt;enumeration value="iProductionTree"/>
     *                         &lt;enumeration value="iTemplateTree"/>
     *                         &lt;enumeration value="iIngredient"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UseBaseUnits" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SupplierCatNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CostingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="VatGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Hight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Lengh1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Lengh1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Lengh2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Lengh2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Factor1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Factor2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Factor3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Factor4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TaxType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tt_Yes"/>
     *                         &lt;enumeration value="tt_No"/>
     *                         &lt;enumeration value="tt_UseTax"/>
     *                         &lt;enumeration value="tt_OffsetTax"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TaxLiable" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PickStatus" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PickQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="PickListIdNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="OriginalItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BackOrder" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FreeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ShippingMethod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="POTargetNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="POTargetEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="POTargetRowNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="CorrectionInvoiceItem" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="ciis_Was"/>
     *                         &lt;enumeration value="ciis_ShouldBe"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CorrInvAmountToStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="CorrInvAmountToDiffAcct" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AppliedTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AppliedTaxFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AppliedTaxSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="WTLiable" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DeferredTax" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="EqualizationTaxPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TotalEqualizationTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TotalEqualizationTaxFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TotalEqualizationTaxSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="NetTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="NetTaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="NetTaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UnitsOfMeasurment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="LineTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TaxPercentagePerRow" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TaxTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="ConsumerSalesForecast" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ExciseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TaxPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TotalInclTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="CountryOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SWW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TransactionType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="botrntComplete"/>
     *                         &lt;enumeration value="botrntReject"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DistributeExpense" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ShipToCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RowTotalFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="RowTotalSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="LastBuyInmPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="LastBuyDistributeSumFc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="LastBuyDistributeSumSc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="LastBuyDistributeSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="StockDistributesumForeign" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="StockDistributesumSystem" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="StockDistributesum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="StockInmPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="PickStatusEx" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="dlps_Picked"/>
     *                         &lt;enumeration value="dlps_NotPicked"/>
     *                         &lt;enumeration value="dlps_ReleasedForPicking"/>
     *                         &lt;enumeration value="dlps_PartiallyPicked"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TaxBeforeDPM" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TaxBeforeDPMFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="TaxBeforeDPMSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="CFOPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CSTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Usage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="TaxOnly" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="VisualOrder" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseOpenQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="LineStatus" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="bost_Open"/>
     *                         &lt;enumeration value="bost_Close"/>
     *                         &lt;enumeration value="bost_Paid"/>
     *                         &lt;enumeration value="bost_Delivered"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PackageQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LineType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="dlt_Regular"/>
     *                         &lt;enumeration value="dlt_Alternative"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="COGSCostingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="COGSAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ChangeAssemlyBoMWarehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GrossBuyPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="GrossBase" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="GrossProfitTotalBasePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="CostingCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CostingCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CostingCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CostingCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ItemDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ActualDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="RemainingOpenQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="OpenAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="OpenAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="OpenAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="ExLineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RequiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="RequiredQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="COGSCostingCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="COGSCostingCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="COGSCostingCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="COGSCostingCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CSTforIPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CSTforPIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CSTforCOFINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CreditOriginCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WithoutInventoryMovement" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AgreementNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="AgreementRowNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ShipToDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ActualBaseEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ActualBaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Surpluses" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="DefectAndBreakup" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Shortages" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="ConsiderQuantity" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PartialRetirement" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RetirementQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="RetirementAPC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="ThirdParty" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="UoMCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InventoryQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="RemainingOpenInventoryQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="ParentLineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Incoterms" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="TransportMode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ItemType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="dit_Item"/>
     *                         &lt;enumeration value="dit_Resource"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ChangeInventoryQuantityIndependently" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FreeOfChargeBP" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="U_IVCDone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_EstadoP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_NWR_Base" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_CustDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="U_NWR_QtyAllocated" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="U_ReclamQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="U_QAMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_IncomingQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="U_Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_DI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_lineNumFv" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="U_Images" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_numPartes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="U_Averias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LineTaxJurisdictions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="LineTaxJurisdiction" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
     *                   &lt;element name="SerialNumbers" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SerialNumber" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="ManufactureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="ReceptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="WarrantyStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="WarrantyEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="BatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="SystemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
     *                   &lt;element name="BatchNumbers" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BatchNumber" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="BatchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="ManufacturingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="AddmisionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
     *                   &lt;element name="DocumentLinesBinAllocations" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DocumentLinesBinAllocation" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="BinAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="AllowNegativeQuantity" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="tNO"/>
     *                                             &lt;enumeration value="tYES"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="SerialAndBatchNumbersBaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
        "documentLine"
    })
    public static class DocumentLines {

        @XmlElement(name = "DocumentLine")
        protected List<Document.DocumentLines.DocumentLine> documentLine;

        /**
         * Gets the value of the documentLine property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentLine property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.DocumentLines.DocumentLine }
         * 
         * 
         */
        public List<Document.DocumentLines.DocumentLine> getDocumentLine() {
            if (documentLine == null) {
                documentLine = new ArrayList<Document.DocumentLines.DocumentLine>();
            }
            return this.documentLine;
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
         *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="PriceAfterVAT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="VendorNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SalesPersonCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="CommisionPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TreeType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="iNotATree"/>
         *               &lt;enumeration value="iAssemblyTree"/>
         *               &lt;enumeration value="iSalesTree"/>
         *               &lt;enumeration value="iProductionTree"/>
         *               &lt;enumeration value="iTemplateTree"/>
         *               &lt;enumeration value="iIngredient"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UseBaseUnits" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SupplierCatNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CostingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="VatGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Hight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Lengh1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Lengh1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Lengh2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Lengh2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Factor1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Factor2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Factor3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Factor4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TaxType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tt_Yes"/>
         *               &lt;enumeration value="tt_No"/>
         *               &lt;enumeration value="tt_UseTax"/>
         *               &lt;enumeration value="tt_OffsetTax"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TaxLiable" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PickStatus" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PickQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="PickListIdNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="OriginalItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BackOrder" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FreeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ShippingMethod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="POTargetNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="POTargetEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="POTargetRowNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="CorrectionInvoiceItem" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="ciis_Was"/>
         *               &lt;enumeration value="ciis_ShouldBe"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CorrInvAmountToStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="CorrInvAmountToDiffAcct" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AppliedTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AppliedTaxFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AppliedTaxSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="WTLiable" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DeferredTax" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="EqualizationTaxPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TotalEqualizationTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TotalEqualizationTaxFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TotalEqualizationTaxSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="NetTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="NetTaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="NetTaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UnitsOfMeasurment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="LineTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TaxPercentagePerRow" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TaxTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="ConsumerSalesForecast" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ExciseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TaxPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TotalInclTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="CountryOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SWW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TransactionType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="botrntComplete"/>
         *               &lt;enumeration value="botrntReject"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DistributeExpense" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ShipToCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RowTotalFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="RowTotalSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="LastBuyInmPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="LastBuyDistributeSumFc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="LastBuyDistributeSumSc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="LastBuyDistributeSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="StockDistributesumForeign" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="StockDistributesumSystem" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="StockDistributesum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="StockInmPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="PickStatusEx" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="dlps_Picked"/>
         *               &lt;enumeration value="dlps_NotPicked"/>
         *               &lt;enumeration value="dlps_ReleasedForPicking"/>
         *               &lt;enumeration value="dlps_PartiallyPicked"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TaxBeforeDPM" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TaxBeforeDPMFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="TaxBeforeDPMSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="CFOPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CSTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Usage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="TaxOnly" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="VisualOrder" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseOpenQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="LineStatus" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="bost_Open"/>
         *               &lt;enumeration value="bost_Close"/>
         *               &lt;enumeration value="bost_Paid"/>
         *               &lt;enumeration value="bost_Delivered"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PackageQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LineType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="dlt_Regular"/>
         *               &lt;enumeration value="dlt_Alternative"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="COGSCostingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="COGSAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ChangeAssemlyBoMWarehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GrossBuyPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="GrossBase" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="GrossProfitTotalBasePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="CostingCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CostingCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CostingCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CostingCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ItemDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="ActualDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="RemainingOpenQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="OpenAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="OpenAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="OpenAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="ExLineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RequiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="RequiredQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="COGSCostingCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="COGSCostingCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="COGSCostingCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="COGSCostingCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CSTforIPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CSTforPIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CSTforCOFINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CreditOriginCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WithoutInventoryMovement" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AgreementNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="AgreementRowNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="ShipToDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ActualBaseEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="ActualBaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Surpluses" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="DefectAndBreakup" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Shortages" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="ConsiderQuantity" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PartialRetirement" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RetirementQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="RetirementAPC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="ThirdParty" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="UoMCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InventoryQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="RemainingOpenInventoryQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="ParentLineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Incoterms" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="TransportMode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="ItemType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="dit_Item"/>
         *               &lt;enumeration value="dit_Resource"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ChangeInventoryQuantityIndependently" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FreeOfChargeBP" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="U_IVCDone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_EstadoP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_NWR_Base" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_CustDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="U_NWR_QtyAllocated" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="U_ReclamQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="U_QAMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_IncomingQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="U_Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_DI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_lineNumFv" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="U_Images" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_numPartes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="U_Averias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LineTaxJurisdictions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="LineTaxJurisdiction" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
         *         &lt;element name="SerialNumbers" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SerialNumber" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="ManufactureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="ReceptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="WarrantyStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="WarrantyEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="BatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="SystemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
         *         &lt;element name="BatchNumbers" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BatchNumber" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="BatchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="ManufacturingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="AddmisionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
         *         &lt;element name="DocumentLinesBinAllocations" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DocumentLinesBinAllocation" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="BinAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="AllowNegativeQuantity" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value="tNO"/>
         *                                   &lt;enumeration value="tYES"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="SerialAndBatchNumbersBaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
        public static class DocumentLine {

            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "ItemCode")
            protected String itemCode;
            @XmlElement(name = "ItemDescription")
            protected String itemDescription;
            @XmlElement(name = "Quantity")
            protected Double quantity;
            @XmlElement(name = "ShipDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar shipDate;
            @XmlElement(name = "Price")
            protected Double price;
            @XmlElement(name = "PriceAfterVAT")
            protected Double priceAfterVAT;
            @XmlElement(name = "Currency")
            protected String currency;
            @XmlElement(name = "Rate")
            protected Double rate;
            @XmlElement(name = "DiscountPercent")
            protected Double discountPercent;
            @XmlElement(name = "VendorNum")
            protected String vendorNum;
            @XmlElement(name = "SerialNum")
            protected String serialNum;
            @XmlElement(name = "WarehouseCode")
            protected String warehouseCode;
            @XmlElement(name = "SalesPersonCode")
            protected Long salesPersonCode;
            @XmlElement(name = "CommisionPercent")
            protected Double commisionPercent;
            @XmlElement(name = "TreeType")
            protected String treeType;
            @XmlElement(name = "AccountCode")
            protected String accountCode;
            @XmlElement(name = "UseBaseUnits")
            protected String useBaseUnits;
            @XmlElement(name = "SupplierCatNum")
            protected String supplierCatNum;
            @XmlElement(name = "CostingCode")
            protected String costingCode;
            @XmlElement(name = "ProjectCode")
            protected String projectCode;
            @XmlElement(name = "BarCode")
            protected String barCode;
            @XmlElement(name = "VatGroup")
            protected String vatGroup;
            @XmlElement(name = "Height1")
            protected Double height1;
            @XmlElement(name = "Hight1Unit")
            protected Long hight1Unit;
            @XmlElement(name = "Height2")
            protected Double height2;
            @XmlElement(name = "Height2Unit")
            protected Long height2Unit;
            @XmlElement(name = "Lengh1")
            protected Double lengh1;
            @XmlElement(name = "Lengh1Unit")
            protected Long lengh1Unit;
            @XmlElement(name = "Lengh2")
            protected Double lengh2;
            @XmlElement(name = "Lengh2Unit")
            protected Long lengh2Unit;
            @XmlElement(name = "Weight1")
            protected Double weight1;
            @XmlElement(name = "Weight1Unit")
            protected Long weight1Unit;
            @XmlElement(name = "Weight2")
            protected Double weight2;
            @XmlElement(name = "Weight2Unit")
            protected Long weight2Unit;
            @XmlElement(name = "Factor1")
            protected Double factor1;
            @XmlElement(name = "Factor2")
            protected Double factor2;
            @XmlElement(name = "Factor3")
            protected Double factor3;
            @XmlElement(name = "Factor4")
            protected Double factor4;
            @XmlElement(name = "BaseType")
            protected Long baseType;
            @XmlElement(name = "BaseEntry")
            protected Long baseEntry;
            @XmlElement(name = "BaseLine")
            protected Long baseLine;
            @XmlElement(name = "Volume")
            protected Double volume;
            @XmlElement(name = "VolumeUnit")
            protected Long volumeUnit;
            @XmlElement(name = "Width1")
            protected Double width1;
            @XmlElement(name = "Width1Unit")
            protected Long width1Unit;
            @XmlElement(name = "Width2")
            protected Double width2;
            @XmlElement(name = "Width2Unit")
            protected Long width2Unit;
            @XmlElement(name = "Address")
            protected String address;
            @XmlElement(name = "TaxCode")
            protected String taxCode;
            @XmlElement(name = "TaxType")
            protected String taxType;
            @XmlElement(name = "TaxLiable")
            protected String taxLiable;
            @XmlElement(name = "PickStatus")
            protected String pickStatus;
            @XmlElement(name = "PickQuantity")
            protected Double pickQuantity;
            @XmlElement(name = "PickListIdNumber")
            protected Long pickListIdNumber;
            @XmlElement(name = "OriginalItem")
            protected String originalItem;
            @XmlElement(name = "BackOrder")
            protected String backOrder;
            @XmlElement(name = "FreeText")
            protected String freeText;
            @XmlElement(name = "ShippingMethod")
            protected Long shippingMethod;
            @XmlElement(name = "POTargetNum")
            protected Long poTargetNum;
            @XmlElement(name = "POTargetEntry")
            protected String poTargetEntry;
            @XmlElement(name = "POTargetRowNum")
            protected Long poTargetRowNum;
            @XmlElement(name = "CorrectionInvoiceItem")
            protected String correctionInvoiceItem;
            @XmlElement(name = "CorrInvAmountToStock")
            protected Double corrInvAmountToStock;
            @XmlElement(name = "CorrInvAmountToDiffAcct")
            protected Double corrInvAmountToDiffAcct;
            @XmlElement(name = "AppliedTax")
            protected Double appliedTax;
            @XmlElement(name = "AppliedTaxFC")
            protected Double appliedTaxFC;
            @XmlElement(name = "AppliedTaxSC")
            protected Double appliedTaxSC;
            @XmlElement(name = "WTLiable")
            protected String wtLiable;
            @XmlElement(name = "DeferredTax")
            protected String deferredTax;
            @XmlElement(name = "EqualizationTaxPercent")
            protected Double equalizationTaxPercent;
            @XmlElement(name = "TotalEqualizationTax")
            protected Double totalEqualizationTax;
            @XmlElement(name = "TotalEqualizationTaxFC")
            protected Double totalEqualizationTaxFC;
            @XmlElement(name = "TotalEqualizationTaxSC")
            protected Double totalEqualizationTaxSC;
            @XmlElement(name = "NetTaxAmount")
            protected Double netTaxAmount;
            @XmlElement(name = "NetTaxAmountFC")
            protected Double netTaxAmountFC;
            @XmlElement(name = "NetTaxAmountSC")
            protected Double netTaxAmountSC;
            @XmlElement(name = "MeasureUnit")
            protected String measureUnit;
            @XmlElement(name = "UnitsOfMeasurment")
            protected Double unitsOfMeasurment;
            @XmlElement(name = "LineTotal")
            protected Double lineTotal;
            @XmlElement(name = "TaxPercentagePerRow")
            protected Double taxPercentagePerRow;
            @XmlElement(name = "TaxTotal")
            protected Double taxTotal;
            @XmlElement(name = "ConsumerSalesForecast")
            protected String consumerSalesForecast;
            @XmlElement(name = "ExciseAmount")
            protected Double exciseAmount;
            @XmlElement(name = "TaxPerUnit")
            protected Double taxPerUnit;
            @XmlElement(name = "TotalInclTax")
            protected Double totalInclTax;
            @XmlElement(name = "CountryOrg")
            protected String countryOrg;
            @XmlElement(name = "SWW")
            protected String sww;
            @XmlElement(name = "TransactionType")
            protected String transactionType;
            @XmlElement(name = "DistributeExpense")
            protected String distributeExpense;
            @XmlElement(name = "ShipToCode")
            protected String shipToCode;
            @XmlElement(name = "RowTotalFC")
            protected Double rowTotalFC;
            @XmlElement(name = "RowTotalSC")
            protected Double rowTotalSC;
            @XmlElement(name = "LastBuyInmPrice")
            protected Double lastBuyInmPrice;
            @XmlElement(name = "LastBuyDistributeSumFc")
            protected Double lastBuyDistributeSumFc;
            @XmlElement(name = "LastBuyDistributeSumSc")
            protected Double lastBuyDistributeSumSc;
            @XmlElement(name = "LastBuyDistributeSum")
            protected Double lastBuyDistributeSum;
            @XmlElement(name = "StockDistributesumForeign")
            protected Double stockDistributesumForeign;
            @XmlElement(name = "StockDistributesumSystem")
            protected Double stockDistributesumSystem;
            @XmlElement(name = "StockDistributesum")
            protected Double stockDistributesum;
            @XmlElement(name = "StockInmPrice")
            protected Double stockInmPrice;
            @XmlElement(name = "PickStatusEx")
            protected String pickStatusEx;
            @XmlElement(name = "TaxBeforeDPM")
            protected Double taxBeforeDPM;
            @XmlElement(name = "TaxBeforeDPMFC")
            protected Double taxBeforeDPMFC;
            @XmlElement(name = "TaxBeforeDPMSC")
            protected Double taxBeforeDPMSC;
            @XmlElement(name = "CFOPCode")
            protected String cfopCode;
            @XmlElement(name = "CSTCode")
            protected String cstCode;
            @XmlElement(name = "Usage")
            protected Long usage;
            @XmlElement(name = "TaxOnly")
            protected String taxOnly;
            @XmlElement(name = "VisualOrder")
            protected Long visualOrder;
            @XmlElement(name = "BaseOpenQuantity")
            protected Double baseOpenQuantity;
            @XmlElement(name = "UnitPrice")
            protected Double unitPrice;
            @XmlElement(name = "LineStatus")
            protected String lineStatus;
            @XmlElement(name = "PackageQuantity")
            protected Double packageQuantity;
            @XmlElement(name = "Text")
            protected String text;
            @XmlElement(name = "LineType")
            protected String lineType;
            @XmlElement(name = "COGSCostingCode")
            protected String cogsCostingCode;
            @XmlElement(name = "COGSAccountCode")
            protected String cogsAccountCode;
            @XmlElement(name = "ChangeAssemlyBoMWarehouse")
            protected String changeAssemlyBoMWarehouse;
            @XmlElement(name = "GrossBuyPrice")
            protected Double grossBuyPrice;
            @XmlElement(name = "GrossBase")
            protected Long grossBase;
            @XmlElement(name = "GrossProfitTotalBasePrice")
            protected Double grossProfitTotalBasePrice;
            @XmlElement(name = "CostingCode2")
            protected String costingCode2;
            @XmlElement(name = "CostingCode3")
            protected String costingCode3;
            @XmlElement(name = "CostingCode4")
            protected String costingCode4;
            @XmlElement(name = "CostingCode5")
            protected String costingCode5;
            @XmlElement(name = "ItemDetails")
            protected String itemDetails;
            @XmlElement(name = "LocationCode")
            protected Long locationCode;
            @XmlElement(name = "ActualDeliveryDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar actualDeliveryDate;
            @XmlElement(name = "RemainingOpenQuantity")
            protected Double remainingOpenQuantity;
            @XmlElement(name = "OpenAmount")
            protected Double openAmount;
            @XmlElement(name = "OpenAmountFC")
            protected Double openAmountFC;
            @XmlElement(name = "OpenAmountSC")
            protected Double openAmountSC;
            @XmlElement(name = "ExLineNo")
            protected String exLineNo;
            @XmlElement(name = "RequiredDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar requiredDate;
            @XmlElement(name = "RequiredQuantity")
            protected Double requiredQuantity;
            @XmlElement(name = "COGSCostingCode2")
            protected String cogsCostingCode2;
            @XmlElement(name = "COGSCostingCode3")
            protected String cogsCostingCode3;
            @XmlElement(name = "COGSCostingCode4")
            protected String cogsCostingCode4;
            @XmlElement(name = "COGSCostingCode5")
            protected String cogsCostingCode5;
            @XmlElement(name = "CSTforIPI")
            protected String csTforIPI;
            @XmlElement(name = "CSTforPIS")
            protected String csTforPIS;
            @XmlElement(name = "CSTforCOFINS")
            protected String csTforCOFINS;
            @XmlElement(name = "CreditOriginCode")
            protected String creditOriginCode;
            @XmlElement(name = "WithoutInventoryMovement")
            protected String withoutInventoryMovement;
            @XmlElement(name = "AgreementNo")
            protected Long agreementNo;
            @XmlElement(name = "AgreementRowNumber")
            protected Long agreementRowNumber;
            @XmlElement(name = "ShipToDescription")
            protected String shipToDescription;
            @XmlElement(name = "ActualBaseEntry")
            protected Long actualBaseEntry;
            @XmlElement(name = "ActualBaseLine")
            protected Long actualBaseLine;
            @XmlElement(name = "DocEntry")
            protected Long docEntry;
            @XmlElement(name = "Surpluses")
            protected Double surpluses;
            @XmlElement(name = "DefectAndBreakup")
            protected Double defectAndBreakup;
            @XmlElement(name = "Shortages")
            protected Double shortages;
            @XmlElement(name = "ConsiderQuantity")
            protected String considerQuantity;
            @XmlElement(name = "PartialRetirement")
            protected String partialRetirement;
            @XmlElement(name = "RetirementQuantity")
            protected Double retirementQuantity;
            @XmlElement(name = "RetirementAPC")
            protected Double retirementAPC;
            @XmlElement(name = "ThirdParty")
            protected String thirdParty;
            @XmlElement(name = "UoMEntry")
            protected Long uoMEntry;
            @XmlElement(name = "UoMCode")
            protected String uoMCode;
            @XmlElement(name = "InventoryQuantity")
            protected Double inventoryQuantity;
            @XmlElement(name = "RemainingOpenInventoryQuantity")
            protected Double remainingOpenInventoryQuantity;
            @XmlElement(name = "ParentLineNum")
            protected Long parentLineNum;
            @XmlElement(name = "Incoterms")
            protected Long incoterms;
            @XmlElement(name = "TransportMode")
            protected Long transportMode;
            @XmlElement(name = "ItemType")
            protected String itemType;
            @XmlElement(name = "ChangeInventoryQuantityIndependently")
            protected String changeInventoryQuantityIndependently;
            @XmlElement(name = "FreeOfChargeBP")
            protected String freeOfChargeBP;
            @XmlElement(name = "U_IVCDone")
            protected String uivcDone;
            @XmlElement(name = "U_EstadoP")
            protected String uEstadoP;
            @XmlElement(name = "U_NWR_Base")
            protected String unwrBase;
            @XmlElement(name = "U_CustDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar uCustDate;
            @XmlElement(name = "U_NWR_QtyAllocated")
            protected Double unwrQtyAllocated;
            @XmlElement(name = "U_ReclamQty")
            protected Double uReclamQty;
            @XmlElement(name = "U_QAMark")
            protected String uqaMark;
            @XmlElement(name = "U_IncomingQty")
            protected Double uIncomingQty;
            @XmlElement(name = "U_Comments")
            protected String uComments;
            @XmlElement(name = "U_DI")
            protected String udi;
            @XmlElement(name = "U_lineNumFv")
            protected Long uLineNumFv;
            @XmlElement(name = "U_Images")
            protected String uImages;
            @XmlElement(name = "U_numPartes")
            protected Long uNumPartes;
            @XmlElement(name = "U_Averias")
            protected String uAverias;
            @XmlElement(name = "LineTaxJurisdictions")
            protected Document.DocumentLines.DocumentLine.LineTaxJurisdictions lineTaxJurisdictions;
            @XmlElement(name = "SerialNumbers")
            protected Document.DocumentLines.DocumentLine.SerialNumbers serialNumbers;
            @XmlElement(name = "BatchNumbers")
            protected Document.DocumentLines.DocumentLine.BatchNumbers batchNumbers;
            @XmlElement(name = "DocumentLinesBinAllocations")
            protected Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations documentLinesBinAllocations;

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
             * Obtiene el valor de la propiedad itemCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemCode() {
                return itemCode;
            }

            /**
             * Define el valor de la propiedad itemCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemCode(String value) {
                this.itemCode = value;
            }

            /**
             * Obtiene el valor de la propiedad itemDescription.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemDescription() {
                return itemDescription;
            }

            /**
             * Define el valor de la propiedad itemDescription.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemDescription(String value) {
                this.itemDescription = value;
            }

            /**
             * Obtiene el valor de la propiedad quantity.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getQuantity() {
                return quantity;
            }

            /**
             * Define el valor de la propiedad quantity.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setQuantity(Double value) {
                this.quantity = value;
            }

            /**
             * Obtiene el valor de la propiedad shipDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getShipDate() {
                return shipDate;
            }

            /**
             * Define el valor de la propiedad shipDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setShipDate(XMLGregorianCalendar value) {
                this.shipDate = value;
            }

            /**
             * Obtiene el valor de la propiedad price.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getPrice() {
                return price;
            }

            /**
             * Define el valor de la propiedad price.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setPrice(Double value) {
                this.price = value;
            }

            /**
             * Obtiene el valor de la propiedad priceAfterVAT.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getPriceAfterVAT() {
                return priceAfterVAT;
            }

            /**
             * Define el valor de la propiedad priceAfterVAT.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setPriceAfterVAT(Double value) {
                this.priceAfterVAT = value;
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
             * Obtiene el valor de la propiedad discountPercent.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getDiscountPercent() {
                return discountPercent;
            }

            /**
             * Define el valor de la propiedad discountPercent.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setDiscountPercent(Double value) {
                this.discountPercent = value;
            }

            /**
             * Obtiene el valor de la propiedad vendorNum.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVendorNum() {
                return vendorNum;
            }

            /**
             * Define el valor de la propiedad vendorNum.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVendorNum(String value) {
                this.vendorNum = value;
            }

            /**
             * Obtiene el valor de la propiedad serialNum.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSerialNum() {
                return serialNum;
            }

            /**
             * Define el valor de la propiedad serialNum.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSerialNum(String value) {
                this.serialNum = value;
            }

            /**
             * Obtiene el valor de la propiedad warehouseCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWarehouseCode() {
                return warehouseCode;
            }

            /**
             * Define el valor de la propiedad warehouseCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWarehouseCode(String value) {
                this.warehouseCode = value;
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
             * Obtiene el valor de la propiedad commisionPercent.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getCommisionPercent() {
                return commisionPercent;
            }

            /**
             * Define el valor de la propiedad commisionPercent.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setCommisionPercent(Double value) {
                this.commisionPercent = value;
            }

            /**
             * Obtiene el valor de la propiedad treeType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTreeType() {
                return treeType;
            }

            /**
             * Define el valor de la propiedad treeType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTreeType(String value) {
                this.treeType = value;
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
             * Obtiene el valor de la propiedad useBaseUnits.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUseBaseUnits() {
                return useBaseUnits;
            }

            /**
             * Define el valor de la propiedad useBaseUnits.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUseBaseUnits(String value) {
                this.useBaseUnits = value;
            }

            /**
             * Obtiene el valor de la propiedad supplierCatNum.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSupplierCatNum() {
                return supplierCatNum;
            }

            /**
             * Define el valor de la propiedad supplierCatNum.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSupplierCatNum(String value) {
                this.supplierCatNum = value;
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
             * Obtiene el valor de la propiedad barCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBarCode() {
                return barCode;
            }

            /**
             * Define el valor de la propiedad barCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBarCode(String value) {
                this.barCode = value;
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
             * Obtiene el valor de la propiedad height1.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getHeight1() {
                return height1;
            }

            /**
             * Define el valor de la propiedad height1.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setHeight1(Double value) {
                this.height1 = value;
            }

            /**
             * Obtiene el valor de la propiedad hight1Unit.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getHight1Unit() {
                return hight1Unit;
            }

            /**
             * Define el valor de la propiedad hight1Unit.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setHight1Unit(Long value) {
                this.hight1Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad height2.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getHeight2() {
                return height2;
            }

            /**
             * Define el valor de la propiedad height2.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setHeight2(Double value) {
                this.height2 = value;
            }

            /**
             * Obtiene el valor de la propiedad height2Unit.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getHeight2Unit() {
                return height2Unit;
            }

            /**
             * Define el valor de la propiedad height2Unit.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setHeight2Unit(Long value) {
                this.height2Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad lengh1.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getLengh1() {
                return lengh1;
            }

            /**
             * Define el valor de la propiedad lengh1.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setLengh1(Double value) {
                this.lengh1 = value;
            }

            /**
             * Obtiene el valor de la propiedad lengh1Unit.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getLengh1Unit() {
                return lengh1Unit;
            }

            /**
             * Define el valor de la propiedad lengh1Unit.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setLengh1Unit(Long value) {
                this.lengh1Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad lengh2.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getLengh2() {
                return lengh2;
            }

            /**
             * Define el valor de la propiedad lengh2.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setLengh2(Double value) {
                this.lengh2 = value;
            }

            /**
             * Obtiene el valor de la propiedad lengh2Unit.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getLengh2Unit() {
                return lengh2Unit;
            }

            /**
             * Define el valor de la propiedad lengh2Unit.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setLengh2Unit(Long value) {
                this.lengh2Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad weight1.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getWeight1() {
                return weight1;
            }

            /**
             * Define el valor de la propiedad weight1.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setWeight1(Double value) {
                this.weight1 = value;
            }

            /**
             * Obtiene el valor de la propiedad weight1Unit.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getWeight1Unit() {
                return weight1Unit;
            }

            /**
             * Define el valor de la propiedad weight1Unit.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setWeight1Unit(Long value) {
                this.weight1Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad weight2.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getWeight2() {
                return weight2;
            }

            /**
             * Define el valor de la propiedad weight2.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setWeight2(Double value) {
                this.weight2 = value;
            }

            /**
             * Obtiene el valor de la propiedad weight2Unit.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getWeight2Unit() {
                return weight2Unit;
            }

            /**
             * Define el valor de la propiedad weight2Unit.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setWeight2Unit(Long value) {
                this.weight2Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad factor1.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getFactor1() {
                return factor1;
            }

            /**
             * Define el valor de la propiedad factor1.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setFactor1(Double value) {
                this.factor1 = value;
            }

            /**
             * Obtiene el valor de la propiedad factor2.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getFactor2() {
                return factor2;
            }

            /**
             * Define el valor de la propiedad factor2.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setFactor2(Double value) {
                this.factor2 = value;
            }

            /**
             * Obtiene el valor de la propiedad factor3.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getFactor3() {
                return factor3;
            }

            /**
             * Define el valor de la propiedad factor3.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setFactor3(Double value) {
                this.factor3 = value;
            }

            /**
             * Obtiene el valor de la propiedad factor4.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getFactor4() {
                return factor4;
            }

            /**
             * Define el valor de la propiedad factor4.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setFactor4(Double value) {
                this.factor4 = value;
            }

            /**
             * Obtiene el valor de la propiedad baseType.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBaseType() {
                return baseType;
            }

            /**
             * Define el valor de la propiedad baseType.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBaseType(Long value) {
                this.baseType = value;
            }

            /**
             * Obtiene el valor de la propiedad baseEntry.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBaseEntry() {
                return baseEntry;
            }

            /**
             * Define el valor de la propiedad baseEntry.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBaseEntry(Long value) {
                this.baseEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad baseLine.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBaseLine() {
                return baseLine;
            }

            /**
             * Define el valor de la propiedad baseLine.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBaseLine(Long value) {
                this.baseLine = value;
            }

            /**
             * Obtiene el valor de la propiedad volume.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getVolume() {
                return volume;
            }

            /**
             * Define el valor de la propiedad volume.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setVolume(Double value) {
                this.volume = value;
            }

            /**
             * Obtiene el valor de la propiedad volumeUnit.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getVolumeUnit() {
                return volumeUnit;
            }

            /**
             * Define el valor de la propiedad volumeUnit.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setVolumeUnit(Long value) {
                this.volumeUnit = value;
            }

            /**
             * Obtiene el valor de la propiedad width1.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getWidth1() {
                return width1;
            }

            /**
             * Define el valor de la propiedad width1.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setWidth1(Double value) {
                this.width1 = value;
            }

            /**
             * Obtiene el valor de la propiedad width1Unit.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getWidth1Unit() {
                return width1Unit;
            }

            /**
             * Define el valor de la propiedad width1Unit.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setWidth1Unit(Long value) {
                this.width1Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad width2.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getWidth2() {
                return width2;
            }

            /**
             * Define el valor de la propiedad width2.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setWidth2(Double value) {
                this.width2 = value;
            }

            /**
             * Obtiene el valor de la propiedad width2Unit.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getWidth2Unit() {
                return width2Unit;
            }

            /**
             * Define el valor de la propiedad width2Unit.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setWidth2Unit(Long value) {
                this.width2Unit = value;
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
             * Obtiene el valor de la propiedad taxType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxType() {
                return taxType;
            }

            /**
             * Define el valor de la propiedad taxType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxType(String value) {
                this.taxType = value;
            }

            /**
             * Obtiene el valor de la propiedad taxLiable.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxLiable() {
                return taxLiable;
            }

            /**
             * Define el valor de la propiedad taxLiable.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxLiable(String value) {
                this.taxLiable = value;
            }

            /**
             * Obtiene el valor de la propiedad pickStatus.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPickStatus() {
                return pickStatus;
            }

            /**
             * Define el valor de la propiedad pickStatus.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPickStatus(String value) {
                this.pickStatus = value;
            }

            /**
             * Obtiene el valor de la propiedad pickQuantity.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getPickQuantity() {
                return pickQuantity;
            }

            /**
             * Define el valor de la propiedad pickQuantity.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setPickQuantity(Double value) {
                this.pickQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad pickListIdNumber.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getPickListIdNumber() {
                return pickListIdNumber;
            }

            /**
             * Define el valor de la propiedad pickListIdNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setPickListIdNumber(Long value) {
                this.pickListIdNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad originalItem.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginalItem() {
                return originalItem;
            }

            /**
             * Define el valor de la propiedad originalItem.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginalItem(String value) {
                this.originalItem = value;
            }

            /**
             * Obtiene el valor de la propiedad backOrder.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBackOrder() {
                return backOrder;
            }

            /**
             * Define el valor de la propiedad backOrder.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBackOrder(String value) {
                this.backOrder = value;
            }

            /**
             * Obtiene el valor de la propiedad freeText.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFreeText() {
                return freeText;
            }

            /**
             * Define el valor de la propiedad freeText.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFreeText(String value) {
                this.freeText = value;
            }

            /**
             * Obtiene el valor de la propiedad shippingMethod.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getShippingMethod() {
                return shippingMethod;
            }

            /**
             * Define el valor de la propiedad shippingMethod.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setShippingMethod(Long value) {
                this.shippingMethod = value;
            }

            /**
             * Obtiene el valor de la propiedad poTargetNum.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getPOTargetNum() {
                return poTargetNum;
            }

            /**
             * Define el valor de la propiedad poTargetNum.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setPOTargetNum(Long value) {
                this.poTargetNum = value;
            }

            /**
             * Obtiene el valor de la propiedad poTargetEntry.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPOTargetEntry() {
                return poTargetEntry;
            }

            /**
             * Define el valor de la propiedad poTargetEntry.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPOTargetEntry(String value) {
                this.poTargetEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad poTargetRowNum.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getPOTargetRowNum() {
                return poTargetRowNum;
            }

            /**
             * Define el valor de la propiedad poTargetRowNum.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setPOTargetRowNum(Long value) {
                this.poTargetRowNum = value;
            }

            /**
             * Obtiene el valor de la propiedad correctionInvoiceItem.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCorrectionInvoiceItem() {
                return correctionInvoiceItem;
            }

            /**
             * Define el valor de la propiedad correctionInvoiceItem.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCorrectionInvoiceItem(String value) {
                this.correctionInvoiceItem = value;
            }

            /**
             * Obtiene el valor de la propiedad corrInvAmountToStock.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getCorrInvAmountToStock() {
                return corrInvAmountToStock;
            }

            /**
             * Define el valor de la propiedad corrInvAmountToStock.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setCorrInvAmountToStock(Double value) {
                this.corrInvAmountToStock = value;
            }

            /**
             * Obtiene el valor de la propiedad corrInvAmountToDiffAcct.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getCorrInvAmountToDiffAcct() {
                return corrInvAmountToDiffAcct;
            }

            /**
             * Define el valor de la propiedad corrInvAmountToDiffAcct.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setCorrInvAmountToDiffAcct(Double value) {
                this.corrInvAmountToDiffAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedTax.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAppliedTax() {
                return appliedTax;
            }

            /**
             * Define el valor de la propiedad appliedTax.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAppliedTax(Double value) {
                this.appliedTax = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedTaxFC.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAppliedTaxFC() {
                return appliedTaxFC;
            }

            /**
             * Define el valor de la propiedad appliedTaxFC.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAppliedTaxFC(Double value) {
                this.appliedTaxFC = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedTaxSC.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAppliedTaxSC() {
                return appliedTaxSC;
            }

            /**
             * Define el valor de la propiedad appliedTaxSC.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAppliedTaxSC(Double value) {
                this.appliedTaxSC = value;
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
             * Obtiene el valor de la propiedad equalizationTaxPercent.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getEqualizationTaxPercent() {
                return equalizationTaxPercent;
            }

            /**
             * Define el valor de la propiedad equalizationTaxPercent.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setEqualizationTaxPercent(Double value) {
                this.equalizationTaxPercent = value;
            }

            /**
             * Obtiene el valor de la propiedad totalEqualizationTax.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTotalEqualizationTax() {
                return totalEqualizationTax;
            }

            /**
             * Define el valor de la propiedad totalEqualizationTax.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTotalEqualizationTax(Double value) {
                this.totalEqualizationTax = value;
            }

            /**
             * Obtiene el valor de la propiedad totalEqualizationTaxFC.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTotalEqualizationTaxFC() {
                return totalEqualizationTaxFC;
            }

            /**
             * Define el valor de la propiedad totalEqualizationTaxFC.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTotalEqualizationTaxFC(Double value) {
                this.totalEqualizationTaxFC = value;
            }

            /**
             * Obtiene el valor de la propiedad totalEqualizationTaxSC.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTotalEqualizationTaxSC() {
                return totalEqualizationTaxSC;
            }

            /**
             * Define el valor de la propiedad totalEqualizationTaxSC.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTotalEqualizationTaxSC(Double value) {
                this.totalEqualizationTaxSC = value;
            }

            /**
             * Obtiene el valor de la propiedad netTaxAmount.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getNetTaxAmount() {
                return netTaxAmount;
            }

            /**
             * Define el valor de la propiedad netTaxAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setNetTaxAmount(Double value) {
                this.netTaxAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad netTaxAmountFC.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getNetTaxAmountFC() {
                return netTaxAmountFC;
            }

            /**
             * Define el valor de la propiedad netTaxAmountFC.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setNetTaxAmountFC(Double value) {
                this.netTaxAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad netTaxAmountSC.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getNetTaxAmountSC() {
                return netTaxAmountSC;
            }

            /**
             * Define el valor de la propiedad netTaxAmountSC.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setNetTaxAmountSC(Double value) {
                this.netTaxAmountSC = value;
            }

            /**
             * Obtiene el valor de la propiedad measureUnit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMeasureUnit() {
                return measureUnit;
            }

            /**
             * Define el valor de la propiedad measureUnit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMeasureUnit(String value) {
                this.measureUnit = value;
            }

            /**
             * Obtiene el valor de la propiedad unitsOfMeasurment.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getUnitsOfMeasurment() {
                return unitsOfMeasurment;
            }

            /**
             * Define el valor de la propiedad unitsOfMeasurment.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setUnitsOfMeasurment(Double value) {
                this.unitsOfMeasurment = value;
            }

            /**
             * Obtiene el valor de la propiedad lineTotal.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getLineTotal() {
                return lineTotal;
            }

            /**
             * Define el valor de la propiedad lineTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setLineTotal(Double value) {
                this.lineTotal = value;
            }

            /**
             * Obtiene el valor de la propiedad taxPercentagePerRow.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTaxPercentagePerRow() {
                return taxPercentagePerRow;
            }

            /**
             * Define el valor de la propiedad taxPercentagePerRow.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTaxPercentagePerRow(Double value) {
                this.taxPercentagePerRow = value;
            }

            /**
             * Obtiene el valor de la propiedad taxTotal.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTaxTotal() {
                return taxTotal;
            }

            /**
             * Define el valor de la propiedad taxTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTaxTotal(Double value) {
                this.taxTotal = value;
            }

            /**
             * Obtiene el valor de la propiedad consumerSalesForecast.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConsumerSalesForecast() {
                return consumerSalesForecast;
            }

            /**
             * Define el valor de la propiedad consumerSalesForecast.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConsumerSalesForecast(String value) {
                this.consumerSalesForecast = value;
            }

            /**
             * Obtiene el valor de la propiedad exciseAmount.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getExciseAmount() {
                return exciseAmount;
            }

            /**
             * Define el valor de la propiedad exciseAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setExciseAmount(Double value) {
                this.exciseAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad taxPerUnit.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTaxPerUnit() {
                return taxPerUnit;
            }

            /**
             * Define el valor de la propiedad taxPerUnit.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTaxPerUnit(Double value) {
                this.taxPerUnit = value;
            }

            /**
             * Obtiene el valor de la propiedad totalInclTax.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTotalInclTax() {
                return totalInclTax;
            }

            /**
             * Define el valor de la propiedad totalInclTax.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTotalInclTax(Double value) {
                this.totalInclTax = value;
            }

            /**
             * Obtiene el valor de la propiedad countryOrg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryOrg() {
                return countryOrg;
            }

            /**
             * Define el valor de la propiedad countryOrg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryOrg(String value) {
                this.countryOrg = value;
            }

            /**
             * Obtiene el valor de la propiedad sww.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSWW() {
                return sww;
            }

            /**
             * Define el valor de la propiedad sww.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSWW(String value) {
                this.sww = value;
            }

            /**
             * Obtiene el valor de la propiedad transactionType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransactionType() {
                return transactionType;
            }

            /**
             * Define el valor de la propiedad transactionType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTransactionType(String value) {
                this.transactionType = value;
            }

            /**
             * Obtiene el valor de la propiedad distributeExpense.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDistributeExpense() {
                return distributeExpense;
            }

            /**
             * Define el valor de la propiedad distributeExpense.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDistributeExpense(String value) {
                this.distributeExpense = value;
            }

            /**
             * Obtiene el valor de la propiedad shipToCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShipToCode() {
                return shipToCode;
            }

            /**
             * Define el valor de la propiedad shipToCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShipToCode(String value) {
                this.shipToCode = value;
            }

            /**
             * Obtiene el valor de la propiedad rowTotalFC.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getRowTotalFC() {
                return rowTotalFC;
            }

            /**
             * Define el valor de la propiedad rowTotalFC.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setRowTotalFC(Double value) {
                this.rowTotalFC = value;
            }

            /**
             * Obtiene el valor de la propiedad rowTotalSC.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getRowTotalSC() {
                return rowTotalSC;
            }

            /**
             * Define el valor de la propiedad rowTotalSC.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setRowTotalSC(Double value) {
                this.rowTotalSC = value;
            }

            /**
             * Obtiene el valor de la propiedad lastBuyInmPrice.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getLastBuyInmPrice() {
                return lastBuyInmPrice;
            }

            /**
             * Define el valor de la propiedad lastBuyInmPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setLastBuyInmPrice(Double value) {
                this.lastBuyInmPrice = value;
            }

            /**
             * Obtiene el valor de la propiedad lastBuyDistributeSumFc.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getLastBuyDistributeSumFc() {
                return lastBuyDistributeSumFc;
            }

            /**
             * Define el valor de la propiedad lastBuyDistributeSumFc.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setLastBuyDistributeSumFc(Double value) {
                this.lastBuyDistributeSumFc = value;
            }

            /**
             * Obtiene el valor de la propiedad lastBuyDistributeSumSc.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getLastBuyDistributeSumSc() {
                return lastBuyDistributeSumSc;
            }

            /**
             * Define el valor de la propiedad lastBuyDistributeSumSc.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setLastBuyDistributeSumSc(Double value) {
                this.lastBuyDistributeSumSc = value;
            }

            /**
             * Obtiene el valor de la propiedad lastBuyDistributeSum.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getLastBuyDistributeSum() {
                return lastBuyDistributeSum;
            }

            /**
             * Define el valor de la propiedad lastBuyDistributeSum.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setLastBuyDistributeSum(Double value) {
                this.lastBuyDistributeSum = value;
            }

            /**
             * Obtiene el valor de la propiedad stockDistributesumForeign.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getStockDistributesumForeign() {
                return stockDistributesumForeign;
            }

            /**
             * Define el valor de la propiedad stockDistributesumForeign.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setStockDistributesumForeign(Double value) {
                this.stockDistributesumForeign = value;
            }

            /**
             * Obtiene el valor de la propiedad stockDistributesumSystem.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getStockDistributesumSystem() {
                return stockDistributesumSystem;
            }

            /**
             * Define el valor de la propiedad stockDistributesumSystem.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setStockDistributesumSystem(Double value) {
                this.stockDistributesumSystem = value;
            }

            /**
             * Obtiene el valor de la propiedad stockDistributesum.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getStockDistributesum() {
                return stockDistributesum;
            }

            /**
             * Define el valor de la propiedad stockDistributesum.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setStockDistributesum(Double value) {
                this.stockDistributesum = value;
            }

            /**
             * Obtiene el valor de la propiedad stockInmPrice.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getStockInmPrice() {
                return stockInmPrice;
            }

            /**
             * Define el valor de la propiedad stockInmPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setStockInmPrice(Double value) {
                this.stockInmPrice = value;
            }

            /**
             * Obtiene el valor de la propiedad pickStatusEx.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPickStatusEx() {
                return pickStatusEx;
            }

            /**
             * Define el valor de la propiedad pickStatusEx.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPickStatusEx(String value) {
                this.pickStatusEx = value;
            }

            /**
             * Obtiene el valor de la propiedad taxBeforeDPM.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTaxBeforeDPM() {
                return taxBeforeDPM;
            }

            /**
             * Define el valor de la propiedad taxBeforeDPM.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTaxBeforeDPM(Double value) {
                this.taxBeforeDPM = value;
            }

            /**
             * Obtiene el valor de la propiedad taxBeforeDPMFC.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTaxBeforeDPMFC() {
                return taxBeforeDPMFC;
            }

            /**
             * Define el valor de la propiedad taxBeforeDPMFC.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTaxBeforeDPMFC(Double value) {
                this.taxBeforeDPMFC = value;
            }

            /**
             * Obtiene el valor de la propiedad taxBeforeDPMSC.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTaxBeforeDPMSC() {
                return taxBeforeDPMSC;
            }

            /**
             * Define el valor de la propiedad taxBeforeDPMSC.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTaxBeforeDPMSC(Double value) {
                this.taxBeforeDPMSC = value;
            }

            /**
             * Obtiene el valor de la propiedad cfopCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCFOPCode() {
                return cfopCode;
            }

            /**
             * Define el valor de la propiedad cfopCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCFOPCode(String value) {
                this.cfopCode = value;
            }

            /**
             * Obtiene el valor de la propiedad cstCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCSTCode() {
                return cstCode;
            }

            /**
             * Define el valor de la propiedad cstCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCSTCode(String value) {
                this.cstCode = value;
            }

            /**
             * Obtiene el valor de la propiedad usage.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getUsage() {
                return usage;
            }

            /**
             * Define el valor de la propiedad usage.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setUsage(Long value) {
                this.usage = value;
            }

            /**
             * Obtiene el valor de la propiedad taxOnly.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxOnly() {
                return taxOnly;
            }

            /**
             * Define el valor de la propiedad taxOnly.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxOnly(String value) {
                this.taxOnly = value;
            }

            /**
             * Obtiene el valor de la propiedad visualOrder.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getVisualOrder() {
                return visualOrder;
            }

            /**
             * Define el valor de la propiedad visualOrder.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setVisualOrder(Long value) {
                this.visualOrder = value;
            }

            /**
             * Obtiene el valor de la propiedad baseOpenQuantity.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getBaseOpenQuantity() {
                return baseOpenQuantity;
            }

            /**
             * Define el valor de la propiedad baseOpenQuantity.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setBaseOpenQuantity(Double value) {
                this.baseOpenQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad unitPrice.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getUnitPrice() {
                return unitPrice;
            }

            /**
             * Define el valor de la propiedad unitPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setUnitPrice(Double value) {
                this.unitPrice = value;
            }

            /**
             * Obtiene el valor de la propiedad lineStatus.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLineStatus() {
                return lineStatus;
            }

            /**
             * Define el valor de la propiedad lineStatus.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLineStatus(String value) {
                this.lineStatus = value;
            }

            /**
             * Obtiene el valor de la propiedad packageQuantity.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getPackageQuantity() {
                return packageQuantity;
            }

            /**
             * Define el valor de la propiedad packageQuantity.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setPackageQuantity(Double value) {
                this.packageQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad text.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * Define el valor de la propiedad text.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
            }

            /**
             * Obtiene el valor de la propiedad lineType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLineType() {
                return lineType;
            }

            /**
             * Define el valor de la propiedad lineType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLineType(String value) {
                this.lineType = value;
            }

            /**
             * Obtiene el valor de la propiedad cogsCostingCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOGSCostingCode() {
                return cogsCostingCode;
            }

            /**
             * Define el valor de la propiedad cogsCostingCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOGSCostingCode(String value) {
                this.cogsCostingCode = value;
            }

            /**
             * Obtiene el valor de la propiedad cogsAccountCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOGSAccountCode() {
                return cogsAccountCode;
            }

            /**
             * Define el valor de la propiedad cogsAccountCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOGSAccountCode(String value) {
                this.cogsAccountCode = value;
            }

            /**
             * Obtiene el valor de la propiedad changeAssemlyBoMWarehouse.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChangeAssemlyBoMWarehouse() {
                return changeAssemlyBoMWarehouse;
            }

            /**
             * Define el valor de la propiedad changeAssemlyBoMWarehouse.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChangeAssemlyBoMWarehouse(String value) {
                this.changeAssemlyBoMWarehouse = value;
            }

            /**
             * Obtiene el valor de la propiedad grossBuyPrice.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getGrossBuyPrice() {
                return grossBuyPrice;
            }

            /**
             * Define el valor de la propiedad grossBuyPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setGrossBuyPrice(Double value) {
                this.grossBuyPrice = value;
            }

            /**
             * Obtiene el valor de la propiedad grossBase.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getGrossBase() {
                return grossBase;
            }

            /**
             * Define el valor de la propiedad grossBase.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setGrossBase(Long value) {
                this.grossBase = value;
            }

            /**
             * Obtiene el valor de la propiedad grossProfitTotalBasePrice.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getGrossProfitTotalBasePrice() {
                return grossProfitTotalBasePrice;
            }

            /**
             * Define el valor de la propiedad grossProfitTotalBasePrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setGrossProfitTotalBasePrice(Double value) {
                this.grossProfitTotalBasePrice = value;
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
             * Obtiene el valor de la propiedad itemDetails.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemDetails() {
                return itemDetails;
            }

            /**
             * Define el valor de la propiedad itemDetails.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemDetails(String value) {
                this.itemDetails = value;
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
             * Obtiene el valor de la propiedad actualDeliveryDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getActualDeliveryDate() {
                return actualDeliveryDate;
            }

            /**
             * Define el valor de la propiedad actualDeliveryDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setActualDeliveryDate(XMLGregorianCalendar value) {
                this.actualDeliveryDate = value;
            }

            /**
             * Obtiene el valor de la propiedad remainingOpenQuantity.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getRemainingOpenQuantity() {
                return remainingOpenQuantity;
            }

            /**
             * Define el valor de la propiedad remainingOpenQuantity.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setRemainingOpenQuantity(Double value) {
                this.remainingOpenQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad openAmount.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getOpenAmount() {
                return openAmount;
            }

            /**
             * Define el valor de la propiedad openAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setOpenAmount(Double value) {
                this.openAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad openAmountFC.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getOpenAmountFC() {
                return openAmountFC;
            }

            /**
             * Define el valor de la propiedad openAmountFC.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setOpenAmountFC(Double value) {
                this.openAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad openAmountSC.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getOpenAmountSC() {
                return openAmountSC;
            }

            /**
             * Define el valor de la propiedad openAmountSC.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setOpenAmountSC(Double value) {
                this.openAmountSC = value;
            }

            /**
             * Obtiene el valor de la propiedad exLineNo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExLineNo() {
                return exLineNo;
            }

            /**
             * Define el valor de la propiedad exLineNo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExLineNo(String value) {
                this.exLineNo = value;
            }

            /**
             * Obtiene el valor de la propiedad requiredDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getRequiredDate() {
                return requiredDate;
            }

            /**
             * Define el valor de la propiedad requiredDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setRequiredDate(XMLGregorianCalendar value) {
                this.requiredDate = value;
            }

            /**
             * Obtiene el valor de la propiedad requiredQuantity.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getRequiredQuantity() {
                return requiredQuantity;
            }

            /**
             * Define el valor de la propiedad requiredQuantity.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setRequiredQuantity(Double value) {
                this.requiredQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad cogsCostingCode2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOGSCostingCode2() {
                return cogsCostingCode2;
            }

            /**
             * Define el valor de la propiedad cogsCostingCode2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOGSCostingCode2(String value) {
                this.cogsCostingCode2 = value;
            }

            /**
             * Obtiene el valor de la propiedad cogsCostingCode3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOGSCostingCode3() {
                return cogsCostingCode3;
            }

            /**
             * Define el valor de la propiedad cogsCostingCode3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOGSCostingCode3(String value) {
                this.cogsCostingCode3 = value;
            }

            /**
             * Obtiene el valor de la propiedad cogsCostingCode4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOGSCostingCode4() {
                return cogsCostingCode4;
            }

            /**
             * Define el valor de la propiedad cogsCostingCode4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOGSCostingCode4(String value) {
                this.cogsCostingCode4 = value;
            }

            /**
             * Obtiene el valor de la propiedad cogsCostingCode5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOGSCostingCode5() {
                return cogsCostingCode5;
            }

            /**
             * Define el valor de la propiedad cogsCostingCode5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOGSCostingCode5(String value) {
                this.cogsCostingCode5 = value;
            }

            /**
             * Obtiene el valor de la propiedad csTforIPI.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCSTforIPI() {
                return csTforIPI;
            }

            /**
             * Define el valor de la propiedad csTforIPI.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCSTforIPI(String value) {
                this.csTforIPI = value;
            }

            /**
             * Obtiene el valor de la propiedad csTforPIS.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCSTforPIS() {
                return csTforPIS;
            }

            /**
             * Define el valor de la propiedad csTforPIS.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCSTforPIS(String value) {
                this.csTforPIS = value;
            }

            /**
             * Obtiene el valor de la propiedad csTforCOFINS.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCSTforCOFINS() {
                return csTforCOFINS;
            }

            /**
             * Define el valor de la propiedad csTforCOFINS.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCSTforCOFINS(String value) {
                this.csTforCOFINS = value;
            }

            /**
             * Obtiene el valor de la propiedad creditOriginCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreditOriginCode() {
                return creditOriginCode;
            }

            /**
             * Define el valor de la propiedad creditOriginCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreditOriginCode(String value) {
                this.creditOriginCode = value;
            }

            /**
             * Obtiene el valor de la propiedad withoutInventoryMovement.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWithoutInventoryMovement() {
                return withoutInventoryMovement;
            }

            /**
             * Define el valor de la propiedad withoutInventoryMovement.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWithoutInventoryMovement(String value) {
                this.withoutInventoryMovement = value;
            }

            /**
             * Obtiene el valor de la propiedad agreementNo.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAgreementNo() {
                return agreementNo;
            }

            /**
             * Define el valor de la propiedad agreementNo.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAgreementNo(Long value) {
                this.agreementNo = value;
            }

            /**
             * Obtiene el valor de la propiedad agreementRowNumber.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAgreementRowNumber() {
                return agreementRowNumber;
            }

            /**
             * Define el valor de la propiedad agreementRowNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAgreementRowNumber(Long value) {
                this.agreementRowNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad shipToDescription.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShipToDescription() {
                return shipToDescription;
            }

            /**
             * Define el valor de la propiedad shipToDescription.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShipToDescription(String value) {
                this.shipToDescription = value;
            }

            /**
             * Obtiene el valor de la propiedad actualBaseEntry.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getActualBaseEntry() {
                return actualBaseEntry;
            }

            /**
             * Define el valor de la propiedad actualBaseEntry.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setActualBaseEntry(Long value) {
                this.actualBaseEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad actualBaseLine.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getActualBaseLine() {
                return actualBaseLine;
            }

            /**
             * Define el valor de la propiedad actualBaseLine.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setActualBaseLine(Long value) {
                this.actualBaseLine = value;
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
             * Obtiene el valor de la propiedad surpluses.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getSurpluses() {
                return surpluses;
            }

            /**
             * Define el valor de la propiedad surpluses.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setSurpluses(Double value) {
                this.surpluses = value;
            }

            /**
             * Obtiene el valor de la propiedad defectAndBreakup.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getDefectAndBreakup() {
                return defectAndBreakup;
            }

            /**
             * Define el valor de la propiedad defectAndBreakup.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setDefectAndBreakup(Double value) {
                this.defectAndBreakup = value;
            }

            /**
             * Obtiene el valor de la propiedad shortages.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getShortages() {
                return shortages;
            }

            /**
             * Define el valor de la propiedad shortages.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setShortages(Double value) {
                this.shortages = value;
            }

            /**
             * Obtiene el valor de la propiedad considerQuantity.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConsiderQuantity() {
                return considerQuantity;
            }

            /**
             * Define el valor de la propiedad considerQuantity.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConsiderQuantity(String value) {
                this.considerQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad partialRetirement.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPartialRetirement() {
                return partialRetirement;
            }

            /**
             * Define el valor de la propiedad partialRetirement.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPartialRetirement(String value) {
                this.partialRetirement = value;
            }

            /**
             * Obtiene el valor de la propiedad retirementQuantity.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getRetirementQuantity() {
                return retirementQuantity;
            }

            /**
             * Define el valor de la propiedad retirementQuantity.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setRetirementQuantity(Double value) {
                this.retirementQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad retirementAPC.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getRetirementAPC() {
                return retirementAPC;
            }

            /**
             * Define el valor de la propiedad retirementAPC.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setRetirementAPC(Double value) {
                this.retirementAPC = value;
            }

            /**
             * Obtiene el valor de la propiedad thirdParty.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getThirdParty() {
                return thirdParty;
            }

            /**
             * Define el valor de la propiedad thirdParty.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setThirdParty(String value) {
                this.thirdParty = value;
            }

            /**
             * Obtiene el valor de la propiedad uoMEntry.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getUoMEntry() {
                return uoMEntry;
            }

            /**
             * Define el valor de la propiedad uoMEntry.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setUoMEntry(Long value) {
                this.uoMEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad uoMCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUoMCode() {
                return uoMCode;
            }

            /**
             * Define el valor de la propiedad uoMCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUoMCode(String value) {
                this.uoMCode = value;
            }

            /**
             * Obtiene el valor de la propiedad inventoryQuantity.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getInventoryQuantity() {
                return inventoryQuantity;
            }

            /**
             * Define el valor de la propiedad inventoryQuantity.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setInventoryQuantity(Double value) {
                this.inventoryQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad remainingOpenInventoryQuantity.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getRemainingOpenInventoryQuantity() {
                return remainingOpenInventoryQuantity;
            }

            /**
             * Define el valor de la propiedad remainingOpenInventoryQuantity.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setRemainingOpenInventoryQuantity(Double value) {
                this.remainingOpenInventoryQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad parentLineNum.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getParentLineNum() {
                return parentLineNum;
            }

            /**
             * Define el valor de la propiedad parentLineNum.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setParentLineNum(Long value) {
                this.parentLineNum = value;
            }

            /**
             * Obtiene el valor de la propiedad incoterms.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getIncoterms() {
                return incoterms;
            }

            /**
             * Define el valor de la propiedad incoterms.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setIncoterms(Long value) {
                this.incoterms = value;
            }

            /**
             * Obtiene el valor de la propiedad transportMode.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getTransportMode() {
                return transportMode;
            }

            /**
             * Define el valor de la propiedad transportMode.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setTransportMode(Long value) {
                this.transportMode = value;
            }

            /**
             * Obtiene el valor de la propiedad itemType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemType() {
                return itemType;
            }

            /**
             * Define el valor de la propiedad itemType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemType(String value) {
                this.itemType = value;
            }

            /**
             * Obtiene el valor de la propiedad changeInventoryQuantityIndependently.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChangeInventoryQuantityIndependently() {
                return changeInventoryQuantityIndependently;
            }

            /**
             * Define el valor de la propiedad changeInventoryQuantityIndependently.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChangeInventoryQuantityIndependently(String value) {
                this.changeInventoryQuantityIndependently = value;
            }

            /**
             * Obtiene el valor de la propiedad freeOfChargeBP.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFreeOfChargeBP() {
                return freeOfChargeBP;
            }

            /**
             * Define el valor de la propiedad freeOfChargeBP.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFreeOfChargeBP(String value) {
                this.freeOfChargeBP = value;
            }

            /**
             * Obtiene el valor de la propiedad uivcDone.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUIVCDone() {
                return uivcDone;
            }

            /**
             * Define el valor de la propiedad uivcDone.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUIVCDone(String value) {
                this.uivcDone = value;
            }

            /**
             * Obtiene el valor de la propiedad uEstadoP.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUEstadoP() {
                return uEstadoP;
            }

            /**
             * Define el valor de la propiedad uEstadoP.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUEstadoP(String value) {
                this.uEstadoP = value;
            }

            /**
             * Obtiene el valor de la propiedad unwrBase.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUNWRBase() {
                return unwrBase;
            }

            /**
             * Define el valor de la propiedad unwrBase.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUNWRBase(String value) {
                this.unwrBase = value;
            }

            /**
             * Obtiene el valor de la propiedad uCustDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getUCustDate() {
                return uCustDate;
            }

            /**
             * Define el valor de la propiedad uCustDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setUCustDate(XMLGregorianCalendar value) {
                this.uCustDate = value;
            }

            /**
             * Obtiene el valor de la propiedad unwrQtyAllocated.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getUNWRQtyAllocated() {
                return unwrQtyAllocated;
            }

            /**
             * Define el valor de la propiedad unwrQtyAllocated.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setUNWRQtyAllocated(Double value) {
                this.unwrQtyAllocated = value;
            }

            /**
             * Obtiene el valor de la propiedad uReclamQty.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getUReclamQty() {
                return uReclamQty;
            }

            /**
             * Define el valor de la propiedad uReclamQty.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setUReclamQty(Double value) {
                this.uReclamQty = value;
            }

            /**
             * Obtiene el valor de la propiedad uqaMark.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUQAMark() {
                return uqaMark;
            }

            /**
             * Define el valor de la propiedad uqaMark.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUQAMark(String value) {
                this.uqaMark = value;
            }

            /**
             * Obtiene el valor de la propiedad uIncomingQty.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getUIncomingQty() {
                return uIncomingQty;
            }

            /**
             * Define el valor de la propiedad uIncomingQty.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setUIncomingQty(Double value) {
                this.uIncomingQty = value;
            }

            /**
             * Obtiene el valor de la propiedad uComments.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUComments() {
                return uComments;
            }

            /**
             * Define el valor de la propiedad uComments.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUComments(String value) {
                this.uComments = value;
            }

            /**
             * Obtiene el valor de la propiedad udi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUDI() {
                return udi;
            }

            /**
             * Define el valor de la propiedad udi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUDI(String value) {
                this.udi = value;
            }

            /**
             * Obtiene el valor de la propiedad uLineNumFv.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getULineNumFv() {
                return uLineNumFv;
            }

            /**
             * Define el valor de la propiedad uLineNumFv.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setULineNumFv(Long value) {
                this.uLineNumFv = value;
            }

            /**
             * Obtiene el valor de la propiedad uImages.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUImages() {
                return uImages;
            }

            /**
             * Define el valor de la propiedad uImages.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUImages(String value) {
                this.uImages = value;
            }

            /**
             * Obtiene el valor de la propiedad uNumPartes.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getUNumPartes() {
                return uNumPartes;
            }

            /**
             * Define el valor de la propiedad uNumPartes.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setUNumPartes(Long value) {
                this.uNumPartes = value;
            }

            /**
             * Obtiene el valor de la propiedad uAverias.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUAverias() {
                return uAverias;
            }

            /**
             * Define el valor de la propiedad uAverias.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUAverias(String value) {
                this.uAverias = value;
            }

            /**
             * Obtiene el valor de la propiedad lineTaxJurisdictions.
             * 
             * @return
             *     possible object is
             *     {@link Document.DocumentLines.DocumentLine.LineTaxJurisdictions }
             *     
             */
            public Document.DocumentLines.DocumentLine.LineTaxJurisdictions getLineTaxJurisdictions() {
                return lineTaxJurisdictions;
            }

            /**
             * Define el valor de la propiedad lineTaxJurisdictions.
             * 
             * @param value
             *     allowed object is
             *     {@link Document.DocumentLines.DocumentLine.LineTaxJurisdictions }
             *     
             */
            public void setLineTaxJurisdictions(Document.DocumentLines.DocumentLine.LineTaxJurisdictions value) {
                this.lineTaxJurisdictions = value;
            }

            /**
             * Obtiene el valor de la propiedad serialNumbers.
             * 
             * @return
             *     possible object is
             *     {@link Document.DocumentLines.DocumentLine.SerialNumbers }
             *     
             */
            public Document.DocumentLines.DocumentLine.SerialNumbers getSerialNumbers() {
                return serialNumbers;
            }

            /**
             * Define el valor de la propiedad serialNumbers.
             * 
             * @param value
             *     allowed object is
             *     {@link Document.DocumentLines.DocumentLine.SerialNumbers }
             *     
             */
            public void setSerialNumbers(Document.DocumentLines.DocumentLine.SerialNumbers value) {
                this.serialNumbers = value;
            }

            /**
             * Obtiene el valor de la propiedad batchNumbers.
             * 
             * @return
             *     possible object is
             *     {@link Document.DocumentLines.DocumentLine.BatchNumbers }
             *     
             */
            public Document.DocumentLines.DocumentLine.BatchNumbers getBatchNumbers() {
                return batchNumbers;
            }

            /**
             * Define el valor de la propiedad batchNumbers.
             * 
             * @param value
             *     allowed object is
             *     {@link Document.DocumentLines.DocumentLine.BatchNumbers }
             *     
             */
            public void setBatchNumbers(Document.DocumentLines.DocumentLine.BatchNumbers value) {
                this.batchNumbers = value;
            }

            /**
             * Obtiene el valor de la propiedad documentLinesBinAllocations.
             * 
             * @return
             *     possible object is
             *     {@link Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations }
             *     
             */
            public Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations getDocumentLinesBinAllocations() {
                return documentLinesBinAllocations;
            }

            /**
             * Define el valor de la propiedad documentLinesBinAllocations.
             * 
             * @param value
             *     allowed object is
             *     {@link Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations }
             *     
             */
            public void setDocumentLinesBinAllocations(Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations value) {
                this.documentLinesBinAllocations = value;
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
             *         &lt;element name="BatchNumber" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="BatchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="ManufacturingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="AddmisionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
                "batchNumber"
            })
            public static class BatchNumbers {

                @XmlElement(name = "BatchNumber")
                protected List<Document.DocumentLines.DocumentLine.BatchNumbers.BatchNumber> batchNumber;

                /**
                 * Gets the value of the batchNumber property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the batchNumber property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBatchNumber().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Document.DocumentLines.DocumentLine.BatchNumbers.BatchNumber }
                 * 
                 * 
                 */
                public List<Document.DocumentLines.DocumentLine.BatchNumbers.BatchNumber> getBatchNumber() {
                    if (batchNumber == null) {
                        batchNumber = new ArrayList<Document.DocumentLines.DocumentLine.BatchNumbers.BatchNumber>();
                    }
                    return this.batchNumber;
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
                 *         &lt;element name="BatchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="ManufacturingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="AddmisionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
                public static class BatchNumber {

                    @XmlElement(name = "BatchNumber")
                    protected String batchNumber;
                    @XmlElement(name = "ManufacturerSerialNumber")
                    protected String manufacturerSerialNumber;
                    @XmlElement(name = "InternalSerialNumber")
                    protected String internalSerialNumber;
                    @XmlElement(name = "ExpiryDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar expiryDate;
                    @XmlElement(name = "ManufacturingDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar manufacturingDate;
                    @XmlElement(name = "AddmisionDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar addmisionDate;
                    @XmlElement(name = "Location")
                    protected String location;
                    @XmlElement(name = "Notes")
                    protected String notes;
                    @XmlElement(name = "Quantity")
                    protected Double quantity;
                    @XmlElement(name = "BaseLineNumber")
                    protected Long baseLineNumber;
                    @XmlElement(name = "TrackingNote")
                    protected Long trackingNote;
                    @XmlElement(name = "TrackingNoteLine")
                    protected Long trackingNoteLine;

                    /**
                     * Obtiene el valor de la propiedad batchNumber.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBatchNumber() {
                        return batchNumber;
                    }

                    /**
                     * Define el valor de la propiedad batchNumber.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBatchNumber(String value) {
                        this.batchNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad manufacturerSerialNumber.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getManufacturerSerialNumber() {
                        return manufacturerSerialNumber;
                    }

                    /**
                     * Define el valor de la propiedad manufacturerSerialNumber.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setManufacturerSerialNumber(String value) {
                        this.manufacturerSerialNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad internalSerialNumber.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInternalSerialNumber() {
                        return internalSerialNumber;
                    }

                    /**
                     * Define el valor de la propiedad internalSerialNumber.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInternalSerialNumber(String value) {
                        this.internalSerialNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad expiryDate.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getExpiryDate() {
                        return expiryDate;
                    }

                    /**
                     * Define el valor de la propiedad expiryDate.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setExpiryDate(XMLGregorianCalendar value) {
                        this.expiryDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad manufacturingDate.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getManufacturingDate() {
                        return manufacturingDate;
                    }

                    /**
                     * Define el valor de la propiedad manufacturingDate.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setManufacturingDate(XMLGregorianCalendar value) {
                        this.manufacturingDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad addmisionDate.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getAddmisionDate() {
                        return addmisionDate;
                    }

                    /**
                     * Define el valor de la propiedad addmisionDate.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setAddmisionDate(XMLGregorianCalendar value) {
                        this.addmisionDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad location.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLocation() {
                        return location;
                    }

                    /**
                     * Define el valor de la propiedad location.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLocation(String value) {
                        this.location = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad notes.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNotes() {
                        return notes;
                    }

                    /**
                     * Define el valor de la propiedad notes.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNotes(String value) {
                        this.notes = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad quantity.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getQuantity() {
                        return quantity;
                    }

                    /**
                     * Define el valor de la propiedad quantity.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setQuantity(Double value) {
                        this.quantity = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad baseLineNumber.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getBaseLineNumber() {
                        return baseLineNumber;
                    }

                    /**
                     * Define el valor de la propiedad baseLineNumber.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setBaseLineNumber(Long value) {
                        this.baseLineNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad trackingNote.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getTrackingNote() {
                        return trackingNote;
                    }

                    /**
                     * Define el valor de la propiedad trackingNote.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setTrackingNote(Long value) {
                        this.trackingNote = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad trackingNoteLine.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getTrackingNoteLine() {
                        return trackingNoteLine;
                    }

                    /**
                     * Define el valor de la propiedad trackingNoteLine.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setTrackingNoteLine(Long value) {
                        this.trackingNoteLine = value;
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
             *         &lt;element name="DocumentLinesBinAllocation" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="BinAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="AllowNegativeQuantity" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value="tNO"/>
             *                         &lt;enumeration value="tYES"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="SerialAndBatchNumbersBaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
                "documentLinesBinAllocation"
            })
            public static class DocumentLinesBinAllocations {

                @XmlElement(name = "DocumentLinesBinAllocation")
                protected List<Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation> documentLinesBinAllocation;

                /**
                 * Gets the value of the documentLinesBinAllocation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the documentLinesBinAllocation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDocumentLinesBinAllocation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation }
                 * 
                 * 
                 */
                public List<Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation> getDocumentLinesBinAllocation() {
                    if (documentLinesBinAllocation == null) {
                        documentLinesBinAllocation = new ArrayList<Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation>();
                    }
                    return this.documentLinesBinAllocation;
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
                 *         &lt;element name="BinAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="AllowNegativeQuantity" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value="tNO"/>
                 *               &lt;enumeration value="tYES"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="SerialAndBatchNumbersBaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
                public static class DocumentLinesBinAllocation {

                    @XmlElement(name = "BinAbsEntry")
                    protected Long binAbsEntry;
                    @XmlElement(name = "Quantity")
                    protected Double quantity;
                    @XmlElement(name = "AllowNegativeQuantity")
                    protected String allowNegativeQuantity;
                    @XmlElement(name = "SerialAndBatchNumbersBaseLine")
                    protected Long serialAndBatchNumbersBaseLine;
                    @XmlElement(name = "BaseLineNumber")
                    protected Long baseLineNumber;

                    /**
                     * Obtiene el valor de la propiedad binAbsEntry.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getBinAbsEntry() {
                        return binAbsEntry;
                    }

                    /**
                     * Define el valor de la propiedad binAbsEntry.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setBinAbsEntry(Long value) {
                        this.binAbsEntry = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad quantity.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getQuantity() {
                        return quantity;
                    }

                    /**
                     * Define el valor de la propiedad quantity.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setQuantity(Double value) {
                        this.quantity = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad allowNegativeQuantity.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAllowNegativeQuantity() {
                        return allowNegativeQuantity;
                    }

                    /**
                     * Define el valor de la propiedad allowNegativeQuantity.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAllowNegativeQuantity(String value) {
                        this.allowNegativeQuantity = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad serialAndBatchNumbersBaseLine.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getSerialAndBatchNumbersBaseLine() {
                        return serialAndBatchNumbersBaseLine;
                    }

                    /**
                     * Define el valor de la propiedad serialAndBatchNumbersBaseLine.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setSerialAndBatchNumbersBaseLine(Long value) {
                        this.serialAndBatchNumbersBaseLine = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad baseLineNumber.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getBaseLineNumber() {
                        return baseLineNumber;
                    }

                    /**
                     * Define el valor de la propiedad baseLineNumber.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setBaseLineNumber(Long value) {
                        this.baseLineNumber = value;
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
             *         &lt;element name="LineTaxJurisdiction" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
                "lineTaxJurisdiction"
            })
            public static class LineTaxJurisdictions {

                @XmlElement(name = "LineTaxJurisdiction")
                protected List<Document.DocumentLines.DocumentLine.LineTaxJurisdictions.LineTaxJurisdiction> lineTaxJurisdiction;

                /**
                 * Gets the value of the lineTaxJurisdiction property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the lineTaxJurisdiction property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLineTaxJurisdiction().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Document.DocumentLines.DocumentLine.LineTaxJurisdictions.LineTaxJurisdiction }
                 * 
                 * 
                 */
                public List<Document.DocumentLines.DocumentLine.LineTaxJurisdictions.LineTaxJurisdiction> getLineTaxJurisdiction() {
                    if (lineTaxJurisdiction == null) {
                        lineTaxJurisdiction = new ArrayList<Document.DocumentLines.DocumentLine.LineTaxJurisdictions.LineTaxJurisdiction>();
                    }
                    return this.lineTaxJurisdiction;
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
                 *         &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
                public static class LineTaxJurisdiction {

                    @XmlElement(name = "JurisdictionCode")
                    protected String jurisdictionCode;
                    @XmlElement(name = "JurisdictionType")
                    protected Long jurisdictionType;
                    @XmlElement(name = "TaxAmount")
                    protected Double taxAmount;
                    @XmlElement(name = "TaxAmountSC")
                    protected Double taxAmountSC;
                    @XmlElement(name = "TaxAmountFC")
                    protected Double taxAmountFC;
                    @XmlElement(name = "TaxRate")
                    protected Double taxRate;
                    @XmlElement(name = "DocEntry")
                    protected Long docEntry;
                    @XmlElement(name = "LineNumber")
                    protected Long lineNumber;
                    @XmlElement(name = "RowSequence")
                    protected Long rowSequence;

                    /**
                     * Obtiene el valor de la propiedad jurisdictionCode.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getJurisdictionCode() {
                        return jurisdictionCode;
                    }

                    /**
                     * Define el valor de la propiedad jurisdictionCode.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setJurisdictionCode(String value) {
                        this.jurisdictionCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad jurisdictionType.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getJurisdictionType() {
                        return jurisdictionType;
                    }

                    /**
                     * Define el valor de la propiedad jurisdictionType.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setJurisdictionType(Long value) {
                        this.jurisdictionType = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxAmount.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getTaxAmount() {
                        return taxAmount;
                    }

                    /**
                     * Define el valor de la propiedad taxAmount.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setTaxAmount(Double value) {
                        this.taxAmount = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxAmountSC.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getTaxAmountSC() {
                        return taxAmountSC;
                    }

                    /**
                     * Define el valor de la propiedad taxAmountSC.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setTaxAmountSC(Double value) {
                        this.taxAmountSC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxAmountFC.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getTaxAmountFC() {
                        return taxAmountFC;
                    }

                    /**
                     * Define el valor de la propiedad taxAmountFC.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setTaxAmountFC(Double value) {
                        this.taxAmountFC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxRate.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getTaxRate() {
                        return taxRate;
                    }

                    /**
                     * Define el valor de la propiedad taxRate.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setTaxRate(Double value) {
                        this.taxRate = value;
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
                     * Obtiene el valor de la propiedad lineNumber.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getLineNumber() {
                        return lineNumber;
                    }

                    /**
                     * Define el valor de la propiedad lineNumber.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setLineNumber(Long value) {
                        this.lineNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad rowSequence.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getRowSequence() {
                        return rowSequence;
                    }

                    /**
                     * Define el valor de la propiedad rowSequence.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setRowSequence(Long value) {
                        this.rowSequence = value;
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
             *         &lt;element name="SerialNumber" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="ManufactureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="ReceptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="WarrantyStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="WarrantyEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="BatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="SystemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
                "serialNumber"
            })
            public static class SerialNumbers {

                @XmlElement(name = "SerialNumber")
                protected List<Document.DocumentLines.DocumentLine.SerialNumbers.SerialNumber> serialNumber;

                /**
                 * Gets the value of the serialNumber property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the serialNumber property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSerialNumber().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Document.DocumentLines.DocumentLine.SerialNumbers.SerialNumber }
                 * 
                 * 
                 */
                public List<Document.DocumentLines.DocumentLine.SerialNumbers.SerialNumber> getSerialNumber() {
                    if (serialNumber == null) {
                        serialNumber = new ArrayList<Document.DocumentLines.DocumentLine.SerialNumbers.SerialNumber>();
                    }
                    return this.serialNumber;
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
                 *         &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="ManufactureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="ReceptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="WarrantyStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="WarrantyEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="BatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="SystemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
                public static class SerialNumber {

                    @XmlElement(name = "ManufacturerSerialNumber")
                    protected String manufacturerSerialNumber;
                    @XmlElement(name = "InternalSerialNumber")
                    protected String internalSerialNumber;
                    @XmlElement(name = "ExpiryDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar expiryDate;
                    @XmlElement(name = "ManufactureDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar manufactureDate;
                    @XmlElement(name = "ReceptionDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar receptionDate;
                    @XmlElement(name = "WarrantyStart")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar warrantyStart;
                    @XmlElement(name = "WarrantyEnd")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar warrantyEnd;
                    @XmlElement(name = "Location")
                    protected String location;
                    @XmlElement(name = "Notes")
                    protected String notes;
                    @XmlElement(name = "BatchID")
                    protected String batchID;
                    @XmlElement(name = "SystemSerialNumber")
                    protected Long systemSerialNumber;
                    @XmlElement(name = "BaseLineNumber")
                    protected Long baseLineNumber;
                    @XmlElement(name = "Quantity")
                    protected Double quantity;
                    @XmlElement(name = "TrackingNote")
                    protected Long trackingNote;
                    @XmlElement(name = "TrackingNoteLine")
                    protected Long trackingNoteLine;

                    /**
                     * Obtiene el valor de la propiedad manufacturerSerialNumber.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getManufacturerSerialNumber() {
                        return manufacturerSerialNumber;
                    }

                    /**
                     * Define el valor de la propiedad manufacturerSerialNumber.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setManufacturerSerialNumber(String value) {
                        this.manufacturerSerialNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad internalSerialNumber.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInternalSerialNumber() {
                        return internalSerialNumber;
                    }

                    /**
                     * Define el valor de la propiedad internalSerialNumber.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInternalSerialNumber(String value) {
                        this.internalSerialNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad expiryDate.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getExpiryDate() {
                        return expiryDate;
                    }

                    /**
                     * Define el valor de la propiedad expiryDate.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setExpiryDate(XMLGregorianCalendar value) {
                        this.expiryDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad manufactureDate.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getManufactureDate() {
                        return manufactureDate;
                    }

                    /**
                     * Define el valor de la propiedad manufactureDate.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setManufactureDate(XMLGregorianCalendar value) {
                        this.manufactureDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad receptionDate.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getReceptionDate() {
                        return receptionDate;
                    }

                    /**
                     * Define el valor de la propiedad receptionDate.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setReceptionDate(XMLGregorianCalendar value) {
                        this.receptionDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad warrantyStart.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getWarrantyStart() {
                        return warrantyStart;
                    }

                    /**
                     * Define el valor de la propiedad warrantyStart.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setWarrantyStart(XMLGregorianCalendar value) {
                        this.warrantyStart = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad warrantyEnd.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getWarrantyEnd() {
                        return warrantyEnd;
                    }

                    /**
                     * Define el valor de la propiedad warrantyEnd.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setWarrantyEnd(XMLGregorianCalendar value) {
                        this.warrantyEnd = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad location.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLocation() {
                        return location;
                    }

                    /**
                     * Define el valor de la propiedad location.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLocation(String value) {
                        this.location = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad notes.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNotes() {
                        return notes;
                    }

                    /**
                     * Define el valor de la propiedad notes.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNotes(String value) {
                        this.notes = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad batchID.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBatchID() {
                        return batchID;
                    }

                    /**
                     * Define el valor de la propiedad batchID.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBatchID(String value) {
                        this.batchID = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad systemSerialNumber.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getSystemSerialNumber() {
                        return systemSerialNumber;
                    }

                    /**
                     * Define el valor de la propiedad systemSerialNumber.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setSystemSerialNumber(Long value) {
                        this.systemSerialNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad baseLineNumber.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getBaseLineNumber() {
                        return baseLineNumber;
                    }

                    /**
                     * Define el valor de la propiedad baseLineNumber.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setBaseLineNumber(Long value) {
                        this.baseLineNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad quantity.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getQuantity() {
                        return quantity;
                    }

                    /**
                     * Define el valor de la propiedad quantity.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setQuantity(Double value) {
                        this.quantity = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad trackingNote.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getTrackingNote() {
                        return trackingNote;
                    }

                    /**
                     * Define el valor de la propiedad trackingNote.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setTrackingNote(Long value) {
                        this.trackingNote = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad trackingNoteLine.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getTrackingNoteLine() {
                        return trackingNoteLine;
                    }

                    /**
                     * Define el valor de la propiedad trackingNoteLine.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setTrackingNoteLine(Long value) {
                        this.trackingNoteLine = value;
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
     *       &lt;all>
     *         &lt;element name="TaxId0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Incoterms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="VehicleState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NFRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PackQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="PackDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipUnitNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="NetWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="GrossWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="StreetS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BlockS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BuildingS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CityS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ZipCodeS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CountyS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="StateS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CountryS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="StreetB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BlockB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BuildingB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CityB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ZipCodeB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CountyB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="StateB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CountryB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ImportOrExport" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="tNO"/>
     *               &lt;enumeration value="tYES"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="MainUsage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="GlobalLocationNumberS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GlobalLocationNumberB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class TaxExtension {

        @XmlElement(name = "TaxId0")
        protected String taxId0;
        @XmlElement(name = "TaxId1")
        protected String taxId1;
        @XmlElement(name = "TaxId2")
        protected String taxId2;
        @XmlElement(name = "TaxId3")
        protected String taxId3;
        @XmlElement(name = "TaxId4")
        protected String taxId4;
        @XmlElement(name = "TaxId5")
        protected String taxId5;
        @XmlElement(name = "TaxId6")
        protected String taxId6;
        @XmlElement(name = "TaxId7")
        protected String taxId7;
        @XmlElement(name = "TaxId8")
        protected String taxId8;
        @XmlElement(name = "TaxId9")
        protected String taxId9;
        @XmlElement(name = "State")
        protected String state;
        @XmlElement(name = "County")
        protected String county;
        @XmlElement(name = "Incoterms")
        protected String incoterms;
        @XmlElement(name = "Vehicle")
        protected String vehicle;
        @XmlElement(name = "VehicleState")
        protected String vehicleState;
        @XmlElement(name = "NFRef")
        protected String nfRef;
        @XmlElement(name = "Carrier")
        protected String carrier;
        @XmlElement(name = "PackQuantity")
        protected Long packQuantity;
        @XmlElement(name = "PackDescription")
        protected String packDescription;
        @XmlElement(name = "Brand")
        protected String brand;
        @XmlElement(name = "ShipUnitNo")
        protected Long shipUnitNo;
        @XmlElement(name = "NetWeight")
        protected Double netWeight;
        @XmlElement(name = "GrossWeight")
        protected Double grossWeight;
        @XmlElement(name = "StreetS")
        protected String streetS;
        @XmlElement(name = "BlockS")
        protected String blockS;
        @XmlElement(name = "BuildingS")
        protected String buildingS;
        @XmlElement(name = "CityS")
        protected String cityS;
        @XmlElement(name = "ZipCodeS")
        protected String zipCodeS;
        @XmlElement(name = "CountyS")
        protected String countyS;
        @XmlElement(name = "StateS")
        protected String stateS;
        @XmlElement(name = "CountryS")
        protected String countryS;
        @XmlElement(name = "StreetB")
        protected String streetB;
        @XmlElement(name = "BlockB")
        protected String blockB;
        @XmlElement(name = "BuildingB")
        protected String buildingB;
        @XmlElement(name = "CityB")
        protected String cityB;
        @XmlElement(name = "ZipCodeB")
        protected String zipCodeB;
        @XmlElement(name = "CountyB")
        protected String countyB;
        @XmlElement(name = "StateB")
        protected String stateB;
        @XmlElement(name = "CountryB")
        protected String countryB;
        @XmlElement(name = "ImportOrExport")
        protected String importOrExport;
        @XmlElement(name = "MainUsage")
        protected Long mainUsage;
        @XmlElement(name = "GlobalLocationNumberS")
        protected String globalLocationNumberS;
        @XmlElement(name = "GlobalLocationNumberB")
        protected String globalLocationNumberB;
        @XmlElement(name = "TaxId12")
        protected String taxId12;
        @XmlElement(name = "TaxId13")
        protected String taxId13;

        /**
         * Obtiene el valor de la propiedad taxId0.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxId0() {
            return taxId0;
        }

        /**
         * Define el valor de la propiedad taxId0.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxId0(String value) {
            this.taxId0 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId1.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxId1() {
            return taxId1;
        }

        /**
         * Define el valor de la propiedad taxId1.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxId1(String value) {
            this.taxId1 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxId2() {
            return taxId2;
        }

        /**
         * Define el valor de la propiedad taxId2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxId2(String value) {
            this.taxId2 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId3.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxId3() {
            return taxId3;
        }

        /**
         * Define el valor de la propiedad taxId3.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxId3(String value) {
            this.taxId3 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId4.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxId4() {
            return taxId4;
        }

        /**
         * Define el valor de la propiedad taxId4.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxId4(String value) {
            this.taxId4 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId5.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxId5() {
            return taxId5;
        }

        /**
         * Define el valor de la propiedad taxId5.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxId5(String value) {
            this.taxId5 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId6.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxId6() {
            return taxId6;
        }

        /**
         * Define el valor de la propiedad taxId6.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxId6(String value) {
            this.taxId6 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId7.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxId7() {
            return taxId7;
        }

        /**
         * Define el valor de la propiedad taxId7.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxId7(String value) {
            this.taxId7 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId8.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxId8() {
            return taxId8;
        }

        /**
         * Define el valor de la propiedad taxId8.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxId8(String value) {
            this.taxId8 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId9.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxId9() {
            return taxId9;
        }

        /**
         * Define el valor de la propiedad taxId9.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxId9(String value) {
            this.taxId9 = value;
        }

        /**
         * Obtiene el valor de la propiedad state.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * Define el valor de la propiedad state.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
        }

        /**
         * Obtiene el valor de la propiedad county.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCounty() {
            return county;
        }

        /**
         * Define el valor de la propiedad county.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCounty(String value) {
            this.county = value;
        }

        /**
         * Obtiene el valor de la propiedad incoterms.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIncoterms() {
            return incoterms;
        }

        /**
         * Define el valor de la propiedad incoterms.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIncoterms(String value) {
            this.incoterms = value;
        }

        /**
         * Obtiene el valor de la propiedad vehicle.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVehicle() {
            return vehicle;
        }

        /**
         * Define el valor de la propiedad vehicle.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVehicle(String value) {
            this.vehicle = value;
        }

        /**
         * Obtiene el valor de la propiedad vehicleState.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVehicleState() {
            return vehicleState;
        }

        /**
         * Define el valor de la propiedad vehicleState.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVehicleState(String value) {
            this.vehicleState = value;
        }

        /**
         * Obtiene el valor de la propiedad nfRef.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNFRef() {
            return nfRef;
        }

        /**
         * Define el valor de la propiedad nfRef.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNFRef(String value) {
            this.nfRef = value;
        }

        /**
         * Obtiene el valor de la propiedad carrier.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCarrier() {
            return carrier;
        }

        /**
         * Define el valor de la propiedad carrier.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCarrier(String value) {
            this.carrier = value;
        }

        /**
         * Obtiene el valor de la propiedad packQuantity.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPackQuantity() {
            return packQuantity;
        }

        /**
         * Define el valor de la propiedad packQuantity.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPackQuantity(Long value) {
            this.packQuantity = value;
        }

        /**
         * Obtiene el valor de la propiedad packDescription.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPackDescription() {
            return packDescription;
        }

        /**
         * Define el valor de la propiedad packDescription.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPackDescription(String value) {
            this.packDescription = value;
        }

        /**
         * Obtiene el valor de la propiedad brand.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrand() {
            return brand;
        }

        /**
         * Define el valor de la propiedad brand.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrand(String value) {
            this.brand = value;
        }

        /**
         * Obtiene el valor de la propiedad shipUnitNo.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getShipUnitNo() {
            return shipUnitNo;
        }

        /**
         * Define el valor de la propiedad shipUnitNo.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setShipUnitNo(Long value) {
            this.shipUnitNo = value;
        }

        /**
         * Obtiene el valor de la propiedad netWeight.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getNetWeight() {
            return netWeight;
        }

        /**
         * Define el valor de la propiedad netWeight.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setNetWeight(Double value) {
            this.netWeight = value;
        }

        /**
         * Obtiene el valor de la propiedad grossWeight.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getGrossWeight() {
            return grossWeight;
        }

        /**
         * Define el valor de la propiedad grossWeight.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setGrossWeight(Double value) {
            this.grossWeight = value;
        }

        /**
         * Obtiene el valor de la propiedad streetS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStreetS() {
            return streetS;
        }

        /**
         * Define el valor de la propiedad streetS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStreetS(String value) {
            this.streetS = value;
        }

        /**
         * Obtiene el valor de la propiedad blockS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBlockS() {
            return blockS;
        }

        /**
         * Define el valor de la propiedad blockS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBlockS(String value) {
            this.blockS = value;
        }

        /**
         * Obtiene el valor de la propiedad buildingS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBuildingS() {
            return buildingS;
        }

        /**
         * Define el valor de la propiedad buildingS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBuildingS(String value) {
            this.buildingS = value;
        }

        /**
         * Obtiene el valor de la propiedad cityS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCityS() {
            return cityS;
        }

        /**
         * Define el valor de la propiedad cityS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCityS(String value) {
            this.cityS = value;
        }

        /**
         * Obtiene el valor de la propiedad zipCodeS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZipCodeS() {
            return zipCodeS;
        }

        /**
         * Define el valor de la propiedad zipCodeS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZipCodeS(String value) {
            this.zipCodeS = value;
        }

        /**
         * Obtiene el valor de la propiedad countyS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountyS() {
            return countyS;
        }

        /**
         * Define el valor de la propiedad countyS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountyS(String value) {
            this.countyS = value;
        }

        /**
         * Obtiene el valor de la propiedad stateS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateS() {
            return stateS;
        }

        /**
         * Define el valor de la propiedad stateS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateS(String value) {
            this.stateS = value;
        }

        /**
         * Obtiene el valor de la propiedad countryS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryS() {
            return countryS;
        }

        /**
         * Define el valor de la propiedad countryS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryS(String value) {
            this.countryS = value;
        }

        /**
         * Obtiene el valor de la propiedad streetB.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStreetB() {
            return streetB;
        }

        /**
         * Define el valor de la propiedad streetB.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStreetB(String value) {
            this.streetB = value;
        }

        /**
         * Obtiene el valor de la propiedad blockB.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBlockB() {
            return blockB;
        }

        /**
         * Define el valor de la propiedad blockB.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBlockB(String value) {
            this.blockB = value;
        }

        /**
         * Obtiene el valor de la propiedad buildingB.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBuildingB() {
            return buildingB;
        }

        /**
         * Define el valor de la propiedad buildingB.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBuildingB(String value) {
            this.buildingB = value;
        }

        /**
         * Obtiene el valor de la propiedad cityB.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCityB() {
            return cityB;
        }

        /**
         * Define el valor de la propiedad cityB.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCityB(String value) {
            this.cityB = value;
        }

        /**
         * Obtiene el valor de la propiedad zipCodeB.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZipCodeB() {
            return zipCodeB;
        }

        /**
         * Define el valor de la propiedad zipCodeB.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZipCodeB(String value) {
            this.zipCodeB = value;
        }

        /**
         * Obtiene el valor de la propiedad countyB.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountyB() {
            return countyB;
        }

        /**
         * Define el valor de la propiedad countyB.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountyB(String value) {
            this.countyB = value;
        }

        /**
         * Obtiene el valor de la propiedad stateB.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateB() {
            return stateB;
        }

        /**
         * Define el valor de la propiedad stateB.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateB(String value) {
            this.stateB = value;
        }

        /**
         * Obtiene el valor de la propiedad countryB.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryB() {
            return countryB;
        }

        /**
         * Define el valor de la propiedad countryB.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryB(String value) {
            this.countryB = value;
        }

        /**
         * Obtiene el valor de la propiedad importOrExport.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImportOrExport() {
            return importOrExport;
        }

        /**
         * Define el valor de la propiedad importOrExport.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImportOrExport(String value) {
            this.importOrExport = value;
        }

        /**
         * Obtiene el valor de la propiedad mainUsage.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMainUsage() {
            return mainUsage;
        }

        /**
         * Define el valor de la propiedad mainUsage.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMainUsage(Long value) {
            this.mainUsage = value;
        }

        /**
         * Obtiene el valor de la propiedad globalLocationNumberS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGlobalLocationNumberS() {
            return globalLocationNumberS;
        }

        /**
         * Define el valor de la propiedad globalLocationNumberS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGlobalLocationNumberS(String value) {
            this.globalLocationNumberS = value;
        }

        /**
         * Obtiene el valor de la propiedad globalLocationNumberB.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGlobalLocationNumberB() {
            return globalLocationNumberB;
        }

        /**
         * Define el valor de la propiedad globalLocationNumberB.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGlobalLocationNumberB(String value) {
            this.globalLocationNumberB = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId12.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxId12() {
            return taxId12;
        }

        /**
         * Define el valor de la propiedad taxId12.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxId12(String value) {
            this.taxId12 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId13.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxId13() {
            return taxId13;
        }

        /**
         * Define el valor de la propiedad taxId13.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxId13(String value) {
            this.taxId13 = value;
        }

    }

}
