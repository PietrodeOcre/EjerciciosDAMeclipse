package ExamenTema10.Uno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Uno {

	public static void main(String[] args) {
		
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
	
	public static int obtieneCaracteresPalabraMenosRepetida ( List<String> listaCadena ) {
		
		int num = 0;
		
		for (int i = 0; i < listaCadena.size(); i++) {
			
			if (listaCadena.indexOf(listaCadena.get(i)) == listaCadena.lastIndexOf(listaCadena.get(i))) {
				
				num = listaCadena.get(i).length();
			
				if(num>listaCadena.get(i).length()) {
				
					
					return num;

				}
				
			}

		}

		return num;
		
	}

}
