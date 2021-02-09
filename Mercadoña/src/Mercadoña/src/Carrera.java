
import java.util.Scanner;



public class Carrera  {
	

	private String nombre;
	private int distancia;
	private Coche clasificacion[];
	private Coche vCoches[];
	
	
	
	

	public Carrera(String nombre, int distancia) {
		super();
		this.nombre = nombre;
		this.distancia = distancia;
		this.clasificacion = new Coche[10];
		this.vCoches = new Coche[10];
	}
	
	
	

	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getDistancia() {
		return distancia;
	}




	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}




	public Coche[] getvCoches() {
		return vCoches;
	}




	public void setvCoches(Coche[] vCoches) {
		this.vCoches = vCoches;
	}




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
		boolean psj  = false;
		String jugador;
		int dorsal;
		
		for (int i = 0; i < vCoches.length; i++) {
			if (vCoches[i] == null) {
				System.out.println("Escribe el nombre del competidor");
				nombre = leer.nextLine();
			do {
				System.out.println("Escribe el dorsal de este competidor");
				dorsal = leer.nextInt();
			} while (comprobarDorsal(dorsal));
			
			System.out.println("Es jugador(SI) O bot(NO)");
			jugador = leer.next();
			
			if(jugador.equalsIgnoreCase("SI")) {
				psj = true;
			}else {
				psj = false;
			}
			
			vCoches[i] = new Coche(nombre, dorsal, this.distancia, psj);
			break;
			
			}
		}
			
	}
	
	public void iniciarCarrera() {
		for (Coche coche : vCoches) {
			if(coche != null) {
				coche.setEstado("Arrancado");
			}
		}
	}
	
	public void clasificacion() {
		for (Coche coche : vCoches) {
			if (coche != null && coche.getEstado().equalsIgnoreCase("Terminado")) {
				System.out.println(coche);
				break;
			}
			
		}
	}
}
