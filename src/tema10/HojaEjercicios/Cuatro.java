package tema10.HojaEjercicios;

import java.util.HashMap;
import java.util.TreeMap;

public class Cuatro {
	
	/*
	 * Modifica el ejercicio anterior para que puedas
	 *  buscar por claves con sensibilidad a
mayúsculas y minúsculas. Es decir, si buscas por la 
clave “a1234” o “A1234” debe
retornar “Steve Jobs”.
	 */
	
	public static void main(String[] args) {
		
		TreeMap<String,String> miMap2= new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		//En el tree si le decimos eso no distingue minusculas y mayusculas
		HashMap<String,String> miMap= new HashMap<>();
		
		miMap.put("a1234", "Steve Jobs");
		miMap.put("a1235", "Scott McNealy");
		miMap.put("a1236", "Jeff Bezos");
		miMap.put("a1237", "Larry Ellison");
		miMap.put("a1238", "Bill Gates");

		if(miMap.containsKey("a1235") || miMap.containsKey("A1235".toLowerCase())) {
			System.out.println(miMap.get(cambioMay("A1236")));
		}
		
		System.out.println(miMap.get("A1236".toLowerCase()));
		
		System.out.println();
	}
	
	public static String cambioMay(String key) {
		return key.toLowerCase();
	}
	
}
