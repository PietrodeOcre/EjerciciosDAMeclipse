package tema9.Ejercicio2Clase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Empresa implements Cloneable{

	//Atributos
	private static int id1 = 0;
	private int id;
	private String nombre;
	private Empleado[] empleado;
	private LocalDate fechaDeAlta;
	
	
	//Constructor
	public Empresa(String nombre, Empleado[] empleado) {
		this.id = id1++;
		
		this.nombre = nombre;
		this.empleado = empleado;
		this.fechaDeAlta = LocalDate.now();
	}
	
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona[] getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado[] empleado) {
		this.empleado = empleado;
	}
	public String getFechaDeAlta() {
		return fechaDeAlta.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}
	public void setFechaDeAlta(LocalDate fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}


	//Clone
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Empresa empresa = (Empresa)super.clone();
        empresa.empleado = (Empleado[])empresa.empleado.clone();
        return empresa;
	}

	//Equals
	@Override
	public boolean equals(Object obj) {     
        if ( obj instanceof Empresa &&
                ((Empresa)obj) != null &&
                ((Empresa)obj).nombre.equals(this.nombre) &&
                ((Empresa)obj).fechaDeAlta.equals(this.fechaDeAlta)) {
        	return true;
        }
        return false;
	}

	//toString
	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + ", empleado=" + Arrays.toString(empleado) + ", fechaDeAlta="
				+ getFechaDeAlta() + "]";
	}
	
	public String obtieneNombrePorAlmohadilla(Empleado[] empleado) {
		
		String cadena = "";

		for (int i = 0; i < empleado.length; i++) {
			
			cadena +=empleado[i].getNombre()+((i!= empleado.length-1)?"#":"");
		}
		
		return cadena;
	}
	
	
	public void imprimeCadenaEspecial(String cadena) {
		
		String cadenaFin = "";
		
		StringTokenizer nombre = new StringTokenizer(cadena,"#");
		
		String cadena2 = nombre.nextToken()+" ";
		
		while(nombre.hasMoreTokens()) {
			
			cadena2 += nombre.nextElement()+" ";
				
		}
		
		String[] cadena3 = null;
		
		StringTokenizer nombre2 = new StringTokenizer(cadena2," ");
		
		cadena3 = new String[nombre2.countTokens()];
		
		while(nombre2.hasMoreTokens()) {
			
			for (int x = 0; x < nombre2.countTokens(); x++) {
				
				cadena3[x] = nombre2.nextToken();
				cadena3[x] = cadena3[x].replaceAll("[aeiouAEIOU]", "");

				for (int i = 0; i < cadena3[x].length(); i++) {
					
					if (i%2==0 || i==0) {
						
						cadenaFin += cadena3[x].substring(i, i+1).toUpperCase();
						
					}else {
						
						cadenaFin += cadena3[x].substring(i, i+1).toLowerCase();
					}
					
				}
				cadenaFin += " ";
				
			}
	
		}
			
		System.out.println(cadenaFin);

	}
	
	

}
