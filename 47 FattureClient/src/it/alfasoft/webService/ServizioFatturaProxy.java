package it.alfasoft.webService;

public class ServizioFatturaProxy implements it.alfasoft.webService.ServizioFattura {
  private String _endpoint = null;
  private it.alfasoft.webService.ServizioFattura servizioFattura = null;
  
  public ServizioFatturaProxy() {
    _initServizioFatturaProxy();
  }
  
  public ServizioFatturaProxy(String endpoint) {
    _endpoint = endpoint;
    _initServizioFatturaProxy();
  }
  
  private void _initServizioFatturaProxy() {
    try {
      servizioFattura = (new it.alfasoft.webService.ServizioFatturaServiceLocator()).getServizioFattura();
      if (servizioFattura != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servizioFattura)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servizioFattura)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servizioFattura != null)
      ((javax.xml.rpc.Stub)servizioFattura)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.alfasoft.webService.ServizioFattura getServizioFattura() {
    if (servizioFattura == null)
      _initServizioFatturaProxy();
    return servizioFattura;
  }
  
  public it.alfasoft.model.Fattura[] getTutteFatture() throws java.rmi.RemoteException{
    if (servizioFattura == null)
      _initServizioFatturaProxy();
    return servizioFattura.getTutteFatture();
  }
  
  public it.alfasoft.model.Fattura getFatturaConCodiceCliente(java.lang.String codice) throws java.rmi.RemoteException{
    if (servizioFattura == null)
      _initServizioFatturaProxy();
    return servizioFattura.getFatturaConCodiceCliente(codice);
  }
  
  
}