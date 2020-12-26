
package ca.canadapost.cpcdp.rating.generated.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CcType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CcType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="VIS"/>
 *     &lt;enumeration value="AME"/>
 *     &lt;enumeration value="DC"/>
 *     &lt;enumeration value="DIS"/>
 *     &lt;enumeration value="ER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CcType")
@XmlEnum
public enum CcType {

    MC,
    VIS,
    AME,
    DC,
    DIS,
    ER;

    public String value() {
        return name();
    }

    public static CcType fromValue(String v) {
        return valueOf(v);
    }

}
