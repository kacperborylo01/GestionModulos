
import java.util.Scanner;

public class Menu {

public static int mostrarMenu(){
		
		Scanner leer = new Scanner(System.in);
		
		int opccarrera = 0;
		
		do {
			System.out.println("------Carrera de los CARROMATOS------");
			System.out.println("Pulsa 1 para acelerar el carromato");
			System.out.println("Pulsa 2 para frenar el carromato");
			System.out.println("Pulsa 3 para rearrancar para el carromato y seguir con la carrera");
			opccarrera = leer.nextInt();			
		} while ((opccarrera < 1  || opccarrera > 3));
		return opccarrera;
		
	}
	
	

	public static int carrerica() {
	
	int opc = 0;
	
	Scanner leer = new Scanner(System.in);
	
	do {
		System.out.println("--Gestionar CARROMATOS--");
		System.out.println("Pulsa 1 para comenzar carrera");
		System.out.println("Pulsa 2 y escribe el nombre y la distancia de la Carrera.");
		System.out.println("Pulsa 3 para añadir corredores de carromatos(Primero debes crear la CARRERA ----> Pulsa 2).");
		System.out.println("Pulsa 4 para salir.");
		opc = leer.nextInt();

	} while (opc < 1 || opc > 4);

	return opc;
}
		
	
}
