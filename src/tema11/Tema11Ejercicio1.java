package tema11;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Tema11Ejercicio1 {

	/*
	 * Escribe un método que obtenga una colección 
	 * de los nombres de los ficheros y directorios 
	 * de un directorio dado. El prototipo del 
	 * método es el siguiente:
	 * public static List<String> obtieneInfoDirectorio(String nombreDirectorio)
	 */
	
	public static void main(String[] args) {
		
		String string= "/home/pietrodeocre";
		
		System.out.println(obtieneInfoDirectorio(string));

	}

	public static List<String> obtieneInfoDirectorio(String nombreDirectorio){
		
		List<String> nombreList = new ArrayList<String>();
		
		File filaFile = new File(nombreDirectorio);
		
		if (filaFile.exists()) {
			File[] listaficheros = filaFile.listFiles();
			for (File file2 : listaficheros) {
				if(file2.isDirectory()) {
					nombreList.add(file2.getName());
				}
				
			}
		}	
		
		
		return nombreList;
	}
	
	
}
