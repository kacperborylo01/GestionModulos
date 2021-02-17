package Password;

public class Main {

	public static void main(String[] args) {
		
		Password vPassword[] = IODatos.cargarDatos("pass.dat");
		
		

        for (Password p : vPassword) {
            if ((p != null)) {
                System.out.println(p);
            }
        }
			
		}
	}


