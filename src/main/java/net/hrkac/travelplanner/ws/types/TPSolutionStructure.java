
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPSolutionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPSolutionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pluservice.net/travelplannerservice/data}BaseTPSolutionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Legs" type="{http://www.pluservice.net/travelplannerservice/data}ArrayOfSimpleLeg"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPSolutionStructure", propOrder = {
    "legs"
})
public class TPSolutionStructure
    extends BaseTPSolutionStructure
{

    @XmlElement(name = "Legs", required = true)
    protected ArrayOfSimpleLeg legs;

    /**
     * Gets the value of the legs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSimpleLeg }
     *     
     */
    public ArrayOfSimpleLeg getLegs() {
        return legs;
    }

    /**
     * Sets the value of the legs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSimpleLeg }
     *     
     */
    public void setLegs(ArrayOfSimpleLeg value) {
        this.legs = value;
    }

}
