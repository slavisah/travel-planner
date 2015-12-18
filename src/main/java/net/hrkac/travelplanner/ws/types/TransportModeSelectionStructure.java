
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportModeSelectionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportModeSelectionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransportMode" type="{http://www.pluservice.net/travelplannerservice/data}TransportModeEnum"/&gt;
 *         &lt;element name="Selected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportModeSelectionStructure", propOrder = {
    "transportMode",
    "selected"
})
public class TransportModeSelectionStructure {

    @XmlElement(name = "TransportMode", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected TransportModeEnum transportMode;
    @XmlElement(name = "Selected")
    protected boolean selected;

    /**
     * Gets the value of the transportMode property.
     * 
     * @return
     *     possible object is
     *     {@link TransportModeEnum }
     *     
     */
    public TransportModeEnum getTransportMode() {
        return transportMode;
    }

    /**
     * Sets the value of the transportMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportModeEnum }
     *     
     */
    public void setTransportMode(TransportModeEnum value) {
        this.transportMode = value;
    }

    /**
     * Gets the value of the selected property.
     * 
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Sets the value of the selected property.
     * 
     */
    public void setSelected(boolean value) {
        this.selected = value;
    }

}
