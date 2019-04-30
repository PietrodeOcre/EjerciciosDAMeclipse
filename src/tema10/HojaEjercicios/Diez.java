package tema10.HojaEjercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Diez {
	
	/*
	 * Escribe un método que tome dos colecciones List de enteros y devuelva el
número de enteros único que tenga ambas listas.
Por ejemplo, si una lista contiene los valores {3, 7, 3, -1, 2, 3, 7, 2, 15, 15} y la otra lista
tiene los valores {-5, 15, 2, -1, 7, 15, 36}, el método debe retornar 4 (los elementos -1,
2, 7 y 15 se encuentran en ambas listas).
El prototipo de la función es el siguiente: public static int countCommon(List<Integer>
listaEnteros1, List<Integer> listaEnteros2)
Utiliza uno o más colecciones Set para el almacenamiento temporal.
	 */
	
	public static void main(String[] args) {
		
		List<Integer> array = new ArrayList<Integer>();
		array.add(3);
		array.add(7);
		array.add(3);
		array.add(-1);
		array.add(2);
		array.add(3);
		array.add(7);
		array.add(2);
		array.add(15);
		array.add(15);
		//{3, 7, 3, -1, 2, 3, 7, 2, 15, 15}
		
		
		List<Integer> array2 = new ArrayList<Integer>();
		array2.add(-5);
		array2.add(15);
		array2.add(2);
		array2.add(-1);
		array2.add(7);
		array2.add(15);
		array2.add(36);
		//{-5, 15, 2, -1, 7, 15, 36}
		
		System.out.println(countCommon(array,array2));
		
		
	}
	
	public static int countCommon(List<Integer> listaEnteros1, List<Integer> listaEnteros2) {
		
		//HashSet<Integer> listaHashEnteros1 = new HashSet<Integer>();
		//HashSet<Integer> listaHashEnteros2 = new HashSet<Integer>();
		HashSet<Integer> listaTemp = new HashSet<Integer>();
		
		//listaHashEnteros1.addAll(listaEnteros1);
		//listaHashEnteros2.addAll(listaEnteros2);
		
		//System.out.println(listaHashEnteros1.size());
		//System.out.println(listaHashEnteros2.size());
		
		for (Integer integer : listaEnteros1) {
			for (Integer integer2 : listaEnteros2) {
				if(integer == integer2) {
					listaTemp.add(integer2);
				}
			}
		}
		System.out.println(listaTemp);
		
		return listaTemp.size();
		
	}
	
}
