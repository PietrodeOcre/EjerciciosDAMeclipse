package tema10.HojaEjercicios.IITres;

import java.util.ArrayList;
import java.util.Iterator;

import tema3.Ejercicio.uno;

public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Double> listaArrayList = new ArrayList<Double>();
		
		listaArrayList.add(1.0);
		listaArrayList.add(2.0);
		listaArrayList.add(3.0);
		listaArrayList.add(4.0);
		
		System.out.println(listaArrayList);
		
		ArrayList<ArrayList<Integer>> alumnos = new ArrayList<>();
		
		alumnos.add(new ArrayList<Integer>());
		alumnos.add(new ArrayList<Integer>());
		alumnos.add(new ArrayList<Integer>());
		
		Iterator iterator = alumnos.iterator();
		
		int cont=0;
		ArrayList<Integer> arrayList = null;
		
		while(iterator.hasNext()) {
			arrayList = (ArrayList<Integer>) iterator.next();
			
			arrayList.add(1);
			arrayList.add(2);
			arrayList.add(3);
			arrayList.add(4);
			
		}
		
		System.out.println(alumnos);
		
		
	}

}
