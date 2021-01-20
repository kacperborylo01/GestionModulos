import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
	
		
		Modulo vModulos[] = new Modulo[10];
		
		vModulos[0] = new Modulo("Programación", 300, "PRG");
		vModulos[1] = new Modulo("Sistemas Informáticos", 400, "SI");
		vModulos[2] = new Modulo("Formación y Orientación Laboral", 100, "FOL");
		
		int aux =0;
		for(Modulo m : vModulos) {
		if(m != null) {
		
		aux = m.getHoras() + aux;
		System.out.println(m.toString());
		
		
		}
		}
		
		System.out.println("Numero de horas del ciclo: " + aux);
		
	}

}
