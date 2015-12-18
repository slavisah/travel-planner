
package net.hrkac.travelplanner.ws.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CultureEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CultureEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="it-IT"/&gt;
 *     &lt;enumeration value="sl-SI"/&gt;
 *     &lt;enumeration value="hr-HR"/&gt;
 *     &lt;enumeration value="hr-BA"/&gt;
 *     &lt;enumeration value="bs-Latn-BA"/&gt;
 *     &lt;enumeration value="sr-Latn-BA"/&gt;
 *     &lt;enumeration value="sr-Cyrl-BA"/&gt;
 *     &lt;enumeration value="bs-Cyrl-BA"/&gt;
 *     &lt;enumeration value="el-GR"/&gt;
 *     &lt;enumeration value="en-GB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CultureEnum")
@XmlEnum
public enum CultureEnum {

    @XmlEnumValue("it-IT")
    IT_IT("it-IT"),
    @XmlEnumValue("sl-SI")
    SL_SI("sl-SI"),
    @XmlEnumValue("hr-HR")
    HR_HR("hr-HR"),
    @XmlEnumValue("hr-BA")
    HR_BA("hr-BA"),
    @XmlEnumValue("bs-Latn-BA")
    BS_LATN_BA("bs-Latn-BA"),
    @XmlEnumValue("sr-Latn-BA")
    SR_LATN_BA("sr-Latn-BA"),
    @XmlEnumValue("sr-Cyrl-BA")
    SR_CYRL_BA("sr-Cyrl-BA"),
    @XmlEnumValue("bs-Cyrl-BA")
    BS_CYRL_BA("bs-Cyrl-BA"),
    @XmlEnumValue("el-GR")
    EL_GR("el-GR"),
    @XmlEnumValue("en-GB")
    EN_GB("en-GB");
    private final String value;

    CultureEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CultureEnum fromValue(String v) {
        for (CultureEnum c: CultureEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
