
package co.matisses.b1ws.employeesinfo;

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
 *         &lt;element ref="{http://www.sap.com/SBO/DIS}EmployeeInfoParams" minOccurs="0"/>
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
    "employeeInfoParams"
})
@XmlRootElement(name = "Close", namespace = "EmployeesInfoService")
public class Close {

    @XmlElement(name = "EmployeeInfoParams")
    protected EmployeeInfoParams employeeInfoParams;

    /**
     * Obtiene el valor de la propiedad employeeInfoParams.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeInfoParams }
     *     
     */
    public EmployeeInfoParams getEmployeeInfoParams() {
        return employeeInfoParams;
    }

    /**
     * Define el valor de la propiedad employeeInfoParams.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeInfoParams }
     *     
     */
    public void setEmployeeInfoParams(EmployeeInfoParams value) {
        this.employeeInfoParams = value;
    }

}
