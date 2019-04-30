package tema10.Ejercicios;

import java.util.LinkedList;

public class Rendimiento {
	public static void main(String[] args) {

		LinkedList<Integer> listaEnteros = new LinkedList<>();
		/*ArrayList<Integer> listaEnteros =
				new ArrayList<>();*/
		
		for (int i=0;i<10000000;i++) {
			listaEnteros.add(i);
		}
		
		long ini = System.currentTimeMillis();
		
		/*System.out.println("Elemento de la mitad: " + 
				listaEnteros.get(listaEnteros.size()/2));*/
		//listaEnteros.add(listaEnteros.size()/2, 7787);
		//listaEnteros.remove(listaEnteros.size()/2);
		listaEnteros.remove(0);
		long fin = System.currentTimeMillis();
		
		System.out.println("El tiempo total de la operación es: "+
				(fin-ini));
		
	}
}
