/*
 * Escribe un método que elimine los elementos de las posicines 
 * pares de una colección 
 * 
 * de cadenas arrayList. Por ejemplo:
 * ArrayList inicial: 5  6  7  19  2  4            
 * ArrayList final:   6   19   4
 * El prototipo de la función es la siguiente:public static 
 * eliminaParesArrayList(ArrayList<String>listaCadenas)
 */

package tema10.HojaEjercicios;

import java.util.ArrayList;
import java.util.List;



public class Uno {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> array = new ArrayList<String>();
		//5 , 6 , 7,  19  ,2 , 4 
		array.add("5");
		array.add("6");
		array.add("7");
		array.add("19");
		array.add("2");
		array.add("4");
		
		eliminaParesArrayList(array);
		
		
	}
	
	public static void eliminaParesArrayList(ArrayList<String> listaCadenas) {
		
		for(int i = listaCadenas.size()-1; i>=0; i--) {
			if(i%2==0) {
				listaCadenas.remove(i);
			}
		}
		
		for(int i = 0; i< listaCadenas.size(); i++) {
			System.out.println(listaCadenas.get(i));
		}
	}
}
