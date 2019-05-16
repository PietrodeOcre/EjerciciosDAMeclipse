package ExamenTema10.Ejercicio3;

import java.util.TreeSet;

public class Inmueble implements Comparable<Inmueble>{
	
	protected static int id=0;
	protected String direccion;
	protected int valor;
	
	protected double impuestoTotal;
	
	
	
	public Inmueble(String direccion, int valor) {
		id++;
		this.direccion = direccion;
		this.valor = valor;
	}
	
	public Inmueble(Inmueble inmueble1) {
		this(inmueble1.direccion, inmueble1.valor);
	}

	public double totalImpuestos() {

		double impuestoBase = valor;

		if (valor > 300000) {

			impuestoBase = impuestoBase * 0.0005;

			return impuestoBase;

		}

		if (valor > 200000 && valor <= 300000) {

			impuestoBase = impuestoBase * 0.00035;

			return impuestoBase;

		}else {

			impuestoBase = impuestoBase * 0.0001;

			return impuestoBase;

		}

	}

	@Override
	public int compareTo(Inmueble o) {
		// TODO Auto-generated method stub
		int compare = -this.direccion.compareTo(o.direccion);
		
		/*if(compare != 0) {
			
			compare = (int) (this.totalImpuestos() - o.totalImpuestos());
			
		}*/
		
		return compare;
	}

	

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	
}
