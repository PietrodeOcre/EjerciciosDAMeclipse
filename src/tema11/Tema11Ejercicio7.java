package tema11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Tema11Ejercicio7 {
	
	/*
	 * Se necesita crear una clase Censura con un método “aplicaCensura” 
	 * que modifique ciertas palabras de un fichero. El método 
	 * toma un fichero de entrada y mediante un fichero de censura 
	 * creará un fichero de salida con las modificaciones necesarias.
	 * Ejemplo:Fichero de entrada
	 * En un lugar de la mancha de cuyo nombre
	 * no quiero acordarme...Vivía un hidalgo de adarga estrechaFichero
	 * de censura
	 * acordarme recordar
	 * hidalgo noble
	 * Fichero de salida
	 * En un lugar de la mancha de cuyo nombre no quiero recordar...vivía 
	 * un noble de adarga estrecha
	 * Nota: Utilice las clases DataInputStream y DataOutputStream
	 */
	
	

	public static void main(String[] args) throws IOException {
		/* 
		 * PC portatil:
		 * "/home/pietrodeocre/Documentos/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7.txt"
		 * "/home/pietrodeocre/Documentos/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7Censura.txt"
		 * "/home/pietrodeocre/Documentos/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7Censurado.txt"
		 * PC de casa:
		 * 
		 * "/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7.txt"
		 * "/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7Cesura.txt"
		 * "/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7censurado.txt"
		 */
		
		File rutaFilePortatil = new File("/home/pietrodeocre/Documentos/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7.txt");
		File rutaFileCensuraPortatil = new File("/home/pietrodeocre/Documentos/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7Censura.txt");
		File rutaFileCensuradoPortatil = new File("/home/pietrodeocre/Documentos/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7Censurado.txt");
		
		File rutaFileCasa = new File("/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7.txt");
		File rutaFileCensuraCasa = new File("/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7Cesura.txt");
		File rutaFileCensuradoCasa = new File("/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7censurado.txt");
		
		
		crearFichero(rutaFilePortatil);
		crearFicheroCensura(rutaFileCensuraPortatil);
		aplicaCensura(rutaFilePortatil,rutaFileCensuraPortatil,rutaFileCensuradoPortatil);
		
		
		
		
		
	}
	
	public static void crearFichero(File ruta) {
		
		FileOutputStream fos = null;
		DataOutputStream daos = null;
		try {
			fos = new FileOutputStream(ruta);
			daos = new DataOutputStream(fos);
			
			String cadenaString = "En un lugar de la mancha de cuyo nombre no quiero acordarme... Vivia un hidalgo de adarga estrecha";
			
			daos.writeUTF(cadenaString);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				daos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	
	
	public static void crearFicheroCensura(File ruta) {
	
		FileOutputStream fos = null;
		DataOutputStream daos = null;
		
		try {
			fos = new FileOutputStream(ruta);
			daos = new DataOutputStream(fos);
			
			String cadenaCensuraString = "acordarme recordar\n"
					+ " hidalgo noble";
			
			String[]  cadenaSeparadaStrings = cadenaCensuraString.split(" ");
			
			for (int i = 0; i < cadenaSeparadaStrings.length; i++) {
				daos.writeUTF(cadenaSeparadaStrings[i]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				daos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
	}
	
	public static Map<String, String> aplicaCensura(File ruta, File rutaCensura, File rutaCensurado) {
		FileInputStream fis = null;
		DataInputStream dais = null;
		
		FileInputStream fis2 = null;
		DataInputStream dais2 = null;
		
		HashMap<String, String> censuraMap = null;
		try {
			fis = new FileInputStream(ruta);
			dais = new DataInputStream(fis);
			
			fis2 = new FileInputStream(rutaCensura);
			dais2 = new DataInputStream(fis2);
			
			String cadena1;
			String cadena2;
			
			censuraMap = new HashMap<String, String>();
			
			List<String> cadenaCensura = new ArrayList<String>();
			
			while (dais2.available() > 0) {
				
				cadenaCensura.add(dais2.readUTF());

			}
			int cont = 1;
			String strAux="";
			for (String string : cadenaCensura) {

				if(cont%2!=0) {
					censuraMap.put(string, "");
					strAux = string; 
				}else {
					censuraMap.put(strAux, string);
				}

				cont++;
			}
			StringTokenizer strToken = null;
			System.out.println(censuraMap);
			String cadenaString = "";
			List<String> diccionario = new LinkedList<>();
			
			while (dais.available() > 0) {
				
				
				cadenaString += dais.readUTF();
				
				//cadenaString += dais.readUTF();
				strToken = new StringTokenizer(cadenaString);
				
				while (strToken.hasMoreTokens()) {

					strAux = eliminaCaracteresEspeciales(strToken.nextToken());
					
					//System.out.println(strAux);
					if(censuraMap.containsKey(strAux)) {
						
						diccionario.add(censuraMap.get(strAux));
					}else {
						diccionario.add(strAux);
					}
					
				}

			}			
			
			System.out.println("");
			System.out.println(cadenaString);
			
			System.out.println(diccionario);
			
			crearNuevoLimpio(diccionario, rutaCensurado);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dais.close();
				dais2.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			
		}
		
		return censuraMap;
		
	}
	
	public static void crearNuevoLimpio(List<String> diccionario, File rutaFileCensuradoPortatil) {
		
		FileOutputStream fos = null;
		DataOutputStream daos = null;
		
		try {
			
			fos = new FileOutputStream(rutaFileCensuradoPortatil);
			daos = new DataOutputStream(fos);
			
			String auxString = "";
			
			for (String string : diccionario) {
				auxString += string + " ";
			}
			
			System.out.println(auxString);
			
			daos.writeUTF(auxString);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				daos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}finally {
				
			}
		}
		
	}
	
	public static String eliminaCaracteresEspeciales(String str) {
		return str.replaceAll("[^a-zA-Z0-9]", "");
	}
	
	
	
	
}
