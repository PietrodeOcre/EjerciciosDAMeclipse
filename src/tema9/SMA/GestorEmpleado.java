package tema9.SMA;

public class GestorEmpleado {
	public static void main(String[] args) {
		Empleado empleado[] = new Empleado[4];
		EAsalariado asal1 = new EAsalariado("569587A", "Javier", "Gomez", 2015, 1225.00);
        empleado[0] = asal1;
        
        EComision ecom1 = new EComision("695235B", "Eva", "Nieto", 2010, 179, 8.10);
        empleado[1] = ecom1;
        
        EComision ecom2 = new EComision();
        ecom2.setDni("741258C");
        ecom2.setNombre("José");
        ecom2.setApellido("Ruiz");
        ecom2.setAnioIngreso(2012);
        ecom2.setClientesCaptados(81);
        ecom2.setFacturadoPorCliente(7.90);
        empleado[2] = ecom2;
        
        EAsalariado asal2 = new EAsalariado();
        asal2.setDni("896325D");
        asal2.setNombre("Maria");
        asal2.setApellido("Nuñez");
        asal2.setAnioIngreso(2013);
        asal2.setSalarioBase(1155);
        empleado[3] = asal2;
        
        sueldoMayor(empleado);
        mostrarTodos(empleado);
	}
	
	public static void sueldoMayor(Empleado empleado[]){
		int empMayor = 0; double salarioMayor = 0;
        for (int i = 0; i < empleado.length; i++){
            try{
            	//if (empleado[i].getAnioIngreso() < 0 ) {
            		//throw new Exception("Años Negativos no funcionan");
            	//}
            	
                if (empleado[i].obtenerSalario() > salarioMayor){
                    empMayor = i;
                    salarioMayor = empleado[i].obtenerSalario();
                }
            }catch(Exception e){
                System.out.print(empleado[i].getNombre() + " " + empleado[i].getApellido() + ": ");
                System.out.println(e.getMessage());
            }
        }
        System.out.printf("\nEl empleado con mayor salario es " 
                + empleado[empMayor].getNombre()+" "+empleado[empMayor].getApellido() + 
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
