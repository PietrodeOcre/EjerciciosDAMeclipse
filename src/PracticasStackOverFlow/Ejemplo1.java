package PracticasStackOverFlow;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejemplo1 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("/home/pietrodeocre/git/EjerciciosDAMeclipse/src/PracticasStackOverFlow/Texto.txt");

		if (!file.exists()) {
			System.out.println ("No existe el archivo: "+file);
			System.exit(1);
		}
		System.out.println ("Archivo Encontrado");
		//System.out.print ("Escribe El Promedio Minimo ");
		//int prom = sc.nextInt();
		int[] notas = new int[4];
		List<String> infoList = new ArrayList<String>();
		infoList = tokenizador(file);
		
		for(int i = 0; i< infoList.size();i++) {
			notas[0]  = new Integer(infoList.get(i+2));
		}
		
		notas[1]  = new Integer(infoList.get(3));
		notas[2]  = new Integer(infoList.get(4));
		notas[3]  = new Integer(infoList.get(5));

		System.out.println("Nostas: " +notas[0] + ", " + notas[1]+ ", " + notas[2] + ", " + notas[3] );

	}

	/*
	 * Devuelve una lista con las palabras de un archivo
	 */
	public static List<String> tokenizador(File ruta) {

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

				tokenizador = new StringTokenizer(cadenaString, ",");

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
}


