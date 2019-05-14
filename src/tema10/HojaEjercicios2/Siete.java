package tema10.HojaEjercicios2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Siete {

	public static void main(String[] args) {
		
		List<String> listaCadenaList = new ArrayList<String>(Arrays.asList("ser", "ser", "es", "no", "o", "pregunta", "que", "el", "a", "a"));

		System.out.println(eliminaDuplicados(listaCadenaList));
		
	}
	
	public static ArrayList<String> eliminaDuplicados(List<String> listaCadenaList){
		
		Set<String> dupliSet = new HashSet<String>(listaCadenaList);
		listaCadenaList.clear();
		listaCadenaList = new ArrayList<String>(dupliSet);
		
		return (ArrayList<String>) listaCadenaList;
	}

}
