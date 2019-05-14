package tema10.HojaEjercicios.IITres;

public class Entrada implements Comparable<Entrada>{
	
	protected final String descripcion;
	
	protected final Evento evento; 
	
	protected Double precio;
	protected Double precioFinal;

	public Entrada(String descripcion2, int i, Evento evento) {
		this.descripcion = descripcion2;
		this.precio = (double) i;
		this.evento = evento;
	}
	
	public Entrada(String descripcion,Double precio, Evento evento) {
		this.descripcion = descripcion;
		this.precio = precio;
		this.evento = evento;
	}
	
	public Entrada(Entrada entrada,String descripcion) {
		this.descripcion = entrada.getDescripcion();
		this.precio = entrada.precio;
		this.evento = entrada.getEvento();
	}
	
	public Entrada(Entrada entrada) {
		this.descripcion = entrada.getDescripcion();
		this.precio = entrada.precio;
		this.evento = entrada.getEvento();
	}

	public Evento getEvento() { 
		return evento; 
	}
	
	public String getDescripcion() { 
		return descripcion; 
	}
	
	public String toString() {
		return descripcion+" : "+ precioBase() +" -> "+ precioFinal(this.getEvento());
	}

	protected Double precioFinal(Evento evento) {
		precioFinal = this.precio;
		if(evento.equals(evento.SOCIAL)) {
			precioFinal = this.precio * 0.5;
	    }
		return precioFinal;
	}
			

	protected Double precioBase() {
		return precio;
	}

	public int compareTo(Entrada ent) {
		return descripcion.compareTo(ent.getDescripcion());
	}

}
