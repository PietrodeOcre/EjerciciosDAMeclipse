package tema10.HojaEjercicios;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Once {
	
	/*
	 * Escribe un método que tenga como parámetro un Map<Integer, String> y
devuelva un nuevo Map<String,Integer> que sea el invertido del original. Si hay más de
una clave en el Map original que tiene el mismo valor, el valor de la clave del Map que
se devuelve será el último valor iterado del Map. Por ejemplo, si el método recibe
como parámetro el siguiente Map: 
{42=Marty, 81=Sue, 17=Ed, 31=Dave, 56=Ed, 3=Marty, 29=Ed}, el método debe retornar el 
siguiente Map 
{Marty=3, Sue=81, Ed=29, Dave=31}
. El prototipo de la función es el siguiente:
public static Map<String,Integer> reverse(Map<Integer, String> mapStr)
	 */
	
	public static void main(String[] args) {

		Map<Integer, String> lista = new HashMap<>();

		lista.put(42, "Marty");
		lista.put(81, "Sue");
		lista.put(17, "Ed");
		lista.put(31, "Dave");
		lista.put(56, "Ed");
		lista.put(3, "Marty");
		lista.put(29, "Ed");

		// System.out.println(lista);
		System.out.println(reverse(lista));

	}

	public static Map<String,Integer> reverse(Map<Integer, String> mapStr){
		
		Map<String,Integer> mapStr2 = new HashMap<>();

		int aux = 0;
		
		for(Entry<Integer, String> entry: mapStr.entrySet()) {
			
			Integer clave= entry.getKey();
			aux = clave;
			String valor = entry.getValue();

			if (mapStr.containsValue(valor)) {
				mapStr2.put(valor, clave);
	
			}
			
			if(clave<aux) {
				mapStr2.put(valor, clave);
				
			}

		}
		
		for(Entry<Integer, String> entry: mapStr.entrySet()) {
			
			Integer clave= entry.getKey();
			
			String valor = entry.getValue();

			if(clave<aux) {
				mapStr2.put(valor, clave);
				
			}

		}	

		return mapStr2;

		
	}
	
	/*
	 * // Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos atómicos
Map<Integer, String> nombreMap = new HashMap<Integer, String>();
nombreMap.size(); // Devuelve el numero de elementos del Map
nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
nombreMap.put(K clave, V valor); // Añade un elemento al Map
nombreMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
nombreMap.clear(); // Borra todos los componentes del Map
nombreMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
nombreMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
nombreMap.values(); // Devuelve una "Collection" con los valores del Map


System.out.println("********* Trabajando con los métodos de Map *********");
System.out.println("Mostramos el numero de elementos que tiene el TreeMap: treeMap.size() = "+treeMap.size());
System.out.println("Vemos si el TreeMap esta vacio : treeMap.isEmpty() = "+treeMap.isEmpty());
System.out.println("Obtenemos un elemento del Map pasandole la clave 6: treeMap.get(6) = "+treeMap.get(6));
System.out.println("Borramos un elemento del Map el 18 (porque fue sustituido): treeMap.remove(18)"+treeMap.remove(18));
System.out.println("Vemos que pasa si queremos obtener la clave 18 que ya no existe: treeMap.get(18) = "+treeMap.get(18));
System.out.println("Vemos si existe un elemento con la clave 18: treeMap.containsKey(18) = "+treeMap.containsKey(18));
System.out.println("Vemos si existe un elemento con la clave 1: treeMap.containsKey(1) = "+treeMap.containsKey(1));
System.out.println("Vemos si existe el valo 'Villa' en el Map: treeMap.containsValue("Villa") = "+treeMap.containsValue("Villa"));
System.out.println("Vemos si existe el valo 'Ricardo' en el Map: treeMap.containsValue("Ricardo") = "+treeMap.containsValue("Ricardo"));
System.out.println("Borramos todos los elementos del Map: treeMap.clear()");treeMap.clear();
System.out.println("Comprobamos si lo hemos eliminado viendo su tamaño: treeMap.size() = "+treeMap.size());
System.out.println("Lo comprobamos tambien viendo si esta vacio treeMap.isEmpty() = "+treeMap.isEmpty());
	 */
	
}
