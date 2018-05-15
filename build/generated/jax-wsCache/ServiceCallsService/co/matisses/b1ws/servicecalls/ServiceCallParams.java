
package co.matisses.b1ws.servicecalls;

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
 *       &lt;all>
 *         &lt;element name="ServiceCallID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlRootElement(name = "ServiceCallParams")
public class ServiceCallParams {

    @XmlElement(name = "ServiceCallID")
    protected Long serviceCallID;

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

}
