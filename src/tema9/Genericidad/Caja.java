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
public class Caja<T>{
    private T dato;

    public Caja() {
        super();
    }

    public T quita() {
        return dato;
    }

    public void pon(T d) {
        dato = d;
    }
}
