package tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EjemploFichero1 {
	
	public static void main(String[] args) {
		
		BufferedWriter bWriter = null;
		BufferedReader brReader = null;
		
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		
		try {
			
			fos = new FileOutputStream("//home//pietrodeocre//prueba.txt");
			bWriter = new BufferedWriter(new OutputStreamWriter(fos));
			
			bWriter.write("Mi primer fichero \n");
			bWriter.write("Mi segunda linea en el fichero\n");
			bWriter.write("Mi tercera linea");
			
			
			
			bWriter.flush();
			
			fis = new FileInputStream("//home//pietrodeocre//prueba.txt");
			brReader = new BufferedReader(new InputStreamReader(fis));
			
			String string = null;
			int cont = 0;
			while((string = brReader.readLine())!=null){
				System.out.println(string);
				cont++;
			}
			System.out.println("Numero de lineas del fichero: "+ cont);
			System.out.println(brReader.lines());
			
			//System.out.println(brReader.readLine());
			
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
