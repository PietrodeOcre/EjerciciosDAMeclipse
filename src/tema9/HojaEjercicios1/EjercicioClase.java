package tema9.HojaEjercicios1;

public class EjercicioClase {
}


	//Ejemplos de posibles ejercicios
	
	/*abstract int primerMetodo(int i);
	abstract int segundoMetodo(int i);
	int tercerMetodo(int i) {
		return segundoMetodo(++i);
	}
	
	abstract public class B extends A{
		int segundoMetodo(int i) { return primerMetdo(++i);}
	}
	public class c extends B{
		int primerMetodo(int i) {return ++i;}
	}
	
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.tercerMetodo(2111));
	}*/
	
	
	/*public class XYZ{
		public XYZ() {
			System.out.println("XYZ.XYZ()");
		}
		abstract XYZ(int i) {//Este es un constructor y no puede serlo pro que un constructor no puede ser abstracto
			
		}
	}*/
	
	
	/*
	 * Se suma y se resta lo mismo al final queda cero
	 * 
	 * 
	 * 
	 * 
	public class Clase1{
		int metodo1(int i, int j) {return i++ + ++j - ++i - j++;}
	}
	
	abstract class Clase2 extends Clase1() {
		abstract int metodo1(int i, int j, int k);
		int metodo1(int i, int j) {return metodo1(i,j,i+j);}
	}
	
	class Clase3 extends Clase2 {
		int metodo1(int i, int j, int k) {return  --i - j-- + ++k - i++ + ++j - k--;}
	}
	
	public class Main{
		public static void main(String [] args) {
			Clase1 uno = new Clase1();
			Clase3 tres = new Clase3();
			System.out.println(tres.metodo1(uno.metodo1(10101, 20202)
					, uno.metodo1(202202, 10101)));
		}
	}
	*/
	
	
	
	
	
	/*
	public static void main(String[] args) {
		X x = new Y();
		x.metodo();
	}*/





/*
abstract public class X{
	public X() {
		System.out.println("1");
	}
	abstract void metodo();
}

public class Y extends X{
	public Y() {
		System.out.println("2");
	}
	void metodo() {
		System.out.println("3");
	}
}*/