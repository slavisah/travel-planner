
package net.hrkac.travelplanner.ws.elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.hrkac.travelplanner.ws.types.GetTPSolutionGeometryRequestStructure;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://www.pluservice.net/travelplannerservice/data}GetTPSolutionGeometryRequestStructure"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request"
})
@XmlRootElement(name = "GetTPSolutionGeometry")
public class GetTPSolutionGeometry {

    @XmlElement(required = true, nillable = true)
    protected GetTPSolutionGeometryRequestStructure request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GetTPSolutionGeometryRequestStructure }
     *     
     */
    public GetTPSolutionGeometryRequestStructure getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTPSolutionGeometryRequestStructure }
     *     
     */
    public void setRequest(GetTPSolutionGeometryRequestStructure value) {
        this.request = value;
    }

}
