package tema10.Ejercicios;

import java.util.HashSet;
import java.util.Scanner;

public class EjercicioClase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Escribe el numero de pares:");
		int cont = sc.nextInt();

		HashSet<String> cadenasNombre = new HashSet<String>(cont);

		do {

			String par = sc1.nextLine(); // devuelve el elemento
			cadenasNombre.add(par);
			System.out.println(cadenasNombre.size());
			cont--;
		} while (cont > 0);
		
		Scanner cs3 = new Scanner(System.in);
		int num = cs3.nextInt();
		String[] par_izq = new String[num];
		String[] par_der = new String[num];
		
		for (int i = 0; i < num; i++) {
			par_izq[i] = cs3.next();
			par_der[i] = cs3.next();
		}
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < par_izq.length; i++) {
			set.add(par_izq[i]+" "+par_der[i]);
			System.out.println(set.size());
		}
		
	}
	
}
