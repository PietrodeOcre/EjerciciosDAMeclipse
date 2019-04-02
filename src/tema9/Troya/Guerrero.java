package tema9.Troya;

public abstract class Guerrero implements Cloneable{

	protected String nombre;
	protected int edad;
	protected int fuerza;
	protected boolean herido;
	protected boolean muerto;
	
	public Guerrero(String nombre, int edad, int fuerza) {
		this.nombre = nombre;
		this.edad = ((comprobarEdad(edad))?edad:25);
		this.fuerza = ((comprobarFuerza(fuerza))?fuerza:5);
		this.herido = false;
		this.muerto = false;
	}
	
	public Guerrero() {
		this("GuerreroX", 15, 1);
	}
	
	public Guerrero(Guerrero guerrero, String nombre) {
		
		Guerrero guerrero1 = null;
		try {
			guerrero1 = (Guerrero)guerrero.clone();
		}catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	protected static boolean comprobarEdad(int edad) {
		return (edad>=15 && edad<=60);
	}
	
	protected static boolean comprobarFuerza(int fuerza) {
		return (fuerza>=1 && fuerza<=10);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public abstract boolean retirarse();
	
	
	
}
