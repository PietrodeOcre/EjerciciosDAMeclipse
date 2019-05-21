package tema11;

import java.io.File;

public class Fichero {

	public static void main(String[] args) {
		
		File file = new File("/home/pietrodeocre");
		
		if (file.exists()) {
			System.out.println("Existe el directorio "+ file.getName());
		}else {
			System.out.println("No existe el directorio "+file.getName());
		}
		File[] listaficheros = file.listFiles();
		for (File file2 : listaficheros) {
			System.out.println(file2.getName());
		}
		
		
		
	}

}
