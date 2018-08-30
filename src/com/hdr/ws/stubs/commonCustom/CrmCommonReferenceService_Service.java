
package com.hdr.ws.stubs.commonCustom;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CrmCommonReferenceService", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/custextn/extnService/", wsdlLocation = "https://caye-test.crm.us2.oraclecloud.com/foundationCustExtn/CrmCommonReferenceService?WSDL")
public class CrmCommonReferenceService_Service
    extends Service
{

    private final static URL CRMCOMMONREFERENCESERVICE_WSDL_LOCATION;
    private final static WebServiceException CRMCOMMONREFERENCESERVICE_EXCEPTION;
    private final static QName CRMCOMMONREFERENCESERVICE_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/custextn/extnService/", "CrmCommonReferenceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://caye-test.crm.us2.oraclecloud.com/foundationCustExtn/CrmCommonReferenceService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CRMCOMMONREFERENCESERVICE_WSDL_LOCATION = url;
        CRMCOMMONREFERENCESERVICE_EXCEPTION = e;
    }

    public CrmCommonReferenceService_Service() {
        super(__getWsdlLocation(), CRMCOMMONREFERENCESERVICE_QNAME);
    }

    public CrmCommonReferenceService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CRMCOMMONREFERENCESERVICE_QNAME, features);
    }

    public CrmCommonReferenceService_Service(URL wsdlLocation) {
        super(wsdlLocation, CRMCOMMONREFERENCESERVICE_QNAME);
    }

    public CrmCommonReferenceService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CRMCOMMONREFERENCESERVICE_QNAME, features);
    }

    public CrmCommonReferenceService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CrmCommonReferenceService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CrmCommonReferenceService
     */
    @WebEndpoint(name = "CrmCommonReferenceServiceSoapHttpPort")
    public CrmCommonReferenceService getCrmCommonReferenceServiceSoapHttpPort() {
        return super.getPort(new QName("http://xmlns.oracle.com/apps/cdm/foundation/custextn/extnService/", "CrmCommonReferenceServiceSoapHttpPort"), CrmCommonReferenceService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CrmCommonReferenceService
     */
    @WebEndpoint(name = "CrmCommonReferenceServiceSoapHttpPort")
    public CrmCommonReferenceService getCrmCommonReferenceServiceSoapHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/apps/cdm/foundation/custextn/extnService/", "CrmCommonReferenceServiceSoapHttpPort"), CrmCommonReferenceService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CRMCOMMONREFERENCESERVICE_EXCEPTION!= null) {
            throw CRMCOMMONREFERENCESERVICE_EXCEPTION;
        }
        return CRMCOMMONREFERENCESERVICE_WSDL_LOCATION;
    }

}