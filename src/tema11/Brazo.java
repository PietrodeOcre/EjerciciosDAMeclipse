package tema11;

public class Brazo {
	
	private String ladoDerString= "derecho";
	private String ladoIzqString = "Izquierdo";
	public String getLadoDerString() {
		return ladoDerString;
	}
	public void setLadoDerString(String ladoDerString) {
		this.ladoDerString = ladoDerString;
	}
	public String getLadoIzqString() {
		return ladoIzqString;
	}
	public void setLadoIzqString(String ladoIzqString) {
		this.ladoIzqString = ladoIzqString;
	}
	public Brazo(String ladoDerString, String ladoIzqString) {
		this.ladoDerString = ladoDerString;
		this.ladoIzqString = ladoIzqString;
	}
	@Override
	public String toString() {
		return "Brazo [ladoDerString=" + ladoDerString + ", ladoIzqString=" + ladoIzqString + "]";
	}

}
