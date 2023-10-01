/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.MesSecreto;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class MesSecretoServicio {
    
    Scanner read = new Scanner(System.in);    
 
    public void adivinarMes(MesSecreto mes){
       
        String mesEscogido = "";

        do {            
            System.out.println("Adivine el mes secreto");
            mesEscogido = read.nextLine();
            if (!mesEscogido.equals(mes.getMesSecreto())){
                System.out.println("Intentelo de nuevo");           
            } else {
                System.out.println("¡Ha acertado!");
            }  
        } while(!mesEscogido.equals(mes.getMesSecreto()));    
    }    
}
