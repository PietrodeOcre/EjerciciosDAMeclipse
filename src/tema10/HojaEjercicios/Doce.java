package tema10.HojaEjercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Doce {
	
	/*
	 * Implementa un método en Java que a partir de un ArrayList de String ́s, retorne
un Map ordenado que asocie cadenas con el número de repeticiones en la lista. Por
ejemplo, si el método es llamado con la lista {“hola”, “examen”, “hola”} retornará un
Map ordenado que asociaría a la cadena “examen” el valor 1 y a la cadena “hola” el
valor 2.El prototipo del método es el siguiente:
public static Map<String,Integer> retornaMapAsociado(List<String> listaStr)
	 */
	
	public static void main(String[] args) {
		
		List<String> listaStr = new ArrayList<>();
		
		listaStr.add("hola");
		listaStr.add("examen");
		listaStr.add("hola");
		
		System.out.println(retornaMapAsociado(listaStr));
		
	}
	
	/*
	 * Devuelve un map con las cadenas y el numero de veces que se repite en la lista
	 */
	public static Map<String,Integer> retornaMapAsociado(List<String> listaStr){		
		Map<String,Integer> mapaAsociado = new HashMap<>();
		for (String lista : listaStr) {
			if (mapaAsociado.containsKey(lista)) {
				mapaAsociado.put(lista, mapaAsociado.get(lista) + 1);
			} else {
				mapaAsociado.put(lista, 1);
			}
		}
		return mapaAsociado;		
	}
	
}
