/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicioextra4;

import Entidad.NIF;
import Servicio.Servicio;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        NIF nif = new NIF();
        
       Servicio serv = new Servicio();
       
        System.out.println("Ingrese cinco DNIs. \n");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("=== DNI "+ i + " ===");
            serv.crearNif(nif);
            serv.mostrar(nif);   
        }
    }
    
}
