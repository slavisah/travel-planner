
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTPSolutionsResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTPSolutionsResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pluservice.net/travelplannerservice/data}BaseResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Solutions" type="{http://www.pluservice.net/travelplannerservice/data}ArrayOfTPSolution"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTPSolutionsResponseStructure", propOrder = {
    "solutions"
})
public class GetTPSolutionsResponseStructure
    extends BaseResponseStructure
{

    @XmlElement(name = "Solutions", required = true)
    protected ArrayOfTPSolution solutions;

    /**
     * Gets the value of the solutions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTPSolution }
     *     
     */
    public ArrayOfTPSolution getSolutions() {
        return solutions;
    }

    /**
     * Sets the value of the solutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTPSolution }
     *     
     */
    public void setSolutions(ArrayOfTPSolution value) {
        this.solutions = value;
    }

}
