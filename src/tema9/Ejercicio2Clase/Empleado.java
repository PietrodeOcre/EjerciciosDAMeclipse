package tema9.Ejercicio2Clase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleado extends Persona implements Cloneable, Comparable<Empleado>{
	
	//Atributos
	private static int id1 = 0;
	private int id;
	
	//Constructor
	public Empleado(String nombre) {
		super(nombre);
		this.id = id1++;
		
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Empleado empleado = (Empleado)super.clone();
		return empleado;
	}

	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Empleado &&
                ((Empleado)obj) != null &&
                ((Empleado)obj).nombre.equals(this.nombre) &&
                ((Empleado)obj).fechaNacimiento.equals(this.fechaNacimiento)) {
        	return true;
        }
        return false;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + getFechaNacimiento() + "]";
	}
	
	
	//compareTo
		@Override
		public int compareTo(Empleado obj) {
			int res = 0;
			if(this.id > obj.getId()) {
				res = -1;
			}else if (this.id < obj.getId()){
				res = 1;
			}else {
				res = 0;
			}
			return res;
		}
	
	
	
}
