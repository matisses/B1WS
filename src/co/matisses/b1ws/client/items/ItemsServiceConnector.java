//package co.matisses.b1ws.client.items;
//
//import co.matisses.b1ws.dto.ItemDTO;
//import co.matisses.b1ws.dto.ItemPricesLineDTO;
//import co.matisses.b1ws.client.B1WSServiceInfo;
//import co.matisses.b1ws.dto.ItemUpdateDTO;
//import co.matisses.b1ws.dto.ItemUpdateFieldDTO;
//import co.matisses.b1ws.items.Add;
//import co.matisses.b1ws.items.GetByParams;
//import co.matisses.b1ws.items.GetByParamsResponse;
//import co.matisses.b1ws.items.Item;
//import co.matisses.b1ws.items.ItemParams;
//import co.matisses.b1ws.items.ItemsService;
//import co.matisses.b1ws.items.ItemsServiceSoap;
//import co.matisses.b1ws.items.MsgHeader;
//import co.matisses.b1ws.items.Update;
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//import java.util.Date;
//import java.util.GregorianCalendar;
//import java.util.HashMap;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.xml.datatype.DatatypeFactory;
//
///**
// *
// * @author dbotero
// */
//public class ItemsServiceConnector extends B1WSServiceInfo {
//
//    private static final Logger log = Logger.getLogger(ItemsServiceConnector.class.getSimpleName());
//    private final ItemsService service;
//    private final String sessionId;
//    private HashMap<String, String> fields = new HashMap();
//
//    public ItemsServiceConnector(ItemsService service, String sessionId) {
//        super();
//        this.service = service;
//        this.sessionId = sessionId;
//    }
//
//    public void updateItems(ItemUpdateDTO[] items) throws ItemsServiceException {
//        log.log(Level.INFO, "Se procesara una solicitud de modificacion de items. {0}", items);
//        if (sessionId == null) {
//            throw new ItemsServiceException("No se recibio un ID de sesion de B1WS valido. ");
//        }
//        loadItemAttributes();
//        ItemsServiceSoap port = service.getItemsServiceSoap12();
//        MsgHeader header = new MsgHeader();
//        header.setServiceName(ITEMS_SERVICE_WSDL_NAME);
//        header.setSessionID(sessionId);
//
//        for (ItemUpdateDTO itemUpdate : items) {
//            ItemParams params = new ItemParams();
//            params.setItemCode(itemUpdate.getItemCode());
//            GetByParams get = new GetByParams();
//            get.setItemParams(params);
//            Item item = null;
//            try {
//                GetByParamsResponse resp = port.getByParams(get, header);
//                item = resp.getItem();
//                for (ItemUpdateFieldDTO field : itemUpdate.getFields()) {
//                    setAttributeValue(item, field.getFieldName(), field.getFieldValue());
//                }
//                Update update = new Update();
//                update.setItem(item);
//                try {
//                    port.update(update, header);
//                } catch (Exception e) {
//                    //TODO: actualizar estado para el item
//                }
//            } catch (Exception e) {
//                log.log(Level.SEVERE, "Ocurrio un error al consultar el item " + itemUpdate.getItemCode(), e);
//            }
//        }
//    }
//
//    private void loadItemAttributes() {
//        fields = new HashMap();
//        for (Method m : Item.class.getDeclaredMethods()) {
//            if (m.getName().startsWith("set")) {
//                String fieldName = m.getName().substring(3);
//                for (Field f : Item.class.getDeclaredFields()) {
//                    if (f.getName().equalsIgnoreCase(fieldName)) {
//                        fields.put(f.getName(), m.getName());
//                    }
//                }
//            }
//        }
//    }
//
//    private void setAttributeValue(Item item, String attrName, String attrVal) {
//        log.log(Level.INFO, "Asignando el valor {0} al atributo {1}", new Object[]{attrVal, attrName});
//        try {
//            Method m = Class.forName(Item.class.getName()).getDeclaredMethod(fields.get(attrName));
//            m.invoke(item, attrVal);
//        } catch (Exception e) {
//        }
//    }
//
//    public void createItem(ItemDTO itemDto) throws ItemsServiceException {
//        log.log(Level.INFO, "Se recibio un item para crear. {0}", itemDto);
//        ItemsServiceSoap port = service.getItemsServiceSoap12();
//        if (sessionId == null) {
//            throw new ItemsServiceException("No se recibio un ID de sesion de B1WS valido. ");
//        }
//
//        MsgHeader header = new MsgHeader();
//        header.setServiceName(ITEMS_SERVICE_WSDL_NAME);
//        header.setSessionID(sessionId);
//
//        Item item = new Item();
//
//        item.setItemCode(itemDto.getItemCode());
//        item.setItemName(itemDto.getItemName());
//        item.setBarCode(itemDto.getBarCode());
//        item.setForeignName(itemDto.getForeignName());
//        item.setItemsGroupCode(itemDto.getItemsGroupCode());
//        item.setPicture(itemDto.getItemCode() + "_plantilla.jgp");
//        item.setProperties2("Y");
//        item.setDataExportCode("15");
//        item.setIssueMethod("M");
//        item.setPlanningSystem("M");
//        item.setIndirectTax("Y");
//        item.setArTaxCode("GENVT16");
//        item.setApTaxCode("I_LEG_T0");
//        item.setProductSource(itemDto.getProductSource());
//        item.setMainsupplier(itemDto.getItemCode().substring(0, 3) + "PE");
//        item.setUGrupo(itemDto.getuGrupo());
//        item.setUSubGrupo(itemDto.getuSubGrupo());
//        item.setUUPicPro(itemDto.getItemCode() + "_mini.jpg");
//        item.setUURefPro(itemDto.getuURefPro());
//        item.setUURefAduana(itemDto.getuURefAduana());
//        item.setUUDesAduana(itemDto.getuUDesAduana());
//        item.setUUCodAran(itemDto.getuUCodAran());
//        item.setUUCarat(itemDto.getuUCarat());
//        item.setUUColEstru(itemDto.getuUColEstru());
//        item.setUUPalCla(itemDto.getuUPalCla());
//        item.setUUAlt(itemDto.getuUAlt());
//        item.setUUHabDes(itemDto.getuUHabDes());
//        item.setUDescripciona(itemDto.getuDescripciona());
//        item.setUCuidados(itemDto.getuCuidados());
//        item.setUCojineria(itemDto.getuCojineria());
//        item.setUType(itemDto.getuType());
//        item.setUMateriales(itemDto.getuMateriales());
//        item.setUNumpartes(itemDto.getuNumpartes());
//        item.setUFotoHd(itemDto.getItemCode() + "_foto.jpg");
//        item.setUModelo(itemDto.getuModelo());
//        item.setUFotosOK(itemDto.getuFotosOK());
//        item.setUDescCorta(itemDto.getuDescCorta());
//        item.setUModelado(itemDto.getuModelado());
//        item.setUCodigoEan(itemDto.getuCodigoEan());
//        item.setUCodigoMarca(itemDto.getuCodigoMarca());
//        item.setUColeccion(itemDto.getuColeccion());
//        item.setUFactorRedondeo(itemDto.getuFactorRedondeo());
//        item.setURegistroCambio(itemDto.getuRegistroCambio());
//
//        /*Se incluyen las medidas*/
//        item.setSalesHeightUnit(2L);
//        item.setSalesUnitHeight(itemDto.getSalesUnitHeight());
//        item.setSalesLengthUnit(2L);
//        item.setSalesUnitLength(itemDto.getSalesUnitLength());
//        item.setSalesWeightUnit(3L);
//        item.setSalesUnitWeight(itemDto.getSalesUnitWeight());
//        item.setSalesWidthUnit(2L);
//        item.setSalesUnitWidth(itemDto.getSalesUnitWidth());
//
//        try {
//            GregorianCalendar cal1 = new GregorianCalendar();
//            cal1.setTime(new Date());
//            item.setUReprocesarfotos(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal1));
//
//            if (itemDto.getuUActQn() != null) {
//                GregorianCalendar cal2 = new GregorianCalendar();
//                cal2.setTime(itemDto.getuUActQn());
//                item.setUUActQn(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal2));
//            }
//        } catch (Exception e) {
//            log.log(Level.WARNING, "No se pudieron configurar las fechas del item. ", e);
//        }
//
//        /*Se asignan los precios*/
//        if (itemDto.getItemPrices() != null && !itemDto.getItemPrices().isEmpty()) {
//            Item.ItemPrices itemPrices = new Item.ItemPrices();
//            for (ItemPricesLineDTO i : itemDto.getItemPrices()) {
//                Item.ItemPrices.ItemPrice price = new Item.ItemPrices.ItemPrice();
//
//                price.setPriceList(i.getPriceList().longValue());
//                price.setPrice(i.getPrice());
//                price.setCurrency(i.getCurrency());
//
//                itemPrices.getItemPrice().add(price);
//            }
//
//            //item.setItemPrices(itemPrices);
//        }
//
//        Add add = new Add();
//        add.setItem(item);
//        try {
//            port.add(add, header);
//            log.log(Level.INFO, "Se creo el item {0}", itemDto.getItemCode());
//        } catch (Exception e) {
//            throw new ItemsServiceException(e.getMessage());
//        }
//    }
//
//    public Item getItemByID(String reference, ItemsServiceSoap port) throws ItemsServiceException {
//        log.log(Level.INFO, "Buscando item con referencia. {0}", reference);
//        if (sessionId == null) {
//            throw new ItemsServiceException("No se recibio un ID de sesion de B1WS valido. ");
//        }
//        try {
//            MsgHeader header = new MsgHeader();
//            header.setServiceName(ITEMS_SERVICE_WSDL_NAME);
//            header.setSessionID(sessionId);
//
//            ItemParams ip = new ItemParams();
//            ip.setItemCode(reference);
//            GetByParams gbp = new GetByParams();
//            gbp.setItemParams(ip);
//            return port.getByParams(gbp, header).getItem();
//        } catch (Exception e) {
//            throw new ItemsServiceException(e.getMessage());
//        }
//    }
//
//    public void updateItem(Item item, ItemsServiceSoap port) throws ItemsServiceException {
//        log.log(Level.INFO, "Actualizando item con referencia. {0}", item.getItemCode());
//        if (sessionId == null) {
//            throw new ItemsServiceException("No se recibio un ID de sesion de B1WS valido. ");
//        }
//        try {
//            MsgHeader header = new MsgHeader();
//            header.setServiceName(ITEMS_SERVICE_WSDL_NAME);
//            header.setSessionID(sessionId);
//
//            Update update = new Update();
//            update.setItem(item);
//            port.update(update, header);
//        } catch (Exception e) {
//            throw new ItemsServiceException(e.getMessage());
//        }
//    }
//}
