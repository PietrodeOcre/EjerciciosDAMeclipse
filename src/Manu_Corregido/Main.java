/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manu_Corregido;

import java.util.TreeSet;

/**
 *
 * @author Helltres
 */
public class Main {
    public static void main (String[]args){
        
        Persona p1 = new Persona(1,"Manuel","Perez");
        Persona p2 = new Persona(2,"Pilar","Lopez");
        Persona p3 = new Persona(3,"Juan","Ruiz");
        Persona p4 = new Persona(4,"Sebastian","Betel");
        Persona p5 = new Persona(5,"Marcos","Alejandro");
        Persona p6 = new Persona(6,"Emanuel","Javier");
        Persona p7 = new Persona(7,"Rafa","Nadal");
        Persona p8 = new Persona(8,"Jaime","Gil");
        Persona p9 = new Persona(9,"Rick","Sanchez");
        Persona p10 = new Persona(10,"Wang","Cheng");
        
        TreeSet<Persona> coleccionPersonas = new TreeSet<Persona>();
        
        coleccionPersonas.add(p1);
        coleccionPersonas.add(p2);
        coleccionPersonas.add(p3);
        coleccionPersonas.add(p4);
        coleccionPersonas.add(p5);
        coleccionPersonas.add(p6);
        coleccionPersonas.add(p7);
        coleccionPersonas.add(p8);
        coleccionPersonas.add(p9);
        coleccionPersonas.add(p10);
        
        muestraInfoPersonas(coleccionPersonas);
    }
    
    public static void muestraInfoPersonas(TreeSet<Persona> coleccionPersonas){
      
      coleccionPersonas.remove(coleccionPersonas.first());
      coleccionPersonas.remove(coleccionPersonas.last());
      
      for(Persona i:coleccionPersonas){
            System.out.println(i);
        }
    }
}
