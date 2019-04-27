package tema10.HojaEjercicios;

import java.util.ArrayList;
import java.util.List;

public class Seis {
	
	/*
	 * Escribe un método que reciba como parámetro un ArrayList 
	 * de Strings y reemplace
	 * cada cadena en dos iguales. Es decir, si la lista de 
	 * cadenas es {“como”, “estas”, “tu”}, la
	 * nueva lista contiene los valores {“como”, “como”, 
	 * “estas”, “estas”, “tu”, “tu”}. El
	 * prototipo de la función es el siguiente:
	 * public static void doubleList(ArrayList<String> listaCadenas)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> frase = new ArrayList<>();
		
		frase.add("como");
		frase.add("estas");
		frase.add("tu");

		doubleList(frase);
		
	}

	
	public static void doubleList(ArrayList<String> frase) {
		
		for(int i = frase.size()-1; i>=0; i--) {
			frase.add(i,frase.get(i));
		}
		
		
		
		/*
		for (int i = 0; i<frase.size(); i++) {
			if(i%2==0) {
				frase.add(i+1,frase.get(i));
			}
			
		}
		*/
		System.out.println(frase);
		
	}
	
}
