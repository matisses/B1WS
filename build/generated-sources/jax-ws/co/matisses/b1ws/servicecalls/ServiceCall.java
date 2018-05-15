
package co.matisses.b1ws.servicecalls;

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
 *         &lt;element name="ServiceCallID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ManufacturerSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContractEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ResolutionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ResolutionTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemGroupCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Priority" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="scp_Low"/>
 *               &lt;enumeration value="scp_Medium"/>
 *               &lt;enumeration value="scp_High"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CallType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProblemType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AssigneeCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TechnicianCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CreationTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Responder" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UpdatedTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="BelongsToAQueue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResponseByTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="ResponseByDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ResolutionOnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ResponseOnTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="ResponseOnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ClosingTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="AssignedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Queue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseAssignee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EntitledforService" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResolutionOnTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="AssignedTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="ClosingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Series" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DocNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HandWritten" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PeriodIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="EndDueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DurationType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="du_Minuts"/>
 *               &lt;enumeration value="du_Hours"/>
 *               &lt;enumeration value="du_Days"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Reminder" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReminderPeriod" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ReminderType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="du_Minuts"/>
 *               &lt;enumeration value="du_Hours"/>
 *               &lt;enumeration value="du_Days"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="bo_ShipTo"/>
 *               &lt;enumeration value="bo_BillTo"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Room" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayInCalendar" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CustomerRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProblemSubType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AttachmentEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="U_Causa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_CateGa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_ProExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_Num_factura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_TipoServ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_NWR_RMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_NWR_PO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_NWR_RMA_Type" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="U_ComentSoporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_Material" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_ProblemaMaterial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_crearSoporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceCallActivities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ServiceCallActivity" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="ActivityCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
 *         &lt;element name="ServiceCallInventoryExpenses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ServiceCallInventoryExpense" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="PartType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="sep_Inventory"/>
 *                                   &lt;enumeration value="sep_NonInventory"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DocumentType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="edt_Invoice"/>
 *                                   &lt;enumeration value="edt_Delivery"/>
 *                                   &lt;enumeration value="edt_Return"/>
 *                                   &lt;enumeration value="edt_StockTransfer"/>
 *                                   &lt;enumeration value="edt_CreditMemo"/>
 *                                   &lt;enumeration value="edt_Order"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DocumentPostingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="StockTransferDirection" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="bos_TransferToTechnician"/>
 *                                   &lt;enumeration value="bos_TransferFromTechnician"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
 *         &lt;element name="ServiceCallSolutions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ServiceCallSolution" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="SolutionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlRootElement(name = "ServiceCall")
public class ServiceCall {

    @XmlElement(name = "ServiceCallID")
    protected Long serviceCallID;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "CustomerCode")
    protected String customerCode;
    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "ContactCode")
    protected Long contactCode;
    @XmlElement(name = "ManufacturerSerialNum")
    protected String manufacturerSerialNum;
    @XmlElement(name = "InternalSerialNum")
    protected String internalSerialNum;
    @XmlElement(name = "ContractID")
    protected Long contractID;
    @XmlElement(name = "ContractEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractEndDate;
    @XmlElement(name = "ResolutionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar resolutionDate;
    @XmlElement(name = "ResolutionTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar resolutionTime;
    @XmlElement(name = "Origin")
    protected Long origin;
    @XmlElement(name = "ItemCode")
    protected String itemCode;
    @XmlElement(name = "ItemDescription")
    protected String itemDescription;
    @XmlElement(name = "ItemGroupCode")
    protected Long itemGroupCode;
    @XmlElement(name = "Status")
    protected Long status;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "CallType")
    protected Long callType;
    @XmlElement(name = "ProblemType")
    protected Long problemType;
    @XmlElement(name = "AssigneeCode")
    protected Long assigneeCode;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "TechnicianCode")
    protected Long technicianCode;
    @XmlElement(name = "Resolution")
    protected String resolution;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CreationTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar creationTime;
    @XmlElement(name = "Responder")
    protected Long responder;
    @XmlElement(name = "UpdatedTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar updatedTime;
    @XmlElement(name = "BelongsToAQueue")
    protected String belongsToAQueue;
    @XmlElement(name = "ResponseByTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar responseByTime;
    @XmlElement(name = "ResponseByDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar responseByDate;
    @XmlElement(name = "ResolutionOnDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar resolutionOnDate;
    @XmlElement(name = "ResponseOnTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar responseOnTime;
    @XmlElement(name = "ResponseOnDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar responseOnDate;
    @XmlElement(name = "ClosingTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar closingTime;
    @XmlElement(name = "AssignedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar assignedDate;
    @XmlElement(name = "Queue")
    protected String queue;
    @XmlElement(name = "ResponseAssignee")
    protected Long responseAssignee;
    @XmlElement(name = "EntitledforService")
    protected String entitledforService;
    @XmlElement(name = "ResolutionOnTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar resolutionOnTime;
    @XmlElement(name = "AssignedTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar assignedTime;
    @XmlElement(name = "ClosingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar closingDate;
    @XmlElement(name = "Series")
    protected Long series;
    @XmlElement(name = "DocNum")
    protected Long docNum;
    @XmlElement(name = "HandWritten")
    protected String handWritten;
    @XmlElement(name = "PeriodIndicator")
    protected String periodIndicator;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndDueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDueDate;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "Duration")
    protected Double duration;
    @XmlElement(name = "DurationType")
    protected String durationType;
    @XmlElement(name = "Reminder")
    protected String reminder;
    @XmlElement(name = "ReminderPeriod")
    protected Double reminderPeriod;
    @XmlElement(name = "ReminderType")
    protected String reminderType;
    @XmlElement(name = "Location")
    protected Long location;
    @XmlElement(name = "AddressName")
    protected String addressName;
    @XmlElement(name = "AddressType")
    protected String addressType;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Room")
    protected String room;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "DisplayInCalendar")
    protected String displayInCalendar;
    @XmlElement(name = "CustomerRefNo")
    protected String customerRefNo;
    @XmlElement(name = "ProblemSubType")
    protected Long problemSubType;
    @XmlElement(name = "AttachmentEntry")
    protected Long attachmentEntry;
    @XmlElement(name = "U_Causa")
    protected String uCausa;
    @XmlElement(name = "U_CateGa")
    protected String uCateGa;
    @XmlElement(name = "U_ProExt")
    protected String uProExt;
    @XmlElement(name = "U_Num_factura")
    protected String uNumFactura;
    @XmlElement(name = "U_TipoServ")
    protected String uTipoServ;
    @XmlElement(name = "U_NWR_RMA")
    protected String unwrrma;
    @XmlElement(name = "U_NWR_PO")
    protected String unwrpo;
    @XmlElement(name = "U_NWR_RMA_Type")
    protected Long unwrrmaType;
    @XmlElement(name = "U_ComentSoporte")
    protected String uComentSoporte;
    @XmlElement(name = "U_Material")
    protected String uMaterial;
    @XmlElement(name = "U_ProblemaMaterial")
    protected String uProblemaMaterial;
    @XmlElement(name = "U_crearSoporte")
    protected String uCrearSoporte;
    @XmlElement(name = "ServiceCallActivities")
    protected ServiceCall.ServiceCallActivities serviceCallActivities;
    @XmlElement(name = "ServiceCallInventoryExpenses")
    protected ServiceCall.ServiceCallInventoryExpenses serviceCallInventoryExpenses;
    @XmlElement(name = "ServiceCallSolutions")
    protected ServiceCall.ServiceCallSolutions serviceCallSolutions;

    /**
     * Obtiene el valor de la propiedad serviceCallID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceCallID() {
        return serviceCallID;
    }

    /**
     * Define el valor de la propiedad serviceCallID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceCallID(Long value) {
        this.serviceCallID = value;
    }

    /**
     * Obtiene el valor de la propiedad subject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Define el valor de la propiedad subject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Obtiene el valor de la propiedad customerCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Define el valor de la propiedad customerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    /**
     * Obtiene el valor de la propiedad customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Define el valor de la propiedad customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Obtiene el valor de la propiedad contactCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactCode() {
        return contactCode;
    }

    /**
     * Define el valor de la propiedad contactCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactCode(Long value) {
        this.contactCode = value;
    }

    /**
     * Obtiene el valor de la propiedad manufacturerSerialNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerSerialNum() {
        return manufacturerSerialNum;
    }

    /**
     * Define el valor de la propiedad manufacturerSerialNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerSerialNum(String value) {
        this.manufacturerSerialNum = value;
    }

    /**
     * Obtiene el valor de la propiedad internalSerialNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalSerialNum() {
        return internalSerialNum;
    }

    /**
     * Define el valor de la propiedad internalSerialNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalSerialNum(String value) {
        this.internalSerialNum = value;
    }

    /**
     * Obtiene el valor de la propiedad contractID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractID() {
        return contractID;
    }

    /**
     * Define el valor de la propiedad contractID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractID(Long value) {
        this.contractID = value;
    }

    /**
     * Obtiene el valor de la propiedad contractEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractEndDate() {
        return contractEndDate;
    }

    /**
     * Define el valor de la propiedad contractEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractEndDate(XMLGregorianCalendar value) {
        this.contractEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad resolutionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResolutionDate() {
        return resolutionDate;
    }

    /**
     * Define el valor de la propiedad resolutionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResolutionDate(XMLGregorianCalendar value) {
        this.resolutionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad resolutionTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResolutionTime() {
        return resolutionTime;
    }

    /**
     * Define el valor de la propiedad resolutionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResolutionTime(XMLGregorianCalendar value) {
        this.resolutionTime = value;
    }

    /**
     * Obtiene el valor de la propiedad origin.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrigin() {
        return origin;
    }

    /**
     * Define el valor de la propiedad origin.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrigin(Long value) {
        this.origin = value;
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
     * Obtiene el valor de la propiedad itemGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemGroupCode() {
        return itemGroupCode;
    }

    /**
     * Define el valor de la propiedad itemGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemGroupCode(Long value) {
        this.itemGroupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatus(Long value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad priority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Define el valor de la propiedad priority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Obtiene el valor de la propiedad callType.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCallType() {
        return callType;
    }

    /**
     * Define el valor de la propiedad callType.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCallType(Long value) {
        this.callType = value;
    }

    /**
     * Obtiene el valor de la propiedad problemType.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProblemType() {
        return problemType;
    }

    /**
     * Define el valor de la propiedad problemType.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProblemType(Long value) {
        this.problemType = value;
    }

    /**
     * Obtiene el valor de la propiedad assigneeCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssigneeCode() {
        return assigneeCode;
    }

    /**
     * Define el valor de la propiedad assigneeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssigneeCode(Long value) {
        this.assigneeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad technicianCode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTechnicianCode() {
        return technicianCode;
    }

    /**
     * Define el valor de la propiedad technicianCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTechnicianCode(Long value) {
        this.technicianCode = value;
    }

    /**
     * Obtiene el valor de la propiedad resolution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Define el valor de la propiedad resolution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
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
     * Obtiene el valor de la propiedad creationTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Define el valor de la propiedad creationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Obtiene el valor de la propiedad responder.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResponder() {
        return responder;
    }

    /**
     * Define el valor de la propiedad responder.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResponder(Long value) {
        this.responder = value;
    }

    /**
     * Obtiene el valor de la propiedad updatedTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedTime() {
        return updatedTime;
    }

    /**
     * Define el valor de la propiedad updatedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedTime(XMLGregorianCalendar value) {
        this.updatedTime = value;
    }

    /**
     * Obtiene el valor de la propiedad belongsToAQueue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelongsToAQueue() {
        return belongsToAQueue;
    }

    /**
     * Define el valor de la propiedad belongsToAQueue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelongsToAQueue(String value) {
        this.belongsToAQueue = value;
    }

    /**
     * Obtiene el valor de la propiedad responseByTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseByTime() {
        return responseByTime;
    }

    /**
     * Define el valor de la propiedad responseByTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseByTime(XMLGregorianCalendar value) {
        this.responseByTime = value;
    }

    /**
     * Obtiene el valor de la propiedad responseByDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseByDate() {
        return responseByDate;
    }

    /**
     * Define el valor de la propiedad responseByDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseByDate(XMLGregorianCalendar value) {
        this.responseByDate = value;
    }

    /**
     * Obtiene el valor de la propiedad resolutionOnDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResolutionOnDate() {
        return resolutionOnDate;
    }

    /**
     * Define el valor de la propiedad resolutionOnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResolutionOnDate(XMLGregorianCalendar value) {
        this.resolutionOnDate = value;
    }

    /**
     * Obtiene el valor de la propiedad responseOnTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseOnTime() {
        return responseOnTime;
    }

    /**
     * Define el valor de la propiedad responseOnTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseOnTime(XMLGregorianCalendar value) {
        this.responseOnTime = value;
    }

    /**
     * Obtiene el valor de la propiedad responseOnDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseOnDate() {
        return responseOnDate;
    }

    /**
     * Define el valor de la propiedad responseOnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseOnDate(XMLGregorianCalendar value) {
        this.responseOnDate = value;
    }

    /**
     * Obtiene el valor de la propiedad closingTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosingTime() {
        return closingTime;
    }

    /**
     * Define el valor de la propiedad closingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosingTime(XMLGregorianCalendar value) {
        this.closingTime = value;
    }

    /**
     * Obtiene el valor de la propiedad assignedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignedDate() {
        return assignedDate;
    }

    /**
     * Define el valor de la propiedad assignedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignedDate(XMLGregorianCalendar value) {
        this.assignedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad queue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueue() {
        return queue;
    }

    /**
     * Define el valor de la propiedad queue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueue(String value) {
        this.queue = value;
    }

    /**
     * Obtiene el valor de la propiedad responseAssignee.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResponseAssignee() {
        return responseAssignee;
    }

    /**
     * Define el valor de la propiedad responseAssignee.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResponseAssignee(Long value) {
        this.responseAssignee = value;
    }

    /**
     * Obtiene el valor de la propiedad entitledforService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitledforService() {
        return entitledforService;
    }

    /**
     * Define el valor de la propiedad entitledforService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitledforService(String value) {
        this.entitledforService = value;
    }

    /**
     * Obtiene el valor de la propiedad resolutionOnTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResolutionOnTime() {
        return resolutionOnTime;
    }

    /**
     * Define el valor de la propiedad resolutionOnTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResolutionOnTime(XMLGregorianCalendar value) {
        this.resolutionOnTime = value;
    }

    /**
     * Obtiene el valor de la propiedad assignedTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignedTime() {
        return assignedTime;
    }

    /**
     * Define el valor de la propiedad assignedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignedTime(XMLGregorianCalendar value) {
        this.assignedTime = value;
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
     * Obtiene el valor de la propiedad startTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Define el valor de la propiedad startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Obtiene el valor de la propiedad endDueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDueDate() {
        return endDueDate;
    }

    /**
     * Define el valor de la propiedad endDueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDueDate(XMLGregorianCalendar value) {
        this.endDueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Define el valor de la propiedad endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Obtiene el valor de la propiedad duration.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * Define el valor de la propiedad duration.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDuration(Double value) {
        this.duration = value;
    }

    /**
     * Obtiene el valor de la propiedad durationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationType() {
        return durationType;
    }

    /**
     * Define el valor de la propiedad durationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationType(String value) {
        this.durationType = value;
    }

    /**
     * Obtiene el valor de la propiedad reminder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReminder() {
        return reminder;
    }

    /**
     * Define el valor de la propiedad reminder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReminder(String value) {
        this.reminder = value;
    }

    /**
     * Obtiene el valor de la propiedad reminderPeriod.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReminderPeriod() {
        return reminderPeriod;
    }

    /**
     * Define el valor de la propiedad reminderPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReminderPeriod(Double value) {
        this.reminderPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad reminderType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReminderType() {
        return reminderType;
    }

    /**
     * Define el valor de la propiedad reminderType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReminderType(String value) {
        this.reminderType = value;
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
     * Obtiene el valor de la propiedad addressName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressName() {
        return addressName;
    }

    /**
     * Define el valor de la propiedad addressName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressName(String value) {
        this.addressName = value;
    }

    /**
     * Obtiene el valor de la propiedad addressType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Define el valor de la propiedad addressType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Obtiene el valor de la propiedad street.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Define el valor de la propiedad street.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad room.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoom() {
        return room;
    }

    /**
     * Define el valor de la propiedad room.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoom(String value) {
        this.room = value;
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
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad displayInCalendar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayInCalendar() {
        return displayInCalendar;
    }

    /**
     * Define el valor de la propiedad displayInCalendar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayInCalendar(String value) {
        this.displayInCalendar = value;
    }

    /**
     * Obtiene el valor de la propiedad customerRefNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRefNo() {
        return customerRefNo;
    }

    /**
     * Define el valor de la propiedad customerRefNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRefNo(String value) {
        this.customerRefNo = value;
    }

    /**
     * Obtiene el valor de la propiedad problemSubType.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProblemSubType() {
        return problemSubType;
    }

    /**
     * Define el valor de la propiedad problemSubType.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProblemSubType(Long value) {
        this.problemSubType = value;
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
     * Obtiene el valor de la propiedad uCausa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCausa() {
        return uCausa;
    }

    /**
     * Define el valor de la propiedad uCausa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCausa(String value) {
        this.uCausa = value;
    }

    /**
     * Obtiene el valor de la propiedad uCateGa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCateGa() {
        return uCateGa;
    }

    /**
     * Define el valor de la propiedad uCateGa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCateGa(String value) {
        this.uCateGa = value;
    }

    /**
     * Obtiene el valor de la propiedad uProExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUProExt() {
        return uProExt;
    }

    /**
     * Define el valor de la propiedad uProExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUProExt(String value) {
        this.uProExt = value;
    }

    /**
     * Obtiene el valor de la propiedad uNumFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNumFactura() {
        return uNumFactura;
    }

    /**
     * Define el valor de la propiedad uNumFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNumFactura(String value) {
        this.uNumFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad uTipoServ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTipoServ() {
        return uTipoServ;
    }

    /**
     * Define el valor de la propiedad uTipoServ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTipoServ(String value) {
        this.uTipoServ = value;
    }

    /**
     * Obtiene el valor de la propiedad unwrrma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNWRRMA() {
        return unwrrma;
    }

    /**
     * Define el valor de la propiedad unwrrma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNWRRMA(String value) {
        this.unwrrma = value;
    }

    /**
     * Obtiene el valor de la propiedad unwrpo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNWRPO() {
        return unwrpo;
    }

    /**
     * Define el valor de la propiedad unwrpo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNWRPO(String value) {
        this.unwrpo = value;
    }

    /**
     * Obtiene el valor de la propiedad unwrrmaType.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUNWRRMAType() {
        return unwrrmaType;
    }

    /**
     * Define el valor de la propiedad unwrrmaType.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUNWRRMAType(Long value) {
        this.unwrrmaType = value;
    }

    /**
     * Obtiene el valor de la propiedad uComentSoporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUComentSoporte() {
        return uComentSoporte;
    }

    /**
     * Define el valor de la propiedad uComentSoporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUComentSoporte(String value) {
        this.uComentSoporte = value;
    }

    /**
     * Obtiene el valor de la propiedad uMaterial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMaterial() {
        return uMaterial;
    }

    /**
     * Define el valor de la propiedad uMaterial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMaterial(String value) {
        this.uMaterial = value;
    }

    /**
     * Obtiene el valor de la propiedad uProblemaMaterial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUProblemaMaterial() {
        return uProblemaMaterial;
    }

    /**
     * Define el valor de la propiedad uProblemaMaterial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUProblemaMaterial(String value) {
        this.uProblemaMaterial = value;
    }

    /**
     * Obtiene el valor de la propiedad uCrearSoporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCrearSoporte() {
        return uCrearSoporte;
    }

    /**
     * Define el valor de la propiedad uCrearSoporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCrearSoporte(String value) {
        this.uCrearSoporte = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceCallActivities.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCall.ServiceCallActivities }
     *     
     */
    public ServiceCall.ServiceCallActivities getServiceCallActivities() {
        return serviceCallActivities;
    }

    /**
     * Define el valor de la propiedad serviceCallActivities.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCall.ServiceCallActivities }
     *     
     */
    public void setServiceCallActivities(ServiceCall.ServiceCallActivities value) {
        this.serviceCallActivities = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceCallInventoryExpenses.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCall.ServiceCallInventoryExpenses }
     *     
     */
    public ServiceCall.ServiceCallInventoryExpenses getServiceCallInventoryExpenses() {
        return serviceCallInventoryExpenses;
    }

    /**
     * Define el valor de la propiedad serviceCallInventoryExpenses.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCall.ServiceCallInventoryExpenses }
     *     
     */
    public void setServiceCallInventoryExpenses(ServiceCall.ServiceCallInventoryExpenses value) {
        this.serviceCallInventoryExpenses = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceCallSolutions.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCall.ServiceCallSolutions }
     *     
     */
    public ServiceCall.ServiceCallSolutions getServiceCallSolutions() {
        return serviceCallSolutions;
    }

    /**
     * Define el valor de la propiedad serviceCallSolutions.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCall.ServiceCallSolutions }
     *     
     */
    public void setServiceCallSolutions(ServiceCall.ServiceCallSolutions value) {
        this.serviceCallSolutions = value;
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
     *         &lt;element name="ServiceCallActivity" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ActivityCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
        "serviceCallActivity"
    })
    public static class ServiceCallActivities {

        @XmlElement(name = "ServiceCallActivity")
        protected List<ServiceCall.ServiceCallActivities.ServiceCallActivity> serviceCallActivity;

        /**
         * Gets the value of the serviceCallActivity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceCallActivity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceCallActivity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceCall.ServiceCallActivities.ServiceCallActivity }
         * 
         * 
         */
        public List<ServiceCall.ServiceCallActivities.ServiceCallActivity> getServiceCallActivity() {
            if (serviceCallActivity == null) {
                serviceCallActivity = new ArrayList<ServiceCall.ServiceCallActivities.ServiceCallActivity>();
            }
            return this.serviceCallActivity;
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
         *         &lt;element name="ActivityCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
        public static class ServiceCallActivity {

            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "ActivityCode")
            protected Long activityCode;

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
             * Obtiene el valor de la propiedad activityCode.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getActivityCode() {
                return activityCode;
            }

            /**
             * Define el valor de la propiedad activityCode.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setActivityCode(Long value) {
                this.activityCode = value;
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
     *         &lt;element name="ServiceCallInventoryExpense" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="PartType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="sep_Inventory"/>
     *                         &lt;enumeration value="sep_NonInventory"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DocumentType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="edt_Invoice"/>
     *                         &lt;enumeration value="edt_Delivery"/>
     *                         &lt;enumeration value="edt_Return"/>
     *                         &lt;enumeration value="edt_StockTransfer"/>
     *                         &lt;enumeration value="edt_CreditMemo"/>
     *                         &lt;enumeration value="edt_Order"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DocumentPostingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="StockTransferDirection" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="bos_TransferToTechnician"/>
     *                         &lt;enumeration value="bos_TransferFromTechnician"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
        "serviceCallInventoryExpense"
    })
    public static class ServiceCallInventoryExpenses {

        @XmlElement(name = "ServiceCallInventoryExpense")
        protected List<ServiceCall.ServiceCallInventoryExpenses.ServiceCallInventoryExpense> serviceCallInventoryExpense;

        /**
         * Gets the value of the serviceCallInventoryExpense property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceCallInventoryExpense property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceCallInventoryExpense().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceCall.ServiceCallInventoryExpenses.ServiceCallInventoryExpense }
         * 
         * 
         */
        public List<ServiceCall.ServiceCallInventoryExpenses.ServiceCallInventoryExpense> getServiceCallInventoryExpense() {
            if (serviceCallInventoryExpense == null) {
                serviceCallInventoryExpense = new ArrayList<ServiceCall.ServiceCallInventoryExpenses.ServiceCallInventoryExpense>();
            }
            return this.serviceCallInventoryExpense;
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
         *         &lt;element name="PartType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="sep_Inventory"/>
         *               &lt;enumeration value="sep_NonInventory"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DocumentType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="edt_Invoice"/>
         *               &lt;enumeration value="edt_Delivery"/>
         *               &lt;enumeration value="edt_Return"/>
         *               &lt;enumeration value="edt_StockTransfer"/>
         *               &lt;enumeration value="edt_CreditMemo"/>
         *               &lt;enumeration value="edt_Order"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DocumentPostingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="StockTransferDirection" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="bos_TransferToTechnician"/>
         *               &lt;enumeration value="bos_TransferFromTechnician"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
        public static class ServiceCallInventoryExpense {

            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "PartType")
            protected String partType;
            @XmlElement(name = "DocumentType")
            protected String documentType;
            @XmlElement(name = "DocumentPostingDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar documentPostingDate;
            @XmlElement(name = "DocumentNumber")
            protected Long documentNumber;
            @XmlElement(name = "StockTransferDirection")
            protected String stockTransferDirection;
            @XmlElement(name = "DocEntry")
            protected Long docEntry;

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
             * Obtiene el valor de la propiedad partType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPartType() {
                return partType;
            }

            /**
             * Define el valor de la propiedad partType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPartType(String value) {
                this.partType = value;
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
             * Obtiene el valor de la propiedad documentPostingDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDocumentPostingDate() {
                return documentPostingDate;
            }

            /**
             * Define el valor de la propiedad documentPostingDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDocumentPostingDate(XMLGregorianCalendar value) {
                this.documentPostingDate = value;
            }

            /**
             * Obtiene el valor de la propiedad documentNumber.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getDocumentNumber() {
                return documentNumber;
            }

            /**
             * Define el valor de la propiedad documentNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setDocumentNumber(Long value) {
                this.documentNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad stockTransferDirection.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStockTransferDirection() {
                return stockTransferDirection;
            }

            /**
             * Define el valor de la propiedad stockTransferDirection.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStockTransferDirection(String value) {
                this.stockTransferDirection = value;
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
     *         &lt;element name="ServiceCallSolution" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="SolutionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
        "serviceCallSolution"
    })
    public static class ServiceCallSolutions {

        @XmlElement(name = "ServiceCallSolution")
        protected List<ServiceCall.ServiceCallSolutions.ServiceCallSolution> serviceCallSolution;

        /**
         * Gets the value of the serviceCallSolution property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceCallSolution property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceCallSolution().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceCall.ServiceCallSolutions.ServiceCallSolution }
         * 
         * 
         */
        public List<ServiceCall.ServiceCallSolutions.ServiceCallSolution> getServiceCallSolution() {
            if (serviceCallSolution == null) {
                serviceCallSolution = new ArrayList<ServiceCall.ServiceCallSolutions.ServiceCallSolution>();
            }
            return this.serviceCallSolution;
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
         *         &lt;element name="SolutionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
        public static class ServiceCallSolution {

            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "SolutionID")
            protected Long solutionID;

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
             * Obtiene el valor de la propiedad solutionID.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getSolutionID() {
                return solutionID;
            }

            /**
             * Define el valor de la propiedad solutionID.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setSolutionID(Long value) {
                this.solutionID = value;
            }

        }

    }

}
