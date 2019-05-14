package tema10.HojaEjercicios;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CatorceMaps {
	
	/*
	 * La moda es el valor (o valores) de una serie de números que más veces se repite.
Por ejemplo, la moda de la serie {2, 3, 3, 3, 4, 5, 4, 6, 4} es {3, 4}. En el caso de que no
se repita ningún valor la serie no tiene moda. Implementa un método que reciba como
parámetro una lista de números de tamaño variable y devuelva una lista que contenga
la moda de dicha serie.
El prototipo de la función tiene que ser el siguiente:
public static List<Integer> obtieneListaModa(List<Integer> listaElementos)


Hacer esta pero con Maps


	 */
	
	public static void main(String[] args) {
		
		List<Integer> arrayUno = new ArrayList<Integer>();
		arrayUno.add(2);
		arrayUno.add(3);
		arrayUno.add(3);
		arrayUno.add(3);
		arrayUno.add(4);
		arrayUno.add(5);
		arrayUno.add(4);
		arrayUno.add(6);
		arrayUno.add(4);
		//{2, 3, 3, 3, 4, 5, 4, 6, 4}
		
		//System.out.println(arrayUno);
		
		System.out.println(obtieneListaModa(arrayUno));
		
		
	}
	
	public static List<Integer> obtieneListaModa(List<Integer> listaElementos){
		
		List<Integer> listaRetornoIntegers = new ArrayList<Integer>();
		
		Map<Integer,Integer> listaElementos2 = new HashMap<Integer,Integer>();
	
		for (Integer entero: listaElementos) {
			if (listaElementos2.containsKey(entero)) {
				listaElementos2.put(entero, listaElementos.get(entero)+1);
			}else {
				listaElementos2.put(entero, 1);
			}
		}
		
		int max =  Collections.max(listaElementos2.values());

		for(Entry<Integer, Integer> entry: listaElementos2.entrySet()) {
			if(entry.getValue() == max) {
				listaRetornoIntegers.add(entry.getKey());
			}
		}
	
		return listaRetornoIntegers;
		
	}
	
}
