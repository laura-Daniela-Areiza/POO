/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import Entidad.Curso;
import Servicio.Servicio;

/**
 *
 * @author dani_
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Curso curso = new Curso();
        
        Servicio servicio = new Servicio();
        
        System.out.println(servicio.crearCurso(curso));
  
        System.out.println("Las ganacias por este curso es: " + servicio.calcularGananciaSemanal(curso));
 
   
    }
    
}
