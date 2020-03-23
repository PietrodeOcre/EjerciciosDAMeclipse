package CursoUdemyPruebas;

public class ArgumentosVariables {

	/*
	 * Cuando hagamos uso de un parametro variable en 
	 * una funcion debemos asegurarnos que este parametro siemrpe sea
	 * el ultimo que se pide ya que es de tipo varargs
	 * si ponemos despues algunotro parametro lo intentara meter
	 * en el varargs y si no es del mimso tipo saltará un error
	 */
	public static void funcion(int... num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
		System.out.println(" Fin");
	}
	
	public static void funcion(String... letras) {
		for (int i = 0; i < letras.length; i++) {
			System.out.print(letras[i]);
		}
		System.out.println(" Fin");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funcion(3,5,6,7,5,4);
		funcion(3,5,6,7);
		funcion(3,5,6,7,8,7,65,4,65,7,6,5,4);
		
		funcion("hola", " que ", "tal? ");
		funcion("h","o","l","a", " que ", "tal? ");
		funcion("h","o","l","a", " que ", "t","a","l","? ");
	}

}
