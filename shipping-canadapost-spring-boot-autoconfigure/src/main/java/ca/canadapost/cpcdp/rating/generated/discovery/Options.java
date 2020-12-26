
package ca.canadapost.cpcdp.rating.generated.discovery;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="option" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="option-code" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                   &lt;element name="option-name" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                   &lt;element name="link" type="{http://www.canadapost.ca/ws/ship/rate-v4}LinkType"/>
 *                   &lt;element name="qualifier-required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlRootElement(name = "options")
public class Options {

    @XmlElement(name = "option")
    protected List<Options.Option> options;

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
     * {@link Options.Option }
     * 
     * 
     */
    public List<Options.Option> getOptions() {
        if (options == null) {
            options = new ArrayList<Options.Option>();
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
     *         &lt;element name="option-code" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *         &lt;element name="option-name" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *         &lt;element name="link" type="{http://www.canadapost.ca/ws/ship/rate-v4}LinkType"/>
     *         &lt;element name="qualifier-required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String optionCode;
        @XmlElement(name = "option-name", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String optionName;
        @XmlElement(required = true)
        protected Link link;
        @XmlElement(name = "qualifier-required")
        protected boolean qualifierRequired;

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
         * Gets the value of the link property.
         * 
         * @return
         *     possible object is
         *     {@link Link }
         *     
         */
        public Link getLink() {
            return link;
        }

        /**
         * Sets the value of the link property.
         * 
         * @param value
         *     allowed object is
         *     {@link Link }
         *     
         */
        public void setLink(Link value) {
            this.link = value;
        }

        /**
         * Gets the value of the qualifierRequired property.
         * 
         */
        public boolean isQualifierRequired() {
            return qualifierRequired;
        }

        /**
         * Sets the value of the qualifierRequired property.
         * 
         */
        public void setQualifierRequired(boolean value) {
            this.qualifierRequired = value;
        }

    }

}
