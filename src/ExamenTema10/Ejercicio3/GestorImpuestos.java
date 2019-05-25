package ExamenTema10.Ejercicio3;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class GestorImpuestos {

	Map<Integer, TreeSet<Inmueble>> inmuebles = new TreeMap<>();
	
	public void anadeInmueble(int i, Inmueble inmueble) {
		// TODO Auto-generated method stub
		if (inmuebles.containsKey(i)) {
			inmuebles.get(i).add(inmueble);
		}
		else {
			inmuebles.put(i, new TreeSet<>());
			inmuebles.get(i).add(inmueble);
		}
	}

	public double totalImpuestos() {
		// TODO Auto-generated method stub
		double sumaImpuestos = 0.0;
		for (Entry<Integer, TreeSet<Inmueble>> entry:inmuebles.entrySet()) {
			
		
				TreeSet<Inmueble> lista = entry.getValue();
				for (Inmueble inmueble:lista) {
					sumaImpuestos = sumaImpuestos + inmueble.totalImpuestos();
				}
			
			
			
		}
		return sumaImpuestos;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return inmuebles.toString();
	}

	
	 
}
