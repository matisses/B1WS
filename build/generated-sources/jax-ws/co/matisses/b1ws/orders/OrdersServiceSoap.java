
package co.matisses.b1ws.orders;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OrdersServiceSoap", targetNamespace = "OrdersService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OrdersServiceSoap {


    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.orders.GetByParamsResponse
     */
    @WebMethod(operationName = "GetByParams", action = "OrdersService/GetByParams")
    @WebResult(name = "GetByParamsResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public GetByParamsResponse getByParams(
        @WebParam(name = "GetByParams", targetNamespace = "OrdersService", partName = "parameters")
        GetByParams parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.orders.AddResponse
     */
    @WebMethod(operationName = "Add", action = "OrdersService/Add")
    @WebResult(name = "AddResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public AddResponse add(
        @WebParam(name = "Add", targetNamespace = "OrdersService", partName = "parameters")
        Add parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.orders.UpdateResponse
     */
    @WebMethod(operationName = "Update", action = "OrdersService/Update")
    @WebResult(name = "UpdateResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public UpdateResponse update(
        @WebParam(name = "Update", targetNamespace = "OrdersService", partName = "parameters")
        Update parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.orders.RemoveResponse
     */
    @WebMethod(operationName = "Remove", action = "OrdersService/Remove")
    @WebResult(name = "RemoveResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public RemoveResponse remove(
        @WebParam(name = "Remove", targetNamespace = "OrdersService", partName = "parameters")
        Remove parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.orders.CloseResponse
     */
    @WebMethod(operationName = "Close", action = "OrdersService/Close")
    @WebResult(name = "CloseResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public CloseResponse close(
        @WebParam(name = "Close", targetNamespace = "OrdersService", partName = "parameters")
        Close parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.orders.CancelResponse
     */
    @WebMethod(operationName = "Cancel", action = "OrdersService/Cancel")
    @WebResult(name = "CancelResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public CancelResponse cancel(
        @WebParam(name = "Cancel", targetNamespace = "OrdersService", partName = "parameters")
        Cancel parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.orders.ReopenResponse
     */
    @WebMethod(operationName = "Reopen", action = "OrdersService/Reopen")
    @WebResult(name = "ReopenResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public ReopenResponse reopen(
        @WebParam(name = "Reopen", targetNamespace = "OrdersService", partName = "parameters")
        Reopen parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.orders.SaveDraftToDocumentResponse
     */
    @WebMethod(operationName = "SaveDraftToDocument", action = "OrdersService/SaveDraftToDocument")
    @WebResult(name = "SaveDraftToDocumentResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public SaveDraftToDocumentResponse saveDraftToDocument(
        @WebParam(name = "SaveDraftToDocument", targetNamespace = "OrdersService", partName = "parameters")
        SaveDraftToDocument parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.orders.GetApprovalTemplatesResponse
     */
    @WebMethod(operationName = "GetApprovalTemplates", action = "OrdersService/GetApprovalTemplates")
    @WebResult(name = "GetApprovalTemplatesResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public GetApprovalTemplatesResponse getApprovalTemplates(
        @WebParam(name = "GetApprovalTemplates", targetNamespace = "OrdersService", partName = "parameters")
        GetApprovalTemplates parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.orders.UpdateFromXMLResponse
     */
    @WebMethod(operationName = "UpdateFromXML", action = "OrdersService/UpdateFromXML")
    @WebResult(name = "UpdateFromXMLResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public UpdateFromXMLResponse updateFromXML(
        @WebParam(name = "UpdateFromXML", targetNamespace = "OrdersService", partName = "parameters")
        UpdateFromXML parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.orders.PreviewResponse
     */
    @WebMethod(operationName = "Preview", action = "OrdersService/Preview")
    @WebResult(name = "PreviewResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public PreviewResponse preview(
        @WebParam(name = "Preview", targetNamespace = "OrdersService", partName = "parameters")
        Preview parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.orders.HandleApprovalRequestResponse
     */
    @WebMethod(operationName = "HandleApprovalRequest", action = "OrdersService/HandleApprovalRequest")
    @WebResult(name = "HandleApprovalRequestResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public HandleApprovalRequestResponse handleApprovalRequest(
        @WebParam(name = "HandleApprovalRequest", targetNamespace = "OrdersService", partName = "parameters")
        HandleApprovalRequest parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.orders.CreateCancellationDocumentResponse
     */
    @WebMethod(operationName = "CreateCancellationDocument", action = "OrdersService/CreateCancellationDocument")
    @WebResult(name = "CreateCancellationDocumentResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public CreateCancellationDocumentResponse createCancellationDocument(
        @WebParam(name = "CreateCancellationDocument", targetNamespace = "OrdersService", partName = "parameters")
        CreateCancellationDocument parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

}
