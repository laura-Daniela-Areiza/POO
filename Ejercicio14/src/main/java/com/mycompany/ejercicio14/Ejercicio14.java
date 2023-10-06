/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14;

import Entidad.Movil;
import Servicio.Servicio;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        Servicio serv = new Servicio();
        
        Movil m = new Movil();
        
        System.out.println("Cuantos celulares desea ingresar?");
        int rta = read.nextInt();
        int x = 0;
        
        for (int i = 0; i < rta; i++) {
            x = x + 1;
            System.out.println("\n=== Celular  " + x + "===");
            System.out.println(serv.cargarCelular(m));
        }
    }
}
