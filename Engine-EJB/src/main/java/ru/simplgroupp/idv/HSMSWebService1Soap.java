
package ru.simplgroupp.idv;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "HSMSWebService1Soap", targetNamespace = "http://experian.com/bureau/hosted/nbsm")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HSMSWebService1Soap {


    /**
     * 
     * @param request
     * @return
     *     returns ru.simplgroupp.idv.ResponseRoot
     */
    @WebMethod(operationName = "HSMSProcess", action = "http://experian.com/bureau/hosted/nbsm/HSMSProcess")
    @WebResult(name = "Response", targetNamespace = "http://experian.com/bureau/hosted/nbsm")
    @RequestWrapper(localName = "HSMSProcess", targetNamespace = "http://experian.com/bureau/hosted/nbsm", className = "ru.simplgroupp.idv.HSMSProcess")
    @ResponseWrapper(localName = "HSMSProcessResponse", targetNamespace = "http://experian.com/bureau/hosted/nbsm", className = "ru.simplgroupp.idv.HSMSProcessResponse")
    public ResponseRoot hsmsProcess(
        @WebParam(name = "Request", targetNamespace = "http://experian.com/bureau/hosted/nbsm")
        RequestRoot request);

    /**
     * 
     * @param request
     * @return
     *     returns ru.simplgroupp.idv.IDVResponseRoot
     */
    @WebMethod(operationName = "IDVProcess", action = "http://experian.com/bureau/hosted/nbsm/IDVProcess")
    @WebResult(name = "Response", targetNamespace = "http://experian.com/bureau/hosted/nbsm")
    @RequestWrapper(localName = "IDVProcess", targetNamespace = "http://experian.com/bureau/hosted/nbsm", className = "ru.simplgroupp.idv.IDVProcess")
    @ResponseWrapper(localName = "IDVProcessResponse", targetNamespace = "http://experian.com/bureau/hosted/nbsm", className = "ru.simplgroupp.idv.IDVProcessResponse")
    public IDVResponseRoot idvProcess(
        @WebParam(name = "Request", targetNamespace = "http://experian.com/bureau/hosted/nbsm")
        IDVRequestRoot request);

}