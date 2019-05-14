package tema10.HojaEjercicios2;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dos {

	public static void main(String[] args) {
		
		List<Integer> listaEnteros = new ArrayList<Integer>(Arrays.asList(3,8,92,4,2,17,9));
		
		System.out.println(listaEnteros);
		
		minimoPosicionUno(listaEnteros);
		

		
	}

	private static void minimoPosicionUno(List<Integer> listaEnteros) {

		int min = Collections.min(listaEnteros);

		int pos = listaEnteros.get(min);

		if (listaEnteros.get(min) != min) {
			pos = listaEnteros.lastIndexOf(min);
		}

		listaEnteros.remove(pos);
		Collections.reverse(listaEnteros);
		listaEnteros.add(min);
		Collections.reverse(listaEnteros);

		System.out.println(listaEnteros);
	}

}
