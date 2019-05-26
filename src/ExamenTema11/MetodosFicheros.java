package ExamenTema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MetodosFicheros {

	/*
	 * metodo para leer un archivo con BufferedReader
	 */
	public static void leerArchivoBufferedReader (String ruta) {
		
		FileInputStream fis = null;
		BufferedReader dais = null;
		String cadenaString = null;

		try {
			
			fis = new FileInputStream(ruta);
			dais = new BufferedReader(new InputStreamReader(fis));

			while((cadenaString = dais.readLine()) != null) {
				cadenaString += dais.readLine();
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
		
		System.out.println(cadenaString);
	}
	
	/*
	 * metodo para escribir un String en un archivo con BufferedWriter
	 */
	public static void escribirStringArchivoBufferedWriter (String ruta, String cadenaString) {
		
		FileOutputStream fos = null;
		BufferedWriter daos = null;

		try {
			
			fos = new FileOutputStream(ruta);
			daos = new BufferedWriter(new OutputStreamWriter(fos));

			daos.write(cadenaString);

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
		
		System.out.println(cadenaString);
		
	}
	
	
	/*
	 * metodo para escribir un array de String en un archivo con BufferedWriter
	 */
	public static void escribirArrayStringArchivoBufferedWriter (String ruta, String[] cadenaString) {
		
		FileOutputStream fos = null;
		BufferedWriter daos = null;

		try {
			
			fos = new FileOutputStream(ruta);
			daos = new BufferedWriter(new OutputStreamWriter(fos));

			for (String string : cadenaString) {
				daos.write(string);
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
		
		System.out.println(cadenaString);
		
	}
	
	/*
	 * metodo para leer un archivo con DataInputStream
	 */
	public static void leerArchivoDataInputStream (String ruta) {
		
		FileInputStream fis = null;
		DataInputStream dais = null;
		String cadenaString = null;

		try {
			
			fis = new FileInputStream(ruta);
			dais = new DataInputStream(fis);

			while(dais.available()>0) {
				cadenaString += dais.readUTF();
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
		
		System.out.println(cadenaString);
	}
	
	/*
	 * metodo para escribir un String en un archivo con DataOutputStream
	 */
	public static void escribirStringArchivoDataOutputStream (String ruta, String cadenaString) {
		
		FileOutputStream fos = null;
		DataOutputStream daos = null;

		try {
			
			fos = new FileOutputStream(ruta);
			daos = new DataOutputStream(fos);

			daos.writeUTF(cadenaString);

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
		
		System.out.println(cadenaString);
		
	}
	
	/*
	 * metodo para escribir un array de String en un archivo con DataOutputStream
	 */
	public static void escribirArrayStringArchivoDataOutputStream (String ruta, String[] cadenaString) {
		
		FileOutputStream fos = null;
		DataOutputStream daos = null;

		try {
			
			fos = new FileOutputStream(ruta);
			daos = new DataOutputStream(fos);
			
			for (String string : cadenaString) {
				daos.writeUTF(string);
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
		
		System.out.println(cadenaString);
		
	}
	
	/*
	 * Devuelve lista de directorios de un directorio dado
	 */
	public static List<String> obtieneInfoDirectorios(String nombreDirectorio){
		
		List<String> nombreList = new ArrayList<String>();
		
		File filaFile = new File(nombreDirectorio);
		
		if (filaFile.exists()) {
			File[] listaficheros = filaFile.listFiles();
			for (File file2 : listaficheros) {
				if(file2.isDirectory()) {
					nombreList.add(file2.getName());
				}
				
			}
		}	
		return nombreList;
	}
	
	/*
	 * Devuelve lista de ficheros de un directorio dado
	 */
	public static List<String> obtieneInfoFicheros(String nombreDirectorio){
		
		List<String> nombreList = new ArrayList<String>();
		
		File filaFile = new File(nombreDirectorio);
		
		if (filaFile.exists()) {
			File[] listaficheros = filaFile.listFiles();
			for (File file2 : listaficheros) {
				if(file2.isFile()) {
					nombreList.add(file2.getName());
				}
				
			}
		}	
		return nombreList;
	}
	
	/*
	 * Muestra los ficheros de un directorio dado
	 */
	private static void ficherosEnDirectorio(File ruta) {
		if (ruta.exists() && ruta.isDirectory()) {
			File[] listaficheros = ruta.listFiles();
			for (File file2 : listaficheros) {
				System.out.println(file2.getName());
			}
		}
	}
	
	/*
	 * Retira todo lo que no sea letras minusculas, mayusculas o numeros
	 */
	public static String eliminaCaracteresEspeciales(String str) {
		return str.replaceAll("[^a-zA-Z0-9]", "");
	}
	
	/*
	 * Devuelve una lista con las palabras de un archivo
	 */
	public static List<String> tokenizador(String ruta) {

		FileInputStream fis = null;
		BufferedReader dais = null;
		String cadenaString = null;
		StringTokenizer tokenizador = null;
		String tok = null;
		List<String> tokList = null;
		
		try {
			
			fis = new FileInputStream(ruta);
			dais = new BufferedReader(new InputStreamReader(fis));
			tokList = new ArrayList<String>();

			while ((cadenaString = dais.readLine()) != null) {
	
				cadenaString += dais.readLine();
				
				tokenizador = new StringTokenizer(cadenaString, " ");
				
				while (tokenizador.hasMoreTokens()) {

					tok = tokenizador.nextToken();

					tokList.add(tok);

				}

			}		

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dais.close();
			} catch (final IOException e2) {
				e2.printStackTrace();
			}finally {
				
			}
		}
		return tokList;
	}
	
	/*
	 * Devuelve una lista con las palabras sin repeticion de un archivo
	 */
	public static Set<String> palabrasUnicas(String ruta) {

		FileInputStream fis = null;
		BufferedReader dais = null;
		String cadenaString = null;
		StringTokenizer tokenizador = null;
		String tok = null;
		Set<String> tokList = null;
		
		try {
			
			fis = new FileInputStream(ruta);
			dais = new BufferedReader(new InputStreamReader(fis));
			tokList = new HashSet<String>();

			while ((cadenaString = dais.readLine()) != null) {
	
				cadenaString += dais.readLine();
				
				tokenizador = new StringTokenizer(cadenaString, " ");
				
				while (tokenizador.hasMoreTokens()) {

					tok = tokenizador.nextToken();

					tokList.add(tok);

				}

			}		

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dais.close();
			} catch (final IOException e2) {
				e2.printStackTrace();
			}finally {
				
			}
		}
		return tokList;
	}
	
	
	/*
	 * Método para leer un archivo con BufferedReader que devuelve un mapa
	 */
	public static Map<String, String> leerArchivoBufferedReaderMap(String ruta) {
		
		FileInputStream fis = null;
		BufferedReader dais = null;
		String cadenaString = null;
		Map<String, String> mapaInicial = null;
		StringTokenizer token = null;

		try {
			
			fis = new FileInputStream(ruta);
			dais = new BufferedReader(new InputStreamReader(fis));
			
			mapaInicial = new TreeMap<String, String>();
			String aux1 = "";
			String aux2 = "";
			int cont = 0;
			
			while((cadenaString = dais.readLine()) != null) {
				cadenaString += dais.readLine();
				token = new StringTokenizer(cadenaString ," \n");
				while (token.hasMoreTokens()) {
					
						aux1 = token.nextToken();
						aux2 = token.nextToken();
						mapaInicial.put(aux1, aux2);
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
	 * metodo para escribir un mapa de String en un archivo con BufferedWriter
	 */
	public static void escribirArrayStringArchivoBufferedWriter (String ruta, Map<String, String> mapa) {
		
		FileOutputStream fos = null;
		BufferedWriter daos = null;

		try {
			
			fos = new FileOutputStream(ruta);
			daos = new BufferedWriter(new OutputStreamWriter(fos));

			for (Entry<String, String> entry: mapa.entrySet()) {
				
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
	
	
	
}
