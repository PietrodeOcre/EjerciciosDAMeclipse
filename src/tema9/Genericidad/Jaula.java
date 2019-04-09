/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.Genericidad;

/**
 *
 * @author Rasneilt
 */
public class Jaula<T> {
private T dato;
    public Jaula() {
    }
    
    
    public void Encerrar(T d){
       dato=d;
    }
    
    
    public T libera(T animal){
    return animal;
    }
    
}
