/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2;

import Servicio.PuntoServicio;

/**
 *
 * @author dani_
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PuntoServicio servicio = new PuntoServicio();
        
        servicio.crearPuntos();
        System.out.println(" ");
        servicio.calcularDistancia();
        System.out.println(" ");
        
    }
    
}
