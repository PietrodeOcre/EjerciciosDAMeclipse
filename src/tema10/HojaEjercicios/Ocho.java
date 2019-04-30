package tema10.HojaEjercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ocho {
	
	/*Escribe un método que dada una colección Set de Strings, retorne la longitud de la
	 * cadena más larga de dicho conjunto. Si el método recibe una colección vacía, debe
	 * retornar 0. El prototipo de la función es el siguiente:
	 * public static int maxLength(Set<String> setStrs)
	 */
	
	public static void main(String[] args) {
		
		Set<String> listado = new HashSet<String>();
		
		listado.add("Manuel");
		listado.add("Javier");
		listado.add("Pedro");
		listado.add("Juan Miguel");
		listado.add("Enmanuelle");
		listado.add("Sabrina");
		listado.add("Maria");
		listado.add("Alejandro");
		listado.add("Carlos");
		
		
		System.out.println(maxLength(listado));
		
		
	}

	public static int maxLength(Set<String> setStrs) {
	
		String varAux = "";
		
		if(setStrs.isEmpty()) {
			return 0;
		}else {
			for(String i: setStrs) {
				if(i.length()>varAux.length()) {
					varAux=i;
				}
			}
			return varAux.length();
		}

	}
	
}
