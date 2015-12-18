
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SolutionCalcCriteriaEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SolutionCalcCriteriaEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Fastest"/&gt;
 *     &lt;enumeration value="FewTransfers"/&gt;
 *     &lt;enumeration value="ShortWalks"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SolutionCalcCriteriaEnum")
@XmlEnum
public enum SolutionCalcCriteriaEnum {

    @XmlEnumValue("Fastest")
    FASTEST("Fastest"),
    @XmlEnumValue("FewTransfers")
    FEW_TRANSFERS("FewTransfers"),
    @XmlEnumValue("ShortWalks")
    SHORT_WALKS("ShortWalks");
    private final String value;

    SolutionCalcCriteriaEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SolutionCalcCriteriaEnum fromValue(String v) {
        for (SolutionCalcCriteriaEnum c: SolutionCalcCriteriaEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
