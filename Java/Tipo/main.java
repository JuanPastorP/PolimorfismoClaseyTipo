
public class main {
	public static void main (String[] args) {
		
		Terrestre VehiculosTerrestres[] = new Terrestre[2];
		Aereo VehiculosAereos[] = new Aereo[2];
		Vehiculo Vehiculos[] = new Vehiculo[4];
		
		VehiculosTerrestres[0] = new Camion();
		VehiculosTerrestres[1] = new Carro();
		VehiculosAereos[0] = new Avion();
		VehiculosAereos[1] = new Helicoptero();
		
		Vehiculos[0] = new Camion();
		Vehiculos[1] = new Carro();
		Vehiculos[0] = new Avion();
		Vehiculos[1] = new Helicoptero();
		
		for (int i = 0; i < VehiculosTerrestres.length; i++) {
			VehiculosTerrestres[i].encender();
		}
		
		for (int i = 0; i < VehiculosAereos.length; i++) {
			VehiculosAereos[i].encender();
		}
		
		for (int i = 0; i < Vehiculos.length; i++) {
			Vehiculos[i].trasportarPasajeros();
		}
		
		for (int i = 0; i < Vehiculos.length; i++) {
			Vehiculos[i].encender();
		}
	}
}
