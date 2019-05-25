package ExamenTema10.Uno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ejercicio1 {

	public static void main(String[] args) {

		System.out.println(obtieneCaracteresPalabraMenosRepetida(
				Arrays.asList("Maria", "Luis", "Maria", "Pedro", "Luis", "Pedro")));
		
		List<String> listaNombre = new ArrayList<String>(
				Arrays.asList("Maria", "Luis", "Maria", "Pedro","Luis"));
		
		List<String> listaNombre2 = new ArrayList<String>(
				Arrays.asList("Nora", "Valentina"));
		
		List<String> listaNombre3 = new ArrayList<String>(
				Arrays.asList("Nora", "Valentina", "Nora"));
		
		System.out.println(obtieneCaracteresPalabraMenosRepetida(listaNombre));
		
		System.out.println(obtieneCaracteresPalabraMenosRepetida(listaNombre2));
		
		System.out.println(obtieneCaracteresPalabraMenosRepetida(listaNombre3));

	}

	public static int obtieneCaracteresPalabraMenosRepetida(List<String> listaCadenas) {

		Map<String, Integer> repeticiones = new HashMap<>();
		//Establecemos las repeticiones de cada palabra
		for (String cadena : listaCadenas) {
			if (!repeticiones.containsKey(cadena)) {
				repeticiones.put(cadena, 1);
			} else {
				repeticiones.put(cadena, repeticiones.get(cadena) + 1);
			}

		}

		int numRepeticiones = Integer.MAX_VALUE;
		List<String> palabrasConMenosRepeticion = new ArrayList<String>();
		for (Entry<String, Integer> entrada : repeticiones.entrySet()) {

			//Si encontramos un registro con menor numero de repeticiones,
			//eliminamos la lista de valores que estabamos acumulando,
			//y agregamos el nuevo valor
			if (entrada.getValue() < numRepeticiones) {
				numRepeticiones = entrada.getValue();
				palabrasConMenosRepeticion.clear();
				palabrasConMenosRepeticion.add(entrada.getKey());
			} else if (entrada.getValue() == numRepeticiones) {
				palabrasConMenosRepeticion.add(entrada.getKey());
			}

		}
		return Collections.min(palabrasConMenosRepeticion).length();

	}

}
