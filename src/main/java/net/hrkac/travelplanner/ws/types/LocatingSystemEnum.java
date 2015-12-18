
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocatingSystemEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocatingSystemEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="EPSG_32632"/&gt;
 *     &lt;enumeration value="EPSG_4326"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocatingSystemEnum")
@XmlEnum
public enum LocatingSystemEnum {


    /**
     * WGS84 UTM Zone 32 N
     * 
     */
    EPSG_32632,

    /**
     * WGS84 Geo Decimal
     * 
     */
    EPSG_4326;

    public String value() {
        return name();
    }

    public static LocatingSystemEnum fromValue(String v) {
        return valueOf(v);
    }

}
