package tema10.HojaEjercicios.IICuatro;



public abstract class Propiedad{
	
	private static int id=0;

	private String nombreString;
	
	private int cantidadTotal;

	public Propiedad(String nombreString, int cantidadTotal) {
		this.id++;
		this.nombreString = nombreString;
		this.cantidadTotal = cantidadTotal;
	}
	
	
	
	
	
}
