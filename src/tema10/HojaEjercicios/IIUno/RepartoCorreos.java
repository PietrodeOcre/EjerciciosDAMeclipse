package tema10.HojaEjercicios.IIUno;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;



public class RepartoCorreos {
	
	public static void main(String... args) {
		Direccion[] direcciones = { new Direccion("San Vicente Ferrer", 37, 28047),
				new Direccion("Barquillo", 3, 28014), new Direccion("Alcala", 45, 28014),
				new Direccion("Alcala", 45, 28014), new Direccion("San Vicente Ferrer", 35, 28047) };
		HashSet<Direccion> calles = new HashSet(Arrays.asList(direcciones)); // Completar
		System.out.println("Direcciones distintas:\n " + calles); // Sólo sale una Direccion C/ Alcalá
		Map<Integer, TreeSet<Direccion>> ordenados = new HashMap<Integer, TreeSet<Direccion>>();
		// Completar
		for (Direccion d : direcciones) {
			if (!ordenados.containsKey(d.getCodigoPostal()))
				ordenados.put(d.getCodigoPostal(), new TreeSet<Direccion>(new OrdenaPorCalleYNumero()));
			ordenados.get(d.getCodigoPostal()).add(d);
		}
		System.out.println("Direcciones por CP y Calle:\n " + ordenados);
	}
	
}
