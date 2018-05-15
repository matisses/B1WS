
package co.matisses.b1ws.items;

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
 *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemsGroupCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomsGroupCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesVATGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VatLiable" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PurchaseItem" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SalesItem" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InventoryItem" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IncomeAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExemptIncomeAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpanseAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mainsupplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierCatalogNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesiredInventory" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MinInventory" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Picture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User_Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommissionPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CommissionSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CommissionGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
 *         &lt;element name="AssetItem" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DataExportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="QuantityOnStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="QuantityOrderedFromVendors" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="QuantityOrderedByCustomers" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ManageSerialNumbers" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ManageBatchNumbers" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Valid" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ValidRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Frozen" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FrozenFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FrozenTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FrozenRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesItemsPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SalesPackagingUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesQtyPerPackUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SalesUnitLength" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SalesLengthUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesUnitWidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SalesWidthUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesUnitHeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SalesHeightUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesUnitVolume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SalesVolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesUnitWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SalesWeightUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PurchaseUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseItemsPerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PurchasePackagingUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseQtyPerPackUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PurchaseUnitLength" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PurchaseLengthUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PurchaseUnitWidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PurchaseWidthUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PurchaseUnitHeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PurchaseHeightUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PurchaseUnitVolume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PurchaseVolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PurchaseUnitWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PurchaseWeightUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PurchaseVATGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesFactor1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SalesFactor2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SalesFactor3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SalesFactor4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PurchaseFactor1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PurchaseFactor2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PurchaseFactor3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PurchaseFactor4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MovingAveragePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ForeignRevenuesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ECRevenuesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignExpensesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ECExpensesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvgStdPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DefaultWarehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GLMethod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="glm_WH"/>
 *               &lt;enumeration value="glm_ItemClass"/>
 *               &lt;enumeration value="glm_ItemLevel"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
 *         &lt;element name="MaxInventory" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ManageStockByWarehouse" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PurchaseHeightUnit1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PurchaseUnitHeight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PurchaseLengthUnit1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PurchaseUnitLength1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PurchaseWeightUnit1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PurchaseUnitWeight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PurchaseWidthUnit1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PurchaseUnitWidth1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SalesHeightUnit1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesUnitHeight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SalesLengthUnit1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesUnitLength1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SalesWeightUnit1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesUnitWeight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SalesWidthUnit1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesUnitWidth1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ForceSelectionOfSerialNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ManageSerialNumbersOnReleaseOnly" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WTLiable" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CostAccountingMethod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="bis_MovingAverage"/>
 *               &lt;enumeration value="bis_Standard"/>
 *               &lt;enumeration value="bis_FIFO"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SWW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantyTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndirectTax" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ArTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemCountryOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssueMethod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="im_Backflush"/>
 *               &lt;enumeration value="im_Manual"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SRIAndBatchManageMethod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="bomm_OnEveryTransaction"/>
 *               &lt;enumeration value="bomm_OnReleaseOnly"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IsPhantom" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InventoryUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlanningSystem" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="bop_MRP"/>
 *               &lt;enumeration value="bop_None"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProcurementMethod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="bom_Buy"/>
 *               &lt;enumeration value="bom_Make"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OrderIntervals" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OrderMultiple" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LeadTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MinOrderQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ItemType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="itItems"/>
 *               &lt;enumeration value="itLabor"/>
 *               &lt;enumeration value="itTravel"/>
 *               &lt;enumeration value="itFixedAssets"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ItemClass" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="itcService"/>
 *               &lt;enumeration value="itcMaterial"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OutgoingServiceCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IncomingServiceCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ServiceGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NCMCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MaterialType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="mt_GoodsForReseller"/>
 *               &lt;enumeration value="mt_FinishedGoods"/>
 *               &lt;enumeration value="mt_GoodsInProcess"/>
 *               &lt;enumeration value="mt_RawMaterial"/>
 *               &lt;enumeration value="mt_Package"/>
 *               &lt;enumeration value="mt_SubProduct"/>
 *               &lt;enumeration value="mt_IntermediateMaterial"/>
 *               &lt;enumeration value="mt_ConsumerMaterial"/>
 *               &lt;enumeration value="mt_FixedAsset"/>
 *               &lt;enumeration value="mt_Service"/>
 *               &lt;enumeration value="mt_OtherInput"/>
 *               &lt;enumeration value="mt_Other"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MaterialGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProductSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Properties1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties7" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties8" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties9" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties10" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties11" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties12" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties13" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties14" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties15" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties16" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties17" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties18" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties19" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties20" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties21" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties22" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties23" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties24" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties25" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties26" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties27" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties28" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties29" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties30" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties31" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties32" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties33" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties34" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties35" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties36" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties37" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties38" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties39" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties40" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties41" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties42" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties43" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties44" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties45" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties46" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties47" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties48" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties49" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties50" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties51" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties52" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties53" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties54" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties55" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties56" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties57" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties58" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties59" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties60" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties61" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties62" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties63" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Properties64" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AutoCreateSerialNumbersOnRelease" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DNFEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GTSItemSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GTSItemTaxCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FuelID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BeverageTableCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeverageGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeverageCommercialBrandCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Series" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ToleranceDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TypeOfAdvancedRules" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="toarGeneral"/>
 *               &lt;enumeration value="toarWarehouse"/>
 *               &lt;enumeration value="toarItemGroup"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IssuePrimarilyBy" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ipbSerialAndBatchNumbers"/>
 *               &lt;enumeration value="ipbBinLocations"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NoDiscounts" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AssetClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InventoryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Technician" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Employee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AssetStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="New"/>
 *               &lt;enumeration value="Active"/>
 *               &lt;enumeration value="Inactive"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CapitalizationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StatisticalAsset" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Cession" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeactivateAfterUsefulLife" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ManageByQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UoMGroupEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InventoryUoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DefaultSalesUoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DefaultPurchasingUoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DepreciationGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemPrices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ItemPrice" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AdditionalPrice1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AdditionalCurrency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AdditionalPrice2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AdditionalCurrency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="UoMPrices" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="UoMPrice" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="ReduceBy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="AdditionalReduceBy1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="AdditionalPrice1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="AdditionalCurrency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="AdditionalReduceBy2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="AdditionalPrice2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="AdditionalCurrency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Auto" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="tNO"/>
 *                                                       &lt;enumeration value="tYES"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
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
 *         &lt;element name="ItemWarehouseInfoCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ItemWarehouseInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="MinimalStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="MaximalStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="MinimalOrder" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="StandardAveragePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Locked" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="InventoryAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CostAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TransferAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RevenuesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="VarienceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DecreasingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="IncreasingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ReturningAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ExpensesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EURevenuesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EUExpensesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ForeignRevenueAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ForeignExpensAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ExemptIncomeAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PriceDifferenceAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Committed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="CountedQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="WasCounted" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="UserSignature" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Counted" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="ExpenseClearingAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EUPurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ForeignPurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SalesCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SalesCreditEUAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ExemptedCredits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SalesCreditForeignAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ExpenseOffsettingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WipAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ExchangeRateDifferencesAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GoodsClearingAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NegativeInventoryAdjustmentAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CostInflationOffsetAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GLDecreaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GLIncreaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PAReturnAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PurchaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PurchaseOffsetAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ShippedGoodsAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="StockInflationOffsetAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="StockInflationAdjustAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="VATInRevenueAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WipVarianceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CostInflationAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WHIncomingCenvatAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WHOutgoingCenvatAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="StockInTransitAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WipOffsetProfitAndLossAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InventoryOffsetProfitAndLossAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DefaultBin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="DefaultBinEnforced" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PurchaseBalanceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ItemCycleCounts" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ItemCycleCount" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="CycleCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="Alert" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="tNO"/>
 *                                                       &lt;enumeration value="tYES"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NextCountingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="AlertTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *                                                 &lt;element name="DestinationUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="ItemPreferredVendors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ItemPreferredVendor" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="BPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="ItemLocalizationInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ItemLocalizationInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="IncomeNature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="ItemProjects" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ItemProject" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="ItemDistributionRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ItemDistributionRule" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="ItemAttributeGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ItemAttributeGroups" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="Attribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Attribute33" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Attribute34" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Attribute35" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Attribute36" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Attribute37" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Attribute38" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Attribute39" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Attribute40" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Attribute41" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Attribute42" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Attribute43" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="Attribute44" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="Attribute45" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="Attribute46" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="Attribute47" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="Attribute48" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Attribute49" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Attribute50" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Attribute51" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Attribute52" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Attribute53" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Attribute54" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Attribute55" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Attribute56" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Attribute57" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Attribute58" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Attribute59" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Attribute60" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Attribute61" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Attribute62" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Attribute63" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Attribute64" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
 *         &lt;element name="ItemDepreciationParameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ItemDepreciationParameter" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="FiscalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DepreciationArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DepreciationStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="DepreciationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="UsefulLife" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="RemainingLife" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="DepreciationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="ItemPeriodControls" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ItemPeriodControl" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="FiscalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DepreciationArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SubPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="DepreciationStatus" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="tNO"/>
 *                                   &lt;enumeration value="tYES"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
 *         &lt;element name="ItemUnitOfMeasurementCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ItemUnitOfMeasurement" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="UoMType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="iutPurchasing"/>
 *                                   &lt;enumeration value="iutSales"/>
 *                                   &lt;enumeration value="iutInventory"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="DefaultBarcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="DefaultPackage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Length1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Length1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Length2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Length2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Height1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="ItemUoMPackageCollection" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ItemUoMPackage" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="UoMType" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="iutPurchasing"/>
 *                                                       &lt;enumeration value="iutSales"/>
 *                                                       &lt;enumeration value="iutInventory"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="PackageTypeEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="Length1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="Length1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="Length2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="Length2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="Height1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="QuantityPerPackage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
 *         &lt;element name="ItemBarCodeCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ItemBarCode" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="AbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="Barcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FreeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="ItemIntrastatExtension" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CommodityCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="SupplementaryUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="FactorOfSupplementaryUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="ImportRegionState" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="ExportRegionState" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="ImportNatureOfTransaction" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="ExportNatureOfTransaction" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="ImportStatisticalProcedure" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="ExportStatisticalProcedure" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="CountryOfOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="Type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="dDocument_Items"/>
 *                         &lt;enumeration value="dDocument_Service"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ServiceSupplyMethod" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="ssmImmediate"/>
 *                         &lt;enumeration value="ssmToMoreResumptions"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ServicePaymentMethod" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="spmAccreditedToBankAccount"/>
 *                         &lt;enumeration value="spmBankTransfer"/>
 *                         &lt;enumeration value="spmOther"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ImportRegionCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ExportRegionCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UseWeightInCalculation" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="tNO"/>
 *                         &lt;enumeration value="tYES"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="IntrastatRelevant" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="tNO"/>
 *                         &lt;enumeration value="tYES"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="StatisticalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "Item")
public class Item {

    @XmlElement(name = "ItemCode")
    protected String itemCode;
    @XmlElement(name = "ItemName")
    protected String itemName;
    @XmlElement(name = "ForeignName")
    protected String foreignName;
    @XmlElement(name = "ItemsGroupCode")
    protected Long itemsGroupCode;
    @XmlElement(name = "CustomsGroupCode")
    protected Long customsGroupCode;
    @XmlElement(name = "SalesVATGroup")
    protected String salesVATGroup;
    @XmlElement(name = "BarCode")
    protected String barCode;
    @XmlElement(name = "VatLiable")
    protected String vatLiable;
    @XmlElement(name = "PurchaseItem")
    protected String purchaseItem;
    @XmlElement(name = "SalesItem")
    protected String salesItem;
    @XmlElement(name = "InventoryItem")
    protected String inventoryItem;
    @XmlElement(name = "IncomeAccount")
    protected String incomeAccount;
    @XmlElement(name = "ExemptIncomeAccount")
    protected String exemptIncomeAccount;
    @XmlElement(name = "ExpanseAccount")
    protected String expanseAccount;
    @XmlElement(name = "Mainsupplier")
    protected String mainsupplier;
    @XmlElement(name = "SupplierCatalogNo")
    protected String supplierCatalogNo;
    @XmlElement(name = "DesiredInventory")
    protected Double desiredInventory;
    @XmlElement(name = "MinInventory")
    protected Double minInventory;
    @XmlElement(name = "Picture")
    protected String picture;
    @XmlElement(name = "User_Text")
    protected String userText;
    @XmlElement(name = "SerialNum")
    protected String serialNum;
    @XmlElement(name = "CommissionPercent")
    protected Double commissionPercent;
    @XmlElement(name = "CommissionSum")
    protected Double commissionSum;
    @XmlElement(name = "CommissionGroup")
    protected Long commissionGroup;
    @XmlElement(name = "TreeType")
    protected String treeType;
    @XmlElement(name = "AssetItem")
    protected String assetItem;
    @XmlElement(name = "DataExportCode")
    protected String dataExportCode;
    @XmlElement(name = "Manufacturer")
    protected Long manufacturer;
    @XmlElement(name = "QuantityOnStock")
    protected Double quantityOnStock;
    @XmlElement(name = "QuantityOrderedFromVendors")
    protected Double quantityOrderedFromVendors;
    @XmlElement(name = "QuantityOrderedByCustomers")
    protected Double quantityOrderedByCustomers;
    @XmlElement(name = "ManageSerialNumbers")
    protected String manageSerialNumbers;
    @XmlElement(name = "ManageBatchNumbers")
    protected String manageBatchNumbers;
    @XmlElement(name = "Valid")
    protected String valid;
    @XmlElement(name = "ValidFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validFrom;
    @XmlElement(name = "ValidTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validTo;
    @XmlElement(name = "ValidRemarks")
    protected String validRemarks;
    @XmlElement(name = "Frozen")
    protected String frozen;
    @XmlElement(name = "FrozenFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frozenFrom;
    @XmlElement(name = "FrozenTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frozenTo;
    @XmlElement(name = "FrozenRemarks")
    protected String frozenRemarks;
    @XmlElement(name = "SalesUnit")
    protected String salesUnit;
    @XmlElement(name = "SalesItemsPerUnit")
    protected Double salesItemsPerUnit;
    @XmlElement(name = "SalesPackagingUnit")
    protected String salesPackagingUnit;
    @XmlElement(name = "SalesQtyPerPackUnit")
    protected Double salesQtyPerPackUnit;
    @XmlElement(name = "SalesUnitLength")
    protected Double salesUnitLength;
    @XmlElement(name = "SalesLengthUnit")
    protected Long salesLengthUnit;
    @XmlElement(name = "SalesUnitWidth")
    protected Double salesUnitWidth;
    @XmlElement(name = "SalesWidthUnit")
    protected Long salesWidthUnit;
    @XmlElement(name = "SalesUnitHeight")
    protected Double salesUnitHeight;
    @XmlElement(name = "SalesHeightUnit")
    protected Long salesHeightUnit;
    @XmlElement(name = "SalesUnitVolume")
    protected Double salesUnitVolume;
    @XmlElement(name = "SalesVolumeUnit")
    protected Long salesVolumeUnit;
    @XmlElement(name = "SalesUnitWeight")
    protected Double salesUnitWeight;
    @XmlElement(name = "SalesWeightUnit")
    protected Long salesWeightUnit;
    @XmlElement(name = "PurchaseUnit")
    protected String purchaseUnit;
    @XmlElement(name = "PurchaseItemsPerUnit")
    protected Double purchaseItemsPerUnit;
    @XmlElement(name = "PurchasePackagingUnit")
    protected String purchasePackagingUnit;
    @XmlElement(name = "PurchaseQtyPerPackUnit")
    protected Double purchaseQtyPerPackUnit;
    @XmlElement(name = "PurchaseUnitLength")
    protected Double purchaseUnitLength;
    @XmlElement(name = "PurchaseLengthUnit")
    protected Long purchaseLengthUnit;
    @XmlElement(name = "PurchaseUnitWidth")
    protected Double purchaseUnitWidth;
    @XmlElement(name = "PurchaseWidthUnit")
    protected Long purchaseWidthUnit;
    @XmlElement(name = "PurchaseUnitHeight")
    protected Double purchaseUnitHeight;
    @XmlElement(name = "PurchaseHeightUnit")
    protected Long purchaseHeightUnit;
    @XmlElement(name = "PurchaseUnitVolume")
    protected Double purchaseUnitVolume;
    @XmlElement(name = "PurchaseVolumeUnit")
    protected Long purchaseVolumeUnit;
    @XmlElement(name = "PurchaseUnitWeight")
    protected Double purchaseUnitWeight;
    @XmlElement(name = "PurchaseWeightUnit")
    protected Long purchaseWeightUnit;
    @XmlElement(name = "PurchaseVATGroup")
    protected String purchaseVATGroup;
    @XmlElement(name = "SalesFactor1")
    protected Double salesFactor1;
    @XmlElement(name = "SalesFactor2")
    protected Double salesFactor2;
    @XmlElement(name = "SalesFactor3")
    protected Double salesFactor3;
    @XmlElement(name = "SalesFactor4")
    protected Double salesFactor4;
    @XmlElement(name = "PurchaseFactor1")
    protected Double purchaseFactor1;
    @XmlElement(name = "PurchaseFactor2")
    protected Double purchaseFactor2;
    @XmlElement(name = "PurchaseFactor3")
    protected Double purchaseFactor3;
    @XmlElement(name = "PurchaseFactor4")
    protected Double purchaseFactor4;
    @XmlElement(name = "MovingAveragePrice")
    protected Double movingAveragePrice;
    @XmlElement(name = "ForeignRevenuesAccount")
    protected String foreignRevenuesAccount;
    @XmlElement(name = "ECRevenuesAccount")
    protected String ecRevenuesAccount;
    @XmlElement(name = "ForeignExpensesAccount")
    protected String foreignExpensesAccount;
    @XmlElement(name = "ECExpensesAccount")
    protected String ecExpensesAccount;
    @XmlElement(name = "AvgStdPrice")
    protected Double avgStdPrice;
    @XmlElement(name = "DefaultWarehouse")
    protected String defaultWarehouse;
    @XmlElement(name = "ShipType")
    protected Long shipType;
    @XmlElement(name = "GLMethod")
    protected String glMethod;
    @XmlElement(name = "TaxType")
    protected String taxType;
    @XmlElement(name = "MaxInventory")
    protected Double maxInventory;
    @XmlElement(name = "ManageStockByWarehouse")
    protected String manageStockByWarehouse;
    @XmlElement(name = "PurchaseHeightUnit1")
    protected Long purchaseHeightUnit1;
    @XmlElement(name = "PurchaseUnitHeight1")
    protected Double purchaseUnitHeight1;
    @XmlElement(name = "PurchaseLengthUnit1")
    protected Long purchaseLengthUnit1;
    @XmlElement(name = "PurchaseUnitLength1")
    protected Double purchaseUnitLength1;
    @XmlElement(name = "PurchaseWeightUnit1")
    protected Long purchaseWeightUnit1;
    @XmlElement(name = "PurchaseUnitWeight1")
    protected Double purchaseUnitWeight1;
    @XmlElement(name = "PurchaseWidthUnit1")
    protected Long purchaseWidthUnit1;
    @XmlElement(name = "PurchaseUnitWidth1")
    protected Double purchaseUnitWidth1;
    @XmlElement(name = "SalesHeightUnit1")
    protected Long salesHeightUnit1;
    @XmlElement(name = "SalesUnitHeight1")
    protected Double salesUnitHeight1;
    @XmlElement(name = "SalesLengthUnit1")
    protected Long salesLengthUnit1;
    @XmlElement(name = "SalesUnitLength1")
    protected Double salesUnitLength1;
    @XmlElement(name = "SalesWeightUnit1")
    protected Long salesWeightUnit1;
    @XmlElement(name = "SalesUnitWeight1")
    protected Double salesUnitWeight1;
    @XmlElement(name = "SalesWidthUnit1")
    protected Long salesWidthUnit1;
    @XmlElement(name = "SalesUnitWidth1")
    protected Double salesUnitWidth1;
    @XmlElement(name = "ForceSelectionOfSerialNumber")
    protected String forceSelectionOfSerialNumber;
    @XmlElement(name = "ManageSerialNumbersOnReleaseOnly")
    protected String manageSerialNumbersOnReleaseOnly;
    @XmlElement(name = "WTLiable")
    protected String wtLiable;
    @XmlElement(name = "CostAccountingMethod")
    protected String costAccountingMethod;
    @XmlElement(name = "SWW")
    protected String sww;
    @XmlElement(name = "WarrantyTemplate")
    protected String warrantyTemplate;
    @XmlElement(name = "IndirectTax")
    protected String indirectTax;
    @XmlElement(name = "ArTaxCode")
    protected String arTaxCode;
    @XmlElement(name = "ApTaxCode")
    protected String apTaxCode;
    @XmlElement(name = "BaseUnitName")
    protected String baseUnitName;
    @XmlElement(name = "ItemCountryOrg")
    protected String itemCountryOrg;
    @XmlElement(name = "IssueMethod")
    protected String issueMethod;
    @XmlElement(name = "SRIAndBatchManageMethod")
    protected String sriAndBatchManageMethod;
    @XmlElement(name = "IsPhantom")
    protected String isPhantom;
    @XmlElement(name = "InventoryUOM")
    protected String inventoryUOM;
    @XmlElement(name = "PlanningSystem")
    protected String planningSystem;
    @XmlElement(name = "ProcurementMethod")
    protected String procurementMethod;
    @XmlElement(name = "OrderIntervals")
    protected Long orderIntervals;
    @XmlElement(name = "OrderMultiple")
    protected Double orderMultiple;
    @XmlElement(name = "LeadTime")
    protected Long leadTime;
    @XmlElement(name = "MinOrderQuantity")
    protected Double minOrderQuantity;
    @XmlElement(name = "ItemType")
    protected String itemType;
    @XmlElement(name = "ItemClass")
    protected String itemClass;
    @XmlElement(name = "OutgoingServiceCode")
    protected Long outgoingServiceCode;
    @XmlElement(name = "IncomingServiceCode")
    protected Long incomingServiceCode;
    @XmlElement(name = "ServiceGroup")
    protected Long serviceGroup;
    @XmlElement(name = "NCMCode")
    protected Long ncmCode;
    @XmlElement(name = "MaterialType")
    protected String materialType;
    @XmlElement(name = "MaterialGroup")
    protected Long materialGroup;
    @XmlElement(name = "ProductSource")
    protected String productSource;
    @XmlElement(name = "Properties1")
    protected String properties1;
    @XmlElement(name = "Properties2")
    protected String properties2;
    @XmlElement(name = "Properties3")
    protected String properties3;
    @XmlElement(name = "Properties4")
    protected String properties4;
    @XmlElement(name = "Properties5")
    protected String properties5;
    @XmlElement(name = "Properties6")
    protected String properties6;
    @XmlElement(name = "Properties7")
    protected String properties7;
    @XmlElement(name = "Properties8")
    protected String properties8;
    @XmlElement(name = "Properties9")
    protected String properties9;
    @XmlElement(name = "Properties10")
    protected String properties10;
    @XmlElement(name = "Properties11")
    protected String properties11;
    @XmlElement(name = "Properties12")
    protected String properties12;
    @XmlElement(name = "Properties13")
    protected String properties13;
    @XmlElement(name = "Properties14")
    protected String properties14;
    @XmlElement(name = "Properties15")
    protected String properties15;
    @XmlElement(name = "Properties16")
    protected String properties16;
    @XmlElement(name = "Properties17")
    protected String properties17;
    @XmlElement(name = "Properties18")
    protected String properties18;
    @XmlElement(name = "Properties19")
    protected String properties19;
    @XmlElement(name = "Properties20")
    protected String properties20;
    @XmlElement(name = "Properties21")
    protected String properties21;
    @XmlElement(name = "Properties22")
    protected String properties22;
    @XmlElement(name = "Properties23")
    protected String properties23;
    @XmlElement(name = "Properties24")
    protected String properties24;
    @XmlElement(name = "Properties25")
    protected String properties25;
    @XmlElement(name = "Properties26")
    protected String properties26;
    @XmlElement(name = "Properties27")
    protected String properties27;
    @XmlElement(name = "Properties28")
    protected String properties28;
    @XmlElement(name = "Properties29")
    protected String properties29;
    @XmlElement(name = "Properties30")
    protected String properties30;
    @XmlElement(name = "Properties31")
    protected String properties31;
    @XmlElement(name = "Properties32")
    protected String properties32;
    @XmlElement(name = "Properties33")
    protected String properties33;
    @XmlElement(name = "Properties34")
    protected String properties34;
    @XmlElement(name = "Properties35")
    protected String properties35;
    @XmlElement(name = "Properties36")
    protected String properties36;
    @XmlElement(name = "Properties37")
    protected String properties37;
    @XmlElement(name = "Properties38")
    protected String properties38;
    @XmlElement(name = "Properties39")
    protected String properties39;
    @XmlElement(name = "Properties40")
    protected String properties40;
    @XmlElement(name = "Properties41")
    protected String properties41;
    @XmlElement(name = "Properties42")
    protected String properties42;
    @XmlElement(name = "Properties43")
    protected String properties43;
    @XmlElement(name = "Properties44")
    protected String properties44;
    @XmlElement(name = "Properties45")
    protected String properties45;
    @XmlElement(name = "Properties46")
    protected String properties46;
    @XmlElement(name = "Properties47")
    protected String properties47;
    @XmlElement(name = "Properties48")
    protected String properties48;
    @XmlElement(name = "Properties49")
    protected String properties49;
    @XmlElement(name = "Properties50")
    protected String properties50;
    @XmlElement(name = "Properties51")
    protected String properties51;
    @XmlElement(name = "Properties52")
    protected String properties52;
    @XmlElement(name = "Properties53")
    protected String properties53;
    @XmlElement(name = "Properties54")
    protected String properties54;
    @XmlElement(name = "Properties55")
    protected String properties55;
    @XmlElement(name = "Properties56")
    protected String properties56;
    @XmlElement(name = "Properties57")
    protected String properties57;
    @XmlElement(name = "Properties58")
    protected String properties58;
    @XmlElement(name = "Properties59")
    protected String properties59;
    @XmlElement(name = "Properties60")
    protected String properties60;
    @XmlElement(name = "Properties61")
    protected String properties61;
    @XmlElement(name = "Properties62")
    protected String properties62;
    @XmlElement(name = "Properties63")
    protected String properties63;
    @XmlElement(name = "Properties64")
    protected String properties64;
    @XmlElement(name = "AutoCreateSerialNumbersOnRelease")
    protected String autoCreateSerialNumbersOnRelease;
    @XmlElement(name = "DNFEntry")
    protected Long dnfEntry;
    @XmlElement(name = "GTSItemSpec")
    protected String gtsItemSpec;
    @XmlElement(name = "GTSItemTaxCategory")
    protected String gtsItemTaxCategory;
    @XmlElement(name = "FuelID")
    protected Long fuelID;
    @XmlElement(name = "BeverageTableCode")
    protected String beverageTableCode;
    @XmlElement(name = "BeverageGroupCode")
    protected String beverageGroupCode;
    @XmlElement(name = "BeverageCommercialBrandCode")
    protected Long beverageCommercialBrandCode;
    @XmlElement(name = "Series")
    protected Long series;
    @XmlElement(name = "ToleranceDays")
    protected Long toleranceDays;
    @XmlElement(name = "TypeOfAdvancedRules")
    protected String typeOfAdvancedRules;
    @XmlElement(name = "IssuePrimarilyBy")
    protected String issuePrimarilyBy;
    @XmlElement(name = "NoDiscounts")
    protected String noDiscounts;
    @XmlElement(name = "AssetClass")
    protected String assetClass;
    @XmlElement(name = "AssetGroup")
    protected String assetGroup;
    @XmlElement(name = "InventoryNumber")
    protected String inventoryNumber;
    @XmlElement(name = "Technician")
    protected Long technician;
    @XmlElement(name = "Employee")
    protected Long employee;
    @XmlElement(name = "Location")
    protected Long location;
    @XmlElement(name = "AssetStatus")
    protected String assetStatus;
    @XmlElement(name = "CapitalizationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar capitalizationDate;
    @XmlElement(name = "StatisticalAsset")
    protected String statisticalAsset;
    @XmlElement(name = "Cession")
    protected String cession;
    @XmlElement(name = "DeactivateAfterUsefulLife")
    protected String deactivateAfterUsefulLife;
    @XmlElement(name = "ManageByQuantity")
    protected String manageByQuantity;
    @XmlElement(name = "UoMGroupEntry")
    protected Long uoMGroupEntry;
    @XmlElement(name = "InventoryUoMEntry")
    protected Long inventoryUoMEntry;
    @XmlElement(name = "DefaultSalesUoMEntry")
    protected Long defaultSalesUoMEntry;
    @XmlElement(name = "DefaultPurchasingUoMEntry")
    protected Long defaultPurchasingUoMEntry;
    @XmlElement(name = "DepreciationGroup")
    protected String depreciationGroup;
    @XmlElement(name = "AssetSerialNumber")
    protected String assetSerialNumber;
    @XmlElement(name = "ItemPrices")
    protected Item.ItemPrices itemPrices;
    @XmlElement(name = "ItemWarehouseInfoCollection")
    protected Item.ItemWarehouseInfoCollection itemWarehouseInfoCollection;
    @XmlElement(name = "ItemPreferredVendors")
    protected Item.ItemPreferredVendors itemPreferredVendors;
    @XmlElement(name = "ItemLocalizationInfos")
    protected Item.ItemLocalizationInfos itemLocalizationInfos;
    @XmlElement(name = "ItemProjects")
    protected Item.ItemProjects itemProjects;
    @XmlElement(name = "ItemDistributionRules")
    protected Item.ItemDistributionRules itemDistributionRules;
    @XmlElement(name = "ItemAttributeGroups")
    protected Item.ItemAttributeGroups itemAttributeGroups;
    @XmlElement(name = "ItemDepreciationParameters")
    protected Item.ItemDepreciationParameters itemDepreciationParameters;
    @XmlElement(name = "ItemPeriodControls")
    protected Item.ItemPeriodControls itemPeriodControls;
    @XmlElement(name = "ItemUnitOfMeasurementCollection")
    protected Item.ItemUnitOfMeasurementCollection itemUnitOfMeasurementCollection;
    @XmlElement(name = "ItemBarCodeCollection")
    protected Item.ItemBarCodeCollection itemBarCodeCollection;
    @XmlElement(name = "ItemIntrastatExtension")
    protected Item.ItemIntrastatExtension itemIntrastatExtension;

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
     * Obtiene el valor de la propiedad itemName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Define el valor de la propiedad itemName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignName() {
        return foreignName;
    }

    /**
     * Define el valor de la propiedad foreignName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignName(String value) {
        this.foreignName = value;
    }

    /**
     * Obtiene el valor de la propiedad itemsGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemsGroupCode() {
        return itemsGroupCode;
    }

    /**
     * Define el valor de la propiedad itemsGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemsGroupCode(Long value) {
        this.itemsGroupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad customsGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomsGroupCode() {
        return customsGroupCode;
    }

    /**
     * Define el valor de la propiedad customsGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomsGroupCode(Long value) {
        this.customsGroupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad salesVATGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesVATGroup() {
        return salesVATGroup;
    }

    /**
     * Define el valor de la propiedad salesVATGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesVATGroup(String value) {
        this.salesVATGroup = value;
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
     * Obtiene el valor de la propiedad vatLiable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatLiable() {
        return vatLiable;
    }

    /**
     * Define el valor de la propiedad vatLiable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatLiable(String value) {
        this.vatLiable = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseItem() {
        return purchaseItem;
    }

    /**
     * Define el valor de la propiedad purchaseItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseItem(String value) {
        this.purchaseItem = value;
    }

    /**
     * Obtiene el valor de la propiedad salesItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesItem() {
        return salesItem;
    }

    /**
     * Define el valor de la propiedad salesItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesItem(String value) {
        this.salesItem = value;
    }

    /**
     * Obtiene el valor de la propiedad inventoryItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryItem() {
        return inventoryItem;
    }

    /**
     * Define el valor de la propiedad inventoryItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryItem(String value) {
        this.inventoryItem = value;
    }

    /**
     * Obtiene el valor de la propiedad incomeAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeAccount() {
        return incomeAccount;
    }

    /**
     * Define el valor de la propiedad incomeAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeAccount(String value) {
        this.incomeAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad exemptIncomeAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptIncomeAccount() {
        return exemptIncomeAccount;
    }

    /**
     * Define el valor de la propiedad exemptIncomeAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptIncomeAccount(String value) {
        this.exemptIncomeAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad expanseAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpanseAccount() {
        return expanseAccount;
    }

    /**
     * Define el valor de la propiedad expanseAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpanseAccount(String value) {
        this.expanseAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad mainsupplier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainsupplier() {
        return mainsupplier;
    }

    /**
     * Define el valor de la propiedad mainsupplier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainsupplier(String value) {
        this.mainsupplier = value;
    }

    /**
     * Obtiene el valor de la propiedad supplierCatalogNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCatalogNo() {
        return supplierCatalogNo;
    }

    /**
     * Define el valor de la propiedad supplierCatalogNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCatalogNo(String value) {
        this.supplierCatalogNo = value;
    }

    /**
     * Obtiene el valor de la propiedad desiredInventory.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDesiredInventory() {
        return desiredInventory;
    }

    /**
     * Define el valor de la propiedad desiredInventory.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDesiredInventory(Double value) {
        this.desiredInventory = value;
    }

    /**
     * Obtiene el valor de la propiedad minInventory.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinInventory() {
        return minInventory;
    }

    /**
     * Define el valor de la propiedad minInventory.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinInventory(Double value) {
        this.minInventory = value;
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
     * Obtiene el valor de la propiedad userText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserText() {
        return userText;
    }

    /**
     * Define el valor de la propiedad userText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserText(String value) {
        this.userText = value;
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
     * Obtiene el valor de la propiedad commissionPercent.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCommissionPercent() {
        return commissionPercent;
    }

    /**
     * Define el valor de la propiedad commissionPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCommissionPercent(Double value) {
        this.commissionPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad commissionSum.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCommissionSum() {
        return commissionSum;
    }

    /**
     * Define el valor de la propiedad commissionSum.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCommissionSum(Double value) {
        this.commissionSum = value;
    }

    /**
     * Obtiene el valor de la propiedad commissionGroup.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCommissionGroup() {
        return commissionGroup;
    }

    /**
     * Define el valor de la propiedad commissionGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCommissionGroup(Long value) {
        this.commissionGroup = value;
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
     * Obtiene el valor de la propiedad assetItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetItem() {
        return assetItem;
    }

    /**
     * Define el valor de la propiedad assetItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetItem(String value) {
        this.assetItem = value;
    }

    /**
     * Obtiene el valor de la propiedad dataExportCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExportCode() {
        return dataExportCode;
    }

    /**
     * Define el valor de la propiedad dataExportCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExportCode(String value) {
        this.dataExportCode = value;
    }

    /**
     * Obtiene el valor de la propiedad manufacturer.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManufacturer() {
        return manufacturer;
    }

    /**
     * Define el valor de la propiedad manufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManufacturer(Long value) {
        this.manufacturer = value;
    }

    /**
     * Obtiene el valor de la propiedad quantityOnStock.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityOnStock() {
        return quantityOnStock;
    }

    /**
     * Define el valor de la propiedad quantityOnStock.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityOnStock(Double value) {
        this.quantityOnStock = value;
    }

    /**
     * Obtiene el valor de la propiedad quantityOrderedFromVendors.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityOrderedFromVendors() {
        return quantityOrderedFromVendors;
    }

    /**
     * Define el valor de la propiedad quantityOrderedFromVendors.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityOrderedFromVendors(Double value) {
        this.quantityOrderedFromVendors = value;
    }

    /**
     * Obtiene el valor de la propiedad quantityOrderedByCustomers.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityOrderedByCustomers() {
        return quantityOrderedByCustomers;
    }

    /**
     * Define el valor de la propiedad quantityOrderedByCustomers.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityOrderedByCustomers(Double value) {
        this.quantityOrderedByCustomers = value;
    }

    /**
     * Obtiene el valor de la propiedad manageSerialNumbers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageSerialNumbers() {
        return manageSerialNumbers;
    }

    /**
     * Define el valor de la propiedad manageSerialNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageSerialNumbers(String value) {
        this.manageSerialNumbers = value;
    }

    /**
     * Obtiene el valor de la propiedad manageBatchNumbers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageBatchNumbers() {
        return manageBatchNumbers;
    }

    /**
     * Define el valor de la propiedad manageBatchNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageBatchNumbers(String value) {
        this.manageBatchNumbers = value;
    }

    /**
     * Obtiene el valor de la propiedad valid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValid() {
        return valid;
    }

    /**
     * Define el valor de la propiedad valid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValid(String value) {
        this.valid = value;
    }

    /**
     * Obtiene el valor de la propiedad validFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Define el valor de la propiedad validFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad validTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Define el valor de la propiedad validTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

    /**
     * Obtiene el valor de la propiedad validRemarks.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidRemarks() {
        return validRemarks;
    }

    /**
     * Define el valor de la propiedad validRemarks.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidRemarks(String value) {
        this.validRemarks = value;
    }

    /**
     * Obtiene el valor de la propiedad frozen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrozen() {
        return frozen;
    }

    /**
     * Define el valor de la propiedad frozen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrozen(String value) {
        this.frozen = value;
    }

    /**
     * Obtiene el valor de la propiedad frozenFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrozenFrom() {
        return frozenFrom;
    }

    /**
     * Define el valor de la propiedad frozenFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrozenFrom(XMLGregorianCalendar value) {
        this.frozenFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad frozenTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrozenTo() {
        return frozenTo;
    }

    /**
     * Define el valor de la propiedad frozenTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrozenTo(XMLGregorianCalendar value) {
        this.frozenTo = value;
    }

    /**
     * Obtiene el valor de la propiedad frozenRemarks.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrozenRemarks() {
        return frozenRemarks;
    }

    /**
     * Define el valor de la propiedad frozenRemarks.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrozenRemarks(String value) {
        this.frozenRemarks = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUnit() {
        return salesUnit;
    }

    /**
     * Define el valor de la propiedad salesUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUnit(String value) {
        this.salesUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad salesItemsPerUnit.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalesItemsPerUnit() {
        return salesItemsPerUnit;
    }

    /**
     * Define el valor de la propiedad salesItemsPerUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalesItemsPerUnit(Double value) {
        this.salesItemsPerUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad salesPackagingUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPackagingUnit() {
        return salesPackagingUnit;
    }

    /**
     * Define el valor de la propiedad salesPackagingUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPackagingUnit(String value) {
        this.salesPackagingUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad salesQtyPerPackUnit.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalesQtyPerPackUnit() {
        return salesQtyPerPackUnit;
    }

    /**
     * Define el valor de la propiedad salesQtyPerPackUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalesQtyPerPackUnit(Double value) {
        this.salesQtyPerPackUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitLength.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalesUnitLength() {
        return salesUnitLength;
    }

    /**
     * Define el valor de la propiedad salesUnitLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalesUnitLength(Double value) {
        this.salesUnitLength = value;
    }

    /**
     * Obtiene el valor de la propiedad salesLengthUnit.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesLengthUnit() {
        return salesLengthUnit;
    }

    /**
     * Define el valor de la propiedad salesLengthUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesLengthUnit(Long value) {
        this.salesLengthUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitWidth.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalesUnitWidth() {
        return salesUnitWidth;
    }

    /**
     * Define el valor de la propiedad salesUnitWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalesUnitWidth(Double value) {
        this.salesUnitWidth = value;
    }

    /**
     * Obtiene el valor de la propiedad salesWidthUnit.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesWidthUnit() {
        return salesWidthUnit;
    }

    /**
     * Define el valor de la propiedad salesWidthUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesWidthUnit(Long value) {
        this.salesWidthUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitHeight.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalesUnitHeight() {
        return salesUnitHeight;
    }

    /**
     * Define el valor de la propiedad salesUnitHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalesUnitHeight(Double value) {
        this.salesUnitHeight = value;
    }

    /**
     * Obtiene el valor de la propiedad salesHeightUnit.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesHeightUnit() {
        return salesHeightUnit;
    }

    /**
     * Define el valor de la propiedad salesHeightUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesHeightUnit(Long value) {
        this.salesHeightUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitVolume.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalesUnitVolume() {
        return salesUnitVolume;
    }

    /**
     * Define el valor de la propiedad salesUnitVolume.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalesUnitVolume(Double value) {
        this.salesUnitVolume = value;
    }

    /**
     * Obtiene el valor de la propiedad salesVolumeUnit.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesVolumeUnit() {
        return salesVolumeUnit;
    }

    /**
     * Define el valor de la propiedad salesVolumeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesVolumeUnit(Long value) {
        this.salesVolumeUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitWeight.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalesUnitWeight() {
        return salesUnitWeight;
    }

    /**
     * Define el valor de la propiedad salesUnitWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalesUnitWeight(Double value) {
        this.salesUnitWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad salesWeightUnit.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesWeightUnit() {
        return salesWeightUnit;
    }

    /**
     * Define el valor de la propiedad salesWeightUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesWeightUnit(Long value) {
        this.salesWeightUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseUnit() {
        return purchaseUnit;
    }

    /**
     * Define el valor de la propiedad purchaseUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseUnit(String value) {
        this.purchaseUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseItemsPerUnit.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseItemsPerUnit() {
        return purchaseItemsPerUnit;
    }

    /**
     * Define el valor de la propiedad purchaseItemsPerUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseItemsPerUnit(Double value) {
        this.purchaseItemsPerUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchasePackagingUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasePackagingUnit() {
        return purchasePackagingUnit;
    }

    /**
     * Define el valor de la propiedad purchasePackagingUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasePackagingUnit(String value) {
        this.purchasePackagingUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseQtyPerPackUnit.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseQtyPerPackUnit() {
        return purchaseQtyPerPackUnit;
    }

    /**
     * Define el valor de la propiedad purchaseQtyPerPackUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseQtyPerPackUnit(Double value) {
        this.purchaseQtyPerPackUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitLength.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseUnitLength() {
        return purchaseUnitLength;
    }

    /**
     * Define el valor de la propiedad purchaseUnitLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseUnitLength(Double value) {
        this.purchaseUnitLength = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseLengthUnit.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseLengthUnit() {
        return purchaseLengthUnit;
    }

    /**
     * Define el valor de la propiedad purchaseLengthUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseLengthUnit(Long value) {
        this.purchaseLengthUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitWidth.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseUnitWidth() {
        return purchaseUnitWidth;
    }

    /**
     * Define el valor de la propiedad purchaseUnitWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseUnitWidth(Double value) {
        this.purchaseUnitWidth = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseWidthUnit.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseWidthUnit() {
        return purchaseWidthUnit;
    }

    /**
     * Define el valor de la propiedad purchaseWidthUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseWidthUnit(Long value) {
        this.purchaseWidthUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitHeight.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseUnitHeight() {
        return purchaseUnitHeight;
    }

    /**
     * Define el valor de la propiedad purchaseUnitHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseUnitHeight(Double value) {
        this.purchaseUnitHeight = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseHeightUnit.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseHeightUnit() {
        return purchaseHeightUnit;
    }

    /**
     * Define el valor de la propiedad purchaseHeightUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseHeightUnit(Long value) {
        this.purchaseHeightUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitVolume.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseUnitVolume() {
        return purchaseUnitVolume;
    }

    /**
     * Define el valor de la propiedad purchaseUnitVolume.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseUnitVolume(Double value) {
        this.purchaseUnitVolume = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseVolumeUnit.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseVolumeUnit() {
        return purchaseVolumeUnit;
    }

    /**
     * Define el valor de la propiedad purchaseVolumeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseVolumeUnit(Long value) {
        this.purchaseVolumeUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitWeight.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseUnitWeight() {
        return purchaseUnitWeight;
    }

    /**
     * Define el valor de la propiedad purchaseUnitWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseUnitWeight(Double value) {
        this.purchaseUnitWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseWeightUnit.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseWeightUnit() {
        return purchaseWeightUnit;
    }

    /**
     * Define el valor de la propiedad purchaseWeightUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseWeightUnit(Long value) {
        this.purchaseWeightUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseVATGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseVATGroup() {
        return purchaseVATGroup;
    }

    /**
     * Define el valor de la propiedad purchaseVATGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseVATGroup(String value) {
        this.purchaseVATGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad salesFactor1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalesFactor1() {
        return salesFactor1;
    }

    /**
     * Define el valor de la propiedad salesFactor1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalesFactor1(Double value) {
        this.salesFactor1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesFactor2.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalesFactor2() {
        return salesFactor2;
    }

    /**
     * Define el valor de la propiedad salesFactor2.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalesFactor2(Double value) {
        this.salesFactor2 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesFactor3.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalesFactor3() {
        return salesFactor3;
    }

    /**
     * Define el valor de la propiedad salesFactor3.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalesFactor3(Double value) {
        this.salesFactor3 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesFactor4.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalesFactor4() {
        return salesFactor4;
    }

    /**
     * Define el valor de la propiedad salesFactor4.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalesFactor4(Double value) {
        this.salesFactor4 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseFactor1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseFactor1() {
        return purchaseFactor1;
    }

    /**
     * Define el valor de la propiedad purchaseFactor1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseFactor1(Double value) {
        this.purchaseFactor1 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseFactor2.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseFactor2() {
        return purchaseFactor2;
    }

    /**
     * Define el valor de la propiedad purchaseFactor2.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseFactor2(Double value) {
        this.purchaseFactor2 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseFactor3.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseFactor3() {
        return purchaseFactor3;
    }

    /**
     * Define el valor de la propiedad purchaseFactor3.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseFactor3(Double value) {
        this.purchaseFactor3 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseFactor4.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseFactor4() {
        return purchaseFactor4;
    }

    /**
     * Define el valor de la propiedad purchaseFactor4.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseFactor4(Double value) {
        this.purchaseFactor4 = value;
    }

    /**
     * Obtiene el valor de la propiedad movingAveragePrice.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMovingAveragePrice() {
        return movingAveragePrice;
    }

    /**
     * Define el valor de la propiedad movingAveragePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMovingAveragePrice(Double value) {
        this.movingAveragePrice = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignRevenuesAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignRevenuesAccount() {
        return foreignRevenuesAccount;
    }

    /**
     * Define el valor de la propiedad foreignRevenuesAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignRevenuesAccount(String value) {
        this.foreignRevenuesAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad ecRevenuesAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECRevenuesAccount() {
        return ecRevenuesAccount;
    }

    /**
     * Define el valor de la propiedad ecRevenuesAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECRevenuesAccount(String value) {
        this.ecRevenuesAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignExpensesAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignExpensesAccount() {
        return foreignExpensesAccount;
    }

    /**
     * Define el valor de la propiedad foreignExpensesAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignExpensesAccount(String value) {
        this.foreignExpensesAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad ecExpensesAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECExpensesAccount() {
        return ecExpensesAccount;
    }

    /**
     * Define el valor de la propiedad ecExpensesAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECExpensesAccount(String value) {
        this.ecExpensesAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad avgStdPrice.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvgStdPrice() {
        return avgStdPrice;
    }

    /**
     * Define el valor de la propiedad avgStdPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvgStdPrice(Double value) {
        this.avgStdPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultWarehouse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultWarehouse() {
        return defaultWarehouse;
    }

    /**
     * Define el valor de la propiedad defaultWarehouse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultWarehouse(String value) {
        this.defaultWarehouse = value;
    }

    /**
     * Obtiene el valor de la propiedad shipType.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShipType() {
        return shipType;
    }

    /**
     * Define el valor de la propiedad shipType.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShipType(Long value) {
        this.shipType = value;
    }

    /**
     * Obtiene el valor de la propiedad glMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLMethod() {
        return glMethod;
    }

    /**
     * Define el valor de la propiedad glMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLMethod(String value) {
        this.glMethod = value;
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
     * Obtiene el valor de la propiedad maxInventory.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxInventory() {
        return maxInventory;
    }

    /**
     * Define el valor de la propiedad maxInventory.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxInventory(Double value) {
        this.maxInventory = value;
    }

    /**
     * Obtiene el valor de la propiedad manageStockByWarehouse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageStockByWarehouse() {
        return manageStockByWarehouse;
    }

    /**
     * Define el valor de la propiedad manageStockByWarehouse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageStockByWarehouse(String value) {
        this.manageStockByWarehouse = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseHeightUnit1.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseHeightUnit1() {
        return purchaseHeightUnit1;
    }

    /**
     * Define el valor de la propiedad purchaseHeightUnit1.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseHeightUnit1(Long value) {
        this.purchaseHeightUnit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitHeight1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseUnitHeight1() {
        return purchaseUnitHeight1;
    }

    /**
     * Define el valor de la propiedad purchaseUnitHeight1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseUnitHeight1(Double value) {
        this.purchaseUnitHeight1 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseLengthUnit1.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseLengthUnit1() {
        return purchaseLengthUnit1;
    }

    /**
     * Define el valor de la propiedad purchaseLengthUnit1.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseLengthUnit1(Long value) {
        this.purchaseLengthUnit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitLength1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseUnitLength1() {
        return purchaseUnitLength1;
    }

    /**
     * Define el valor de la propiedad purchaseUnitLength1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseUnitLength1(Double value) {
        this.purchaseUnitLength1 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseWeightUnit1.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseWeightUnit1() {
        return purchaseWeightUnit1;
    }

    /**
     * Define el valor de la propiedad purchaseWeightUnit1.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseWeightUnit1(Long value) {
        this.purchaseWeightUnit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitWeight1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseUnitWeight1() {
        return purchaseUnitWeight1;
    }

    /**
     * Define el valor de la propiedad purchaseUnitWeight1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseUnitWeight1(Double value) {
        this.purchaseUnitWeight1 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseWidthUnit1.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseWidthUnit1() {
        return purchaseWidthUnit1;
    }

    /**
     * Define el valor de la propiedad purchaseWidthUnit1.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseWidthUnit1(Long value) {
        this.purchaseWidthUnit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseUnitWidth1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseUnitWidth1() {
        return purchaseUnitWidth1;
    }

    /**
     * Define el valor de la propiedad purchaseUnitWidth1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseUnitWidth1(Double value) {
        this.purchaseUnitWidth1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesHeightUnit1.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesHeightUnit1() {
        return salesHeightUnit1;
    }

    /**
     * Define el valor de la propiedad salesHeightUnit1.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesHeightUnit1(Long value) {
        this.salesHeightUnit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitHeight1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalesUnitHeight1() {
        return salesUnitHeight1;
    }

    /**
     * Define el valor de la propiedad salesUnitHeight1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalesUnitHeight1(Double value) {
        this.salesUnitHeight1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesLengthUnit1.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesLengthUnit1() {
        return salesLengthUnit1;
    }

    /**
     * Define el valor de la propiedad salesLengthUnit1.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesLengthUnit1(Long value) {
        this.salesLengthUnit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitLength1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalesUnitLength1() {
        return salesUnitLength1;
    }

    /**
     * Define el valor de la propiedad salesUnitLength1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalesUnitLength1(Double value) {
        this.salesUnitLength1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesWeightUnit1.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesWeightUnit1() {
        return salesWeightUnit1;
    }

    /**
     * Define el valor de la propiedad salesWeightUnit1.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesWeightUnit1(Long value) {
        this.salesWeightUnit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitWeight1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalesUnitWeight1() {
        return salesUnitWeight1;
    }

    /**
     * Define el valor de la propiedad salesUnitWeight1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalesUnitWeight1(Double value) {
        this.salesUnitWeight1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesWidthUnit1.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesWidthUnit1() {
        return salesWidthUnit1;
    }

    /**
     * Define el valor de la propiedad salesWidthUnit1.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesWidthUnit1(Long value) {
        this.salesWidthUnit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitWidth1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalesUnitWidth1() {
        return salesUnitWidth1;
    }

    /**
     * Define el valor de la propiedad salesUnitWidth1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalesUnitWidth1(Double value) {
        this.salesUnitWidth1 = value;
    }

    /**
     * Obtiene el valor de la propiedad forceSelectionOfSerialNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceSelectionOfSerialNumber() {
        return forceSelectionOfSerialNumber;
    }

    /**
     * Define el valor de la propiedad forceSelectionOfSerialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForceSelectionOfSerialNumber(String value) {
        this.forceSelectionOfSerialNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad manageSerialNumbersOnReleaseOnly.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageSerialNumbersOnReleaseOnly() {
        return manageSerialNumbersOnReleaseOnly;
    }

    /**
     * Define el valor de la propiedad manageSerialNumbersOnReleaseOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageSerialNumbersOnReleaseOnly(String value) {
        this.manageSerialNumbersOnReleaseOnly = value;
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
     * Obtiene el valor de la propiedad costAccountingMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostAccountingMethod() {
        return costAccountingMethod;
    }

    /**
     * Define el valor de la propiedad costAccountingMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostAccountingMethod(String value) {
        this.costAccountingMethod = value;
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
     * Obtiene el valor de la propiedad warrantyTemplate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyTemplate() {
        return warrantyTemplate;
    }

    /**
     * Define el valor de la propiedad warrantyTemplate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyTemplate(String value) {
        this.warrantyTemplate = value;
    }

    /**
     * Obtiene el valor de la propiedad indirectTax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirectTax() {
        return indirectTax;
    }

    /**
     * Define el valor de la propiedad indirectTax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirectTax(String value) {
        this.indirectTax = value;
    }

    /**
     * Obtiene el valor de la propiedad arTaxCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArTaxCode() {
        return arTaxCode;
    }

    /**
     * Define el valor de la propiedad arTaxCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArTaxCode(String value) {
        this.arTaxCode = value;
    }

    /**
     * Obtiene el valor de la propiedad apTaxCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApTaxCode() {
        return apTaxCode;
    }

    /**
     * Define el valor de la propiedad apTaxCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApTaxCode(String value) {
        this.apTaxCode = value;
    }

    /**
     * Obtiene el valor de la propiedad baseUnitName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseUnitName() {
        return baseUnitName;
    }

    /**
     * Define el valor de la propiedad baseUnitName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseUnitName(String value) {
        this.baseUnitName = value;
    }

    /**
     * Obtiene el valor de la propiedad itemCountryOrg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCountryOrg() {
        return itemCountryOrg;
    }

    /**
     * Define el valor de la propiedad itemCountryOrg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCountryOrg(String value) {
        this.itemCountryOrg = value;
    }

    /**
     * Obtiene el valor de la propiedad issueMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueMethod() {
        return issueMethod;
    }

    /**
     * Define el valor de la propiedad issueMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueMethod(String value) {
        this.issueMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad sriAndBatchManageMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRIAndBatchManageMethod() {
        return sriAndBatchManageMethod;
    }

    /**
     * Define el valor de la propiedad sriAndBatchManageMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRIAndBatchManageMethod(String value) {
        this.sriAndBatchManageMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad isPhantom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPhantom() {
        return isPhantom;
    }

    /**
     * Define el valor de la propiedad isPhantom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPhantom(String value) {
        this.isPhantom = value;
    }

    /**
     * Obtiene el valor de la propiedad inventoryUOM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryUOM() {
        return inventoryUOM;
    }

    /**
     * Define el valor de la propiedad inventoryUOM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryUOM(String value) {
        this.inventoryUOM = value;
    }

    /**
     * Obtiene el valor de la propiedad planningSystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanningSystem() {
        return planningSystem;
    }

    /**
     * Define el valor de la propiedad planningSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanningSystem(String value) {
        this.planningSystem = value;
    }

    /**
     * Obtiene el valor de la propiedad procurementMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcurementMethod() {
        return procurementMethod;
    }

    /**
     * Define el valor de la propiedad procurementMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcurementMethod(String value) {
        this.procurementMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad orderIntervals.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderIntervals() {
        return orderIntervals;
    }

    /**
     * Define el valor de la propiedad orderIntervals.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderIntervals(Long value) {
        this.orderIntervals = value;
    }

    /**
     * Obtiene el valor de la propiedad orderMultiple.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOrderMultiple() {
        return orderMultiple;
    }

    /**
     * Define el valor de la propiedad orderMultiple.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOrderMultiple(Double value) {
        this.orderMultiple = value;
    }

    /**
     * Obtiene el valor de la propiedad leadTime.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLeadTime() {
        return leadTime;
    }

    /**
     * Define el valor de la propiedad leadTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLeadTime(Long value) {
        this.leadTime = value;
    }

    /**
     * Obtiene el valor de la propiedad minOrderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinOrderQuantity() {
        return minOrderQuantity;
    }

    /**
     * Define el valor de la propiedad minOrderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinOrderQuantity(Double value) {
        this.minOrderQuantity = value;
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
     * Obtiene el valor de la propiedad itemClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemClass() {
        return itemClass;
    }

    /**
     * Define el valor de la propiedad itemClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemClass(String value) {
        this.itemClass = value;
    }

    /**
     * Obtiene el valor de la propiedad outgoingServiceCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutgoingServiceCode() {
        return outgoingServiceCode;
    }

    /**
     * Define el valor de la propiedad outgoingServiceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutgoingServiceCode(Long value) {
        this.outgoingServiceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad incomingServiceCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIncomingServiceCode() {
        return incomingServiceCode;
    }

    /**
     * Define el valor de la propiedad incomingServiceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIncomingServiceCode(Long value) {
        this.incomingServiceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceGroup.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceGroup() {
        return serviceGroup;
    }

    /**
     * Define el valor de la propiedad serviceGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceGroup(Long value) {
        this.serviceGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad ncmCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCMCode() {
        return ncmCode;
    }

    /**
     * Define el valor de la propiedad ncmCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCMCode(Long value) {
        this.ncmCode = value;
    }

    /**
     * Obtiene el valor de la propiedad materialType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialType() {
        return materialType;
    }

    /**
     * Define el valor de la propiedad materialType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialType(String value) {
        this.materialType = value;
    }

    /**
     * Obtiene el valor de la propiedad materialGroup.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaterialGroup() {
        return materialGroup;
    }

    /**
     * Define el valor de la propiedad materialGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaterialGroup(Long value) {
        this.materialGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad productSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSource() {
        return productSource;
    }

    /**
     * Define el valor de la propiedad productSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSource(String value) {
        this.productSource = value;
    }

    /**
     * Obtiene el valor de la propiedad properties1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties1() {
        return properties1;
    }

    /**
     * Define el valor de la propiedad properties1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties1(String value) {
        this.properties1 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties2() {
        return properties2;
    }

    /**
     * Define el valor de la propiedad properties2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties2(String value) {
        this.properties2 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties3() {
        return properties3;
    }

    /**
     * Define el valor de la propiedad properties3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties3(String value) {
        this.properties3 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties4() {
        return properties4;
    }

    /**
     * Define el valor de la propiedad properties4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties4(String value) {
        this.properties4 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties5() {
        return properties5;
    }

    /**
     * Define el valor de la propiedad properties5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties5(String value) {
        this.properties5 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties6() {
        return properties6;
    }

    /**
     * Define el valor de la propiedad properties6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties6(String value) {
        this.properties6 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties7() {
        return properties7;
    }

    /**
     * Define el valor de la propiedad properties7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties7(String value) {
        this.properties7 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties8() {
        return properties8;
    }

    /**
     * Define el valor de la propiedad properties8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties8(String value) {
        this.properties8 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties9() {
        return properties9;
    }

    /**
     * Define el valor de la propiedad properties9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties9(String value) {
        this.properties9 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties10.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties10() {
        return properties10;
    }

    /**
     * Define el valor de la propiedad properties10.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties10(String value) {
        this.properties10 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties11.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties11() {
        return properties11;
    }

    /**
     * Define el valor de la propiedad properties11.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties11(String value) {
        this.properties11 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties12.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties12() {
        return properties12;
    }

    /**
     * Define el valor de la propiedad properties12.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties12(String value) {
        this.properties12 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties13.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties13() {
        return properties13;
    }

    /**
     * Define el valor de la propiedad properties13.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties13(String value) {
        this.properties13 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties14.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties14() {
        return properties14;
    }

    /**
     * Define el valor de la propiedad properties14.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties14(String value) {
        this.properties14 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties15.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties15() {
        return properties15;
    }

    /**
     * Define el valor de la propiedad properties15.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties15(String value) {
        this.properties15 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties16.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties16() {
        return properties16;
    }

    /**
     * Define el valor de la propiedad properties16.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties16(String value) {
        this.properties16 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties17.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties17() {
        return properties17;
    }

    /**
     * Define el valor de la propiedad properties17.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties17(String value) {
        this.properties17 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties18.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties18() {
        return properties18;
    }

    /**
     * Define el valor de la propiedad properties18.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties18(String value) {
        this.properties18 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties19.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties19() {
        return properties19;
    }

    /**
     * Define el valor de la propiedad properties19.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties19(String value) {
        this.properties19 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties20.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties20() {
        return properties20;
    }

    /**
     * Define el valor de la propiedad properties20.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties20(String value) {
        this.properties20 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties21.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties21() {
        return properties21;
    }

    /**
     * Define el valor de la propiedad properties21.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties21(String value) {
        this.properties21 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties22.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties22() {
        return properties22;
    }

    /**
     * Define el valor de la propiedad properties22.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties22(String value) {
        this.properties22 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties23.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties23() {
        return properties23;
    }

    /**
     * Define el valor de la propiedad properties23.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties23(String value) {
        this.properties23 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties24.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties24() {
        return properties24;
    }

    /**
     * Define el valor de la propiedad properties24.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties24(String value) {
        this.properties24 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties25.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties25() {
        return properties25;
    }

    /**
     * Define el valor de la propiedad properties25.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties25(String value) {
        this.properties25 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties26.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties26() {
        return properties26;
    }

    /**
     * Define el valor de la propiedad properties26.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties26(String value) {
        this.properties26 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties27.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties27() {
        return properties27;
    }

    /**
     * Define el valor de la propiedad properties27.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties27(String value) {
        this.properties27 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties28.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties28() {
        return properties28;
    }

    /**
     * Define el valor de la propiedad properties28.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties28(String value) {
        this.properties28 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties29.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties29() {
        return properties29;
    }

    /**
     * Define el valor de la propiedad properties29.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties29(String value) {
        this.properties29 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties30.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties30() {
        return properties30;
    }

    /**
     * Define el valor de la propiedad properties30.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties30(String value) {
        this.properties30 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties31.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties31() {
        return properties31;
    }

    /**
     * Define el valor de la propiedad properties31.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties31(String value) {
        this.properties31 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties32.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties32() {
        return properties32;
    }

    /**
     * Define el valor de la propiedad properties32.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties32(String value) {
        this.properties32 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties33.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties33() {
        return properties33;
    }

    /**
     * Define el valor de la propiedad properties33.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties33(String value) {
        this.properties33 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties34.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties34() {
        return properties34;
    }

    /**
     * Define el valor de la propiedad properties34.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties34(String value) {
        this.properties34 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties35.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties35() {
        return properties35;
    }

    /**
     * Define el valor de la propiedad properties35.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties35(String value) {
        this.properties35 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties36.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties36() {
        return properties36;
    }

    /**
     * Define el valor de la propiedad properties36.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties36(String value) {
        this.properties36 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties37.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties37() {
        return properties37;
    }

    /**
     * Define el valor de la propiedad properties37.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties37(String value) {
        this.properties37 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties38.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties38() {
        return properties38;
    }

    /**
     * Define el valor de la propiedad properties38.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties38(String value) {
        this.properties38 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties39.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties39() {
        return properties39;
    }

    /**
     * Define el valor de la propiedad properties39.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties39(String value) {
        this.properties39 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties40.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties40() {
        return properties40;
    }

    /**
     * Define el valor de la propiedad properties40.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties40(String value) {
        this.properties40 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties41.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties41() {
        return properties41;
    }

    /**
     * Define el valor de la propiedad properties41.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties41(String value) {
        this.properties41 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties42.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties42() {
        return properties42;
    }

    /**
     * Define el valor de la propiedad properties42.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties42(String value) {
        this.properties42 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties43.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties43() {
        return properties43;
    }

    /**
     * Define el valor de la propiedad properties43.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties43(String value) {
        this.properties43 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties44.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties44() {
        return properties44;
    }

    /**
     * Define el valor de la propiedad properties44.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties44(String value) {
        this.properties44 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties45.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties45() {
        return properties45;
    }

    /**
     * Define el valor de la propiedad properties45.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties45(String value) {
        this.properties45 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties46.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties46() {
        return properties46;
    }

    /**
     * Define el valor de la propiedad properties46.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties46(String value) {
        this.properties46 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties47.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties47() {
        return properties47;
    }

    /**
     * Define el valor de la propiedad properties47.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties47(String value) {
        this.properties47 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties48.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties48() {
        return properties48;
    }

    /**
     * Define el valor de la propiedad properties48.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties48(String value) {
        this.properties48 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties49.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties49() {
        return properties49;
    }

    /**
     * Define el valor de la propiedad properties49.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties49(String value) {
        this.properties49 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties50.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties50() {
        return properties50;
    }

    /**
     * Define el valor de la propiedad properties50.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties50(String value) {
        this.properties50 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties51.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties51() {
        return properties51;
    }

    /**
     * Define el valor de la propiedad properties51.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties51(String value) {
        this.properties51 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties52.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties52() {
        return properties52;
    }

    /**
     * Define el valor de la propiedad properties52.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties52(String value) {
        this.properties52 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties53.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties53() {
        return properties53;
    }

    /**
     * Define el valor de la propiedad properties53.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties53(String value) {
        this.properties53 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties54.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties54() {
        return properties54;
    }

    /**
     * Define el valor de la propiedad properties54.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties54(String value) {
        this.properties54 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties55.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties55() {
        return properties55;
    }

    /**
     * Define el valor de la propiedad properties55.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties55(String value) {
        this.properties55 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties56.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties56() {
        return properties56;
    }

    /**
     * Define el valor de la propiedad properties56.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties56(String value) {
        this.properties56 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties57.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties57() {
        return properties57;
    }

    /**
     * Define el valor de la propiedad properties57.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties57(String value) {
        this.properties57 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties58.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties58() {
        return properties58;
    }

    /**
     * Define el valor de la propiedad properties58.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties58(String value) {
        this.properties58 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties59.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties59() {
        return properties59;
    }

    /**
     * Define el valor de la propiedad properties59.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties59(String value) {
        this.properties59 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties60.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties60() {
        return properties60;
    }

    /**
     * Define el valor de la propiedad properties60.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties60(String value) {
        this.properties60 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties61.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties61() {
        return properties61;
    }

    /**
     * Define el valor de la propiedad properties61.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties61(String value) {
        this.properties61 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties62.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties62() {
        return properties62;
    }

    /**
     * Define el valor de la propiedad properties62.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties62(String value) {
        this.properties62 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties63.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties63() {
        return properties63;
    }

    /**
     * Define el valor de la propiedad properties63.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties63(String value) {
        this.properties63 = value;
    }

    /**
     * Obtiene el valor de la propiedad properties64.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties64() {
        return properties64;
    }

    /**
     * Define el valor de la propiedad properties64.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties64(String value) {
        this.properties64 = value;
    }

    /**
     * Obtiene el valor de la propiedad autoCreateSerialNumbersOnRelease.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoCreateSerialNumbersOnRelease() {
        return autoCreateSerialNumbersOnRelease;
    }

    /**
     * Define el valor de la propiedad autoCreateSerialNumbersOnRelease.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoCreateSerialNumbersOnRelease(String value) {
        this.autoCreateSerialNumbersOnRelease = value;
    }

    /**
     * Obtiene el valor de la propiedad dnfEntry.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDNFEntry() {
        return dnfEntry;
    }

    /**
     * Define el valor de la propiedad dnfEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDNFEntry(Long value) {
        this.dnfEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad gtsItemSpec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGTSItemSpec() {
        return gtsItemSpec;
    }

    /**
     * Define el valor de la propiedad gtsItemSpec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGTSItemSpec(String value) {
        this.gtsItemSpec = value;
    }

    /**
     * Obtiene el valor de la propiedad gtsItemTaxCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGTSItemTaxCategory() {
        return gtsItemTaxCategory;
    }

    /**
     * Define el valor de la propiedad gtsItemTaxCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGTSItemTaxCategory(String value) {
        this.gtsItemTaxCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad fuelID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFuelID() {
        return fuelID;
    }

    /**
     * Define el valor de la propiedad fuelID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFuelID(Long value) {
        this.fuelID = value;
    }

    /**
     * Obtiene el valor de la propiedad beverageTableCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeverageTableCode() {
        return beverageTableCode;
    }

    /**
     * Define el valor de la propiedad beverageTableCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeverageTableCode(String value) {
        this.beverageTableCode = value;
    }

    /**
     * Obtiene el valor de la propiedad beverageGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeverageGroupCode() {
        return beverageGroupCode;
    }

    /**
     * Define el valor de la propiedad beverageGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeverageGroupCode(String value) {
        this.beverageGroupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad beverageCommercialBrandCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBeverageCommercialBrandCode() {
        return beverageCommercialBrandCode;
    }

    /**
     * Define el valor de la propiedad beverageCommercialBrandCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBeverageCommercialBrandCode(Long value) {
        this.beverageCommercialBrandCode = value;
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
     * Obtiene el valor de la propiedad toleranceDays.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getToleranceDays() {
        return toleranceDays;
    }

    /**
     * Define el valor de la propiedad toleranceDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setToleranceDays(Long value) {
        this.toleranceDays = value;
    }

    /**
     * Obtiene el valor de la propiedad typeOfAdvancedRules.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfAdvancedRules() {
        return typeOfAdvancedRules;
    }

    /**
     * Define el valor de la propiedad typeOfAdvancedRules.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfAdvancedRules(String value) {
        this.typeOfAdvancedRules = value;
    }

    /**
     * Obtiene el valor de la propiedad issuePrimarilyBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuePrimarilyBy() {
        return issuePrimarilyBy;
    }

    /**
     * Define el valor de la propiedad issuePrimarilyBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuePrimarilyBy(String value) {
        this.issuePrimarilyBy = value;
    }

    /**
     * Obtiene el valor de la propiedad noDiscounts.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoDiscounts() {
        return noDiscounts;
    }

    /**
     * Define el valor de la propiedad noDiscounts.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoDiscounts(String value) {
        this.noDiscounts = value;
    }

    /**
     * Obtiene el valor de la propiedad assetClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetClass() {
        return assetClass;
    }

    /**
     * Define el valor de la propiedad assetClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetClass(String value) {
        this.assetClass = value;
    }

    /**
     * Obtiene el valor de la propiedad assetGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetGroup() {
        return assetGroup;
    }

    /**
     * Define el valor de la propiedad assetGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetGroup(String value) {
        this.assetGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad inventoryNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryNumber() {
        return inventoryNumber;
    }

    /**
     * Define el valor de la propiedad inventoryNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryNumber(String value) {
        this.inventoryNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad technician.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTechnician() {
        return technician;
    }

    /**
     * Define el valor de la propiedad technician.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTechnician(Long value) {
        this.technician = value;
    }

    /**
     * Obtiene el valor de la propiedad employee.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmployee() {
        return employee;
    }

    /**
     * Define el valor de la propiedad employee.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmployee(Long value) {
        this.employee = value;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocation(Long value) {
        this.location = value;
    }

    /**
     * Obtiene el valor de la propiedad assetStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetStatus() {
        return assetStatus;
    }

    /**
     * Define el valor de la propiedad assetStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetStatus(String value) {
        this.assetStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad capitalizationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCapitalizationDate() {
        return capitalizationDate;
    }

    /**
     * Define el valor de la propiedad capitalizationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCapitalizationDate(XMLGregorianCalendar value) {
        this.capitalizationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad statisticalAsset.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticalAsset() {
        return statisticalAsset;
    }

    /**
     * Define el valor de la propiedad statisticalAsset.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticalAsset(String value) {
        this.statisticalAsset = value;
    }

    /**
     * Obtiene el valor de la propiedad cession.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCession() {
        return cession;
    }

    /**
     * Define el valor de la propiedad cession.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCession(String value) {
        this.cession = value;
    }

    /**
     * Obtiene el valor de la propiedad deactivateAfterUsefulLife.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeactivateAfterUsefulLife() {
        return deactivateAfterUsefulLife;
    }

    /**
     * Define el valor de la propiedad deactivateAfterUsefulLife.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeactivateAfterUsefulLife(String value) {
        this.deactivateAfterUsefulLife = value;
    }

    /**
     * Obtiene el valor de la propiedad manageByQuantity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageByQuantity() {
        return manageByQuantity;
    }

    /**
     * Define el valor de la propiedad manageByQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageByQuantity(String value) {
        this.manageByQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad uoMGroupEntry.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUoMGroupEntry() {
        return uoMGroupEntry;
    }

    /**
     * Define el valor de la propiedad uoMGroupEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUoMGroupEntry(Long value) {
        this.uoMGroupEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad inventoryUoMEntry.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInventoryUoMEntry() {
        return inventoryUoMEntry;
    }

    /**
     * Define el valor de la propiedad inventoryUoMEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInventoryUoMEntry(Long value) {
        this.inventoryUoMEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultSalesUoMEntry.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDefaultSalesUoMEntry() {
        return defaultSalesUoMEntry;
    }

    /**
     * Define el valor de la propiedad defaultSalesUoMEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDefaultSalesUoMEntry(Long value) {
        this.defaultSalesUoMEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultPurchasingUoMEntry.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDefaultPurchasingUoMEntry() {
        return defaultPurchasingUoMEntry;
    }

    /**
     * Define el valor de la propiedad defaultPurchasingUoMEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDefaultPurchasingUoMEntry(Long value) {
        this.defaultPurchasingUoMEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad depreciationGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepreciationGroup() {
        return depreciationGroup;
    }

    /**
     * Define el valor de la propiedad depreciationGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepreciationGroup(String value) {
        this.depreciationGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad assetSerialNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetSerialNumber() {
        return assetSerialNumber;
    }

    /**
     * Define el valor de la propiedad assetSerialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetSerialNumber(String value) {
        this.assetSerialNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad itemPrices.
     * 
     * @return
     *     possible object is
     *     {@link Item.ItemPrices }
     *     
     */
    public Item.ItemPrices getItemPrices() {
        return itemPrices;
    }

    /**
     * Define el valor de la propiedad itemPrices.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.ItemPrices }
     *     
     */
    public void setItemPrices(Item.ItemPrices value) {
        this.itemPrices = value;
    }

    /**
     * Obtiene el valor de la propiedad itemWarehouseInfoCollection.
     * 
     * @return
     *     possible object is
     *     {@link Item.ItemWarehouseInfoCollection }
     *     
     */
    public Item.ItemWarehouseInfoCollection getItemWarehouseInfoCollection() {
        return itemWarehouseInfoCollection;
    }

    /**
     * Define el valor de la propiedad itemWarehouseInfoCollection.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.ItemWarehouseInfoCollection }
     *     
     */
    public void setItemWarehouseInfoCollection(Item.ItemWarehouseInfoCollection value) {
        this.itemWarehouseInfoCollection = value;
    }

    /**
     * Obtiene el valor de la propiedad itemPreferredVendors.
     * 
     * @return
     *     possible object is
     *     {@link Item.ItemPreferredVendors }
     *     
     */
    public Item.ItemPreferredVendors getItemPreferredVendors() {
        return itemPreferredVendors;
    }

    /**
     * Define el valor de la propiedad itemPreferredVendors.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.ItemPreferredVendors }
     *     
     */
    public void setItemPreferredVendors(Item.ItemPreferredVendors value) {
        this.itemPreferredVendors = value;
    }

    /**
     * Obtiene el valor de la propiedad itemLocalizationInfos.
     * 
     * @return
     *     possible object is
     *     {@link Item.ItemLocalizationInfos }
     *     
     */
    public Item.ItemLocalizationInfos getItemLocalizationInfos() {
        return itemLocalizationInfos;
    }

    /**
     * Define el valor de la propiedad itemLocalizationInfos.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.ItemLocalizationInfos }
     *     
     */
    public void setItemLocalizationInfos(Item.ItemLocalizationInfos value) {
        this.itemLocalizationInfos = value;
    }

    /**
     * Obtiene el valor de la propiedad itemProjects.
     * 
     * @return
     *     possible object is
     *     {@link Item.ItemProjects }
     *     
     */
    public Item.ItemProjects getItemProjects() {
        return itemProjects;
    }

    /**
     * Define el valor de la propiedad itemProjects.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.ItemProjects }
     *     
     */
    public void setItemProjects(Item.ItemProjects value) {
        this.itemProjects = value;
    }

    /**
     * Obtiene el valor de la propiedad itemDistributionRules.
     * 
     * @return
     *     possible object is
     *     {@link Item.ItemDistributionRules }
     *     
     */
    public Item.ItemDistributionRules getItemDistributionRules() {
        return itemDistributionRules;
    }

    /**
     * Define el valor de la propiedad itemDistributionRules.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.ItemDistributionRules }
     *     
     */
    public void setItemDistributionRules(Item.ItemDistributionRules value) {
        this.itemDistributionRules = value;
    }

    /**
     * Obtiene el valor de la propiedad itemAttributeGroups.
     * 
     * @return
     *     possible object is
     *     {@link Item.ItemAttributeGroups }
     *     
     */
    public Item.ItemAttributeGroups getItemAttributeGroups() {
        return itemAttributeGroups;
    }

    /**
     * Define el valor de la propiedad itemAttributeGroups.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.ItemAttributeGroups }
     *     
     */
    public void setItemAttributeGroups(Item.ItemAttributeGroups value) {
        this.itemAttributeGroups = value;
    }

    /**
     * Obtiene el valor de la propiedad itemDepreciationParameters.
     * 
     * @return
     *     possible object is
     *     {@link Item.ItemDepreciationParameters }
     *     
     */
    public Item.ItemDepreciationParameters getItemDepreciationParameters() {
        return itemDepreciationParameters;
    }

    /**
     * Define el valor de la propiedad itemDepreciationParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.ItemDepreciationParameters }
     *     
     */
    public void setItemDepreciationParameters(Item.ItemDepreciationParameters value) {
        this.itemDepreciationParameters = value;
    }

    /**
     * Obtiene el valor de la propiedad itemPeriodControls.
     * 
     * @return
     *     possible object is
     *     {@link Item.ItemPeriodControls }
     *     
     */
    public Item.ItemPeriodControls getItemPeriodControls() {
        return itemPeriodControls;
    }

    /**
     * Define el valor de la propiedad itemPeriodControls.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.ItemPeriodControls }
     *     
     */
    public void setItemPeriodControls(Item.ItemPeriodControls value) {
        this.itemPeriodControls = value;
    }

    /**
     * Obtiene el valor de la propiedad itemUnitOfMeasurementCollection.
     * 
     * @return
     *     possible object is
     *     {@link Item.ItemUnitOfMeasurementCollection }
     *     
     */
    public Item.ItemUnitOfMeasurementCollection getItemUnitOfMeasurementCollection() {
        return itemUnitOfMeasurementCollection;
    }

    /**
     * Define el valor de la propiedad itemUnitOfMeasurementCollection.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.ItemUnitOfMeasurementCollection }
     *     
     */
    public void setItemUnitOfMeasurementCollection(Item.ItemUnitOfMeasurementCollection value) {
        this.itemUnitOfMeasurementCollection = value;
    }

    /**
     * Obtiene el valor de la propiedad itemBarCodeCollection.
     * 
     * @return
     *     possible object is
     *     {@link Item.ItemBarCodeCollection }
     *     
     */
    public Item.ItemBarCodeCollection getItemBarCodeCollection() {
        return itemBarCodeCollection;
    }

    /**
     * Define el valor de la propiedad itemBarCodeCollection.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.ItemBarCodeCollection }
     *     
     */
    public void setItemBarCodeCollection(Item.ItemBarCodeCollection value) {
        this.itemBarCodeCollection = value;
    }

    /**
     * Obtiene el valor de la propiedad itemIntrastatExtension.
     * 
     * @return
     *     possible object is
     *     {@link Item.ItemIntrastatExtension }
     *     
     */
    public Item.ItemIntrastatExtension getItemIntrastatExtension() {
        return itemIntrastatExtension;
    }

    /**
     * Define el valor de la propiedad itemIntrastatExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.ItemIntrastatExtension }
     *     
     */
    public void setItemIntrastatExtension(Item.ItemIntrastatExtension value) {
        this.itemIntrastatExtension = value;
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
     *         &lt;element name="ItemAttributeGroups" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="Attribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Attribute33" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Attribute34" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Attribute35" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Attribute36" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Attribute37" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Attribute38" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Attribute39" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Attribute40" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Attribute41" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Attribute42" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Attribute43" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="Attribute44" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="Attribute45" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="Attribute46" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="Attribute47" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="Attribute48" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Attribute49" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Attribute50" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Attribute51" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Attribute52" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Attribute53" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Attribute54" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Attribute55" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Attribute56" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Attribute57" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Attribute58" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Attribute59" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Attribute60" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Attribute61" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Attribute62" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Attribute63" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Attribute64" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        "itemAttributeGroups"
    })
    public static class ItemAttributeGroups {

        @XmlElement(name = "ItemAttributeGroups")
        protected List<Item.ItemAttributeGroups.ItemAttributeGroups> itemAttributeGroups;

        /**
         * Gets the value of the itemAttributeGroups property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemAttributeGroups property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemAttributeGroups().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemAttributeGroups.ItemAttributeGroups }
         * 
         * 
         */
        public List<Item.ItemAttributeGroups.ItemAttributeGroups> getItemAttributeGroups() {
            if (itemAttributeGroups == null) {
                itemAttributeGroups = new ArrayList<Item.ItemAttributeGroups.ItemAttributeGroups>();
            }
            return this.itemAttributeGroups;
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
         *         &lt;element name="Attribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Attribute33" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Attribute34" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Attribute35" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Attribute36" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Attribute37" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Attribute38" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Attribute39" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Attribute40" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Attribute41" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Attribute42" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Attribute43" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="Attribute44" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="Attribute45" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="Attribute46" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="Attribute47" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="Attribute48" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Attribute49" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Attribute50" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Attribute51" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Attribute52" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Attribute53" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Attribute54" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Attribute55" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Attribute56" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Attribute57" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Attribute58" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Attribute59" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Attribute60" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Attribute61" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Attribute62" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Attribute63" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Attribute64" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        public static class ItemAttributeGroups {

            @XmlElement(name = "Attribute1")
            protected String attribute1;
            @XmlElement(name = "Attribute2")
            protected String attribute2;
            @XmlElement(name = "Attribute3")
            protected String attribute3;
            @XmlElement(name = "Attribute4")
            protected String attribute4;
            @XmlElement(name = "Attribute5")
            protected String attribute5;
            @XmlElement(name = "Attribute6")
            protected String attribute6;
            @XmlElement(name = "Attribute7")
            protected String attribute7;
            @XmlElement(name = "Attribute8")
            protected String attribute8;
            @XmlElement(name = "Attribute9")
            protected String attribute9;
            @XmlElement(name = "Attribute10")
            protected String attribute10;
            @XmlElement(name = "Attribute11")
            protected String attribute11;
            @XmlElement(name = "Attribute12")
            protected String attribute12;
            @XmlElement(name = "Attribute13")
            protected String attribute13;
            @XmlElement(name = "Attribute14")
            protected String attribute14;
            @XmlElement(name = "Attribute15")
            protected String attribute15;
            @XmlElement(name = "Attribute16")
            protected String attribute16;
            @XmlElement(name = "Attribute17")
            protected String attribute17;
            @XmlElement(name = "Attribute18")
            protected String attribute18;
            @XmlElement(name = "Attribute19")
            protected String attribute19;
            @XmlElement(name = "Attribute20")
            protected String attribute20;
            @XmlElement(name = "Attribute21")
            protected String attribute21;
            @XmlElement(name = "Attribute22")
            protected String attribute22;
            @XmlElement(name = "Attribute23")
            protected String attribute23;
            @XmlElement(name = "Attribute24")
            protected String attribute24;
            @XmlElement(name = "Attribute25")
            protected String attribute25;
            @XmlElement(name = "Attribute26")
            protected String attribute26;
            @XmlElement(name = "Attribute27")
            protected String attribute27;
            @XmlElement(name = "Attribute28")
            protected String attribute28;
            @XmlElement(name = "Attribute29")
            protected String attribute29;
            @XmlElement(name = "Attribute30")
            protected String attribute30;
            @XmlElement(name = "Attribute31")
            protected String attribute31;
            @XmlElement(name = "Attribute32")
            protected String attribute32;
            @XmlElement(name = "Attribute33")
            protected Long attribute33;
            @XmlElement(name = "Attribute34")
            protected Long attribute34;
            @XmlElement(name = "Attribute35")
            protected Long attribute35;
            @XmlElement(name = "Attribute36")
            protected Long attribute36;
            @XmlElement(name = "Attribute37")
            protected Long attribute37;
            @XmlElement(name = "Attribute38")
            protected Long attribute38;
            @XmlElement(name = "Attribute39")
            protected Long attribute39;
            @XmlElement(name = "Attribute40")
            protected Long attribute40;
            @XmlElement(name = "Attribute41")
            protected Long attribute41;
            @XmlElement(name = "Attribute42")
            protected Long attribute42;
            @XmlElement(name = "Attribute43")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar attribute43;
            @XmlElement(name = "Attribute44")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar attribute44;
            @XmlElement(name = "Attribute45")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar attribute45;
            @XmlElement(name = "Attribute46")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar attribute46;
            @XmlElement(name = "Attribute47")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar attribute47;
            @XmlElement(name = "Attribute48")
            protected Double attribute48;
            @XmlElement(name = "Attribute49")
            protected Double attribute49;
            @XmlElement(name = "Attribute50")
            protected Double attribute50;
            @XmlElement(name = "Attribute51")
            protected Double attribute51;
            @XmlElement(name = "Attribute52")
            protected Double attribute52;
            @XmlElement(name = "Attribute53")
            protected Double attribute53;
            @XmlElement(name = "Attribute54")
            protected Double attribute54;
            @XmlElement(name = "Attribute55")
            protected Double attribute55;
            @XmlElement(name = "Attribute56")
            protected Double attribute56;
            @XmlElement(name = "Attribute57")
            protected Double attribute57;
            @XmlElement(name = "Attribute58")
            protected Double attribute58;
            @XmlElement(name = "Attribute59")
            protected Double attribute59;
            @XmlElement(name = "Attribute60")
            protected Double attribute60;
            @XmlElement(name = "Attribute61")
            protected Double attribute61;
            @XmlElement(name = "Attribute62")
            protected Double attribute62;
            @XmlElement(name = "Attribute63")
            protected Double attribute63;
            @XmlElement(name = "Attribute64")
            protected Double attribute64;

            /**
             * Obtiene el valor de la propiedad attribute1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute1() {
                return attribute1;
            }

            /**
             * Define el valor de la propiedad attribute1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute1(String value) {
                this.attribute1 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute2() {
                return attribute2;
            }

            /**
             * Define el valor de la propiedad attribute2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute2(String value) {
                this.attribute2 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute3() {
                return attribute3;
            }

            /**
             * Define el valor de la propiedad attribute3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute3(String value) {
                this.attribute3 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute4.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute4() {
                return attribute4;
            }

            /**
             * Define el valor de la propiedad attribute4.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute4(String value) {
                this.attribute4 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute5.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute5() {
                return attribute5;
            }

            /**
             * Define el valor de la propiedad attribute5.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute5(String value) {
                this.attribute5 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute6.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute6() {
                return attribute6;
            }

            /**
             * Define el valor de la propiedad attribute6.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute6(String value) {
                this.attribute6 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute7.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute7() {
                return attribute7;
            }

            /**
             * Define el valor de la propiedad attribute7.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute7(String value) {
                this.attribute7 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute8.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute8() {
                return attribute8;
            }

            /**
             * Define el valor de la propiedad attribute8.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute8(String value) {
                this.attribute8 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute9() {
                return attribute9;
            }

            /**
             * Define el valor de la propiedad attribute9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute9(String value) {
                this.attribute9 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute10.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute10() {
                return attribute10;
            }

            /**
             * Define el valor de la propiedad attribute10.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute10(String value) {
                this.attribute10 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute11.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute11() {
                return attribute11;
            }

            /**
             * Define el valor de la propiedad attribute11.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute11(String value) {
                this.attribute11 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute12.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute12() {
                return attribute12;
            }

            /**
             * Define el valor de la propiedad attribute12.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute12(String value) {
                this.attribute12 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute13.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute13() {
                return attribute13;
            }

            /**
             * Define el valor de la propiedad attribute13.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute13(String value) {
                this.attribute13 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute14.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute14() {
                return attribute14;
            }

            /**
             * Define el valor de la propiedad attribute14.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute14(String value) {
                this.attribute14 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute15.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute15() {
                return attribute15;
            }

            /**
             * Define el valor de la propiedad attribute15.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute15(String value) {
                this.attribute15 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute16.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute16() {
                return attribute16;
            }

            /**
             * Define el valor de la propiedad attribute16.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute16(String value) {
                this.attribute16 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute17.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute17() {
                return attribute17;
            }

            /**
             * Define el valor de la propiedad attribute17.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute17(String value) {
                this.attribute17 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute18.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute18() {
                return attribute18;
            }

            /**
             * Define el valor de la propiedad attribute18.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute18(String value) {
                this.attribute18 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute19.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute19() {
                return attribute19;
            }

            /**
             * Define el valor de la propiedad attribute19.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute19(String value) {
                this.attribute19 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute20.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute20() {
                return attribute20;
            }

            /**
             * Define el valor de la propiedad attribute20.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute20(String value) {
                this.attribute20 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute21.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute21() {
                return attribute21;
            }

            /**
             * Define el valor de la propiedad attribute21.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute21(String value) {
                this.attribute21 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute22.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute22() {
                return attribute22;
            }

            /**
             * Define el valor de la propiedad attribute22.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute22(String value) {
                this.attribute22 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute23.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute23() {
                return attribute23;
            }

            /**
             * Define el valor de la propiedad attribute23.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute23(String value) {
                this.attribute23 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute24.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute24() {
                return attribute24;
            }

            /**
             * Define el valor de la propiedad attribute24.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute24(String value) {
                this.attribute24 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute25.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute25() {
                return attribute25;
            }

            /**
             * Define el valor de la propiedad attribute25.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute25(String value) {
                this.attribute25 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute26.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute26() {
                return attribute26;
            }

            /**
             * Define el valor de la propiedad attribute26.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute26(String value) {
                this.attribute26 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute27.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute27() {
                return attribute27;
            }

            /**
             * Define el valor de la propiedad attribute27.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute27(String value) {
                this.attribute27 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute28.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute28() {
                return attribute28;
            }

            /**
             * Define el valor de la propiedad attribute28.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute28(String value) {
                this.attribute28 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute29.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute29() {
                return attribute29;
            }

            /**
             * Define el valor de la propiedad attribute29.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute29(String value) {
                this.attribute29 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute30.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute30() {
                return attribute30;
            }

            /**
             * Define el valor de la propiedad attribute30.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute30(String value) {
                this.attribute30 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute31.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute31() {
                return attribute31;
            }

            /**
             * Define el valor de la propiedad attribute31.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute31(String value) {
                this.attribute31 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute32.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute32() {
                return attribute32;
            }

            /**
             * Define el valor de la propiedad attribute32.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute32(String value) {
                this.attribute32 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute33.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAttribute33() {
                return attribute33;
            }

            /**
             * Define el valor de la propiedad attribute33.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAttribute33(Long value) {
                this.attribute33 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute34.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAttribute34() {
                return attribute34;
            }

            /**
             * Define el valor de la propiedad attribute34.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAttribute34(Long value) {
                this.attribute34 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute35.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAttribute35() {
                return attribute35;
            }

            /**
             * Define el valor de la propiedad attribute35.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAttribute35(Long value) {
                this.attribute35 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute36.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAttribute36() {
                return attribute36;
            }

            /**
             * Define el valor de la propiedad attribute36.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAttribute36(Long value) {
                this.attribute36 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute37.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAttribute37() {
                return attribute37;
            }

            /**
             * Define el valor de la propiedad attribute37.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAttribute37(Long value) {
                this.attribute37 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute38.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAttribute38() {
                return attribute38;
            }

            /**
             * Define el valor de la propiedad attribute38.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAttribute38(Long value) {
                this.attribute38 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute39.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAttribute39() {
                return attribute39;
            }

            /**
             * Define el valor de la propiedad attribute39.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAttribute39(Long value) {
                this.attribute39 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute40.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAttribute40() {
                return attribute40;
            }

            /**
             * Define el valor de la propiedad attribute40.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAttribute40(Long value) {
                this.attribute40 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute41.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAttribute41() {
                return attribute41;
            }

            /**
             * Define el valor de la propiedad attribute41.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAttribute41(Long value) {
                this.attribute41 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute42.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAttribute42() {
                return attribute42;
            }

            /**
             * Define el valor de la propiedad attribute42.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAttribute42(Long value) {
                this.attribute42 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute43.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAttribute43() {
                return attribute43;
            }

            /**
             * Define el valor de la propiedad attribute43.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAttribute43(XMLGregorianCalendar value) {
                this.attribute43 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute44.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAttribute44() {
                return attribute44;
            }

            /**
             * Define el valor de la propiedad attribute44.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAttribute44(XMLGregorianCalendar value) {
                this.attribute44 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute45.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAttribute45() {
                return attribute45;
            }

            /**
             * Define el valor de la propiedad attribute45.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAttribute45(XMLGregorianCalendar value) {
                this.attribute45 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute46.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAttribute46() {
                return attribute46;
            }

            /**
             * Define el valor de la propiedad attribute46.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAttribute46(XMLGregorianCalendar value) {
                this.attribute46 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute47.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAttribute47() {
                return attribute47;
            }

            /**
             * Define el valor de la propiedad attribute47.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAttribute47(XMLGregorianCalendar value) {
                this.attribute47 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute48.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAttribute48() {
                return attribute48;
            }

            /**
             * Define el valor de la propiedad attribute48.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAttribute48(Double value) {
                this.attribute48 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute49.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAttribute49() {
                return attribute49;
            }

            /**
             * Define el valor de la propiedad attribute49.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAttribute49(Double value) {
                this.attribute49 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute50.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAttribute50() {
                return attribute50;
            }

            /**
             * Define el valor de la propiedad attribute50.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAttribute50(Double value) {
                this.attribute50 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute51.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAttribute51() {
                return attribute51;
            }

            /**
             * Define el valor de la propiedad attribute51.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAttribute51(Double value) {
                this.attribute51 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute52.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAttribute52() {
                return attribute52;
            }

            /**
             * Define el valor de la propiedad attribute52.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAttribute52(Double value) {
                this.attribute52 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute53.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAttribute53() {
                return attribute53;
            }

            /**
             * Define el valor de la propiedad attribute53.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAttribute53(Double value) {
                this.attribute53 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute54.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAttribute54() {
                return attribute54;
            }

            /**
             * Define el valor de la propiedad attribute54.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAttribute54(Double value) {
                this.attribute54 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute55.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAttribute55() {
                return attribute55;
            }

            /**
             * Define el valor de la propiedad attribute55.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAttribute55(Double value) {
                this.attribute55 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute56.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAttribute56() {
                return attribute56;
            }

            /**
             * Define el valor de la propiedad attribute56.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAttribute56(Double value) {
                this.attribute56 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute57.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAttribute57() {
                return attribute57;
            }

            /**
             * Define el valor de la propiedad attribute57.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAttribute57(Double value) {
                this.attribute57 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute58.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAttribute58() {
                return attribute58;
            }

            /**
             * Define el valor de la propiedad attribute58.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAttribute58(Double value) {
                this.attribute58 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute59.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAttribute59() {
                return attribute59;
            }

            /**
             * Define el valor de la propiedad attribute59.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAttribute59(Double value) {
                this.attribute59 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute60.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAttribute60() {
                return attribute60;
            }

            /**
             * Define el valor de la propiedad attribute60.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAttribute60(Double value) {
                this.attribute60 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute61.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAttribute61() {
                return attribute61;
            }

            /**
             * Define el valor de la propiedad attribute61.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAttribute61(Double value) {
                this.attribute61 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute62.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAttribute62() {
                return attribute62;
            }

            /**
             * Define el valor de la propiedad attribute62.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAttribute62(Double value) {
                this.attribute62 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute63.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAttribute63() {
                return attribute63;
            }

            /**
             * Define el valor de la propiedad attribute63.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAttribute63(Double value) {
                this.attribute63 = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute64.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAttribute64() {
                return attribute64;
            }

            /**
             * Define el valor de la propiedad attribute64.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAttribute64(Double value) {
                this.attribute64 = value;
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
     *         &lt;element name="ItemBarCode" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="AbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Barcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FreeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "itemBarCode"
    })
    public static class ItemBarCodeCollection {

        @XmlElement(name = "ItemBarCode")
        protected List<Item.ItemBarCodeCollection.ItemBarCode> itemBarCode;

        /**
         * Gets the value of the itemBarCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemBarCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemBarCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemBarCodeCollection.ItemBarCode }
         * 
         * 
         */
        public List<Item.ItemBarCodeCollection.ItemBarCode> getItemBarCode() {
            if (itemBarCode == null) {
                itemBarCode = new ArrayList<Item.ItemBarCodeCollection.ItemBarCode>();
            }
            return this.itemBarCode;
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
         *         &lt;element name="AbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Barcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FreeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        public static class ItemBarCode {

            @XmlElement(name = "AbsEntry")
            protected Long absEntry;
            @XmlElement(name = "UoMEntry")
            protected Long uoMEntry;
            @XmlElement(name = "Barcode")
            protected String barcode;
            @XmlElement(name = "FreeText")
            protected String freeText;

            /**
             * Obtiene el valor de la propiedad absEntry.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAbsEntry() {
                return absEntry;
            }

            /**
             * Define el valor de la propiedad absEntry.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAbsEntry(Long value) {
                this.absEntry = value;
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
             * Obtiene el valor de la propiedad barcode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBarcode() {
                return barcode;
            }

            /**
             * Define el valor de la propiedad barcode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBarcode(String value) {
                this.barcode = value;
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
     *         &lt;element name="ItemDepreciationParameter" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="FiscalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DepreciationArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DepreciationStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="DepreciationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="UsefulLife" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="RemainingLife" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="DepreciationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "itemDepreciationParameter"
    })
    public static class ItemDepreciationParameters {

        @XmlElement(name = "ItemDepreciationParameter")
        protected List<Item.ItemDepreciationParameters.ItemDepreciationParameter> itemDepreciationParameter;

        /**
         * Gets the value of the itemDepreciationParameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemDepreciationParameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemDepreciationParameter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemDepreciationParameters.ItemDepreciationParameter }
         * 
         * 
         */
        public List<Item.ItemDepreciationParameters.ItemDepreciationParameter> getItemDepreciationParameter() {
            if (itemDepreciationParameter == null) {
                itemDepreciationParameter = new ArrayList<Item.ItemDepreciationParameters.ItemDepreciationParameter>();
            }
            return this.itemDepreciationParameter;
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
         *         &lt;element name="FiscalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DepreciationArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DepreciationStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="DepreciationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="UsefulLife" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="RemainingLife" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="DepreciationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        public static class ItemDepreciationParameter {

            @XmlElement(name = "FiscalYear")
            protected String fiscalYear;
            @XmlElement(name = "DepreciationArea")
            protected String depreciationArea;
            @XmlElement(name = "DepreciationStartDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar depreciationStartDate;
            @XmlElement(name = "DepreciationEndDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar depreciationEndDate;
            @XmlElement(name = "UsefulLife")
            protected Long usefulLife;
            @XmlElement(name = "RemainingLife")
            protected Double remainingLife;
            @XmlElement(name = "DepreciationType")
            protected String depreciationType;

            /**
             * Obtiene el valor de la propiedad fiscalYear.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFiscalYear() {
                return fiscalYear;
            }

            /**
             * Define el valor de la propiedad fiscalYear.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFiscalYear(String value) {
                this.fiscalYear = value;
            }

            /**
             * Obtiene el valor de la propiedad depreciationArea.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepreciationArea() {
                return depreciationArea;
            }

            /**
             * Define el valor de la propiedad depreciationArea.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepreciationArea(String value) {
                this.depreciationArea = value;
            }

            /**
             * Obtiene el valor de la propiedad depreciationStartDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDepreciationStartDate() {
                return depreciationStartDate;
            }

            /**
             * Define el valor de la propiedad depreciationStartDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDepreciationStartDate(XMLGregorianCalendar value) {
                this.depreciationStartDate = value;
            }

            /**
             * Obtiene el valor de la propiedad depreciationEndDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDepreciationEndDate() {
                return depreciationEndDate;
            }

            /**
             * Define el valor de la propiedad depreciationEndDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDepreciationEndDate(XMLGregorianCalendar value) {
                this.depreciationEndDate = value;
            }

            /**
             * Obtiene el valor de la propiedad usefulLife.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getUsefulLife() {
                return usefulLife;
            }

            /**
             * Define el valor de la propiedad usefulLife.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setUsefulLife(Long value) {
                this.usefulLife = value;
            }

            /**
             * Obtiene el valor de la propiedad remainingLife.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getRemainingLife() {
                return remainingLife;
            }

            /**
             * Define el valor de la propiedad remainingLife.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setRemainingLife(Double value) {
                this.remainingLife = value;
            }

            /**
             * Obtiene el valor de la propiedad depreciationType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepreciationType() {
                return depreciationType;
            }

            /**
             * Define el valor de la propiedad depreciationType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepreciationType(String value) {
                this.depreciationType = value;
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
     *         &lt;element name="ItemDistributionRule" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "itemDistributionRule"
    })
    public static class ItemDistributionRules {

        @XmlElement(name = "ItemDistributionRule")
        protected List<Item.ItemDistributionRules.ItemDistributionRule> itemDistributionRule;

        /**
         * Gets the value of the itemDistributionRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemDistributionRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemDistributionRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemDistributionRules.ItemDistributionRule }
         * 
         * 
         */
        public List<Item.ItemDistributionRules.ItemDistributionRule> getItemDistributionRule() {
            if (itemDistributionRule == null) {
                itemDistributionRule = new ArrayList<Item.ItemDistributionRules.ItemDistributionRule>();
            }
            return this.itemDistributionRule;
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
         *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        public static class ItemDistributionRule {

            @XmlElement(name = "LineNumber")
            protected String lineNumber;
            @XmlElement(name = "ValidFrom")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar validFrom;
            @XmlElement(name = "ValidTo")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar validTo;
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

            /**
             * Obtiene el valor de la propiedad lineNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLineNumber() {
                return lineNumber;
            }

            /**
             * Define el valor de la propiedad lineNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLineNumber(String value) {
                this.lineNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad validFrom.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getValidFrom() {
                return validFrom;
            }

            /**
             * Define el valor de la propiedad validFrom.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setValidFrom(XMLGregorianCalendar value) {
                this.validFrom = value;
            }

            /**
             * Obtiene el valor de la propiedad validTo.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getValidTo() {
                return validTo;
            }

            /**
             * Define el valor de la propiedad validTo.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setValidTo(XMLGregorianCalendar value) {
                this.validTo = value;
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
     *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CommodityCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="SupplementaryUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="FactorOfSupplementaryUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="ImportRegionState" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="ExportRegionState" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="ImportNatureOfTransaction" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="ExportNatureOfTransaction" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="ImportStatisticalProcedure" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="ExportStatisticalProcedure" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="CountryOfOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="Type" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="dDocument_Items"/>
     *               &lt;enumeration value="dDocument_Service"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ServiceSupplyMethod" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="ssmImmediate"/>
     *               &lt;enumeration value="ssmToMoreResumptions"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ServicePaymentMethod" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="spmAccreditedToBankAccount"/>
     *               &lt;enumeration value="spmBankTransfer"/>
     *               &lt;enumeration value="spmOther"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ImportRegionCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ExportRegionCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UseWeightInCalculation" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="tNO"/>
     *               &lt;enumeration value="tYES"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="IntrastatRelevant" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="tNO"/>
     *               &lt;enumeration value="tYES"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="StatisticalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class ItemIntrastatExtension {

        @XmlElement(name = "ItemCode")
        protected String itemCode;
        @XmlElement(name = "CommodityCode")
        protected Long commodityCode;
        @XmlElement(name = "SupplementaryUnit")
        protected Long supplementaryUnit;
        @XmlElement(name = "FactorOfSupplementaryUnit")
        protected Double factorOfSupplementaryUnit;
        @XmlElement(name = "ImportRegionState")
        protected Long importRegionState;
        @XmlElement(name = "ExportRegionState")
        protected Long exportRegionState;
        @XmlElement(name = "ImportNatureOfTransaction")
        protected Long importNatureOfTransaction;
        @XmlElement(name = "ExportNatureOfTransaction")
        protected Long exportNatureOfTransaction;
        @XmlElement(name = "ImportStatisticalProcedure")
        protected Long importStatisticalProcedure;
        @XmlElement(name = "ExportStatisticalProcedure")
        protected Long exportStatisticalProcedure;
        @XmlElement(name = "CountryOfOrigin")
        protected String countryOfOrigin;
        @XmlElement(name = "ServiceCode")
        protected Long serviceCode;
        @XmlElement(name = "Type")
        protected String type;
        @XmlElement(name = "ServiceSupplyMethod")
        protected String serviceSupplyMethod;
        @XmlElement(name = "ServicePaymentMethod")
        protected String servicePaymentMethod;
        @XmlElement(name = "ImportRegionCountry")
        protected String importRegionCountry;
        @XmlElement(name = "ExportRegionCountry")
        protected String exportRegionCountry;
        @XmlElement(name = "UseWeightInCalculation")
        protected String useWeightInCalculation;
        @XmlElement(name = "IntrastatRelevant")
        protected String intrastatRelevant;
        @XmlElement(name = "StatisticalCode")
        protected String statisticalCode;

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
         * Obtiene el valor de la propiedad commodityCode.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getCommodityCode() {
            return commodityCode;
        }

        /**
         * Define el valor de la propiedad commodityCode.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setCommodityCode(Long value) {
            this.commodityCode = value;
        }

        /**
         * Obtiene el valor de la propiedad supplementaryUnit.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getSupplementaryUnit() {
            return supplementaryUnit;
        }

        /**
         * Define el valor de la propiedad supplementaryUnit.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setSupplementaryUnit(Long value) {
            this.supplementaryUnit = value;
        }

        /**
         * Obtiene el valor de la propiedad factorOfSupplementaryUnit.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getFactorOfSupplementaryUnit() {
            return factorOfSupplementaryUnit;
        }

        /**
         * Define el valor de la propiedad factorOfSupplementaryUnit.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setFactorOfSupplementaryUnit(Double value) {
            this.factorOfSupplementaryUnit = value;
        }

        /**
         * Obtiene el valor de la propiedad importRegionState.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getImportRegionState() {
            return importRegionState;
        }

        /**
         * Define el valor de la propiedad importRegionState.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setImportRegionState(Long value) {
            this.importRegionState = value;
        }

        /**
         * Obtiene el valor de la propiedad exportRegionState.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getExportRegionState() {
            return exportRegionState;
        }

        /**
         * Define el valor de la propiedad exportRegionState.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setExportRegionState(Long value) {
            this.exportRegionState = value;
        }

        /**
         * Obtiene el valor de la propiedad importNatureOfTransaction.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getImportNatureOfTransaction() {
            return importNatureOfTransaction;
        }

        /**
         * Define el valor de la propiedad importNatureOfTransaction.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setImportNatureOfTransaction(Long value) {
            this.importNatureOfTransaction = value;
        }

        /**
         * Obtiene el valor de la propiedad exportNatureOfTransaction.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getExportNatureOfTransaction() {
            return exportNatureOfTransaction;
        }

        /**
         * Define el valor de la propiedad exportNatureOfTransaction.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setExportNatureOfTransaction(Long value) {
            this.exportNatureOfTransaction = value;
        }

        /**
         * Obtiene el valor de la propiedad importStatisticalProcedure.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getImportStatisticalProcedure() {
            return importStatisticalProcedure;
        }

        /**
         * Define el valor de la propiedad importStatisticalProcedure.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setImportStatisticalProcedure(Long value) {
            this.importStatisticalProcedure = value;
        }

        /**
         * Obtiene el valor de la propiedad exportStatisticalProcedure.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getExportStatisticalProcedure() {
            return exportStatisticalProcedure;
        }

        /**
         * Define el valor de la propiedad exportStatisticalProcedure.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setExportStatisticalProcedure(Long value) {
            this.exportStatisticalProcedure = value;
        }

        /**
         * Obtiene el valor de la propiedad countryOfOrigin.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryOfOrigin() {
            return countryOfOrigin;
        }

        /**
         * Define el valor de la propiedad countryOfOrigin.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryOfOrigin(String value) {
            this.countryOfOrigin = value;
        }

        /**
         * Obtiene el valor de la propiedad serviceCode.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getServiceCode() {
            return serviceCode;
        }

        /**
         * Define el valor de la propiedad serviceCode.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setServiceCode(Long value) {
            this.serviceCode = value;
        }

        /**
         * Obtiene el valor de la propiedad type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Define el valor de la propiedad type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Obtiene el valor de la propiedad serviceSupplyMethod.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceSupplyMethod() {
            return serviceSupplyMethod;
        }

        /**
         * Define el valor de la propiedad serviceSupplyMethod.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceSupplyMethod(String value) {
            this.serviceSupplyMethod = value;
        }

        /**
         * Obtiene el valor de la propiedad servicePaymentMethod.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServicePaymentMethod() {
            return servicePaymentMethod;
        }

        /**
         * Define el valor de la propiedad servicePaymentMethod.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServicePaymentMethod(String value) {
            this.servicePaymentMethod = value;
        }

        /**
         * Obtiene el valor de la propiedad importRegionCountry.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImportRegionCountry() {
            return importRegionCountry;
        }

        /**
         * Define el valor de la propiedad importRegionCountry.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImportRegionCountry(String value) {
            this.importRegionCountry = value;
        }

        /**
         * Obtiene el valor de la propiedad exportRegionCountry.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExportRegionCountry() {
            return exportRegionCountry;
        }

        /**
         * Define el valor de la propiedad exportRegionCountry.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExportRegionCountry(String value) {
            this.exportRegionCountry = value;
        }

        /**
         * Obtiene el valor de la propiedad useWeightInCalculation.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUseWeightInCalculation() {
            return useWeightInCalculation;
        }

        /**
         * Define el valor de la propiedad useWeightInCalculation.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUseWeightInCalculation(String value) {
            this.useWeightInCalculation = value;
        }

        /**
         * Obtiene el valor de la propiedad intrastatRelevant.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntrastatRelevant() {
            return intrastatRelevant;
        }

        /**
         * Define el valor de la propiedad intrastatRelevant.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntrastatRelevant(String value) {
            this.intrastatRelevant = value;
        }

        /**
         * Obtiene el valor de la propiedad statisticalCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatisticalCode() {
            return statisticalCode;
        }

        /**
         * Define el valor de la propiedad statisticalCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatisticalCode(String value) {
            this.statisticalCode = value;
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
     *         &lt;element name="ItemLocalizationInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="IncomeNature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "itemLocalizationInfo"
    })
    public static class ItemLocalizationInfos {

        @XmlElement(name = "ItemLocalizationInfo")
        protected List<Item.ItemLocalizationInfos.ItemLocalizationInfo> itemLocalizationInfo;

        /**
         * Gets the value of the itemLocalizationInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemLocalizationInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemLocalizationInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemLocalizationInfos.ItemLocalizationInfo }
         * 
         * 
         */
        public List<Item.ItemLocalizationInfos.ItemLocalizationInfo> getItemLocalizationInfo() {
            if (itemLocalizationInfo == null) {
                itemLocalizationInfo = new ArrayList<Item.ItemLocalizationInfos.ItemLocalizationInfo>();
            }
            return this.itemLocalizationInfo;
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
         *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="IncomeNature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        public static class ItemLocalizationInfo {

            @XmlElement(name = "ItemCode")
            protected String itemCode;
            @XmlElement(name = "IncomeNature")
            protected String incomeNature;

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
             * Obtiene el valor de la propiedad incomeNature.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIncomeNature() {
                return incomeNature;
            }

            /**
             * Define el valor de la propiedad incomeNature.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIncomeNature(String value) {
                this.incomeNature = value;
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
     *         &lt;element name="ItemPeriodControl" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="FiscalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DepreciationArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SubPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="DepreciationStatus" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        "itemPeriodControl"
    })
    public static class ItemPeriodControls {

        @XmlElement(name = "ItemPeriodControl")
        protected List<Item.ItemPeriodControls.ItemPeriodControl> itemPeriodControl;

        /**
         * Gets the value of the itemPeriodControl property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemPeriodControl property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemPeriodControl().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemPeriodControls.ItemPeriodControl }
         * 
         * 
         */
        public List<Item.ItemPeriodControls.ItemPeriodControl> getItemPeriodControl() {
            if (itemPeriodControl == null) {
                itemPeriodControl = new ArrayList<Item.ItemPeriodControls.ItemPeriodControl>();
            }
            return this.itemPeriodControl;
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
         *         &lt;element name="FiscalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DepreciationArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SubPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="DepreciationStatus" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        public static class ItemPeriodControl {

            @XmlElement(name = "FiscalYear")
            protected String fiscalYear;
            @XmlElement(name = "DepreciationArea")
            protected String depreciationArea;
            @XmlElement(name = "SubPeriod")
            protected Long subPeriod;
            @XmlElement(name = "DepreciationStatus")
            protected String depreciationStatus;
            @XmlElement(name = "Factor")
            protected Double factor;

            /**
             * Obtiene el valor de la propiedad fiscalYear.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFiscalYear() {
                return fiscalYear;
            }

            /**
             * Define el valor de la propiedad fiscalYear.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFiscalYear(String value) {
                this.fiscalYear = value;
            }

            /**
             * Obtiene el valor de la propiedad depreciationArea.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepreciationArea() {
                return depreciationArea;
            }

            /**
             * Define el valor de la propiedad depreciationArea.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepreciationArea(String value) {
                this.depreciationArea = value;
            }

            /**
             * Obtiene el valor de la propiedad subPeriod.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getSubPeriod() {
                return subPeriod;
            }

            /**
             * Define el valor de la propiedad subPeriod.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setSubPeriod(Long value) {
                this.subPeriod = value;
            }

            /**
             * Obtiene el valor de la propiedad depreciationStatus.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepreciationStatus() {
                return depreciationStatus;
            }

            /**
             * Define el valor de la propiedad depreciationStatus.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepreciationStatus(String value) {
                this.depreciationStatus = value;
            }

            /**
             * Obtiene el valor de la propiedad factor.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getFactor() {
                return factor;
            }

            /**
             * Define el valor de la propiedad factor.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setFactor(Double value) {
                this.factor = value;
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
     *         &lt;element name="ItemPreferredVendor" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="BPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "itemPreferredVendor"
    })
    public static class ItemPreferredVendors {

        @XmlElement(name = "ItemPreferredVendor")
        protected List<Item.ItemPreferredVendors.ItemPreferredVendor> itemPreferredVendor;

        /**
         * Gets the value of the itemPreferredVendor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemPreferredVendor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemPreferredVendor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemPreferredVendors.ItemPreferredVendor }
         * 
         * 
         */
        public List<Item.ItemPreferredVendors.ItemPreferredVendor> getItemPreferredVendor() {
            if (itemPreferredVendor == null) {
                itemPreferredVendor = new ArrayList<Item.ItemPreferredVendors.ItemPreferredVendor>();
            }
            return this.itemPreferredVendor;
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
         *         &lt;element name="BPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        public static class ItemPreferredVendor {

            @XmlElement(name = "BPCode")
            protected String bpCode;

            /**
             * Obtiene el valor de la propiedad bpCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBPCode() {
                return bpCode;
            }

            /**
             * Define el valor de la propiedad bpCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBPCode(String value) {
                this.bpCode = value;
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
     *         &lt;element name="ItemPrice" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AdditionalPrice1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AdditionalCurrency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AdditionalPrice2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AdditionalCurrency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UoMPrices" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="UoMPrice" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="ReduceBy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="AdditionalReduceBy1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="AdditionalPrice1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="AdditionalCurrency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="AdditionalReduceBy2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="AdditionalPrice2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="AdditionalCurrency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Auto" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="tNO"/>
     *                                             &lt;enumeration value="tYES"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
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
        "itemPrice"
    })
    public static class ItemPrices {

        @XmlElement(name = "ItemPrice")
        protected List<Item.ItemPrices.ItemPrice> itemPrice;

        /**
         * Gets the value of the itemPrice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemPrice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemPrice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemPrices.ItemPrice }
         * 
         * 
         */
        public List<Item.ItemPrices.ItemPrice> getItemPrice() {
            if (itemPrice == null) {
                itemPrice = new ArrayList<Item.ItemPrices.ItemPrice>();
            }
            return this.itemPrice;
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
         *         &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AdditionalPrice1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AdditionalCurrency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AdditionalPrice2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AdditionalCurrency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UoMPrices" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="UoMPrice" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="ReduceBy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="AdditionalReduceBy1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="AdditionalPrice1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="AdditionalCurrency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="AdditionalReduceBy2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="AdditionalPrice2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="AdditionalCurrency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Auto" minOccurs="0">
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
        public static class ItemPrice {

            @XmlElement(name = "PriceList")
            protected Long priceList;
            @XmlElement(name = "Price")
            protected Double price;
            @XmlElement(name = "Currency")
            protected String currency;
            @XmlElement(name = "AdditionalPrice1")
            protected Double additionalPrice1;
            @XmlElement(name = "AdditionalCurrency1")
            protected String additionalCurrency1;
            @XmlElement(name = "AdditionalPrice2")
            protected Double additionalPrice2;
            @XmlElement(name = "AdditionalCurrency2")
            protected String additionalCurrency2;
            @XmlElement(name = "UoMPrices")
            protected Item.ItemPrices.ItemPrice.UoMPrices uoMPrices;

            /**
             * Obtiene el valor de la propiedad priceList.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getPriceList() {
                return priceList;
            }

            /**
             * Define el valor de la propiedad priceList.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setPriceList(Long value) {
                this.priceList = value;
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
             * Obtiene el valor de la propiedad additionalPrice1.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAdditionalPrice1() {
                return additionalPrice1;
            }

            /**
             * Define el valor de la propiedad additionalPrice1.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAdditionalPrice1(Double value) {
                this.additionalPrice1 = value;
            }

            /**
             * Obtiene el valor de la propiedad additionalCurrency1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalCurrency1() {
                return additionalCurrency1;
            }

            /**
             * Define el valor de la propiedad additionalCurrency1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalCurrency1(String value) {
                this.additionalCurrency1 = value;
            }

            /**
             * Obtiene el valor de la propiedad additionalPrice2.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAdditionalPrice2() {
                return additionalPrice2;
            }

            /**
             * Define el valor de la propiedad additionalPrice2.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAdditionalPrice2(Double value) {
                this.additionalPrice2 = value;
            }

            /**
             * Obtiene el valor de la propiedad additionalCurrency2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalCurrency2() {
                return additionalCurrency2;
            }

            /**
             * Define el valor de la propiedad additionalCurrency2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalCurrency2(String value) {
                this.additionalCurrency2 = value;
            }

            /**
             * Obtiene el valor de la propiedad uoMPrices.
             * 
             * @return
             *     possible object is
             *     {@link Item.ItemPrices.ItemPrice.UoMPrices }
             *     
             */
            public Item.ItemPrices.ItemPrice.UoMPrices getUoMPrices() {
                return uoMPrices;
            }

            /**
             * Define el valor de la propiedad uoMPrices.
             * 
             * @param value
             *     allowed object is
             *     {@link Item.ItemPrices.ItemPrice.UoMPrices }
             *     
             */
            public void setUoMPrices(Item.ItemPrices.ItemPrice.UoMPrices value) {
                this.uoMPrices = value;
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
             *         &lt;element name="UoMPrice" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="ReduceBy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="AdditionalReduceBy1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="AdditionalPrice1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="AdditionalCurrency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="AdditionalReduceBy2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="AdditionalPrice2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="AdditionalCurrency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Auto" minOccurs="0">
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
                "uoMPrice"
            })
            public static class UoMPrices {

                @XmlElement(name = "UoMPrice")
                protected List<Item.ItemPrices.ItemPrice.UoMPrices.UoMPrice> uoMPrice;

                /**
                 * Gets the value of the uoMPrice property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the uoMPrice property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getUoMPrice().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Item.ItemPrices.ItemPrice.UoMPrices.UoMPrice }
                 * 
                 * 
                 */
                public List<Item.ItemPrices.ItemPrice.UoMPrices.UoMPrice> getUoMPrice() {
                    if (uoMPrice == null) {
                        uoMPrice = new ArrayList<Item.ItemPrices.ItemPrice.UoMPrices.UoMPrice>();
                    }
                    return this.uoMPrice;
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
                 *         &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="ReduceBy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="AdditionalReduceBy1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="AdditionalPrice1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="AdditionalCurrency1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="AdditionalReduceBy2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="AdditionalPrice2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="AdditionalCurrency2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Auto" minOccurs="0">
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
                public static class UoMPrice {

                    @XmlElement(name = "PriceList")
                    protected Long priceList;
                    @XmlElement(name = "UoMEntry")
                    protected Long uoMEntry;
                    @XmlElement(name = "ReduceBy")
                    protected Double reduceBy;
                    @XmlElement(name = "Price")
                    protected Double price;
                    @XmlElement(name = "Currency")
                    protected String currency;
                    @XmlElement(name = "AdditionalReduceBy1")
                    protected Double additionalReduceBy1;
                    @XmlElement(name = "AdditionalPrice1")
                    protected Double additionalPrice1;
                    @XmlElement(name = "AdditionalCurrency1")
                    protected String additionalCurrency1;
                    @XmlElement(name = "AdditionalReduceBy2")
                    protected Double additionalReduceBy2;
                    @XmlElement(name = "AdditionalPrice2")
                    protected Double additionalPrice2;
                    @XmlElement(name = "AdditionalCurrency2")
                    protected String additionalCurrency2;
                    @XmlElement(name = "Auto")
                    protected String auto;

                    /**
                     * Obtiene el valor de la propiedad priceList.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getPriceList() {
                        return priceList;
                    }

                    /**
                     * Define el valor de la propiedad priceList.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setPriceList(Long value) {
                        this.priceList = value;
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
                     * Obtiene el valor de la propiedad reduceBy.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getReduceBy() {
                        return reduceBy;
                    }

                    /**
                     * Define el valor de la propiedad reduceBy.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setReduceBy(Double value) {
                        this.reduceBy = value;
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
                     * Obtiene el valor de la propiedad additionalReduceBy1.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getAdditionalReduceBy1() {
                        return additionalReduceBy1;
                    }

                    /**
                     * Define el valor de la propiedad additionalReduceBy1.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setAdditionalReduceBy1(Double value) {
                        this.additionalReduceBy1 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad additionalPrice1.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getAdditionalPrice1() {
                        return additionalPrice1;
                    }

                    /**
                     * Define el valor de la propiedad additionalPrice1.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setAdditionalPrice1(Double value) {
                        this.additionalPrice1 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad additionalCurrency1.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAdditionalCurrency1() {
                        return additionalCurrency1;
                    }

                    /**
                     * Define el valor de la propiedad additionalCurrency1.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAdditionalCurrency1(String value) {
                        this.additionalCurrency1 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad additionalReduceBy2.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getAdditionalReduceBy2() {
                        return additionalReduceBy2;
                    }

                    /**
                     * Define el valor de la propiedad additionalReduceBy2.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setAdditionalReduceBy2(Double value) {
                        this.additionalReduceBy2 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad additionalPrice2.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getAdditionalPrice2() {
                        return additionalPrice2;
                    }

                    /**
                     * Define el valor de la propiedad additionalPrice2.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setAdditionalPrice2(Double value) {
                        this.additionalPrice2 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad additionalCurrency2.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAdditionalCurrency2() {
                        return additionalCurrency2;
                    }

                    /**
                     * Define el valor de la propiedad additionalCurrency2.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAdditionalCurrency2(String value) {
                        this.additionalCurrency2 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad auto.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAuto() {
                        return auto;
                    }

                    /**
                     * Define el valor de la propiedad auto.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAuto(String value) {
                        this.auto = value;
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
     *         &lt;element name="ItemProject" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "itemProject"
    })
    public static class ItemProjects {

        @XmlElement(name = "ItemProject")
        protected List<Item.ItemProjects.ItemProject> itemProject;

        /**
         * Gets the value of the itemProject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemProject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemProject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemProjects.ItemProject }
         * 
         * 
         */
        public List<Item.ItemProjects.ItemProject> getItemProject() {
            if (itemProject == null) {
                itemProject = new ArrayList<Item.ItemProjects.ItemProject>();
            }
            return this.itemProject;
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
         *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        public static class ItemProject {

            @XmlElement(name = "LineNumber")
            protected Long lineNumber;
            @XmlElement(name = "ValidFrom")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar validFrom;
            @XmlElement(name = "ValidTo")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar validTo;
            @XmlElement(name = "Project")
            protected String project;

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
             * Obtiene el valor de la propiedad validFrom.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getValidFrom() {
                return validFrom;
            }

            /**
             * Define el valor de la propiedad validFrom.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setValidFrom(XMLGregorianCalendar value) {
                this.validFrom = value;
            }

            /**
             * Obtiene el valor de la propiedad validTo.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getValidTo() {
                return validTo;
            }

            /**
             * Define el valor de la propiedad validTo.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setValidTo(XMLGregorianCalendar value) {
                this.validTo = value;
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
     *         &lt;element name="ItemUnitOfMeasurement" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="UoMType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="iutPurchasing"/>
     *                         &lt;enumeration value="iutSales"/>
     *                         &lt;enumeration value="iutInventory"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="DefaultBarcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="DefaultPackage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Length1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Length1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Length2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Length2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Height1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ItemUoMPackageCollection" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ItemUoMPackage" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="UoMType" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="iutPurchasing"/>
     *                                             &lt;enumeration value="iutSales"/>
     *                                             &lt;enumeration value="iutInventory"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="PackageTypeEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="Length1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="Length1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="Length2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="Length2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="Height1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="QuantityPerPackage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        "itemUnitOfMeasurement"
    })
    public static class ItemUnitOfMeasurementCollection {

        @XmlElement(name = "ItemUnitOfMeasurement")
        protected List<Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement> itemUnitOfMeasurement;

        /**
         * Gets the value of the itemUnitOfMeasurement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemUnitOfMeasurement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemUnitOfMeasurement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement }
         * 
         * 
         */
        public List<Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement> getItemUnitOfMeasurement() {
            if (itemUnitOfMeasurement == null) {
                itemUnitOfMeasurement = new ArrayList<Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement>();
            }
            return this.itemUnitOfMeasurement;
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
         *         &lt;element name="UoMType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="iutPurchasing"/>
         *               &lt;enumeration value="iutSales"/>
         *               &lt;enumeration value="iutInventory"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="DefaultBarcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="DefaultPackage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Length1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Length1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Length2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Length2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Height1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="ItemUoMPackageCollection" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ItemUoMPackage" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="UoMType" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value="iutPurchasing"/>
         *                                   &lt;enumeration value="iutSales"/>
         *                                   &lt;enumeration value="iutInventory"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="PackageTypeEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="Length1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="Length1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="Length2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="Length2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="Height1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="QuantityPerPackage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        public static class ItemUnitOfMeasurement {

            @XmlElement(name = "UoMType")
            protected String uoMType;
            @XmlElement(name = "UoMEntry")
            protected Long uoMEntry;
            @XmlElement(name = "DefaultBarcode")
            protected Long defaultBarcode;
            @XmlElement(name = "DefaultPackage")
            protected Long defaultPackage;
            @XmlElement(name = "Length1")
            protected Double length1;
            @XmlElement(name = "Length1Unit")
            protected Long length1Unit;
            @XmlElement(name = "Length2")
            protected Double length2;
            @XmlElement(name = "Length2Unit")
            protected Long length2Unit;
            @XmlElement(name = "Width1")
            protected Double width1;
            @XmlElement(name = "Width1Unit")
            protected Long width1Unit;
            @XmlElement(name = "Width2")
            protected Double width2;
            @XmlElement(name = "Width2Unit")
            protected Long width2Unit;
            @XmlElement(name = "Height1")
            protected Double height1;
            @XmlElement(name = "Height1Unit")
            protected Long height1Unit;
            @XmlElement(name = "Height2")
            protected Double height2;
            @XmlElement(name = "Height2Unit")
            protected Long height2Unit;
            @XmlElement(name = "Volume")
            protected Double volume;
            @XmlElement(name = "VolumeUnit")
            protected Long volumeUnit;
            @XmlElement(name = "Weight1")
            protected Double weight1;
            @XmlElement(name = "Weight1Unit")
            protected Long weight1Unit;
            @XmlElement(name = "Weight2")
            protected Double weight2;
            @XmlElement(name = "Weight2Unit")
            protected Long weight2Unit;
            @XmlElement(name = "ItemUoMPackageCollection")
            protected Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement.ItemUoMPackageCollection itemUoMPackageCollection;

            /**
             * Obtiene el valor de la propiedad uoMType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUoMType() {
                return uoMType;
            }

            /**
             * Define el valor de la propiedad uoMType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUoMType(String value) {
                this.uoMType = value;
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
             * Obtiene el valor de la propiedad defaultBarcode.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getDefaultBarcode() {
                return defaultBarcode;
            }

            /**
             * Define el valor de la propiedad defaultBarcode.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setDefaultBarcode(Long value) {
                this.defaultBarcode = value;
            }

            /**
             * Obtiene el valor de la propiedad defaultPackage.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getDefaultPackage() {
                return defaultPackage;
            }

            /**
             * Define el valor de la propiedad defaultPackage.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setDefaultPackage(Long value) {
                this.defaultPackage = value;
            }

            /**
             * Obtiene el valor de la propiedad length1.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getLength1() {
                return length1;
            }

            /**
             * Define el valor de la propiedad length1.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setLength1(Double value) {
                this.length1 = value;
            }

            /**
             * Obtiene el valor de la propiedad length1Unit.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getLength1Unit() {
                return length1Unit;
            }

            /**
             * Define el valor de la propiedad length1Unit.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setLength1Unit(Long value) {
                this.length1Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad length2.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getLength2() {
                return length2;
            }

            /**
             * Define el valor de la propiedad length2.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setLength2(Double value) {
                this.length2 = value;
            }

            /**
             * Obtiene el valor de la propiedad length2Unit.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getLength2Unit() {
                return length2Unit;
            }

            /**
             * Define el valor de la propiedad length2Unit.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setLength2Unit(Long value) {
                this.length2Unit = value;
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
             * Obtiene el valor de la propiedad height1Unit.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getHeight1Unit() {
                return height1Unit;
            }

            /**
             * Define el valor de la propiedad height1Unit.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setHeight1Unit(Long value) {
                this.height1Unit = value;
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
             * Obtiene el valor de la propiedad itemUoMPackageCollection.
             * 
             * @return
             *     possible object is
             *     {@link Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement.ItemUoMPackageCollection }
             *     
             */
            public Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement.ItemUoMPackageCollection getItemUoMPackageCollection() {
                return itemUoMPackageCollection;
            }

            /**
             * Define el valor de la propiedad itemUoMPackageCollection.
             * 
             * @param value
             *     allowed object is
             *     {@link Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement.ItemUoMPackageCollection }
             *     
             */
            public void setItemUoMPackageCollection(Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement.ItemUoMPackageCollection value) {
                this.itemUoMPackageCollection = value;
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
             *         &lt;element name="ItemUoMPackage" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="UoMType" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value="iutPurchasing"/>
             *                         &lt;enumeration value="iutSales"/>
             *                         &lt;enumeration value="iutInventory"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="PackageTypeEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="Length1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="Length1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="Length2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="Length2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="Height1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="QuantityPerPackage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                "itemUoMPackage"
            })
            public static class ItemUoMPackageCollection {

                @XmlElement(name = "ItemUoMPackage")
                protected List<Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement.ItemUoMPackageCollection.ItemUoMPackage> itemUoMPackage;

                /**
                 * Gets the value of the itemUoMPackage property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the itemUoMPackage property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getItemUoMPackage().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement.ItemUoMPackageCollection.ItemUoMPackage }
                 * 
                 * 
                 */
                public List<Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement.ItemUoMPackageCollection.ItemUoMPackage> getItemUoMPackage() {
                    if (itemUoMPackage == null) {
                        itemUoMPackage = new ArrayList<Item.ItemUnitOfMeasurementCollection.ItemUnitOfMeasurement.ItemUoMPackageCollection.ItemUoMPackage>();
                    }
                    return this.itemUoMPackage;
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
                 *         &lt;element name="UoMType" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value="iutPurchasing"/>
                 *               &lt;enumeration value="iutSales"/>
                 *               &lt;enumeration value="iutInventory"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="PackageTypeEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="Length1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="Length1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="Length2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="Length2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="Height1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="QuantityPerPackage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                public static class ItemUoMPackage {

                    @XmlElement(name = "UoMType")
                    protected String uoMType;
                    @XmlElement(name = "UoMEntry")
                    protected Long uoMEntry;
                    @XmlElement(name = "PackageTypeEntry")
                    protected Long packageTypeEntry;
                    @XmlElement(name = "Length1")
                    protected Double length1;
                    @XmlElement(name = "Length1Unit")
                    protected Long length1Unit;
                    @XmlElement(name = "Length2")
                    protected Double length2;
                    @XmlElement(name = "Length2Unit")
                    protected Long length2Unit;
                    @XmlElement(name = "Width1")
                    protected Double width1;
                    @XmlElement(name = "Width1Unit")
                    protected Long width1Unit;
                    @XmlElement(name = "Width2")
                    protected Double width2;
                    @XmlElement(name = "Width2Unit")
                    protected Long width2Unit;
                    @XmlElement(name = "Height1")
                    protected Double height1;
                    @XmlElement(name = "Height1Unit")
                    protected Long height1Unit;
                    @XmlElement(name = "Height2")
                    protected Double height2;
                    @XmlElement(name = "Height2Unit")
                    protected Long height2Unit;
                    @XmlElement(name = "Volume")
                    protected Double volume;
                    @XmlElement(name = "VolumeUnit")
                    protected Long volumeUnit;
                    @XmlElement(name = "Weight1")
                    protected Double weight1;
                    @XmlElement(name = "Weight1Unit")
                    protected Long weight1Unit;
                    @XmlElement(name = "Weight2")
                    protected Double weight2;
                    @XmlElement(name = "Weight2Unit")
                    protected Long weight2Unit;
                    @XmlElement(name = "QuantityPerPackage")
                    protected Double quantityPerPackage;

                    /**
                     * Obtiene el valor de la propiedad uoMType.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUoMType() {
                        return uoMType;
                    }

                    /**
                     * Define el valor de la propiedad uoMType.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUoMType(String value) {
                        this.uoMType = value;
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
                     * Obtiene el valor de la propiedad packageTypeEntry.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getPackageTypeEntry() {
                        return packageTypeEntry;
                    }

                    /**
                     * Define el valor de la propiedad packageTypeEntry.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setPackageTypeEntry(Long value) {
                        this.packageTypeEntry = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad length1.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getLength1() {
                        return length1;
                    }

                    /**
                     * Define el valor de la propiedad length1.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setLength1(Double value) {
                        this.length1 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad length1Unit.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getLength1Unit() {
                        return length1Unit;
                    }

                    /**
                     * Define el valor de la propiedad length1Unit.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setLength1Unit(Long value) {
                        this.length1Unit = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad length2.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getLength2() {
                        return length2;
                    }

                    /**
                     * Define el valor de la propiedad length2.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setLength2(Double value) {
                        this.length2 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad length2Unit.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getLength2Unit() {
                        return length2Unit;
                    }

                    /**
                     * Define el valor de la propiedad length2Unit.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setLength2Unit(Long value) {
                        this.length2Unit = value;
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
                     * Obtiene el valor de la propiedad height1Unit.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getHeight1Unit() {
                        return height1Unit;
                    }

                    /**
                     * Define el valor de la propiedad height1Unit.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setHeight1Unit(Long value) {
                        this.height1Unit = value;
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
                     * Obtiene el valor de la propiedad quantityPerPackage.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getQuantityPerPackage() {
                        return quantityPerPackage;
                    }

                    /**
                     * Define el valor de la propiedad quantityPerPackage.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setQuantityPerPackage(Double value) {
                        this.quantityPerPackage = value;
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
     *         &lt;element name="ItemWarehouseInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="MinimalStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="MaximalStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="MinimalOrder" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="StandardAveragePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Locked" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="InventoryAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CostAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TransferAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RevenuesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="VarienceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DecreasingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="IncreasingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ReturningAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ExpensesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EURevenuesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EUExpensesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ForeignRevenueAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ForeignExpensAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ExemptIncomeAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PriceDifferenceAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Committed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="CountedQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="WasCounted" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="UserSignature" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Counted" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="ExpenseClearingAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EUPurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ForeignPurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SalesCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SalesCreditEUAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ExemptedCredits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SalesCreditForeignAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ExpenseOffsettingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WipAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ExchangeRateDifferencesAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GoodsClearingAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NegativeInventoryAdjustmentAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CostInflationOffsetAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GLDecreaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GLIncreaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PAReturnAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PurchaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PurchaseOffsetAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ShippedGoodsAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="StockInflationOffsetAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="StockInflationAdjustAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="VATInRevenueAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WipVarianceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CostInflationAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WHIncomingCenvatAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WHOutgoingCenvatAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="StockInTransitAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WipOffsetProfitAndLossAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InventoryOffsetProfitAndLossAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DefaultBin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="DefaultBinEnforced" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PurchaseBalanceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ItemCycleCounts" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ItemCycleCount" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="CycleCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="Alert" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="tNO"/>
     *                                             &lt;enumeration value="tYES"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="NextCountingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="AlertTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
     *                                       &lt;element name="DestinationUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "itemWarehouseInfo"
    })
    public static class ItemWarehouseInfoCollection {

        @XmlElement(name = "ItemWarehouseInfo")
        protected List<Item.ItemWarehouseInfoCollection.ItemWarehouseInfo> itemWarehouseInfo;

        /**
         * Gets the value of the itemWarehouseInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemWarehouseInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemWarehouseInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemWarehouseInfoCollection.ItemWarehouseInfo }
         * 
         * 
         */
        public List<Item.ItemWarehouseInfoCollection.ItemWarehouseInfo> getItemWarehouseInfo() {
            if (itemWarehouseInfo == null) {
                itemWarehouseInfo = new ArrayList<Item.ItemWarehouseInfoCollection.ItemWarehouseInfo>();
            }
            return this.itemWarehouseInfo;
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
         *         &lt;element name="MinimalStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="MaximalStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="MinimalOrder" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="StandardAveragePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Locked" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="InventoryAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CostAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TransferAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RevenuesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="VarienceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DecreasingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="IncreasingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ReturningAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ExpensesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EURevenuesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EUExpensesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ForeignRevenueAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ForeignExpensAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ExemptIncomeAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PriceDifferenceAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Committed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="CountedQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="WasCounted" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="UserSignature" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Counted" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="ExpenseClearingAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EUPurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ForeignPurchaseCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SalesCreditAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SalesCreditEUAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ExemptedCredits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SalesCreditForeignAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ExpenseOffsettingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WipAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ExchangeRateDifferencesAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GoodsClearingAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NegativeInventoryAdjustmentAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CostInflationOffsetAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GLDecreaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GLIncreaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PAReturnAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PurchaseAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PurchaseOffsetAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ShippedGoodsAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="StockInflationOffsetAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="StockInflationAdjustAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="VATInRevenueAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WipVarianceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CostInflationAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WHIncomingCenvatAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WHOutgoingCenvatAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="StockInTransitAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WipOffsetProfitAndLossAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InventoryOffsetProfitAndLossAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DefaultBin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="DefaultBinEnforced" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PurchaseBalanceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ItemCycleCounts" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ItemCycleCount" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="CycleCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="Alert" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value="tNO"/>
         *                                   &lt;enumeration value="tYES"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="NextCountingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="AlertTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
         *                             &lt;element name="DestinationUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        public static class ItemWarehouseInfo {

            @XmlElement(name = "MinimalStock")
            protected Double minimalStock;
            @XmlElement(name = "MaximalStock")
            protected Double maximalStock;
            @XmlElement(name = "MinimalOrder")
            protected Double minimalOrder;
            @XmlElement(name = "StandardAveragePrice")
            protected Double standardAveragePrice;
            @XmlElement(name = "Locked")
            protected String locked;
            @XmlElement(name = "InventoryAccount")
            protected String inventoryAccount;
            @XmlElement(name = "CostAccount")
            protected String costAccount;
            @XmlElement(name = "TransferAccount")
            protected String transferAccount;
            @XmlElement(name = "RevenuesAccount")
            protected String revenuesAccount;
            @XmlElement(name = "VarienceAccount")
            protected String varienceAccount;
            @XmlElement(name = "DecreasingAccount")
            protected String decreasingAccount;
            @XmlElement(name = "IncreasingAccount")
            protected String increasingAccount;
            @XmlElement(name = "ReturningAccount")
            protected String returningAccount;
            @XmlElement(name = "ExpensesAccount")
            protected String expensesAccount;
            @XmlElement(name = "EURevenuesAccount")
            protected String euRevenuesAccount;
            @XmlElement(name = "EUExpensesAccount")
            protected String euExpensesAccount;
            @XmlElement(name = "ForeignRevenueAcc")
            protected String foreignRevenueAcc;
            @XmlElement(name = "ForeignExpensAcc")
            protected String foreignExpensAcc;
            @XmlElement(name = "ExemptIncomeAcc")
            protected String exemptIncomeAcc;
            @XmlElement(name = "PriceDifferenceAcc")
            protected String priceDifferenceAcc;
            @XmlElement(name = "WarehouseCode")
            protected String warehouseCode;
            @XmlElement(name = "InStock")
            protected Double inStock;
            @XmlElement(name = "Committed")
            protected Double committed;
            @XmlElement(name = "Ordered")
            protected Double ordered;
            @XmlElement(name = "CountedQuantity")
            protected Double countedQuantity;
            @XmlElement(name = "WasCounted")
            protected String wasCounted;
            @XmlElement(name = "UserSignature")
            protected Long userSignature;
            @XmlElement(name = "Counted")
            protected Double counted;
            @XmlElement(name = "ExpenseClearingAct")
            protected String expenseClearingAct;
            @XmlElement(name = "PurchaseCreditAcc")
            protected String purchaseCreditAcc;
            @XmlElement(name = "EUPurchaseCreditAcc")
            protected String euPurchaseCreditAcc;
            @XmlElement(name = "ForeignPurchaseCreditAcc")
            protected String foreignPurchaseCreditAcc;
            @XmlElement(name = "SalesCreditAcc")
            protected String salesCreditAcc;
            @XmlElement(name = "SalesCreditEUAcc")
            protected String salesCreditEUAcc;
            @XmlElement(name = "ExemptedCredits")
            protected String exemptedCredits;
            @XmlElement(name = "SalesCreditForeignAcc")
            protected String salesCreditForeignAcc;
            @XmlElement(name = "ExpenseOffsettingAccount")
            protected String expenseOffsettingAccount;
            @XmlElement(name = "WipAccount")
            protected String wipAccount;
            @XmlElement(name = "ExchangeRateDifferencesAcct")
            protected String exchangeRateDifferencesAcct;
            @XmlElement(name = "GoodsClearingAcct")
            protected String goodsClearingAcct;
            @XmlElement(name = "NegativeInventoryAdjustmentAccount")
            protected String negativeInventoryAdjustmentAccount;
            @XmlElement(name = "CostInflationOffsetAccount")
            protected String costInflationOffsetAccount;
            @XmlElement(name = "GLDecreaseAcct")
            protected String glDecreaseAcct;
            @XmlElement(name = "GLIncreaseAcct")
            protected String glIncreaseAcct;
            @XmlElement(name = "PAReturnAcct")
            protected String paReturnAcct;
            @XmlElement(name = "PurchaseAcct")
            protected String purchaseAcct;
            @XmlElement(name = "PurchaseOffsetAcct")
            protected String purchaseOffsetAcct;
            @XmlElement(name = "ShippedGoodsAccount")
            protected String shippedGoodsAccount;
            @XmlElement(name = "StockInflationOffsetAccount")
            protected String stockInflationOffsetAccount;
            @XmlElement(name = "StockInflationAdjustAccount")
            protected String stockInflationAdjustAccount;
            @XmlElement(name = "VATInRevenueAccount")
            protected String vatInRevenueAccount;
            @XmlElement(name = "WipVarianceAccount")
            protected String wipVarianceAccount;
            @XmlElement(name = "CostInflationAccount")
            protected String costInflationAccount;
            @XmlElement(name = "WHIncomingCenvatAccount")
            protected String whIncomingCenvatAccount;
            @XmlElement(name = "WHOutgoingCenvatAccount")
            protected String whOutgoingCenvatAccount;
            @XmlElement(name = "StockInTransitAccount")
            protected String stockInTransitAccount;
            @XmlElement(name = "WipOffsetProfitAndLossAccount")
            protected String wipOffsetProfitAndLossAccount;
            @XmlElement(name = "InventoryOffsetProfitAndLossAccount")
            protected String inventoryOffsetProfitAndLossAccount;
            @XmlElement(name = "DefaultBin")
            protected Long defaultBin;
            @XmlElement(name = "DefaultBinEnforced")
            protected String defaultBinEnforced;
            @XmlElement(name = "PurchaseBalanceAccount")
            protected String purchaseBalanceAccount;
            @XmlElement(name = "ItemCycleCounts")
            protected Item.ItemWarehouseInfoCollection.ItemWarehouseInfo.ItemCycleCounts itemCycleCounts;

            /**
             * Obtiene el valor de la propiedad minimalStock.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getMinimalStock() {
                return minimalStock;
            }

            /**
             * Define el valor de la propiedad minimalStock.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setMinimalStock(Double value) {
                this.minimalStock = value;
            }

            /**
             * Obtiene el valor de la propiedad maximalStock.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getMaximalStock() {
                return maximalStock;
            }

            /**
             * Define el valor de la propiedad maximalStock.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setMaximalStock(Double value) {
                this.maximalStock = value;
            }

            /**
             * Obtiene el valor de la propiedad minimalOrder.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getMinimalOrder() {
                return minimalOrder;
            }

            /**
             * Define el valor de la propiedad minimalOrder.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setMinimalOrder(Double value) {
                this.minimalOrder = value;
            }

            /**
             * Obtiene el valor de la propiedad standardAveragePrice.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getStandardAveragePrice() {
                return standardAveragePrice;
            }

            /**
             * Define el valor de la propiedad standardAveragePrice.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setStandardAveragePrice(Double value) {
                this.standardAveragePrice = value;
            }

            /**
             * Obtiene el valor de la propiedad locked.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocked() {
                return locked;
            }

            /**
             * Define el valor de la propiedad locked.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocked(String value) {
                this.locked = value;
            }

            /**
             * Obtiene el valor de la propiedad inventoryAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInventoryAccount() {
                return inventoryAccount;
            }

            /**
             * Define el valor de la propiedad inventoryAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInventoryAccount(String value) {
                this.inventoryAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad costAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCostAccount() {
                return costAccount;
            }

            /**
             * Define el valor de la propiedad costAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCostAccount(String value) {
                this.costAccount = value;
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
             * Obtiene el valor de la propiedad revenuesAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRevenuesAccount() {
                return revenuesAccount;
            }

            /**
             * Define el valor de la propiedad revenuesAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRevenuesAccount(String value) {
                this.revenuesAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad varienceAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVarienceAccount() {
                return varienceAccount;
            }

            /**
             * Define el valor de la propiedad varienceAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVarienceAccount(String value) {
                this.varienceAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad decreasingAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDecreasingAccount() {
                return decreasingAccount;
            }

            /**
             * Define el valor de la propiedad decreasingAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDecreasingAccount(String value) {
                this.decreasingAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad increasingAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIncreasingAccount() {
                return increasingAccount;
            }

            /**
             * Define el valor de la propiedad increasingAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIncreasingAccount(String value) {
                this.increasingAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad returningAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReturningAccount() {
                return returningAccount;
            }

            /**
             * Define el valor de la propiedad returningAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReturningAccount(String value) {
                this.returningAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad expensesAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpensesAccount() {
                return expensesAccount;
            }

            /**
             * Define el valor de la propiedad expensesAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpensesAccount(String value) {
                this.expensesAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad euRevenuesAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEURevenuesAccount() {
                return euRevenuesAccount;
            }

            /**
             * Define el valor de la propiedad euRevenuesAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEURevenuesAccount(String value) {
                this.euRevenuesAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad euExpensesAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEUExpensesAccount() {
                return euExpensesAccount;
            }

            /**
             * Define el valor de la propiedad euExpensesAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEUExpensesAccount(String value) {
                this.euExpensesAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad foreignRevenueAcc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getForeignRevenueAcc() {
                return foreignRevenueAcc;
            }

            /**
             * Define el valor de la propiedad foreignRevenueAcc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setForeignRevenueAcc(String value) {
                this.foreignRevenueAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad foreignExpensAcc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getForeignExpensAcc() {
                return foreignExpensAcc;
            }

            /**
             * Define el valor de la propiedad foreignExpensAcc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setForeignExpensAcc(String value) {
                this.foreignExpensAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad exemptIncomeAcc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExemptIncomeAcc() {
                return exemptIncomeAcc;
            }

            /**
             * Define el valor de la propiedad exemptIncomeAcc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExemptIncomeAcc(String value) {
                this.exemptIncomeAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad priceDifferenceAcc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriceDifferenceAcc() {
                return priceDifferenceAcc;
            }

            /**
             * Define el valor de la propiedad priceDifferenceAcc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPriceDifferenceAcc(String value) {
                this.priceDifferenceAcc = value;
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
             * Obtiene el valor de la propiedad inStock.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getInStock() {
                return inStock;
            }

            /**
             * Define el valor de la propiedad inStock.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setInStock(Double value) {
                this.inStock = value;
            }

            /**
             * Obtiene el valor de la propiedad committed.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getCommitted() {
                return committed;
            }

            /**
             * Define el valor de la propiedad committed.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setCommitted(Double value) {
                this.committed = value;
            }

            /**
             * Obtiene el valor de la propiedad ordered.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getOrdered() {
                return ordered;
            }

            /**
             * Define el valor de la propiedad ordered.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setOrdered(Double value) {
                this.ordered = value;
            }

            /**
             * Obtiene el valor de la propiedad countedQuantity.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getCountedQuantity() {
                return countedQuantity;
            }

            /**
             * Define el valor de la propiedad countedQuantity.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setCountedQuantity(Double value) {
                this.countedQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad wasCounted.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWasCounted() {
                return wasCounted;
            }

            /**
             * Define el valor de la propiedad wasCounted.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWasCounted(String value) {
                this.wasCounted = value;
            }

            /**
             * Obtiene el valor de la propiedad userSignature.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getUserSignature() {
                return userSignature;
            }

            /**
             * Define el valor de la propiedad userSignature.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setUserSignature(Long value) {
                this.userSignature = value;
            }

            /**
             * Obtiene el valor de la propiedad counted.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getCounted() {
                return counted;
            }

            /**
             * Define el valor de la propiedad counted.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setCounted(Double value) {
                this.counted = value;
            }

            /**
             * Obtiene el valor de la propiedad expenseClearingAct.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpenseClearingAct() {
                return expenseClearingAct;
            }

            /**
             * Define el valor de la propiedad expenseClearingAct.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpenseClearingAct(String value) {
                this.expenseClearingAct = value;
            }

            /**
             * Obtiene el valor de la propiedad purchaseCreditAcc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPurchaseCreditAcc() {
                return purchaseCreditAcc;
            }

            /**
             * Define el valor de la propiedad purchaseCreditAcc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPurchaseCreditAcc(String value) {
                this.purchaseCreditAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad euPurchaseCreditAcc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEUPurchaseCreditAcc() {
                return euPurchaseCreditAcc;
            }

            /**
             * Define el valor de la propiedad euPurchaseCreditAcc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEUPurchaseCreditAcc(String value) {
                this.euPurchaseCreditAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad foreignPurchaseCreditAcc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getForeignPurchaseCreditAcc() {
                return foreignPurchaseCreditAcc;
            }

            /**
             * Define el valor de la propiedad foreignPurchaseCreditAcc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setForeignPurchaseCreditAcc(String value) {
                this.foreignPurchaseCreditAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad salesCreditAcc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSalesCreditAcc() {
                return salesCreditAcc;
            }

            /**
             * Define el valor de la propiedad salesCreditAcc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSalesCreditAcc(String value) {
                this.salesCreditAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad salesCreditEUAcc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSalesCreditEUAcc() {
                return salesCreditEUAcc;
            }

            /**
             * Define el valor de la propiedad salesCreditEUAcc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSalesCreditEUAcc(String value) {
                this.salesCreditEUAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad exemptedCredits.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExemptedCredits() {
                return exemptedCredits;
            }

            /**
             * Define el valor de la propiedad exemptedCredits.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExemptedCredits(String value) {
                this.exemptedCredits = value;
            }

            /**
             * Obtiene el valor de la propiedad salesCreditForeignAcc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSalesCreditForeignAcc() {
                return salesCreditForeignAcc;
            }

            /**
             * Define el valor de la propiedad salesCreditForeignAcc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSalesCreditForeignAcc(String value) {
                this.salesCreditForeignAcc = value;
            }

            /**
             * Obtiene el valor de la propiedad expenseOffsettingAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpenseOffsettingAccount() {
                return expenseOffsettingAccount;
            }

            /**
             * Define el valor de la propiedad expenseOffsettingAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpenseOffsettingAccount(String value) {
                this.expenseOffsettingAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad wipAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWipAccount() {
                return wipAccount;
            }

            /**
             * Define el valor de la propiedad wipAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWipAccount(String value) {
                this.wipAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad exchangeRateDifferencesAcct.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExchangeRateDifferencesAcct() {
                return exchangeRateDifferencesAcct;
            }

            /**
             * Define el valor de la propiedad exchangeRateDifferencesAcct.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExchangeRateDifferencesAcct(String value) {
                this.exchangeRateDifferencesAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad goodsClearingAcct.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGoodsClearingAcct() {
                return goodsClearingAcct;
            }

            /**
             * Define el valor de la propiedad goodsClearingAcct.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGoodsClearingAcct(String value) {
                this.goodsClearingAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad negativeInventoryAdjustmentAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNegativeInventoryAdjustmentAccount() {
                return negativeInventoryAdjustmentAccount;
            }

            /**
             * Define el valor de la propiedad negativeInventoryAdjustmentAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNegativeInventoryAdjustmentAccount(String value) {
                this.negativeInventoryAdjustmentAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad costInflationOffsetAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCostInflationOffsetAccount() {
                return costInflationOffsetAccount;
            }

            /**
             * Define el valor de la propiedad costInflationOffsetAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCostInflationOffsetAccount(String value) {
                this.costInflationOffsetAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad glDecreaseAcct.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGLDecreaseAcct() {
                return glDecreaseAcct;
            }

            /**
             * Define el valor de la propiedad glDecreaseAcct.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGLDecreaseAcct(String value) {
                this.glDecreaseAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad glIncreaseAcct.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGLIncreaseAcct() {
                return glIncreaseAcct;
            }

            /**
             * Define el valor de la propiedad glIncreaseAcct.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGLIncreaseAcct(String value) {
                this.glIncreaseAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad paReturnAcct.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAReturnAcct() {
                return paReturnAcct;
            }

            /**
             * Define el valor de la propiedad paReturnAcct.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAReturnAcct(String value) {
                this.paReturnAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad purchaseAcct.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPurchaseAcct() {
                return purchaseAcct;
            }

            /**
             * Define el valor de la propiedad purchaseAcct.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPurchaseAcct(String value) {
                this.purchaseAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad purchaseOffsetAcct.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPurchaseOffsetAcct() {
                return purchaseOffsetAcct;
            }

            /**
             * Define el valor de la propiedad purchaseOffsetAcct.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPurchaseOffsetAcct(String value) {
                this.purchaseOffsetAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad shippedGoodsAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShippedGoodsAccount() {
                return shippedGoodsAccount;
            }

            /**
             * Define el valor de la propiedad shippedGoodsAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShippedGoodsAccount(String value) {
                this.shippedGoodsAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad stockInflationOffsetAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStockInflationOffsetAccount() {
                return stockInflationOffsetAccount;
            }

            /**
             * Define el valor de la propiedad stockInflationOffsetAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStockInflationOffsetAccount(String value) {
                this.stockInflationOffsetAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad stockInflationAdjustAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStockInflationAdjustAccount() {
                return stockInflationAdjustAccount;
            }

            /**
             * Define el valor de la propiedad stockInflationAdjustAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStockInflationAdjustAccount(String value) {
                this.stockInflationAdjustAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad vatInRevenueAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVATInRevenueAccount() {
                return vatInRevenueAccount;
            }

            /**
             * Define el valor de la propiedad vatInRevenueAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVATInRevenueAccount(String value) {
                this.vatInRevenueAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad wipVarianceAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWipVarianceAccount() {
                return wipVarianceAccount;
            }

            /**
             * Define el valor de la propiedad wipVarianceAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWipVarianceAccount(String value) {
                this.wipVarianceAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad costInflationAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCostInflationAccount() {
                return costInflationAccount;
            }

            /**
             * Define el valor de la propiedad costInflationAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCostInflationAccount(String value) {
                this.costInflationAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad whIncomingCenvatAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWHIncomingCenvatAccount() {
                return whIncomingCenvatAccount;
            }

            /**
             * Define el valor de la propiedad whIncomingCenvatAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWHIncomingCenvatAccount(String value) {
                this.whIncomingCenvatAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad whOutgoingCenvatAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWHOutgoingCenvatAccount() {
                return whOutgoingCenvatAccount;
            }

            /**
             * Define el valor de la propiedad whOutgoingCenvatAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWHOutgoingCenvatAccount(String value) {
                this.whOutgoingCenvatAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad stockInTransitAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStockInTransitAccount() {
                return stockInTransitAccount;
            }

            /**
             * Define el valor de la propiedad stockInTransitAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStockInTransitAccount(String value) {
                this.stockInTransitAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad wipOffsetProfitAndLossAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWipOffsetProfitAndLossAccount() {
                return wipOffsetProfitAndLossAccount;
            }

            /**
             * Define el valor de la propiedad wipOffsetProfitAndLossAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWipOffsetProfitAndLossAccount(String value) {
                this.wipOffsetProfitAndLossAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad inventoryOffsetProfitAndLossAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInventoryOffsetProfitAndLossAccount() {
                return inventoryOffsetProfitAndLossAccount;
            }

            /**
             * Define el valor de la propiedad inventoryOffsetProfitAndLossAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInventoryOffsetProfitAndLossAccount(String value) {
                this.inventoryOffsetProfitAndLossAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad defaultBin.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getDefaultBin() {
                return defaultBin;
            }

            /**
             * Define el valor de la propiedad defaultBin.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setDefaultBin(Long value) {
                this.defaultBin = value;
            }

            /**
             * Obtiene el valor de la propiedad defaultBinEnforced.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefaultBinEnforced() {
                return defaultBinEnforced;
            }

            /**
             * Define el valor de la propiedad defaultBinEnforced.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefaultBinEnforced(String value) {
                this.defaultBinEnforced = value;
            }

            /**
             * Obtiene el valor de la propiedad purchaseBalanceAccount.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPurchaseBalanceAccount() {
                return purchaseBalanceAccount;
            }

            /**
             * Define el valor de la propiedad purchaseBalanceAccount.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPurchaseBalanceAccount(String value) {
                this.purchaseBalanceAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad itemCycleCounts.
             * 
             * @return
             *     possible object is
             *     {@link Item.ItemWarehouseInfoCollection.ItemWarehouseInfo.ItemCycleCounts }
             *     
             */
            public Item.ItemWarehouseInfoCollection.ItemWarehouseInfo.ItemCycleCounts getItemCycleCounts() {
                return itemCycleCounts;
            }

            /**
             * Define el valor de la propiedad itemCycleCounts.
             * 
             * @param value
             *     allowed object is
             *     {@link Item.ItemWarehouseInfoCollection.ItemWarehouseInfo.ItemCycleCounts }
             *     
             */
            public void setItemCycleCounts(Item.ItemWarehouseInfoCollection.ItemWarehouseInfo.ItemCycleCounts value) {
                this.itemCycleCounts = value;
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
             *         &lt;element name="ItemCycleCount" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="CycleCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="Alert" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value="tNO"/>
             *                         &lt;enumeration value="tYES"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="NextCountingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="AlertTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
             *                   &lt;element name="DestinationUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "itemCycleCount"
            })
            public static class ItemCycleCounts {

                @XmlElement(name = "ItemCycleCount")
                protected List<Item.ItemWarehouseInfoCollection.ItemWarehouseInfo.ItemCycleCounts.ItemCycleCount> itemCycleCount;

                /**
                 * Gets the value of the itemCycleCount property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the itemCycleCount property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getItemCycleCount().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Item.ItemWarehouseInfoCollection.ItemWarehouseInfo.ItemCycleCounts.ItemCycleCount }
                 * 
                 * 
                 */
                public List<Item.ItemWarehouseInfoCollection.ItemWarehouseInfo.ItemCycleCounts.ItemCycleCount> getItemCycleCount() {
                    if (itemCycleCount == null) {
                        itemCycleCount = new ArrayList<Item.ItemWarehouseInfoCollection.ItemWarehouseInfo.ItemCycleCounts.ItemCycleCount>();
                    }
                    return this.itemCycleCount;
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
                 *         &lt;element name="CycleCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="Alert" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value="tNO"/>
                 *               &lt;enumeration value="tYES"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="NextCountingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="AlertTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
                 *         &lt;element name="DestinationUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                public static class ItemCycleCount {

                    @XmlElement(name = "CycleCode")
                    protected Long cycleCode;
                    @XmlElement(name = "Alert")
                    protected String alert;
                    @XmlElement(name = "NextCountingDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar nextCountingDate;
                    @XmlElement(name = "AlertTime")
                    @XmlSchemaType(name = "time")
                    protected XMLGregorianCalendar alertTime;
                    @XmlElement(name = "DestinationUser")
                    protected Long destinationUser;
                    @XmlElement(name = "WarehouseCode")
                    protected String warehouseCode;

                    /**
                     * Obtiene el valor de la propiedad cycleCode.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getCycleCode() {
                        return cycleCode;
                    }

                    /**
                     * Define el valor de la propiedad cycleCode.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setCycleCode(Long value) {
                        this.cycleCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad alert.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAlert() {
                        return alert;
                    }

                    /**
                     * Define el valor de la propiedad alert.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAlert(String value) {
                        this.alert = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad nextCountingDate.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getNextCountingDate() {
                        return nextCountingDate;
                    }

                    /**
                     * Define el valor de la propiedad nextCountingDate.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setNextCountingDate(XMLGregorianCalendar value) {
                        this.nextCountingDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad alertTime.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getAlertTime() {
                        return alertTime;
                    }

                    /**
                     * Define el valor de la propiedad alertTime.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setAlertTime(XMLGregorianCalendar value) {
                        this.alertTime = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad destinationUser.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getDestinationUser() {
                        return destinationUser;
                    }

                    /**
                     * Define el valor de la propiedad destinationUser.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setDestinationUser(Long value) {
                        this.destinationUser = value;
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

                }

            }

        }

    }

}
