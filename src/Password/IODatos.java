package Password;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODatos {

	public static void guardarDatos(String rutaFichero, Password[] datos) {
		
		File f = new File(rutaFichero);
		if (!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try (FileOutputStream fo = new FileOutputStream(f);
			 DataOutputStream escribir = new DataOutputStream(fo)){
			
			for (Password p : datos) {
				if (p!=null) {
					escribir.writeUTF(p.getUsuario());
					escribir.writeInt(p.getPassword());
					escribir.writeBoolean(p.isSegura());
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
	
	public static  Password[] cargarDatos(String rutaFichero ) {
		File f = new File(rutaFichero);
		Password[] vPassword = new Password[10];
		String usuario="";
		int password;
		boolean segura;
		int cont = 0;
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try (FileInputStream fin = new FileInputStream(f);
				 DataInputStream leer = new DataInputStream(fin)){
				
				while(true) {
					usuario = leer.readUTF();
					password = leer.readInt();
					segura = leer.readBoolean();
					Password p = new Password(usuario, password, segura);
					vPassword[cont]=p;
					cont++;
					
					}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		
		System.out.println("Fin de lectura de fichero");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Fin de lectura de fichero");
	}
		return vPassword;
	
	}
	
	public static void guardarObjetos(String rutaFichero,Password[] datos) {
		File f = new File(rutaFichero);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try (FileOutputStream fo = new FileOutputStream(f)
				){
			
		}
	}
}
	
