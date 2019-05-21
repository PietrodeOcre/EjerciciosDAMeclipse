package tema11;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Tema11Ejercicio2 {
	
	/*
	 * Escriba en Java un método que obtenga los ficheros de un directorio 
	 * con una determinada extensión. El prototipo del método es el siguiente:
	 * public static List<String> obtieneInfoExtensionDirectorio(String nombreDirectorio, String extension)
	 */

	public static void main(String[] args) {
		
		System.out.println(obtieneInfoExtensionDirectorio("/home/pietrodeocre", "txt"));
		
		System.out.println(esDirectorio("/home/pietrodeocre"));
		
	}
	
	public static List<String> obtieneInfoExtensionDirectorio(String nombreDirectorio, String extension){
		
		
		List<String> nombreList = new ArrayList<String>();
		
		File filaFile = new File(nombreDirectorio);
		
		if (filaFile.exists()) {
			String[] listaficheros = filaFile.list();
			for (String file2 : listaficheros) {
				if(file2.endsWith(extension)) {
					
					nombreList.add(file2);
				}
				
			}
		}	
		
		
		return nombreList;
	}
	
	public static boolean esDirectorio(String ruta) {
		
		boolean direct = false;
		File filaFile = new File(ruta);
		
		if (filaFile.exists()) {
			File[] listaficheros = filaFile.listFiles();
			for (File file2 : listaficheros) {
				if(file2.isDirectory()) {
					direct = true;
				}else {
					direct = false;
				}
			}
		}
		return direct;	
		
	}

}
