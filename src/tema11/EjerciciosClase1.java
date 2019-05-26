package tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.lang.model.element.NestingKind;

public class EjerciciosClase1 {
	
	/* Apartir de un fichero con varias lineas
	 * almacenamos en un fichero las palabras que comiencen con vocal y 
	 * en otro las que empiezan con consonante
	 * 
	 * palabrasd e maximo 4 caracteres
	 * 
	 * pasarlos a listas o maps
	 */
	public static void main(String[] args) {
		
		String escrituraString = "/home/pietrodeocre/Documentos/GradoSuperior/PROG/Tema11/archivosTemp/frases1.txt";
		String escrituraString2 = "/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/archivosficheros/frases1.txt";
		crearFichero(escrituraString2);
		lectura(escrituraString2);

	}
	
	public static void crearFichero(String ruta) {
		FileOutputStream fos = null;
		BufferedWriter daos = null;
		
		try {
			
			fos = new FileOutputStream(ruta);
			daos = new BufferedWriter(new OutputStreamWriter(fos));
			
			String[] cadenaString = {"esto es una\n",
					 "prueba para meter\n",
					 "en un archivo\n",
					 "para que esto sea una prueba\n"};
			
			for (int i = 0; i < cadenaString.length; i++) {
				daos.write(cadenaString[i]);
			}

		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			
			try {
				daos.close();
				
				
				
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	public static void lectura(String ruta) {
		
		FileInputStream fis =null;
		BufferedReader dais= null;
		List<String> strList = null;
		String string =null;
		StringTokenizer strTokenizer = null;
		List<String> vocales = null;
		List<String> consonantes = null;
		
		
		try {
			
			fis = new FileInputStream(ruta);
			dais = new BufferedReader(new InputStreamReader(fis));
			strList = new ArrayList<String>();
			string = "";
			vocales = new ArrayList<String>();
			consonantes = new ArrayList<String>();
			
			while ((string = dais.readLine())!=null) {
				//string = dais.readLine();
				strList.add(string);

			}
			
			
			for (String string2 : strList) {
				strTokenizer = new StringTokenizer(string2);
				String palabraFichero ="";
				String ini="";
				while(strTokenizer.hasMoreTokens()) {
					ini = strTokenizer.nextToken();
					
					if(ini.charAt(0) == 'a'|| ini.charAt(0) == 'e' || ini.charAt(0) == 'i' || ini.charAt(0) == 'o' || ini.charAt(0) == 'u') {
						vocales.add(ini);
					}else {
						consonantes.add(ini);
					}
					//System.out.println(palabraFichero);
					
					
					
				}
			}
			
			String ruta1 = "/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/archivosficheros/vocales.txt";
			String ruta2 = "/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/archivosficheros/consonantes.txt";
			escribirNuevosFicheros(ruta1, ruta2, vocales, consonantes);
			
			
			
			System.out.println(vocales);
			System.out.println(consonantes);
			//System.out.println(strList);
			//System.out.println(strTokenizer.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dais.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	public static void escribirNuevosFicheros(String ruta, String ruta2, List<String> listaVocal, List<String> listaConsonante) {
		
		FileOutputStream fos = null;
		BufferedWriter daos = null;
		
		FileOutputStream fos2 = null;
		BufferedWriter daos2 = null;
		
		try {
			
			fos = new FileOutputStream(ruta);
			daos = new BufferedWriter(new OutputStreamWriter(fos));
			fos2 = new FileOutputStream(ruta2);
			daos2 = new BufferedWriter(new OutputStreamWriter(fos2));
			
			for (String string : listaVocal) {
				daos.write(string+"\n");
			}
			for (String string : listaConsonante) {
				daos2.write(string +"\n");
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			
			try {
				daos.close();
				daos2.close();
				
				
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
	}

	public static String eliminaCaracteresEspeciales(String str) {
		return str.replaceAll("[^a-zA-Z0-9]", "");
	}
	
}
