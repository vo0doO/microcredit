
package ru.simplgroupp.hunter.onlinematching.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MatchingSoap", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices",
        wsdlLocation = "https://nh-test.rb-ei.com/OnlineMatchingService/OnlineMatching.asmx?wsdl")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MatchingSoap {


    /**
     * 
     * @param controlXml
     * @param username
     * @param batchXml
     * @param password
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Match", action = "http://www.mclsoftware.co.uk/HunterII/WebServices/Match")
    @WebResult(name = "MatchResult", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices")
    @RequestWrapper(localName = "Match", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices", className = "ru.simplgroupp.hunter.onlinematching.wsdl.Match")
    @ResponseWrapper(localName = "MatchResponse", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices", className = "ru.simplgroupp.hunter.onlinematching.wsdl.MatchResponse")
    public String match(
        @WebParam(name = "controlXml", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices")
        String controlXml,
        @WebParam(name = "batchXml", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices")
        String batchXml,
        @WebParam(name = "username", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices")
        String username,
        @WebParam(name = "password", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices")
        String password);

    /**
     * 
     * @param username
     * @param password
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ClearCache", action = "http://www.mclsoftware.co.uk/HunterII/WebServices/ClearCache")
    @WebResult(name = "ClearCacheResult", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices")
    @RequestWrapper(localName = "ClearCache", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices", className = "ru.simplgroupp.hunter.onlinematching.wsdl.ClearCache")
    @ResponseWrapper(localName = "ClearCacheResponse", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices", className = "ru.simplgroupp.hunter.onlinematching.wsdl.ClearCacheResponse")
    public String clearCache(
        @WebParam(name = "username", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices")
        String username,
        @WebParam(name = "password", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices")
        String password);

    /**
     * 
     * @param username
     * @param customers
     * @param password
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "PrePopulateCache", action = "http://www.mclsoftware.co.uk/HunterII/WebServices/PrePopulateCache")
    @WebResult(name = "PrePopulateCacheResult", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices")
    @RequestWrapper(localName = "PrePopulateCache", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices", className = "ru.simplgroupp.hunter.onlinematching.wsdl.PrePopulateCache")
    @ResponseWrapper(localName = "PrePopulateCacheResponse", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices", className = "ru.simplgroupp.hunter.onlinematching.wsdl.PrePopulateCacheResponse")
    public String prePopulateCache(
        @WebParam(name = "username", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices")
        String username,
        @WebParam(name = "password", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices")
        String password,
        @WebParam(name = "customers", targetNamespace = "http://www.mclsoftware.co.uk/HunterII/WebServices")
        String customers);

}
