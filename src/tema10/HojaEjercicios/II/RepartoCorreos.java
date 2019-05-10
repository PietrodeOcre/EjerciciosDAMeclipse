package tema10.HojaEjercicios.II;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class RepartoCorreos {
	
	public static void main(String ...args) {
		Direccion[] direcciones = { 
				new Direccion("San Vicente Ferrer", 37, 28047), 
				new Direccion("Barquillo", 3, 28014),
				new Direccion("Alcala", 45, 28014),
				new Direccion("Alcala", 45, 28014),
				new Direccion("San Vicente Ferrer", 35, 28047)
		};
		Set<Direccion> calles = new HashSet<Direccion>(Arrays.asList(direcciones)); // Completar
		System.out.println("Direcciones distintas:\n "+calles);
		// Sólo sale una Direccion C/ Alcalá
		Map<Integer, Direccion> ordenados = new TreeMap<Integer, Direccion>();
		// Completar
		for (Direccion d : direcciones) {
			//if (! ordenados.containsKey(d.getCodigoPostal()))ordenados.put(d.getCodigoPostal(), new TreeSet<Direccion>( new OrdenaPorCalleYNumero()));
				//ordenados.get(d.getCodigoPostal()).add(d);
			//}
			System.out.println("Direcciones por CP y Calle:\n "+ordenados);
		}
	}
	
}
