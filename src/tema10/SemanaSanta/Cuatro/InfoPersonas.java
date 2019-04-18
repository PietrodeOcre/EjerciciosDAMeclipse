package tema10.SemanaSanta.Cuatro;

import java.util.TreeSet;

public class InfoPersonas {
	
	public static void main(String[] args) {
		
		Persona persona1 = new Persona(1,"Manuel","Corral");
		Persona persona2 = new Persona(4,"Manuel","Perez");
		Persona persona3 = new Persona(2,"Javier","Sanchez");
		Persona persona4 = new Persona(3,"Pedro","Labriego");
		Persona persona5 = new Persona(6,"Julia","Peralta");
		Persona persona6 = new Persona(7,"Daniela","Rocha");
		Persona persona7 = new Persona(5,"Adolfo","Peregrino");

		TreeSet<Persona> listadoPersonal = new TreeSet<Persona>();
		
		listadoPersonal.add(persona1);
		listadoPersonal.add(persona2);
		listadoPersonal.add(persona3);
		listadoPersonal.add(persona4);
		listadoPersonal.add(persona5);
		listadoPersonal.add(persona6);
		listadoPersonal.add(persona7);
		
		//Imprimimos el listado completo
		System.out.println(listadoPersonal);
		
		System.out.println("");
		
		//Ejecutamos el método
		muestraInfoPersonas(listadoPersonal);
	}
	
	public static void muestraInfoPersonas(TreeSet<Persona> listadoPersonal) {

		int cont = 0;
		for (Persona persona : listadoPersonal) {

			if ((persona.equals(listadoPersonal.first())) || (persona.equals(listadoPersonal.last()))) {
				continue;
			} else if (cont % 2 != 0) {
				System.out.println(persona);
			}
			++cont;
		}

	}
	
}
