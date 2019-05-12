package tema9.EjercicioClase3;

public class Frigorifico extends Electrodomestico {

	@Override
	int calculoPrecio() {
		// TODO Auto-generated method stub
		return 400;
	}

	String obtieneProoveedor() {
		return "balay";
	}

	@Override
	public String toString() {
		return "Frigorifico []";
	}
	
}
