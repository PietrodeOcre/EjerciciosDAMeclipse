package tema9.HojaEjercicios1;

import java.util.Random;

public class Dado extends Sorteo{
	
	public int lanzar() {
		
		Random rd = new Random();
		
		int dado = rd.nextInt(6)+1;
		
		System.out.println(dado);
		
		return dado;
		
	}
	
	public static void main(String[] args) {
		Dado mon = new Dado();
		System.out.println(mon.lanzar());
	}

}
