
package co.matisses.b1ws.activities;

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
 *         &lt;element ref="{http://www.sap.com/SBO/DIS}ActivityInstancesListParams" minOccurs="0"/>
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
    "activityInstancesListParams"
})
@XmlRootElement(name = "GetTopNActivityInstances", namespace = "ActivitiesService")
public class GetTopNActivityInstances {

    @XmlElement(name = "ActivityInstancesListParams")
    protected ActivityInstancesListParams activityInstancesListParams;

    /**
     * Obtiene el valor de la propiedad activityInstancesListParams.
     * 
     * @return
     *     possible object is
     *     {@link ActivityInstancesListParams }
     *     
     */
    public ActivityInstancesListParams getActivityInstancesListParams() {
        return activityInstancesListParams;
    }

    /**
     * Define el valor de la propiedad activityInstancesListParams.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityInstancesListParams }
     *     
     */
    public void setActivityInstancesListParams(ActivityInstancesListParams value) {
        this.activityInstancesListParams = value;
    }

}
