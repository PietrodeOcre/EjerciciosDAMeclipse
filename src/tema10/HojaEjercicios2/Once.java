package tema10.HojaEjercicios2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Once {

	public static void main(String[] args) {
		
		Map<Integer, String> mapa1 = new HashMap<>();
		//42=Marty, 81=Sue, 17=Ed, 31=Dave, 56=Ed, 3=Marty, 29=Ed
		mapa1.put(42, "Marty");
		mapa1.put(81, "Sue");
		mapa1.put(17, "Ed");
		mapa1.put(31, "Dave");
		mapa1.put(56, "Ed");
		mapa1.put(3, "Marty");
		mapa1.put(29, "Ed");
		
		System.out.println(mapa1);
		System.out.println(reverse(mapa1));
		

	}
	
	public static Map<String,Integer> reverse(Map<Integer, String> mapStr){
		
		Map<String, Integer> mapAux = new HashMap<>();

		for(Entry<Integer, String> map: mapStr.entrySet()) {
			
			for(Entry<Integer, String> map2: mapStr.entrySet()) {
				
				if(map.equals(map2)) {
					mapAux.put(map.getValue(), map.getKey());
				}

			}
	
		}

		return mapAux;
	}

}
