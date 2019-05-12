package tema10.HojaEjercicios.IICuatro;

public class Patrimonio extends Imponible{

	
	Inmueble inmueble;
	Propiedad propiedad;
	
	public Patrimonio(Inmueble p1, Propiedad p2) {
		
		this.propiedad = p2;
		this.inmueble = p1;
	}

	@Override
	public String toString() {
		return "Patrimonio [id()=" + id() + "]";
	}

	public Patrimonio() {
		// TODO Auto-generated constructor stub
	}

	public void add(Propiedad p3) {
		// TODO Auto-generated method stub
		
	}

	public void add(Propiedad p3, Inmueble inmueble2) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
