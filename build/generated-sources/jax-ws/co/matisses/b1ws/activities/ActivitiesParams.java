
package co.matisses.b1ws.activities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ActivityParams" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
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
    "activityParams"
})
@XmlRootElement(name = "ActivitiesParams")
public class ActivitiesParams {

    @XmlElement(name = "ActivityParams")
    protected List<ActivitiesParams.ActivityParams> activityParams;

    /**
     * Gets the value of the activityParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivitiesParams.ActivityParams }
     * 
     * 
     */
    public List<ActivitiesParams.ActivityParams> getActivityParams() {
        if (activityParams == null) {
            activityParams = new ArrayList<ActivitiesParams.ActivityParams>();
        }
        return this.activityParams;
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
    public static class ActivityParams {

        @XmlElement(name = "ActivityCode")
        protected Long activityCode;

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
