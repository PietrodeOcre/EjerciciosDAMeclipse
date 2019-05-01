package tema10.HojaEjercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Catorce {
	
	/*
	 * La moda es el valor (o valores) de una serie de números que más veces se repite.
Por ejemplo, la moda de la serie {2, 3, 3, 3, 4, 5, 4, 6, 4} es {3, 4}. En el caso de que no
se repita ningún valor la serie no tiene moda. Implementa un método que reciba como
parámetro una lista de números de tamaño variable y devuelva una lista que contenga
la moda de dicha serie.
El prototipo de la función tiene que ser el siguiente:
public static List<Integer> obtieneListaModa(List<Integer> listaElementos)
	 */
	
	public static void main(String[] args) {
		
		List<Integer> arrayUno = new ArrayList<Integer>();
		arrayUno.add(2);
		arrayUno.add(3);
		arrayUno.add(3);
		arrayUno.add(3);
		arrayUno.add(4);
		arrayUno.add(5);
		arrayUno.add(4);
		arrayUno.add(6);
		arrayUno.add(4);
		//{2, 3, 3, 3, 4, 5, 4, 6, 4}
		
		//System.out.println(arrayUno);
		
		System.out.println(obtieneListaModa(arrayUno));
		
		
	}
	
	
	
	public static List<Integer> obtieneListaModa(List<Integer> listaElementos){
		int maximasRepeticiones = 2;
		HashSet<Integer> aux = new HashSet<Integer>();
		if(!listaElementos.isEmpty()) {
			for (int i = 0; i < listaElementos.size(); i++) {
				int repeticiones=0;
				for (int j = 0; j < listaElementos.size(); j++) {
					if(listaElementos.get(i) == listaElementos.get(j)) {
						repeticiones++;
						if(repeticiones>maximasRepeticiones) {
							aux.clear();
							aux.add(listaElementos.get(i));
							maximasRepeticiones = repeticiones;
						}else if(repeticiones==maximasRepeticiones) {
							aux.add(listaElementos.get(i));
							maximasRepeticiones = repeticiones;
						}
					}
				}
			}
			List<Integer> moda= new ArrayList<Integer>();
			moda.addAll(aux);
			return moda;
		}
		List<Integer> sinModa= new ArrayList<Integer>();
		sinModa.add(0);
		return sinModa;
	}
	
}
