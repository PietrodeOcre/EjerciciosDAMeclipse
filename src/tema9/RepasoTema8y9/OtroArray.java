package tema9.RepasoTema8y9;

import java.util.Scanner;

public class OtroArray {
	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese la dimensiòn de la matriz ");
		int dim = lector.nextInt();

		cambiarDiagonalesInversas(crearMatriz(dim), dim);

		}

	public static int[][] crearMatriz(int dim) {
		
		int i, j, numaleatorios;
		int matriz[][] = new int[50][50];
		
		for (i = 0; i < dim; i++) {
			for (j = 0; j < dim; j++) {
				matriz[i][j] = numaleatorios = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
			}
		}
		
		System.out.println("Matriz ingresada ");
		for (i = 0; i < dim; i++) {
		for (j = 0; j < dim; j++) {
		System.out.print("[" + matriz[i][j] + "]");
		}
		System.out.println();
		}
		
		return matriz;
	}

	public static void cambiarDiagonalesInversas(int[][] matriz, int tamanio) {

		int i, j, aux, dim=tamanio;
		int matrizprin[] = new int[50];
		int matrizsec[] = new int[50];

		//guardo la diagonal principal
		for (i = 0; i < dim; i++) {
		matrizprin[i] = matriz[i][i];
		}

		//guardo la diagonl secundaria
		aux = dim;
		for (i = 0; i < dim; i++) {
		matrizsec[i] = matriz[i][aux-1];
		aux--;
		}

		//remplazo la diagonal principal y la diagonal secundaria con los valores guardados anteriormente
		aux=dim;
		for (i = 0; i < dim; i++) {
		matriz[i][i] = matrizsec[i];
		matriz[i][aux-1] = matrizprin[i];
		aux--;
		}

		System.out.println();
		//vuelvo a mostrar la matriz con su diagonal principal y secundaria cambiadas
		for (i = 0; i < dim; i++) {
		for (j = 0; j < dim; j++) {
		System.out.print("[" + matriz[i][j] + "]");
		}
		System.out.println();
		}
	}
}
