package tema10.HojaEjercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Nueve {
	
	/*
	 * Escribe un método que dado una colección List de enteros como parámetro,
devuelva el número de enteros únicos de la lista. Por ejemplo, si la lista contiene los
valores {3, 7, 3, -1, 2, 3, 7, 2, 15, 15}, el método debe retornar el valor 5.
Utiliza una colección Set para el para el almacenamiento temporal en este ejercicio.
El prototipo del método tiene que ser el siguiente: public static int
countUnique(List<Integer> listaEnteros)
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
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
		
		System.out.println(countUnique(array));
		
		
	}
	
	/*
	 * Devuelve el número de elementos únicos de una lista
	 */
	public static int countUnique(List<Integer> listaEnteros) {		
		HashSet<Integer> lista = new HashSet<Integer>();		
		lista.addAll(listaEnteros);
		return lista.size();		
	}
	
}
