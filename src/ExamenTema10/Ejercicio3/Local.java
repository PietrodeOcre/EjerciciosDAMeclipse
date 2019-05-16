package ExamenTema10.Ejercicio3;

public class Local extends Inmueble {
	public double metros;

	public Local(String direccion, int valor, double metros) {
		super(direccion, valor);
		this.metros = metros;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double totalImpuestos() {

		this.impuestoTotal = super.getValor();
		
			impuestoTotal = impuestoTotal * ((metros/2)/100);

		return impuestoTotal;
	}
	
	
	@Override
	public String toString() {
		return " [direccion=" + direccion + ", valor=" + valor + ", impuestoTotal=" + this.totalImpuestos() + "]\n";
	}

}
