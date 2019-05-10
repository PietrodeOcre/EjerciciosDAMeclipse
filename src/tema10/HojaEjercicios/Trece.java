package tema10.HojaEjercicios;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Trece {

	/*
	 * Escribe un método en Java que tenga como parámetro un Map que asocia
cadenas con enteros y que devuelva un conjunto Set de cadenas que tienen asociado
un número par. El prototipo de la función es el siguiente:
public static Set<String> listaAsociadaNumeroPar(Map<String, Integer> map)
	 */
	
	public static void main(String[] args) {
		
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("hola", 1);
		map.put("que", 2);
		map.put("tal", 3);
		map.put("como", 4);
		map.put("estas", 5);
		map.put("di", 6);
		map.put("tu", 7);
		map.put("nombre", 8);
		
		System.out.println(listaAsociadaNumeroPar(map));
		
	}
	 
	
	public static Set<String> listaAsociadaNumeroPar(Map<String, Integer> map){
		
		Set<String> pares = new HashSet<>();
		
		for(Entry<String, Integer> entry: map.entrySet()) {
			if(entry.getValue()%2 == 0) {
				pares.add(entry.getKey());
			}
		}
		
		return pares;
		
	}
	
}
