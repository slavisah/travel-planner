
package net.hrkac.travelplanner.ws.types;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import net.hrkac.travelplanner.ws.custom.Adapter1;


/**
 * <p>Java class for BusStopScheduleStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusStopScheduleStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StopCode" type="{http://www.pluservice.net/travelplannerservice/data}PrivateCodeStructure"/&gt;
 *         &lt;element name="Journey" type="{http://www.pluservice.net/travelplannerservice/data}JourneyStructure"/&gt;
 *         &lt;element name="PassingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusStopScheduleStructure", propOrder = {
    "stopCode",
    "journey",
    "passingTime"
})
public class BusStopScheduleStructure {

    @XmlElement(name = "StopCode", required = true)
    protected PrivateCodeStructure stopCode;
    @XmlElement(name = "Journey", required = true)
    protected JourneyStructure journey;
    @XmlElement(name = "PassingTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date passingTime;

    /**
     * Gets the value of the stopCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getStopCode() {
        return stopCode;
    }

    /**
     * Sets the value of the stopCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setStopCode(PrivateCodeStructure value) {
        this.stopCode = value;
    }

    /**
     * Gets the value of the journey property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyStructure }
     *     
     */
    public JourneyStructure getJourney() {
        return journey;
    }

    /**
     * Sets the value of the journey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyStructure }
     *     
     */
    public void setJourney(JourneyStructure value) {
        this.journey = value;
    }

    /**
     * Gets the value of the passingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getPassingTime() {
        return passingTime;
    }

    /**
     * Sets the value of the passingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassingTime(Date value) {
        this.passingTime = value;
    }

}
