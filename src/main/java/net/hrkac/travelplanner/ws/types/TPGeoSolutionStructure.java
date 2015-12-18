
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPGeoSolutionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPGeoSolutionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SolutionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Bounds" type="{http://www.pluservice.net/travelplannerservice/data}BoundingBoxStructure"/&gt;
 *         &lt;element name="Stops" type="{http://www.pluservice.net/travelplannerservice/data}ArrayOfStopPoint"/&gt;
 *         &lt;element name="Legs" type="{http://www.pluservice.net/travelplannerservice/data}ArrayOfGeoLeg"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPGeoSolutionStructure", propOrder = {
    "solutionId",
    "bounds",
    "stops",
    "legs"
})
public class TPGeoSolutionStructure {

    @XmlElement(name = "SolutionId", required = true)
    protected String solutionId;
    @XmlElement(name = "Bounds", required = true)
    protected BoundingBoxStructure bounds;
    @XmlElement(name = "Stops", required = true)
    protected ArrayOfStopPoint stops;
    @XmlElement(name = "Legs", required = true)
    protected ArrayOfGeoLeg legs;

    /**
     * Gets the value of the solutionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolutionId() {
        return solutionId;
    }

    /**
     * Sets the value of the solutionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolutionId(String value) {
        this.solutionId = value;
    }

    /**
     * Gets the value of the bounds property.
     * 
     * @return
     *     possible object is
     *     {@link BoundingBoxStructure }
     *     
     */
    public BoundingBoxStructure getBounds() {
        return bounds;
    }

    /**
     * Sets the value of the bounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundingBoxStructure }
     *     
     */
    public void setBounds(BoundingBoxStructure value) {
        this.bounds = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStopPoint }
     *     
     */
    public ArrayOfStopPoint getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStopPoint }
     *     
     */
    public void setStops(ArrayOfStopPoint value) {
        this.stops = value;
    }

    /**
     * Gets the value of the legs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGeoLeg }
     *     
     */
    public ArrayOfGeoLeg getLegs() {
        return legs;
    }

    /**
     * Sets the value of the legs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGeoLeg }
     *     
     */
    public void setLegs(ArrayOfGeoLeg value) {
        this.legs = value;
    }

}
