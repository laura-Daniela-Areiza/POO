/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import Entidad.Matematica;
import Servicio.MatematicaServicio;

/**
 *
 * @author dani_
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matematica matematica = new Matematica();
        
        matematica.setNum1(Math.random()*10);
        matematica.setNum2(Math.random()*10);
        
        MatematicaServicio.devolverMayor(matematica);
        MatematicaServicio.calcularPotencia(matematica);
        MatematicaServicio.calculaRaiz(matematica);

    }
        
    
    
}
