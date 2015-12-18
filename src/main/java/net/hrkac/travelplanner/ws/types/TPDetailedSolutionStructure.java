
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPDetailedSolutionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPDetailedSolutionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pluservice.net/travelplannerservice/data}BaseTPSolutionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Legs" type="{http://www.pluservice.net/travelplannerservice/data}ArrayOfDetailedLeg"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPDetailedSolutionStructure", propOrder = {
    "legs"
})
public class TPDetailedSolutionStructure
    extends BaseTPSolutionStructure
{

    @XmlElement(name = "Legs", required = true)
    protected ArrayOfDetailedLeg legs;

    /**
     * Gets the value of the legs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDetailedLeg }
     *     
     */
    public ArrayOfDetailedLeg getLegs() {
        return legs;
    }

    /**
     * Sets the value of the legs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDetailedLeg }
     *     
     */
    public void setLegs(ArrayOfDetailedLeg value) {
        this.legs = value;
    }

}
