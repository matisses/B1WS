
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
 *         &lt;element ref="{http://www.sap.com/SBO/DIS}ActivityInstancesParams" minOccurs="0"/>
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
    "activityInstancesParams"
})
@XmlRootElement(name = "GetTopNActivityInstancesResponse")
public class GetTopNActivityInstancesResponse {

    @XmlElement(name = "ActivityInstancesParams")
    protected ActivityInstancesParams activityInstancesParams;

    /**
     * Obtiene el valor de la propiedad activityInstancesParams.
     * 
     * @return
     *     possible object is
     *     {@link ActivityInstancesParams }
     *     
     */
    public ActivityInstancesParams getActivityInstancesParams() {
        return activityInstancesParams;
    }

    /**
     * Define el valor de la propiedad activityInstancesParams.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityInstancesParams }
     *     
     */
    public void setActivityInstancesParams(ActivityInstancesParams value) {
        this.activityInstancesParams = value;
    }

}
