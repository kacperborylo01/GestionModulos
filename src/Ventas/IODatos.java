package Ventas;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;

public class IODatos {

	public static void guardarDatos(String rutaFichero, Ventas[] vVentas ) {
		File f = new File(rutaFichero);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try (FileOutputStream fo = new FileOutputStream(f);
					DataOutputStream escribir = new DataOutputStream(fo)){
				for (Ventas ventas : vVentas) {
					if (ventas != null) {
						escribir.writeUTF(ventas.getCliente());
						escribir.writeInt(ventas.getProducto());
						escribir.writeInt(ventas.getCantidad());
						escribir.writeDouble(ventas.getPrecioUnitario());
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
}
	public static void guardarObjetos(String rutaFichero, Ventas[] vVentas ) {
		File f = new File(rutaFichero);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try (FileOutputStream fo = new FileOutputStream(f);
					ObjectOutputStream escribir = new ObjectOutputStream(fo)){
				for (Ventas ventas : vVentas) {
					if (ventas != null) {
						escribir.writeObject(ventas);;
						
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
}
	public static Ventas[] cargarDatos(String rutaFichero) {
		File f = new File(rutaFichero);
		Ventas[] vVentas = new Ventas[10];
		String cliente="";
		int producto;
		int cantidad;
		double precioUnitario;
		int cont=0;
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try (FileInputStream fi = new FileInputStream(f);
					DataInputStream leer = new DataInputStream(fi)){
					
				while(true) {
					cliente = leer.readUTF();
					producto = leer.readInt();
					cantidad = leer.readInt();
					precioUnitario = leer.readDouble();
					
					Ventas v = new Ventas(cliente, producto, cantidad, precioUnitario);
					vVentas[cont] = v;
					cont++;
				
				}
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				
				System.out.println("Fin de lectura de fichero");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Fin de lectura de fichero");
			}
				
			
		}
		return vVentas;
	}
	public static Ventas[] cargarObjetos(String rutaFichero) {
		File f = new File(rutaFichero);
		Ventas[] vVentas = new Ventas[10];
		String cliente="";
		int producto;
		int cantidad;
		double precioUnitario;
		int cont=0;
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try (FileInputStream fi = new FileInputStream(f);
					ObjectInputStream leer = new ObjectInputStream(fi)){
					
				while(true) {
					
					
					Ventas v;
					try {
						v = (Ventas)leer.readObject();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					vVentas[cont] = v;
					cont++;
				
				}
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				
				System.out.println("Fin de lectura de fichero");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Fin de lectura de fichero");
			}
				
			
		}
		return vVentas;
	}
}
