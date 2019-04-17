package tema10.SemanaSanta.Cuatro;

public class Persona implements Comparable{
	
	private int id;
	private String nombre;
	private String apellido;
	
	//Getters AND Setters
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//Constructor
	public Persona(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//toString
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	//CompareTo
	@Override
	public int compareTo(Object persona) {
		return this.apellido.equals(((Persona)persona).apellido);
	}

	//HashCode
	@Override
	public int hashCode() {
		return apellido.hashCode();
	}
	
	
	//Equals
	@Override
	public boolean equals(Object obj) {
		if(
			(obj == null) &&
			(obj instanceof Persona) &&	
			(((Persona)obj).id == this.id) &&
			(((Persona)obj).nombre.equals(this.nombre)) &&
			(((Persona)obj).apellido.equals(this.apellido)) 
				) {
			return true;
		}
		return false;
	}
	
	
	
}
