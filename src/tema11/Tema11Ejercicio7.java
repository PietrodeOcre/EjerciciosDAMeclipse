package tema11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Tema11Ejercicio7 {
	
	/*
	 * Se necesita crear una clase Censura con un método “aplicaCensura” 
	 * que modifique ciertas palabras de un fichero. El método 
	 * toma un fichero de entrada y mediante un fichero de censura 
	 * creará un fichero de salida con las modificaciones necesarias.
	 * Ejemplo:Fichero de entrada
	 * En un lugar de la mancha de cuyo nombre
	 * no quiero acordarme...Vivía un hidalgo de adarga estrechaFichero
	 * de censuraacordarme recordarhidalgo nobleFichero de salidaEn un
	 * lugar de la mancha de cuyo nombre no quiero recordar...vivía 
	 * un noble de adarga estrecha
	 * Nota: Utilice las clases DataInputStream y DataOutputStream
	 */
	
	

	public static void main(String[] args) throws IOException {
		// "/home/pietrodeocre/Documentos/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7.txt"
		// "/home/pietrodeocre/Documentos/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7Censura.txt"
		File rutaFile = new File("/home/pietrodeocre/Documentos/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7.txt");
		
		crearFichero(rutaFile);
		ficheroCensura();
		aplicaCensura(rutaFile);
		
		
		
		
		
	}
	
	public static void crearFichero(File ruta) {
		
		FileOutputStream fos = null;
		DataOutputStream daos = null;
		try {
			fos = new FileOutputStream(ruta);
			daos = new DataOutputStream(fos);
			
			String cadenaString = "En un lugar de la mancha de cuyo nombre no quiero acordarme...Vivía un hidalgo de adarga estrecha";
			
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
	
	
	public static void ficheroCensura() {
	
		FileOutputStream fos = null;
		DataOutputStream daos = null;
		
		try {
			fos = new FileOutputStream(ruta());
			daos = new DataOutputStream(fos);
			
			String cadenaCensuraString = "acordarme recordar\n"
					+ "hidalgo noble";
			
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
	
	public static Map<String, String> aplicaCensura(File ruta) {
		FileInputStream fis = null;
		DataInputStream dais = null;
		
		FileInputStream fis2 = null;
		DataInputStream dais2 = null;
		
		HashMap<String, String> censuraMap = null;
		try {
			fis = new FileInputStream(ruta);
			dais = new DataInputStream(fis);
			
			fis = new FileInputStream(ruta());
			dais = new DataInputStream(fis);
			
			String cadena1;
			String cadena2;
			
			censuraMap = new HashMap<String, String>();
			
			String cadenaCensura = "";
			
			while (dais2.available()>0) {
				
				cadena1 = dais2.readUTF();
				
				cadena2 = dais2.readUTF();
				
			}
			
			String cadenaString = "";
			while (dais.available() > 0) {
				
				cadenaString += dais.readUTF();
				

			}
			
			System.out.println(cadenaString);
			
			
			
			
			
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
	
	public static File ruta() {
		File rutaCensura = new File("/home/pietrodeocre/Documentos/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7Censura.txt");
		return rutaCensura;
	}

}
