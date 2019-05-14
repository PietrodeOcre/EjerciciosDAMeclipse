package tema10.HojaEjercicios2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Nueve {

	public static void main(String[] args) {
		
		
		List<Integer> listaEIntegers = new ArrayList<Integer>(
				Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15
						));
		
		System.out.println(countUnique(listaEIntegers));

	}
	
	public static int countUnique(List<Integer> listaEnteros) {
		
		int valor = 0;
		
		Set<Integer> numIntegers = new HashSet<Integer>(listaEnteros);

		int aux = 0;
		
		for(Integer entInteger: numIntegers) {

				aux=entInteger;
				if(entInteger==aux) {
					valor++;
				}else {
					valor=1;
				}
			
		}

		return valor;
		
	}

}
