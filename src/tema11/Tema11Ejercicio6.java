package tema11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Tema11Ejercicio6 {
	
	/*
	 * Escriba un método que retorne un Map con el número de repeticiones de cada palabra de
un fichero. El prototipo del método es el siguiente:
	 */
	
	public static void main(String[] args) {
		
		String ruta = "/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio7.txt";
		
		System.out.println(longitudMayorFichero(ruta));

	}

	public static Map<String, Integer> longitudMayorFichero(String ruta) {
		
		int valor=0;
		
		FileInputStream fis = null;
		BufferedReader dais = null;
		String  palabraMayorString = null;
		StringTokenizer stringToken = null;
		String string = null;
		Map<String, Integer> mapaMap = new HashMap<String, Integer>();
			
		try {
			
			fis = new FileInputStream(ruta);
			dais = new BufferedReader(new InputStreamReader(fis));
			
			
			
			while ((string = dais.readLine())!=null) {
				
				
				stringToken = new StringTokenizer(string);
				
				while(stringToken.hasMoreTokens()) {
					String palabraFichero = stringToken.nextToken();
					eliminaCaracteresEspeciales(palabraFichero);
					if(mapaMap.containsKey(palabraFichero)) {
						mapaMap.put(palabraFichero, mapaMap.get(palabraFichero)+1);
					}else {
						mapaMap.put(palabraFichero, 1);
					}
					
					
					
				}
				
				
			}
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				dais.close();
				
				
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		return mapaMap;
		//return valor;
	}
	
	public static String eliminaCaracteresEspeciales(String str) {
		return str.replaceAll("[^a-zA-Z0-9]", "");
	}
	
	
	
}
