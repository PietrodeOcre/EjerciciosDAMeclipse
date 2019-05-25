package ExamenTema10.Dos;

import java.util.Map;
import java.util.TreeMap;

public class Colecciones {
	 public static void main(String[] args) {
	 Map<Municipio, Double>  poblacionMunicipio = new TreeMap<>();
	 // Provincia, Municipio, A�oCenso y Poblaci�n en miles
	 poblacionMunicipio.put( new Municipio("Madrid", "Alcobendas", 2009), 106.0);
	 poblacionMunicipio.put( new Municipio("Madrid", "Alcobendas", 2008), 107.51);
	 poblacionMunicipio.put( new Municipio("Zamora", "Abezames", 2001), 0.107);
	 poblacionMunicipio.put( new Municipio("Cuenca", "Castejon", 2006), 0.2);
	 poblacionMunicipio.put( new Municipio("Navarra", "Castejon", 2006), 3.9);

	 System.out.println(poblacionMunicipio);
	 } 
} 