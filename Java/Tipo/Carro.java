
public class Carro implements Terrestre, Vehiculo{
		
	@Override
	public void encender() {
		System.out.println("Auto Encendido");
	}

	@Override
	public void avanzar() {
		System.out.println("Auto Avanzando");
		
	}

	@Override
	public void trasportarPasajeros() {
		System.out.println("Carro en Camino");
		
	}

}
