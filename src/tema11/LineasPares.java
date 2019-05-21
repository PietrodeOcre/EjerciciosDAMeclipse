package tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LineasPares {

	/*
	 * Dado un archivo con una serie de lineas.
	 * almacenar en un fichero llado lineasPares.txt las lineas 
	 * pares de archvo inicial, y otro con las lineas impares de 
	 * dicho fichero
	 * 
	 * 
	 * 
	 * tenemos un fichero con 400 alabras y 20 lineas y 
	 * quiero tener un diccionario sin repetidos
	 * 
	 */
		
		
	public static void main(String[] args)  {
		
		BufferedWriter escribir1 = null;
		BufferedWriter escribir2 = null;
		BufferedReader reader = null;
		
		FileOutputStream filaOut = null;
		FileInputStream filaIn = null;
		
		StringBuffer pares = new StringBuffer();
		StringBuffer impares = new StringBuffer();
		
		try {
			
			filaIn = new FileInputStream("/home/pietrodeocre/prueba2.txt");
			reader = new BufferedReader(new InputStreamReader(filaIn));
			
			String cad;
			int cont=0;
			while((cad = reader.readLine()) != null) {
				
				System.out.println(cad);
				if(cont%2==0) {
					pares.append(cad);
					pares.append("\n");
				}else {
					impares.append(cad);
					impares.append("\n");
				}
				cont++;
			}
			
			filaOut = new FileOutputStream("/home/pietrodeocre/pares.txt");
			escribir1 = new BufferedWriter(new OutputStreamWriter(filaOut));
			escribir1.write(pares.toString());
			
			
			
			filaOut = new FileOutputStream("/home/pietrodeocre/impares.txt");
			escribir2 = new BufferedWriter(new OutputStreamWriter(filaOut));
			escribir2.write(impares.toString());
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				reader.close();
				escribir1.close();
				escribir2.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			
			
		}
		

	}

}
