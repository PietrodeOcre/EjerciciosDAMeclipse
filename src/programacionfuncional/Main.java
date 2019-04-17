/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionfuncional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author pietrodeocre
 */
public class Main {
    public static void main(String[] args){
        
        Alumno alumno1 = new Alumno(1, "Maria", "Apellidos", "1", 7, 43);
        Alumno alumno2 = new Alumno(2, "José", "Apellidos", "2", 7, 34);
        Alumno alumno3 = new Alumno(3, "Alberto", "Apellidos", "2", 7, 15);
        Alumno alumno4 = new Alumno(4, "Noelia", "Apellidos", "3", 7, 16);
        Alumno alumno5 = new Alumno(5, "Pepe", "Apellidos", "1", 7, 16);
        
        
        //Creamos array de objetos alumnos
        List<Alumno> listaAlumnos = new ArrayList<>();
        
        
        //Añadir cada objeto a la lista
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        
        //Mostrar lista de alumnos con expresión landa
        //listaAlumnos.forEach(a->System.out.println(a));
        
        
        //Mostrar solo el nombre y apellidos de cada alumno
        //listaAlumnos.forEach(a->System.out.println(a.getNombre() + " " +a.getApellidos()));
        
        
        //Imprimir todos los alumnos cuyo nombre empieza por el caracter M o N
        //listaAlumnos.stream().filter(a->(a.getNombre().charAt(0)=='M' || a.getNombre().charAt(0)=='N')).forEach(a->System.out.println(a));
        //Stream es para poder aplica mas operaciones a la lista por ejemplo el filter
        
        //Imprimir por pantalla los tres primeros elementos del vector
        //Trataría solo los tres primeros elementos de la lista.
        //listaAlumnos.stream().limit(3).forEach(a->System.out.println(a));
        
        
        /*for (int i = 0; i < 2; i++) {
            System.out.println(listaAlumnos.get(i).toString());
        }*/
        
        //Para definir cual es el elemento que va a ser el maximo, por ejemplo el que tenga mayor edad
        //por si queremos compraralos por algun parametro concreto podemos hacerlo así
        //Esto devuelve el alumno que es considerado el maximo segun ese parametro.
        //System.out.println(listaAlumnos.stream().max((a,b)->a.getEdad()-b.getEdad()));
        
        //System.out.println(listaAlumnos.stream().min((a,b)->a.getEdad()-b.getEdad()));
        
        //Obtener los alumnos cuyos nombres de alumnos terminen en 'a'
        //listaAlumnos.stream().filter(a->(a.getNombre().charAt(a.getNombre().length()-1) == 'a')).forEach(a->System.out.println(a));
        //Si termina con "a"
        //listaAlumnos.stream().filter(a->(a.getNombre().endsWith("a"))).forEach(a->System.out.println(a));
        //Si empieza con "a" 
        //listaAlumnos.stream().filter(a->(a.getNombre().startsWith("a"))).forEach(a->System.out.println(a));
        
        //Ejecutamos el nombrePar
        //nombrePar(listaAlumnos, (n)->n.getNombre().length()%2 == 0);
        
        
        //Mapea todas las edades y las suma, esto podemos imprimirlo por pantalla, esto devuelve la suma de las edades de los alumnos
        //System.out.println(listaAlumnos.stream().mapToInt(a->a.getEdad()).sum());
        //Este sirve para sumar las notas
        //System.out.println(listaAlumnos.stream().mapToDouble(a->a.getNota()).sum());
        
        //Muestra solo los elementos distindos, si hay alguno igual que otro no lo cuenta como dos
        //System.out.println(listaAlumnos.stream().mapToDouble(a->a.getNota()).distinct().sum());
        
        //Sumar todos los cursos de lso alumnos
        //Muestra solo los elementos distindos, si hay alguno igual que otro no lo cuenta como dos
        System.out.println(listaAlumnos.stream().mapToInt(a->Integer.parseInt(a.getCurso())).distinct().sum());
    }
    
    
    //Landa que se cumpla el numero de caracteres del nombre se par
    //Imprimirmos solo los que tengan un numero de caracteres par en el nombre
    private static void nombrePar(List<Alumno> listaAlumnos, Predicate<Alumno> predicado){        
        for (Alumno n:listaAlumnos) {
            if(predicado.test(n)){
                System.out.print(n +" \n");
            }
        }       
    }    
}
