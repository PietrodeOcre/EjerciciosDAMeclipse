package tema9.Ejercicio2Clase;

public class Main {

	public static void main(String[] args) {
		Persona[] listaEmpleado = new Persona[2];
		
		listaEmpleado[0] = new Empleado("Manuel");
		Empresa empresa = new Empresa("Nuker-Labs", listaEmpleado);
		
		Empresa empresa2 = null;
		
		try {
			empresa2 = (Empresa)empresa.clone();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		empresa2.setNombre("CryptoDataCenter");
		
		System.out.println(empresa.equals(empresa2));
		
		
		System.out.println(empresa.toString());
		System.out.println(empresa2.toString());
	}
	
}
