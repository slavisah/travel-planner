
package net.hrkac.travelplanner.ws.types;

import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import net.hrkac.travelplanner.ws.custom.Adapter1;


/**
 * <p>Java class for DetailedLegStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailedLegStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pluservice.net/travelplannerservice/data}BaseLegStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DepartureStop" type="{http://www.pluservice.net/travelplannerservice/data}StopPointStructure" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalStop" type="{http://www.pluservice.net/travelplannerservice/data}StopPointStructure" minOccurs="0"/&gt;
 *         &lt;element name="LegMeters" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="LegMinutes" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Journey" type="{http://www.pluservice.net/travelplannerservice/data}JourneyInLegStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedLegStructure", propOrder = {
    "departureTime",
    "departureStop",
    "arrivalTime",
    "arrivalStop",
    "legMeters",
    "legMinutes",
    "journey"
})
public class DetailedLegStructure
    extends BaseLegStructure
{

    @XmlElement(name = "DepartureTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date departureTime;
    @XmlElement(name = "DepartureStop")
    protected StopPointStructure departureStop;
    @XmlElement(name = "ArrivalTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date arrivalTime;
    @XmlElement(name = "ArrivalStop", nillable = true)
    protected StopPointStructure arrivalStop;
    @XmlElement(name = "LegMeters", nillable = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger legMeters;
    @XmlElement(name = "LegMinutes", nillable = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger legMinutes;
    @XmlElement(name = "Journey", nillable = true)
    protected JourneyInLegStructure journey;

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(Date value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the departureStop property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointStructure }
     *     
     */
    public StopPointStructure getDepartureStop() {
        return departureStop;
    }

    /**
     * Sets the value of the departureStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointStructure }
     *     
     */
    public void setDepartureStop(StopPointStructure value) {
        this.departureStop = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(Date value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the arrivalStop property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointStructure }
     *     
     */
    public StopPointStructure getArrivalStop() {
        return arrivalStop;
    }

    /**
     * Sets the value of the arrivalStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointStructure }
     *     
     */
    public void setArrivalStop(StopPointStructure value) {
        this.arrivalStop = value;
    }

    /**
     * Gets the value of the legMeters property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLegMeters() {
        return legMeters;
    }

    /**
     * Sets the value of the legMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLegMeters(BigInteger value) {
        this.legMeters = value;
    }

    /**
     * Gets the value of the legMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLegMinutes() {
        return legMinutes;
    }

    /**
     * Sets the value of the legMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLegMinutes(BigInteger value) {
        this.legMinutes = value;
    }

    /**
     * Gets the value of the journey property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyInLegStructure }
     *     
     */
    public JourneyInLegStructure getJourney() {
        return journey;
    }

    /**
     * Sets the value of the journey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyInLegStructure }
     *     
     */
    public void setJourney(JourneyInLegStructure value) {
        this.journey = value;
    }

}
