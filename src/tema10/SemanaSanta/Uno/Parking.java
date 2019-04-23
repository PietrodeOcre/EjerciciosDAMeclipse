package tema10.SemanaSanta.Uno;

import java.util.HashSet;

public class Parking {
	
	public Parking(HashSet<Vehiculo> plaza) {
		
		this.plaza = plaza;
		
	}
	 
	protected HashSet<Vehiculo> plaza = new HashSet<Vehiculo>();
	
	public void addVehiculo (Vehiculo v) {
		
		plaza.add(v);
		
	}

	@Override
	public String toString() {
		return "Parking [plaza=" + plaza + "]\n";
	}
	
	
	
}
