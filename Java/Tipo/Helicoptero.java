
public class Helicoptero implements Aereo, Vehiculo{

	@Override
	public void volar() {
		System.out.println("Helicoptero Volando");
		
	}

	@Override
	public void encender() {
		System.out.println("Helicoptero Encendido");
		
	}

	@Override
	public void trasportarPasajeros() {
		System.out.println("Helicoptero en Camino");
		
	}

}
