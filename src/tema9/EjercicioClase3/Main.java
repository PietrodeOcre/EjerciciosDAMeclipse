package tema9.EjercicioClase3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Electrodomestico[] array = {
				new Frigorifico(),
				new Televisor(),
				new Frigorifico()
		};
		
		System.out.println(Arrays.toString(array));
		
		int suma = 0;

		//Electrodomestico elec es crear un elemento llamado elec del 
		//tipo electrodomestico
		//que se usará como variable temporal para contener cada posicion del
		//Array en cada iteración
		for(Electrodomestico elec:array) {
			//Esto es lo normal por que calculoPrecio esta en el tipo 
			//Electrodomestico
			//suma += elec.calculoPrecio();
			//Pero sin esta parte no se puede acceder a un método de la
			//clase hija frigorifico ni siquiera casearlo sin comprobar 
			//previamente si es del tipo frigorifico
			if (elec instanceof Frigorifico) {
				Frigorifico frigo = (Frigorifico)elec;
				frigo.obtieneProoveedor();
			}else if(elec instanceof Televisor) {
				Televisor tele = (Televisor)elec;
				tele.numeroCanales();
			}
		}
		/* a todo esto se le llama polimorfismo por que hasta que no se
		 * ejecuta, java no sabe que tipo de objeto se le va a pasar y
		 * que metodos va a tener
		 * 
		 * Tambien da error si intentamos castear un frigorifico por ejemplo 
		 * a tipo electrodomestico, ya que electrodomestico no tiene 
		 * los metodos extra y los atributos extra que tengan los hijos
		 */
		
		//Electrodomestico electrodomestico = new Electrodomestico();
		
		//Frigorifico frigo2 = (Frigorifico)Electrodomestico;
		
		Televisor tele1 = new Televisor();
		//electrodomestico = tele1;
		
		//tele1 = Electrodomestico
		//tele1 = (Televisor)Electrodomestic;
		
		//System.out.println(suma);
		
		
		
	}

}
