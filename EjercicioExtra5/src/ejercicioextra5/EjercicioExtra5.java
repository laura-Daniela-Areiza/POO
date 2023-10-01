/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra5;

import Entidad.MesSecreto;
import Servicio.MesSecretoServicio;

/**
 *
 * @author dani_
 */
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MesSecretoServicio mes = new MesSecretoServicio();
        MesSecreto m = new MesSecreto();
        mes.adivinarMes(m); 
        
    }   
}
