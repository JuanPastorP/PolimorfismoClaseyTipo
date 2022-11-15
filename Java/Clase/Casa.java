
public class Casa extends Vivienda {
	
	private String calle;

	public Casa(String ubicacion, int metrosCuadrados, int pisos, String calle) {
		super(ubicacion, metrosCuadrados, pisos);
		this.calle = calle;

	}
	
	public String getCalle() {
		return calle;
	}


	
	public String toString() {
		return "Ubicacion: " + super.getUbicacion() + "\nMetros: " + super.getMetrosCuadrados() + "\nCalle: " + calle;
	}
}
