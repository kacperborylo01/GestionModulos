package Ventas;

import Ventas.IODatos;
import Ventas.Ventas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ventas[] vVentas = new Ventas[10];
		
		vVentas[0] = new Ventas("Juan", 1, 1, 10);
		vVentas[0] = new Ventas("Pepe", 1, 2, 20);
		vVentas[0] = new Ventas("Ivan", 2, 1, 10);
		vVentas[0] = new Ventas("Leo", 1, 1, 10);
		vVentas[0] = new Ventas("Isa", 1, 1, 10);
		
		IODatos.guardarDatos("ventas.dat", vVentas);*/
	Ventas[] vVentas = IODatos.cargarDatos("ventas.dat");
		
		

        for (Ventas ventas : vVentas) {
            if ((ventas != null)) {
                System.out.println(ventas);
            }
        }
			
		}
private static double calcularTotalCliente(Ventas[] vVentas, String cliente) {
		
		int suma = 0,total=0;
		
		for (Ventas ventas : vVentas) {
			if (ventas!=null && ventas.getCliente().equalsIgnoreCase(cliente)){
				total+= ventas.getPrecioUnitario("El total de ventas de Juan es " + ventas);
			}
		}
		
		return suma;
	}
	
	private static int contarClientes(Ventas[] vVentas, String cliente) {
		
		int total = 0;
		String[] vNombres = new String[vVentas.length];
		
		
		for (Ventas ventas : vVentas) {
			if (ventas!=null) {
				for (int i = 0; i<vNombres.length;i++) {
					if (vNombres[i]!=null) {
						if (ventas.getCliente().equalsIgnoreCase(vNombres[i])) {
							
							break;
						}
					}else {
						 
							total++;
							vNombres[i] = ventas.getCliente();
						
						break;
					}
				}
			}else {
				break;
			}
		}
		
		
		
		return total;
	}
	}


