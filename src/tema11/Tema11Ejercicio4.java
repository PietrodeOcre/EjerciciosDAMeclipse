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
		File rutaString2 = new File("/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio9.txt");
		System.out.println(ultimaHora(rutaString2));
		
	}
	
	/*
	 * Devuelve la última modificacion de un archivo
	 */
	public static String ultimaHora(File ruta) {
		
	    Date fecha = new Date(ruta.lastModified());
	    Calendar calendario = new GregorianCalendar();
	    calendario.setTime(fecha);
	    
	    String dia = Integer.toString(calendario.get(Calendar.DATE));
	    String mes = Integer.toString(calendario.get(Calendar.MONTH));
	    String annio = Integer.toString(calendario.get(Calendar.YEAR));
	    String hora = Integer.toString(calendario.get(Calendar.HOUR_OF_DAY));
	    String minuto = Integer.toString(calendario.get(Calendar.MINUTE));
	    String segundo = Integer.toString(calendario.get(Calendar.SECOND));
	    
	    
	    String horaString = "última modificación a las "+ hora + " horas y "+ minuto + " minutos";
	    
		return horaString;

	}

}
