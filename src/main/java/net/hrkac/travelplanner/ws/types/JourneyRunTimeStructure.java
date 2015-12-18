
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
 * <p>Java class for JourneyRunTimeStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyRunTimeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PointOrder" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StopPoint" type="{http://www.pluservice.net/travelplannerservice/data}StopPointStructure"/&gt;
 *         &lt;element name="UseOfStopPoint" type="{http://www.pluservice.net/travelplannerservice/data}UseOfStopPointStructure"/&gt;
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyRunTimeStructure", propOrder = {
    "pointOrder",
    "stopPoint",
    "useOfStopPoint",
    "arrivalTime",
    "departureTime"
})
public class JourneyRunTimeStructure {

    @XmlElement(name = "PointOrder")
    protected int pointOrder;
    @XmlElement(name = "StopPoint", required = true)
    protected StopPointStructure stopPoint;
    @XmlElement(name = "UseOfStopPoint", required = true)
    protected UseOfStopPointStructure useOfStopPoint;
    @XmlElement(name = "ArrivalTime", required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date arrivalTime;
    @XmlElement(name = "DepartureTime", required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date departureTime;

    /**
     * Gets the value of the pointOrder property.
     * 
     */
    public int getPointOrder() {
        return pointOrder;
    }

    /**
     * Sets the value of the pointOrder property.
     * 
     */
    public void setPointOrder(int value) {
        this.pointOrder = value;
    }

    /**
     * Gets the value of the stopPoint property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointStructure }
     *     
     */
    public StopPointStructure getStopPoint() {
        return stopPoint;
    }

    /**
     * Sets the value of the stopPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointStructure }
     *     
     */
    public void setStopPoint(StopPointStructure value) {
        this.stopPoint = value;
    }

    /**
     * Gets the value of the useOfStopPoint property.
     * 
     * @return
     *     possible object is
     *     {@link UseOfStopPointStructure }
     *     
     */
    public UseOfStopPointStructure getUseOfStopPoint() {
        return useOfStopPoint;
    }

    /**
     * Sets the value of the useOfStopPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseOfStopPointStructure }
     *     
     */
    public void setUseOfStopPoint(UseOfStopPointStructure value) {
        this.useOfStopPoint = value;
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

}
