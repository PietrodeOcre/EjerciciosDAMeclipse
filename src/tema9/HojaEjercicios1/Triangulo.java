package tema9.HojaEjercicios1;

public class Triangulo extends Forma{

	@Override
	public String toString() {
		return super.identidad();
	}

	public Triangulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Triangulo tri = new Triangulo();
		System.out.println(tri.toString());
	}
	
}
