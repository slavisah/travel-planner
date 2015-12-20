
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocatingSystem" type="{http://www.pluservice.net/travelplannerservice/data}LocatingSystemEnum" minOccurs="0"/&gt;
 *         &lt;element name="ResultInformation" type="{http://www.pluservice.net/travelplannerservice/data}ResponseResultStructure" minOccurs="0"/&gt;
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
@XmlType(name = "BaseResponseStructure", propOrder = {
    "locatingSystem",
    "resultInformation",
    "culture"
})
@XmlSeeAlso({
    GetStopListFromLocationResponseStructure.class,
    GetStopListFromNameResponseStructure.class,
    GetBusStopScheduleResponseStructure.class,
    GetJourneyRunTimeResponseStructure.class,
    GetTPSolutionsResponseStructure.class,
    GetTPSolutionDetailResponseStructure.class,
    GetTPSolutionGeometryResponseStructure.class
})
public class BaseResponseStructure {

    @XmlElement(name = "LocatingSystem", nillable = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected LocatingSystemEnum locatingSystem;
    @XmlElement(name = "ResultInformation", nillable = true)
    protected ResponseResultStructure resultInformation;
    @XmlElement(name = "Culture", nillable = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected CultureEnum culture;

    /**
     * Gets the value of the locatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link LocatingSystemEnum }
     *     
     */
    public LocatingSystemEnum getLocatingSystem() {
        return locatingSystem;
    }

    /**
     * Sets the value of the locatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatingSystemEnum }
     *     
     */
    public void setLocatingSystem(LocatingSystemEnum value) {
        this.locatingSystem = value;
    }

    /**
     * Gets the value of the resultInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseResultStructure }
     *     
     */
    public ResponseResultStructure getResultInformation() {
        return resultInformation;
    }

    /**
     * Sets the value of the resultInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseResultStructure }
     *     
     */
    public void setResultInformation(ResponseResultStructure value) {
        this.resultInformation = value;
    }

    /**
     * Gets the value of the culture property.
     * 
     * @return
     *     possible object is
     *     {@link CultureEnum }
     *     
     */
    public CultureEnum getCulture() {
        return culture;
    }

    /**
     * Sets the value of the culture property.
     * 
     * @param value
     *     allowed object is
     *     {@link CultureEnum }
     *     
     */
    public void setCulture(CultureEnum value) {
        this.culture = value;
    }

}
