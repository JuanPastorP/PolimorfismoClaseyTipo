
public class main {
	public static void main (String[] args) {
		
		Vivienda viviendas[] = new Vivienda[4];
		
		viviendas[0] = new Vivienda("LaAlameda", 30, 2);
		viviendas[1] = new Departamento("LasCasonas", 20, 5, 3);
		viviendas[2] = new Casa("LasFlores", 40, 2, "CalleMagnolia");
		viviendas[3] = new CasaCampo("LasTorres", 40, 2, "CalleNueva", 50);
		
		for (int i = 0; i < viviendas.length; i++) {
			System.out.println(viviendas[i] + "\n");
		}
		
	}
}
