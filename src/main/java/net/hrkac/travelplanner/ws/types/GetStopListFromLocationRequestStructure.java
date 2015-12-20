
package net.hrkac.travelplanner.ws.types;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetStopListFromLocationRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStopListFromLocationRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pluservice.net/travelplannerservice/data}BaseRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Point" type="{http://www.pluservice.net/travelplannerservice/data}LocationStructure"/&gt;
 *         &lt;element name="MaxDistanceMeters" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStopListFromLocationRequestStructure", propOrder = {
    "point",
    "maxDistanceMeters"
})
public class GetStopListFromLocationRequestStructure
    extends BaseRequestStructure
{

    @XmlElement(name = "Point", required = true, nillable = true)
    protected LocationStructure point;
    @XmlElement(name = "MaxDistanceMeters", nillable = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxDistanceMeters;

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setPoint(LocationStructure value) {
        this.point = value;
    }

    /**
     * Gets the value of the maxDistanceMeters property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxDistanceMeters() {
        return maxDistanceMeters;
    }

    /**
     * Sets the value of the maxDistanceMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxDistanceMeters(BigInteger value) {
        this.maxDistanceMeters = value;
    }

}
