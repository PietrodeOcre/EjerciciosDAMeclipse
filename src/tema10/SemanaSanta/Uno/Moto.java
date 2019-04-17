package tema10.SemanaSanta.Uno;

import java.util.TreeSet;

public class Moto extends VehiculoMotor {

	public Moto(String marca, int numRuedas, TreeSet<String> caracteristicasVehiculo) {
		
		super(marca, numRuedas, caracteristicasVehiculo);
		
	}

	@Override
	public String toString() {
		return "Moto [toString()=" + super.toString() + "]\n";
	}
	
	
	
}
