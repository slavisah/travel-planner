
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseLegStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseLegStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LegDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TravelMode" type="{http://www.pluservice.net/travelplannerservice/data}TravelModeEnum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseLegStructure", propOrder = {
    "legDescription",
    "travelMode"
})
@XmlSeeAlso({
    DetailedLegStructure.class,
    GeoLegStructure.class,
    SimpleLegStructure.class
})
public class BaseLegStructure {

    @XmlElement(name = "LegDescription")
    protected String legDescription;
    @XmlElement(name = "TravelMode", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected TravelModeEnum travelMode;

    /**
     * Gets the value of the legDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegDescription() {
        return legDescription;
    }

    /**
     * Sets the value of the legDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegDescription(String value) {
        this.legDescription = value;
    }

    /**
     * Gets the value of the travelMode property.
     * 
     * @return
     *     possible object is
     *     {@link TravelModeEnum }
     *     
     */
    public TravelModeEnum getTravelMode() {
        return travelMode;
    }

    /**
     * Sets the value of the travelMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelModeEnum }
     *     
     */
    public void setTravelMode(TravelModeEnum value) {
        this.travelMode = value;
    }

}
