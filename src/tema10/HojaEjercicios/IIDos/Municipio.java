package tema10.HojaEjercicios.IIDos;

public class Municipio {
	
	private String nombre;
	private String provincia;
	
	public Municipio(String n, String p) { 
		nombre = n; provincia = p; 
	} 
	public String getNombre() { 
		return nombre; 
	} 
	
	public String getProvincia() { 
		return provincia; 
	}
	public String toString() { 
		return nombre+"("+provincia+")"; 
	}
	@Override
	public int hashCode() {
		
		return nombre.hashCode() + provincia.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Municipio)) {
			return false;
		}
		Municipio other = (Municipio) obj;
		if (nombre == null) {
			if (other.nombre != null) {
				return false;
			}
		} else if (!nombre.equals(other.nombre)) {
			return false;
		}
		if (provincia == null) {
			if (other.provincia != null) {
				return false;
			}
		} else if (!provincia.equals(other.provincia)) {
			return false;
		}
		return true;
	}
	
	
	
}
