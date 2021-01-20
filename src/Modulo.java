
public class Modulo {

	private String nombre="";
	private int horas=0;
	private String codigomod = "";
	
	
	public Modulo(String modulo, int horas, String codigomod) {
		super();
		this.nombre = modulo;
		this.horas = horas;
		this.codigomod = codigomod;
	}


	public String getModulo() {
		return nombre;
	}


	public void setModulo(String modulo) {
		this.nombre = modulo;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public String getCodigomod() {
		return codigomod;
	}


	public void setCodigomod(String codigomod) {
		this.codigomod = codigomod;
	}


	@Override
	public String toString() {
		return "Modulo " + nombre + ":";
	}
	
	
	
	
}
