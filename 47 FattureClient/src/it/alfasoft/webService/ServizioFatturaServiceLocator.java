/**
 * ServizioFatturaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.alfasoft.webService;

public class ServizioFatturaServiceLocator extends org.apache.axis.client.Service implements it.alfasoft.webService.ServizioFatturaService {

    public ServizioFatturaServiceLocator() {
    }


    public ServizioFatturaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServizioFatturaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServizioFattura
    private java.lang.String ServizioFattura_address = "http://localhost:8085/WebServiceProject/services/ServizioFattura";

    public java.lang.String getServizioFatturaAddress() {
        return ServizioFattura_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServizioFatturaWSDDServiceName = "ServizioFattura";

    public java.lang.String getServizioFatturaWSDDServiceName() {
        return ServizioFatturaWSDDServiceName;
    }

    public void setServizioFatturaWSDDServiceName(java.lang.String name) {
        ServizioFatturaWSDDServiceName = name;
    }

    public it.alfasoft.webService.ServizioFattura getServizioFattura() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServizioFattura_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServizioFattura(endpoint);
    }

    public it.alfasoft.webService.ServizioFattura getServizioFattura(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.alfasoft.webService.ServizioFatturaSoapBindingStub _stub = new it.alfasoft.webService.ServizioFatturaSoapBindingStub(portAddress, this);
            _stub.setPortName(getServizioFatturaWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServizioFatturaEndpointAddress(java.lang.String address) {
        ServizioFattura_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.alfasoft.webService.ServizioFattura.class.isAssignableFrom(serviceEndpointInterface)) {
                it.alfasoft.webService.ServizioFatturaSoapBindingStub _stub = new it.alfasoft.webService.ServizioFatturaSoapBindingStub(new java.net.URL(ServizioFattura_address), this);
                _stub.setPortName(getServizioFatturaWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ServizioFattura".equals(inputPortName)) {
            return getServizioFattura();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webService.alfasoft.it", "ServizioFatturaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webService.alfasoft.it", "ServizioFattura"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServizioFattura".equals(portName)) {
            setServizioFatturaEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
