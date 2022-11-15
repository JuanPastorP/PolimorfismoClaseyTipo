
public class Avion implements Aereo, Vehiculo{

	@Override
	public void volar() {
		System.out.println("Avion Volando");
		
	}

	@Override
	public void encender() {
		System.out.println("Avion Encendido");
		
	}

	@Override
	public void trasportarPasajeros() {
		System.out.println("Avion en Camino");
		
	}

}
