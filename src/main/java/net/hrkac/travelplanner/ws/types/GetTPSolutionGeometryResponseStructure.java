
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTPSolutionGeometryResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTPSolutionGeometryResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pluservice.net/travelplannerservice/data}BaseResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Solution" type="{http://www.pluservice.net/travelplannerservice/data}TPGeoSolutionStructure"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTPSolutionGeometryResponseStructure", propOrder = {
    "solution"
})
public class GetTPSolutionGeometryResponseStructure
    extends BaseResponseStructure
{

    @XmlElement(name = "Solution", required = true)
    protected TPGeoSolutionStructure solution;

    /**
     * Gets the value of the solution property.
     * 
     * @return
     *     possible object is
     *     {@link TPGeoSolutionStructure }
     *     
     */
    public TPGeoSolutionStructure getSolution() {
        return solution;
    }

    /**
     * Sets the value of the solution property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPGeoSolutionStructure }
     *     
     */
    public void setSolution(TPGeoSolutionStructure value) {
        this.solution = value;
    }

}
