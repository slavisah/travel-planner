
package net.hrkac.travelplanner.ws.elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.hrkac.travelplanner.ws.types.GetStopListFromNameResponseStructure;


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
 *         &lt;element name="response" type="{http://www.pluservice.net/travelplannerservice/data}GetStopListFromNameResponseStructure"/&gt;
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
    "response"
})
@XmlRootElement(name = "GetStopListFromNameResponse")
public class GetStopListFromNameResponse {

    @XmlElement(required = true, nillable = true)
    protected GetStopListFromNameResponseStructure response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link GetStopListFromNameResponseStructure }
     *     
     */
    public GetStopListFromNameResponseStructure getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStopListFromNameResponseStructure }
     *     
     */
    public void setResponse(GetStopListFromNameResponseStructure value) {
        this.response = value;
    }

}
