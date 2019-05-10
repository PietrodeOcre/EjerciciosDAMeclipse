package tema10.HojaEjercicios;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Dieciseis {
	
	/*
	 * Programa un método genérico que acepte como parámetro un Map<String,
Object> y devuelva un Set con los valores almacenados en el Map. EL prototipo de la
función tiene que ser el siguiente:
public static Set<Object> retornaElementosMap(Map<String, Object> map)
	 */
	
	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("Uno", "Objeto1");
		map.put("Dos", "Objeto2");
		map.put("Tres", "Objeto3");
		map.put("Cuatro", "Objeto4");
		map.put("Cinco", "Objeto5");
		map.put("Seis", "Objeto6");
		
		System.out.println(retornaElementosMap(map));
		
	}
	
	public static Set<Object> retornaElementosMap(Map<String, Object> map){
		
		/*Set<Object> map2 = new HashSet<Object>();
		
		for(Entry<String, Object> entry: map.entrySet()) {
			map2.add(entry.getValue());
		}
		
		
		return map2;*/
		
		return new HashSet<>(map.values());
	}
	
}
