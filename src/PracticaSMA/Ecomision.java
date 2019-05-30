package PracticaSMA;

import java.sql.Date;

public class Ecomision extends Empleado{
	
	private int clientesCaptados;
	private double facturadoPorCliente;
	public static final double salarioMinimo = 750.0;
	
	public Ecomision() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ecomision(String dni, String nombre, String apellidos, Integer fechaIngreso,
			int clientesCaptados, double facturadoPorCliente) {
		super( dni, nombre,  apellidos,  fechaIngreso);
		this.clientesCaptados = clientesCaptados;
		this.facturadoPorCliente =  facturadoPorCliente;
		
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
		System.out.println("EComision [dni=" + this.dniString + 
				", nombre=" + this.nombreString + ", apellido=" + this.apellidoString
	    + ", anioIngreso=" + this.fechaIngreso + 
	    ", clientesCaptados=" + getClientesCaptados() + ", facturadoPorCliente="
	    + getFacturadoPorCliente() + ", obtenerSalario()=" + obtenerSalario() + "]");
	}

	@Override
	public double obtenerSalario() {
		if(facturadoPorCliente*clientesCaptados > salarioMinimo) {
			return facturadoPorCliente*clientesCaptados;
		}else {
			return salarioMinimo;
		}
	}
	
	
	
}
