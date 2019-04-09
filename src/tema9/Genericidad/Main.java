/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.Genericidad;

import java.util.Arrays;

/**
 *
 * @author Rasneilt
 */
public class Main {
    public static void main(String[] args) {
        
    
    Leon leon1= new Leon(1,"leon 1");
    Jaula<Leon> jaula1=new Jaula<Leon>();
    
    jaula1.Encerrar(leon1);
        System.out.println((jaula1.libera(leon1)));
            }
}
