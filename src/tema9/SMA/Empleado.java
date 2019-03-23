package tema9.SMA;

import java.util.Arrays;
import java.util.Date;

public abstract class Empleado {
	protected String dni;
	protected String nombre;
	protected String apellido;
	protected int anioIngreso;
	protected Empleado[] empleado;
	
	public Empleado() {
		dni = "00000000";
		nombre = "NN";
		apellido = "NA";
		anioIngreso = 0000;
		empleado = null;
	}
	
	public Empleado(String dni, String nombre, String apellido, int fechaIngreso, Empleado[] empleado) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.anioIngreso = fechaIngreso;
		this.empleado = empleado;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}

	public Empleado[] getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado[] empleado) {
		this.empleado = empleado;
	}
	
	public abstract void imprimir();
	
	public abstract double obtenerSalario();

		
	
}
