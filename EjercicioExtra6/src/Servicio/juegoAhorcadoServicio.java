/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.juegoAhorcado;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class juegoAhorcadoServicio {
    
    Scanner read = new Scanner(System.in);
    
    public void crearJuego(){
        
        juegoAhorcado ahorcado = new juegoAhorcado();
        
        System.out.print("Ingrese la palabra: ");
        String palabraIngresada = read.next();
        System.out.print("Ingrese la cantidad de jugadas maxima: ");
        ahorcado.setCantidadJugadas(read.nextInt());
        int longitudPalabra = palabraIngresada.length();
        
        String [] vectorLongitudPalabra = new String [longitudPalabra];
        
        for (int i = 0; i < longitudPalabra; i++) {
            vectorLongitudPalabra[i] = String.valueOf(palabraIngresada.charAt(i));  
        }
                
                
        
        
        
        
        
        
    }
    
    
}
