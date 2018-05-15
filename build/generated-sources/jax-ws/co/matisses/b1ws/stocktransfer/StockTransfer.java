package co.matisses.b1ws.stocktransfer;

import co.matisses.b1ws.client.ObjectUtils;
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
 * <p>
 * Clase Java para anonymous complex type.
 *
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Series" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Printed" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JournalMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesPersonCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FromWarehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToWarehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="UpdateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FinancialPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TransNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DocNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TaxDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ContactPerson" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FolioPrefixString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FolioNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DocObjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizationStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="sasWithout"/>
 *               &lt;enumeration value="sasPending"/>
 *               &lt;enumeration value="sasApproved"/>
 *               &lt;enumeration value="sasRejected"/>
 *               &lt;enumeration value="sasGenerated"/>
 *               &lt;enumeration value="sasGeneratedbyAuthorizer"/>
 *               &lt;enumeration value="sasCancelled"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BPLID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BPLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VATRegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StartDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="EndDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EndDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="VehiclePlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATDocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDocExportFormat" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
 *         &lt;element name="StockTransfer_ApprovalRequests" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StockTransfer_ApprovalRequest" maxOccurs="unbounded" minOccurs="0">
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
 *         &lt;element name="StockTransferLines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StockTransferLine" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="VendorNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FromWarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Factor2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Factor3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Factor4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="UseBaseUnits" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="UnitsOfMeasurment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="BaseType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Default"/>
 *                                   &lt;enumeration value="Empty"/>
 *                                   &lt;enumeration value="PurchaseDeliveryNotes"/>
 *                                   &lt;enumeration value="InventoryGeneralEntry"/>
 *                                   &lt;enumeration value="WarehouseTransfers"/>
 *                                   &lt;enumeration value="InventoryTransferRequest"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="BaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BaseEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="UoMCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InventoryQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="RemainingOpenQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="RemainingOpenInventoryQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
 *                             &lt;element name="StockTransferLinesBinAllocations" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="StockTransferLinesBinAllocation" maxOccurs="unbounded" minOccurs="0">
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
 *                                                 &lt;element name="BinActionType" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="batToWarehouse"/>
 *                                                       &lt;enumeration value="batFromWarehouse"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
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
 *         &lt;element name="StockTransferTaxExtension" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="SupportVAT" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="tNO"/>
 *                         &lt;enumeration value="tYES"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FormNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TransactionCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {})
@XmlRootElement(name = "StockTransfer")
public class StockTransfer {

    @XmlElement(namespace = "", name = "DocEntry")
    protected Long docEntry;
    @XmlElement(namespace = "", name = "Series")
    protected Long series;
    @XmlElement(namespace = "", name = "Printed")
    protected String printed;
    @XmlElement(namespace = "", name = "DocDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDate;
    @XmlElement(namespace = "", name = "DueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(namespace = "", name = "CardCode")
    protected String cardCode;
    @XmlElement(namespace = "", name = "CardName")
    protected String cardName;
    @XmlElement(namespace = "", name = "Address")
    protected String address;
    @XmlElement(namespace = "", name = "Reference1")
    protected String reference1;
    @XmlElement(namespace = "", name = "Reference2")
    protected String reference2;
    @XmlElement(namespace = "", name = "Comments")
    protected String comments;
    @XmlElement(namespace = "", name = "JournalMemo")
    protected String journalMemo;
    @XmlElement(namespace = "", name = "PriceList")
    protected Long priceList;
    @XmlElement(namespace = "", name = "SalesPersonCode")
    protected Long salesPersonCode;
    @XmlElement(namespace = "", name = "FromWarehouse")
    protected String fromWarehouse;
    @XmlElement(namespace = "", name = "ToWarehouse")
    protected String toWarehouse;
    @XmlElement(namespace = "", name = "CreationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(namespace = "", name = "UpdateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updateDate;
    @XmlElement(namespace = "", name = "FinancialPeriod")
    protected Long financialPeriod;
    @XmlElement(namespace = "", name = "TransNum")
    protected Long transNum;
    @XmlElement(namespace = "", name = "DocNum")
    protected Long docNum;
    @XmlElement(namespace = "", name = "TaxDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxDate;
    @XmlElement(namespace = "", name = "ContactPerson")
    protected Long contactPerson;
    @XmlElement(namespace = "", name = "FolioPrefixString")
    protected String folioPrefixString;
    @XmlElement(namespace = "", name = "FolioNumber")
    protected Long folioNumber;
    @XmlElement(namespace = "", name = "DocObjectCode")
    protected String docObjectCode;
    @XmlElement(namespace = "", name = "AuthorizationStatus")
    protected String authorizationStatus;
    @XmlElement(namespace = "", name = "BPLID")
    protected Long bplid;
    @XmlElement(namespace = "", name = "BPLName")
    protected String bplName;
    @XmlElement(namespace = "", name = "VATRegNum")
    protected String vatRegNum;
    @XmlElement(namespace = "", name = "AuthorizationCode")
    protected String authorizationCode;
    @XmlElement(namespace = "", name = "StartDeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDeliveryDate;
    @XmlElement(namespace = "", name = "StartDeliveryTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startDeliveryTime;
    @XmlElement(namespace = "", name = "EndDeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDeliveryDate;
    @XmlElement(namespace = "", name = "EndDeliveryTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endDeliveryTime;
    @XmlElement(namespace = "", name = "VehiclePlate")
    protected String vehiclePlate;
    @XmlElement(namespace = "", name = "ATDocumentType")
    protected String atDocumentType;
    @XmlElement(namespace = "", name = "EDocExportFormat")
    protected Long eDocExportFormat;
    @XmlElement(namespace = "", name = "ElecCommStatus")
    protected String elecCommStatus;
    @XmlElement(namespace = "", name = "ElecCommMessage")
    protected String elecCommMessage;
    @XmlElement(namespace = "", name = "U_Autorret")
    protected String uAutorret;
    @XmlElement(namespace = "", name = "U_BPCOST")
    protected String ubpcost;
    @XmlElement(namespace = "", name = "U_WUID")
    protected String uwuid;
    @XmlElement(namespace = "", name = "U_TipoNota")
    protected String uTipoNota;
    @XmlElement(namespace = "", name = "U_Retefue")
    protected String uRetefue;
    @XmlElement(namespace = "", name = "U_ReteIca")
    protected String uReteIca;
    @XmlElement(namespace = "", name = "U_OK1_IVAPA")
    protected String uok1IVAPA;
    @XmlElement(namespace = "", name = "U_OK1_IFRS")
    protected String uok1IFRS;
    @XmlElement(namespace = "", name = "U_Diseno")
    protected String uDiseno;
    @XmlElement(namespace = "", name = "U_diseno2")
    protected String uDiseno2;
    @XmlElement(namespace = "", name = "U_comdeco1")
    protected Long uComdeco1;
    @XmlElement(namespace = "", name = "U_comdeco2")
    protected Long uComdeco2;
    @XmlElement(namespace = "", name = "U_Vendedor1")
    protected String uVendedor1;
    @XmlElement(namespace = "", name = "U_Vendedor2")
    protected String uVendedor2;
    @XmlElement(namespace = "", name = "U_Vendedor3")
    protected String uVendedor3;
    @XmlElement(namespace = "", name = "U_Vendedor4")
    protected String uVendedor4;
    @XmlElement(namespace = "", name = "U_Vendedor5")
    protected String uVendedor5;
    @XmlElement(namespace = "", name = "U_Factor")
    protected Long uFactor;
    @XmlElement(namespace = "", name = "U_NWR_PicS")
    protected String unwrPicS;
    @XmlElement(namespace = "", name = "U_NWR_BRet")
    protected String unwrbRet;
    @XmlElement(namespace = "", name = "U_nwr_PAut")
    protected Long uNwrPAut;
    @XmlElement(namespace = "", name = "U_nwr_Note")
    protected String uNwrNote;
    @XmlElement(namespace = "", name = "U_nwr_Tag")
    protected String uNwrTag;
    @XmlElement(namespace = "", name = "U_nwr_Frgt")
    protected Double uNwrFrgt;
    @XmlElement(namespace = "", name = "U_NWR_NORM")
    protected String unwrnorm;
    @XmlElement(namespace = "", name = "U_TypeExped")
    protected String uTypeExped;
    @XmlElement(namespace = "", name = "U_CreaNC")
    protected String uCreaNC;
    @XmlElement(namespace = "", name = "U_NumFact")
    protected String uNumFact;
    @XmlElement(namespace = "", name = "U_Aprobado")
    protected String uAprobado;
    @XmlElement(namespace = "", name = "U_ComVend1")
    protected String uComVend1;
    @XmlElement(namespace = "", name = "U_ComVend2")
    protected String uComVend2;
    @XmlElement(namespace = "", name = "U_ComVend3")
    protected String uComVend3;
    @XmlElement(namespace = "", name = "U_ComVend4")
    protected String uComVend4;
    @XmlElement(namespace = "", name = "U_ComVend5")
    protected String uComVend5;
    @XmlElement(namespace = "", name = "U_Act_Costo")
    protected String uActCosto;
    @XmlElement(namespace = "", name = "U_DocEntryLeg")
    protected Long uDocEntryLeg;
    @XmlElement(namespace = "", name = "U_idLineLeg")
    protected String uIdLineLeg;
    @XmlElement(namespace = "", name = "U_serieLeg")
    protected Long uSerieLeg;
    @XmlElement(namespace = "", name = "U_EsIndep")
    protected String uEsIndep;
    @XmlElement(namespace = "", name = "U_firma")
    protected String uFirma;
    @XmlElement(namespace = "", name = "U_cedula")
    protected String uCedula;
    @XmlElement(namespace = "", name = "U_DifCode")
    protected String uDifCode;
    @XmlElement(namespace = "", name = "U_CatRet")
    protected String uCatRet;
    @XmlElement(namespace = "", name = "U_Origen")
    protected String uOrigen;
    @XmlElement(namespace = "", name = "StockTransfer_ApprovalRequests")
    protected StockTransfer.StockTransferApprovalRequests stockTransferApprovalRequests;
    @XmlElement(namespace = "", name = "StockTransferLines")
    protected StockTransfer.StockTransferLines stockTransferLines;
    @XmlElement(namespace = "", name = "StockTransferTaxExtension")
    protected StockTransfer.StockTransferTaxExtension stockTransferTaxExtension;

    /**
     * Obtiene el valor de la propiedad docEntry.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getDocEntry() {
        return docEntry;
    }

    /**
     * Define el valor de la propiedad docEntry.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setDocEntry(Long value) {
        this.docEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad series.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getSeries() {
        return series;
    }

    /**
     * Define el valor de la propiedad series.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setSeries(Long value) {
        this.series = value;
    }

    /**
     * Obtiene el valor de la propiedad printed.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPrinted() {
        return printed;
    }

    /**
     * Define el valor de la propiedad printed.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPrinted(String value) {
        this.printed = value;
    }

    /**
     * Obtiene el valor de la propiedad docDate.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Define el valor de la propiedad docDate.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Obtiene el valor de la propiedad dueDate.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Define el valor de la propiedad dueDate.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad cardCode.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * Define el valor de la propiedad cardCode.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCardCode(String value) {
        this.cardCode = value;
    }

    /**
     * Obtiene el valor de la propiedad cardName.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * Define el valor de la propiedad cardName.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCardName(String value) {
        this.cardName = value;
    }

    /**
     * Obtiene el valor de la propiedad address.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad reference1.
     *
     * @return possible object is {@link String }
     *
     */
    public String getReference1() {
        return reference1;
    }

    /**
     * Define el valor de la propiedad reference1.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setReference1(String value) {
        this.reference1 = value;
    }

    /**
     * Obtiene el valor de la propiedad reference2.
     *
     * @return possible object is {@link String }
     *
     */
    public String getReference2() {
        return reference2;
    }

    /**
     * Define el valor de la propiedad reference2.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setReference2(String value) {
        this.reference2 = value;
    }

    /**
     * Obtiene el valor de la propiedad comments.
     *
     * @return possible object is {@link String }
     *
     */
    public String getComments() {
        return comments;
    }

    /**
     * Define el valor de la propiedad comments.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Obtiene el valor de la propiedad journalMemo.
     *
     * @return possible object is {@link String }
     *
     */
    public String getJournalMemo() {
        return journalMemo;
    }

    /**
     * Define el valor de la propiedad journalMemo.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setJournalMemo(String value) {
        this.journalMemo = value;
    }

    /**
     * Obtiene el valor de la propiedad priceList.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getPriceList() {
        return priceList;
    }

    /**
     * Define el valor de la propiedad priceList.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setPriceList(Long value) {
        this.priceList = value;
    }

    /**
     * Obtiene el valor de la propiedad salesPersonCode.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getSalesPersonCode() {
        return salesPersonCode;
    }

    /**
     * Define el valor de la propiedad salesPersonCode.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setSalesPersonCode(Long value) {
        this.salesPersonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad fromWarehouse.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFromWarehouse() {
        return fromWarehouse;
    }

    /**
     * Define el valor de la propiedad fromWarehouse.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFromWarehouse(String value) {
        this.fromWarehouse = value;
    }

    /**
     * Obtiene el valor de la propiedad toWarehouse.
     *
     * @return possible object is {@link String }
     *
     */
    public String getToWarehouse() {
        return toWarehouse;
    }

    /**
     * Define el valor de la propiedad toWarehouse.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setToWarehouse(String value) {
        this.toWarehouse = value;
    }

    /**
     * Obtiene el valor de la propiedad creationDate.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Define el valor de la propiedad creationDate.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad updateDate.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Define el valor de la propiedad updateDate.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Obtiene el valor de la propiedad financialPeriod.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getFinancialPeriod() {
        return financialPeriod;
    }

    /**
     * Define el valor de la propiedad financialPeriod.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setFinancialPeriod(Long value) {
        this.financialPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad transNum.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getTransNum() {
        return transNum;
    }

    /**
     * Define el valor de la propiedad transNum.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setTransNum(Long value) {
        this.transNum = value;
    }

    /**
     * Obtiene el valor de la propiedad docNum.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getDocNum() {
        return docNum;
    }

    /**
     * Define el valor de la propiedad docNum.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setDocNum(Long value) {
        this.docNum = value;
    }

    /**
     * Obtiene el valor de la propiedad taxDate.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getTaxDate() {
        return taxDate;
    }

    /**
     * Define el valor de la propiedad taxDate.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setTaxDate(XMLGregorianCalendar value) {
        this.taxDate = value;
    }

    /**
     * Obtiene el valor de la propiedad contactPerson.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getContactPerson() {
        return contactPerson;
    }

    /**
     * Define el valor de la propiedad contactPerson.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setContactPerson(Long value) {
        this.contactPerson = value;
    }

    /**
     * Obtiene el valor de la propiedad folioPrefixString.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFolioPrefixString() {
        return folioPrefixString;
    }

    /**
     * Define el valor de la propiedad folioPrefixString.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFolioPrefixString(String value) {
        this.folioPrefixString = value;
    }

    /**
     * Obtiene el valor de la propiedad folioNumber.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getFolioNumber() {
        return folioNumber;
    }

    /**
     * Define el valor de la propiedad folioNumber.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setFolioNumber(Long value) {
        this.folioNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad docObjectCode.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDocObjectCode() {
        return docObjectCode;
    }

    /**
     * Define el valor de la propiedad docObjectCode.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDocObjectCode(String value) {
        this.docObjectCode = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizationStatus.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAuthorizationStatus() {
        return authorizationStatus;
    }

    /**
     * Define el valor de la propiedad authorizationStatus.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAuthorizationStatus(String value) {
        this.authorizationStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad bplid.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getBPLID() {
        return bplid;
    }

    /**
     * Define el valor de la propiedad bplid.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setBPLID(Long value) {
        this.bplid = value;
    }

    /**
     * Obtiene el valor de la propiedad bplName.
     *
     * @return possible object is {@link String }
     *
     */
    public String getBPLName() {
        return bplName;
    }

    /**
     * Define el valor de la propiedad bplName.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setBPLName(String value) {
        this.bplName = value;
    }

    /**
     * Obtiene el valor de la propiedad vatRegNum.
     *
     * @return possible object is {@link String }
     *
     */
    public String getVATRegNum() {
        return vatRegNum;
    }

    /**
     * Define el valor de la propiedad vatRegNum.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setVATRegNum(String value) {
        this.vatRegNum = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizationCode.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Define el valor de la propiedad authorizationCode.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad startDeliveryDate.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getStartDeliveryDate() {
        return startDeliveryDate;
    }

    /**
     * Define el valor de la propiedad startDeliveryDate.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setStartDeliveryDate(XMLGregorianCalendar value) {
        this.startDeliveryDate = value;
    }

    /**
     * Obtiene el valor de la propiedad startDeliveryTime.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getStartDeliveryTime() {
        return startDeliveryTime;
    }

    /**
     * Define el valor de la propiedad startDeliveryTime.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setStartDeliveryTime(XMLGregorianCalendar value) {
        this.startDeliveryTime = value;
    }

    /**
     * Obtiene el valor de la propiedad endDeliveryDate.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getEndDeliveryDate() {
        return endDeliveryDate;
    }

    /**
     * Define el valor de la propiedad endDeliveryDate.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setEndDeliveryDate(XMLGregorianCalendar value) {
        this.endDeliveryDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDeliveryTime.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getEndDeliveryTime() {
        return endDeliveryTime;
    }

    /**
     * Define el valor de la propiedad endDeliveryTime.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setEndDeliveryTime(XMLGregorianCalendar value) {
        this.endDeliveryTime = value;
    }

    /**
     * Obtiene el valor de la propiedad vehiclePlate.
     *
     * @return possible object is {@link String }
     *
     */
    public String getVehiclePlate() {
        return vehiclePlate;
    }

    /**
     * Define el valor de la propiedad vehiclePlate.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setVehiclePlate(String value) {
        this.vehiclePlate = value;
    }

    /**
     * Obtiene el valor de la propiedad atDocumentType.
     *
     * @return possible object is {@link String }
     *
     */
    public String getATDocumentType() {
        return atDocumentType;
    }

    /**
     * Define el valor de la propiedad atDocumentType.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setATDocumentType(String value) {
        this.atDocumentType = value;
    }

    /**
     * Obtiene el valor de la propiedad eDocExportFormat.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getEDocExportFormat() {
        return eDocExportFormat;
    }

    /**
     * Define el valor de la propiedad eDocExportFormat.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setEDocExportFormat(Long value) {
        this.eDocExportFormat = value;
    }

    /**
     * Obtiene el valor de la propiedad elecCommStatus.
     *
     * @return possible object is {@link String }
     *
     */
    public String getElecCommStatus() {
        return elecCommStatus;
    }

    /**
     * Define el valor de la propiedad elecCommStatus.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setElecCommStatus(String value) {
        this.elecCommStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad elecCommMessage.
     *
     * @return possible object is {@link String }
     *
     */
    public String getElecCommMessage() {
        return elecCommMessage;
    }

    /**
     * Define el valor de la propiedad elecCommMessage.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setElecCommMessage(String value) {
        this.elecCommMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad uAutorret.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUAutorret() {
        return uAutorret;
    }

    /**
     * Define el valor de la propiedad uAutorret.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUAutorret(String value) {
        this.uAutorret = value;
    }

    /**
     * Obtiene el valor de la propiedad ubpcost.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUBPCOST() {
        return ubpcost;
    }

    /**
     * Define el valor de la propiedad ubpcost.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUBPCOST(String value) {
        this.ubpcost = value;
    }

    /**
     * Obtiene el valor de la propiedad uwuid.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUWUID() {
        return uwuid;
    }

    /**
     * Define el valor de la propiedad uwuid.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUWUID(String value) {
        this.uwuid = value;
    }

    /**
     * Obtiene el valor de la propiedad uTipoNota.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUTipoNota() {
        return uTipoNota;
    }

    /**
     * Define el valor de la propiedad uTipoNota.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUTipoNota(String value) {
        this.uTipoNota = value;
    }

    /**
     * Obtiene el valor de la propiedad uRetefue.
     *
     * @return possible object is {@link String }
     *
     */
    public String getURetefue() {
        return uRetefue;
    }

    /**
     * Define el valor de la propiedad uRetefue.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setURetefue(String value) {
        this.uRetefue = value;
    }

    /**
     * Obtiene el valor de la propiedad uReteIca.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUReteIca() {
        return uReteIca;
    }

    /**
     * Define el valor de la propiedad uReteIca.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUReteIca(String value) {
        this.uReteIca = value;
    }

    /**
     * Obtiene el valor de la propiedad uok1IVAPA.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUOK1IVAPA() {
        return uok1IVAPA;
    }

    /**
     * Define el valor de la propiedad uok1IVAPA.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUOK1IVAPA(String value) {
        this.uok1IVAPA = value;
    }

    /**
     * Obtiene el valor de la propiedad uok1IFRS.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUOK1IFRS() {
        return uok1IFRS;
    }

    /**
     * Define el valor de la propiedad uok1IFRS.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUOK1IFRS(String value) {
        this.uok1IFRS = value;
    }

    /**
     * Obtiene el valor de la propiedad uDiseno.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUDiseno() {
        return uDiseno;
    }

    /**
     * Define el valor de la propiedad uDiseno.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUDiseno(String value) {
        this.uDiseno = value;
    }

    /**
     * Obtiene el valor de la propiedad uDiseno2.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUDiseno2() {
        return uDiseno2;
    }

    /**
     * Define el valor de la propiedad uDiseno2.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUDiseno2(String value) {
        this.uDiseno2 = value;
    }

    /**
     * Obtiene el valor de la propiedad uComdeco1.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getUComdeco1() {
        return uComdeco1;
    }

    /**
     * Define el valor de la propiedad uComdeco1.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setUComdeco1(Long value) {
        this.uComdeco1 = value;
    }

    /**
     * Obtiene el valor de la propiedad uComdeco2.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getUComdeco2() {
        return uComdeco2;
    }

    /**
     * Define el valor de la propiedad uComdeco2.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setUComdeco2(Long value) {
        this.uComdeco2 = value;
    }

    /**
     * Obtiene el valor de la propiedad uVendedor1.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUVendedor1() {
        return uVendedor1;
    }

    /**
     * Define el valor de la propiedad uVendedor1.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUVendedor1(String value) {
        this.uVendedor1 = value;
    }

    /**
     * Obtiene el valor de la propiedad uVendedor2.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUVendedor2() {
        return uVendedor2;
    }

    /**
     * Define el valor de la propiedad uVendedor2.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUVendedor2(String value) {
        this.uVendedor2 = value;
    }

    /**
     * Obtiene el valor de la propiedad uVendedor3.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUVendedor3() {
        return uVendedor3;
    }

    /**
     * Define el valor de la propiedad uVendedor3.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUVendedor3(String value) {
        this.uVendedor3 = value;
    }

    /**
     * Obtiene el valor de la propiedad uVendedor4.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUVendedor4() {
        return uVendedor4;
    }

    /**
     * Define el valor de la propiedad uVendedor4.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUVendedor4(String value) {
        this.uVendedor4 = value;
    }

    /**
     * Obtiene el valor de la propiedad uVendedor5.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUVendedor5() {
        return uVendedor5;
    }

    /**
     * Define el valor de la propiedad uVendedor5.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUVendedor5(String value) {
        this.uVendedor5 = value;
    }

    /**
     * Obtiene el valor de la propiedad uFactor.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getUFactor() {
        return uFactor;
    }

    /**
     * Define el valor de la propiedad uFactor.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setUFactor(Long value) {
        this.uFactor = value;
    }

    /**
     * Obtiene el valor de la propiedad unwrPicS.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUNWRPicS() {
        return unwrPicS;
    }

    /**
     * Define el valor de la propiedad unwrPicS.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUNWRPicS(String value) {
        this.unwrPicS = value;
    }

    /**
     * Obtiene el valor de la propiedad unwrbRet.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUNWRBRet() {
        return unwrbRet;
    }

    /**
     * Define el valor de la propiedad unwrbRet.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUNWRBRet(String value) {
        this.unwrbRet = value;
    }

    /**
     * Obtiene el valor de la propiedad uNwrPAut.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getUNwrPAut() {
        return uNwrPAut;
    }

    /**
     * Define el valor de la propiedad uNwrPAut.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setUNwrPAut(Long value) {
        this.uNwrPAut = value;
    }

    /**
     * Obtiene el valor de la propiedad uNwrNote.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUNwrNote() {
        return uNwrNote;
    }

    /**
     * Define el valor de la propiedad uNwrNote.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUNwrNote(String value) {
        this.uNwrNote = value;
    }

    /**
     * Obtiene el valor de la propiedad uNwrTag.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUNwrTag() {
        return uNwrTag;
    }

    /**
     * Define el valor de la propiedad uNwrTag.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUNwrTag(String value) {
        this.uNwrTag = value;
    }

    /**
     * Obtiene el valor de la propiedad uNwrFrgt.
     *
     * @return possible object is {@link Double }
     *
     */
    public Double getUNwrFrgt() {
        return uNwrFrgt;
    }

    /**
     * Define el valor de la propiedad uNwrFrgt.
     *
     * @param value allowed object is {@link Double }
     *
     */
    public void setUNwrFrgt(Double value) {
        this.uNwrFrgt = value;
    }

    /**
     * Obtiene el valor de la propiedad unwrnorm.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUNWRNORM() {
        return unwrnorm;
    }

    /**
     * Define el valor de la propiedad unwrnorm.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUNWRNORM(String value) {
        this.unwrnorm = value;
    }

    /**
     * Obtiene el valor de la propiedad uTypeExped.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUTypeExped() {
        return uTypeExped;
    }

    /**
     * Define el valor de la propiedad uTypeExped.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUTypeExped(String value) {
        this.uTypeExped = value;
    }

    /**
     * Obtiene el valor de la propiedad uCreaNC.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUCreaNC() {
        return uCreaNC;
    }

    /**
     * Define el valor de la propiedad uCreaNC.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUCreaNC(String value) {
        this.uCreaNC = value;
    }

    /**
     * Obtiene el valor de la propiedad uNumFact.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUNumFact() {
        return uNumFact;
    }

    /**
     * Define el valor de la propiedad uNumFact.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUNumFact(String value) {
        this.uNumFact = value;
    }

    /**
     * Obtiene el valor de la propiedad uAprobado.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUAprobado() {
        return uAprobado;
    }

    /**
     * Define el valor de la propiedad uAprobado.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUAprobado(String value) {
        this.uAprobado = value;
    }

    /**
     * Obtiene el valor de la propiedad uComVend1.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUComVend1() {
        return uComVend1;
    }

    /**
     * Define el valor de la propiedad uComVend1.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUComVend1(String value) {
        this.uComVend1 = value;
    }

    /**
     * Obtiene el valor de la propiedad uComVend2.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUComVend2() {
        return uComVend2;
    }

    /**
     * Define el valor de la propiedad uComVend2.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUComVend2(String value) {
        this.uComVend2 = value;
    }

    /**
     * Obtiene el valor de la propiedad uComVend3.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUComVend3() {
        return uComVend3;
    }

    /**
     * Define el valor de la propiedad uComVend3.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUComVend3(String value) {
        this.uComVend3 = value;
    }

    /**
     * Obtiene el valor de la propiedad uComVend4.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUComVend4() {
        return uComVend4;
    }

    /**
     * Define el valor de la propiedad uComVend4.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUComVend4(String value) {
        this.uComVend4 = value;
    }

    /**
     * Obtiene el valor de la propiedad uComVend5.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUComVend5() {
        return uComVend5;
    }

    /**
     * Define el valor de la propiedad uComVend5.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUComVend5(String value) {
        this.uComVend5 = value;
    }

    /**
     * Obtiene el valor de la propiedad uActCosto.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUActCosto() {
        return uActCosto;
    }

    /**
     * Define el valor de la propiedad uActCosto.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUActCosto(String value) {
        this.uActCosto = value;
    }

    /**
     * Obtiene el valor de la propiedad uDocEntryLeg.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getUDocEntryLeg() {
        return uDocEntryLeg;
    }

    /**
     * Define el valor de la propiedad uDocEntryLeg.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setUDocEntryLeg(Long value) {
        this.uDocEntryLeg = value;
    }

    /**
     * Obtiene el valor de la propiedad uIdLineLeg.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUIdLineLeg() {
        return uIdLineLeg;
    }

    /**
     * Define el valor de la propiedad uIdLineLeg.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUIdLineLeg(String value) {
        this.uIdLineLeg = value;
    }

    /**
     * Obtiene el valor de la propiedad uSerieLeg.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getUSerieLeg() {
        return uSerieLeg;
    }

    /**
     * Define el valor de la propiedad uSerieLeg.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setUSerieLeg(Long value) {
        this.uSerieLeg = value;
    }

    /**
     * Obtiene el valor de la propiedad uEsIndep.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUEsIndep() {
        return uEsIndep;
    }

    /**
     * Define el valor de la propiedad uEsIndep.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUEsIndep(String value) {
        this.uEsIndep = value;
    }

    /**
     * Obtiene el valor de la propiedad uFirma.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUFirma() {
        return uFirma;
    }

    /**
     * Define el valor de la propiedad uFirma.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUFirma(String value) {
        this.uFirma = value;
    }

    /**
     * Obtiene el valor de la propiedad uCedula.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUCedula() {
        return uCedula;
    }

    /**
     * Define el valor de la propiedad uCedula.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUCedula(String value) {
        this.uCedula = value;
    }

    /**
     * Obtiene el valor de la propiedad uDifCode.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUDifCode() {
        return uDifCode;
    }

    /**
     * Define el valor de la propiedad uDifCode.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUDifCode(String value) {
        this.uDifCode = value;
    }

    /**
     * Obtiene el valor de la propiedad uCatRet.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUCatRet() {
        return uCatRet;
    }

    /**
     * Define el valor de la propiedad uCatRet.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUCatRet(String value) {
        this.uCatRet = value;
    }

    /**
     * Obtiene el valor de la propiedad uOrigen.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUOrigen() {
        return uOrigen;
    }

    /**
     * Define el valor de la propiedad uOrigen.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUOrigen(String value) {
        this.uOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad stockTransferApprovalRequests.
     *
     * @return possible object is
     *     {@link StockTransfer.StockTransferApprovalRequests }
     *
     */
    public StockTransfer.StockTransferApprovalRequests getStockTransferApprovalRequests() {
        return stockTransferApprovalRequests;
    }

    /**
     * Define el valor de la propiedad stockTransferApprovalRequests.
     *
     * @param value allowed object is
     *     {@link StockTransfer.StockTransferApprovalRequests }
     *
     */
    public void setStockTransferApprovalRequests(StockTransfer.StockTransferApprovalRequests value) {
        this.stockTransferApprovalRequests = value;
    }

    /**
     * Obtiene el valor de la propiedad stockTransferLines.
     *
     * @return possible object is {@link StockTransfer.StockTransferLines }
     *
     */
    public StockTransfer.StockTransferLines getStockTransferLines() {
        return stockTransferLines;
    }

    /**
     * Define el valor de la propiedad stockTransferLines.
     *
     * @param value allowed object is {@link StockTransfer.StockTransferLines }
     *
     */
    public void setStockTransferLines(StockTransfer.StockTransferLines value) {
        this.stockTransferLines = value;
    }

    /**
     * Obtiene el valor de la propiedad stockTransferTaxExtension.
     *
     * @return possible object is
     *     {@link StockTransfer.StockTransferTaxExtension }
     *
     */
    public StockTransfer.StockTransferTaxExtension getStockTransferTaxExtension() {
        return stockTransferTaxExtension;
    }

    /**
     * Define el valor de la propiedad stockTransferTaxExtension.
     *
     * @param value allowed object is
     *     {@link StockTransfer.StockTransferTaxExtension }
     *
     */
    public void setStockTransferTaxExtension(StockTransfer.StockTransferTaxExtension value) {
        this.stockTransferTaxExtension = value;
    }

    /**
     * <p>
     * Clase Java para anonymous complex type.
     *
     * <p>
     * El siguiente fragmento de esquema especifica el contenido que se espera
     * que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="StockTransfer_ApprovalRequest" maxOccurs="unbounded" minOccurs="0">
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
        "stockTransferApprovalRequest"
    })
    public static class StockTransferApprovalRequests {

        @XmlElement(name = "StockTransfer_ApprovalRequest")
        protected List<StockTransfer.StockTransferApprovalRequests.StockTransferApprovalRequest> stockTransferApprovalRequest;

        /**
         * Gets the value of the stockTransferApprovalRequest property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the stockTransferApprovalRequest
         * property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStockTransferApprovalRequest().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StockTransfer.StockTransferApprovalRequests.StockTransferApprovalRequest }
         *
         *
         */
        public List<StockTransfer.StockTransferApprovalRequests.StockTransferApprovalRequest> getStockTransferApprovalRequest() {
            if (stockTransferApprovalRequest == null) {
                stockTransferApprovalRequest = new ArrayList<StockTransfer.StockTransferApprovalRequests.StockTransferApprovalRequest>();
            }
            return this.stockTransferApprovalRequest;
        }

        /**
         * <p>
         * Clase Java para anonymous complex type.
         *
         * <p>
         * El siguiente fragmento de esquema especifica el contenido que se
         * espera que haya en esta clase.
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
        @XmlType(name = "", propOrder = {})
        public static class StockTransferApprovalRequest {

            @XmlElement(name = "ApprovalTemplatesID")
            protected Long approvalTemplatesID;
            @XmlElement(name = "Remarks")
            protected String remarks;

            /**
             * Obtiene el valor de la propiedad approvalTemplatesID.
             *
             * @return possible object is {@link Long }
             *
             */
            public Long getApprovalTemplatesID() {
                return approvalTemplatesID;
            }

            /**
             * Define el valor de la propiedad approvalTemplatesID.
             *
             * @param value allowed object is {@link Long }
             *
             */
            public void setApprovalTemplatesID(Long value) {
                this.approvalTemplatesID = value;
            }

            /**
             * Obtiene el valor de la propiedad remarks.
             *
             * @return possible object is {@link String }
             *
             */
            public String getRemarks() {
                return remarks;
            }

            /**
             * Define el valor de la propiedad remarks.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setRemarks(String value) {
                this.remarks = value;
            }

        }

    }

    /**
     * <p>
     * Clase Java para anonymous complex type.
     *
     * <p>
     * El siguiente fragmento de esquema especifica el contenido que se espera
     * que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="StockTransferLine" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="VendorNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FromWarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Factor2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Factor3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Factor4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UseBaseUnits" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UnitsOfMeasurment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="BaseType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="Default"/>
     *                         &lt;enumeration value="Empty"/>
     *                         &lt;enumeration value="PurchaseDeliveryNotes"/>
     *                         &lt;enumeration value="InventoryGeneralEntry"/>
     *                         &lt;enumeration value="WarehouseTransfers"/>
     *                         &lt;enumeration value="InventoryTransferRequest"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="BaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="UoMCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InventoryQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="RemainingOpenQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="RemainingOpenInventoryQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
     *                   &lt;element name="StockTransferLinesBinAllocations" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="StockTransferLinesBinAllocation" maxOccurs="unbounded" minOccurs="0">
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
     *                                       &lt;element name="BinActionType" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="batToWarehouse"/>
     *                                             &lt;enumeration value="batFromWarehouse"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
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
        "stockTransferLine"
    })
    public static class StockTransferLines {

        @Override
        public String toString() {
            return ObjectUtils.toString(this);
        }

        @XmlElement(name = "StockTransferLine")
        protected List<StockTransfer.StockTransferLines.StockTransferLine> stockTransferLine;

        /**
         * Gets the value of the stockTransferLine property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the stockTransferLine property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStockTransferLine().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StockTransfer.StockTransferLines.StockTransferLine }
         *
         *
         */
        public List<StockTransfer.StockTransferLines.StockTransferLine> getStockTransferLine() {
            if (stockTransferLine == null) {
                stockTransferLine = new ArrayList<StockTransfer.StockTransferLines.StockTransferLine>();
            }
            return this.stockTransferLine;
        }

        /**
         * <p>
         * Clase Java para anonymous complex type.
         *
         * <p>
         * El siguiente fragmento de esquema especifica el contenido que se
         * espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="VendorNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FromWarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Factor2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Factor3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Factor4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UseBaseUnits" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UnitsOfMeasurment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="BaseType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="Default"/>
         *               &lt;enumeration value="Empty"/>
         *               &lt;enumeration value="PurchaseDeliveryNotes"/>
         *               &lt;enumeration value="InventoryGeneralEntry"/>
         *               &lt;enumeration value="WarehouseTransfers"/>
         *               &lt;enumeration value="InventoryTransferRequest"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="BaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="UoMCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InventoryQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="RemainingOpenQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="RemainingOpenInventoryQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
         *         &lt;element name="StockTransferLinesBinAllocations" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="StockTransferLinesBinAllocation" maxOccurs="unbounded" minOccurs="0">
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
         *                             &lt;element name="BinActionType" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value="batToWarehouse"/>
         *                                   &lt;enumeration value="batFromWarehouse"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
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
        @XmlType(name = "", propOrder = {})
        public static class StockTransferLine {

            @Override
            public String toString() {
                return ObjectUtils.toString(this);
            }

            @XmlElement(namespace = "", name = "LineNum")
            protected Long lineNum;
            @XmlElement(namespace = "", name = "DocEntry")
            protected Long docEntry;
            @XmlElement(namespace = "", name = "ItemCode")
            protected String itemCode;
            @XmlElement(namespace = "", name = "ItemDescription")
            protected String itemDescription;
            @XmlElement(namespace = "", name = "Quantity")
            protected Double quantity;
            @XmlElement(namespace = "", name = "Price")
            protected Double price;
            @XmlElement(namespace = "", name = "Currency")
            protected String currency;
            @XmlElement(namespace = "", name = "Rate")
            protected Double rate;
            @XmlElement(namespace = "", name = "DiscountPercent")
            protected Double discountPercent;
            @XmlElement(namespace = "", name = "VendorNum")
            protected String vendorNum;
            @XmlElement(namespace = "", name = "SerialNumber")
            protected String serialNumber;
            @XmlElement(namespace = "", name = "WarehouseCode")
            protected String warehouseCode;
            @XmlElement(namespace = "", name = "FromWarehouseCode")
            protected String fromWarehouseCode;
            @XmlElement(namespace = "", name = "ProjectCode")
            protected String projectCode;
            @XmlElement(namespace = "", name = "Factor")
            protected Double factor;
            @XmlElement(namespace = "", name = "Factor2")
            protected Double factor2;
            @XmlElement(namespace = "", name = "Factor3")
            protected Double factor3;
            @XmlElement(namespace = "", name = "Factor4")
            protected Double factor4;
            @XmlElement(namespace = "", name = "DistributionRule")
            protected String distributionRule;
            @XmlElement(namespace = "", name = "DistributionRule2")
            protected String distributionRule2;
            @XmlElement(namespace = "", name = "DistributionRule3")
            protected String distributionRule3;
            @XmlElement(namespace = "", name = "DistributionRule4")
            protected String distributionRule4;
            @XmlElement(namespace = "", name = "DistributionRule5")
            protected String distributionRule5;
            @XmlElement(namespace = "", name = "UseBaseUnits")
            protected String useBaseUnits;
            @XmlElement(namespace = "", name = "MeasureUnit")
            protected String measureUnit;
            @XmlElement(namespace = "", name = "UnitsOfMeasurment")
            protected Double unitsOfMeasurment;
            @XmlElement(namespace = "", name = "BaseType")
            protected String baseType;
            @XmlElement(namespace = "", name = "BaseLine")
            protected Long baseLine;
            @XmlElement(namespace = "", name = "BaseEntry")
            protected Long baseEntry;
            @XmlElement(namespace = "", name = "UnitPrice")
            protected Double unitPrice;
            @XmlElement(namespace = "", name = "UoMEntry")
            protected Long uoMEntry;
            @XmlElement(namespace = "", name = "UoMCode")
            protected String uoMCode;
            @XmlElement(namespace = "", name = "InventoryQuantity")
            protected Double inventoryQuantity;
            @XmlElement(namespace = "", name = "RemainingOpenQuantity")
            protected Double remainingOpenQuantity;
            @XmlElement(namespace = "", name = "RemainingOpenInventoryQuantity")
            protected Double remainingOpenInventoryQuantity;
            @XmlElement(namespace = "", name = "U_IVCDone")
            protected String uivcDone;
            @XmlElement(namespace = "", name = "U_EstadoP")
            protected String uEstadoP;
            @XmlElement(namespace = "", name = "U_NWR_Base")
            protected String unwrBase;
            @XmlElement(namespace = "", name = "U_CustDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar uCustDate;
            @XmlElement(namespace = "", name = "U_NWR_QtyAllocated")
            protected Double unwrQtyAllocated;
            @XmlElement(namespace = "", name = "U_ReclamQty")
            protected Double uReclamQty;
            @XmlElement(namespace = "", name = "U_QAMark")
            protected String uqaMark;
            @XmlElement(namespace = "", name = "U_IncomingQty")
            protected Double uIncomingQty;
            @XmlElement(namespace = "", name = "U_Comments")
            protected String uComments;
            @XmlElement(namespace = "", name = "U_DI")
            protected String udi;
            @XmlElement(namespace = "", name = "U_lineNumFv")
            protected Long uLineNumFv;
            @XmlElement(namespace = "", name = "U_Images")
            protected String uImages;
            @XmlElement(namespace = "", name = "U_numPartes")
            protected Long uNumPartes;
            @XmlElement(namespace = "", name = "U_Averias")
            protected String uAverias;
            @XmlElement(namespace = "", name = "SerialNumbers")
            protected StockTransfer.StockTransferLines.StockTransferLine.SerialNumbers serialNumbers;
            @XmlElement(namespace = "", name = "BatchNumbers")
            protected StockTransfer.StockTransferLines.StockTransferLine.BatchNumbers batchNumbers;
            @XmlElement(namespace = "", name = "StockTransferLinesBinAllocations")
            protected StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations stockTransferLinesBinAllocations;

            /**
             * Obtiene el valor de la propiedad lineNum.
             *
             * @return possible object is {@link Long }
             *
             */
            public Long getLineNum() {
                return lineNum;
            }

            /**
             * Define el valor de la propiedad lineNum.
             *
             * @param value allowed object is {@link Long }
             *
             */
            public void setLineNum(Long value) {
                this.lineNum = value;
            }

            /**
             * Obtiene el valor de la propiedad docEntry.
             *
             * @return possible object is {@link Long }
             *
             */
            public Long getDocEntry() {
                return docEntry;
            }

            /**
             * Define el valor de la propiedad docEntry.
             *
             * @param value allowed object is {@link Long }
             *
             */
            public void setDocEntry(Long value) {
                this.docEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad itemCode.
             *
             * @return possible object is {@link String }
             *
             */
            public String getItemCode() {
                return itemCode;
            }

            /**
             * Define el valor de la propiedad itemCode.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setItemCode(String value) {
                this.itemCode = value;
            }

            /**
             * Obtiene el valor de la propiedad itemDescription.
             *
             * @return possible object is {@link String }
             *
             */
            public String getItemDescription() {
                return itemDescription;
            }

            /**
             * Define el valor de la propiedad itemDescription.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setItemDescription(String value) {
                this.itemDescription = value;
            }

            /**
             * Obtiene el valor de la propiedad quantity.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getQuantity() {
                return quantity;
            }

            /**
             * Define el valor de la propiedad quantity.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setQuantity(Double value) {
                this.quantity = value;
            }

            /**
             * Obtiene el valor de la propiedad price.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getPrice() {
                return price;
            }

            /**
             * Define el valor de la propiedad price.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setPrice(Double value) {
                this.price = value;
            }

            /**
             * Obtiene el valor de la propiedad currency.
             *
             * @return possible object is {@link String }
             *
             */
            public String getCurrency() {
                return currency;
            }

            /**
             * Define el valor de la propiedad currency.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setCurrency(String value) {
                this.currency = value;
            }

            /**
             * Obtiene el valor de la propiedad rate.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getRate() {
                return rate;
            }

            /**
             * Define el valor de la propiedad rate.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setRate(Double value) {
                this.rate = value;
            }

            /**
             * Obtiene el valor de la propiedad discountPercent.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getDiscountPercent() {
                return discountPercent;
            }

            /**
             * Define el valor de la propiedad discountPercent.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setDiscountPercent(Double value) {
                this.discountPercent = value;
            }

            /**
             * Obtiene el valor de la propiedad vendorNum.
             *
             * @return possible object is {@link String }
             *
             */
            public String getVendorNum() {
                return vendorNum;
            }

            /**
             * Define el valor de la propiedad vendorNum.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setVendorNum(String value) {
                this.vendorNum = value;
            }

            /**
             * Obtiene el valor de la propiedad serialNumber.
             *
             * @return possible object is {@link String }
             *
             */
            public String getSerialNumber() {
                return serialNumber;
            }

            /**
             * Define el valor de la propiedad serialNumber.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setSerialNumber(String value) {
                this.serialNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad warehouseCode.
             *
             * @return possible object is {@link String }
             *
             */
            public String getWarehouseCode() {
                return warehouseCode;
            }

            /**
             * Define el valor de la propiedad warehouseCode.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setWarehouseCode(String value) {
                this.warehouseCode = value;
            }

            /**
             * Obtiene el valor de la propiedad fromWarehouseCode.
             *
             * @return possible object is {@link String }
             *
             */
            public String getFromWarehouseCode() {
                return fromWarehouseCode;
            }

            /**
             * Define el valor de la propiedad fromWarehouseCode.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setFromWarehouseCode(String value) {
                this.fromWarehouseCode = value;
            }

            /**
             * Obtiene el valor de la propiedad projectCode.
             *
             * @return possible object is {@link String }
             *
             */
            public String getProjectCode() {
                return projectCode;
            }

            /**
             * Define el valor de la propiedad projectCode.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setProjectCode(String value) {
                this.projectCode = value;
            }

            /**
             * Obtiene el valor de la propiedad factor.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getFactor() {
                return factor;
            }

            /**
             * Define el valor de la propiedad factor.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setFactor(Double value) {
                this.factor = value;
            }

            /**
             * Obtiene el valor de la propiedad factor2.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getFactor2() {
                return factor2;
            }

            /**
             * Define el valor de la propiedad factor2.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setFactor2(Double value) {
                this.factor2 = value;
            }

            /**
             * Obtiene el valor de la propiedad factor3.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getFactor3() {
                return factor3;
            }

            /**
             * Define el valor de la propiedad factor3.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setFactor3(Double value) {
                this.factor3 = value;
            }

            /**
             * Obtiene el valor de la propiedad factor4.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getFactor4() {
                return factor4;
            }

            /**
             * Define el valor de la propiedad factor4.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setFactor4(Double value) {
                this.factor4 = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule.
             *
             * @return possible object is {@link String }
             *
             */
            public String getDistributionRule() {
                return distributionRule;
            }

            /**
             * Define el valor de la propiedad distributionRule.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setDistributionRule(String value) {
                this.distributionRule = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule2.
             *
             * @return possible object is {@link String }
             *
             */
            public String getDistributionRule2() {
                return distributionRule2;
            }

            /**
             * Define el valor de la propiedad distributionRule2.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setDistributionRule2(String value) {
                this.distributionRule2 = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule3.
             *
             * @return possible object is {@link String }
             *
             */
            public String getDistributionRule3() {
                return distributionRule3;
            }

            /**
             * Define el valor de la propiedad distributionRule3.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setDistributionRule3(String value) {
                this.distributionRule3 = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule4.
             *
             * @return possible object is {@link String }
             *
             */
            public String getDistributionRule4() {
                return distributionRule4;
            }

            /**
             * Define el valor de la propiedad distributionRule4.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setDistributionRule4(String value) {
                this.distributionRule4 = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule5.
             *
             * @return possible object is {@link String }
             *
             */
            public String getDistributionRule5() {
                return distributionRule5;
            }

            /**
             * Define el valor de la propiedad distributionRule5.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setDistributionRule5(String value) {
                this.distributionRule5 = value;
            }

            /**
             * Obtiene el valor de la propiedad useBaseUnits.
             *
             * @return possible object is {@link String }
             *
             */
            public String getUseBaseUnits() {
                return useBaseUnits;
            }

            /**
             * Define el valor de la propiedad useBaseUnits.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setUseBaseUnits(String value) {
                this.useBaseUnits = value;
            }

            /**
             * Obtiene el valor de la propiedad measureUnit.
             *
             * @return possible object is {@link String }
             *
             */
            public String getMeasureUnit() {
                return measureUnit;
            }

            /**
             * Define el valor de la propiedad measureUnit.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setMeasureUnit(String value) {
                this.measureUnit = value;
            }

            /**
             * Obtiene el valor de la propiedad unitsOfMeasurment.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getUnitsOfMeasurment() {
                return unitsOfMeasurment;
            }

            /**
             * Define el valor de la propiedad unitsOfMeasurment.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setUnitsOfMeasurment(Double value) {
                this.unitsOfMeasurment = value;
            }

            /**
             * Obtiene el valor de la propiedad baseType.
             *
             * @return possible object is {@link String }
             *
             */
            public String getBaseType() {
                return baseType;
            }

            /**
             * Define el valor de la propiedad baseType.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setBaseType(String value) {
                this.baseType = value;
            }

            /**
             * Obtiene el valor de la propiedad baseLine.
             *
             * @return possible object is {@link Long }
             *
             */
            public Long getBaseLine() {
                return baseLine;
            }

            /**
             * Define el valor de la propiedad baseLine.
             *
             * @param value allowed object is {@link Long }
             *
             */
            public void setBaseLine(Long value) {
                this.baseLine = value;
            }

            /**
             * Obtiene el valor de la propiedad baseEntry.
             *
             * @return possible object is {@link Long }
             *
             */
            public Long getBaseEntry() {
                return baseEntry;
            }

            /**
             * Define el valor de la propiedad baseEntry.
             *
             * @param value allowed object is {@link Long }
             *
             */
            public void setBaseEntry(Long value) {
                this.baseEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad unitPrice.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getUnitPrice() {
                return unitPrice;
            }

            /**
             * Define el valor de la propiedad unitPrice.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setUnitPrice(Double value) {
                this.unitPrice = value;
            }

            /**
             * Obtiene el valor de la propiedad uoMEntry.
             *
             * @return possible object is {@link Long }
             *
             */
            public Long getUoMEntry() {
                return uoMEntry;
            }

            /**
             * Define el valor de la propiedad uoMEntry.
             *
             * @param value allowed object is {@link Long }
             *
             */
            public void setUoMEntry(Long value) {
                this.uoMEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad uoMCode.
             *
             * @return possible object is {@link String }
             *
             */
            public String getUoMCode() {
                return uoMCode;
            }

            /**
             * Define el valor de la propiedad uoMCode.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setUoMCode(String value) {
                this.uoMCode = value;
            }

            /**
             * Obtiene el valor de la propiedad inventoryQuantity.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getInventoryQuantity() {
                return inventoryQuantity;
            }

            /**
             * Define el valor de la propiedad inventoryQuantity.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setInventoryQuantity(Double value) {
                this.inventoryQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad remainingOpenQuantity.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getRemainingOpenQuantity() {
                return remainingOpenQuantity;
            }

            /**
             * Define el valor de la propiedad remainingOpenQuantity.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setRemainingOpenQuantity(Double value) {
                this.remainingOpenQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad remainingOpenInventoryQuantity.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getRemainingOpenInventoryQuantity() {
                return remainingOpenInventoryQuantity;
            }

            /**
             * Define el valor de la propiedad remainingOpenInventoryQuantity.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setRemainingOpenInventoryQuantity(Double value) {
                this.remainingOpenInventoryQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad uivcDone.
             *
             * @return possible object is {@link String }
             *
             */
            public String getUIVCDone() {
                return uivcDone;
            }

            /**
             * Define el valor de la propiedad uivcDone.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setUIVCDone(String value) {
                this.uivcDone = value;
            }

            /**
             * Obtiene el valor de la propiedad uEstadoP.
             *
             * @return possible object is {@link String }
             *
             */
            public String getUEstadoP() {
                return uEstadoP;
            }

            /**
             * Define el valor de la propiedad uEstadoP.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setUEstadoP(String value) {
                this.uEstadoP = value;
            }

            /**
             * Obtiene el valor de la propiedad unwrBase.
             *
             * @return possible object is {@link String }
             *
             */
            public String getUNWRBase() {
                return unwrBase;
            }

            /**
             * Define el valor de la propiedad unwrBase.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setUNWRBase(String value) {
                this.unwrBase = value;
            }

            /**
             * Obtiene el valor de la propiedad uCustDate.
             *
             * @return possible object is {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getUCustDate() {
                return uCustDate;
            }

            /**
             * Define el valor de la propiedad uCustDate.
             *
             * @param value allowed object is {@link XMLGregorianCalendar }
             *
             */
            public void setUCustDate(XMLGregorianCalendar value) {
                this.uCustDate = value;
            }

            /**
             * Obtiene el valor de la propiedad unwrQtyAllocated.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getUNWRQtyAllocated() {
                return unwrQtyAllocated;
            }

            /**
             * Define el valor de la propiedad unwrQtyAllocated.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setUNWRQtyAllocated(Double value) {
                this.unwrQtyAllocated = value;
            }

            /**
             * Obtiene el valor de la propiedad uReclamQty.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getUReclamQty() {
                return uReclamQty;
            }

            /**
             * Define el valor de la propiedad uReclamQty.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setUReclamQty(Double value) {
                this.uReclamQty = value;
            }

            /**
             * Obtiene el valor de la propiedad uqaMark.
             *
             * @return possible object is {@link String }
             *
             */
            public String getUQAMark() {
                return uqaMark;
            }

            /**
             * Define el valor de la propiedad uqaMark.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setUQAMark(String value) {
                this.uqaMark = value;
            }

            /**
             * Obtiene el valor de la propiedad uIncomingQty.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getUIncomingQty() {
                return uIncomingQty;
            }

            /**
             * Define el valor de la propiedad uIncomingQty.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setUIncomingQty(Double value) {
                this.uIncomingQty = value;
            }

            /**
             * Obtiene el valor de la propiedad uComments.
             *
             * @return possible object is {@link String }
             *
             */
            public String getUComments() {
                return uComments;
            }

            /**
             * Define el valor de la propiedad uComments.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setUComments(String value) {
                this.uComments = value;
            }

            /**
             * Obtiene el valor de la propiedad udi.
             *
             * @return possible object is {@link String }
             *
             */
            public String getUDI() {
                return udi;
            }

            /**
             * Define el valor de la propiedad udi.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setUDI(String value) {
                this.udi = value;
            }

            /**
             * Obtiene el valor de la propiedad uLineNumFv.
             *
             * @return possible object is {@link Long }
             *
             */
            public Long getULineNumFv() {
                return uLineNumFv;
            }

            /**
             * Define el valor de la propiedad uLineNumFv.
             *
             * @param value allowed object is {@link Long }
             *
             */
            public void setULineNumFv(Long value) {
                this.uLineNumFv = value;
            }

            /**
             * Obtiene el valor de la propiedad uImages.
             *
             * @return possible object is {@link String }
             *
             */
            public String getUImages() {
                return uImages;
            }

            /**
             * Define el valor de la propiedad uImages.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setUImages(String value) {
                this.uImages = value;
            }

            /**
             * Obtiene el valor de la propiedad uNumPartes.
             *
             * @return possible object is {@link Long }
             *
             */
            public Long getUNumPartes() {
                return uNumPartes;
            }

            /**
             * Define el valor de la propiedad uNumPartes.
             *
             * @param value allowed object is {@link Long }
             *
             */
            public void setUNumPartes(Long value) {
                this.uNumPartes = value;
            }

            /**
             * Obtiene el valor de la propiedad uAverias.
             *
             * @return possible object is {@link String }
             *
             */
            public String getUAverias() {
                return uAverias;
            }

            /**
             * Define el valor de la propiedad uAverias.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setUAverias(String value) {
                this.uAverias = value;
            }

            /**
             * Obtiene el valor de la propiedad serialNumbers.
             *
             * @return possible object is
             *     {@link StockTransfer.StockTransferLines.StockTransferLine.SerialNumbers }
             *
             */
            public StockTransfer.StockTransferLines.StockTransferLine.SerialNumbers getSerialNumbers() {
                return serialNumbers;
            }

            /**
             * Define el valor de la propiedad serialNumbers.
             *
             * @param value allowed object is
             *     {@link StockTransfer.StockTransferLines.StockTransferLine.SerialNumbers }
             *
             */
            public void setSerialNumbers(StockTransfer.StockTransferLines.StockTransferLine.SerialNumbers value) {
                this.serialNumbers = value;
            }

            /**
             * Obtiene el valor de la propiedad batchNumbers.
             *
             * @return possible object is
             *     {@link StockTransfer.StockTransferLines.StockTransferLine.BatchNumbers }
             *
             */
            public StockTransfer.StockTransferLines.StockTransferLine.BatchNumbers getBatchNumbers() {
                return batchNumbers;
            }

            /**
             * Define el valor de la propiedad batchNumbers.
             *
             * @param value allowed object is
             *     {@link StockTransfer.StockTransferLines.StockTransferLine.BatchNumbers }
             *
             */
            public void setBatchNumbers(StockTransfer.StockTransferLines.StockTransferLine.BatchNumbers value) {
                this.batchNumbers = value;
            }

            /**
             * Obtiene el valor de la propiedad
             * stockTransferLinesBinAllocations.
             *
             * @return possible object is
             *     {@link StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations }
             *
             */
            public StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations getStockTransferLinesBinAllocations() {
                return stockTransferLinesBinAllocations;
            }

            /**
             * Define el valor de la propiedad stockTransferLinesBinAllocations.
             *
             * @param value allowed object is
             *     {@link StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations }
             *
             */
            public void setStockTransferLinesBinAllocations(StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations value) {
                this.stockTransferLinesBinAllocations = value;
            }

            /**
             * <p>
             * Clase Java para anonymous complex type.
             *
             * <p>
             * El siguiente fragmento de esquema especifica el contenido que se
             * espera que haya en esta clase.
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
                protected List<StockTransfer.StockTransferLines.StockTransferLine.BatchNumbers.BatchNumber> batchNumber;

                /**
                 * Gets the value of the batchNumber property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the
                 * batchNumber property.
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
                 * {@link StockTransfer.StockTransferLines.StockTransferLine.BatchNumbers.BatchNumber }
                 *
                 *
                 */
                public List<StockTransfer.StockTransferLines.StockTransferLine.BatchNumbers.BatchNumber> getBatchNumber() {
                    if (batchNumber == null) {
                        batchNumber = new ArrayList<StockTransfer.StockTransferLines.StockTransferLine.BatchNumbers.BatchNumber>();
                    }
                    return this.batchNumber;
                }

                /**
                 * <p>
                 * Clase Java para anonymous complex type.
                 *
                 * <p>
                 * El siguiente fragmento de esquema especifica el contenido que
                 * se espera que haya en esta clase.
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
                @XmlType(name = "", propOrder = {})
                public static class BatchNumber {

                    @XmlElement(namespace = "", name = "BatchNumber")
                    protected String batchNumber;
                    @XmlElement(namespace = "", name = "ManufacturerSerialNumber")
                    protected String manufacturerSerialNumber;
                    @XmlElement(namespace = "", name = "InternalSerialNumber")
                    protected String internalSerialNumber;
                    @XmlElement(namespace = "", name = "ExpiryDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar expiryDate;
                    @XmlElement(namespace = "", name = "ManufacturingDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar manufacturingDate;
                    @XmlElement(namespace = "", name = "AddmisionDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar addmisionDate;
                    @XmlElement(namespace = "", name = "Location")
                    protected String location;
                    @XmlElement(namespace = "", name = "Notes")
                    protected String notes;
                    @XmlElement(namespace = "", name = "Quantity")
                    protected Double quantity;
                    @XmlElement(namespace = "", name = "BaseLineNumber")
                    protected Long baseLineNumber;
                    @XmlElement(namespace = "", name = "TrackingNote")
                    protected Long trackingNote;
                    @XmlElement(namespace = "", name = "TrackingNoteLine")
                    protected Long trackingNoteLine;

                    /**
                     * Obtiene el valor de la propiedad batchNumber.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getBatchNumber() {
                        return batchNumber;
                    }

                    /**
                     * Define el valor de la propiedad batchNumber.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setBatchNumber(String value) {
                        this.batchNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad
                     * manufacturerSerialNumber.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getManufacturerSerialNumber() {
                        return manufacturerSerialNumber;
                    }

                    /**
                     * Define el valor de la propiedad manufacturerSerialNumber.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setManufacturerSerialNumber(String value) {
                        this.manufacturerSerialNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad internalSerialNumber.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getInternalSerialNumber() {
                        return internalSerialNumber;
                    }

                    /**
                     * Define el valor de la propiedad internalSerialNumber.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setInternalSerialNumber(String value) {
                        this.internalSerialNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad expiryDate.
                     *
                     * @return possible object is {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getExpiryDate() {
                        return expiryDate;
                    }

                    /**
                     * Define el valor de la propiedad expiryDate.
                     *
                     * @param value allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setExpiryDate(XMLGregorianCalendar value) {
                        this.expiryDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad manufacturingDate.
                     *
                     * @return possible object is {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getManufacturingDate() {
                        return manufacturingDate;
                    }

                    /**
                     * Define el valor de la propiedad manufacturingDate.
                     *
                     * @param value allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setManufacturingDate(XMLGregorianCalendar value) {
                        this.manufacturingDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad addmisionDate.
                     *
                     * @return possible object is {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getAddmisionDate() {
                        return addmisionDate;
                    }

                    /**
                     * Define el valor de la propiedad addmisionDate.
                     *
                     * @param value allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setAddmisionDate(XMLGregorianCalendar value) {
                        this.addmisionDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad location.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getLocation() {
                        return location;
                    }

                    /**
                     * Define el valor de la propiedad location.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setLocation(String value) {
                        this.location = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad notes.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getNotes() {
                        return notes;
                    }

                    /**
                     * Define el valor de la propiedad notes.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setNotes(String value) {
                        this.notes = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad quantity.
                     *
                     * @return possible object is {@link Double }
                     *
                     */
                    public Double getQuantity() {
                        return quantity;
                    }

                    /**
                     * Define el valor de la propiedad quantity.
                     *
                     * @param value allowed object is {@link Double }
                     *
                     */
                    public void setQuantity(Double value) {
                        this.quantity = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad baseLineNumber.
                     *
                     * @return possible object is {@link Long }
                     *
                     */
                    public Long getBaseLineNumber() {
                        return baseLineNumber;
                    }

                    /**
                     * Define el valor de la propiedad baseLineNumber.
                     *
                     * @param value allowed object is {@link Long }
                     *
                     */
                    public void setBaseLineNumber(Long value) {
                        this.baseLineNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad trackingNote.
                     *
                     * @return possible object is {@link Long }
                     *
                     */
                    public Long getTrackingNote() {
                        return trackingNote;
                    }

                    /**
                     * Define el valor de la propiedad trackingNote.
                     *
                     * @param value allowed object is {@link Long }
                     *
                     */
                    public void setTrackingNote(Long value) {
                        this.trackingNote = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad trackingNoteLine.
                     *
                     * @return possible object is {@link Long }
                     *
                     */
                    public Long getTrackingNoteLine() {
                        return trackingNoteLine;
                    }

                    /**
                     * Define el valor de la propiedad trackingNoteLine.
                     *
                     * @param value allowed object is {@link Long }
                     *
                     */
                    public void setTrackingNoteLine(Long value) {
                        this.trackingNoteLine = value;
                    }

                }

            }

            /**
             * <p>
             * Clase Java para anonymous complex type.
             *
             * <p>
             * El siguiente fragmento de esquema especifica el contenido que se
             * espera que haya en esta clase.
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
                protected List<StockTransfer.StockTransferLines.StockTransferLine.SerialNumbers.SerialNumber> serialNumber;

                /**
                 * Gets the value of the serialNumber property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the
                 * serialNumber property.
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
                 * {@link StockTransfer.StockTransferLines.StockTransferLine.SerialNumbers.SerialNumber }
                 *
                 *
                 */
                public List<StockTransfer.StockTransferLines.StockTransferLine.SerialNumbers.SerialNumber> getSerialNumber() {
                    if (serialNumber == null) {
                        serialNumber = new ArrayList<StockTransfer.StockTransferLines.StockTransferLine.SerialNumbers.SerialNumber>();
                    }
                    return this.serialNumber;
                }

                /**
                 * <p>
                 * Clase Java para anonymous complex type.
                 *
                 * <p>
                 * El siguiente fragmento de esquema especifica el contenido que
                 * se espera que haya en esta clase.
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
                @XmlType(name = "", propOrder = {})
                public static class SerialNumber {

                    @XmlElement(namespace = "", name = "ManufacturerSerialNumber")
                    protected String manufacturerSerialNumber;
                    @XmlElement(namespace = "", name = "InternalSerialNumber")
                    protected String internalSerialNumber;
                    @XmlElement(namespace = "", name = "ExpiryDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar expiryDate;
                    @XmlElement(namespace = "", name = "ManufactureDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar manufactureDate;
                    @XmlElement(namespace = "", name = "ReceptionDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar receptionDate;
                    @XmlElement(namespace = "", name = "WarrantyStart")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar warrantyStart;
                    @XmlElement(namespace = "", name = "WarrantyEnd")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar warrantyEnd;
                    @XmlElement(namespace = "", name = "Location")
                    protected String location;
                    @XmlElement(namespace = "", name = "Notes")
                    protected String notes;
                    @XmlElement(namespace = "", name = "BatchID")
                    protected String batchID;
                    @XmlElement(namespace = "", name = "SystemSerialNumber")
                    protected Long systemSerialNumber;
                    @XmlElement(namespace = "", name = "BaseLineNumber")
                    protected Long baseLineNumber;
                    @XmlElement(namespace = "", name = "Quantity")
                    protected Double quantity;
                    @XmlElement(namespace = "", name = "TrackingNote")
                    protected Long trackingNote;
                    @XmlElement(namespace = "", name = "TrackingNoteLine")
                    protected Long trackingNoteLine;

                    /**
                     * Obtiene el valor de la propiedad
                     * manufacturerSerialNumber.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getManufacturerSerialNumber() {
                        return manufacturerSerialNumber;
                    }

                    /**
                     * Define el valor de la propiedad manufacturerSerialNumber.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setManufacturerSerialNumber(String value) {
                        this.manufacturerSerialNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad internalSerialNumber.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getInternalSerialNumber() {
                        return internalSerialNumber;
                    }

                    /**
                     * Define el valor de la propiedad internalSerialNumber.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setInternalSerialNumber(String value) {
                        this.internalSerialNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad expiryDate.
                     *
                     * @return possible object is {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getExpiryDate() {
                        return expiryDate;
                    }

                    /**
                     * Define el valor de la propiedad expiryDate.
                     *
                     * @param value allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setExpiryDate(XMLGregorianCalendar value) {
                        this.expiryDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad manufactureDate.
                     *
                     * @return possible object is {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getManufactureDate() {
                        return manufactureDate;
                    }

                    /**
                     * Define el valor de la propiedad manufactureDate.
                     *
                     * @param value allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setManufactureDate(XMLGregorianCalendar value) {
                        this.manufactureDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad receptionDate.
                     *
                     * @return possible object is {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getReceptionDate() {
                        return receptionDate;
                    }

                    /**
                     * Define el valor de la propiedad receptionDate.
                     *
                     * @param value allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setReceptionDate(XMLGregorianCalendar value) {
                        this.receptionDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad warrantyStart.
                     *
                     * @return possible object is {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getWarrantyStart() {
                        return warrantyStart;
                    }

                    /**
                     * Define el valor de la propiedad warrantyStart.
                     *
                     * @param value allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setWarrantyStart(XMLGregorianCalendar value) {
                        this.warrantyStart = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad warrantyEnd.
                     *
                     * @return possible object is {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getWarrantyEnd() {
                        return warrantyEnd;
                    }

                    /**
                     * Define el valor de la propiedad warrantyEnd.
                     *
                     * @param value allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setWarrantyEnd(XMLGregorianCalendar value) {
                        this.warrantyEnd = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad location.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getLocation() {
                        return location;
                    }

                    /**
                     * Define el valor de la propiedad location.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setLocation(String value) {
                        this.location = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad notes.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getNotes() {
                        return notes;
                    }

                    /**
                     * Define el valor de la propiedad notes.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setNotes(String value) {
                        this.notes = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad batchID.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getBatchID() {
                        return batchID;
                    }

                    /**
                     * Define el valor de la propiedad batchID.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setBatchID(String value) {
                        this.batchID = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad systemSerialNumber.
                     *
                     * @return possible object is {@link Long }
                     *
                     */
                    public Long getSystemSerialNumber() {
                        return systemSerialNumber;
                    }

                    /**
                     * Define el valor de la propiedad systemSerialNumber.
                     *
                     * @param value allowed object is {@link Long }
                     *
                     */
                    public void setSystemSerialNumber(Long value) {
                        this.systemSerialNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad baseLineNumber.
                     *
                     * @return possible object is {@link Long }
                     *
                     */
                    public Long getBaseLineNumber() {
                        return baseLineNumber;
                    }

                    /**
                     * Define el valor de la propiedad baseLineNumber.
                     *
                     * @param value allowed object is {@link Long }
                     *
                     */
                    public void setBaseLineNumber(Long value) {
                        this.baseLineNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad quantity.
                     *
                     * @return possible object is {@link Double }
                     *
                     */
                    public Double getQuantity() {
                        return quantity;
                    }

                    /**
                     * Define el valor de la propiedad quantity.
                     *
                     * @param value allowed object is {@link Double }
                     *
                     */
                    public void setQuantity(Double value) {
                        this.quantity = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad trackingNote.
                     *
                     * @return possible object is {@link Long }
                     *
                     */
                    public Long getTrackingNote() {
                        return trackingNote;
                    }

                    /**
                     * Define el valor de la propiedad trackingNote.
                     *
                     * @param value allowed object is {@link Long }
                     *
                     */
                    public void setTrackingNote(Long value) {
                        this.trackingNote = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad trackingNoteLine.
                     *
                     * @return possible object is {@link Long }
                     *
                     */
                    public Long getTrackingNoteLine() {
                        return trackingNoteLine;
                    }

                    /**
                     * Define el valor de la propiedad trackingNoteLine.
                     *
                     * @param value allowed object is {@link Long }
                     *
                     */
                    public void setTrackingNoteLine(Long value) {
                        this.trackingNoteLine = value;
                    }

                }

            }

            /**
             * <p>
             * Clase Java para anonymous complex type.
             *
             * <p>
             * El siguiente fragmento de esquema especifica el contenido que se
             * espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="StockTransferLinesBinAllocation" maxOccurs="unbounded" minOccurs="0">
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
             *                   &lt;element name="BinActionType" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value="batToWarehouse"/>
             *                         &lt;enumeration value="batFromWarehouse"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
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
                "stockTransferLinesBinAllocation"
            })
            public static class StockTransferLinesBinAllocations {

                @Override
                public String toString() {
                    return ObjectUtils.toString(this);
                }

                @XmlElement(name = "StockTransferLinesBinAllocation")
                protected List<StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations.StockTransferLinesBinAllocation> stockTransferLinesBinAllocation;

                /**
                 * Gets the value of the stockTransferLinesBinAllocation
                 * property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the
                 * stockTransferLinesBinAllocation property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getStockTransferLinesBinAllocation().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations.StockTransferLinesBinAllocation }
                 *
                 *
                 */
                public List<StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations.StockTransferLinesBinAllocation> getStockTransferLinesBinAllocation() {
                    if (stockTransferLinesBinAllocation == null) {
                        stockTransferLinesBinAllocation = new ArrayList<StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations.StockTransferLinesBinAllocation>();
                    }
                    return this.stockTransferLinesBinAllocation;
                }

                /**
                 * <p>
                 * Clase Java para anonymous complex type.
                 *
                 * <p>
                 * El siguiente fragmento de esquema especifica el contenido que
                 * se espera que haya en esta clase.
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
                 *         &lt;element name="BinActionType" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value="batToWarehouse"/>
                 *               &lt;enumeration value="batFromWarehouse"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
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
                @XmlType(name = "", propOrder = {})
                public static class StockTransferLinesBinAllocation {

                    @Override
                    public String toString() {
                        return ObjectUtils.toString(this);
                    }

                    @XmlElement(namespace = "", name = "BinAbsEntry")
                    protected Long binAbsEntry;
                    @XmlElement(namespace = "", name = "Quantity")
                    protected Double quantity;
                    @XmlElement(namespace = "", name = "AllowNegativeQuantity")
                    protected String allowNegativeQuantity;
                    @XmlElement(namespace = "", name = "SerialAndBatchNumbersBaseLine")
                    protected Long serialAndBatchNumbersBaseLine;
                    @XmlElement(namespace = "", name = "BinActionType")
                    protected String binActionType;
                    @XmlElement(namespace = "", name = "BaseLineNumber")
                    protected Long baseLineNumber;

                    /**
                     * Obtiene el valor de la propiedad binAbsEntry.
                     *
                     * @return possible object is {@link Long }
                     *
                     */
                    public Long getBinAbsEntry() {
                        return binAbsEntry;
                    }

                    /**
                     * Define el valor de la propiedad binAbsEntry.
                     *
                     * @param value allowed object is {@link Long }
                     *
                     */
                    public void setBinAbsEntry(Long value) {
                        this.binAbsEntry = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad quantity.
                     *
                     * @return possible object is {@link Double }
                     *
                     */
                    public Double getQuantity() {
                        return quantity;
                    }

                    /**
                     * Define el valor de la propiedad quantity.
                     *
                     * @param value allowed object is {@link Double }
                     *
                     */
                    public void setQuantity(Double value) {
                        this.quantity = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad allowNegativeQuantity.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getAllowNegativeQuantity() {
                        return allowNegativeQuantity;
                    }

                    /**
                     * Define el valor de la propiedad allowNegativeQuantity.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setAllowNegativeQuantity(String value) {
                        this.allowNegativeQuantity = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad
                     * serialAndBatchNumbersBaseLine.
                     *
                     * @return possible object is {@link Long }
                     *
                     */
                    public Long getSerialAndBatchNumbersBaseLine() {
                        return serialAndBatchNumbersBaseLine;
                    }

                    /**
                     * Define el valor de la propiedad
                     * serialAndBatchNumbersBaseLine.
                     *
                     * @param value allowed object is {@link Long }
                     *
                     */
                    public void setSerialAndBatchNumbersBaseLine(Long value) {
                        this.serialAndBatchNumbersBaseLine = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad binActionType.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getBinActionType() {
                        return binActionType;
                    }

                    /**
                     * Define el valor de la propiedad binActionType.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setBinActionType(String value) {
                        this.binActionType = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad baseLineNumber.
                     *
                     * @return possible object is {@link Long }
                     *
                     */
                    public Long getBaseLineNumber() {
                        return baseLineNumber;
                    }

                    /**
                     * Define el valor de la propiedad baseLineNumber.
                     *
                     * @param value allowed object is {@link Long }
                     *
                     */
                    public void setBaseLineNumber(Long value) {
                        this.baseLineNumber = value;
                    }

                }

            }

        }

    }

    /**
     * <p>
     * Clase Java para anonymous complex type.
     *
     * <p>
     * El siguiente fragmento de esquema especifica el contenido que se espera
     * que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="SupportVAT" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="tNO"/>
     *               &lt;enumeration value="tYES"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FormNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TransactionCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {})
    public static class StockTransferTaxExtension {

        @XmlElement(namespace = "", name = "SupportVAT")
        protected String supportVAT;
        @XmlElement(namespace = "", name = "FormNumber")
        protected String formNumber;
        @XmlElement(namespace = "", name = "TransactionCategory")
        protected String transactionCategory;

        /**
         * Obtiene el valor de la propiedad supportVAT.
         *
         * @return possible object is {@link String }
         *
         */
        public String getSupportVAT() {
            return supportVAT;
        }

        /**
         * Define el valor de la propiedad supportVAT.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setSupportVAT(String value) {
            this.supportVAT = value;
        }

        /**
         * Obtiene el valor de la propiedad formNumber.
         *
         * @return possible object is {@link String }
         *
         */
        public String getFormNumber() {
            return formNumber;
        }

        /**
         * Define el valor de la propiedad formNumber.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setFormNumber(String value) {
            this.formNumber = value;
        }

        /**
         * Obtiene el valor de la propiedad transactionCategory.
         *
         * @return possible object is {@link String }
         *
         */
        public String getTransactionCategory() {
            return transactionCategory;
        }

        /**
         * Define el valor de la propiedad transactionCategory.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setTransactionCategory(String value) {
            this.transactionCategory = value;
        }

    }

}
