package CarreraCoche;


import java.util.Scanner;

public class Carrera {

	protected static String nombre;
	private int distancia;
	protected int dorsal;
	protected static Coche vCoches[];

	// Devuelvo true si todos los coches se encuentran en el estado de terminado
	public boolean carreraTerminada() {
		for (Coche coche : vCoches) {
			if (coche!= null && coche.getEstado().equalsIgnoreCase("Terminado")) {
				return true;
				
			}
			
		}
		return false;
		
		
	}

	//Devuelvo true si se repite dorsal
	public boolean comprobarDorsal(int dorsal) {
		for (Coche coche : vCoches) {
			if(coche!=null && coche.getDorsal() == dorsal) {
				return true;
			}
		}
		return false;
	}	

	public void anadirCoche() {
		Scanner leer = new Scanner(System.in);
		for (int i = 0; i < vCoches.length; i++) {
			if (vCoches[i] == null) {
				System.out.println("Escribe el nombre del competidor");
				nombre = leer.nextLine();
			do {
				System.out.println("Escribe el dorsal de este competidor");
				dorsal = leer.nextInt();
			} while (comprobarDorsal(dorsal) == true);
				
			vCoches[i] = new Coche(nombre, i);
			}
			
		}
			
	}
}
