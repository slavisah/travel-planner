
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleLegStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleLegStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pluservice.net/travelplannerservice/data}BaseLegStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Line" type="{http://www.pluservice.net/travelplannerservice/data}LineStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleLegStructure", propOrder = {
    "line"
})
public class SimpleLegStructure
    extends BaseLegStructure
{

    @XmlElementRef(name = "Line", namespace = "http://www.pluservice.net/travelplannerservice/data", type = JAXBElement.class)
    protected JAXBElement<LineStructure> line;

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LineStructure }{@code >}
     *     
     */
    public JAXBElement<LineStructure> getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LineStructure }{@code >}
     *     
     */
    public void setLine(JAXBElement<LineStructure> value) {
        this.line = value;
    }

}
