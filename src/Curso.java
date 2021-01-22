import java.util.Arrays;

public class Curso {

	private String nombre;
	private String tutor;
	private Modulo vModulos[];
	
	
	
	public Curso(String nombre, String tutor) {
		this.nombre = nombre;
		this.tutor = tutor;
		this.vModulos = new Modulo[10];
		
		vModulos[0] = new Modulo("Programación",50, "PRG");
		vModulos[3] = new Modulo("Bases de Datos",30, "BBDD");
		vModulos[6] = new Modulo("Inglés",20, "IN");
	
	}


	public Modulo[] getvModulos() {
		return vModulos;
	}


	public void setvModulos(Modulo[] vModulos) {
		this.vModulos = vModulos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTutor() {
		return tutor;
	}


	public void setTutor(String tutor) {
		this.tutor = tutor;
	}


	@Override
	public String toString() {
		String datos="";
		
		for (Modulo modulo : vModulos) {
			if (modulo != null) {
				datos += modulo.toString();
			}
		}
		
		return   nombre + "\n" + tutor + "\nMódulos\n-------\n" + datos ;
	}


	
	
	
	
	
	
	
}
