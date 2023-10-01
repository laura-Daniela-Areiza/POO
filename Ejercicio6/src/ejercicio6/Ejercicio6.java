/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import Servicio.CafeteraServicio;

/**
 *
 * @author dani_
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        CafeteraServicio cafetera = new CafeteraServicio();
        
        cafetera.llenarCafetera(1000, 1000);
        cafetera.servirTaza();
        cafetera.vaciarCafetera();
        cafetera.agregarCafe();           
    }
    
}
