/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra6;

import Entidad.JuegoAhorcado;
import Servicio.JuegoAhorcadoServicio;

/**
 *
 * @author dani_
 */
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JuegoAhorcado jA = new JuegoAhorcado();
        
        JuegoAhorcadoServicio servicio = new JuegoAhorcadoServicio();
        
        servicio.crearJuego(jA);
        servicio.longitud(jA);
        servicio.buscar(jA);
        servicio.Encontradas(jA);
        
//        System.out.println();
        
    }
    
}
