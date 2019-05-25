package tema11;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Tema11Ejercicio4 {

	/*
	 * Escribe un método en Java que retorne la última hora de modificación del fichero.
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		File rutaString = new File("/home/pietrodeocre/Documentos/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio9.txt");

		System.out.println(ultimaHora(rutaString));
		
	}
	
	public static Date ultimaHora(File ruta) {
		
	    Date fecha = new Date(ruta.lastModified());

		return fecha;

	}

}
