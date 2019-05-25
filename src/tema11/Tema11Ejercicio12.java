package tema11;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tema11Ejercicio12 {

	public static void main(String[] args) {
		
		File rutaFile = new File("/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/Ejercicio7");
		
		ficherosEnDirectorio(rutaFile);
		
		
	}
	
	/*
	 * metodo para leer un archivo con BufferedReader
	 */
	public static void leerArchivoBufferedReader (String ruta) {
		
		FileInputStream fis = null;
		DataInputStream dais = null;
		String cadenaString = null;
		int cont = 0;
		
		try {
			
			fis = new FileInputStream(ruta);
			dais = new DataInputStream(fis);
			
			while(dais.available()>0) {
				cadenaString += dais.readUTF();
				cont++;
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
		
		System.out.println(cadenaString +"\nNumero de lineas: "+ cont);
	}

	private static void ficherosEnDirectorio(File ruta) {
		File[] listaficheros = ruta.listFiles();
		for (File file2 : listaficheros) {
			if(file2.exists() && file2.isFile() && file2.getName().contains("txt")) {
				System.out.println(file2.getPath());
				leerArchivoBufferedReader(file2.getPath());
			}
			
		}
	}
	
	

}
