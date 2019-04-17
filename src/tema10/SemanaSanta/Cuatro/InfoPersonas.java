package tema10.SemanaSanta.Cuatro;

import java.util.TreeSet;

public class InfoPersonas {
	
	public static void main(String[] args) {
		
		Persona persona1 = new Persona(1,"Manuel","Corral");
		Persona persona2 = new Persona(1,"Manuel","Perez");
		Persona persona3 = new Persona(1,"Javier","Sanchez");
		Persona persona4 = new Persona(1,"Pedro","Labriego");
		Persona persona5 = new Persona(1,"Julia","Peralta");
		Persona persona6 = new Persona(1,"Daniela","Rocha");
		Persona persona7 = new Persona(1,"Adolfo","Peregrino");

		TreeSet<Persona> listadoPersonal = new TreeSet<Persona>();
		
		listadoPersonal.add(persona1);
		listadoPersonal.add(persona2);
		listadoPersonal.add(persona3);
		listadoPersonal.add(persona4);
		listadoPersonal.add(persona5);
		listadoPersonal.add(persona6);
		listadoPersonal.add(persona7);
		
		System.out.println(listadoPersonal);
	}
	
	public static void muestraInfoPersonas(TreeSet<Persona> listadoPersonal) {
		
		
		
	}
	
}
