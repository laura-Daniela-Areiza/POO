/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import Servicio.RectanguloServicio;

/**
 *
 * @author dani_
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RectanguloServicio servicio = new RectanguloServicio();
        
        servicio.valorB();
        servicio.valorH();
        System.out.println("La superficie es igual a: " + servicio.calcularSuperficie()); 
        System.out.println("El perimetro es igual a: " + servicio.calcularPerimetro());
        servicio.imprimirRectanguloCompleto();
        System.out.println();
        servicio.imprimirRectangulo();
                
        System.out.println("Gracias");
        
    }
}
