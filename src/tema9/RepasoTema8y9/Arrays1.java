package tema9.RepasoTema8y9;

import java.util.Arrays;

public class Arrays1 {
	
	public static void main(String[] args) {
		
		int[] array = {3,5,4,2,7,3};
		int[] array2 = {2,2,2,2,2,2};
		int[][] matriz = {{1,4,1},{1,1,1},{1,1,1}};
		 
	
		//System.out.println(todosIguales(array2));
		//System.out.println(todosDistintos(array));
		//System.out.println(matrizSimetricaIgual(matriz));
		//System.out.println(Arrays.toString(sumaFilasMatrizSimetrica(matriz)));
		creaPiramide();
		
	
	}
	
	public static void creaPiramide() {
		int[][] matriz = new int[7][14];
		int mitadVector = (matriz[0].length/2)-1;
		int adelante = mitadVector;
		for (int j = 0; j < (matriz.length); j++) {
			for (int i = 0; i < ((matriz[j].length)-1); i++) {

				if (j == 0 && i == mitadVector) {
					matriz[j][i] = 3;
				} 
				if(j>0 && i == --mitadVector || j>0 && i == ++mitadVector){
					matriz[j][i] = 3;
				}	
				if(j>0 && i == adelante) {
					matriz[j][i] = 3;
				}
			}
			adelante++;
		}
		
		for (int j = 0; j < (matriz.length); j++) {
			for (int i = 0; i < (matriz[j].length-1); i++) {
				System.out.print(matriz[j][i]);
			}
			System.out.println("");
		}
	}
	
	
	
	public static int[] sumaFilasMatrizSimetrica(int[][] matriz){
		int []array = new int[matriz[0].length];		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				array[j] +=  matriz[i][j];
			}
		}
		return array;
	}
	
	public static boolean matrizSimetricaIgual(int[][] matriz) {
		boolean dist = true;
		boolean dist2 = false;
		int valor1 = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (valor1 != matriz[i][j]) {
					dist = false;
				}
				if (matriz.length == matriz[0].length) {
					dist2 = true;
				}
			}
		}
		boolean resp = (((dist) && (dist2)) ? true : false);
		return resp;
	}
	
	public static boolean todosDistintos(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length-1; j++) {
				if (array[i] == array[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean todosIguales(int[] array) {
		
		for (int i = 1; i < array.length; i++) {
			if (array[0] != array[i]) {
				return false;
			}
		}
		return true;
	}
	
	
}
