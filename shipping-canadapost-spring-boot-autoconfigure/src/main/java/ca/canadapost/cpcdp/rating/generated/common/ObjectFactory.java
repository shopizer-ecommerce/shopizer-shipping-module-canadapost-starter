
package ca.canadapost.cpcdp.rating.generated.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ca.canadapost.cpcdp.rating.generated.common package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Link_QNAME = new QName("", "link");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ca.canadapost.cpcdp.rating.generated.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkType();
    }

    /**
     * Create an instance of {@link Links }
     * 
     */
    public Links createLinks() {
        return new Links();
    }

    /**
     * Create an instance of {@link CcAddressDetailsType }
     * 
     */
    public CcAddressDetailsType createCcAddressDetailsType() {
        return new CcAddressDetailsType();
    }

    /**
     * Create an instance of {@link CcDetailsType }
     * 
     */
    public CcDetailsType createCcDetailsType() {
        return new CcDetailsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "link")
    public JAXBElement<LinkType> createLink(LinkType value) {
        return new JAXBElement<LinkType>(_Link_QNAME, LinkType.class, null, value);
    }

}
