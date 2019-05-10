package Manu_Corregido;

import java.util.Arrays;

public class EjercicioRepetidos1 {
	
	public static void main (String[]args){
        int[] a = {5,1,6,4,2,6,4,3};
        int[] b = {5,7,8,3,9,9,2};
        
        System.out.println(Arrays.toString(obtenerArrayRepetidos(a,b)));
        
        
    }
    
    public static int[] obtenerArrayRepetidos(int[] array1, int[] array2){
        
        
		int[] c = null;
		
		int cont=0;
		

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i] == array2[j]) {
					++cont;
				}
			}
		}
		
		
		
		c = new int[cont];
		int cont2= 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				
				
				if(array1[i] == array2[j]) {
					c[cont2++] = array1[i];
					
				}
			}
		}
		
		Arrays.sort(c);
        
        return c;
    }
	
}
