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
	
	public double impuestos() {
		
		if(alquiler !=0) {
			return 0.25*alquiler;
		}else {
			return super.cantidadTotal;
		}
	}
	
}
