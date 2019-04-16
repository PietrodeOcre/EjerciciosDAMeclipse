package tema10.SemanaSanta.uno;

import java.util.TreeSet;
public class Coche extends VehiculoMotor {
	
	public Coche(String marca, int numRuedas, TreeSet<String> caracteristicasVehiculo) {
		
		super(marca, numRuedas, caracteristicasVehiculo);
		
	}
	
	@Override
	public String toString() {
		return "Coche [toString()=" + super.toString() + "]\n";
	}
	
}
