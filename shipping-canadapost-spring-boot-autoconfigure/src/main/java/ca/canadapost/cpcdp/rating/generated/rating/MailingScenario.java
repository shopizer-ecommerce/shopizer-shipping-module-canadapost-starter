
package ca.canadapost.cpcdp.rating.generated.rating;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="customer-number" type="{http://www.canadapost.ca/ws/ship/rate-v4}CustomerIDType" minOccurs="0"/>
 *         &lt;element name="contract-id" type="{http://www.canadapost.ca/ws/ship/rate-v4}ContractIDType" minOccurs="0"/>
 *         &lt;element name="promo-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}PromoCodeType" minOccurs="0"/>
 *         &lt;element name="quote-type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="commercial"/>
 *               &lt;enumeration value="counter"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="expected-mailing-date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="options" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="option" maxOccurs="20">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="option-code">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="option-amount" type="{http://www.canadapost.ca/ws/ship/rate-v4}CostTypeNonZero" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="parcel-characteristics">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="weight">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minExclusive value="0"/>
 *                         &lt;maxInclusive value="99.999"/>
 *                         &lt;fractionDigits value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dimensions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="length" type="{http://www.canadapost.ca/ws/ship/rate-v4}DimensionMeasurementType"/>
 *                             &lt;element name="width" type="{http://www.canadapost.ca/ws/ship/rate-v4}DimensionMeasurementType"/>
 *                             &lt;element name="height" type="{http://www.canadapost.ca/ws/ship/rate-v4}DimensionMeasurementType"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="unpackaged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="mailing-tube" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="oversized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="services" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="service-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}ServiceCodeType" maxOccurs="20"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="origin-postal-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}PostalCodeType"/>
 *         &lt;element name="destination">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="domestic">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="postal-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}PostalCodeType"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="united-states">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="zip-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}ZipCodeType"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="international">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="country-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}CountryCodeType"/>
 *                             &lt;element name="postal-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}IntlPostalCodeType" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "mailing-scenario")
public class MailingScenario {

    @XmlElement(name = "customer-number")
    protected String customerNumber;
    @XmlElement(name = "contract-id")
    protected String contractId;
    @XmlElement(name = "promo-code")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String promoCode;
    @XmlElement(name = "quote-type")
    protected String quoteType;
    @XmlElement(name = "expected-mailing-date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedMailingDate;
    protected MailingScenario.Options options;
    @XmlElement(name = "parcel-characteristics", required = true)
    protected MailingScenario.ParcelCharacteristics parcelCharacteristics;
    protected MailingScenario.Services services;
    @XmlElement(name = "origin-postal-code", required = true)
    protected String originPostalCode;
    @XmlElement(required = true)
    protected MailingScenario.Destination destination;

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractId(String value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the quoteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteType() {
        return quoteType;
    }

    /**
     * Sets the value of the quoteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteType(String value) {
        this.quoteType = value;
    }

    /**
     * Gets the value of the expectedMailingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedMailingDate() {
        return expectedMailingDate;
    }

    /**
     * Sets the value of the expectedMailingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedMailingDate(XMLGregorianCalendar value) {
        this.expectedMailingDate = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link MailingScenario.Options }
     *     
     */
    public MailingScenario.Options getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailingScenario.Options }
     *     
     */
    public void setOptions(MailingScenario.Options value) {
        this.options = value;
    }

    /**
     * Gets the value of the parcelCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link MailingScenario.ParcelCharacteristics }
     *     
     */
    public MailingScenario.ParcelCharacteristics getParcelCharacteristics() {
        return parcelCharacteristics;
    }

    /**
     * Sets the value of the parcelCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailingScenario.ParcelCharacteristics }
     *     
     */
    public void setParcelCharacteristics(MailingScenario.ParcelCharacteristics value) {
        this.parcelCharacteristics = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link MailingScenario.Services }
     *     
     */
    public MailingScenario.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailingScenario.Services }
     *     
     */
    public void setServices(MailingScenario.Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the originPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginPostalCode() {
        return originPostalCode;
    }

    /**
     * Sets the value of the originPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginPostalCode(String value) {
        this.originPostalCode = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link MailingScenario.Destination }
     *     
     */
    public MailingScenario.Destination getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailingScenario.Destination }
     *     
     */
    public void setDestination(MailingScenario.Destination value) {
        this.destination = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="domestic">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="postal-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}PostalCodeType"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="united-states">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="zip-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}ZipCodeType"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="international">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="country-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}CountryCodeType"/>
     *                   &lt;element name="postal-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}IntlPostalCodeType" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "international",
        "unitedStates",
        "domestic"
    })
    public static class Destination {

        protected MailingScenario.Destination.International international;
        @XmlElement(name = "united-states")
        protected MailingScenario.Destination.UnitedStates unitedStates;
        protected MailingScenario.Destination.Domestic domestic;

        /**
         * Gets the value of the international property.
         * 
         * @return
         *     possible object is
         *     {@link MailingScenario.Destination.International }
         *     
         */
        public MailingScenario.Destination.International getInternational() {
            return international;
        }

        /**
         * Sets the value of the international property.
         * 
         * @param value
         *     allowed object is
         *     {@link MailingScenario.Destination.International }
         *     
         */
        public void setInternational(MailingScenario.Destination.International value) {
            this.international = value;
        }

        /**
         * Gets the value of the unitedStates property.
         * 
         * @return
         *     possible object is
         *     {@link MailingScenario.Destination.UnitedStates }
         *     
         */
        public MailingScenario.Destination.UnitedStates getUnitedStates() {
            return unitedStates;
        }

        /**
         * Sets the value of the unitedStates property.
         * 
         * @param value
         *     allowed object is
         *     {@link MailingScenario.Destination.UnitedStates }
         *     
         */
        public void setUnitedStates(MailingScenario.Destination.UnitedStates value) {
            this.unitedStates = value;
        }

        /**
         * Gets the value of the domestic property.
         * 
         * @return
         *     possible object is
         *     {@link MailingScenario.Destination.Domestic }
         *     
         */
        public MailingScenario.Destination.Domestic getDomestic() {
            return domestic;
        }

        /**
         * Sets the value of the domestic property.
         * 
         * @param value
         *     allowed object is
         *     {@link MailingScenario.Destination.Domestic }
         *     
         */
        public void setDomestic(MailingScenario.Destination.Domestic value) {
            this.domestic = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="postal-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}PostalCodeType"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Domestic {

            @XmlElement(name = "postal-code", required = true)
            protected String postalCode;

            /**
             * Gets the value of the postalCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostalCode() {
                return postalCode;
            }

            /**
             * Sets the value of the postalCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostalCode(String value) {
                this.postalCode = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="country-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}CountryCodeType"/>
         *         &lt;element name="postal-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}IntlPostalCodeType" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class International {

            @XmlElement(name = "country-code", required = true)
            protected String countryCode;
            @XmlElement(name = "postal-code")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            protected String postalCode;

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

            /**
             * Gets the value of the postalCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostalCode() {
                return postalCode;
            }

            /**
             * Sets the value of the postalCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostalCode(String value) {
                this.postalCode = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="zip-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}ZipCodeType"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class UnitedStates {

            @XmlElement(name = "zip-code", required = true)
            protected String zipCode;

            /**
             * Gets the value of the zipCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZipCode() {
                return zipCode;
            }

            /**
             * Sets the value of the zipCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZipCode(String value) {
                this.zipCode = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="option" maxOccurs="20">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="option-code">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="option-amount" type="{http://www.canadapost.ca/ws/ship/rate-v4}CostTypeNonZero" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "options"
    })
    public static class Options {

        @XmlElement(name = "option", required = true)
        protected List<MailingScenario.Options.Option> options;

        /**
         * Gets the value of the options property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the options property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOptions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MailingScenario.Options.Option }
         * 
         * 
         */
        public List<MailingScenario.Options.Option> getOptions() {
            if (options == null) {
                options = new ArrayList<MailingScenario.Options.Option>();
            }
            return this.options;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="option-code">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="option-amount" type="{http://www.canadapost.ca/ws/ship/rate-v4}CostTypeNonZero" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Option {

            @XmlElement(name = "option-code", required = true)
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            protected String optionCode;
            @XmlElement(name = "option-amount")
            protected BigDecimal optionAmount;

            /**
             * Gets the value of the optionCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOptionCode() {
                return optionCode;
            }

            /**
             * Sets the value of the optionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOptionCode(String value) {
                this.optionCode = value;
            }

            /**
             * Gets the value of the optionAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getOptionAmount() {
                return optionAmount;
            }

            /**
             * Sets the value of the optionAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setOptionAmount(BigDecimal value) {
                this.optionAmount = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="weight">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minExclusive value="0"/>
     *               &lt;maxInclusive value="99.999"/>
     *               &lt;fractionDigits value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dimensions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="length" type="{http://www.canadapost.ca/ws/ship/rate-v4}DimensionMeasurementType"/>
     *                   &lt;element name="width" type="{http://www.canadapost.ca/ws/ship/rate-v4}DimensionMeasurementType"/>
     *                   &lt;element name="height" type="{http://www.canadapost.ca/ws/ship/rate-v4}DimensionMeasurementType"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="unpackaged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="mailing-tube" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="oversized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class ParcelCharacteristics {

        @XmlElement(required = true)
        protected BigDecimal weight;
        protected MailingScenario.ParcelCharacteristics.Dimensions dimensions;
        protected Boolean unpackaged;
        @XmlElement(name = "mailing-tube")
        protected Boolean mailingTube;
        protected Boolean oversized;

        /**
         * Gets the value of the weight property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getWeight() {
            return weight;
        }

        /**
         * Sets the value of the weight property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setWeight(BigDecimal value) {
            this.weight = value;
        }

        /**
         * Gets the value of the dimensions property.
         * 
         * @return
         *     possible object is
         *     {@link MailingScenario.ParcelCharacteristics.Dimensions }
         *     
         */
        public MailingScenario.ParcelCharacteristics.Dimensions getDimensions() {
            return dimensions;
        }

        /**
         * Sets the value of the dimensions property.
         * 
         * @param value
         *     allowed object is
         *     {@link MailingScenario.ParcelCharacteristics.Dimensions }
         *     
         */
        public void setDimensions(MailingScenario.ParcelCharacteristics.Dimensions value) {
            this.dimensions = value;
        }

        /**
         * Gets the value of the unpackaged property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isUnpackaged() {
            return unpackaged;
        }

        /**
         * Sets the value of the unpackaged property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUnpackaged(Boolean value) {
            this.unpackaged = value;
        }

        /**
         * Gets the value of the mailingTube property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMailingTube() {
            return mailingTube;
        }

        /**
         * Sets the value of the mailingTube property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMailingTube(Boolean value) {
            this.mailingTube = value;
        }

        /**
         * Gets the value of the oversized property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOversized() {
            return oversized;
        }

        /**
         * Sets the value of the oversized property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOversized(Boolean value) {
            this.oversized = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="length" type="{http://www.canadapost.ca/ws/ship/rate-v4}DimensionMeasurementType"/>
         *         &lt;element name="width" type="{http://www.canadapost.ca/ws/ship/rate-v4}DimensionMeasurementType"/>
         *         &lt;element name="height" type="{http://www.canadapost.ca/ws/ship/rate-v4}DimensionMeasurementType"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Dimensions {

            @XmlElement(required = true)
            protected BigDecimal length;
            @XmlElement(required = true)
            protected BigDecimal width;
            @XmlElement(required = true)
            protected BigDecimal height;

            /**
             * Gets the value of the length property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLength() {
                return length;
            }

            /**
             * Sets the value of the length property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLength(BigDecimal value) {
                this.length = value;
            }

            /**
             * Gets the value of the width property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Sets the value of the width property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * Gets the value of the height property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Sets the value of the height property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="service-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}ServiceCodeType" maxOccurs="20"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serviceCodes"
    })
    public static class Services {

        @XmlElement(name = "service-code", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected List<String> serviceCodes;

        /**
         * Gets the value of the serviceCodes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceCodes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceCodes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getServiceCodes() {
            if (serviceCodes == null) {
                serviceCodes = new ArrayList<String>();
            }
            return this.serviceCodes;
        }

    }

}
