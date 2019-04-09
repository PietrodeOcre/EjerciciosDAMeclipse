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
public class TestCaja {
     public static void main(String[] args) {
        Caja<Integer> caja =new Caja<Integer>();
        caja.pon(new Integer(46));
        Integer x=caja.quita();
    }
}
