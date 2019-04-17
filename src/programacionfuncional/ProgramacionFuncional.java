/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionfuncional;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author pietrodeocre
 */
public class ProgramacionFuncional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> listaEnteros = Arrays.asList(1,2,3,4,5,6,7);
        
        //ListaEnteros.add(89);
        
        /*for (int i = 0; i < listaEnteros.size(); i++) {
            listaEnteros.set(i, listaEnteros.get(i*5));
            System.out.println(listaEnteros.get(i));
        }*/
        
        listaEnteros.forEach(a->System.out.println(a)); //Imprime todos los registros de la lista
        
        listaEnteros.stream().filter(a->(a>4)).forEach(a->System.out.println(a));//Imprime solo los que son mayores de 4
        
        
        long numeroRegistros = listaEnteros.stream().filter(a->(a>4)).count();
        
        
        listaEnteros.stream().map(a-> (a+5)).forEach(a->System.out.println(a));//Devuelve los valores de la lista de enteros con +5
        System.out.println(numeroRegistros);
        
        List<String> listaCadenas = Arrays.asList("Ana","Maria","Vanesa");//Listas de strings
        
        listaCadenas.stream().filter(a->a.length()>4).map(a->a.toUpperCase()).forEach(a->System.out.println(a));//Devuelve las cadenas de mas de 4 caracteres 
        
    }
    
}
