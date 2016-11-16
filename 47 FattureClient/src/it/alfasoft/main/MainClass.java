package it.alfasoft.main;

import java.rmi.RemoteException;
import java.util.Arrays;

import javax.xml.rpc.ServiceException;

import it.alfasoft.model.Fattura;
import it.alfasoft.webService.ServizioFattura;
import it.alfasoft.webService.ServizioFatturaServiceLocator;

public class MainClass {

	public static void main(String[] args) {
		ServizioFatturaServiceLocator locator = new ServizioFatturaServiceLocator();
		
		try {
			ServizioFattura servizio = locator.getServizioFattura();
			
			Fattura f = servizio.getFatturaConCodiceCliente("cod1");
			System.out.println(f.getCodiceCliente() + " " + f.getImporto() + " " + f.getRagioneSociale());
		
			Fattura[] arrayf = servizio.getTutteFatture();
			
			for (Fattura ftr : Arrays.asList(arrayf)){
				System.out.println(ftr.getCodiceCliente() + " " + ftr.getImporto() + " " + ftr.getRagioneSociale());
			}
		} catch (ServiceException e) {
			
			
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
