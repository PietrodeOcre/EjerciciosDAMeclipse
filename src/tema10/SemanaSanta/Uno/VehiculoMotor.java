package tema10.SemanaSanta.Uno;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public abstract class VehiculoMotor implements Vehiculo {
	
	private String marca;
	private int numRuedas;
	private TreeSet<String> caracteristicasVehiculo = new TreeSet<String>(new Comparator<String>() {
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

	public TreeSet<String> getCaracteristicasVehiculo() {
		return caracteristicasVehiculo;
	}



	public void setCaracteristicasVehiculo(TreeSet<String> caracteristicasVehiculo) {
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
