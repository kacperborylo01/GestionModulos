package CarreraCoche;

public class Coche {

	private String nombrepiloto;
	private int dorsal;
	private int distancia;
	private String estado;
	private final int POTENCIA=50;
	private int velocidad;
	private int kmrecorridos;
	
	public Coche(String nombrepiloto, int dorsal, int distancia) {
		this.nombrepiloto = nombrepiloto;
		this.dorsal = dorsal;
		this.distancia = distancia;
		this.estado = "parado";
		this.velocidad = 0;
		this.kmrecorridos = 0;
	}

	public String getNombrepiloto() {
		return nombrepiloto;
	}

	public void setNombrepiloto(String nombrepiloto) {
		this.nombrepiloto = nombrepiloto;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getDISTANCIA() {
		return distancia;
	}

	

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getPOTENCIA() {
		return POTENCIA;
	}

	

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getKmrecorridos() {
		return kmrecorridos;
	}

	public void setKmrecorridos(int kmrecorridos) {
		this.kmrecorridos = kmrecorridos;
	}

	public void arrancar() {
		if ((this.getEstado().equalsIgnoreCase("parado"))) {
			this.setEstado("Arrancado");
			System.out.println("Tu coche se ha arrancado");
		}else {
				if (this.getEstado().equalsIgnoreCase("Arrancado")) {
					System.out.println("Ya está arrancado");
				}else {
					System.out.println("Imposible arrancar,revisar estado");
				}
			}
	}
	
	public void rearrancar() {
		if (this.getEstado().equalsIgnoreCase("Accidentado")) {
			this.setEstado("Arrancado");
			System.out.println("Ya puedes seguir, has rearrancado el coche.");
		}
	}
	
	public void acelerar() {
		if ((this.getEstado().equalsIgnoreCase("Parado"))||this.getEstado().equalsIgnoreCase("Accidentado")){
			System.out.println("Primero tienes que arrancar el coche");
		}else {
			if (this.getEstado().equalsIgnoreCase("Arrancado")) {
				
				double r = Math.random()*this.POTENCIA+1;
				int acelerat = (int)Math.floor(r);
				int recorrido = this.getKmrecorridos();
				int velocidad = this.getVelocidad();
				velocidad += acelerat;
				kmrecorridos+=acelerat;
			
			
			if (velocidad > 200) {
				this.setVelocidad(0);
				this.setEstado("Accidentado");
				System.out.println("Vaya te has pasado de 200km/h, te has accidentado, necesitas rearrancar");
				
			}else {
				this.setVelocidad(velocidad);
				this.setKmrecorridos(recorrido+velocidad);
				System.out.println("Circulas a una velocidad de " + getVelocidad() + "km/h");
			}
			
			if (this.kmrecorridos >= this.distancia) {
				this.estado = "Terminado";
			}else {
				System.out.println("Todavía falta carrera para rato");
			
				
			
				}
			
			
			}
						
		}
	}

	public void frenar() {
		if ((this.getEstado().equalsIgnoreCase("Parado"))||this.getEstado().equalsIgnoreCase("Accidentado")) {
			System.out.println("Para frenar tienes que acelerar el coche primero");
			
		}else {
			if(this.getEstado().equalsIgnoreCase("Arrancado")) {
				double r = Math.random()*this.POTENCIA + 1;
				int frenat = (int)Math.floor(r);
				int velocidad = this.getVelocidad();
				int recorrido = this.kmrecorridos;
				
				velocidad -= frenat;
				
		if (velocidad == 0) {
			this.setVelocidad(0);
			this.setEstado("Parado");
			System.out.println("Has frenado tanto que te has parado, necesitas acelerar para seguir");
		}
		
		if (this.getKmrecorridos() >= this.distancia) {
			this.estado = "Terminado";
		}else {
			System.out.println("Sigue campeón que todavía no has terminado, esto no es un juego.");
		}
			
		}
		}
	}

	@Override
	public String toString() {
		return "Coche [nombrepiloto=" + nombrepiloto + ", dorsal=" + dorsal + ", distancia=" + distancia + ", estado="
				+ estado + ", POTENCIA=" + POTENCIA + ", velocidad=" + velocidad + ", kmrecorridos=" + kmrecorridos
				+ "]";
	}
	
	
	
	
}
