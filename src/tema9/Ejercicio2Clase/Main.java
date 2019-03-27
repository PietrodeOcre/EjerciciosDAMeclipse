package tema9.Ejercicio2Clase;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Persona[] listaEmpleado = new Persona[3];
		
		listaEmpleado[0] = new Empleado("Manuel");
		listaEmpleado[1] = new Empleado("Javier");
		listaEmpleado[2] = new Empleado("Carlos");
		
		Arrays.sort(listaEmpleado);
		
		Empresa empresa = new Empresa("Nuker-Labs", listaEmpleado);
		
		Empresa empresa2 = null;
		
		try {
			empresa2 = (Empresa)empresa.clone();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(empresa.equals(empresa2));
		
		empresa2.setNombre("CryptoDataCenter");
		
		System.out.println(empresa.equals(empresa2));
		
		
		System.out.println(empresa.toString());
		System.out.println(empresa2.toString());
	}
	
}
