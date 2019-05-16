package ExamenTema10.Ejercicio3;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class GestorImpuestos {
	
	
	TreeSet<Inmueble> inmuebles2 = new TreeSet<Inmueble>();
	
	Map<Integer,TreeSet<Inmueble>> inmuebles = new TreeMap<Integer,TreeSet<Inmueble>>();
	
	public void anadeInmueble(int codigoPostal, Inmueble inmueble) {
		
		TreeSet<Inmueble> inmuebles3 = new TreeSet<Inmueble>(inmuebles2);
		
		inmuebles3.add(inmueble);
		
		inmuebles2 = new TreeSet<Inmueble>(inmuebles3);
		
		inmuebles.put(codigoPostal, inmuebles2);
	}
	public double totalImpuestos() {
		
		double valorTotal = 0;
		
		for (Inmueble iterable_element : inmuebles2) {

			valorTotal =  valorTotal + iterable_element.totalImpuestos();

		}
		
		return valorTotal;
		
	}
	@Override
	public String toString() {
		return "Salida: \n" + inmuebles + "]\n";
	}
	
	
	
}
