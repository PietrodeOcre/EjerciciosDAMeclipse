package Manu_Corregido;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;

public class Prueba {
	
	public static void main(String[] args) {
		
		Properties propi = System.getProperties();
		Enumeration nombrePropiedadEnumeration = propi.propertyNames();
		while (nombrePropiedadEnumeration.hasMoreElements()) {
			String nombStringPropiString = (String) nombrePropiedadEnumeration.nextElement();
			String valorPropi = propi.getProperty(nombStringPropiString);
			System.out.println("llave: " + nombStringPropiString + " = " + valorPropi);	
		}/*
		Este código es capaz de mostrar todas las variables de entorno
		del sistema operativo en el que se ejecute este programa
		puede vales para determinar si el Slas que devemos usar es el de windows o 
		el de linux o la version de java que usaremos.
		*/
	    
		
		
	}
	


	    
	   
	
}
