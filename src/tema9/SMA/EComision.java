package tema9.SMA;

import java.util.Arrays;
import java.util.Date;

public class EComision extends Empleado{
	private int clientesCaptados;
    private double facturadoPorCliente;
    public static final double salarioMinimo = 750;

	public EComision() {
		super();
		clientesCaptados = 0;
		facturadoPorCliente = 0.0;
	}
	
	public EComision(String dni, String nombre, String apellido, int fechaIngreso, int clientesCaptados, double facturadoPorCliente) {
		super(dni,nombre,apellido,fechaIngreso);
		this.clientesCaptados = clientesCaptados;
		this.facturadoPorCliente = facturadoPorCliente;
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
	
	

	public int getClientesCaptados() {
		return clientesCaptados;
	}

	public void setClientesCaptados(int clientesCaptados) {
		this.clientesCaptados = clientesCaptados;
	}

	public double getFacturadoPorCliente() {
		return facturadoPorCliente;
	}

	public void setFacturadoPorCliente(double facturadoPorCliente) {
		this.facturadoPorCliente = facturadoPorCliente;
	}

	public static double getSalariominimo() {
		return salarioMinimo;
	}

	@Override
	public void imprimir() {
		System.out.println("EComision [getDni()=" + getDni() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
		+ ", getAnioIngreso()=" + getAnioIngreso() + ", getEmpleado()=" + Arrays.toString(getEmpleado())
		+ ", getClientesCaptados()=" + getClientesCaptados() + ", getFacturadoPorCliente()="
		+ getFacturadoPorCliente() + ", obtenerSalario()=" + obtenerSalario() + "]");
	}

	@Override
	public double obtenerSalario() {
		if (facturadoPorCliente*clientesCaptados > salarioMinimo)
            return facturadoPorCliente*clientesCaptados;
        else
            return salarioMinimo;
	}


	

}
