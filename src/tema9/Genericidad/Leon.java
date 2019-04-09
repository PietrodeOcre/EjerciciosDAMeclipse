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
public class Leon {
    private int id;
    private String nombre;
    
    public Leon(){}
    
    public Leon(int id, String nombre){
    this.id=id;
    this.nombre=nombre;
    }

    @Override
    public String toString() {
        return "Leon{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
}
