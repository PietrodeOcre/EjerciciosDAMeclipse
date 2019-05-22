package tema11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Diccionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(crearDiccionarioDeFichero("/home/pietrodeocre/pares.txt"));
	}

	public static Set<String> crearDiccionarioDeFichero(String rutaFichero){
		
		BufferedReader br = null;
		FileInputStream fis = null;
		
		Set<String> diccionarioSet = new HashSet<>();
		
		
		try {
			
			fis = new FileInputStream(rutaFichero);
			br = new BufferedReader(new InputStreamReader(fis));
			
			String str = null;
			StringTokenizer stringTokenizer = null;
			
			while ((str= br.readLine())!=null) {
				stringTokenizer = new StringTokenizer(str);
				
				while(stringTokenizer.hasMoreTokens()) {
					eliminaCaracteresEspeciales(stringTokenizer.nextToken().toLowerCase());
				}
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				
				return diccionarioSet;
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		return diccionarioSet;
		
	}
	
	public static String eliminaCaracteresEspeciales(String str) {
		return str.replaceAll("[^a-zA-Z0-9]", "");
	}
	
}
