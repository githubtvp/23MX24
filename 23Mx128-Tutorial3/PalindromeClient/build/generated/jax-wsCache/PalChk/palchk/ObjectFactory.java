
package palchk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the palchk package. 
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

    private final static QName _Hello_QNAME = new QName("http://PalChk/", "hello");
    private final static QName _ChkPal_QNAME = new QName("http://PalChk/", "ChkPal");
    private final static QName _ChkPalResponse_QNAME = new QName("http://PalChk/", "ChkPalResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://PalChk/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: palchk
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChkPalResponse }
     * 
     */
    public ChkPalResponse createChkPalResponse() {
        return new ChkPalResponse();
    }

    /**
     * Create an instance of {@link ChkPal }
     * 
     */
    public ChkPal createChkPal() {
        return new ChkPal();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PalChk/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkPal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PalChk/", name = "ChkPal")
    public JAXBElement<ChkPal> createChkPal(ChkPal value) {
        return new JAXBElement<ChkPal>(_ChkPal_QNAME, ChkPal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkPalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PalChk/", name = "ChkPalResponse")
    public JAXBElement<ChkPalResponse> createChkPalResponse(ChkPalResponse value) {
        return new JAXBElement<ChkPalResponse>(_ChkPalResponse_QNAME, ChkPalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PalChk/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
