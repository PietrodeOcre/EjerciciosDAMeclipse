package tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Map.Entry;

public class PorCaracter {
	
	/*
	 * palabras de maximo 4 caracteres
	 * 
	 * pasarlos a listas o maps
	 */
	
	public static void main(String[] args) {
		
		String ruta = "/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/archivosficheros/directorio/pedro.txt";
		File dir = new File("/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/archivosficheros/directorio/");
		String cadena = "Esta cadena es la que tendrá que leer el siguiente método, que lo lea y luego me diga que tal todo.";
		dir.mkdir();
		//escribirStringArchivoBufferedWriter(ruta, cadena);
		
		leerArchivoBufferedReader(ruta);
	}
	
	/*
	 * Retira todo lo que no sea letras minusculas, mayusculas o numeros
	 */
	public static String eliminaCaracteresEspeciales(String str) {
		return str.replaceAll("[^a-zA-Z0-9]", "");
	}
	
	
	/*
	 * metodo para leer un archivo con BufferedReader que muestra cadenas con un minimo de caracteres
	 */
	public static void leerArchivoBufferedReader (String ruta) {
		
		FileInputStream fis = null;
		BufferedReader dais = null;
		String cadenaString = null;
		Map<String, Integer> maxCadena = null;
		try {
			
			fis = new FileInputStream(ruta);
			dais = new BufferedReader(new InputStreamReader(fis));

			StringTokenizer cadenaUni;
			maxCadena = new HashMap<String, Integer>();
			String auxString;
			while((cadenaString = dais.readLine()) != null) {
				
				cadenaUni = new StringTokenizer(cadenaString);
				
				while(cadenaUni.hasMoreElements()) {
					
					auxString = cadenaUni.nextToken();
					
					maxCadena.put(auxString, auxString.length());
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

		System.out.println(maxCadena);
		
		for (Entry<String, Integer> entrada : maxCadena.entrySet()) {

			if (entrada.getValue() >= 4) {
				System.out.println(entrada.getKey());
			}

		}

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

}
