package tema9.Troya;

public class Griegos extends Guerrero {

	public Griegos(String nombre, int edad, int fuerza) {
		super(nombre, edad, fuerza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean retirarse() {
		// TODO Auto-generated method stub
		
		return ((this.herido || this.muerto)?true:false);
	}

}
