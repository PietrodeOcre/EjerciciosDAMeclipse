package tema9.Ejercicio2Clase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleado implements Cloneable{
	
	//Atributos
	private static int id1 = 0;
	private int id;
	private String nombre;
	private LocalDate fechaNacimiento;
	
	//Constructor
	public Empleado(String nombre) {
		this.id = id1++;
		this.nombre = nombre;
		this.fechaNacimiento = LocalDate.now();
	}
	
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
	public String getFechaNacimiento() {
		return fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
	
	
	
	
	
	
}
