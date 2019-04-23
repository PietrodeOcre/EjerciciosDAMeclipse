package tema10.SemanaSanta.Dos;

import java.util.HashSet;

public class Articulo implements Comparable{
	
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
	
	public String getHashId() {
		//System.out.println("Articulo: '"+this.ref+"', '"+this.nombre+"' ");
		String resp = this.ref+this.nombre;
		//System.out.println(resp);
		return resp;
	}

	@Override
	public int hashCode() {
		return getHashId().hashCode();
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
	@Override
	public int compareTo(Object articulo) {
		
		// TODO Auto-generated method stub
		return (int)precio-(int)((Articulo) articulo).precio;
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
		
		/*
		 * for(Artculo articulo:lista){
		 * 	if(!listax.add(articulo)){
		 * 		return false;
		 * 	}
		 * }
		 * return true;
		 */

	}

	
	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + ", ref=" + ref + ", precio=" + precio + "]";
	}

	public static void main(String[] args) {
		
		//Instanciamos un array de Articulos
		
			
		Articulo[] lista={
				new Articulo("Caja","2",2.99),
				new Articulo("Caja","6",6.99),
				new Articulo("Botella","3",3.99),
				new Articulo("Botella","4",4.99),
				new Articulo("Botella","1",1.99),
				new Articulo("Caja","5",5.99),
				new Articulo("Botella","7",7.99)};
		
		//Mostramos todos los elementos
		for (Articulo lis:lista) {
			System.out.println(lis.toString());
		}
		
		
		//Lista antes de tener un objeto repetido devuelve false
		System.out.println(compruebaLista(lista));
		
		System.out.println("");
		
		//Muestra el resultado de método en el objeto 0
		System.out.println(lista[0].getHashId());
		
		System.out.println("");
		
		//Probamos el método compareTo devuelve menor a 0 por que 
		//lista[0] va primero que lista[2]
		System.out.println(lista[0].compareTo(lista[2]));
		
		System.out.println("");
		
		//Probamos el método equals
		System.out.println(lista[0].equals(lista[1]));
		
		
		
		
	}


	
}
