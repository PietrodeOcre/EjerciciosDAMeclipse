package tema10.SemanaSanta;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public abstract class VehiculoMotor implements Vehiculo {
	
	private String marca;
	private int numRuedas;
	private SortedSet<String> caracteristicasVehiculo = new TreeSet<String>(new Comparator<String>() {
		@Override
		public int compare(String s1, String s2) {
			return s2.compareTo(s1);
		}
	});

	public VehiculoMotor(String marca, int numRuedas, TreeSet<String> caracteristicasVehiculo) {
		super();
		this.marca = marca;
		this.numRuedas = numRuedas;
		this.caracteristicasVehiculo = caracteristicasVehiculo;
	}

	public void imprimeCaracteristicas() {
		
		for (String caract : caracteristicasVehiculo) {
			System.out.println(caract);
		}
		
	}
	
	public void ImprimeOtrasCaracteristicas(String caracteristicas) {
		
		for (String caract : caracteristicasVehiculo) {
			if(caract.equals(caracteristicas)) {
				continue;
			}else {
				System.out.println(caract);
			}
			
		}
		
	}
	
	
}
