/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.JuegoAhorcado;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class JuegoAhorcadoServicio {
    
    Scanner read = new Scanner(System.in);
    
    JuegoAhorcado ahorcado = new JuegoAhorcado();
    
    public JuegoAhorcado crearJuego(JuegoAhorcado ahorcado){
        
        JuegoAhorcado jA = ahorcado;
        
        System.out.print("Ingrese la palabra: ");
        String palabraIngresada = read.next();
        
        System.out.print("Ingrese la cantidad de jugadas maxima: ");
        jA.setCantidadJugadas(read.nextInt());
        
        int longitudPalabra = palabraIngresada.length();
        
        char [] vectorLongitudPalabra =  palabraIngresada.toCharArray();
        
        for (int i = 0; i < longitudPalabra; i++) {
            vectorLongitudPalabra[i] = vectorLongitudPalabra[i];
            jA.setVectorPalabraBuscar(vectorLongitudPalabra);
        }
        
        for (int i = 0; i < longitudPalabra; i++) {
            System.out.print(vectorLongitudPalabra[i] + " ");
        }
        
        return jA;
    }
    
    public void longitud(JuegoAhorcado ahorcado){
        
        JuegoAhorcado j = ahorcado;
        
        System.out.println("La longitud de la palabra que debe buscar es: " + j.getVectorPalabraBuscar().length);
    }
    
    public void buscar(JuegoAhorcado ahorcado){
        
        JuegoAhorcado jj = ahorcado;
        
        int contLetraEncontrada = 0;
        int contLetraNoEncontrada = 0;
        
        System.out.println("Ingrese una letra");
        String letra = read.next();
        
        char letraAux = letra.charAt(0);     

        for (int i = 0; i < jj.getVectorPalabraBuscar().length; i++) {
                       
            if (jj.getVectorPalabraBuscar()[i] == letraAux) {
                System.out.println(jj.getVectorPalabraBuscar()[i]);
                contLetraEncontrada = contLetraEncontrada + 1;
            } else {
                System.out.println("Esta letra no esta en la palabra");
                contLetraNoEncontrada = contLetraNoEncontrada + 1;
            }
            
        }
        
        
        
        
    }
    
    
}
