package tema9.Ejercicio2Clase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {

	protected String nombre;
	protected LocalDate fechaNacimiento;

	public Persona(String nombre) {
		this.nombre = nombre;
		this.fechaNacimiento = LocalDate.now();
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

}