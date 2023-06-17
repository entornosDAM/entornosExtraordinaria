package aplicacion;

import java.util.ArrayList;

public class GestionCentrales {
	
	private ArrayList<Central> centrales;
	
	public GestionCentrales() {
		centrales = new ArrayList<>();
	}
	
	public void addCentral(String nombre, double produccion) throws Exception{
		if( ! existeCentral(nombre)) {
			centrales.add(new Central(nombre, produccion));
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
