package it.alfasoft.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import it.alfasoft.model.Fattura;

public class FatturaDAO {

	private Map<String, Fattura> fatture;

	public FatturaDAO() {
		
		fatture = new TreeMap<String, Fattura>();
		Fattura f = new Fattura("cod1", 1000, "PincoPallino Snc");
		fatture.put(f.getCodiceCliente(), f);
		f = new Fattura("cod2", 2000, "Bastian Contrario");
		fatture.put(f.getCodiceCliente(), f);
		f = new Fattura("cod3", 300, "Savoiardo & Co.");
		fatture.put(f.getCodiceCliente(), f);
		f = new Fattura("cod4", 123, "Aiutooooooooooooo");
		fatture.put(f.getCodiceCliente(), f);
		f = new Fattura("cod5", 455, "Sei Cinque Otto");
		fatture.put(f.getCodiceCliente(), f);
	}
	
	public Map<String, Fattura> getFatture() {
		return fatture;
	}

	public void setFatture(Map<String, Fattura> fatture) {
		this.fatture = fatture;
	}

	public Fattura[] getTutteFatture() {
		List<Fattura> out = new ArrayList<Fattura>(fatture.values());
		Fattura[] outFatture = (Fattura[]) out.toArray();
		return outFatture;
	}

	public Fattura getFatturaConCodiceCliente(String id) {
		return fatture.get(id);
	}

	public void addFattura(String id, Fattura fattura) {
		fatture.put(id, fattura);
	}

}
