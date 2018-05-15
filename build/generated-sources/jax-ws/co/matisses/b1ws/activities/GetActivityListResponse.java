
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
 *         &lt;element ref="{http://www.sap.com/SBO/DIS}ActivitiesParams" minOccurs="0"/>
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
    "activitiesParams"
})
@XmlRootElement(name = "GetActivityListResponse")
public class GetActivityListResponse {

    @XmlElement(name = "ActivitiesParams")
    protected ActivitiesParams activitiesParams;

    /**
     * Obtiene el valor de la propiedad activitiesParams.
     * 
     * @return
     *     possible object is
     *     {@link ActivitiesParams }
     *     
     */
    public ActivitiesParams getActivitiesParams() {
        return activitiesParams;
    }

    /**
     * Define el valor de la propiedad activitiesParams.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivitiesParams }
     *     
     */
    public void setActivitiesParams(ActivitiesParams value) {
        this.activitiesParams = value;
    }

}
