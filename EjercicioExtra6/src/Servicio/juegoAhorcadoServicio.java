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
        
        char [] vectorLongitudPalabra = new char[longitudPalabra];
        
        vectorLongitudPalabra = palabraIngresada.toCharArray();   
        
        for (int i = 0; i < vectorLongitudPalabra.length; i++) {
            System.out.print(vectorLongitudPalabra[i]+ " ");
        }
        System.out.println("\n");
        
        jA.setVectorPalabraBuscar(vectorLongitudPalabra);
        
        jA.setLetrasEncontradas(0);
        
        return jA;
    }
    
    public void longitud(JuegoAhorcado ahorcado){
        
        JuegoAhorcado j = ahorcado;
        
        System.out.print("La longitud de la palabra que debe buscar es: " + j.getVectorPalabraBuscar().length);
    }
    
    public void buscar(JuegoAhorcado ahorcado){
        
        JuegoAhorcado jj = ahorcado;
                
        int contLetraEncontrada = jj.getLetrasEncontradas();
        int cantJugadas = jj.getCantidadJugadas();
        boolean encontrado = false;
        
        do {
            System.out.print("\nIngrese una letra: ");
            String letra = read.next().toLowerCase();
            char letraAux = letra.charAt(0);

            cantJugadas--;
                        
            for (int i = 0; i < jj.getVectorPalabraBuscar().length; i++){
                         
                if (jj.getVectorPalabraBuscar()[i]  == letraAux) {
                    encontrado = true;    
                    contLetraEncontrada++;
                    jj.setLetrasEncontradas(contLetraEncontrada);
                    break;                   
                }else{
                    encontrado = false;
                }
                
                intentos(jj);
            }
            
            if (encontrado == false) {
                System.out.print("Mensaje: La letra " + letraAux + " NO pertenece a la palabra ");
            } else {
                System.out.print("Mensaje: La letra " + letraAux + " pertenece a la palabra ");
            }
        } while (cantJugadas > 0);
    }
    
    public void Encontradas(JuegoAhorcado ahorcado){
        
        JuegoAhorcado ju = ahorcado;
        
        System.out.println("Número de letras (encontradas, faltantes):  " + ju.getLetrasEncontradas() + "," + (ju.getVectorPalabraBuscar().length - ju.getLetrasEncontradas()));
             
    }
    
    public int intentos(JuegoAhorcado ahorcado){
        
        JuegoAhorcado j = ahorcado;
        int intRealizados = 1;
        
        return j.getCantidadJugadas() - intRealizados;
    }
    
    public void juego(JuegoAhorcado ahorcado){
        
        JuegoAhorcado j1 = ahorcado;
        
        int intentosRealizados = 0;
        
        System.out.println("Es hora de juga! \n");
             
        crearJuego(j1);
        longitud(j1);
        
        for (int i = 0; i < j1.getCantidadJugadas(); i++) {
                                    
            buscar(j1);
            Encontradas(j1);
            intentosRealizados = intentos(j1);
                    
            System.out.println("Sus intentos se agotaron, por favor ingrese una palabra completa teniendo en cuenta las pistas que tiene");
            String adivinarPalabra = read.next();
            
            if (adivinarPalabra.equalsIgnoreCase(String.valueOf((j1.getVectorPalabraBuscar())))){
                System.out.println("Woot, woot! Adivino la palabra");
            } else {
                System.out.println("Lo sentimos, Ha perdido el juego");
            }
        }
    }
}
