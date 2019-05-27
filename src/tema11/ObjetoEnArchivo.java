package tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class ObjetoEnArchivo {

	public static void main(String[] args) {
		
		String uno = "izquierdo";
		String dos = "derecho";
		
		Brazo brazo = new Brazo(uno, dos);
		Persona persona1 = new Persona("Manuel", "Corral", brazo);
		
		List<Persona> listaPersonal = new ArrayList<>();
		
		listaPersonal.add(persona1);
		
		
		String ruta = "/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/archivosficheros/archivo1.txt";
		
		//escribirStringArchivoBufferedWriter(ruta,listaPersonal);
		
		leerArchivoBufferedReader(ruta);

	}
	
	/*
	 * metodo para escribir un String en un archivo con BufferedWriter
	 */
	public static void escribirStringArchivoBufferedWriter (String ruta, List<Persona> cadenaString) {
		
		FileOutputStream fos = null;
		BufferedWriter daos = null;

		try {
			
			fos = new FileOutputStream(ruta);
			daos = new BufferedWriter(new OutputStreamWriter(fos));

			for (int i=0; i<(cadenaString.size()); i++) {
				
				if (cadenaString.get(i) !=null) {
					daos.write(cadenaString.get(i) +"\n");
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
	 * metodo para leer un archivo con BufferedReader que contiene un objeto
	 */
	public static void leerArchivoBufferedReader (String ruta) {
		
		FileInputStream fis = null;
		BufferedReader dais = null;
		String cadenaString = "";
		List<Persona> lista = null;
		StringTokenizer token;

		try {
			
			fis = new FileInputStream(ruta);
			dais = new BufferedReader(new InputStreamReader(fis));
			lista = new ArrayList<Persona>();

			while ((cadenaString = dais.readLine()) != null) {

				System.out.println(cadenaString);

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

	}

}
