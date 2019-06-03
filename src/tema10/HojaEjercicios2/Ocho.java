package tema10.HojaEjercicios2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ocho {

	public static void main(String[] args) {
		
		Set<String> listaCadenaStrings = new HashSet<String>(Arrays.asList("Manuel", "pedro", "Carlos", "miguel", "Carlos jose"));
		
		System.out.println(maxLength(listaCadenaStrings));
		

	}
	
	public static int maxLength(Set<String> setStrs) {
		
		int valor = 0;
		int aux = 0;
		
		for(String cad: setStrs) {
			if(cad.length()> aux) {
				aux =  cad.length();
			}
			valor = aux;
		}

		return valor;
		
		
		
	}

}
