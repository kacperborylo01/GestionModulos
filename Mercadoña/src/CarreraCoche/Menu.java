package CarreraCoche;

import java.util.Scanner;

public class Menu {

public static int mostrarMenu(){
		
		Scanner leer = new Scanner(System.in);
		
		int opc = 0;
		
		do {
			System.out.println("------Carrera de los CARROMATOS------");
			System.out.println("Pulsa 1 para acelerar el carromato");
			System.out.println("Pulsa 2 para frenar el carromato");
			System.out.println("Pulsa 3 para rearrancar para el carromato y seguir con la carrera");
			opc = leer.nextInt();			
		} while ((opc < 1  || opc > 3));
		return opc;
		
	}
	
	

	public static int carrerica() {
	
	int opc = 0;
	
	Scanner leer = new Scanner(System.in);
	
	do {
		System.out.println("--Gestionar CARROMATOS--");
		System.out.println("Pulsa 1 para comenzar carrera");
		System.out.println("Pulsa 2 para añadir corredores de carromatos");
		System.out.println("Pulsa 3 y escribe el nombre de la Carrera.");
		System.out.println("Pulsa 4 para salir.");
		opc = leer.nextInt();

	} while (opc < 1 || opc > 4);

	return opc;
}
		
	
}
