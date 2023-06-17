package aplicacion;

import java.util.ArrayList;

public class GestionCentrales {
	
	private ArrayList<Central> centrales;
	
	public GestionCentrales() {
		centrales = new ArrayList<>();
	}
	
	public void addCentral(Central central) throws Exception{
		if( ! existeCentral(central.getNombre())) {
			centrales.add(central);
		}else {
			throw new Exception("Ya existe la central");
		}
	}
	
	private boolean existeCentral(String nombre) {
		for(Central c : centrales) {
			if( c.getNombre().equalsIgnoreCase(nombre)  ) {
				return true;
			}
		}
		return false;
	}
	
	public double getMaximoProduccion() throws Exception{
		
		if( centrales.isEmpty()) {
			throw new Exception("No hay centrales");
		}else {
			double maximo = 0;
			for(Central c : centrales) {
				if( c.getProduccion() > maximo ) {
					maximo = c.getProduccion();
				}
			}
			return maximo;
		}
	}
}
