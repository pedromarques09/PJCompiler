package datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class PjSymbolTable {
	
	private HashMap<String, PjSymbol> map;
	
	public PjSymbolTable() {
		map = new HashMap<String, PjSymbol>();
		
	}
	
	public void add(PjSymbol symbol) {
		map.put(symbol.getName(), symbol);
	}
	
	public boolean exists(String symbolName) {
		return map.get(symbolName) != null;
	}
	
	public PjSymbol get(String symbolName) {
		return map.get(symbolName);
	}
	
	public ArrayList<PjSymbol> getAll(){
		ArrayList<PjSymbol> lista = new ArrayList<PjSymbol>();
		for (PjSymbol simbolo : map.values()) {
			lista.add(simbolo);
		}
		return lista;
	}

	
	
}
