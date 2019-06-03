package tema10.HojaEjercicios2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Doce {

	public static void main(String[] args) {
		
		List<String> listaCad = new ArrayList<String>(Arrays.asList("hola", "examen", "hola"));
		
		
		System.out.println(retornaMapAsociado(listaCad));

	}
	
	
	/*
	 * Cuenta el numero de veces que aparece una palabra en una lista
	 * (Serviria para decir cuantas veces se repite una palabra en un texto)
	 */
	public static Map<String,Integer> retornaMapAsociado(List<String> listaStr){		
		Map<String, Integer> mapAux = new HashMap<String, Integer>();
		int cont = 0;
		for (String string : listaStr) {			
			if (listaStr.contains(string)) {
				mapAux.put(string, cont++);
			}else {
				mapAux.put(string, 1);
			}
		}
		return mapAux;		
	}

}
