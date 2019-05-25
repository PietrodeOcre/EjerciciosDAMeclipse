package tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class AgendaTelefono {
	
	/*
	 * Una agenda de teléfonos incluye una lista 
	 * de nombres y números de teléfonos asociados. 
	 * Aunque una agenda de teléfono no es útil a 
	 * menos que se pueda almacenar permanentemente
	 *  la información en un fichero. Escribe 
	 *  un programa que sea una agenda de teléfonos 
	 *  de tal forma que almacene los nombres y 
	 *  teléfonos en un fichero.  
	 *  El programa tiene las siguientes características:
	 *  -El usuario del programa podría ser capaz 
	 *  de buscar un nombre en el directorio y 
	 *  encontrar el número de teléfono asociado. 
	 *  -El usuario también debería ser capaz de 
	 *  hacer cambios en los datos del directorio.
	 *  *****-Cada vez que el programe inicie, debería 
	 *  leer los datos del fichero. 
	 *  -Antes de que el programa finalice, si los datos han 
	 *  sido cambiados mientras el programa estaba 
	 *  ejecutándose, el fichero debería 
	 *  reescribirse con la nueva información.
	 *  Diseña una interfaz de usuario como parte del ejercicio.
	 *  
	 *  lista nombres
	 *  lista de telefonos
	 *  1 fichero
	 *  metodo busca por nombre (devuelve telefono)
	 *  metodo realiza cambios en un registro.
	 *  metodo compara fichero inicial y fichero actual
	 *  	(si cambia, graba fichero con datos de fichero actual, en mismo archivo)
	 *  
	 */

	public static void main(String[] args) {	
		String ruta ="/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/archivosficheros/agenda.txt";
		Map<String, String> agendaTelefonica = new TreeMap<>(leerArchivoBufferedReader(ruta));
		Map<String, String> agendaTelefonicaAux = new TreeMap<String, String> (agendaTelefonica);
		String opcion = "";
		/*
		iniciarRegistro(agendaTelefonica, "Manuel", "91543341");
		iniciarRegistro(agendaTelefonica, "Marta", "91543342");
		iniciarRegistro(agendaTelefonica, "Laura", "91543343");
		iniciarRegistro(agendaTelefonica, "Miguel", "91543344");
		iniciarRegistro(agendaTelefonica, "Sofia", "91543345");
		iniciarRegistro(agendaTelefonica, "Pedro", "91543346");
		iniciarRegistro(agendaTelefonica, "Sara", "91543347");
		iniciarRegistro(agendaTelefonica, "Javier", "91543348");
		System.out.println(iniciarRegistro(agendaTelefonica, "Jose", "91543349"));
		*/	
		do {
			System.out.print("");
			System.out.flush();
			System.out.println("Agenda Telefónica \n");
			System.out.println("Menú \n");
			System.out.println("1- Listar agenda. \n");
			System.out.println("2- Buscar contacto. \n");
			System.out.println("3- Modificar contacto. \n");
			System.out.println("4- Añadir contacto. \n");
			System.out.println("5- Salir. \n");
			
			Scanner sc = new Scanner(System.in);
			opcion = sc.nextLine();
			
			switch (opcion) {
			case "1":
				System.out.print("");
				System.out.flush();
				System.out.println(agendaTelefonicaAux);
				pausa();
				break;
			case "2":
				System.out.print("");
				System.out.flush();
				System.out.println(encuentraContacto(agendaTelefonicaAux));
				pausa();
				break;
			case "3":
				System.out.print("");
				System.out.flush();
				System.out.println(modificarContacto(agendaTelefonicaAux));
				pausa();
				break;
			case "4":
				System.out.print("");
				System.out.flush();
				System.out.println(crearNuevo(agendaTelefonicaAux));
				pausa();
				break;
			case "5":
				System.out.print("");
				System.out.flush();
				System.out.println(salirGrabar(agendaTelefonica, agendaTelefonicaAux, ruta));
				
				return;

			default:
				System.out.println("Opción incorrecta."
						+ "\nElige una opción del menú.");
				break;
			}	
		}while(opcion!="5");
		//System.out.println(leerArchivoBufferedReader(ruta));
		//System.out.println(agendaTelefonica);
		//escribirArrayStringArchivoBufferedWriter(ruta, agendaTelefonica);
		//System.out.flush();
	}
	
	/*
	 * Pausa para leer
	 */
	public static void pausa() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.flush();
			System.out.println("Pulsa Enter para continuar...");
			String pausa = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * Buscar contactos
	 */
	public static String encuentraContacto(Map<String, String> mapa) {	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el nombre a buscar:");
		String nombre = sc.nextLine();
		
		String auxNombre = "";
		String auxTelefono = "";
		if(mapa.containsKey(nombre)) {			
			auxNombre = nombre;
			auxTelefono = mapa.get(nombre);	
			return "Su contacto es: " + auxNombre + " " + auxTelefono;
		}else {
			return "Ese contacto no existe.";
		}
	}
	
	/*
	 * Crear nuevo contacto
	 */
	public static String modificarContacto(Map<String, String> mapa) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el Nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Escribe el Teléfono: ");
		String telefono = sc.nextLine();
		if(mapa.containsKey(nombre)) {
			iniciarRegistro(mapa, nombre, telefono);
			
		}else {
			return "El nombre No esta en la lista, vuelva a intentarlo con un nombre que si esté.";
		}
		return "Ha modificado el contacto con numero: " + telefono +  " \nY nombre: " + nombre;
	}
	
	/*
	 * Salir y grabar
	 */
	public static String salirGrabar(Map<String, String> mapa, Map<String, String> mapa2, String ruta) {
		if(mapa.equals(mapa2)) {
			return "Ha salido del programa.";
		}else {
			escribirArrayStringArchivoBufferedWriter(ruta, mapa2);
		}
		return "Ha salido del programa.";
	}
	
	/*
	 * Crear nuevo contacto
	 */
	public static String crearNuevo(Map<String, String> mapa) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el Nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Escribe el Teléfono: ");
		String telefono = sc.nextLine();
		if(mapa.containsKey(nombre)) {
			return "El nombre ya esta en la lista, vuelva a intentarlo con otro nombre diferente.";
		}else {
			iniciarRegistro(mapa, nombre, telefono);
		}
		return "Ha registrado el numero: " + telefono +  " \nA nombre de: " + nombre;
	}
	
	/*
	 * metodo para leer un archivo con BufferedReader
	 */
	public static Map<String, String> leerArchivoBufferedReader(String ruta) {
		
		FileInputStream fis = null;
		BufferedReader dais = null;
		String cadenaString = null;
		Map<String, String> mapaInicial = null;
		StringTokenizer nombreNumero = null;

		try {
			
			fis = new FileInputStream(ruta);
			dais = new BufferedReader(new InputStreamReader(fis));
			
			mapaInicial = new TreeMap<String, String>();
			String nombre1 = "";
			String telefono1 = "";
			int cont = 0;
			
			while((cadenaString = dais.readLine()) != null) {
				cadenaString += dais.readLine();
				nombreNumero = new StringTokenizer(cadenaString ," \n");
				while (nombreNumero.hasMoreTokens()) {
					
						nombre1 = nombreNumero.nextToken();
						telefono1 = nombreNumero.nextToken();
						mapaInicial.put(nombre1, telefono1);
				}
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dais.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}finally {
				
			}
		}

		return mapaInicial;
	}
	
	/*
	 * metodo para escribir un array de String en un archivo con BufferedWriter
	 */
	public static void escribirArrayStringArchivoBufferedWriter (String ruta, Map<String, String> mapaFinal) {
		
		FileOutputStream fos = null;
		BufferedWriter daos = null;

		try {
			
			fos = new FileOutputStream(ruta);
			daos = new BufferedWriter(new OutputStreamWriter(fos));

			for (Entry<String, String> entry: mapaFinal.entrySet()) {
				
				daos.write(entry.getKey() + " "+ entry.getValue() + "\n");
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				daos.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}finally {
				
			}
		}
		
		//System.out.println(mapaFinal);
		
	}
	
	
	public static Map<String, String> iniciarRegistro(Map<String, String> mapaInicial, String nombre, String telefono) {

		mapaInicial.put(nombre, telefono+" \n");

		return mapaInicial;
		
	}

}
