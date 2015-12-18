
package net.hrkac.travelplanner.ws.types;

import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


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

    @XmlElementRef(name = "DepartureTime", namespace = "http://www.pluservice.net/travelplannerservice/data", type = JAXBElement.class)
    protected JAXBElement<Date> departureTime;
    @XmlElement(name = "DepartureStop")
    protected StopPointStructure departureStop;
    @XmlElementRef(name = "ArrivalTime", namespace = "http://www.pluservice.net/travelplannerservice/data", type = JAXBElement.class)
    protected JAXBElement<Date> arrivalTime;
    @XmlElementRef(name = "ArrivalStop", namespace = "http://www.pluservice.net/travelplannerservice/data", type = JAXBElement.class)
    protected JAXBElement<StopPointStructure> arrivalStop;
    @XmlElementRef(name = "LegMeters", namespace = "http://www.pluservice.net/travelplannerservice/data", type = JAXBElement.class)
    protected JAXBElement<BigInteger> legMeters;
    @XmlElementRef(name = "LegMinutes", namespace = "http://www.pluservice.net/travelplannerservice/data", type = JAXBElement.class)
    protected JAXBElement<BigInteger> legMinutes;
    @XmlElementRef(name = "Journey", namespace = "http://www.pluservice.net/travelplannerservice/data", type = JAXBElement.class)
    protected JAXBElement<JourneyInLegStructure> journey;

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Date }{@code >}
     *     
     */
    public JAXBElement<Date> getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Date }{@code >}
     *     
     */
    public void setDepartureTime(JAXBElement<Date> value) {
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
     *     {@link JAXBElement }{@code <}{@link Date }{@code >}
     *     
     */
    public JAXBElement<Date> getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Date }{@code >}
     *     
     */
    public void setArrivalTime(JAXBElement<Date> value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the arrivalStop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopPointStructure }{@code >}
     *     
     */
    public JAXBElement<StopPointStructure> getArrivalStop() {
        return arrivalStop;
    }

    /**
     * Sets the value of the arrivalStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopPointStructure }{@code >}
     *     
     */
    public void setArrivalStop(JAXBElement<StopPointStructure> value) {
        this.arrivalStop = value;
    }

    /**
     * Gets the value of the legMeters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getLegMeters() {
        return legMeters;
    }

    /**
     * Sets the value of the legMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setLegMeters(JAXBElement<BigInteger> value) {
        this.legMeters = value;
    }

    /**
     * Gets the value of the legMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getLegMinutes() {
        return legMinutes;
    }

    /**
     * Sets the value of the legMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setLegMinutes(JAXBElement<BigInteger> value) {
        this.legMinutes = value;
    }

    /**
     * Gets the value of the journey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JourneyInLegStructure }{@code >}
     *     
     */
    public JAXBElement<JourneyInLegStructure> getJourney() {
        return journey;
    }

    /**
     * Sets the value of the journey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JourneyInLegStructure }{@code >}
     *     
     */
    public void setJourney(JAXBElement<JourneyInLegStructure> value) {
        this.journey = value;
    }

}
