
public class CasaCampo extends Casa {
	
	private int metrosPatio;

	public CasaCampo(String ubicacion, int metrosCuadrados, int pisos, String calle, int metrosPatio) {
		super(ubicacion, metrosCuadrados, pisos, calle);
		this.metrosPatio = metrosPatio;

	}
	
	public int getMetrosPatio() {
		return metrosPatio;
	}


	
	public String toString() {
		return "Ubicacion: " + super.getUbicacion() + "\nMetros: " + super.getMetrosCuadrados() + "\nCalle: " + super.getCalle() + "\nMetrosPatio: " + metrosPatio;
	}
}
