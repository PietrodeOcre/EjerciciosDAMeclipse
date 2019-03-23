package tema9.SMA;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class EAsalariado extends Empleado{
	
	private double salarioBase;
	
	public EAsalariado() {
		super();
		salarioBase = 0.0;
	}
	
	public EAsalariado(String dni, String nombre, String apellido, int fechaIngreso, Empleado[] empleado, double salarioBase) {
		super(dni, nombre, apellido, fechaIngreso, empleado);
		this.salarioBase = salarioBase;
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

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public void imprimir() {
		System.out.println("EAsalariado [getDni()=" + getDni() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
		+ ", getAnioIngreso()=" + getAnioIngreso() + ", getEmpleado()=" + Arrays.toString(getEmpleado())
		+ ", getSalarioBase()=" + getSalarioBase() + "]");
		
	}

	@Override
	public double obtenerSalario() {
		Date ahora = new Date();
        int actualAnio = ahora.getYear();
        int anios = actualAnio - getAnioIngreso(); 
        if (anios<0){
            System.out.println("Error: número de años negativo");
        }
        if (anios < 2) return salarioBase;
        else if (anios >= 2 && anios<=3) return salarioBase * 0.05 + salarioBase;
        else if (anios >= 4 && anios<=7) return salarioBase * 0.10 + salarioBase;
        else if (anios >= 8 && anios<=15) return salarioBase * 0.15 + salarioBase;
        else return salarioBase * 0.20 + salarioBase;
	}

	
}
