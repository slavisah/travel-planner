
package net.hrkac.travelplanner.ws.types;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import net.hrkac.travelplanner.ws.custom.Adapter1;


/**
 * <p>Java class for GetJourneyRunTimeRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetJourneyRunTimeRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pluservice.net/travelplannerservice/data}BaseRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ReferenceJourney" type="{http://www.pluservice.net/travelplannerservice/data}PrivateCodeStructure"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetJourneyRunTimeRequestStructure", propOrder = {
    "referenceDate",
    "referenceJourney"
})
public class GetJourneyRunTimeRequestStructure
    extends BaseRequestStructure
{

    @XmlElement(name = "ReferenceDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date referenceDate;
    @XmlElement(name = "ReferenceJourney", required = true)
    protected PrivateCodeStructure referenceJourney;

    /**
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDate(Date value) {
        this.referenceDate = value;
    }

    /**
     * Gets the value of the referenceJourney property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getReferenceJourney() {
        return referenceJourney;
    }

    /**
     * Sets the value of the referenceJourney property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setReferenceJourney(PrivateCodeStructure value) {
        this.referenceJourney = value;
    }

}
