package tema10.HojaEjercicios2;

import java.util.ArrayList;
import java.util.List;

public class Uno {
	
	
	/*
	 * Escribe un método que elimine los pares de una colección de 
	 * cadenas arrayList. Por
ejemplo:
ArrayList inicial: 5 6 7 19 2 4
ArrayList final: 6 19 4
El prototipo de la función es la siguiente:
public static eliminaParesArrayList(ArrayList<String> listaCadenas)
	 */

	public static void main(String[] args) {
		
		List<String> cadenaIntegers = new ArrayList<String>();
		
		cadenaIntegers.add("5");
		cadenaIntegers.add("6");
		cadenaIntegers.add("7");
		cadenaIntegers.add("19");
		cadenaIntegers.add("2");
		cadenaIntegers.add("4");

		System.out.println(eliminaParesArrayList(cadenaIntegers));
		
	}
	
	public static List<String> eliminaParesArrayList(List<String> cadenaIntegers) {
		
	
		List<String> cadenaAuxList = new ArrayList<String>();
		for (int i = 0; i < cadenaIntegers.size(); i++) {
			if (i%2 != 0) {
				cadenaAuxList.add(cadenaIntegers.get(i));
			}
		}
		
		
		return cadenaAuxList;
		
	}
	
}
