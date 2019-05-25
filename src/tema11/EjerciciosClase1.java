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
	
	/*Apartir de un fichero con varias lineas
	 * almacenamos en un fichero las palabras que comiencen con vocal y 
	 * en otro las que empiezan con consonante
	 * 
	 * palabrasd e maximo 4 caracteres
	 * 
	 * pasarlos a listas o maps
*/
	public static void main(String[] args) {
		
		String escrituraString = "/home/pietrodeocre/Documentos/GradoSuperior/PROG/Tema11/archivosTemp/frases1.txt";
		crearFichero(escrituraString);
		lectura(escrituraString);

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
			
			
		}finally {
			
			try {
				daos.close();
				
				
				
			} catch (IOException e2) {
				// TODO: handle exception
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
		List<String> consonentes = null;
		
		
		try {
			
			fis = new FileInputStream(ruta);
			dais = new BufferedReader(new InputStreamReader(fis));
			strList = new ArrayList<String>();
			string = "";
			vocales = new ArrayList<String>();
			consonentes = new ArrayList<String>();
			
			while ((string = dais.readLine())!=null) {
				//string = dais.readLine();
				strList.add(string);

			}
			
			
			for (String string2 : strList) {
				strTokenizer = new StringTokenizer(eliminaCaracteresEspeciales(string2));
				String palabraFichero ="";
				char[] inicial = {'a','e','i','o','u'};
				while(strTokenizer.hasMoreTokens()) {
					
					
					if(strTokenizer.nextToken().charAt(0) == inicial[]) {
						vocales.add(strTokenizer.nextToken());
					}else {
						consonentes.add(strTokenizer.nextToken());
					}
					//System.out.println(palabraFichero);
					
					
					
				}
			}
			
			
			
			
			
			System.out.println(vocales);
			System.out.println(consonentes);
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

	public static String eliminaCaracteresEspeciales(String str) {
		return str.replaceAll("[^a-zA-Z0-9]", "");
	}
	
}
