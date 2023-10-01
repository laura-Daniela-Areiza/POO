/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import Entidad.Arreglo;
import Servicio.ArregloServicio;

/**
 *
 * @author dani_
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Arreglo arreglos = new Arreglo();
        
        ArregloServicio.llenarArregloA(arreglos);
        ArregloServicio.mostrarArregloA(arreglos);
        ArregloServicio.llenarArregloB(arreglos);
        
        
//        servicio.ordenarArregloA(arreglos);

    }
    
}
