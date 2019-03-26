package tema9.HojaEjercicios1;

public class Rombo extends Forma{
	
	@Override
	public String toString() {
		return super.identidad();
	}

	public Rombo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Rombo tri = new Rombo();
		System.out.println(tri.toString());
	}
	
	
}
