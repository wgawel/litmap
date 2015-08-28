
package pl.edu.pwr.services.tagger;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TaggerService", targetNamespace = "http://ws.clarin-pl.eu/wsg/tagger/", wsdlLocation = "http://ws.clarin-pl.eu/wsg/tagger/index.php?wsdl")
public class TaggerService
    extends Service
{

    private final static URL TAGGERSERVICE_WSDL_LOCATION;
    private final static WebServiceException TAGGERSERVICE_EXCEPTION;
    private final static QName TAGGERSERVICE_QNAME = new QName("http://ws.clarin-pl.eu/wsg/tagger/", "TaggerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ws.clarin-pl.eu/wsg/tagger/index.php?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TAGGERSERVICE_WSDL_LOCATION = url;
        TAGGERSERVICE_EXCEPTION = e;
    }

    public TaggerService() {
        super(__getWsdlLocation(), TAGGERSERVICE_QNAME);
    }

    public TaggerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TAGGERSERVICE_QNAME, features);
    }

    public TaggerService(URL wsdlLocation) {
        super(wsdlLocation, TAGGERSERVICE_QNAME);
    }

    public TaggerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TAGGERSERVICE_QNAME, features);
    }

    public TaggerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TaggerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TaggerServicePortType
     */
    @WebEndpoint(name = "TaggerServicePort")
    public TaggerServicePortType getTaggerServicePort() {
        return super.getPort(new QName("http://ws.clarin-pl.eu/wsg/tagger/", "TaggerServicePort"), TaggerServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TaggerServicePortType
     */
    @WebEndpoint(name = "TaggerServicePort")
    public TaggerServicePortType getTaggerServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.clarin-pl.eu/wsg/tagger/", "TaggerServicePort"), TaggerServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TAGGERSERVICE_EXCEPTION!= null) {
            throw TAGGERSERVICE_EXCEPTION;
        }
        return TAGGERSERVICE_WSDL_LOCATION;
    }

}
