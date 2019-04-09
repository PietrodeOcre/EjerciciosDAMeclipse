package tema10.Ejercicios;

import java.util.HashSet;
import java.util.Set;

public class Principal {
	
	public static void main(String[] args) {
		
		Set<Empleado> hset = new HashSet<Empleado>();
		
		Empleado empleado1 = new Empleado(1, "Manuel");
		Empleado empleado2 = new Empleado(2, "Gabriel");
		Empleado empleado3 = new Empleado(3, "Alejandro");
		Empleado empleado5 = new Empleado(3, "Alejandro");
		Empleado empleado4 = new Empleado(3, "Jose");
		
		hset.add(empleado1);
		hset.add(empleado2);
		hset.add(empleado3);
		hset.add(empleado4);
		hset.add(empleado5);
		
		System.out.println(hset);
		
		
		
	}
	
}
