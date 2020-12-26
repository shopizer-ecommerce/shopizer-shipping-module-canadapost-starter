
package ca.canadapost.cpcdp.rating.generated.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyAccountCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThirdPartyAccountCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="PB"/>
 *     &lt;enumeration value="FP"/>
 *     &lt;enumeration value="NE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThirdPartyAccountCodeType")
@XmlEnum
public enum ThirdPartyAccountCodeType {

    PB,
    FP,
    NE;

    public String value() {
        return name();
    }

    public static ThirdPartyAccountCodeType fromValue(String v) {
        return valueOf(v);
    }

}
