
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
 *       &lt;sequence>
 *         &lt;element name="price-quote" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="service-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}ServiceCodeType"/>
 *                   &lt;element name="service-link" type="{http://www.canadapost.ca/ws/ship/rate-v4}LinkType"/>
 *                   &lt;element name="service-name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;element name="price-details">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="taxes" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="gst" type="{http://www.canadapost.ca/ws/ship/rate-v4}TaxType" minOccurs="0"/>
 *                                       &lt;element name="pst" type="{http://www.canadapost.ca/ws/ship/rate-v4}TaxType" minOccurs="0"/>
 *                                       &lt;element name="hst" type="{http://www.canadapost.ca/ws/ship/rate-v4}TaxType" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="due" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="options" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="option" maxOccurs="20">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="option-code" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                                                 &lt;element name="option-name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                                                 &lt;element name="option-price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                 &lt;element name="qualifier" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;all>
 *                                                           &lt;element name="step-size" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                           &lt;element name="step-cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                           &lt;element name="included-amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                           &lt;element name="max-value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                           &lt;element name="included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                                           &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                         &lt;/all>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="adjustments" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="adjustment" maxOccurs="20">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="adjustment-code" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                                                 &lt;element name="adjustment-name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                                                 &lt;element name="adjustment-cost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                 &lt;element name="qualifier" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;all>
 *                                                           &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                         &lt;/all>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="weight-details">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="cubed-weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="service-standard">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="am-delivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="guaranteed-delivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="expected-transit-time" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;minInclusive value="0"/>
 *                                   &lt;maxInclusive value="99"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="expected-delivery-date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "priceQuotes"
})
@XmlRootElement(name = "price-quotes")
public class PriceQuotes {

    @XmlElement(name = "price-quote")
    protected List<PriceQuotes.PriceQuote> priceQuotes;

    /**
     * Gets the value of the priceQuotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceQuotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceQuotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceQuotes.PriceQuote }
     * 
     * 
     */
    public List<PriceQuotes.PriceQuote> getPriceQuotes() {
        if (priceQuotes == null) {
            priceQuotes = new ArrayList<PriceQuotes.PriceQuote>();
        }
        return this.priceQuotes;
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
     *         &lt;element name="service-code" type="{http://www.canadapost.ca/ws/ship/rate-v4}ServiceCodeType"/>
     *         &lt;element name="service-link" type="{http://www.canadapost.ca/ws/ship/rate-v4}LinkType"/>
     *         &lt;element name="service-name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *         &lt;element name="price-details">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="taxes" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="gst" type="{http://www.canadapost.ca/ws/ship/rate-v4}TaxType" minOccurs="0"/>
     *                             &lt;element name="pst" type="{http://www.canadapost.ca/ws/ship/rate-v4}TaxType" minOccurs="0"/>
     *                             &lt;element name="hst" type="{http://www.canadapost.ca/ws/ship/rate-v4}TaxType" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="due" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="options" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="option" maxOccurs="20">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="option-code" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                                       &lt;element name="option-name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                                       &lt;element name="option-price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                       &lt;element name="qualifier" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;all>
     *                                                 &lt;element name="step-size" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                 &lt;element name="step-cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                 &lt;element name="included-amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                 &lt;element name="max-value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                 &lt;element name="included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                                                 &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                               &lt;/all>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="adjustments" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="adjustment" maxOccurs="20">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="adjustment-code" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                                       &lt;element name="adjustment-name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                                       &lt;element name="adjustment-cost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                       &lt;element name="qualifier" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;all>
     *                                                 &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                               &lt;/all>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="weight-details">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="cubed-weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="service-standard">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="am-delivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="guaranteed-delivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="expected-transit-time" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;minInclusive value="0"/>
     *                         &lt;maxInclusive value="99"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="expected-delivery-date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                 &lt;/all>
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
    public static class PriceQuote {

        @XmlElement(name = "service-code", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String serviceCode;
        @XmlElement(name = "service-link", required = true)
        protected Link serviceLink;
        @XmlElement(name = "service-name", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String serviceName;
        @XmlElement(name = "price-details", required = true)
        protected PriceQuotes.PriceQuote.PriceDetails priceDetails;
        @XmlElement(name = "weight-details", required = true)
        protected PriceQuotes.PriceQuote.WeightDetails weightDetails;
        @XmlElement(name = "service-standard", required = true)
        protected PriceQuotes.PriceQuote.ServiceStandard serviceStandard;

        /**
         * Gets the value of the serviceCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceCode() {
            return serviceCode;
        }

        /**
         * Sets the value of the serviceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceCode(String value) {
            this.serviceCode = value;
        }

        /**
         * Gets the value of the serviceLink property.
         * 
         * @return
         *     possible object is
         *     {@link Link }
         *     
         */
        public Link getServiceLink() {
            return serviceLink;
        }

        /**
         * Sets the value of the serviceLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link Link }
         *     
         */
        public void setServiceLink(Link value) {
            this.serviceLink = value;
        }

        /**
         * Gets the value of the serviceName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceName() {
            return serviceName;
        }

        /**
         * Sets the value of the serviceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceName(String value) {
            this.serviceName = value;
        }

        /**
         * Gets the value of the priceDetails property.
         * 
         * @return
         *     possible object is
         *     {@link PriceQuotes.PriceQuote.PriceDetails }
         *     
         */
        public PriceQuotes.PriceQuote.PriceDetails getPriceDetails() {
            return priceDetails;
        }

        /**
         * Sets the value of the priceDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceQuotes.PriceQuote.PriceDetails }
         *     
         */
        public void setPriceDetails(PriceQuotes.PriceQuote.PriceDetails value) {
            this.priceDetails = value;
        }

        /**
         * Gets the value of the weightDetails property.
         * 
         * @return
         *     possible object is
         *     {@link PriceQuotes.PriceQuote.WeightDetails }
         *     
         */
        public PriceQuotes.PriceQuote.WeightDetails getWeightDetails() {
            return weightDetails;
        }

        /**
         * Sets the value of the weightDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceQuotes.PriceQuote.WeightDetails }
         *     
         */
        public void setWeightDetails(PriceQuotes.PriceQuote.WeightDetails value) {
            this.weightDetails = value;
        }

        /**
         * Gets the value of the serviceStandard property.
         * 
         * @return
         *     possible object is
         *     {@link PriceQuotes.PriceQuote.ServiceStandard }
         *     
         */
        public PriceQuotes.PriceQuote.ServiceStandard getServiceStandard() {
            return serviceStandard;
        }

        /**
         * Sets the value of the serviceStandard property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceQuotes.PriceQuote.ServiceStandard }
         *     
         */
        public void setServiceStandard(PriceQuotes.PriceQuote.ServiceStandard value) {
            this.serviceStandard = value;
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
         *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="taxes" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="gst" type="{http://www.canadapost.ca/ws/ship/rate-v4}TaxType" minOccurs="0"/>
         *                   &lt;element name="pst" type="{http://www.canadapost.ca/ws/ship/rate-v4}TaxType" minOccurs="0"/>
         *                   &lt;element name="hst" type="{http://www.canadapost.ca/ws/ship/rate-v4}TaxType" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="due" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
         *                             &lt;element name="option-code" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *                             &lt;element name="option-name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *                             &lt;element name="option-price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                             &lt;element name="qualifier" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;all>
         *                                       &lt;element name="step-size" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                       &lt;element name="step-cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                       &lt;element name="included-amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                       &lt;element name="max-value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                       &lt;element name="included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                                       &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                     &lt;/all>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
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
         *         &lt;element name="adjustments" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="adjustment" maxOccurs="20">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="adjustment-code" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *                             &lt;element name="adjustment-name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *                             &lt;element name="adjustment-cost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                             &lt;element name="qualifier" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;all>
         *                                       &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                                     &lt;/all>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
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
        public static class PriceDetails {

            @XmlElement(required = true)
            protected BigDecimal base;
            protected PriceQuotes.PriceQuote.PriceDetails.Taxes taxes;
            @XmlElement(required = true)
            protected BigDecimal due;
            protected PriceQuotes.PriceQuote.PriceDetails.Options options;
            protected PriceQuotes.PriceQuote.PriceDetails.Adjustments adjustments;

            /**
             * Gets the value of the base property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBase() {
                return base;
            }

            /**
             * Sets the value of the base property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBase(BigDecimal value) {
                this.base = value;
            }

            /**
             * Gets the value of the taxes property.
             * 
             * @return
             *     possible object is
             *     {@link PriceQuotes.PriceQuote.PriceDetails.Taxes }
             *     
             */
            public PriceQuotes.PriceQuote.PriceDetails.Taxes getTaxes() {
                return taxes;
            }

            /**
             * Sets the value of the taxes property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriceQuotes.PriceQuote.PriceDetails.Taxes }
             *     
             */
            public void setTaxes(PriceQuotes.PriceQuote.PriceDetails.Taxes value) {
                this.taxes = value;
            }

            /**
             * Gets the value of the due property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDue() {
                return due;
            }

            /**
             * Sets the value of the due property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDue(BigDecimal value) {
                this.due = value;
            }

            /**
             * Gets the value of the options property.
             * 
             * @return
             *     possible object is
             *     {@link PriceQuotes.PriceQuote.PriceDetails.Options }
             *     
             */
            public PriceQuotes.PriceQuote.PriceDetails.Options getOptions() {
                return options;
            }

            /**
             * Sets the value of the options property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriceQuotes.PriceQuote.PriceDetails.Options }
             *     
             */
            public void setOptions(PriceQuotes.PriceQuote.PriceDetails.Options value) {
                this.options = value;
            }

            /**
             * Gets the value of the adjustments property.
             * 
             * @return
             *     possible object is
             *     {@link PriceQuotes.PriceQuote.PriceDetails.Adjustments }
             *     
             */
            public PriceQuotes.PriceQuote.PriceDetails.Adjustments getAdjustments() {
                return adjustments;
            }

            /**
             * Sets the value of the adjustments property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriceQuotes.PriceQuote.PriceDetails.Adjustments }
             *     
             */
            public void setAdjustments(PriceQuotes.PriceQuote.PriceDetails.Adjustments value) {
                this.adjustments = value;
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
             *         &lt;element name="adjustment" maxOccurs="20">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="adjustment-code" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
             *                   &lt;element name="adjustment-name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
             *                   &lt;element name="adjustment-cost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                   &lt;element name="qualifier" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;all>
             *                             &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                           &lt;/all>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
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
                "adjustments"
            })
            public static class Adjustments {

                @XmlElement(name = "adjustment", required = true)
                protected List<PriceQuotes.PriceQuote.PriceDetails.Adjustments.Adjustment> adjustments;

                /**
                 * Gets the value of the adjustments property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the adjustments property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAdjustments().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PriceQuotes.PriceQuote.PriceDetails.Adjustments.Adjustment }
                 * 
                 * 
                 */
                public List<PriceQuotes.PriceQuote.PriceDetails.Adjustments.Adjustment> getAdjustments() {
                    if (adjustments == null) {
                        adjustments = new ArrayList<PriceQuotes.PriceQuote.PriceDetails.Adjustments.Adjustment>();
                    }
                    return this.adjustments;
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
                 *         &lt;element name="adjustment-code" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
                 *         &lt;element name="adjustment-name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
                 *         &lt;element name="adjustment-cost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *         &lt;element name="qualifier" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;all>
                 *                   &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *                 &lt;/all>
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
                public static class Adjustment {

                    @XmlElement(name = "adjustment-code", required = true)
                    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                    @XmlSchemaType(name = "normalizedString")
                    protected String adjustmentCode;
                    @XmlElement(name = "adjustment-name", required = true)
                    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                    @XmlSchemaType(name = "normalizedString")
                    protected String adjustmentName;
                    @XmlElement(name = "adjustment-cost", required = true)
                    protected BigDecimal adjustmentCost;
                    protected PriceQuotes.PriceQuote.PriceDetails.Adjustments.Adjustment.Qualifier qualifier;

                    /**
                     * Gets the value of the adjustmentCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAdjustmentCode() {
                        return adjustmentCode;
                    }

                    /**
                     * Sets the value of the adjustmentCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAdjustmentCode(String value) {
                        this.adjustmentCode = value;
                    }

                    /**
                     * Gets the value of the adjustmentName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAdjustmentName() {
                        return adjustmentName;
                    }

                    /**
                     * Sets the value of the adjustmentName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAdjustmentName(String value) {
                        this.adjustmentName = value;
                    }

                    /**
                     * Gets the value of the adjustmentCost property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getAdjustmentCost() {
                        return adjustmentCost;
                    }

                    /**
                     * Sets the value of the adjustmentCost property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setAdjustmentCost(BigDecimal value) {
                        this.adjustmentCost = value;
                    }

                    /**
                     * Gets the value of the qualifier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PriceQuotes.PriceQuote.PriceDetails.Adjustments.Adjustment.Qualifier }
                     *     
                     */
                    public PriceQuotes.PriceQuote.PriceDetails.Adjustments.Adjustment.Qualifier getQualifier() {
                        return qualifier;
                    }

                    /**
                     * Sets the value of the qualifier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PriceQuotes.PriceQuote.PriceDetails.Adjustments.Adjustment.Qualifier }
                     *     
                     */
                    public void setQualifier(PriceQuotes.PriceQuote.PriceDetails.Adjustments.Adjustment.Qualifier value) {
                        this.qualifier = value;
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
                     *         &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
                    public static class Qualifier {

                        @XmlElement(required = true)
                        protected BigDecimal percent;

                        /**
                         * Gets the value of the percent property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getPercent() {
                            return percent;
                        }

                        /**
                         * Sets the value of the percent property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setPercent(BigDecimal value) {
                            this.percent = value;
                        }

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
             *                   &lt;element name="option-code" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
             *                   &lt;element name="option-name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
             *                   &lt;element name="option-price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                   &lt;element name="qualifier" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;all>
             *                             &lt;element name="step-size" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                             &lt;element name="step-cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                             &lt;element name="included-amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                             &lt;element name="max-value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                             &lt;element name="included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *                             &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                           &lt;/all>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
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
                protected List<PriceQuotes.PriceQuote.PriceDetails.Options.Option> options;

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
                 * {@link PriceQuotes.PriceQuote.PriceDetails.Options.Option }
                 * 
                 * 
                 */
                public List<PriceQuotes.PriceQuote.PriceDetails.Options.Option> getOptions() {
                    if (options == null) {
                        options = new ArrayList<PriceQuotes.PriceQuote.PriceDetails.Options.Option>();
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
                 *         &lt;element name="option-code" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
                 *         &lt;element name="option-name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
                 *         &lt;element name="option-price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *         &lt;element name="qualifier" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;all>
                 *                   &lt;element name="step-size" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                   &lt;element name="step-cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                   &lt;element name="included-amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                   &lt;element name="max-value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                   &lt;element name="included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
                 *                   &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                 &lt;/all>
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
                public static class Option {

                    @XmlElement(name = "option-code", required = true)
                    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                    @XmlSchemaType(name = "normalizedString")
                    protected String optionCode;
                    @XmlElement(name = "option-name", required = true)
                    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                    @XmlSchemaType(name = "normalizedString")
                    protected String optionName;
                    @XmlElement(name = "option-price", required = true)
                    protected BigDecimal optionPrice;
                    protected PriceQuotes.PriceQuote.PriceDetails.Options.Option.Qualifier qualifier;

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
                     * Gets the value of the optionName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOptionName() {
                        return optionName;
                    }

                    /**
                     * Sets the value of the optionName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOptionName(String value) {
                        this.optionName = value;
                    }

                    /**
                     * Gets the value of the optionPrice property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getOptionPrice() {
                        return optionPrice;
                    }

                    /**
                     * Sets the value of the optionPrice property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setOptionPrice(BigDecimal value) {
                        this.optionPrice = value;
                    }

                    /**
                     * Gets the value of the qualifier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PriceQuotes.PriceQuote.PriceDetails.Options.Option.Qualifier }
                     *     
                     */
                    public PriceQuotes.PriceQuote.PriceDetails.Options.Option.Qualifier getQualifier() {
                        return qualifier;
                    }

                    /**
                     * Sets the value of the qualifier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PriceQuotes.PriceQuote.PriceDetails.Options.Option.Qualifier }
                     *     
                     */
                    public void setQualifier(PriceQuotes.PriceQuote.PriceDetails.Options.Option.Qualifier value) {
                        this.qualifier = value;
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
                     *         &lt;element name="step-size" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *         &lt;element name="step-cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *         &lt;element name="included-amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *         &lt;element name="max-value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *         &lt;element name="included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
                     *         &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                    public static class Qualifier {

                        @XmlElement(name = "step-size")
                        protected BigDecimal stepSize;
                        @XmlElement(name = "step-cost")
                        protected BigDecimal stepCost;
                        @XmlElement(name = "included-amount")
                        protected BigDecimal includedAmount;
                        @XmlElement(name = "max-value")
                        protected BigDecimal maxValue;
                        protected Boolean included;
                        protected BigDecimal percent;

                        /**
                         * Gets the value of the stepSize property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getStepSize() {
                            return stepSize;
                        }

                        /**
                         * Sets the value of the stepSize property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setStepSize(BigDecimal value) {
                            this.stepSize = value;
                        }

                        /**
                         * Gets the value of the stepCost property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getStepCost() {
                            return stepCost;
                        }

                        /**
                         * Sets the value of the stepCost property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setStepCost(BigDecimal value) {
                            this.stepCost = value;
                        }

                        /**
                         * Gets the value of the includedAmount property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getIncludedAmount() {
                            return includedAmount;
                        }

                        /**
                         * Sets the value of the includedAmount property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setIncludedAmount(BigDecimal value) {
                            this.includedAmount = value;
                        }

                        /**
                         * Gets the value of the maxValue property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getMaxValue() {
                            return maxValue;
                        }

                        /**
                         * Sets the value of the maxValue property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setMaxValue(BigDecimal value) {
                            this.maxValue = value;
                        }

                        /**
                         * Gets the value of the included property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isIncluded() {
                            return included;
                        }

                        /**
                         * Sets the value of the included property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setIncluded(Boolean value) {
                            this.included = value;
                        }

                        /**
                         * Gets the value of the percent property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getPercent() {
                            return percent;
                        }

                        /**
                         * Sets the value of the percent property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setPercent(BigDecimal value) {
                            this.percent = value;
                        }

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
             *         &lt;element name="gst" type="{http://www.canadapost.ca/ws/ship/rate-v4}TaxType" minOccurs="0"/>
             *         &lt;element name="pst" type="{http://www.canadapost.ca/ws/ship/rate-v4}TaxType" minOccurs="0"/>
             *         &lt;element name="hst" type="{http://www.canadapost.ca/ws/ship/rate-v4}TaxType" minOccurs="0"/>
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
            public static class Taxes {

                protected TaxType gst;
                protected TaxType pst;
                protected TaxType hst;

                /**
                 * Gets the value of the gst property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TaxType }
                 *     
                 */
                public TaxType getGst() {
                    return gst;
                }

                /**
                 * Sets the value of the gst property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TaxType }
                 *     
                 */
                public void setGst(TaxType value) {
                    this.gst = value;
                }

                /**
                 * Gets the value of the pst property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TaxType }
                 *     
                 */
                public TaxType getPst() {
                    return pst;
                }

                /**
                 * Sets the value of the pst property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TaxType }
                 *     
                 */
                public void setPst(TaxType value) {
                    this.pst = value;
                }

                /**
                 * Gets the value of the hst property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TaxType }
                 *     
                 */
                public TaxType getHst() {
                    return hst;
                }

                /**
                 * Sets the value of the hst property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TaxType }
                 *     
                 */
                public void setHst(TaxType value) {
                    this.hst = value;
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
         *         &lt;element name="am-delivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="guaranteed-delivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="expected-transit-time" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;minInclusive value="0"/>
         *               &lt;maxInclusive value="99"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="expected-delivery-date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
        public static class ServiceStandard {

            @XmlElement(name = "am-delivery")
            protected boolean amDelivery;
            @XmlElement(name = "guaranteed-delivery")
            protected boolean guaranteedDelivery;
            @XmlElement(name = "expected-transit-time")
            protected Integer expectedTransitTime;
            @XmlElement(name = "expected-delivery-date")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar expectedDeliveryDate;

            /**
             * Gets the value of the amDelivery property.
             * 
             */
            public boolean isAmDelivery() {
                return amDelivery;
            }

            /**
             * Sets the value of the amDelivery property.
             * 
             */
            public void setAmDelivery(boolean value) {
                this.amDelivery = value;
            }

            /**
             * Gets the value of the guaranteedDelivery property.
             * 
             */
            public boolean isGuaranteedDelivery() {
                return guaranteedDelivery;
            }

            /**
             * Sets the value of the guaranteedDelivery property.
             * 
             */
            public void setGuaranteedDelivery(boolean value) {
                this.guaranteedDelivery = value;
            }

            /**
             * Gets the value of the expectedTransitTime property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getExpectedTransitTime() {
                return expectedTransitTime;
            }

            /**
             * Sets the value of the expectedTransitTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setExpectedTransitTime(Integer value) {
                this.expectedTransitTime = value;
            }

            /**
             * Gets the value of the expectedDeliveryDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getExpectedDeliveryDate() {
                return expectedDeliveryDate;
            }

            /**
             * Sets the value of the expectedDeliveryDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setExpectedDeliveryDate(XMLGregorianCalendar value) {
                this.expectedDeliveryDate = value;
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
         *         &lt;element name="cubed-weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        public static class WeightDetails {

            @XmlElement(name = "cubed-weight")
            protected BigDecimal cubedWeight;

            /**
             * Gets the value of the cubedWeight property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCubedWeight() {
                return cubedWeight;
            }

            /**
             * Sets the value of the cubedWeight property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCubedWeight(BigDecimal value) {
                this.cubedWeight = value;
            }

        }

    }

}
