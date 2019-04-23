package tema10.SemanaSanta.Uno;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//Creamos una lista TreeSet para poder agregarla al vehículo
		TreeSet<String> caracterist1 = new TreeSet<String>();
		
		//Asignamos valores a la lista
		caracterist1.add("Rojo");
		caracterist1.add("Verde");
		caracterist1.add("Azul");
		caracterist1.add("Amarillo");
		caracterist1.add("Blanco");
		
		//Instanciamos varios VehiculosMotor de la clase Coche con su constructor
		VehiculoMotor coche1 = new Coche("seat", 4, caracterist1);//Pasamos una lista TreeSet
		VehiculoMotor coche2 = new Coche("Mercedes", 4, caracterist1);
		VehiculoMotor coche3 = new Coche("BMW", 4, caracterist1);
		VehiculoMotor coche4 = new Coche("Audi", 4, caracterist1);
		
		//Instanciamos varios VehiculosMotor de la clase Moto con su constructor
		VehiculoMotor moto1 = new Moto("Honda", 2, caracterist1);
		VehiculoMotor moto2 = new Moto("Suzuki", 2, caracterist1);
		VehiculoMotor moto3 = new Moto("Ducati", 2, caracterist1);
		VehiculoMotor moto4 = new Moto("Kawasaki", 2, caracterist1);
		
		//Comprobamos que imprime las caracteristicas del coche con método
		coche1.imprimeCaracteristicas();
		
		//Dejamos espacio en blanco
		System.out.println("");
		
		//Comprobamos que imprime las caracteristicas del coche con método
		coche1.ImprimeOtrasCaracteristicas("Verde"); //En esta ocasion no aparce la caracteristica verde.
		
		//Dejamos espacio en blanco
		System.out.println("");
		
		//Probamosa  imprimir un Vehículo de cada tipo
		System.out.println(coche1);
		System.out.println(moto1);
		
		//Dejamos espacio en blanco
		System.out.println("");
		
		//Creamos una lista HashSet para las plazas de vehículos del parking1		
		HashSet<Vehiculo> plaza = new HashSet<Vehiculo>();
		
		//Añadimos vehículos a las plazas
		plaza.add(coche1);
		plaza.add(coche2);
		plaza.add(moto1);
		plaza.add(moto2);
		
		//Instanciamos un parking1 al que le asignamos su atributo HashSet
		Parking parking1 = new Parking(plaza);
		
		//Imprimimos por pantalla el parking1 para comprobar que muestra los vehículos en su interior
		System.out.println(parking1);
		
		//Dejamos espacio en blanco
		System.out.println("");
		
		//Usamos el método de la clase Parking para agregar un vehículo más.
		parking1.addVehiculo(moto3);
		
		//Imprimimos por pantalla el parking1 para comprobar que se agregan los vehículos en su interior
		System.out.println(parking1);
		
		/*
		for(Vehiculo v:plaza) {
			v.imprimeCaracteristicas();
		}
		*/
	}
	
}
