
package net.hrkac.travelplanner.ws.types;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SolutionSortCriteriaStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SolutionSortCriteriaStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Criteria" type="{http://www.pluservice.net/travelplannerservice/data}SolutionSortCriteriaEnum"/&gt;
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="Descending" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolutionSortCriteriaStructure", propOrder = {
    "criteria",
    "order",
    "descending"
})
public class SolutionSortCriteriaStructure {

    @XmlElement(name = "Criteria", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected SolutionSortCriteriaEnum criteria;
    @XmlElement(name = "Order", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(name = "Descending")
    protected boolean descending;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionSortCriteriaEnum }
     *     
     */
    public SolutionSortCriteriaEnum getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionSortCriteriaEnum }
     *     
     */
    public void setCriteria(SolutionSortCriteriaEnum value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    /**
     * Gets the value of the descending property.
     * 
     */
    public boolean isDescending() {
        return descending;
    }

    /**
     * Sets the value of the descending property.
     * 
     */
    public void setDescending(boolean value) {
        this.descending = value;
    }

}
