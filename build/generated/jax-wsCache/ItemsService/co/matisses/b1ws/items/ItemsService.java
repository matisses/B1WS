
package co.matisses.b1ws.items;

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
@WebServiceClient(name = "ItemsService", targetNamespace = "ItemsService", wsdlLocation = "http://192.168.5.75/B1WS/WebReferences/ItemsService.wsdl")
public class ItemsService
    extends Service
{

    private final static URL ITEMSSERVICE_WSDL_LOCATION;
    private final static WebServiceException ITEMSSERVICE_EXCEPTION;
    private final static QName ITEMSSERVICE_QNAME = new QName("ItemsService", "ItemsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.5.75/B1WS/WebReferences/ItemsService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ITEMSSERVICE_WSDL_LOCATION = url;
        ITEMSSERVICE_EXCEPTION = e;
    }

    public ItemsService() {
        super(__getWsdlLocation(), ITEMSSERVICE_QNAME);
    }

    public ItemsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ITEMSSERVICE_QNAME, features);
    }

    public ItemsService(URL wsdlLocation) {
        super(wsdlLocation, ITEMSSERVICE_QNAME);
    }

    public ItemsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ITEMSSERVICE_QNAME, features);
    }

    public ItemsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ItemsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ItemsServiceSoap
     */
    @WebEndpoint(name = "ItemsServiceSoap")
    public ItemsServiceSoap getItemsServiceSoap() {
        return super.getPort(new QName("ItemsService", "ItemsServiceSoap"), ItemsServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ItemsServiceSoap
     */
    @WebEndpoint(name = "ItemsServiceSoap")
    public ItemsServiceSoap getItemsServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("ItemsService", "ItemsServiceSoap"), ItemsServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns ItemsServiceSoap
     */
    @WebEndpoint(name = "ItemsServiceSoap12")
    public ItemsServiceSoap getItemsServiceSoap12() {
        return super.getPort(new QName("ItemsService", "ItemsServiceSoap12"), ItemsServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ItemsServiceSoap
     */
    @WebEndpoint(name = "ItemsServiceSoap12")
    public ItemsServiceSoap getItemsServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("ItemsService", "ItemsServiceSoap12"), ItemsServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ITEMSSERVICE_EXCEPTION!= null) {
            throw ITEMSSERVICE_EXCEPTION;
        }
        return ITEMSSERVICE_WSDL_LOCATION;
    }

}
