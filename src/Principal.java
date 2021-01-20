
public class Principal {

	public static void main(String[] args) {
		Modulo m = new Modulo("Programación", 300, "PRG");

		System.out.println(m.toString());
		System.out.println("Numero de horas del ciclo: " + m.getHoras());
	}

}
