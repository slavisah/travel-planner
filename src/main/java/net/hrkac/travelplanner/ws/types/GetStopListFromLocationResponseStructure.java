
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetStopListFromLocationResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStopListFromLocationResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pluservice.net/travelplannerservice/data}BaseResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Items" type="{http://www.pluservice.net/travelplannerservice/data}ArrayOfDistancedStopPoint"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStopListFromLocationResponseStructure", propOrder = {
    "items"
})
public class GetStopListFromLocationResponseStructure
    extends BaseResponseStructure
{

    @XmlElement(name = "Items", required = true, nillable = true)
    protected ArrayOfDistancedStopPoint items;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDistancedStopPoint }
     *     
     */
    public ArrayOfDistancedStopPoint getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDistancedStopPoint }
     *     
     */
    public void setItems(ArrayOfDistancedStopPoint value) {
        this.items = value;
    }

}
