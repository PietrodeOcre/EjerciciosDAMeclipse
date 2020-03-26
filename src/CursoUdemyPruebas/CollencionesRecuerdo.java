package CursoUdemyPruebas;

import java.util.ArrayList;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollencionesRecuerdo {

	public static void main(String[] args) {
		
		/*
		 * Recuerdo de Listas no ordenadas
		 * que permiten elementos repetidos
		 */
		List<Object> miListaList = new ArrayList<Object>();
		miListaList.add(1);
		miListaList.add(2);
		miListaList.add(3);
		miListaList.add(4);
		miListaList.add(2,"hola");//Nota, podemos elegir la posicion donde inserter el elemento
		
		System.out.println(miListaList.toString());

		imprimirLista(miListaList);
		System.out.println("");
		
		/*
		 * Recuerdo de Listas ordenadas
		 * que no permiten elementos repetidos
		 */
		Set<Object> miSetColecction = new HashSet<Object>();
		miSetColecction.add(1);
		miSetColecction.add(2);
		miSetColecction.add(3);
		miSetColecction.add(4);
		miSetColecction.add("hola");
		miSetColecction.add(3);
		miSetColecction.add("hola");
		
		/*
		 * Los ele,mentos repetidos 
		 * no de graban en la lista
		 */
		imprimirLista(miSetColecction);
		
		System.out.println("");
		
		/*
		 * Usamos clave, valor para añadir 
		 * elementos
		 */
		Map<Integer, String> miMapa = new HashMap<Integer, String>();
		miMapa.put(1, "Juan");
		miMapa.put(2, "Pedro");
		miMapa.put(3, "Miguel");
		miMapa.put(4, "Roberto");
		miMapa.put(3, "Rosario");
		
		System.out.println("Elementos: " + miMapa.keySet() + ", Valores: " + miMapa.values());
		System.out.println("");
		
		for (int i = 0; i < miMapa.size()+1; i++) {
			if(miMapa.containsKey(i)) {
				System.out.println("Elemento: " + i + ", Valor: " + miMapa.get(i));
			}
			
		}
		
		
	}
	
	public static void imprimirLista(Collection<Object> miSetColecction) {
		/*
		 * Recuerdo de foreach en Listas dinamicas
		 */
		int i = 1;
		for (Object object : miSetColecction) {
			System.out.println("Elemento: " + i + ", Valor: " + object.toString());
			i++;
		}
		
	}

}
