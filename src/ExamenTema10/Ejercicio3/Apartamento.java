package ExamenTema10.Ejercicio3;

public class Apartamento extends Inmueble {
	
	public String usoString;

	public Apartamento(String direccion, int valor, String usoString) {
		super(direccion, valor);
		this.usoString = usoString;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double totalImpuestos() {
		
		this.impuestoTotal = super.getValor();
		
		if(usoString.equals("Segunda vivienda")) {
			
			impuestoTotal = impuestoTotal * 0.0001;
			
		}else if(usoString.equals("Alquiler")) {
			
			impuestoTotal = impuestoTotal * 0.0002;
			
		}
		
		
		return impuestoTotal;
	}
	
	@Override
	public String toString() {
		return " [direccion=" + direccion + ", valor=" + valor + ", impuestoTotal=" + this.totalImpuestos() + "]\n";
	}
	
	
	
}
