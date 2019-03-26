package tema9.Ejercicio2Clase;

public class Main {

	public static void main(String[] args) {
		Empleado[] listaEmpleado = new Empleado[2];
		
		listaEmpleado[0] = new Empleado("Manuel");
		Empresa empresa = new Empresa("Nuker-Labs", listaEmpleado);
		
		System.out.println(empresa.toString());
		
	}
	
}
