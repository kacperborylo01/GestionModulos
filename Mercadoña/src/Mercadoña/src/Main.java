
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int opc = 0;
		boolean salir = false;

		Carrera carrera = null;
		Coche c = null;

		do {
			opc = Menu.carrerica();
			switch (opc) {
			case 1:
				// Empezamos carrera
				carrera.iniciarCarrera();
				do {

					for (int i = 0; i < carrera.getvCoches().length; i++) {
						if (carrera.getvCoches()[i] != null) {
							c = carrera.getvCoches()[i];
							if (c.esPersona()) {
								opc = Menu.mostrarMenu();
								System.out.println(c.toString());
								//Juega humano
								switch (opc) {
								case 1: {
									c.acelerar();
									break;
								}
								case 2: {
									c.frenar();
									break;
								}
								case 3: {
									c.rearrancar();
									break;
								}
								}
							} else {
								//Juega la maquina
								Random r = new Random();
								switch (r.nextInt(2)) {
								case 0: {
									c.acelerar();
									break;
								}
								case 1: {
									c.frenar();
									break;
								}
								}
								
							}
							carrera.clasificacion();
						}
					}

				} while (!carrera.carreraTerminada());
				break;
			case 2:
				String nombre = "";
				int distancia = 0;
				Scanner leer = new Scanner(System.in);
				
				System.out.println("Dime el nombre de la carrera.");
				nombre = leer.nextLine();
				System.out.println("Dime la distancia de la carrera.");
				distancia = leer.nextInt();
				
				carrera = new Carrera(nombre, distancia);
				break;
			case 3:
				carrera.anadirCoche();
				break;
				
			case 4:
				salir = true;
				break;
			}

		} while (!salir);

	}

}
