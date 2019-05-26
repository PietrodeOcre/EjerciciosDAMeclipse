package tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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
		escribirStringArchivoBufferedWriter(ruta, cadena);
		
		
	}
	
	/*
	 * Retira todo lo que no sea letras minusculas, mayusculas o numeros
	 */
	public static String eliminaCaracteresEspeciales(String str) {
		return str.replaceAll("[^a-zA-Z0-9]", "");
	}
	
	
	/*
	 * metodo para leer un archivo con BufferedReader
	 */
	public static void leerArchivoBufferedReader (String ruta) {
		
		FileInputStream fis = null;
		BufferedReader dais = null;
		String cadenaString = null;

		try {
			
			fis = new FileInputStream(ruta);
			dais = new BufferedReader(new InputStreamReader(fis));

			while((cadenaString = dais.readLine()) != null) {
				
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
		
		System.out.println(cadenaString);
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
		
		System.out.println(cadenaString);
		
	}

}
