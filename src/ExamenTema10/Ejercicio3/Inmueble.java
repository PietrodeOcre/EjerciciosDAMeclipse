package ExamenTema10.Ejercicio3;

abstract public class Inmueble implements Comparable<Inmueble>{

	protected String direccion;
	protected int valor;

	public Inmueble(String direccion, int valor) {
		this.direccion = direccion;
		this.valor = valor;
	}
	
	public double totalImpuestos() {
		
		double impuestos = 0.0;
		
		if (valor > 300000){
			impuestos = 0.005*valor;
		}
		else if (valor > 200000 && valor <=300000) {
			impuestos = 0.0035*valor;
		}
		else {
			impuestos =  0.001*valor;
		}
		return impuestos;
	}
	@Override public int compareTo(Inmueble i) {
	    return new Integer(this.valor).compareTo(i.valor);
	}
	
	
}
