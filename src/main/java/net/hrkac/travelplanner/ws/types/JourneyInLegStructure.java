
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JourneyInLegStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyInLegStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pluservice.net/travelplannerservice/data}JourneyStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RunTimes" type="{http://www.pluservice.net/travelplannerservice/data}ArrayOfJourneyRunTime"/&gt;
 *         &lt;element name="InvolvedPart" type="{http://www.pluservice.net/travelplannerservice/data}JourneyPartStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyInLegStructure", propOrder = {
    "runTimes",
    "involvedPart"
})
public class JourneyInLegStructure
    extends JourneyStructure
{

    @XmlElement(name = "RunTimes", required = true)
    protected ArrayOfJourneyRunTime runTimes;
    @XmlElement(name = "InvolvedPart")
    protected JourneyPartStructure involvedPart;

    /**
     * Gets the value of the runTimes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJourneyRunTime }
     *     
     */
    public ArrayOfJourneyRunTime getRunTimes() {
        return runTimes;
    }

    /**
     * Sets the value of the runTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJourneyRunTime }
     *     
     */
    public void setRunTimes(ArrayOfJourneyRunTime value) {
        this.runTimes = value;
    }

    /**
     * Gets the value of the involvedPart property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPartStructure }
     *     
     */
    public JourneyPartStructure getInvolvedPart() {
        return involvedPart;
    }

    /**
     * Sets the value of the involvedPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPartStructure }
     *     
     */
    public void setInvolvedPart(JourneyPartStructure value) {
        this.involvedPart = value;
    }

}
