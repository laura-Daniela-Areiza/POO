/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import Servicio.CuentaServicio;

/**
 *
 * @author dani_
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaServicio servicio = new CuentaServicio();
        
        servicio.crearCuenta();
        System.out.println(" ");
        
        servicio.ingresar();
        System.out.println(" ");
        
        servicio.retirar();
        System.out.println(" ");
        
        servicio.extraccionRapida();
        System.out.println(" ");
        
        servicio.consultarSaldo();
        System.out.println(" ");
        
        servicio.consultarDatos();
        System.out.println(" ");
        
        System.out.println("Gracias");
    }
    
}
