
package co.matisses.b1ws.journalentries;

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
 *         &lt;element ref="{http://www.sap.com/SBO/DIS}JournalEntryParams" minOccurs="0"/>
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
    "journalEntryParams"
})
@XmlRootElement(name = "AddResponse")
public class AddResponse {

    @XmlElement(name = "JournalEntryParams")
    protected JournalEntryParams journalEntryParams;

    /**
     * Obtiene el valor de la propiedad journalEntryParams.
     * 
     * @return
     *     possible object is
     *     {@link JournalEntryParams }
     *     
     */
    public JournalEntryParams getJournalEntryParams() {
        return journalEntryParams;
    }

    /**
     * Define el valor de la propiedad journalEntryParams.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntryParams }
     *     
     */
    public void setJournalEntryParams(JournalEntryParams value) {
        this.journalEntryParams = value;
    }

}
