package Ventas;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class IODatos {

	public static void guardarDatos(String rutaFichero, Ventas[] datos ) {
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
				for (Ventas ventas : datos) {
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
	public static Ventas[] cargarDatos(String rutaFichero) {
		File f = new File(rutaFichero);
		Ventas[] vVentas = new Ventas[10];
		String cliente="";
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
					}
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				
				System.out.println("Fin de lectura de fichero");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Fin de lectura de fichero");
			}
				return Ventas[];
			
		}
	}
}
