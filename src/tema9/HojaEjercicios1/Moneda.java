package tema9.HojaEjercicios1;

import java.util.Random;

public class Moneda extends Sorteo{

	public int lanzar() {
		
		Random rd = new Random();
		
		int dado = rd.nextInt(3)+1;
		
		System.out.println(((dado==1)?"cara":"cruz"));
		
		return dado;
		
	}
	
	public static void main(String[] args) {
		Moneda mon = new Moneda();
		System.out.println(mon.lanzar());
	}
	
}
