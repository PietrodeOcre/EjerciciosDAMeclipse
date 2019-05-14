package tema10.HojaEjercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Veinte {
	
	/*
	 * Tenemos una lista de entros
	 * 
	 * En la lista ahi multiplos de 4 y con minimo 4 elementos
	 * 
	 * 23=Primavera 25=Verano 35=Otoño 38=Invierno
	 * 
	 * Sacar la estacion que tiene la temperatura mas alta.
	 * 
	 */
	
	public static void main(String[] args) {
		
		List<Integer> temperaturasIntegers = new ArrayList<Integer>();
		
		temperaturasIntegers.add(0);
		temperaturasIntegers.add(23);
		temperaturasIntegers.add(7);
		temperaturasIntegers.add(8);
		temperaturasIntegers.add(38);
		temperaturasIntegers.add(5);
		temperaturasIntegers.add(5);
		temperaturasIntegers.add(7);
		
		System.out.println(devuelveEstacion(temperaturasIntegers));
		
	}
	
	
	public static String devuelveEstacion(List<Integer> listaTemp) {
		
		String estacion = "";
		
		int mas = Collections.max(listaTemp);
		
		int numTemp = 0;
		
		if(listaTemp.size()%4==0) {
			numTemp = listaTemp.size()/4;
		}
		
		int cont = 0;
		
		/*
		//for (int i = 0; i < 4; i++) {
			if(listaTemp.subList(0, numTemp).contains(max)) {
				estacion = "Primavera";
			}
			if(listaTemp.subList(numTemp, numTemp+2).contains(max)) {
				estacion = "Verano";
			}
			if(listaTemp.subList(numTemp, numTemp+2).contains(max)) {
				estacion = "Otoño";
			}
			if(listaTemp.subList(numTemp, numTemp+2).contains(max)) {
				estacion = "Invierno";
			}*/
		//}
		/*if(cont == 1) {
			estacion = "Primavera";
		}
		if(cont == 2) {
			estacion = "Verano";
		}
		if(cont == 3) {
			estacion = "Otoño";
		}
		if(cont == 4) {
			estacion = "Invierno";
		}*/
		
		ArrayList<String> estaciones = new ArrayList<String>();
		estaciones.add("Primavera");
		estaciones.add("Verano");
		estaciones.add("Otoño");
		estaciones.add("Invierno");
		
		for (String aux: estaciones) {
			for (int i = 0; i < numTemp; i++) {
				if(listaTemp.get(cont)==mas) {
					//System.out.println("La maxima estacion es" + Collections.max(mas));
					
				}
			}
		}
		
		return estacion;
		
	}
	
}
