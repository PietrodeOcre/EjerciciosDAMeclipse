package tema11;

public class Persona {

	private String nombreString;
	private String apellidoString;
	private Brazo brazo;
	public String getNombreString() {
		return nombreString;
	}
	public void setNombreString(String nombreString) {
		this.nombreString = nombreString;
	}
	public String getApellidoString() {
		return apellidoString;
	}
	public void setApellidoString(String apellidoString) {
		this.apellidoString = apellidoString;
	}
	public Brazo getBrazo() {
		return brazo;
	}
	public void setBrazo(Brazo brazo) {
		this.brazo = brazo;
	}
	public Persona(String nombreString, String apellidoString, Brazo brazo) {
		this.nombreString = nombreString;
		this.apellidoString = apellidoString;
		this.brazo = brazo;
	}
	@Override
	public String toString() {
		return "Persona [nombreString=" + nombreString + ", apellidoString=" + apellidoString + ", brazo=" + brazo
				+ "]";
	}
	public void setPersona(String string, String string2, Brazo brazo2) {
		// TODO Auto-generated method stub
		
	}
	
}
