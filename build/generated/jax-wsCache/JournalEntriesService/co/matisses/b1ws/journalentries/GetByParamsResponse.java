
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
 *         &lt;element ref="{http://www.sap.com/SBO/DIS}JournalEntry" minOccurs="0"/>
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
    "journalEntry"
})
@XmlRootElement(name = "GetByParamsResponse")
public class GetByParamsResponse {

    @XmlElement(name = "JournalEntry")
    protected JournalEntry journalEntry;

    /**
     * Obtiene el valor de la propiedad journalEntry.
     * 
     * @return
     *     possible object is
     *     {@link JournalEntry }
     *     
     */
    public JournalEntry getJournalEntry() {
        return journalEntry;
    }

    /**
     * Define el valor de la propiedad journalEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntry }
     *     
     */
    public void setJournalEntry(JournalEntry value) {
        this.journalEntry = value;
    }

}
