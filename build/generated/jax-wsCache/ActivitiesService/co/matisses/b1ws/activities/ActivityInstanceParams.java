
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
@XmlRootElement(name = "ActivityInstanceParams")
public class ActivityInstanceParams {

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
