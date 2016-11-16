package it.alfasoft.webService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import it.alfasoft.dao.FatturaDAO;
import it.alfasoft.model.Fattura;

@WebService
@SOAPBinding(style=Style.RPC)
public class ServizioFattura {
	
	private FatturaDAO fDAO;
	
	public ServizioFattura() {
		fDAO = new FatturaDAO();
	}

	@WebMethod
	public Fattura getFatturaConCodiceCliente(String codice){
		return fDAO.getFatturaConCodiceCliente(codice);
	}
	
	@WebMethod
	public Fattura[] getTutteFatture(){
		return fDAO.getTutteFatture();
	}

}
