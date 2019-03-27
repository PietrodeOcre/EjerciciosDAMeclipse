package tema9.Ejercicio2Clase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import tema6.EjercicioRepaso.Asignatura;
import tema6.EjercicioRepaso.Expediente;

public class Empresa implements Cloneable{

	//Atributos
	private static int id1 = 0;
	private int id;
	private String nombre;
	private Persona[] empleado;
	private LocalDate fechaDeAlta;
	
	
	//Constructor
	public Empresa(String nombre, Persona[] empleado) {
		this.id = id1++;
		this.nombre = nombre;
		this.empleado = empleado;
		this.fechaDeAlta = LocalDate.now();
	}
	
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona[] getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Persona[] empleado) {
		this.empleado = empleado;
	}
	public String getFechaDeAlta() {
		return fechaDeAlta.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}
	public void setFechaDeAlta(LocalDate fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}


	//Clone
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Empresa empresa = (Empresa)super.clone();
        empresa.empleado = (Persona[])this.empleado.clone();
        return empresa;
	}

	//Equals
	@Override
	public boolean equals(Object obj) {     
        if ( obj instanceof Empresa &&
                ((Empresa)obj) != null &&
                ((Empresa)obj).nombre.equals(this.nombre) &&
                ((Empresa)obj).fechaDeAlta.equals(this.fechaDeAlta)) {
        	return true;
        }
        return false;
	}

	//toString
	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + ", empleado=" + Arrays.toString(empleado) + ", fechaDeAlta="
				+ getFechaDeAlta() + "]";
	}
	
	
	
	
	
}
