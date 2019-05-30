package SMA;

import java.sql.Date;
import java.time.Year;
import java.util.Calendar;

public class EAsalariado extends Empleado {
	
	private double salarioBase;

	public EAsalariado() {
		super();
		
	}
	
	public EAsalariado(String dni, String nombre, String apellidos, Integer fechaIngreso, double salarioBase) {
		super(dni, nombre, apellidos,  fechaIngreso);
		this.salarioBase = salarioBase;
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

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public void imprimir() {
		System.out.println("EAsalariado [dni=" + this.dniString + 
				", nombre=" + this.nombreString + ", apellido=" + this.apellidoString
	    + ", anioIngreso=" + this.fechaIngreso 
	    + ", salarioBase=" + this.salarioBase + ", ontenSalario()=" + obtenerSalario() + "]");
	}

	@Override
	public double obtenerSalario() {
		
		Calendar ahoraCalendar = Calendar.getInstance();
		int actualAnio = ahoraCalendar.get(Calendar.YEAR);
		int anios = actualAnio - getFechaIngreso();
		if ( anios<0) {
			System.out.println("Error: números de anño no puede ser negativo");
		}
		if(anios<2) {
			return salarioBase;
		}else if(anios>=2 && anios<=3) {
			return salarioBase * 0.05 +salarioBase;
		}else if(anios>=4 && anios<=7) {
			return salarioBase * 0.10 +salarioBase;
		}else if(anios>=8 && anios<=15) {
			return salarioBase * 0.15 + salarioBase;
		}
		return salarioBase * 0.20 + salarioBase;
		
		
	}
	
	
	
}
