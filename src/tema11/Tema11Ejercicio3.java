package tema11;

import java.io.File;
import java.io.FileOutputStream;

public class Tema11Ejercicio3 {

	/*
	 * Escriba un método Java que retorne true si la ruta dada es un directorio. En caso de que
sea un fichero, se retorna un false.
public static boolean esDirectorio()
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rutaDir = "/home/pietrodeocre/Documentos/GradoSuperior/PROG/Tema11/Ejercicio7/";
		
		String rutaFich = "/home/pietrodeocre/Documentos/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio9.txt";
		
		
		System.out.println(esDirectorio(rutaDir));
		
		System.out.println(esDirectorio(rutaFich));
		
		
	}

	public static boolean esDirectorio(String ruta) {
		
		boolean aux = false;
		
		File file = new File(ruta);
		
		if(file.isDirectory()){
			aux = true;
		}
		
		return aux;
	}
	
}
