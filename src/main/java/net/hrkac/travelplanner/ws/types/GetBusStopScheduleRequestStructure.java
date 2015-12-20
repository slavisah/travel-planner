
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
 * <p>Java class for GetBusStopScheduleRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBusStopScheduleRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pluservice.net/travelplannerservice/data}BaseRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StopCode" type="{http://www.pluservice.net/travelplannerservice/data}PrivateCodeStructure"/&gt;
 *         &lt;element name="ReferenceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FromTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ToTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBusStopScheduleRequestStructure", propOrder = {
    "stopCode",
    "referenceDate",
    "fromTime",
    "toTime"
})
public class GetBusStopScheduleRequestStructure
    extends BaseRequestStructure
{

    @XmlElement(name = "StopCode", required = true)
    protected PrivateCodeStructure stopCode;
    @XmlElement(name = "ReferenceDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date referenceDate;
    @XmlElement(name = "FromTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date fromTime;
    @XmlElement(name = "ToTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date toTime;

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
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDate(Date value) {
        this.referenceDate = value;
    }

    /**
     * Gets the value of the fromTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getFromTime() {
        return fromTime;
    }

    /**
     * Sets the value of the fromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromTime(Date value) {
        this.fromTime = value;
    }

    /**
     * Gets the value of the toTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getToTime() {
        return toTime;
    }

    /**
     * Sets the value of the toTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToTime(Date value) {
        this.toTime = value;
    }

}
