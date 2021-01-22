package Principal;

public class Administrativos extends Personal  {

	protected String contrato;

	public Administrativos(String nombre, int edad, String contrato) {
		super(nombre, edad);
		this.contrato = contrato;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		return  super.toString() + " es un Administrativo y tiene contrato de " + contrato + " ";
	}
	
	
	
}
