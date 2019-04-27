package tema10.HojaEjercicios;

import java.util.LinkedList;

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
		
		Queue<String> cola = new LinkedList<String>();
		
		String[] array= {"Manuel", "Pedro", "Mario", "María", "Jose", "Miguel", "Carlos"};
		
		Random rd = new Random();
		

		for (int i=1; i<=4; i++) {
			int num = rd.nextInt(6)+1;
			cola.add(array[num]);
			escribirMensaje(cola);
			//System.out.println(cola);
			System.out.println(cola.poll());
			//System.out.println(cola);
		}
		
		
		escribirMensaje(cola);
		System.out.println(cola);
	}
	
	public static void escribirMensaje(Queue<String> cola){
		//metodo para mostrar un texto en una ventana.
		JOptionPane.showMessageDialog(null, cola, "Programa Prueba", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
