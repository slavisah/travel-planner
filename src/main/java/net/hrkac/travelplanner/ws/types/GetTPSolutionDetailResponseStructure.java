
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTPSolutionDetailResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTPSolutionDetailResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pluservice.net/travelplannerservice/data}BaseResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Solution" type="{http://www.pluservice.net/travelplannerservice/data}TPDetailedSolutionStructure"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTPSolutionDetailResponseStructure", propOrder = {
    "solution"
})
public class GetTPSolutionDetailResponseStructure
    extends BaseResponseStructure
{

    @XmlElement(name = "Solution", required = true)
    protected TPDetailedSolutionStructure solution;

    /**
     * Gets the value of the solution property.
     * 
     * @return
     *     possible object is
     *     {@link TPDetailedSolutionStructure }
     *     
     */
    public TPDetailedSolutionStructure getSolution() {
        return solution;
    }

    /**
     * Sets the value of the solution property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPDetailedSolutionStructure }
     *     
     */
    public void setSolution(TPDetailedSolutionStructure value) {
        this.solution = value;
    }

}
