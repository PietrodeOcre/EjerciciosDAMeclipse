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
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Tema11Ejercicio9 {

	/*
	 * Tenemos un fichero con una serie de números los cuales queremos ordenar de manera
ascendente. El objetivo es que los números queden ordenados en el mismo fichero. Para la
resolución del problema crea una clase Orden con un método “ordena” que haga la
ordenación de los datos del fichero. Los números están cada uno en una línea del fichero y el
fichero cuenta con al menos 5 números.
	 */
	
	
	public static void main(String[] args) {
		
		String rutaString = "/home/pietrodeocre/Documentos/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio9.txt";
		
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
		String cadenaString = null;

		try {
			
			fis = new FileInputStream(ruta);
			dais = new BufferedReader(new InputStreamReader(fis));
			
			StringTokenizer token;
			int nDatos=0;
			Integer[] datos=new Integer[nDatos];
			
			while((cadenaString = dais.readLine()) != null) {
				cadenaString += dais.readLine();
				token=new StringTokenizer(cadenaString, "\n");
				nDatos=token.countTokens();
				int i=0;
				while(token.hasMoreTokens()){
               		Integer str=Integer.parseInt(token.nextToken());
            		datos[i]=str;
            		System.out.println(datos[i]);
            		i++;
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
		
		System.out.println(cadenaString);
	}
	
	/*
	 * metodo para escribir un String en un archivo con BufferedWriter
	 */
	public static void escribirStringArchivoBufferedWriter (String ruta, String[] cadenaString) {
		
		FileOutputStream fos = null;
		BufferedWriter daos = null;

		try {
			
			fos = new FileOutputStream(ruta);
			daos = new BufferedWriter(new OutputStreamWriter(fos));

			for (String string : cadenaString) {
				daos.write(string +"\n");
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
		
		System.out.println(cadenaString);
		
	}
	
}
