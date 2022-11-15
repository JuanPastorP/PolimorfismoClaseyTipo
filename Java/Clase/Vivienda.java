
public class Vivienda {
	private String ubicacion;
	private int metrosCuadrados;
	private int pisos;
	
	public Vivienda (String ubicacion, int metrosCuadrados, int pisos) {
		this.ubicacion = ubicacion;
		this.metrosCuadrados = metrosCuadrados;
		this.pisos = pisos;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}
	
	public int getPisos() {
		return pisos;
	}
	
	public String toString() {
		return "Ubicacion: " + ubicacion + "\nMetros: " + metrosCuadrados + "\nPisos: " + pisos;
	}
	
}
