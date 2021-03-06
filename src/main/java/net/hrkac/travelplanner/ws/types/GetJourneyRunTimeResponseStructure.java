
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetJourneyRunTimeResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetJourneyRunTimeResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pluservice.net/travelplannerservice/data}BaseResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Items" type="{http://www.pluservice.net/travelplannerservice/data}ArrayOfJourneyRunTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetJourneyRunTimeResponseStructure", propOrder = {
    "items"
})
public class GetJourneyRunTimeResponseStructure
    extends BaseResponseStructure
{

    @XmlElement(name = "Items", required = true)
    protected ArrayOfJourneyRunTime items;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJourneyRunTime }
     *     
     */
    public ArrayOfJourneyRunTime getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJourneyRunTime }
     *     
     */
    public void setItems(ArrayOfJourneyRunTime value) {
        this.items = value;
    }

}
