
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SolutionSortCriteriaEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SolutionSortCriteriaEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="departureTime"/&gt;
 *     &lt;enumeration value="arrivalTime"/&gt;
 *     &lt;enumeration value="totalWalkingDistance"/&gt;
 *     &lt;enumeration value="totalWaitingTime"/&gt;
 *     &lt;enumeration value="numberOfConnections"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SolutionSortCriteriaEnum")
@XmlEnum
public enum SolutionSortCriteriaEnum {

    @XmlEnumValue("departureTime")
    DEPARTURE_TIME("departureTime"),
    @XmlEnumValue("arrivalTime")
    ARRIVAL_TIME("arrivalTime"),
    @XmlEnumValue("totalWalkingDistance")
    TOTAL_WALKING_DISTANCE("totalWalkingDistance"),
    @XmlEnumValue("totalWaitingTime")
    TOTAL_WAITING_TIME("totalWaitingTime"),
    @XmlEnumValue("numberOfConnections")
    NUMBER_OF_CONNECTIONS("numberOfConnections");
    private final String value;

    SolutionSortCriteriaEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SolutionSortCriteriaEnum fromValue(String v) {
        for (SolutionSortCriteriaEnum c: SolutionSortCriteriaEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
