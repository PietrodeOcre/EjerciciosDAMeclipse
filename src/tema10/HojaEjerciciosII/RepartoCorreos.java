package tema10.HojaEjerciciosII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class RepartoCorreos {

	public static void main(String[] args) {
		Direccion[] direcciones = { 
				new Direccion("San Vicente Ferrer", 37, 28047), 
				new Direccion("Barquillo", 3, 28014),
				new Direccion("Alcala", 45, 28014),
				new Direccion("Alcala", 45, 28014),
				new Direccion("San Vicente Ferrer", 35, 28047)
				};
		ArrayList<String> calles = new ArrayList<String>(Arrays.asList(direcciones.toString())); 
		// Completar
		System.out.println("Direcciones distintas:\n "+calles);
		// Sólo sale una Direccion C/ Alcalá
		Map ordenados = new TreeMap(new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		// Completar
		for (Direccion d : direcciones) {
			if (!ordenados.containsKey(d.getCodigoPostal())) {
				ordenados.put(d.getCodigoPostal(), new TreeSet<Direccion>(new OrdenaPorCalleYNumero())); 
				ordenados.get(d.getCodigoPostal()).add(d);
			}
		}
	
		System.out.println("Direcciones por CP y Calle:\n "+ordenados);
	}
	
}
