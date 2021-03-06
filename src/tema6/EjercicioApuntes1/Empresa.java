/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.EjercicioApuntes1;

/**
 *
 * @author pietrodeocre
 */
public class Empresa implements Cloneable {
    private String nombre, direccion, cif;

    @Override
    public Object clone(){
        Object objeto = new Object();
        
        try {
            objeto = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return objeto;
        
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", direccion=" + direccion + ", cif=" + cif + '}';
    }
    
    
}
