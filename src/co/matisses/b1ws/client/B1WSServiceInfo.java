package co.matisses.b1ws.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dbotero
 */
public class B1WSServiceInfo {

    //Variables de conexion con el servidor
    public static final String RUTA_WSDL = "http://192.168.5.76/B1WS/WebReferences/%1$s.wsdl";
//    public static String DATABASE_SERVER = "CRONOS";
//    public static String DATABASE_NAME = "BARU";
    public static String DATABASE_TYPE = "dst_MSSQL2012";
//    public static String COMPANY_USERNAME = "manager";
//    public static String COMPANY_PASSWORD = "";
    public static String LANGUAGE = "ln_Spanish";
//    public static String LICENSE_SERVER = "CRONOS:30000";
    public static String DATABASE_SERVER = null;
    public static String DATABASE_NAME = null;
    public static String COMPANY_USERNAME = null;
    public static String COMPANY_PASSWORD = null;
    public static String LICENSE_SERVER = null;
    //Variables globales
    public static final String T_YES = "tYES";
    public static final String T_NO = "tNO";
    public static final String PS_YES = "psYes";
    public static final String PS_NO = "psNo";
    public static final String DOCTYPE_ITEMS = "I";
    public static final String DOCTYPE_SERVICE = "S";
    //Variables para servicio de egresos
    public static final String VENDOR_PAYMENTS_SERVICE_WSDL_NAME = "VendorPaymentsService";
    //Variables para servicio de clientes
    public static final String BUSINESS_PARTNERS_SERVICE_WSDL_NAME = "BusinessPartnersService";
    //Variables para servicio de entrada de mercancia por inventario
    public static final String GOODS_RECEIPT_SERVICE_WSDL_NAME = "InventoryGenEntryService";
    //Variables para servicio de salida de mercancia por inventario
    public static final String GOODS_ISSUE_SERVICE_WSDL_NAME = "InventoryGenExitService";
    //Variables para servicio de llamadas de servicio
    public static final String SERVICE_CALLS_SERVICE_WSDL_NAME = "ServiceCallsService";
    //Variables para servicio de borradores
    public static final String DRAFTS_SERVICE_WSDL_NAME = "DraftsService";
    //Variables para el servicio de pagos
    public static final String INCOMING_PAYMENT_SERVICE_WSDL_NAME = "IncomingPaymentsService";
    public static final String INCOMING_PAYMENT_SERVICE_NAME = "{IncomingPaymentsService}IncomingPaymentsService";
    //Variables para servicio de notas credito
    public static final String CREDIT_NOTES_SERVICE_WSDL_NAME = "CreditNotesService";
    //Variables para servicio de ordenes de venta
    public static final String ORDER_SERVICE_WSDL_NAME = "OrdersService";
    //Variables para servicio de items de inventario
    public static final String ITEMS_SERVICE_WSDL_NAME = "ItemsService";
    //Variables para servicio de asientos contables
    public static final String JOURNAL_ENTRIES_SERVICE_WSDL_NAME = "JournalEntriesService";
    //Variables para servicio de facturacion
    public static final String INVOICES_SERVICE_WSDL_NAME = "InvoicesService";
    public static final String INVOICES_SERVICE_NAME = "{InvoicesService}InvoicesService";
    public static final String WUID_FACTURA_POS = "494122ca-16bb-499c-aba6-f5836d6e5930-13032015104755";
    public static final String ESTADO_PRODUCTO_DESPACHADO = "D";
    public static final String PROYECTO_POS = "08";
    public static final Long TIPO_FACTURACION_CREDITO = 17L;
    public static final Long COD_ASESOR_WEB = 98L;
    public static final Long CONS_FACT_POS = 76L;
    //Variables para servicio de cotizaciones
    public static final String QUOTATIONS_SERVICE_WSDL_NAME = "QuotationsService";
    public static final String QUOTATIONS_SERVICE_NAME = "{QuotationsService}QuotationsService";
    //Variable para servicio de traslados
    public static final String STOCK_TRANSFER_SERVICE_WSDL_NAME = "StockTransferService";

    public B1WSServiceInfo() {

        try {
            Properties p = new Properties();
            p.load(new FileInputStream("sap.conf"));
            DATABASE_SERVER = p.getProperty("database.server");
            DATABASE_NAME = p.getProperty("database.name");
            COMPANY_USERNAME = p.getProperty("company.username");
            COMPANY_PASSWORD = p.getProperty("company.password");
            LICENSE_SERVER = p.getProperty("license.server");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(B1WSServiceInfo.class.getName()).log(Level.SEVERE, "No se encontro el archivo sap.conf en la ruta de ejecucion de la aplicacion. Por favor copie este archivo para continuar. ", ex);
        } catch (IOException ex) {
            Logger.getLogger(B1WSServiceInfo.class.getName()).log(Level.SEVERE, "Ocurrio un error al cargar el archivo sap.conf. ", ex);
        }
    }
}
