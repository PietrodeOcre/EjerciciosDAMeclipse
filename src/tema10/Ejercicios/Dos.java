package tema10.Ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Dos {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayUno = new ArrayList<Integer>();
		arrayUno.add(3);
		arrayUno.add(7);
		arrayUno.add(3);
		arrayUno.add(-1);
		arrayUno.add(2);
		arrayUno.add(3);
		arrayUno.add(7);
		arrayUno.add(2);
		arrayUno.add(15);
		arrayUno.add(15);
		//{3, 7, 3, -1, 2, 3, 7, 2, 15, 15}
		
		System.out.println(arrayUno);
		
		encontrarRepetidos(arrayUno);
		
		
	}

	public static void encontrarRepetidos(ArrayList<Integer> listaNum) {

		int aux = 0;

		
		HashSet<Integer> listaAux = new HashSet<Integer>();
		
		for (int i = 0; i < listaNum.size()-1; i++) {

			if (listaNum.get(i) == listaNum.get(i+1)) {
				aux++;
				listaAux.add(listaNum.get(i));
			}
		}
		System.out.println("Los números repetidos son: " + listaAux);
		System.out.println("El numero de elementos repetidos es : " + aux);

	}
	
	
	
}
