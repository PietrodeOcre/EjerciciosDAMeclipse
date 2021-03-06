package tema11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Tokenizador {

	public static void main(String[] args) {
		
		String ruta = "/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/archivosficheros/pruebaToken.txt";
		
		System.out.println(tokenizador(ruta));
		
		System.out.println(palabrasUnicas(ruta));
		
	}
	
	
	public static List<String> tokenizador(String ruta) {

		FileInputStream fis = null;
		BufferedReader dais = null;
		String cadenaString = null;
		StringTokenizer tokenizador = null;
		String tok = null;
		List<String> tokList = null;
		
		try {
			
			fis = new FileInputStream(ruta);
			dais = new BufferedReader(new InputStreamReader(fis));
			tokList = new ArrayList<String>();

			while ((cadenaString = dais.readLine()) != null) {

				tokenizador = new StringTokenizer(cadenaString, " ");
				
				while (tokenizador.hasMoreTokens()) {

					tok = tokenizador.nextToken();

					tokList.add(tok);

				}

			}		

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dais.close();
			} catch (final IOException e2) {
				e2.printStackTrace();
			}finally {
				
			}
		}
		return tokList;
	}
	
	/*
	 * Devuelve una lista con las palabras sin repeticion de un archivo
	 */
	public static Set<String> palabrasUnicas(String ruta) {

		FileInputStream fis = null;
		BufferedReader dais = null;
		
		StringTokenizer tokenizador;
		String tok = null;
		Set<String> tokList = null;

		try {

			fis = new FileInputStream(ruta);
			dais = new BufferedReader(new InputStreamReader(fis));
			tokList = new HashSet<String>();
			String cadenaString;
			while ((cadenaString = dais.readLine()) != null) {

				System.out.println(cadenaString);

				tokenizador = new StringTokenizer(cadenaString);

				while (tokenizador.hasMoreTokens()) {

					tok = tokenizador.nextToken();
					eliminaCaracteresEspeciales(tok);

					tokList.add(tok);

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
		return tokList;
	}
	
	public static String eliminaCaracteresEspeciales(String str) {
		return str.replaceAll("[^a-zA-Z0-9]", "");
	}
	
}
