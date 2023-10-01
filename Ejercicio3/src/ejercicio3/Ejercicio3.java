/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import Servicicos.OperacionServicios;

/**
 *
 * @author dani_
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        OperacionServicios servicio = new OperacionServicios();
        
        servicio.crearOperacion();
        servicio.sumar();
        servicio.restar();
        servicio.multiplicar();
        servicio.dividir();
        
        System.out.println("La suma es: " + servicio.sumar());
        System.out.println("La resta es: " + servicio.restar());
        System.out.println("La multiplicacion es: " + servicio.multiplicar());
        System.out.println("La division es: " + servicio.dividir());
    }
}
