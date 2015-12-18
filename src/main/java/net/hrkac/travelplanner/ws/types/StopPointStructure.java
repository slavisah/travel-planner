
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StopPointStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopPointStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pluservice.net/travelplannerservice/data}PointStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrivateCode" type="{http://www.pluservice.net/travelplannerservice/data}PrivateCodeStructure" minOccurs="0"/&gt;
 *         &lt;element name="PublicCode" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPointStructure", propOrder = {
    "privateCode",
    "publicCode"
})
@XmlSeeAlso({
    DistancedStopPointStructure.class
})
public class StopPointStructure
    extends PointStructure
{

    @XmlElementRef(name = "PrivateCode", namespace = "http://www.pluservice.net/travelplannerservice/data", type = JAXBElement.class)
    protected JAXBElement<PrivateCodeStructure> privateCode;
    @XmlElementRef(name = "PublicCode", namespace = "http://www.pluservice.net/travelplannerservice/data", type = JAXBElement.class)
    protected JAXBElement<String> publicCode;

    /**
     * Gets the value of the privateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrivateCodeStructure }{@code >}
     *     
     */
    public JAXBElement<PrivateCodeStructure> getPrivateCode() {
        return privateCode;
    }

    /**
     * Sets the value of the privateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrivateCodeStructure }{@code >}
     *     
     */
    public void setPrivateCode(JAXBElement<PrivateCodeStructure> value) {
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

}
