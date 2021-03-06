
package org.admnkz.crypto.requestspep;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "SignatureTool", targetNamespace = "http://esv.server.rt.ru", wsdlLocation = "http://195.245.214.33:7777/esv/?wsdl")
public class SignatureTool
    extends Service
{
	public static final int VER_OK = 0;
	public static final int VER_INTERNAL_ERROR = 1;
	public static final int VER_NO_TIMESTAMP = 2;
	public static final int VER_INVALID_SIGNATURE = 3;
	public static final int VER_CERT_NOT_FOUND = 4;
	public static final int VER_CERT_OUT_OF_DATE = 5;
	public static final int VER_CERT_REVOKED = 7;
	public static final int VER_SIGNATURE_NOT_FOUND = 8;
	public static final int VER_MESSAGE_NOT_SIGNED = 9;
	public static final int VER_INVALID_SERVICE_CONFIG = 10;
	public static final int VER_CERT_NOT_VALID = 13;
	public static final int VER_REVOK_UNKNOWN = 14;
	public static final int VER_CERT_ISSUER_UNKNOWN = 15;
	public static final int VER_CERT_NOT_QUALIFIED = 16;
	public static final int VER_CERT_ISSUER_OUT_OF_DATE = 17;
	
    private static URL SIGNATURETOOL_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.admnkz.crypto.requestspep.SignatureTool.class.getName());

    public static void setWsdlLocation(String aurl) {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.admnkz.crypto.requestspep.SignatureTool.class.getResource(".");
            url = new URL(baseUrl, aurl);
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: '"+ aurl +"', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SIGNATURETOOL_WSDL_LOCATION = url;
    }

    public SignatureTool(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SignatureTool() {
        super(SIGNATURETOOL_WSDL_LOCATION, new QName("http://esv.server.rt.ru", "SignatureTool"));
    }

    /**
     * 
     * @return
     *     returns SignatureToolSoap
     */
    @WebEndpoint(name = "SignatureToolSoap")
    public SignatureToolSoap getSignatureToolSoap() {
        return super.getPort(new QName("http://esv.server.rt.ru", "SignatureToolSoap"), SignatureToolSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SignatureToolSoap
     */
    @WebEndpoint(name = "SignatureToolSoap")
    public SignatureToolSoap getSignatureToolSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://esv.server.rt.ru", "SignatureToolSoap"), SignatureToolSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns SignatureToolSoap
     */
    @WebEndpoint(name = "SignatureToolSoap12")
    public SignatureToolSoap getSignatureToolSoap12() {
        return super.getPort(new QName("http://esv.server.rt.ru", "SignatureToolSoap12"), SignatureToolSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SignatureToolSoap
     */
    @WebEndpoint(name = "SignatureToolSoap12")
    public SignatureToolSoap getSignatureToolSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://esv.server.rt.ru", "SignatureToolSoap12"), SignatureToolSoap.class, features);
    }

}
