package tema10.HojaEjercicios2;

import java.util.Map;
import java.util.TreeMap;

public class Tres {

	public static void main(String[] args) {
		
		Map<String, String> listaRicos = new TreeMap<>();
		
		listaRicos.put("a1234", "Steve Jobs");
		listaRicos.put("a1235", "Scott McNealy");
		listaRicos.put("a1236", "Jeff Bezos");
		listaRicos.put("a1237", "Larry Ellison");
		listaRicos.put("a1238", "Bill Gates");
		
		validos(listaRicos);
		
		erroneos(listaRicos);
		
	}
	
	public static void validos(Map<String, String> buenosRicos) {
		
		System.out.println(buenosRicos.get("a1234"));
		
		System.out.println(buenosRicos.get("a1236"));
		
		System.out.println(buenosRicos.get("a1238"));
		
	}
	
	public static void erroneos(Map<String, String> malosRicos) {
		
		System.out.println(malosRicos.get("A1234"));
		
		System.out.println(malosRicos.get("a1236d"));
		
		System.out.println(malosRicos.get("a1239"));
		
	}

}
