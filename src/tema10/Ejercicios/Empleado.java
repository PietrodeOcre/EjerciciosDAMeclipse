package tema10.Ejercicios;

public class Empleado {

	public Empleado(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	private int id;
	private String nombre;
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//HashCode
	@Override
	public int hashCode() {
		
		return id;
	}
	
	//Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (id != other.id && nombre != other.nombre)
			return false;
		return true;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	
}
