package tema10.HojaEjercicios2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Trece {

	public static void main(String[] args) {
		
		Map<String, Integer> asociaMap = new HashMap<String, Integer>();
		
		asociaMap.put("uno", 1);
		asociaMap.put("dos", 2);
		asociaMap.put("tres", 3);
		asociaMap.put("cuatro", 4);
		asociaMap.put("cinco", 5);
		asociaMap.put("seis", 6);
		asociaMap.put("siete", 7);
		asociaMap.put("ocho", 8);
		asociaMap.put("nueve", 9);
		asociaMap.put("diez", 10);
		
		
		System.out.println(listaAsociadaNumeroPar(asociaMap));
		
		

	}

	public static Set<String> listaAsociadaNumeroPar(Map<String, Integer> map){
		
		Set<String> cadenaSet = new HashSet<>();
		
		for(Entry<String, Integer> maps: map.entrySet()) {
			if(maps.getValue()%2==0) {
				cadenaSet.add(maps.getKey());
			}
		}
		
		return cadenaSet;
		
	}
	
}
