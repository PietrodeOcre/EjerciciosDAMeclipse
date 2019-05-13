package tema10.HojaEjercicios.IICuatro;

public class Inmueble extends Propiedad{
	
	private int alquiler;

	public Inmueble(String nombre, int cantidad, int alquiler) {
		super(nombre, cantidad);
		this.alquiler = alquiler;
	}
	
	public Inmueble(String nombre, int cantidad) {
		super(nombre, cantidad);
	}
	
}
