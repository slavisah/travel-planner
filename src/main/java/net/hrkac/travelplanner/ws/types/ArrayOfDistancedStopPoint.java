
package net.hrkac.travelplanner.ws.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDistancedStopPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDistancedStopPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StopPoint" type="{http://www.pluservice.net/travelplannerservice/data}DistancedStopPointStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistancedStopPoint", propOrder = {
    "stopPoints"
})
public class ArrayOfDistancedStopPoint {

    @XmlElement(name = "StopPoint", nillable = true)
    protected List<DistancedStopPointStructure> stopPoints;

    /**
     * Gets the value of the stopPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistancedStopPointStructure }
     * 
     * 
     */
    public List<DistancedStopPointStructure> getStopPoints() {
        if (stopPoints == null) {
            stopPoints = new ArrayList<DistancedStopPointStructure>();
        }
        return this.stopPoints;
    }

}
