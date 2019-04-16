package tema10.SemanaSanta.dos;

import java.util.HashSet;

public class Articulo{
	
	String nombre;
	String ref;
	double precio;
	
	//Constructor
	public Articulo(String nombre, String ref, double precio) {
		this.nombre = nombre;
		this.ref = ref;
		this.precio = precio;
	}
	
	//Setters AND Getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void getHashId() {
		System.out.println("Articulo: '"+this.ref+"', '"+this.nombre+"' ");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((ref == null) ? 0 : ref.hashCode());
		return result;
	}

	// Equals
	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof Articulo) && 
				((Articulo)obj).ref.equals(this.ref) && 
				((Articulo)obj).nombre.equals(this.nombre)) {
			return true;
		}
		return false;
	}

	//CompareTo
	public int compareTo(Articulo articulo) {
		return (int)precio-(int)articulo.precio;
	}
	
	
	public static boolean compruebaLista(Articulo[] lista) {
		
		HashSet<Articulo> listax = new HashSet<Articulo>();
		
		for (int i = 0; i < lista.length; i++) {
			listax.add(lista[i]);
		}
		
		if(lista.length == listax.size()) {
			return false;
		}else {
			return true;
		}

	}

	
	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + ", ref=" + ref + ", precio=" + precio + "]";
	}

	public static void main(String[] args) {
		
		//Instanciamos un array de Articulos
		
			
		Articulo[] lista={new Articulo("Botella","1",0.99),
				new Articulo("Caja","2",0.99),
				new Articulo("Botella2","3",0.99),
				new Articulo("Botella3","4",0.99),
				new Articulo("Caja2","5",0.99),
				new Articulo("Caja3","6",0.99),
				new Articulo("Botella4","7",0.99)};
		
		//Lista antes de tener un objeto repetido devuelve false
		System.out.println(compruebaLista(lista));
	
		System.out.println("");
		
		//Muestra el resultado de método
		lista[0].getHashId();
		
		System.out.println("");
		
		//Probamos el método compareTo
		System.out.println(lista[0].compareTo(lista[1]));
		
		System.out.println("");
		
		//Probamos el método equals
		System.out.println(lista[0].equals(lista[1]));
		
		
		
		
	}

	
}
