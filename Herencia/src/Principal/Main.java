package Principal;

public class Main {

	public static void main(String[] args) {
		
		Alumno vAlumnos[] = new Alumno[10];
		
		vAlumnos[0] = new Alumno("Juan", 22, "Programacion");
		
		Personal vPersonal[] = new Personal[10];
		
		vPersonal[1] = new Alumno("Juan", 22, "1º DAW");
		vPersonal[0] = new Personal("Javier", 18);
		vPersonal[2] = new Profesor("Kacper", 65, "Entornos de desarrollo");
		vPersonal[3] = new Administrativos("Marcos", 34, "Interino");
		vPersonal[4] = new Administrativos("Oscar", 25, "Fijo");
		
		for (Personal p : vPersonal) {
			if (p !=null) {
				System.out.println(p.toString());
			}
		}

	}

}
