package tema10.HojaEjercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Siete {
	
	/*
	 * Escribe un método en Java que tome como parámetro un 
	 * ArrayList de cadenas y elimine los duplicados de la lista, 
	 * devolviendo la nueva lista sin duplicados. 
	 * Por ejemplo, si la lista contiene los valores: 
	 * {“ser”, “ser”, “es”, “no”, “o”, “pregunta”, 
	 * “que”, “el”, “a”, “a”}, la lista final deberá contener 
	 * los valores: {“ser”, “es”, “no”, “o”, “pregunta”, 
	 * “que”, “el”, “a”}. El prototipo del método debe 
	 * ser el siguiente: public ArrayList<String> 
	 * eliminaDuplicados(ArrayList<String> listaElementos) 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> frase = new ArrayList<String>();
		
		frase.add("ser");
		frase.add("ser");
		frase.add("es");
		frase.add("no");
		frase.add("o");
		frase.add("pregunta");
		frase.add("que");
		frase.add("el");
		frase.add("a");
		frase.add("a");
	
		System.out.println(eliminaDuplicados2(frase));
		

	}

	public static ArrayList<String> eliminaDuplicados(ArrayList<String> frase){
		
	    LinkedHashSet<String> hs = new LinkedHashSet<>();
	    /*
	    for (int i=0; i< frase.size(); i++) {
			if(frase.containsAll(frase.get(i))){
				frase.remove(frase.get(i));
			}
		}*/
	
	    //hs.addAll(frase);
	    
	    //ArrayList<String> frase2 = new ArrayList<String>(hs);
	    
	    
	    hs.addAll(frase);
	    frase.clear();
	    frase.addAll(hs);
	    
		
		return frase;
		
	}
	
	public static ArrayList<String> eliminaDuplicados2(ArrayList<String> listaElementos){

		for (int i = 0; i < listaElementos.size(); i++) {
			for (int j = i + 1; j < listaElementos.size(); j++) {
				if (listaElementos.get(i).equals(listaElementos.get(j))) {
					listaElementos.remove(j);
				}

			}

		}

		return listaElementos;
	}

}
