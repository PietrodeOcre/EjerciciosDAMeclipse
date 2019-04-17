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
		
		TreeSet<Integer> listaNumero = new TreeSet<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer s1, Integer s2) {
				
				return s2.compareTo(s1);
			}
		});
		
		aniadeNum(listaNumero);
		
		listaNumero.stream().filter(a->(a<7)).forEach(a->System.out.println(a));
		
	}
	
}