package tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Tema11Ejercicio9 {

	/*
	 * Tenemos un fichero con una serie de números los cuales queremos ordenar de manera
ascendente. El objetivo es que los números queden ordenados en el mismo fichero. Para la
resolución del problema crea una clase Orden con un método “ordena” que haga la
ordenación de los datos del fichero. Los números están cada uno en una línea del fichero y el
fichero cuenta con al menos 5 números.
	 */
	
	
	public static void main(String[] args) {
		
		String rutaString = "/home/pietrodeocre/Documentos/GradoSuperior/PROG/Tema11/Ejercicio7/ejercicio9.txt";
		
		ordena(rutaString);
	}
	
	public static void ordena(String ruta) {
		
		FileInputStream fisFileInputStream = null;
		FileOutputStream fosFileOutputStream = null;
		BufferedReader daisBufferedReader = null;
		BufferedWriter daosBufferedWriter = null;
		
		List<Integer> listaEnterosIntegers = new ArrayList<Integer>();
		
		
		try {
			
			fisFileInputStream = new FileInputStream(ruta);
			daisBufferedReader = new BufferedReader(new InputStreamReader(fisFileInputStream));
			
			String str = "";
			Integer enteroInteger = 0;
			
			while ((str = daisBufferedReader.readLine())!= null) {
				
				listaEnterosIntegers.add(Integer.parseInt(str));
								
			}
			
			Collections.sort(listaEnterosIntegers);
			
			fosFileOutputStream = new FileOutputStream(ruta);
			daosBufferedWriter = new BufferedWriter(new OutputStreamWriter(fosFileOutputStream));
			
			for (int i = 0; i < listaEnterosIntegers.size(); i++) {
				daosBufferedWriter.write(listaEnterosIntegers.get(i));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				daisBufferedReader.close();
				daosBufferedWriter.close();
				
			} catch (IOException e2) {
				// TODO: handle exception
			}finally {
				
			}
		}
		
		
	}
	
}
