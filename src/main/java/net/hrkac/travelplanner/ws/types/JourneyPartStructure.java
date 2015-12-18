
package net.hrkac.travelplanner.ws.types;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JourneyPartStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyPartStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FromRunTimePointOrder" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="ToRunTimePointOrder" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyPartStructure", propOrder = {
    "fromRunTimePointOrder",
    "toRunTimePointOrder"
})
public class JourneyPartStructure {

    @XmlElement(name = "FromRunTimePointOrder", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger fromRunTimePointOrder;
    @XmlElement(name = "ToRunTimePointOrder", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger toRunTimePointOrder;

    /**
     * Gets the value of the fromRunTimePointOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFromRunTimePointOrder() {
        return fromRunTimePointOrder;
    }

    /**
     * Sets the value of the fromRunTimePointOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFromRunTimePointOrder(BigInteger value) {
        this.fromRunTimePointOrder = value;
    }

    /**
     * Gets the value of the toRunTimePointOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getToRunTimePointOrder() {
        return toRunTimePointOrder;
    }

    /**
     * Sets the value of the toRunTimePointOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setToRunTimePointOrder(BigInteger value) {
        this.toRunTimePointOrder = value;
    }

}
