package CarreraCoche;

import java.util.Scanner;

public class Main {
	
	public static int mostrarMenu(){
		
		Scanner leer = new Scanner(System.in);
		
		int opc = 0;
		
		do {
			System.out.println("Pulsa 1 para arrancar el carromato");
			System.out.println("Pulsa 2 para acelerar el carromato");
			System.out.println("Pulsa 3 para frenar el carromato");
			System.out.println("Pulsa 4 para rearrancar para el carromato y seguir con la carrera");
			opc = leer.nextInt();			
		} while ((opc < 1  || opc > 4));
		return opc;
		
	}
	
	public static int menuCoches() {
		Scanner leer = new Scanner(System.in);
		
		int opccoche = 0;
		do {
			System.out.println("Pulsa 1 para seleccionar modo de juego");
			System.out.println("Pulsa 2 para aniadir un nuevo competidor");
			
		} while ((opccoche < 1 || opccoche > 2));
		return opccoche;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opc = 0;

		Coche c = new Coche("Robert Kubica", 1234);
		
		do {
			opc = mostrarMenu();
			System.out.println(c.toString());
			
			switch (opc) {
			case 1:
				c.arrancar();
				break;
			case 2:
				c.acelerar();
				break;
			case 3:
				c.frenar();
				break;
			case 4:
				c.rearrancar();
				break;

			
			}
			
		} while (c.getKmrecorridos() <= c.getdistancia());
	}

}
