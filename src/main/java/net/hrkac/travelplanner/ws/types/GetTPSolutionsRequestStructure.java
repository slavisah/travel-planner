
package net.hrkac.travelplanner.ws.types;

import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import net.hrkac.travelplanner.ws.custom.Adapter1;


/**
 * <p>Java class for GetTPSolutionsRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTPSolutionsRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pluservice.net/travelplannerservice/data}BaseRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="OriginPoint" type="{http://www.pluservice.net/travelplannerservice/data}PointStructure"/&gt;
 *         &lt;element name="DestinationPoint" type="{http://www.pluservice.net/travelplannerservice/data}PointStructure"/&gt;
 *         &lt;element name="MinDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MaxArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Transport" type="{http://www.pluservice.net/travelplannerservice/data}ArrayOfTransportModeSelection" minOccurs="0"/&gt;
 *         &lt;element name="SortCriterias" type="{http://www.pluservice.net/travelplannerservice/data}ArrayOfSolutionSortCriteria" minOccurs="0"/&gt;
 *         &lt;element name="MaxSolutions" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="CalcCriteria" type="{http://www.pluservice.net/travelplannerservice/data}SolutionCalcCriteriaEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTPSolutionsRequestStructure", propOrder = {
    "referenceDate",
    "originPoint",
    "destinationPoint",
    "minDepartureTime",
    "maxArrivalTime",
    "transport",
    "sortCriterias",
    "maxSolutions",
    "calcCriteria"
})
public class GetTPSolutionsRequestStructure
    extends BaseRequestStructure
{

    @XmlElement(name = "ReferenceDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date referenceDate;
    @XmlElement(name = "OriginPoint", required = true)
    protected PointStructure originPoint;
    @XmlElement(name = "DestinationPoint", required = true)
    protected PointStructure destinationPoint;
    @XmlElement(name = "MinDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date minDepartureTime;
    @XmlElement(name = "MaxArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date maxArrivalTime;
    @XmlElement(name = "Transport")
    protected ArrayOfTransportModeSelection transport;
    @XmlElement(name = "SortCriterias")
    protected ArrayOfSolutionSortCriteria sortCriterias;
    @XmlElement(name = "MaxSolutions")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxSolutions;
    @XmlElement(name = "CalcCriteria")
    @XmlSchemaType(name = "NMTOKEN")
    protected SolutionCalcCriteriaEnum calcCriteria;

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
     * Gets the value of the originPoint property.
     * 
     * @return
     *     possible object is
     *     {@link PointStructure }
     *     
     */
    public PointStructure getOriginPoint() {
        return originPoint;
    }

    /**
     * Sets the value of the originPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointStructure }
     *     
     */
    public void setOriginPoint(PointStructure value) {
        this.originPoint = value;
    }

    /**
     * Gets the value of the destinationPoint property.
     * 
     * @return
     *     possible object is
     *     {@link PointStructure }
     *     
     */
    public PointStructure getDestinationPoint() {
        return destinationPoint;
    }

    /**
     * Sets the value of the destinationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointStructure }
     *     
     */
    public void setDestinationPoint(PointStructure value) {
        this.destinationPoint = value;
    }

    /**
     * Gets the value of the minDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getMinDepartureTime() {
        return minDepartureTime;
    }

    /**
     * Sets the value of the minDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinDepartureTime(Date value) {
        this.minDepartureTime = value;
    }

    /**
     * Gets the value of the maxArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getMaxArrivalTime() {
        return maxArrivalTime;
    }

    /**
     * Sets the value of the maxArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxArrivalTime(Date value) {
        this.maxArrivalTime = value;
    }

    /**
     * Gets the value of the transport property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransportModeSelection }
     *     
     */
    public ArrayOfTransportModeSelection getTransport() {
        return transport;
    }

    /**
     * Sets the value of the transport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransportModeSelection }
     *     
     */
    public void setTransport(ArrayOfTransportModeSelection value) {
        this.transport = value;
    }

    /**
     * Gets the value of the sortCriterias property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSolutionSortCriteria }
     *     
     */
    public ArrayOfSolutionSortCriteria getSortCriterias() {
        return sortCriterias;
    }

    /**
     * Sets the value of the sortCriterias property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSolutionSortCriteria }
     *     
     */
    public void setSortCriterias(ArrayOfSolutionSortCriteria value) {
        this.sortCriterias = value;
    }

    /**
     * Gets the value of the maxSolutions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSolutions() {
        return maxSolutions;
    }

    /**
     * Sets the value of the maxSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxSolutions(BigInteger value) {
        this.maxSolutions = value;
    }

    /**
     * Gets the value of the calcCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionCalcCriteriaEnum }
     *     
     */
    public SolutionCalcCriteriaEnum getCalcCriteria() {
        return calcCriteria;
    }

    /**
     * Sets the value of the calcCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionCalcCriteriaEnum }
     *     
     */
    public void setCalcCriteria(SolutionCalcCriteriaEnum value) {
        this.calcCriteria = value;
    }

}
