
package net.hrkac.travelplanner.ws.types;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JourneyPatternStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyPatternStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrivateCode" type="{http://www.pluservice.net/travelplannerservice/data}PrivateCodeStructure"/&gt;
 *         &lt;element name="PublicCode" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/&gt;
 *         &lt;element name="InfomobCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JourneyPatternDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HeadSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Line" type="{http://www.pluservice.net/travelplannerservice/data}LineStructure"/&gt;
 *         &lt;element name="Direction" type="{http://www.pluservice.net/travelplannerservice/data}DirectionEnum"/&gt;
 *         &lt;element name="DepartureStop" type="{http://www.pluservice.net/travelplannerservice/data}StopPointStructure"/&gt;
 *         &lt;element name="ArrivalStop" type="{http://www.pluservice.net/travelplannerservice/data}StopPointStructure"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyPatternStructure", propOrder = {
    "privateCode",
    "publicCode",
    "infomobCode",
    "journeyPatternDescription",
    "headSign",
    "line",
    "direction",
    "departureStop",
    "arrivalStop",
    "length"
})
public class JourneyPatternStructure {

    @XmlElement(name = "PrivateCode", required = true)
    protected PrivateCodeStructure privateCode;
    @XmlElementRef(name = "PublicCode", namespace = "http://www.pluservice.net/travelplannerservice/data", type = JAXBElement.class)
    protected JAXBElement<String> publicCode;
    @XmlElement(name = "InfomobCode")
    protected String infomobCode;
    @XmlElementRef(name = "JourneyPatternDescription", namespace = "http://www.pluservice.net/travelplannerservice/data", type = JAXBElement.class)
    protected JAXBElement<String> journeyPatternDescription;
    @XmlElementRef(name = "HeadSign", namespace = "http://www.pluservice.net/travelplannerservice/data", type = JAXBElement.class)
    protected JAXBElement<String> headSign;
    @XmlElement(name = "Line", required = true)
    protected LineStructure line;
    @XmlElement(name = "Direction", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected DirectionEnum direction;
    @XmlElement(name = "DepartureStop", required = true)
    protected StopPointStructure departureStop;
    @XmlElement(name = "ArrivalStop", required = true)
    protected StopPointStructure arrivalStop;
    @XmlElement(name = "Length")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger length;

    /**
     * Gets the value of the privateCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Sets the value of the privateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Gets the value of the publicCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPublicCode() {
        return publicCode;
    }

    /**
     * Sets the value of the publicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPublicCode(JAXBElement<String> value) {
        this.publicCode = value;
    }

    /**
     * Gets the value of the infomobCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfomobCode() {
        return infomobCode;
    }

    /**
     * Sets the value of the infomobCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfomobCode(String value) {
        this.infomobCode = value;
    }

    /**
     * Gets the value of the journeyPatternDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJourneyPatternDescription() {
        return journeyPatternDescription;
    }

    /**
     * Sets the value of the journeyPatternDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJourneyPatternDescription(JAXBElement<String> value) {
        this.journeyPatternDescription = value;
    }

    /**
     * Gets the value of the headSign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHeadSign() {
        return headSign;
    }

    /**
     * Sets the value of the headSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHeadSign(JAXBElement<String> value) {
        this.headSign = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link LineStructure }
     *     
     */
    public LineStructure getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStructure }
     *     
     */
    public void setLine(LineStructure value) {
        this.line = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setDirection(DirectionEnum value) {
        this.direction = value;
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
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

}
