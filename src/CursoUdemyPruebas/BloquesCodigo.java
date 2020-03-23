package CursoUdemyPruebas;

import org.omg.CORBA.PRIVATE_MEMBER;

public class BloquesCodigo {

	private final int idPersona;
	
	private static int contadorPersona;
	
	/*
	 * Bloque de codigo statico
	 */
	static {
		/*
		 * Este bloque solo es ejecutado una sola vez
		 * puesto que solo se carga en memoria cuando 
		 * se ejecuta la clase por primera vez 
		 * suele llamarse bloque de inicialización estatico
		 */
		contadorPersona = 10;
		/*
		 * Este bloque se usa normalmente para inicializar 
		 * variables estaticas
		 * Si intentamos inicializar otro tipo de variable no estatico 
		 * mostrará un error
		 *
		 */
		System.out.println("Ejecuta bloque estatico");
	}
	
	/*
	 * Tambien se puede realizar bloques no estaticos
	 */
	{
		/*
		 * Aqui se puede inicializar variables no estaticas
		 * 
		 */
		this.idPersona = ++contadorPersona;
		System.out.println("Bloque no estatico");
	}
	
	/*
	 * Constructor de persona para ver el orden de ejecución de bloques
	 */
	public BloquesCodigo() {
		
		System.out.println("Ejecucion de constructor");
		
	}
	
	public int getIdPersona() {
		return this.idPersona;
	}
	
	public static void main(String[] args) {
		
		BloquesCodigo bloquesCodigo = new BloquesCodigo();
		
		BloquesCodigo bloquesCodigo2 = new BloquesCodigo();
		
		int id = bloquesCodigo.idPersona;
		int id2 = bloquesCodigo2.idPersona;
		
		System.err.println(id);
		System.err.println(id2);
		
	}
	
}
