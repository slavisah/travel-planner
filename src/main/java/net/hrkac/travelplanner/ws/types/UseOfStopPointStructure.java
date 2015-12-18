
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UseOfStopPointStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UseOfStopPointStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ForBoarding" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ForAlighting" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UseOfStopPointStructure", propOrder = {
    "forBoarding",
    "forAlighting"
})
public class UseOfStopPointStructure {

    @XmlElement(name = "ForBoarding")
    protected boolean forBoarding;
    @XmlElement(name = "ForAlighting")
    protected boolean forAlighting;

    /**
     * Gets the value of the forBoarding property.
     * 
     */
    public boolean isForBoarding() {
        return forBoarding;
    }

    /**
     * Sets the value of the forBoarding property.
     * 
     */
    public void setForBoarding(boolean value) {
        this.forBoarding = value;
    }

    /**
     * Gets the value of the forAlighting property.
     * 
     */
    public boolean isForAlighting() {
        return forAlighting;
    }

    /**
     * Sets the value of the forAlighting property.
     * 
     */
    public void setForAlighting(boolean value) {
        this.forAlighting = value;
    }

}
