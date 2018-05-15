
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
 *         &lt;element ref="{http://www.sap.com/SBO/DIS}ActivityParams" minOccurs="0"/>
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
@XmlRootElement(name = "DeleteActivity", namespace = "ActivitiesService")
public class DeleteActivity {

    @XmlElement(name = "ActivityParams")
    protected ActivityParams activityParams;

    /**
     * Obtiene el valor de la propiedad activityParams.
     * 
     * @return
     *     possible object is
     *     {@link ActivityParams }
     *     
     */
    public ActivityParams getActivityParams() {
        return activityParams;
    }

    /**
     * Define el valor de la propiedad activityParams.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityParams }
     *     
     */
    public void setActivityParams(ActivityParams value) {
        this.activityParams = value;
    }

}
