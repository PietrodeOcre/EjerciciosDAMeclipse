package tema9.Ejercicio2Clase;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Empleado[] listaEmpleado = new Empleado[2];
		Empresa empresa = new Empresa("Nuker-Labs", listaEmpleado);
		
		System.out.println(empresa.toString());
	}
	
}
