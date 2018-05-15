
package co.matisses.b1ws.activities;

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
 *       &lt;sequence>
 *         &lt;element name="ActivityInstanceParams" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="ActivityCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="InstanceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
    "activityInstanceParams"
})
@XmlRootElement(name = "ActivityInstancesParams")
public class ActivityInstancesParams {

    @XmlElement(name = "ActivityInstanceParams")
    protected List<ActivityInstancesParams.ActivityInstanceParams> activityInstanceParams;

    /**
     * Gets the value of the activityInstanceParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityInstanceParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityInstanceParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityInstancesParams.ActivityInstanceParams }
     * 
     * 
     */
    public List<ActivityInstancesParams.ActivityInstanceParams> getActivityInstanceParams() {
        if (activityInstanceParams == null) {
            activityInstanceParams = new ArrayList<ActivityInstancesParams.ActivityInstanceParams>();
        }
        return this.activityInstanceParams;
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
     *         &lt;element name="ActivityCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="InstanceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
    public static class ActivityInstanceParams {

        @XmlElement(name = "ActivityCode")
        protected Long activityCode;
        @XmlElement(name = "InstanceDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar instanceDate;

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
         * Obtiene el valor de la propiedad instanceDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getInstanceDate() {
            return instanceDate;
        }

        /**
         * Define el valor de la propiedad instanceDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setInstanceDate(XMLGregorianCalendar value) {
            this.instanceDate = value;
        }

    }

}
