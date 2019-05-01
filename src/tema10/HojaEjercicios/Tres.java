package tema10.HojaEjercicios;

import java.util.HashMap;
import java.util.Map.Entry;

public class Tres {

	/*
	 * Crea un Map que asocie ID ́s de empleados con nombres según la siguiente tabla:
	 * 
	 * Haz diferentes casos de prueba para comprobar válidos e inválidos ID ́s y se imprima el
nombre correspondiente.
	 */
	
	public static void main(String[] args) {
		
		HashMap<String,String> miMap= new HashMap<>();
		
		miMap.put("a1234", "Steve Jobs");
		miMap.put("a1235", "Scott McNealy");
		miMap.put("a1236", "Jeff Bezos");
		miMap.put("a1237", "Larry Ellison");
		miMap.put("a1238", "Bill Gates");
		
		System.out.println(miMap.containsKey("a1234"));
		System.out.println(miMap.containsKey("a1239"));

		System.out.println(miMap.get("a1236"));
		
		
		System.out.println(miMap.keySet());
		System.out.println(miMap.values());
		
		
		for(Entry<String, String> entry: miMap.entrySet()) {
			String clave= entry.getKey();
			String valor= entry.getValue();
			System.out.println("Clave-> "+clave+" | Valor-> "+valor);
		}
		
		
	}
	
}
