
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocatingSystem" type="{http://www.pluservice.net/travelplannerservice/data}LocatingSystemEnum" minOccurs="0"/&gt;
 *         &lt;element name="CoordinateX" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="CoordinateY" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="CoordinateZ" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationStructure", propOrder = {
    "locatingSystem",
    "coordinateX",
    "coordinateY",
    "coordinateZ"
})
public class LocationStructure {

    @XmlElement(name = "LocatingSystem", nillable = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected LocatingSystemEnum locatingSystem;
    @XmlElement(name = "CoordinateX", required = true, type = Float.class, nillable = true)
    protected Float coordinateX;
    @XmlElement(name = "CoordinateY", required = true, type = Float.class, nillable = true)
    protected Float coordinateY;
    @XmlElement(name = "CoordinateZ", nillable = true)
    protected Float coordinateZ;

    /**
     * Gets the value of the locatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link LocatingSystemEnum }
     *     
     */
    public LocatingSystemEnum getLocatingSystem() {
        return locatingSystem;
    }

    /**
     * Sets the value of the locatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatingSystemEnum }
     *     
     */
    public void setLocatingSystem(LocatingSystemEnum value) {
        this.locatingSystem = value;
    }

    /**
     * Gets the value of the coordinateX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCoordinateX() {
        return coordinateX;
    }

    /**
     * Sets the value of the coordinateX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCoordinateX(Float value) {
        this.coordinateX = value;
    }

    /**
     * Gets the value of the coordinateY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCoordinateY() {
        return coordinateY;
    }

    /**
     * Sets the value of the coordinateY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCoordinateY(Float value) {
        this.coordinateY = value;
    }

    /**
     * Gets the value of the coordinateZ property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCoordinateZ() {
        return coordinateZ;
    }

    /**
     * Sets the value of the coordinateZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCoordinateZ(Float value) {
        this.coordinateZ = value;
    }

}
