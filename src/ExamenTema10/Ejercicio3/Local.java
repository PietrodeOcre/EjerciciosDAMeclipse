package ExamenTema10.Ejercicio3;

public class Local extends Inmueble{

	private int metrosCuadrados;
	public Local(String direccion, int valor, int metrosCuadrados) {
		super(direccion, valor);
		// TODO Auto-generated constructor stub
		this.metrosCuadrados = metrosCuadrados;
	}

	public double totalImpuestos() {
		
		double impuestosPadre = super.totalImpuestos() + metrosCuadrados/2;		
		
		return impuestosPadre;		
		
	}

	@Override
	public String toString() {
		return direccion + " con valor= " + valor + " eur " + "e impuesto aplicable de "+totalImpuestos() + " eur";
	}
	
	
}
