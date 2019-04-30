package tema10.HojaEjercicios;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import javax.swing.JOptionPane;

public class Colas{
	
	/*
	 * Crear un elemento de cola de cadenas, agregar un array 
	 * estático de nombres de clientes. Luego, aleatoria mente 
	 * vamos a cargar un cliente a a la cola 4 elementos. Obtendremos 
	 * uno a uno los elementos de la cola, imprimiendo los y quitando los.
	 */

	public static void main(String[] args) {
		
		//Lista enlazada
		Queue<String> cola = new LinkedList<String>();
		
		//Tambien se puede hacer con LIST pero no sería una lista enlazada
		List<String> cola2 = new LinkedList<String>();
		
		String[] array= {"Manuel", "Pedro", "Mario", "María", "Jose", "Miguel", "Carlos"};
		
		Random rd = new Random();
		

		for (int i=1; i<4; i++) {
			int num = rd.nextInt(6)+1;
			System.out.println(cola.add(array[num]));
			//escribirMensaje(cola);
			//System.out.println(cola);
			//System.out.println(cola.poll());
			//System.out.println(cola);
		}
		//System.out.println(cola);
		
		while(!cola.isEmpty()) {
			System.out.println("Vamos a tratar al Cliente: " + cola.poll());
		}
		
		//escribirMensaje(cola);
		//System.out.println(cola);
	}
	
	public static void escribirMensaje(Queue<String> cola){
		//metodo para mostrar un texto en una ventana.
		JOptionPane.showMessageDialog(null, cola, "Programa Prueba", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
