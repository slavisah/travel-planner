
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportModeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransportModeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="bus"/&gt;
 *     &lt;enumeration value="tram"/&gt;
 *     &lt;enumeration value="lightRail"/&gt;
 *     &lt;enumeration value="subway"/&gt;
 *     &lt;enumeration value="rail"/&gt;
 *     &lt;enumeration value="ferry"/&gt;
 *     &lt;enumeration value="funicular"/&gt;
 *     &lt;enumeration value="air"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransportModeEnum")
@XmlEnum
public enum TransportModeEnum {

    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("tram")
    TRAM("tram"),
    @XmlEnumValue("lightRail")
    LIGHT_RAIL("lightRail"),
    @XmlEnumValue("subway")
    SUBWAY("subway"),
    @XmlEnumValue("rail")
    RAIL("rail"),
    @XmlEnumValue("ferry")
    FERRY("ferry"),
    @XmlEnumValue("funicular")
    FUNICULAR("funicular"),
    @XmlEnumValue("air")
    AIR("air");
    private final String value;

    TransportModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransportModeEnum fromValue(String v) {
        for (TransportModeEnum c: TransportModeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
