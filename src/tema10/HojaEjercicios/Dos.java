package tema10.HojaEjercicios;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Dos {

	/*
	 *  Escribe un método que apartir de una lista de enteros (ArrayList) y mueva el mínimo valor
	 *   al frente de la lista preservando el orden de los elementos. Por ejemplo, si tenemos una 
	 *   lista con los valores:{3, 8, 92, 4, 2, 17, 9}, si llamamos a este nuevo método, la lista 
	 *   final tendrá los siguientes valores: {2, 3, 8, 92, 4, 17, 9}. Se asume que la lista debe 
	 *   almacenar al menos un valor
	 */
	
	public static void main (String[] args) {
		
		List<Integer> arrayUno = new ArrayList<Integer>();
		
		// {3, 8, 92, 4, 2, 17, 9}
		arrayUno.add(3);
		arrayUno.add(8);
		arrayUno.add(92);
		arrayUno.add(4);
		arrayUno.add(2);
		arrayUno.add(17);
		arrayUno.add(3);
		arrayUno.add(9);
		
		//menorPosUno(arrayUno);
		
		intercambioPos(arrayUno);
		
	}

	/*
	 * Coloca en la posicion 0 de una lista el elemento menor
	 * de la misma
	 */
	public static void intercambioPos(List<Integer> arrayUno) {
		Integer menorElemento = Collections.min(arrayUno);
		int pos = arrayUno.indexOf(menorElemento);
		Collections.swap(arrayUno, pos, 0);
		System.out.println(arrayUno);
	}

	public static void menorPosUno(List<Integer> arrayUno) {
		Integer menorElemento = Collections.min(arrayUno);
		int pos = arrayUno.indexOf(menorElemento);
		arrayUno.remove(pos);
		
		//System.out.println(arrayUno);
		
		Collections.reverse(arrayUno);
		arrayUno.add(menorElemento);
		
		//System.out.println(arrayUno);
		Collections.reverse(arrayUno);
		System.out.println(arrayUno);
	}
	
	
	
}
