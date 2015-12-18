
package net.hrkac.travelplanner.ws.types;

import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import net.hrkac.travelplanner.ws.custom.Adapter1;


/**
 * <p>Java class for BaseTPSolutionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseTPSolutionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SolutionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TotalMeters" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="OnBoardMeters" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="WalkingMeters" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="TotalMinutes" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="OnBoardMinutes" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="WalkingMinutes" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="DepartureInfo" type="{http://www.pluservice.net/travelplannerservice/data}PointStructure" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalInfo" type="{http://www.pluservice.net/travelplannerservice/data}PointStructure" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseTPSolutionStructure", propOrder = {
    "solutionId",
    "totalMeters",
    "onBoardMeters",
    "walkingMeters",
    "totalMinutes",
    "onBoardMinutes",
    "walkingMinutes",
    "departureInfo",
    "departureTime",
    "arrivalInfo",
    "arrivalTime"
})
@XmlSeeAlso({
    TPDetailedSolutionStructure.class,
    TPSolutionStructure.class
})
public class BaseTPSolutionStructure {

    @XmlElement(name = "SolutionId", required = true)
    protected String solutionId;
    @XmlElement(name = "TotalMeters")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalMeters;
    @XmlElement(name = "OnBoardMeters")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger onBoardMeters;
    @XmlElement(name = "WalkingMeters")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger walkingMeters;
    @XmlElement(name = "TotalMinutes")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalMinutes;
    @XmlElement(name = "OnBoardMinutes")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger onBoardMinutes;
    @XmlElement(name = "WalkingMinutes")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger walkingMinutes;
    @XmlElement(name = "DepartureInfo")
    protected PointStructure departureInfo;
    @XmlElement(name = "DepartureTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date departureTime;
    @XmlElement(name = "ArrivalInfo")
    protected PointStructure arrivalInfo;
    @XmlElement(name = "ArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date arrivalTime;

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
     * Gets the value of the totalMeters property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalMeters() {
        return totalMeters;
    }

    /**
     * Sets the value of the totalMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalMeters(BigInteger value) {
        this.totalMeters = value;
    }

    /**
     * Gets the value of the onBoardMeters property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOnBoardMeters() {
        return onBoardMeters;
    }

    /**
     * Sets the value of the onBoardMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOnBoardMeters(BigInteger value) {
        this.onBoardMeters = value;
    }

    /**
     * Gets the value of the walkingMeters property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWalkingMeters() {
        return walkingMeters;
    }

    /**
     * Sets the value of the walkingMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWalkingMeters(BigInteger value) {
        this.walkingMeters = value;
    }

    /**
     * Gets the value of the totalMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalMinutes() {
        return totalMinutes;
    }

    /**
     * Sets the value of the totalMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalMinutes(BigInteger value) {
        this.totalMinutes = value;
    }

    /**
     * Gets the value of the onBoardMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOnBoardMinutes() {
        return onBoardMinutes;
    }

    /**
     * Sets the value of the onBoardMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOnBoardMinutes(BigInteger value) {
        this.onBoardMinutes = value;
    }

    /**
     * Gets the value of the walkingMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWalkingMinutes() {
        return walkingMinutes;
    }

    /**
     * Sets the value of the walkingMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWalkingMinutes(BigInteger value) {
        this.walkingMinutes = value;
    }

    /**
     * Gets the value of the departureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PointStructure }
     *     
     */
    public PointStructure getDepartureInfo() {
        return departureInfo;
    }

    /**
     * Sets the value of the departureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointStructure }
     *     
     */
    public void setDepartureInfo(PointStructure value) {
        this.departureInfo = value;
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

    /**
     * Gets the value of the arrivalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PointStructure }
     *     
     */
    public PointStructure getArrivalInfo() {
        return arrivalInfo;
    }

    /**
     * Sets the value of the arrivalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointStructure }
     *     
     */
    public void setArrivalInfo(PointStructure value) {
        this.arrivalInfo = value;
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

}
