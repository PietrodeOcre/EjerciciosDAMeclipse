package tema10.HojaEjercicios2;

import java.util.Map;
import java.util.TreeMap;

public class Cuatro {

	public static void main(String[] args) {

		Map<String, String> listaRicos = new TreeMap<>();

		listaRicos.put("a1234", "Steve Jobs");
		listaRicos.put("a1235", "Scott McNealy");
		listaRicos.put("a1236", "Jeff Bezos");
		listaRicos.put("a1237", "Larry Ellison");
		listaRicos.put("a1238", "Bill Gates");

		validos(listaRicos);

		sensitiveCase(listaRicos, "A1234");
		
	}

	public static void validos(Map<String, String> buenosRicos) {

		System.out.println(buenosRicos.get("a1234"));

		System.out.println(buenosRicos.get("A1236"));

		System.out.println(buenosRicos.get("a1238"));

	}
	
	public static void sensitiveCase(Map<String, String> ricos, String key) {
		
		System.out.println(ricos.get(key.toLowerCase()));
		
	}

}
