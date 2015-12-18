
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelModeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelModeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Walk"/&gt;
 *     &lt;enumeration value="PublicTransport"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TravelModeEnum")
@XmlEnum
public enum TravelModeEnum {

    @XmlEnumValue("Walk")
    WALK("Walk"),
    @XmlEnumValue("PublicTransport")
    PUBLIC_TRANSPORT("PublicTransport");
    private final String value;

    TravelModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelModeEnum fromValue(String v) {
        for (TravelModeEnum c: TravelModeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
