package tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CalculaMedia {

	public static void main(String[] args) {
		
		String cadenaNum = "1 2 3 4 5 67 87 8";
		
		String ruta = directorioActual();
		ruta+= "/archivo.txt";
		escribirStringArchivoBufferedWriter(ruta,cadenaNum);
		leerArchivoBufferedReader(ruta);
		

	}
	
	/*
	 * metodo para leer un archivo con BufferedReader
	 * Lee una cadena de numeros con espacios 
	 * saca media de dichos números
	 */
	public static void leerArchivoBufferedReader (String ruta) {
		
		FileInputStream fis = null;
		BufferedReader dais = null;
		String cadenaString = null;
		StringTokenizer cadenaAux = null;
		Integer[] num = null;
 		try {
			
			fis = new FileInputStream(ruta);
			dais = new BufferedReader(new InputStreamReader(fis));
			int i=0;
			
			while((cadenaString = dais.readLine()) != null) {
				cadenaAux = new StringTokenizer(cadenaString);
				num = new Integer[cadenaAux.countTokens()];
				while(cadenaAux.hasMoreTokens()) {
					num[i++] = Integer.parseInt(cadenaAux.nextToken());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dais.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}finally {
				
			}
		}
		int aux = 0;
 		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			aux += num[i];
		}
 		System.out.println("La media de los números es: " + (aux/num.length));
	}
	
	/*
	 * metodo para escribir un String en un archivo con BufferedWriter
	 */
	public static void escribirStringArchivoBufferedWriter (String ruta, String cadenaString) {
		
		FileOutputStream fos = null;
		BufferedWriter daos = null;

		try {
			
			fos = new FileOutputStream(ruta);
			daos = new BufferedWriter(new OutputStreamWriter(fos));

				daos.write(cadenaString);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				daos.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}finally {
				
			}
		}
		
		//System.out.println(cadenaString);
		
	}

	/*
	 * Devuelve un Strin con la ruta desde donde se ejecuta nuestro java
	 */
	private static String directorioActual() {
		File miDir = new File(".");
		String ruta ="";
		try {
			System.out.println("Directorio actual: " + miDir.getCanonicalPath());
			ruta = miDir.getCanonicalPath();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ruta;
	}
	
}
