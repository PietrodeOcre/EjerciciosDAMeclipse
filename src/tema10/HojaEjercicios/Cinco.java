package tema10.HojaEjercicios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Cinco {
	
	/*
	 * Realiza pruebas con las estructuras ArrayList y LinkedList 
	 * de tal forma que se
	 * compruebe el rendimiento de leer el 
	 * elemento de la mitad de la lista.
	 */
	
	/*
	 * Rendimiento de una contra otra
	 * 
	 * 1 Acceder a un elemento en la mitad de la lista
	 * es mas rapido ArrayList
	 * 2 Añadir un elemento a la mitad de la lista
	 * Es mas rapido ArrayList
	 * 3 Elimunar un elemento a la mitad de la lista
	 * Son parecidos
	 * 4 Eliminar el elento de 0 de la lista
	 * Es mas rapido el LinkedList
	 * 
	 * 
	 * Añadir y acceder es mejor el ArrayList y eliminar el LinkedList
	 */
	
	public static void main(String[] args) {
		/*
		//Tiempo de llenado y busqueda binaria de la posicion 500
		//De la primera lista de tipo ArrayList
		long mitad = 0;
		long ini = System.currentTimeMillis();
		ArrayList<Integer> listaNum = new ArrayList<Integer>();
		mitad = aletorio(listaNum);
		busquedaBinaria(listaNum,0,listaNum.size(), 500);
		long fin = System.currentTimeMillis();
		listaNum.remove(0);
		long borrar = System.currentTimeMillis();
		long primeraMitad = (fin-ini);
		long AñadirMitad = (fin-mitad);
		long BorrarMitad = (borrar-fin);
		System.out.println("Tiempo de la primera lista en acceder a la mitad: " + primeraMitad);
		System.out.println("Tiempo de la primera lista en añadir a la mitad: " + AñadirMitad);
		System.out.println("Tiempo de la primera lista en borrar posicion 0: " + BorrarMitad);
		
		//Tiempo de llenado y busqueda binaria de la posicion 500
		//De la segunda lista de tipo LinkedList
		long mitad2 = 0;
		long ini2 = System.currentTimeMillis();
		LinkedList<Integer> listaNum2 = new LinkedList<Integer>();
		mitad2 = aletorio(listaNum2);
		busquedaBinaria(listaNum2,0,listaNum2.size(), 500);
		long fin2 = System.currentTimeMillis();
		listaNum.remove(0);
		long borrar2 = System.currentTimeMillis();
		long primeraMitad2 = (fin2-ini2);
		long AñadirMitad2 = (fin2-mitad2);
		long BorrarMitad2 = (borrar2-fin2);
		System.out.println("Tiempo de la primera lista en acceder a la mitad: " + primeraMitad2);
		System.out.println("Tiempo de la primera lista en añadir a la mitad: " + AñadirMitad2);
		System.out.println("Tiempo de la primera lista en borrar posicion 0: " + BorrarMitad2);
		
		System.out.println("");

		if(primeraMitad < primeraMitad2) {
			System.out.println("La lista de ArrayList es mas rapida que la de LinkedList, en llegar a la mitad");
		}else {
			System.out.println("La lista de LinkedList es mas rapida que la de ArrayList, en llegar a la mitad");
		}
		if(AñadirMitad < AñadirMitad2) {
			System.out.println("La lista de ArrayList es mas rapida que la de LinkedList, en añadir a la mitad");
		}else {
			System.out.println("La lista de LinkedList es mas rapida que la de ArrayList, en añadir a la mitad");
		}
		if(BorrarMitad < BorrarMitad2) {
			System.out.println("La lista de ArrayList es mas rapida que la de LinkedList, en borrar la posicion 0");
		}else {
			System.out.println("La lista de LinkedList es mas rapida que la de ArrayList, en borrar la posicion 0");
		}
		*/
		//LinkedList<Integer> lista1 = new LinkedList<Integer>();
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		
		for (int i = 0; i<100000; i++) {
			lista1.add(i);
		}
		
		long ini = tiampoInicial();
		lista1.add((lista1.size()/2), 334);
		System.out.println("Elemento de la mitad: ");
		lista1.add((lista1.size()/2), 334);
		//lista1.get(lista1.size()/2));
		//lista1.remove(lista1.size()/2));
		//lista1.remove(0);
				
		
		tiempoFinal(ini);
		
		
		//Es mas rapido el ArrayList siempre.recordad 
		//chicos arraylist mas rapido que linkedlist y 
		//hashset mas rapido que treeSEt
	}
	
	
	/*
	 * Requiere método tiempoInicial()
	 * Devuelve el tiempo en milisegundos transcurridos desde 
	 * tiempoInicial() hasta tiempo Final
	 */
	private static void tiempoFinal(long ini) {
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo: " + (fin-ini));
	}

	/*
	 * Devuelve el tiempo antes de comenzar una tarea
	 */
	private static long tiampoInicial() {
		long ini = System.currentTimeMillis();
		return ini;
	}
	
	private static long aletorio(List<Integer> vector){
        //LLena un array de números aleatorios de 0 a 1000
		long lamitad = 0; 
        Random r = new Random();
        for(int i=0; i<100000; i++){
            vector.add(r.nextInt(9999));
            if(i == 50000) {
            	vector.add(r.nextInt(9999));
            	lamitad = System.currentTimeMillis();
            	
            }
        }
        return lamitad;
    }
	
	/*
	 * Realiza búsquedas binarias en listas
	 */
	private static int busquedaBinaria(List<Integer> vector,int posInicial, int posFinal, int elemento) {
        //Método para realizar busquedas binarias en vectores de enteros
        //Devuelve -1 y si no encuentra el elemento dentro del array
    	if (posInicial>=0 && posInicial<=posFinal && posFinal>=0) {
            int mitad = ((posFinal - posInicial)/2) +posInicial;   		
            if (vector.get(mitad) > elemento) {
                return busquedaBinaria(vector, posInicial, mitad-1, elemento);	
            }else if (vector.get(mitad) < elemento) {
    		return busquedaBinaria(vector, mitad+1, posFinal, elemento);
            }else {
    		return vector.get(mitad);
            }
        }	
    	return -1;
    }
	
}
