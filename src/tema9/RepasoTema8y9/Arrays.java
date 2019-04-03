package tema9.RepasoTema8y9;

public class Arrays {
	
	public static void main(String[] args) {
		
		int[] array = {3,5,4,2,7,3};
		int[] array2 = {2,2,2,2,2,2};
		int[][] matriz = {{1,1,1},{1,1,1},{1,1,1}};
	
		
		//System.out.println(todosIguales(array2));
		//System.out.println(todosDistintos(array));
		System.out.println(matrizS);
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
	
	public static boolean matrizS(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz.length == matriz[i].length) {
					if(matriz[0][0] == matriz[i][j]) {
						return true;
					}					
				}
			}
		}
		return false;
	}	
}
