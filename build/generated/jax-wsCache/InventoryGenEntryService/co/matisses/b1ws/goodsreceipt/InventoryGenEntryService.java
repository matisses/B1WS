
package co.matisses.b1ws.goodsreceipt;

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
@WebServiceClient(name = "InventoryGenEntryService", targetNamespace = "InventoryGenEntryService", wsdlLocation = "http://192.168.5.76/B1WS/WebReferences/InventoryGenEntryService.wsdl")
public class InventoryGenEntryService
    extends Service
{

    private final static URL INVENTORYGENENTRYSERVICE_WSDL_LOCATION;
    private final static WebServiceException INVENTORYGENENTRYSERVICE_EXCEPTION;
    private final static QName INVENTORYGENENTRYSERVICE_QNAME = new QName("InventoryGenEntryService", "InventoryGenEntryService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.5.76/B1WS/WebReferences/InventoryGenEntryService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INVENTORYGENENTRYSERVICE_WSDL_LOCATION = url;
        INVENTORYGENENTRYSERVICE_EXCEPTION = e;
    }

    public InventoryGenEntryService() {
        super(__getWsdlLocation(), INVENTORYGENENTRYSERVICE_QNAME);
    }

    public InventoryGenEntryService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INVENTORYGENENTRYSERVICE_QNAME, features);
    }

    public InventoryGenEntryService(URL wsdlLocation) {
        super(wsdlLocation, INVENTORYGENENTRYSERVICE_QNAME);
    }

    public InventoryGenEntryService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INVENTORYGENENTRYSERVICE_QNAME, features);
    }

    public InventoryGenEntryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InventoryGenEntryService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InventoryGenEntryServiceSoap
     */
    @WebEndpoint(name = "InventoryGenEntryServiceSoap")
    public InventoryGenEntryServiceSoap getInventoryGenEntryServiceSoap() {
        return super.getPort(new QName("InventoryGenEntryService", "InventoryGenEntryServiceSoap"), InventoryGenEntryServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InventoryGenEntryServiceSoap
     */
    @WebEndpoint(name = "InventoryGenEntryServiceSoap")
    public InventoryGenEntryServiceSoap getInventoryGenEntryServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("InventoryGenEntryService", "InventoryGenEntryServiceSoap"), InventoryGenEntryServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns InventoryGenEntryServiceSoap
     */
    @WebEndpoint(name = "InventoryGenEntryServiceSoap12")
    public InventoryGenEntryServiceSoap getInventoryGenEntryServiceSoap12() {
        return super.getPort(new QName("InventoryGenEntryService", "InventoryGenEntryServiceSoap12"), InventoryGenEntryServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InventoryGenEntryServiceSoap
     */
    @WebEndpoint(name = "InventoryGenEntryServiceSoap12")
    public InventoryGenEntryServiceSoap getInventoryGenEntryServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("InventoryGenEntryService", "InventoryGenEntryServiceSoap12"), InventoryGenEntryServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INVENTORYGENENTRYSERVICE_EXCEPTION!= null) {
            throw INVENTORYGENENTRYSERVICE_EXCEPTION;
        }
        return INVENTORYGENENTRYSERVICE_WSDL_LOCATION;
    }

}