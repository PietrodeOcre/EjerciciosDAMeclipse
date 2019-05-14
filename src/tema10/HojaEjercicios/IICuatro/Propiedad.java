package tema10.HojaEjercicios.IICuatro;

import java.util.Set;

public abstract class Propiedad{
	
	private static int id=0;

	protected String nombreString;
	
	protected int cantidadTotal;

	public Propiedad(String nombreString, int cantidadTotal) {
		this.id++;
		this.nombreString = nombreString;
		this.cantidadTotal = cantidadTotal;
	}
	
	public abstract double impuestos();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidadTotal;
		result = prime * result + ((nombreString == null) ? 0 : nombreString.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Propiedad)) {
			return false;
		}
		Propiedad other = (Propiedad) obj;
		if (cantidadTotal != other.cantidadTotal) {
			return false;
		}
		if (nombreString == null) {
			if (other.nombreString != null) {
				return false;
			}
		} else if (!nombreString.equals(other.nombreString)) {
			return false;
		}
		return true;
	}
	
	
	
}
