package CarreraCoche;

public class Carrera {

	private String nombre;
	private int distancia;
	private Coche vCoches[];

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

		
	}
}
