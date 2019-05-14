package tema10.HojaEjercicios2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Cinco {

	public static void main(String[] args) {
		
		List<String> array = new ArrayList<String>(Arrays.asList("Manuel", "Pedro", "Javier", "Adolfo"));
		
		List<String> linked = new LinkedList<String>(Arrays.asList("Manuel", "Pedro", "Javier", "Adolfo"));
		
		long ini = System.nanoTime();
		
		arrayList(array);
		
		long fin = System.nanoTime();
		
		
		System.out.println("El tiempo total de la operación con ArrayList es: "+
				(fin-ini));
		
		
		long ini2 = System.nanoTime();
		
		linkedList(linked);
		
		long fin2 = System.nanoTime();
		
		
		System.out.println("El tiempo total de la operación con LinkedList es: "+
				(fin2-ini2));
		System.out.println("");
		System.out.println("El más rapido es: "+(((fin-ini)<(fin2-ini2))?"ArrayList":"LinkedList"));
		System.out.println("");
		System.out.println("El más rapido es: "+(((fin-ini)>(fin2-ini2))?" "+((fin-ini)/(fin2-ini2)) +" ":" "+((fin2-ini2)/(fin-ini)) +" ") + " veces más rapido");
		
	}

	public static void arrayList(List<String> array) {

		array.contains("Javier");

		array.remove("Pedro");

		System.out.println(array.get(1));

	}

	public static void linkedList(List<String> linked) {

		linked.contains("Javier");

		linked.remove("Pedro");

		System.out.println(linked.get(1));

	}

}
