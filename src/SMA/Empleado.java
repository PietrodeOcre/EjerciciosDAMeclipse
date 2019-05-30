package SMA;

import java.sql.Date;

public abstract class Empleado {
	
	protected String dniString;
	protected String nombreString;
	protected String apellidoString;
	protected Integer fechaIngreso;
	
	public Empleado() {
		
	}
	
	
	public Empleado(String dni, String nombre, String apellidos, Integer fechaIngreso) {
		this.dniString = dni;
		this.nombreString = nombre;
		this.apellidoString =  apellidos;
		this.fechaIngreso = fechaIngreso;
	}


	public String getDniString() {
		return dniString;
	}


	public void setDniString(String dniString) {
		this.dniString = dniString;
	}


	public String getNombreString() {
		return nombreString;
	}


	public void setNombreString(String nombreString) {
		this.nombreString = nombreString;
	}


	public String getApellidoString() {
		return apellidoString;
	}


	public void setApellidoString(String apellidoString) {
		this.apellidoString = apellidoString;
	}


	public Integer getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(Integer fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public abstract void imprimir();
	
	public abstract double obtenerSalario();
	
}
