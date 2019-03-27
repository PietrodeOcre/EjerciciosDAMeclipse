package tema9.Interface1;

import java.util.Arrays;

/*
 * Cree una clase principal donde cree varios objetos anteriores
 * e implemente un método estático llamado totalLados que reciba
 * un array de PoligonoRegular y devuelva la suma de los números
 * de los lados de todos los elementos.
 * 
 *
 */

public class Main {

	PoligonoRegular triangulo1;
	PoligonoRegular cuadrado1;
	
	
	
	
	public static void main(String[] args) {
		
		PoligonoRegular triangulo1;
		PoligonoRegular cuadrado1;
		
		triangulo1 = new TrianguloEquilatero(3);
		cuadrado1 = new Cuadrado(3);
		
		PoligonoRegular[] poligonoRegular = new PoligonoRegular[2];
		
		poligonoRegular[0] = triangulo1;
		poligonoRegular[1] = cuadrado1;
		
		System.out.println(totalLados(poligonoRegular));
		
	}
	
	public static int totalLados(PoligonoRegular[] PoligonoRegular) {
		int[] respuesta= new int[PoligonoRegular.length];
		int resp = 0;
		for (int j = 0; j < PoligonoRegular.length; j++) {
			
			respuesta[j] = ((PoligonoRegular[j].getNumLados())*(PoligonoRegular[j].getNumLados()));
			resp += respuesta[j];
		}
		
		
		return resp;
	}

}
