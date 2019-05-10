package tema10.HojaEjercicios.IIUno;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calle == null) ? 0 : calle.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Direccion)) {
			return false;
		}
		Direccion other = (Direccion) obj;
		if (calle == null) {
			if (other.calle != null) {
				return false;
			}
		} else if (!calle.equals(other.calle)) {
			return false;
		}
		if (numero != other.numero) {
			return false;
		}
		return true;
	}
	
	
	
	
}
