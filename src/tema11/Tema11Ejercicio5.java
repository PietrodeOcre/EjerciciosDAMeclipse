package tema11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tema11Ejercicio5 {
	
	/*
	 * Escriba un método que retorne la palabra con mayor número de caracteres de un fichero.
El prototipo del método es el siguiente:
public static int longitudMayorFichero(String ruta)
	 */

	public static void main(String[] args) {
		
		String ruta = "/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7.txt";
		
		System.out.println(longitudMayorFichero(ruta));

	}

	public static int longitudMayorFichero(String ruta) {
		
		int valor=0;
		
		FileInputStream fis = null;
		BufferedReader dais = null;
		String  palabraMayorString = null;
		StringTokenizer stringToken = null;
		String string = null;
		try {
			
			fis = new FileInputStream(ruta);
			dais = new BufferedReader(new InputStreamReader(fis));
			palabraMayorString = "";
		
			while ((string = dais.readLine())!=null) {
	
				stringToken = new StringTokenizer(string);
				
				while(stringToken.hasMoreTokens()) {
					String palabraFichero = stringToken.nextToken();
					eliminaCaracteresEspeciales(palabraFichero);
					if(palabraFichero.length() > palabraMayorString.length()) {
						
						palabraMayorString = palabraFichero;
	
					}
				}
	
			}
			
			System.out.println(palabraMayorString);

		} catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				dais.close();
				
				
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		return palabraMayorString.length();
		//return valor;
	}
	
	public static String eliminaCaracteresEspeciales(String str) {
		return str.replaceAll("[^a-zA-Z0-9]", "");
	}
	
}
