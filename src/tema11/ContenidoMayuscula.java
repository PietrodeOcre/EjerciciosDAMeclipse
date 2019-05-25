package tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class ContenidoMayuscula {

public static void main(String[] args) {
		
		BufferedWriter bWriter = null;
		BufferedReader brReader = null;
		
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		StringBuffer strbBuffer = new StringBuffer();
		
		try {
			
			
		
			
			fis = new FileInputStream("/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/archivosficheros/prueba2.txt");
			brReader = new BufferedReader(new InputStreamReader(fis));
			
			
			String string = null;
			int cont = 0;
			
			
			
			
			
			//List<String> lineaStrings = new ArrayList<String>();
			
			while((string = brReader.readLine())!=null){
				System.out.println(string);
				strbBuffer.append(string.toUpperCase());
				strbBuffer.append("\n");
				//lineaStrings.add(string); 
				
				
				
				
				
				cont++;
			}
			System.out.println("Numero de lineas del fichero: "+ cont);
			
			
			fos = new FileOutputStream("/home/pietrodeocre/Documentos/gradomedio/GradoSuperior/PROG/Tema11/archivosficheros/prueba2.txt");
			bWriter = new BufferedWriter(new OutputStreamWriter(fos));
			
			//for (String string2 : lineaStrings) {
				//bWriter.write(string2.toUpperCase() + "\n");
			//}
			bWriter.write(strbBuffer.toString());
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bWriter.close();
				brReader.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			
		}
		
		
		
		
	}

}
