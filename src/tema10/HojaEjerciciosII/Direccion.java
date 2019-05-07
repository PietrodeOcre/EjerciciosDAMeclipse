package tema10.HojaEjerciciosII;

public class Direccion {
	
	private String calle;
	private int numero;
	private int codigoPostal;
	
	public Direccion(String calle, int num, int cp) {
		
		this.calle= calle;
		this.numero= num;
		this.codigoPostal= cp;
	}
	
	@Override 
	public String toString() {
		return this.calle+" "+this.numero+" ("+this.codigoPostal+")";
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

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
	
}
