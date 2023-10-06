/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import Entidad.Persona;
import Servicio.Servicio;

/**
 *
 * @author dani_
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        Servicio servicio = new Servicio();
        
        servicio.crearPersona(p1);
        System.out.println();
        
        servicio.calcularEdad(p1);
        System.out.println();
        
        System.out.println(servicio.menorQue(p1, 30));
        System.out.println();
        
        servicio.mostrarPersona(p1); 
        System.out.println();
    }
    
}
