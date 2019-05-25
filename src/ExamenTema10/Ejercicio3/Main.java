package ExamenTema10.Ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	public static void main(String args[]) {
		GestorImpuestos gi = new GestorImpuestos();
		// A�adir un apartamento al CP 28003, con valor 250000�, vivienda habitual
		// (c�digo A-1)
		gi.anadeInmueble(28003, new Apartamento("Alenza 12 5C", 250000, "Vivienda habitual"));
		// A�adir un local al CP 28003, con valor 150000�, y 145m^2 (c�digo L-2)
		gi.anadeInmueble(28003, new Local("Alenza 12 Bajo", 150000, 145));
		gi.anadeInmueble(28001, new Apartamento("Ayala 7 3A", 570000, "Segunda vivienda"));
		gi.anadeInmueble(28001, new Apartamento("Ayala 7 3B", 575000, "Alquiler"));
		gi.anadeInmueble(28001, new Local("Ayala 7 Bajo", 270000, 445));
		System.out.println(gi);
		System.out.println("Total impuestos: " + gi.totalImpuestos() + " )");

	}

}