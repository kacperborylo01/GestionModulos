package Principal;

public final class Interinos extends Administrativos {

	private String tiempo;

	public Interinos(String nombre, int edad, String contrato, String tiempo) {
		super(nombre, edad, contrato);
		this.tiempo = tiempo;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return "Interinos [tiempo=" + tiempo + "]";
	}
	
	
	

	
}
