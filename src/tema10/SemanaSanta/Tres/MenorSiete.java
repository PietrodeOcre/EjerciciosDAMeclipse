package tema10.SemanaSanta.Tres;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class MenorSiete {
	
	public static int numAleatorio() {
		
		int num = 0;
		
		Random rd = new Random();
		
		num = rd.nextInt(100)+1;
		
		return num;
	}
	
	public static TreeSet<Integer> aniadeNum(TreeSet<Integer> listaNumero) {
		
		for(int i=0; i<100; i++) {
			listaNumero.add(numAleatorio());
		}
		
		return listaNumero;
	}
	
	public static void main(String[] args) {
		
		TreeSet<Integer> listaNumero = comparatorMetodo();
		
		aniadeNum(listaNumero);
		//Al cambiar el comparator en el treeset los headSet y el tailSet se muestran alreves...
		listaNumero.stream().filter(a->(a<7)).forEach(a->System.out.println(a));
		//System.out.println(listaNumero.headSet(7));//muestra os que son menor que 7
		//System.out.println(listaNumero.tailSet(7));//muestra os que son igual o mayor que 7
		
	}

	/*
	 * Implementación de comparator en un TreeSet
	 */
	private static TreeSet<Integer> comparatorMetodo() {
		TreeSet<Integer> listaNumero = new TreeSet<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer s1, Integer s2) {
				
				return s2.compareTo(s1);
			}
		});
		return listaNumero;
	}
	
}
