
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BoundingBoxStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoundingBoxStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NorthEast" type="{http://www.pluservice.net/travelplannerservice/data}LocationStructure"/&gt;
 *         &lt;element name="SouthWest" type="{http://www.pluservice.net/travelplannerservice/data}LocationStructure"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundingBoxStructure", propOrder = {
    "northEast",
    "southWest"
})
public class BoundingBoxStructure {

    @XmlElement(name = "NorthEast", required = true)
    protected LocationStructure northEast;
    @XmlElement(name = "SouthWest", required = true)
    protected LocationStructure southWest;

    /**
     * Gets the value of the northEast property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getNorthEast() {
        return northEast;
    }

    /**
     * Sets the value of the northEast property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setNorthEast(LocationStructure value) {
        this.northEast = value;
    }

    /**
     * Gets the value of the southWest property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getSouthWest() {
        return southWest;
    }

    /**
     * Sets the value of the southWest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setSouthWest(LocationStructure value) {
        this.southWest = value;
    }

}
