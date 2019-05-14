package tema10.HojaEjercicios2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Seis {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>(Arrays.asList("como", "estas", "tu"));
		
		
		doubleList(arrayList);

	}
	
	public static void doubleList(List<String> listaCadenas) {

		List<String> arrayList = new ArrayList<String>();
		
		int cont = 0;
		for (int i = 0 ; i< listaCadenas.size(); i++) {

			if(i%2 == 0) {
				listaCadenas.add(cont, listaCadenas.get(i));
			}
			cont++;

		}
		
		System.out.println(listaCadenas);
		
	}

}
