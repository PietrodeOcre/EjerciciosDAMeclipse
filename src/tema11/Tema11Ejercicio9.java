package tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Tema11Ejercicio9 {

	/*
	 * Tenemos un fichero con una serie de números los cuales queremos ordenar de manera
ascendente. El objetivo es que los números queden ordenados en el mismo fichero. Para la
resolución del problema crea una clase Orden con un método “ordena” que haga la
ordenación de los datos del fichero. Los números están cada uno en una línea del fichero y el
fichero cuenta con al menos 5 números.
	 */
	
	
	public static void main(String[] args) {
		
		String rutaString = "/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio9.txt";
		
		String[] numero = {"4","6","8","7","4","7","7","4","3","3","6","7","5"};
 		escribirStringArchivoBufferedWriter(rutaString, numero);
 		leerArchivoBufferedReader(rutaString);
	}
	
	/*
	 * metodo para leer un archivo con BufferedReader
	 */
	public static void leerArchivoBufferedReader (String ruta) {
		
		FileInputStream fis = null;
		BufferedReader dais = null;
		String cadenaString;
		List<Integer> lista = null;
		StringTokenizer token;
		
		try {
			
			fis = new FileInputStream(ruta);
			dais = new BufferedReader(new InputStreamReader(fis));
			lista = new ArrayList<Integer>();
			cadenaString = "";

			while ((cadenaString = dais.readLine()) != null) {

				System.out.println(cadenaString);
				token = new StringTokenizer(cadenaString);

				while (token.hasMoreElements()) {

					lista.add(Integer.parseInt(token.nextToken()));

				}

			}

			Collections.sort(lista);
			
			escribirStringArchivoBufferedWriter(ruta, lista.toArray());
			
			System.out.println(lista);
			
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
		
		//System.out.println(cadenaString);
	}
	
	/*
	 * metodo para escribir un String en un archivo con BufferedWriter
	 */
	public static void escribirStringArchivoBufferedWriter (String ruta, Object[] cadenaString) {
		
		FileOutputStream fos = null;
		BufferedWriter daos = null;

		try {
			
			fos = new FileOutputStream(ruta);
			daos = new BufferedWriter(new OutputStreamWriter(fos));

			for (int i=0; i<(cadenaString.length); i++) {
				
				if (cadenaString[i] !=null) {
					daos.write(cadenaString[i] +"\n");
				}
				
			}
			

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
	 * Retira todo lo que no sea letras minusculas, mayusculas o numeros
	 */
	public static String eliminaCaracteresEspeciales(String str) {
		return str.replaceAll("[^0-9]", "");
	}
	
}
