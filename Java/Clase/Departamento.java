
public class Departamento extends Vivienda {
	
	private int numeroPuerta;
	private int numeroPiso;

	public Departamento(String ubicacion, int metrosCuadrados, int numeroPuerta, int numeroPiso) {
		super(ubicacion, metrosCuadrados, 1);
		this.numeroPuerta = numeroPuerta;
		this.numeroPiso = numeroPiso;

	}
	
	public int getNumeroPuerta() {
		return numeroPuerta;
	}

	public int getNumeroPiso() {
		return numeroPiso;
	}
	
	public String toString() {
		return "Ubicacion: " + super.getUbicacion() + "\nMetros: " + super.getMetrosCuadrados() + "\nNumeroPiso: " + numeroPiso + "\nNumeroPuerta: " + numeroPuerta;
	}
}
