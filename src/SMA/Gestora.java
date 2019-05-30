package SMA;

import java.util.Arrays;

public class Gestora {

	public static void main(String[] args) {
		
		Empleado[] empleado = new Empleado[4];
		empleado[0] = new EAsalariado("569587A", "Javier", "Gómez", 2008, 1225.0);
		empleado[1] = new Ecomision("695235B", "Eva", "Nieto", 2010, 179, 8.10);
		Ecomision asalariado3 = new Ecomision();
		EAsalariado asalariado4 = new EAsalariado();
		
		asalariado3.setDniString("741258C");
		asalariado3.setNombreString("José");
		asalariado3.setApellidoString("Ruiz");
		asalariado3.setFechaIngreso(2012);
		asalariado3.setClientesCaptados(81);
		asalariado3.setFacturadoPorCliente(7.9);

		asalariado4.setDniString("896325D");
		asalariado4.setNombreString("María");
		asalariado4.setApellidoString("Núñez");
		asalariado4.setFechaIngreso(2013);
		asalariado4.setSalarioBase(1155.0);
		
		empleado[2] = asalariado3;
		empleado[3] = asalariado4;
		
		
		sueldoMayor(empleado);
		mostrarTodos(empleado);
		
		
	}
	
	public static void sueldoMayor(Empleado empleado[]){
	    int empMayor = 0; double salarioMayor = 0;
	        for (int i = 0; i < empleado.length; i++){
	            try{
	                if (empleado[i].obtenerSalario() > salarioMayor){
	                    empMayor = i;
	                    salarioMayor = empleado[i].obtenerSalario();
	                }
	            }catch(Exception e){
	                System.out.print(empleado[i].getNombreString() + " " + empleado[i].getApellidoString() + ": ");
	                System.out.println(e.getMessage());
	            }
	        }
	        System.out.printf("\nEl empleado con mayor salario es " 
	                + empleado[empMayor].getNombreString()+" "+empleado[empMayor].getApellidoString() + 
	                " con salario %.2f\n", salarioMayor);
	        System.out.println();
	  }
	
	public static void mostrarTodos(Empleado empleados[]){
	    System.out.println("Todos los empleados: \n");
	        for (int i = 0; i < empleados.length; i++){
	            empleados[i].imprimir();            
	        }
	  }

}
