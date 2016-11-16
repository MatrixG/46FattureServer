/**
 * ServizioFattura.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.alfasoft.webService;

public interface ServizioFattura extends java.rmi.Remote {
    public it.alfasoft.model.Fattura[] getTutteFatture() throws java.rmi.RemoteException;
    public it.alfasoft.model.Fattura getFatturaConCodiceCliente(java.lang.String codice) throws java.rmi.RemoteException;
}
