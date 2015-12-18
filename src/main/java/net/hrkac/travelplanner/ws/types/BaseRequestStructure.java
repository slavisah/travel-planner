
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocatingSystem" type="{http://www.pluservice.net/travelplannerservice/data}LocatingSystemEnum" minOccurs="0"/&gt;
 *         &lt;element name="DeviceTrackInformation" type="{http://www.pluservice.net/travelplannerservice/data}DeviceTrackInformationStructure" minOccurs="0"/&gt;
 *         &lt;element name="Culture" type="{http://www.pluservice.net/travelplannerservice/data}CultureEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRequestStructure", propOrder = {
    "locatingSystem",
    "deviceTrackInformation",
    "culture"
})
@XmlSeeAlso({
    GetStopListFromLocationRequestStructure.class,
    GetStopListFromNameRequestStructure.class,
    GetBusStopScheduleRequestStructure.class,
    GetJourneyRunTimeRequestStructure.class,
    GetTPSolutionsRequestStructure.class,
    GetTPSolutionDetailRequestStructure.class,
    GetTPSolutionGeometryRequestStructure.class
})
public class BaseRequestStructure {

    @XmlElementRef(name = "LocatingSystem", namespace = "http://www.pluservice.net/travelplannerservice/data", type = JAXBElement.class)
    protected JAXBElement<LocatingSystemEnum> locatingSystem;
    @XmlElementRef(name = "DeviceTrackInformation", namespace = "http://www.pluservice.net/travelplannerservice/data", type = JAXBElement.class)
    protected JAXBElement<DeviceTrackInformationStructure> deviceTrackInformation;
    @XmlElementRef(name = "Culture", namespace = "http://www.pluservice.net/travelplannerservice/data", type = JAXBElement.class)
    protected JAXBElement<CultureEnum> culture;

    /**
     * Gets the value of the locatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocatingSystemEnum }{@code >}
     *     
     */
    public JAXBElement<LocatingSystemEnum> getLocatingSystem() {
        return locatingSystem;
    }

    /**
     * Sets the value of the locatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocatingSystemEnum }{@code >}
     *     
     */
    public void setLocatingSystem(JAXBElement<LocatingSystemEnum> value) {
        this.locatingSystem = value;
    }

    /**
     * Gets the value of the deviceTrackInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeviceTrackInformationStructure }{@code >}
     *     
     */
    public JAXBElement<DeviceTrackInformationStructure> getDeviceTrackInformation() {
        return deviceTrackInformation;
    }

    /**
     * Sets the value of the deviceTrackInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeviceTrackInformationStructure }{@code >}
     *     
     */
    public void setDeviceTrackInformation(JAXBElement<DeviceTrackInformationStructure> value) {
        this.deviceTrackInformation = value;
    }

    /**
     * Gets the value of the culture property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CultureEnum }{@code >}
     *     
     */
    public JAXBElement<CultureEnum> getCulture() {
        return culture;
    }

    /**
     * Sets the value of the culture property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CultureEnum }{@code >}
     *     
     */
    public void setCulture(JAXBElement<CultureEnum> value) {
        this.culture = value;
    }

}
