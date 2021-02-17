package Ventas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ventas vVentas[] = new Ventas[10];
		
		vVentas[0] = new Ventas("Ignacio", 123, 2, 1.12);
		vVentas[1] = new Ventas("Juan Carlos", 1234, 3, 3.12);
		vVentas[2] = new Ventas ("Mario",12345,3,4.56);
		
		 IODatos.guardarDatos("ventas.dat", vVentas);
	}

}
