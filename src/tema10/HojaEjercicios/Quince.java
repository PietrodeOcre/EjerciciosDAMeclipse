package tema10.HojaEjercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Quince {
	
	/*
	 * Escribe un método genérico que reciba como parámetro 
	 * una colección de elementos y retorne una nueva colección 
	 * formada por los elementos de la original sin repetidos. 
	 * El prototipo del método debe ser el siguiente:
	 * public static Set<Integer> retornaElementosSinRepeticion(Collection<Integer> listaElementos)
	 */
	
  public static void main(String[] args) {
    Collection<Integer> listaElementos = new ArrayList<Integer>();
    listaElementos.add(1);
    listaElementos.add(1);
    listaElementos.add(2);
    listaElementos.add(2);
    listaElementos.add(3);
    listaElementos.add(3);
    listaElementos.add(1);
    listaElementos.add(1);
    listaElementos.add(2);
    listaElementos.add(2);
    listaElementos.add(3);
    listaElementos.add(3);
    System.out.println(retornaElementosSinRepeticion(listaElementos));
  }
  
  
  public static Set<Integer> retornaElementosSinRepeticion(Collection<Integer> listaElementos){
    /*Set<Integer> aux = new TreeSet<>();
    for (Integer integer : listaElementos) {
      aux.add(integer);
    }*/
    return new TreeSet<>(listaElementos);
  }
}
