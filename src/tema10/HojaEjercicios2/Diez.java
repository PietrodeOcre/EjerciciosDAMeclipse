package tema10.HojaEjercicios2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Diez {

	public static void main(String[] args) {
		
		List<Integer> listaEIntegers = new ArrayList<Integer>(
				Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15
						));
		
		List<Integer> listaEIntegers2 = new ArrayList<Integer>(
				Arrays.asList(-5, 15, 2, -1, 7, 15, 36
						));
		
		System.out.println(countCommon(listaEIntegers, listaEIntegers2));
		
		
		
	}
	
	public static int countCommon(List<Integer> listaEnteros1, List<Integer> listaEnteros2) {
		
		int valor = 0;
		
		Set<Integer> listIntegers = new HashSet<>();
		
		for (Integer integer : listaEnteros1) {
			
			
			for (Integer integer2 : listaEnteros2) {
				
				if (integer.equals(integer2)) {
					
					listIntegers.add(integer);
					
				}
				
			}
			
		}
		
		valor = listIntegers.size();
		
		return valor;
		
	}

}
