
package co.matisses.b1ws.journalentries;

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
@WebService(name = "JournalEntriesServiceSoap", targetNamespace = "JournalEntriesService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface JournalEntriesServiceSoap {


    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.journalentries.AddResponse
     */
    @WebMethod(operationName = "Add", action = "JournalEntriesService/Add")
    @WebResult(name = "AddResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public AddResponse add(
        @WebParam(name = "Add", targetNamespace = "JournalEntriesService", partName = "parameters")
        Add parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.journalentries.GetByParamsResponse
     */
    @WebMethod(operationName = "GetByParams", action = "JournalEntriesService/GetByParams")
    @WebResult(name = "GetByParamsResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public GetByParamsResponse getByParams(
        @WebParam(name = "GetByParams", targetNamespace = "JournalEntriesService", partName = "parameters")
        GetByParams parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.journalentries.UpdateResponse
     */
    @WebMethod(operationName = "Update", action = "JournalEntriesService/Update")
    @WebResult(name = "UpdateResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public UpdateResponse update(
        @WebParam(name = "Update", targetNamespace = "JournalEntriesService", partName = "parameters")
        Update parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.journalentries.CancelResponse
     */
    @WebMethod(operationName = "Cancel", action = "JournalEntriesService/Cancel")
    @WebResult(name = "CancelResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public CancelResponse cancel(
        @WebParam(name = "Cancel", targetNamespace = "JournalEntriesService", partName = "parameters")
        Cancel parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

}
