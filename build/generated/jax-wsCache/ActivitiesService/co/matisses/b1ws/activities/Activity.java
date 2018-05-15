
package co.matisses.b1ws.activities;

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
 *         &lt;element name="ActivityCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ActivityTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Closed" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CloseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DocType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="pr_Low"/>
 *               &lt;enumeration value="pr_Normal"/>
 *               &lt;enumeration value="pr_High"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Activity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="cn_Conversation"/>
 *               &lt;enumeration value="cn_Meeting"/>
 *               &lt;enumeration value="cn_Task"/>
 *               &lt;enumeration value="cn_Other"/>
 *               &lt;enumeration value="cn_Note"/>
 *               &lt;enumeration value="cn_Campaign"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ActivityType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
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
 *         &lt;element name="SalesEmployee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContactPersonCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HandledBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalFlag" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentObjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ParentObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Room" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InactiveFlag" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousActivity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TentativeFlag" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EndDueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DocTypeEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachmentEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RecurrencePattern" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="rpNone"/>
 *               &lt;enumeration value="rpDaily"/>
 *               &lt;enumeration value="rpWeekly"/>
 *               &lt;enumeration value="rpMonthly"/>
 *               &lt;enumeration value="rpAnnually"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EndType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="etNoEndDate"/>
 *               &lt;enumeration value="etByCounter"/>
 *               &lt;enumeration value="etByDate"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SeriesStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SeriesEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MaxOccurrence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Interval" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Sunday" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Monday" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Tuesday" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Wednesday" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Thursday" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Friday" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Saturday" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RepeatOption" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="roByDate"/>
 *               &lt;enumeration value="roByWeekDay"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BelongedSeriesNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IsRemoved" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="tNO"/>
 *               &lt;enumeration value="tYES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="bo_ShipTo"/>
 *               &lt;enumeration value="bo_BillTo"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HandledByEmployee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RecurrenceSequenceSpecifier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="rsFirst"/>
 *               &lt;enumeration value="rsSecond"/>
 *               &lt;enumeration value="rsThird"/>
 *               &lt;enumeration value="rsFourth"/>
 *               &lt;enumeration value="rsLast"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RecurrenceDayInMonth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RecurrenceMonth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RecurrenceDayOfWeek" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="rdowDay"/>
 *               &lt;enumeration value="rdowWeekDay"/>
 *               &lt;enumeration value="rdowWeekendDay"/>
 *               &lt;enumeration value="rdowSun"/>
 *               &lt;enumeration value="rdowMon"/>
 *               &lt;enumeration value="rdowTue"/>
 *               &lt;enumeration value="rdowWed"/>
 *               &lt;enumeration value="rdowThu"/>
 *               &lt;enumeration value="rdowFri"/>
 *               &lt;enumeration value="rdowSat"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SalesOpportunityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesOpportunityLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlRootElement(name = "Activity")
public class Activity {

    @XmlElement(name = "ActivityCode")
    protected Long activityCode;
    @XmlElement(name = "CardCode")
    protected String cardCode;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "ActivityDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activityDate;
    @XmlElement(name = "ActivityTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar activityTime;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "Closed")
    protected String closed;
    @XmlElement(name = "CloseDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar closeDate;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Subject")
    protected Long subject;
    @XmlElement(name = "DocType")
    protected String docType;
    @XmlElement(name = "DocNum")
    protected String docNum;
    @XmlElement(name = "DocEntry")
    protected String docEntry;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "Details")
    protected String details;
    @XmlElement(name = "Activity")
    protected String activity;
    @XmlElement(name = "ActivityType")
    protected Long activityType;
    @XmlElement(name = "Location")
    protected Long location;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "Duration")
    protected Double duration;
    @XmlElement(name = "DurationType")
    protected String durationType;
    @XmlElement(name = "SalesEmployee")
    protected Long salesEmployee;
    @XmlElement(name = "ContactPersonCode")
    protected Long contactPersonCode;
    @XmlElement(name = "HandledBy")
    protected Long handledBy;
    @XmlElement(name = "Reminder")
    protected String reminder;
    @XmlElement(name = "ReminderPeriod")
    protected Double reminderPeriod;
    @XmlElement(name = "ReminderType")
    protected String reminderType;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "PersonalFlag")
    protected String personalFlag;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "ParentObjectId")
    protected Long parentObjectId;
    @XmlElement(name = "ParentObjectType")
    protected String parentObjectType;
    @XmlElement(name = "Room")
    protected String room;
    @XmlElement(name = "InactiveFlag")
    protected String inactiveFlag;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "PreviousActivity")
    protected Long previousActivity;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Status")
    protected Long status;
    @XmlElement(name = "TentativeFlag")
    protected String tentativeFlag;
    @XmlElement(name = "EndDueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDueDate;
    @XmlElement(name = "DocTypeEx")
    protected String docTypeEx;
    @XmlElement(name = "AttachmentEntry")
    protected Long attachmentEntry;
    @XmlElement(name = "RecurrencePattern")
    protected String recurrencePattern;
    @XmlElement(name = "EndType")
    protected String endType;
    @XmlElement(name = "SeriesStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar seriesStartDate;
    @XmlElement(name = "SeriesEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar seriesEndDate;
    @XmlElement(name = "MaxOccurrence")
    protected Long maxOccurrence;
    @XmlElement(name = "Interval")
    protected Long interval;
    @XmlElement(name = "Sunday")
    protected String sunday;
    @XmlElement(name = "Monday")
    protected String monday;
    @XmlElement(name = "Tuesday")
    protected String tuesday;
    @XmlElement(name = "Wednesday")
    protected String wednesday;
    @XmlElement(name = "Thursday")
    protected String thursday;
    @XmlElement(name = "Friday")
    protected String friday;
    @XmlElement(name = "Saturday")
    protected String saturday;
    @XmlElement(name = "RepeatOption")
    protected String repeatOption;
    @XmlElement(name = "BelongedSeriesNum")
    protected Long belongedSeriesNum;
    @XmlElement(name = "IsRemoved")
    protected String isRemoved;
    @XmlElement(name = "AddressName")
    protected String addressName;
    @XmlElement(name = "AddressType")
    protected String addressType;
    @XmlElement(name = "HandledByEmployee")
    protected Long handledByEmployee;
    @XmlElement(name = "RecurrenceSequenceSpecifier")
    protected String recurrenceSequenceSpecifier;
    @XmlElement(name = "RecurrenceDayInMonth")
    protected Long recurrenceDayInMonth;
    @XmlElement(name = "RecurrenceMonth")
    protected Long recurrenceMonth;
    @XmlElement(name = "RecurrenceDayOfWeek")
    protected String recurrenceDayOfWeek;
    @XmlElement(name = "SalesOpportunityId")
    protected Long salesOpportunityId;
    @XmlElement(name = "SalesOpportunityLine")
    protected Long salesOpportunityLine;

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
     * Obtiene el valor de la propiedad activityDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityDate() {
        return activityDate;
    }

    /**
     * Define el valor de la propiedad activityDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityDate(XMLGregorianCalendar value) {
        this.activityDate = value;
    }

    /**
     * Obtiene el valor de la propiedad activityTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityTime() {
        return activityTime;
    }

    /**
     * Define el valor de la propiedad activityTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityTime(XMLGregorianCalendar value) {
        this.activityTime = value;
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
     * Obtiene el valor de la propiedad closed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosed() {
        return closed;
    }

    /**
     * Define el valor de la propiedad closed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosed(String value) {
        this.closed = value;
    }

    /**
     * Obtiene el valor de la propiedad closeDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseDate() {
        return closeDate;
    }

    /**
     * Define el valor de la propiedad closeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseDate(XMLGregorianCalendar value) {
        this.closeDate = value;
    }

    /**
     * Obtiene el valor de la propiedad phone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Define el valor de la propiedad phone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
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
     * Obtiene el valor de la propiedad subject.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubject() {
        return subject;
    }

    /**
     * Define el valor de la propiedad subject.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubject(Long value) {
        this.subject = value;
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
     * Obtiene el valor de la propiedad docNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNum() {
        return docNum;
    }

    /**
     * Define el valor de la propiedad docNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNum(String value) {
        this.docNum = value;
    }

    /**
     * Obtiene el valor de la propiedad docEntry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocEntry() {
        return docEntry;
    }

    /**
     * Define el valor de la propiedad docEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocEntry(String value) {
        this.docEntry = value;
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
     * Obtiene el valor de la propiedad activity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Define el valor de la propiedad activity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity(String value) {
        this.activity = value;
    }

    /**
     * Obtiene el valor de la propiedad activityType.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActivityType() {
        return activityType;
    }

    /**
     * Define el valor de la propiedad activityType.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActivityType(Long value) {
        this.activityType = value;
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
     * Obtiene el valor de la propiedad salesEmployee.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesEmployee() {
        return salesEmployee;
    }

    /**
     * Define el valor de la propiedad salesEmployee.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesEmployee(Long value) {
        this.salesEmployee = value;
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
     * Obtiene el valor de la propiedad handledBy.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHandledBy() {
        return handledBy;
    }

    /**
     * Define el valor de la propiedad handledBy.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHandledBy(Long value) {
        this.handledBy = value;
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
     * Obtiene el valor de la propiedad personalFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalFlag() {
        return personalFlag;
    }

    /**
     * Define el valor de la propiedad personalFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalFlag(String value) {
        this.personalFlag = value;
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
     * Obtiene el valor de la propiedad parentObjectId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentObjectId() {
        return parentObjectId;
    }

    /**
     * Define el valor de la propiedad parentObjectId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentObjectId(Long value) {
        this.parentObjectId = value;
    }

    /**
     * Obtiene el valor de la propiedad parentObjectType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentObjectType() {
        return parentObjectType;
    }

    /**
     * Define el valor de la propiedad parentObjectType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentObjectType(String value) {
        this.parentObjectType = value;
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
     * Obtiene el valor de la propiedad inactiveFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInactiveFlag() {
        return inactiveFlag;
    }

    /**
     * Define el valor de la propiedad inactiveFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInactiveFlag(String value) {
        this.inactiveFlag = value;
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
     * Obtiene el valor de la propiedad previousActivity.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreviousActivity() {
        return previousActivity;
    }

    /**
     * Define el valor de la propiedad previousActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreviousActivity(Long value) {
        this.previousActivity = value;
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
     * Obtiene el valor de la propiedad tentativeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTentativeFlag() {
        return tentativeFlag;
    }

    /**
     * Define el valor de la propiedad tentativeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTentativeFlag(String value) {
        this.tentativeFlag = value;
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
     * Obtiene el valor de la propiedad docTypeEx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTypeEx() {
        return docTypeEx;
    }

    /**
     * Define el valor de la propiedad docTypeEx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTypeEx(String value) {
        this.docTypeEx = value;
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
     * Obtiene el valor de la propiedad recurrencePattern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrencePattern() {
        return recurrencePattern;
    }

    /**
     * Define el valor de la propiedad recurrencePattern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrencePattern(String value) {
        this.recurrencePattern = value;
    }

    /**
     * Obtiene el valor de la propiedad endType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndType() {
        return endType;
    }

    /**
     * Define el valor de la propiedad endType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndType(String value) {
        this.endType = value;
    }

    /**
     * Obtiene el valor de la propiedad seriesStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeriesStartDate() {
        return seriesStartDate;
    }

    /**
     * Define el valor de la propiedad seriesStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeriesStartDate(XMLGregorianCalendar value) {
        this.seriesStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad seriesEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeriesEndDate() {
        return seriesEndDate;
    }

    /**
     * Define el valor de la propiedad seriesEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeriesEndDate(XMLGregorianCalendar value) {
        this.seriesEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad maxOccurrence.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxOccurrence() {
        return maxOccurrence;
    }

    /**
     * Define el valor de la propiedad maxOccurrence.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxOccurrence(Long value) {
        this.maxOccurrence = value;
    }

    /**
     * Obtiene el valor de la propiedad interval.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterval() {
        return interval;
    }

    /**
     * Define el valor de la propiedad interval.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterval(Long value) {
        this.interval = value;
    }

    /**
     * Obtiene el valor de la propiedad sunday.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSunday() {
        return sunday;
    }

    /**
     * Define el valor de la propiedad sunday.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSunday(String value) {
        this.sunday = value;
    }

    /**
     * Obtiene el valor de la propiedad monday.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonday() {
        return monday;
    }

    /**
     * Define el valor de la propiedad monday.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonday(String value) {
        this.monday = value;
    }

    /**
     * Obtiene el valor de la propiedad tuesday.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTuesday() {
        return tuesday;
    }

    /**
     * Define el valor de la propiedad tuesday.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTuesday(String value) {
        this.tuesday = value;
    }

    /**
     * Obtiene el valor de la propiedad wednesday.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWednesday() {
        return wednesday;
    }

    /**
     * Define el valor de la propiedad wednesday.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWednesday(String value) {
        this.wednesday = value;
    }

    /**
     * Obtiene el valor de la propiedad thursday.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThursday() {
        return thursday;
    }

    /**
     * Define el valor de la propiedad thursday.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThursday(String value) {
        this.thursday = value;
    }

    /**
     * Obtiene el valor de la propiedad friday.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriday() {
        return friday;
    }

    /**
     * Define el valor de la propiedad friday.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriday(String value) {
        this.friday = value;
    }

    /**
     * Obtiene el valor de la propiedad saturday.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturday() {
        return saturday;
    }

    /**
     * Define el valor de la propiedad saturday.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturday(String value) {
        this.saturday = value;
    }

    /**
     * Obtiene el valor de la propiedad repeatOption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatOption() {
        return repeatOption;
    }

    /**
     * Define el valor de la propiedad repeatOption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatOption(String value) {
        this.repeatOption = value;
    }

    /**
     * Obtiene el valor de la propiedad belongedSeriesNum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBelongedSeriesNum() {
        return belongedSeriesNum;
    }

    /**
     * Define el valor de la propiedad belongedSeriesNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBelongedSeriesNum(Long value) {
        this.belongedSeriesNum = value;
    }

    /**
     * Obtiene el valor de la propiedad isRemoved.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRemoved() {
        return isRemoved;
    }

    /**
     * Define el valor de la propiedad isRemoved.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRemoved(String value) {
        this.isRemoved = value;
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
     * Obtiene el valor de la propiedad handledByEmployee.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHandledByEmployee() {
        return handledByEmployee;
    }

    /**
     * Define el valor de la propiedad handledByEmployee.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHandledByEmployee(Long value) {
        this.handledByEmployee = value;
    }

    /**
     * Obtiene el valor de la propiedad recurrenceSequenceSpecifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceSequenceSpecifier() {
        return recurrenceSequenceSpecifier;
    }

    /**
     * Define el valor de la propiedad recurrenceSequenceSpecifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceSequenceSpecifier(String value) {
        this.recurrenceSequenceSpecifier = value;
    }

    /**
     * Obtiene el valor de la propiedad recurrenceDayInMonth.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecurrenceDayInMonth() {
        return recurrenceDayInMonth;
    }

    /**
     * Define el valor de la propiedad recurrenceDayInMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecurrenceDayInMonth(Long value) {
        this.recurrenceDayInMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad recurrenceMonth.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecurrenceMonth() {
        return recurrenceMonth;
    }

    /**
     * Define el valor de la propiedad recurrenceMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecurrenceMonth(Long value) {
        this.recurrenceMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad recurrenceDayOfWeek.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceDayOfWeek() {
        return recurrenceDayOfWeek;
    }

    /**
     * Define el valor de la propiedad recurrenceDayOfWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceDayOfWeek(String value) {
        this.recurrenceDayOfWeek = value;
    }

    /**
     * Obtiene el valor de la propiedad salesOpportunityId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesOpportunityId() {
        return salesOpportunityId;
    }

    /**
     * Define el valor de la propiedad salesOpportunityId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesOpportunityId(Long value) {
        this.salesOpportunityId = value;
    }

    /**
     * Obtiene el valor de la propiedad salesOpportunityLine.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesOpportunityLine() {
        return salesOpportunityLine;
    }

    /**
     * Define el valor de la propiedad salesOpportunityLine.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesOpportunityLine(Long value) {
        this.salesOpportunityLine = value;
    }

}
