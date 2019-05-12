package tema10.HojaEjercicios.IITres;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio1 {
	 
	public static void main(String[] args) {
		
		
		Entrada e1 = new Entrada("A Rock & River", 80, Evento.MUSICAL);
		Entrada e2 = new Entrada("Mitín Electoral", 10, Evento.SOCIAL);
		Entrada e3 = new EntradaPreferente("The Globetrotters", 40.0, Evento.DEPORTIVO); 
		Entrada e4 = new EntradaPreferente("Cancer Day", 50.0, Evento.SOCIAL, "RX-69/18");
		
		
		Set<Entrada> x = new TreeSet<Entrada>();
		
		x.add(e1);
		x.add(e2);
		x.add(e3);
		x.add(e4);
		x.add(e2);
		x.add(e4);
		
		System.out.println(x); 
		
		//COMPLETAR declaración de variable x(Sección 3)
		
		

		//Se imprimen sin repetidos y ordenados por descripción
		
	}
	
}
