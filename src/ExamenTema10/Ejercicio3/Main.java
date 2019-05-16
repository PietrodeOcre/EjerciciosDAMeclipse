package ExamenTema10.Ejercicio3;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		
		
		GestorImpuestos gi = new GestorImpuestos();
		gi.anadeInmueble(28003, new Apartamento("Alenza 12 5C", 250000, "Vivienda habitual"));
		gi.anadeInmueble(28003, new Local("Alenza 12 Bajo", 150000, 145));
		gi.anadeInmueble(28001, new Apartamento("Ayala 7 3A", 570000, "Segunda vivienda"));
		gi.anadeInmueble(28001, new Apartamento("Ayala 7 3B", 575000, "Alquiler"));
		gi.anadeInmueble(28001, new Local("Ayala 7 Bajo", 270000, 445));
		System.out.println(gi);
		System.out.println("Total impuestos: "+gi.totalImpuestos() + " €");

	}

}
