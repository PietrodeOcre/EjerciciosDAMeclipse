package tema10.HojaEjercicios;

import java.util.HashMap;
import java.util.Map;

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
		
		System.out.println(lista);
		//reverse(lista);
		
	}
	
	public static Map<String,Integer> reverse(Map<Integer, String> mapStr){
		
		//Collections.reverse(); 
		
		
		
		System.out.println(mapStr);
		
		return null;

	}
	
}
