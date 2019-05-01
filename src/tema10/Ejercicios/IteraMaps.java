package tema10.Ejercicios;

import java.util.HashMap;
import java.util.Map.Entry;

public class IteraMaps {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> miMap= new HashMap<>();
		
		miMap.put(1, "dam");
		miMap.put(1, "dam");
		miMap.put(2, "dam");
		
		for(Entry<Integer, String> entry: miMap.entrySet()) {
			Integer clave= entry.getKey();
			String valor= entry.getValue();
		}
		
	}
	
}
