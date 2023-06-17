package aplicacion;

public class Central {
	
	private String nombre;
	private double produccion;
	
	public Central(String nombre, double produccion) {
		super();
		this.nombre = nombre;
		this.produccion = produccion;
	}

	public String getNombre() {
		return nombre;
	}

	public double getProduccion() {
		return produccion;
	}
}
