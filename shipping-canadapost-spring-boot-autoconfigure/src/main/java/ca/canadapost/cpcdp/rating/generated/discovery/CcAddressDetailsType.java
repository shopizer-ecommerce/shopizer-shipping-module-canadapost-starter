
package ca.canadapost.cpcdp.rating.generated.discovery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CcAddressDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CcAddressDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="address-line-1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="44"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="address-line-2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;maxLength value="44"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="city">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="prov-state" type="{http://www.canadapost.ca/ws/ship/rate-v4}ProvinceStateOrInternationalType"/>
 *         &lt;element name="postal-zip-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}PostalCodeOrZipOrInternationalType" minOccurs="0"/>
 *         &lt;element name="country-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}CountryCodeType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CcAddressDetailsType", propOrder = {

})
public class CcAddressDetailsType {

    @XmlElement(name = "address-line-1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String addressLine1;
    @XmlElement(name = "address-line-2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String addressLine2;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String city;
    @XmlElement(name = "prov-state", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String provState;
    @XmlElement(name = "postal-zip-code")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String postalZipCode;
    @XmlElement(name = "country-code", required = true)
    protected String countryCode;

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the provState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvState() {
        return provState;
    }

    /**
     * Sets the value of the provState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvState(String value) {
        this.provState = value;
    }

    /**
     * Gets the value of the postalZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalZipCode() {
        return postalZipCode;
    }

    /**
     * Sets the value of the postalZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalZipCode(String value) {
        this.postalZipCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

}
