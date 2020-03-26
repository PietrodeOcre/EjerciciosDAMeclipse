package CursoUdemyPruebas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ManejoES {

	public static void main(String[] args) {
		
		String capturaString;
		InputStreamReader input = new InputStreamReader(System.in);
		
		BufferedReader bufferedReader = new BufferedReader(input);
		
		try {
			System.out.println("Introduce un texto: ");
			capturaString = bufferedReader.readLine();
			while (capturaString != null) {
				
				System.out.println("Datos introducidos: " + capturaString);
				capturaString = bufferedReader.readLine();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
