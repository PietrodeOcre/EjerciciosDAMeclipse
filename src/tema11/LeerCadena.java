package tema11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerCadena {

	public static String leerCadena() {
		String cad = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			cad = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cad;
	}

	public static void main(String[] args) {
		String cad;
		System.out.println("Este programa hace eco hasta que escribas stop");
		do {
			cad = leerCadena();
			System.out.println(cad);
		} while (!cad.equals("stop"));
	}

}
