package tema10.HojaEjercicios.II;

public class Direccion implements Comparable<Direccion>{
	
	private String calle;
	private int numero;
	private int codigoPostal;

	public Direccion(String calle, int num, int cp) {
		this.calle = calle;
		this.numero = num;
		this.codigoPostal = cp;
	}

	@Override
	public String toString() {
		return this.calle + " " + this.numero + " (" + this.codigoPostal + ")";
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCalle() {
		return this.calle;
	}
	public int getCodigoPostal() {
		return this.codigoPostal;
	}
	public int getNumero() {
		return this.numero;
	}

	@Override
	public int compareTo(Direccion o) {
		
		int comparacion =  this.calle.compareTo(o.calle);
		
		if(comparacion !=0) {
			//Devuelve la comparacion entre los String de las calles
			return comparacion;
		}else {
			//Indica cual es mayor de los numeros de las calles
			return (this.numero - o.numero);
		}
		
		
	}
	
	
}
