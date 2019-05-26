package tema11;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchEvent.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SacarPath {

	public static void main(String[] args) {

		System.out.println(directorioActual());
		System.out.println(crearDirectorioPruebas(directorioActual(), "prueba1"));
		System.out.println(obtieneInfoDirectorios(directorioActual()));
		File miDir = new File(".");
		
		
		try {
			System.out.println(miDir.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * DEvuelve un Strin gocn la ruta desde donde se ejecuta nuestro java
	 */
	private static String directorioActual() {
		File miDir = new File(".");
		String ruta ="";
		try {
			System.out.println("Directorio actual: " + miDir.getCanonicalPath());
			ruta = miDir.getCanonicalPath();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ruta;
	}
	
	
	/*
	 * Crear un directorio en la carpeta desde donde se ejecuta el archivo en java
	 */
	public static String crearDirectorioPruebas(String ruta, String directorio) {

		String rutaFinal= ruta+"/"+directorio;
		
		File actual = new File(rutaFinal);
		
		actual.mkdir();
		
		return rutaFinal;
	}
	
	/*
	 * Devuelve lista de directorios de un directorio dado
	 */
	public static List<String> obtieneInfoDirectorios(String nombreDirectorio){
		
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
