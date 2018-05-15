
package co.matisses.b1ws.drafts;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DraftsService", targetNamespace = "DraftsService", wsdlLocation = "http://192.168.5.76/B1WS/WebReferences/DraftsService.wsdl")
public class DraftsService
    extends Service
{

    private final static URL DRAFTSSERVICE_WSDL_LOCATION;
    private final static WebServiceException DRAFTSSERVICE_EXCEPTION;
    private final static QName DRAFTSSERVICE_QNAME = new QName("DraftsService", "DraftsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.5.76/B1WS/WebReferences/DraftsService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DRAFTSSERVICE_WSDL_LOCATION = url;
        DRAFTSSERVICE_EXCEPTION = e;
    }

    public DraftsService() {
        super(__getWsdlLocation(), DRAFTSSERVICE_QNAME);
    }

    public DraftsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DRAFTSSERVICE_QNAME, features);
    }

    public DraftsService(URL wsdlLocation) {
        super(wsdlLocation, DRAFTSSERVICE_QNAME);
    }

    public DraftsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DRAFTSSERVICE_QNAME, features);
    }

    public DraftsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DraftsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DraftsServiceSoap
     */
    @WebEndpoint(name = "DraftsServiceSoap")
    public DraftsServiceSoap getDraftsServiceSoap() {
        return super.getPort(new QName("DraftsService", "DraftsServiceSoap"), DraftsServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DraftsServiceSoap
     */
    @WebEndpoint(name = "DraftsServiceSoap")
    public DraftsServiceSoap getDraftsServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("DraftsService", "DraftsServiceSoap"), DraftsServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns DraftsServiceSoap
     */
    @WebEndpoint(name = "DraftsServiceSoap12")
    public DraftsServiceSoap getDraftsServiceSoap12() {
        return super.getPort(new QName("DraftsService", "DraftsServiceSoap12"), DraftsServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DraftsServiceSoap
     */
    @WebEndpoint(name = "DraftsServiceSoap12")
    public DraftsServiceSoap getDraftsServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("DraftsService", "DraftsServiceSoap12"), DraftsServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DRAFTSSERVICE_EXCEPTION!= null) {
            throw DRAFTSSERVICE_EXCEPTION;
        }
        return DRAFTSSERVICE_WSDL_LOCATION;
    }

}