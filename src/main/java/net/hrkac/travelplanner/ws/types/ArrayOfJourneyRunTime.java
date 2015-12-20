
package net.hrkac.travelplanner.ws.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfJourneyRunTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfJourneyRunTime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RunTime" type="{http://www.pluservice.net/travelplannerservice/data}JourneyRunTimeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfJourneyRunTime", propOrder = {
    "runTime"
})
public class ArrayOfJourneyRunTime {

    @XmlElement(name = "RunTime", nillable = true)
    protected List<JourneyRunTimeStructure> runTime;

    /**
     * Gets the value of the runTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRunTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyRunTimeStructure }
     * 
     * 
     */
    public List<JourneyRunTimeStructure> getRunTime() {
        if (runTime == null) {
            runTime = new ArrayList<JourneyRunTimeStructure>();
        }
        return this.runTime;
    }

}
