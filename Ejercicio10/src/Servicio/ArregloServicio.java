/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Arreglo;
import java.util.Arrays;

/**
 *
 * @author dani_
 */
public class ArregloServicio {
    
    Arreglo arreglos = new Arreglo();
       
    public static void llenarArregloA(Arreglo arreglos){
        
        int auxArregloA[] = arreglos.getArregloA();

        for (int i = 0; i < arreglos.getArregloA().length; i++) {  
            int x = (int)(Math.random()*100);        
            auxArregloA[i] = x;            
        }
        arreglos.setArregloA(auxArregloA);         
    }
    
    public static void mostrarArregloA(Arreglo arreglos){
        
        int arreglo3[] = arreglos.getArregloA();
        // Arreglo normal
        System.out.println("Arreglo A");
        for (int i = 0; i < arreglo3.length; i++) {         
            System.out.print(arreglo3[i]+ " "); 
        }
//      Arreglo ordenado
//        Arrays.sort(arreglo3);
//        System.out.println("\n");
//        System.out.println("Arreglo Ordenado");
//        
//        for (int i = 0; i < arreglo3.length; i++) {         
//            System.out.print(arreglo3[i] + " ") ;  
//        }        
    }
    
    public static void llenarArregloB(Arreglo arreglos){
        
        double auxArregloB[] = new double[arreglos.getArregloB().length];
        int auxArregloA[] = arreglos.getArregloA(); 

        for (int i = 0; i < auxArregloB.length; i++) { 
            if (i < 10) {
                auxArregloB[i] = auxArregloA[i];     
            }
        }
        
        Arrays.fill(auxArregloB, 10, auxArregloB.length, 0.5);
           
        arreglos.setArregloB(auxArregloB);
        System.out.println("\n");
        System.out.println("Arreglo B");
        
        for (int i = 0; i < auxArregloB.length; i++) {         
            System.out.println(auxArregloB[i]+ " ");
        } 
    }
}
