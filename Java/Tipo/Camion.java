
public class Camion implements Terrestre, Vehiculo{

	@Override
	public void encender() {
		System.out.println("Camion Encendido");
		
	}

	@Override
	public void avanzar() {
		System.out.println("Camion Avanzando");
		
	}

	@Override
	public void trasportarPasajeros() {
		System.out.println("Camion en Camino");		
	}

}
