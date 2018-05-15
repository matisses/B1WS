package co.matisses.b1ws.client.servicecalls;

import co.matisses.b1ws.client.B1WSServiceInfo;
import co.matisses.b1ws.dto.ServiceCallDTO;
import co.matisses.b1ws.servicecalls.Add;
import co.matisses.b1ws.servicecalls.AddResponse;
import co.matisses.b1ws.servicecalls.GetByParams;
import co.matisses.b1ws.servicecalls.GetByParamsResponse;
import co.matisses.b1ws.servicecalls.MsgHeader;
import co.matisses.b1ws.servicecalls.ServiceCall;
import co.matisses.b1ws.servicecalls.ServiceCallParams;
import co.matisses.b1ws.servicecalls.ServiceCallsService;
import co.matisses.b1ws.servicecalls.ServiceCallsServiceSoap;
import co.matisses.b1ws.servicecalls.Update;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dbotero
 */
public class ServiceCallsServiceConnector extends B1WSServiceInfo {

    private static final Logger log = Logger.getLogger(ServiceCallsServiceConnector.class.getSimpleName());
    private ServiceCallsService serviceCallsService = null;
    private String sessionId = null;

    public ServiceCallsServiceConnector(ServiceCallsService serviceCallsService, String sessionId) {
        super();
        this.serviceCallsService = serviceCallsService;
        this.sessionId = sessionId;
    }

    public Long createServiceCall(ServiceCallDTO dto) throws ServiceCallsServiceException {
        log.log(Level.INFO, "Creando llamada de servicio. {0}", dto.toString());
        if (sessionId == null) {
            throw new ServiceCallsServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }
        ServiceCallsServiceSoap port = serviceCallsService.getServiceCallsServiceSoap12();
        MsgHeader header = new MsgHeader();
        header.setServiceName(SERVICE_CALLS_SERVICE_WSDL_NAME);
        header.setSessionID(sessionId);

        ServiceCall serviceCall = new ServiceCall();
        serviceCall.setSeries(dto.getSeries());
        serviceCall.setAssigneeCode(dto.getAssigneeCode());
        serviceCall.setCallType(dto.getCallType());
        serviceCall.setCustomerCode(dto.getCardCode());
        serviceCall.setDescription(dto.getDescription());
        serviceCall.setItemCode(dto.getItemCode());
        serviceCall.setSubject(dto.getSubject());
        serviceCall.setPriority(dto.getPriority().getPriority());
        serviceCall.setOrigin(dto.getOrigin().getOrigin());
        serviceCall.setProblemType(dto.getProblemType().getType());
        serviceCall.setUNumFactura(dto.getInvoiceNumber());

        /* CAMPOS SIN USAR
        serviceCall.setAddressName(null);
        serviceCall.setAddressType(null);
        serviceCall.setAssignedDate(null);
        serviceCall.setAssignedTime(null);
        serviceCall.setAttachmentEntry(null);
        serviceCall.setBelongsToAQueue(null);
        serviceCall.setCity(null);
        serviceCall.setClosingDate(null);
        serviceCall.setClosingTime(null);
        serviceCall.setContactCode(null);
        serviceCall.setContractEndDate(null);
        serviceCall.setContractID(null);
        serviceCall.setCountry(null);
        serviceCall.setCreationDate(null);
        serviceCall.setCreationTime(null);
        serviceCall.setCustomerName(null);
        serviceCall.setCustomerRefNo(null);
        serviceCall.setDisplayInCalendar(null);
        serviceCall.setDocNum(null);
        serviceCall.setDuration(null);
        serviceCall.setDurationType(null);
        serviceCall.setEndDueDate(null);
        serviceCall.setEndTime(null);
        serviceCall.setEntitledforService(null);
        serviceCall.setHandWritten(null);
        serviceCall.setInternalSerialNum(null);
        serviceCall.setItemDescription(null);
        serviceCall.setItemGroupCode(null);
        serviceCall.setLocation(null);
        serviceCall.setManufacturerSerialNum(null);
        serviceCall.setPeriodIndicator(null);
        serviceCall.setProblemSubType(null);
        serviceCall.setQueue(null);
        serviceCall.setReminder(null);
        serviceCall.setReminderPeriod(null);
        serviceCall.setReminderType(null);
        serviceCall.setResolution(null);
        serviceCall.setResolutionDate(null);
        serviceCall.setResolutionOnDate(null);
        serviceCall.setResolutionOnTime(null);
        serviceCall.setResolutionTime(null);
        serviceCall.setResponder(null);
        serviceCall.setResponseAssignee(null);
        serviceCall.setResponseByDate(null);
        serviceCall.setResponseByTime(null);
        serviceCall.setResponseOnDate(null);
        serviceCall.setResponseOnTime(null);
        serviceCall.setRoom(null);
        serviceCall.setServiceCallActivities(null);
        serviceCall.setServiceCallID(null);
        serviceCall.setServiceCallInventoryExpenses(null);
        serviceCall.setServiceCallSolutions(null);
        serviceCall.setStartDate(null);
        serviceCall.setStatus(null);
        serviceCall.setStreet(null);
        serviceCall.setTechnicianCode(null);
        serviceCall.setUCateGa(null);
        serviceCall.setUCausa(null);
        serviceCall.setUComentSoporte(null);
        serviceCall.setUCrearSoporte(null);
        serviceCall.setUMaterial(null);
        serviceCall.setUNWRPO(null);
        serviceCall.setUNWRRMA(null);
        serviceCall.setUNWRRMAType(null);
        serviceCall.setUProExt(null);
        serviceCall.setUProblemaMaterial(null);
        serviceCall.setUTipoServ(null);
        serviceCall.setUpdatedTime(null); */
        Add add = new Add();
        add.setServiceCall(serviceCall);
        try {
            AddResponse resp = port.add(add, header);
            Long serviceCallId = resp.getServiceCallParams().getServiceCallID();
            log.log(Level.INFO, "Se creo la solicitud de garantia #{0}", serviceCallId);
            return serviceCallId;
        } catch (Exception e) {
            log.log(Level.SEVERE, "Ocurrio un error al crear la llamada de servicio. ", e);
            throw new ServiceCallsServiceException(e.getMessage());
        }
    }

    public void addCommentToServiceCall(Long callId, String comment) throws ServiceCallsServiceException {
        log.log(Level.INFO, "Agregando comentario {0} a llamada {1}", new Object[]{comment, callId});
        if (sessionId == null) {
            throw new ServiceCallsServiceException("No se recibio un ID de sesion de B1WS valido. ");
        }
        ServiceCallsServiceSoap port = serviceCallsService.getServiceCallsServiceSoap12();

        MsgHeader header = new MsgHeader();
        header.setServiceName(SERVICE_CALLS_SERVICE_WSDL_NAME);
        header.setSessionID(sessionId);

        ServiceCallParams callParams = new ServiceCallParams();
        callParams.setServiceCallID(callId);
        GetByParams params = new GetByParams();
        params.setServiceCallParams(callParams);
        try {
            GetByParamsResponse response = port.getByParams(params, header);
            ServiceCall serviceCall = response.getServiceCall();

            if (serviceCall.getDescription().length() + comment.length() > 1000) {
                throw new ServiceCallsServiceException("Los nuevos comentarios hacen que se supere el maximo numero de caracteres permitidos " + serviceCall.getDescription().length() + comment.length() + "/1000");
            }
            serviceCall.setDescription(serviceCall.getDescription().concat("\n").concat(comment));
            Update update = new Update();
            update.setServiceCall(serviceCall);
            try {
                port.update(update, header);
            } catch (Exception e) {
                log.log(Level.SEVERE, "Ocurrio un error al actualizar la llamada de servicio. ", e);
                throw new ServiceCallsServiceException(e.getMessage());
            }
        } catch (Exception e) {
            log.log(Level.SEVERE, "Ocurrio un error al consultar la llamada de servicio. ", e);
            throw new ServiceCallsServiceException(e.getMessage());
        }
    }
}
