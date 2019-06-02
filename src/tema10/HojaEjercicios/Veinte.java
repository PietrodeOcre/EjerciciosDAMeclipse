package tema10.HojaEjercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ExamenTema10.Dos.Colecciones;

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
		
		ArrayList<String> estaciones = new ArrayList<String>();
		estaciones.add("Primavera");
		estaciones.add("Verano");
		estaciones.add("Otoño");
		estaciones.add("Invierno");
		
		for (String aux: estaciones) {
			for (int i = 1; i <= numTemp; i++) {
				if(listaTemp.get(i+cont) == mas) {
					return estaciones.get(i);	
				}
			}
			cont+=2;
		}		
		return estacion;		
	}
	
}
