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
        empresa.empleado = (Empleado[])this.empleado.clone();
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
		
		StringTokenizer nombre = new StringTokenizer(cadena, " ");
		String cad = "";
		while(nombre.hasMoreTokens()) {
			cad = nombre.nextToken().toString();
			cadena+=cad.substring(0, 1).toUpperCase()+cad.substring(1,cad.length());
		}
		
		//System.out.println(cad);
			
		for (int i = 0; i < empleado.length; i++) {
			cadena +=empleado[i].getNombre().substring(0, 1).toUpperCase()+empleado[i].getNombre().substring(1,empleado[i].getNombre().length())+((i!= empleado.length-1)?"#":"");
		}
		
		return cadena;
	}
	
	
	public void imprimeCadenaEspecial(String cadena) {
		
		//System.out.println(cadena);
		
		StringTokenizer nombre = new StringTokenizer(cadena,"#");
		
		cadena = nombre.nextToken()+" ";
		
		while(nombre.hasMoreTokens()) {
			cadena += nombre.nextToken()+" ";
		}

		StringBuffer stb = new StringBuffer();

		stb.append(cadena.replaceAll("e", ""));
		
		System.out.println(stb.toString());
		
		for(int i=0; i<stb.length(); i++){
            if(stb.charAt(i) == 'a' ||
                    stb.charAt(i) == 'e' ||
                    stb.charAt(i) == 'i' ||
                    stb.charAt(i) == 'o' ||
                    stb.charAt(i) == 'u' 
                    ){
                stb.deleteCharAt(i);
            }
        }
		
        System.out.println(stb);
	
	}

}
