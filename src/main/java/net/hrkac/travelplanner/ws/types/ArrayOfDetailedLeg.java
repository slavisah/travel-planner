
package net.hrkac.travelplanner.ws.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDetailedLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDetailedLeg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Leg" type="{http://www.pluservice.net/travelplannerservice/data}DetailedLegStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDetailedLeg", propOrder = {
    "legs"
})
public class ArrayOfDetailedLeg {

    @XmlElement(name = "Leg", nillable = true)
    protected List<DetailedLegStructure> legs;

    /**
     * Gets the value of the legs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedLegStructure }
     * 
     * 
     */
    public List<DetailedLegStructure> getLegs() {
        if (legs == null) {
            legs = new ArrayList<DetailedLegStructure>();
        }
        return this.legs;
    }

}
