package tema10.HojaEjercicios2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Catorce {

	public static void main(String[] args) {
		
		List<Integer> moda1 = new ArrayList<Integer>(Arrays.asList(2, 3, 3, 3, 4, 5, 4, 6, 4));
		
		System.out.println(obtieneListaModa(moda1));

	}
	
	public static List<Integer> obtieneListaModa(List<Integer> listaElementos){
		
		Map<Integer, Integer> mapAuxMap = new HashMap<Integer, Integer>();
		
		for (Integer integer : listaElementos) {
			mapAuxMap.put(integer, 0);
		}
		
		for (Integer integer : listaElementos) {
			mapAuxMap.replace(integer, mapAuxMap.get(integer)+1);
		}
		
		int maxi = Collections.max(mapAuxMap.values());
		
		listaElementos.clear();
		for (Entry<Integer, Integer> map: mapAuxMap.entrySet()) {
			if(map.getValue()==maxi) {
				listaElementos.add(map.getKey());
			}
		}
		
		return listaElementos;
	}

}
