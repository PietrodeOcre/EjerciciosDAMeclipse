package ExamenTema10.Ejercicio3;

public class Apartamento extends Inmueble{

	private String tipoVivienda;
	public Apartamento(String direccion, int valor, String tipoVivienda) {
		super(direccion, valor);
		this.tipoVivienda = tipoVivienda;
		// TODO Auto-generated constructor stub
	}

	
	public double totalImpuestos() {
		
		double impuestosPadre = super.totalImpuestos();
		
		if ("Segunda vivienda".equals(tipoVivienda)) {
			impuestosPadre = impuestosPadre + 0.001*valor;
		}
		else if ("Alquiler".equals(tipoVivienda)) {
			impuestosPadre = impuestosPadre + 0.002*valor;			
		}
		
		return impuestosPadre;		
		
	}
	
	@Override
	public String toString() {
		return direccion + " con valor= " + valor + " eur " + "e impuesto aplicable de "+totalImpuestos() + " eur";
	}
}
