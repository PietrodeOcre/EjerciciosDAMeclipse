package tema10.Ejercicios;

import java.util.HashSet;
import java.util.Set;

public class Uno {

	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		set.add("Neymar");
		set2.add("Piqué");
		set2.add("Busquet");
		
		for(String jugador:set) {
			System.out.println(jugador);
		}
		
		System.out.println(set.contains("Neymar"));
		
		System.out.println(set.containsAll(set2));
		
		set.addAll(set2);
		
		System.out.println(set);
		
		set2.clear();
		
		System.out.println(set2.size());
		
	}
}
