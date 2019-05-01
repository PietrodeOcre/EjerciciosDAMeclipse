package tema10.HojaEjercicios;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
		reverse(lista);
		
	}
	
	public static Map<String,Integer> reverse(Map<Integer, String> mapStr){
		
		//Collections.reverse(); 
		Map<String,Integer> mapStr2 = new HashMap<>();
		String[] array = new String[mapStr.size()];
		

		for(Entry<Integer, String> entry: mapStr.entrySet()) {
			
			Integer clave= entry.getKey();
			/*
			String array= entry.getValue();
			String array = entry.getValue().lastIndexOf(valor);
			
			System.out.println(valor2);
			
			if(entry.getValue().indexOf(valor) != entry.getValue().lastIndexOf(valor)) {
				//mapStr2.put(pos,clave);	
			}
		*/
		}
		
		
		
		
		System.out.println(mapStr2);
		
		return null;

	}
	
}
