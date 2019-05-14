package tema10.HojaEjercicios.IICuatro;

public class CtaBanco extends Propiedad{

	public CtaBanco(String nombre, int cantidadTotal) {
		super(nombre, cantidadTotal);
	}
	
	public double impuestos() {
		
	
		int valor = cantidadTotal - 500000;
		if(valor !=0) {
			return 0.25*cantidadTotal;
		}else {
			return super.cantidadTotal;
		}
	}
	
	
}
