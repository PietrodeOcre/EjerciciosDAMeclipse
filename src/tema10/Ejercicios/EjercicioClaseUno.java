package tema10.Ejercicios;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjercicioClaseUno {
	
	public static void main(String[] args) {
		
		List<String> listado = new ArrayList<String>();
		
		listado.add("Hola");
		listado.add(" el ");
		listado.add(" manu ");
		listado.add(" es ");
		listado.add(" Gay!!");
		
		/*
		int cont = 0;
		for (String string : listado) {
			listado.set(cont++, string.toUpperCase());
			System.out.println(string);
		}
		*/
		
		Iterator<String> iterator = listado.listIterator();
	    while (iterator.hasNext()) { 
	      System.out.println(iterator.next().toString().toUpperCase()); 
	    }
		
		/*
		int cont = 0;
		Iterator<String> iterator = listado.iterator();
		while (iterator.hasNext()) {
			String itera = iterator.next();
			listado.set(cont++,itera.toUpperCase());
			System.out.println(itera);
		}
		*/
		
		System.out.println(listado);
	}
	
}
