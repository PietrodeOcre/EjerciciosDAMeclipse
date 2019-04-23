package tema10.SemanaSanta.Uno;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class VehiculoMotor implements Vehiculo {
	
	protected String marca;
	protected int numRuedas;
	protected Set<String> caracteristicasVehiculo = new TreeSet<String>(new Comparator<String>() {
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
	
	

	@Override
	public String toString() {
		return "VehiculoMotor [marca=" + marca + ", numRuedas=" + numRuedas + ", caracteristicasVehiculo="
				+ caracteristicasVehiculo + "]";
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public int getNumRuedas() {
		return numRuedas;
	}



	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public Set<String> getCaracteristicasVehiculo() {
		return caracteristicasVehiculo;
	}



	public void setCaracteristicasVehiculo(TreeSet<String> caracteristicasVehiculo) {
		this.caracteristicasVehiculo = caracteristicasVehiculo;
	}



	public void imprimeCaracteristicas() {
		
		for (String caract : caracteristicasVehiculo) {
			System.out.println(caract);
		}
		
		/*
		 * Iterator<String> iterator = caracteristicasVehiculo.iterator();
		 * while (iterator.hasNext()){
		 * 	String nombreCaracteristica = iterator.next();
		 * 	System.out.println("");
		 * }
		 */
		
	}
	
	public void ImprimeOtrasCaracteristicas(String caracteristicas) {
		
		for (String caract : caracteristicasVehiculo) {
			if(caract.equals(caracteristicas)) {
				continue;
			}else {
				System.out.println(caract);
			}
			
		}
		
		/*
		 * Iterator<String> iterator = caracteristicasVehiculo.iterator();
		 * while (iterator.hasNext()){
		 * 	if(!caract.equals(caracteristicas)) {
		 * 		String nombreCaracteristica = iterator.next();
		 * 		System.out.println("");
		 * 	}
		 * }
		 */
		
		
	}
	
	
}
