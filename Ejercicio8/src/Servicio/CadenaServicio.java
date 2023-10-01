/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;


/**
 *
 * @author dani_
 */
public class CadenaServicio {
    
    Scanner read = new Scanner (System.in);
    
    Cadena cadena = new Cadena();
    
    String frase = cadena.getFrase();
    int longitudFrase = cadena.getLongitudFrase();
               
    public void mostrarVocales(Cadena cadena){
  
        int vocales = 0;
        
        for (int i = 0; i < cadena.getLongitudFrase(); i++) {
            if (cadena.getFrase().substring(i,i+1).equalsIgnoreCase("a") || cadena.getFrase().substring(i,i+1).equalsIgnoreCase("e") || cadena.getFrase().substring(i,i+1).equalsIgnoreCase("i") || cadena.getFrase().substring(i,i+1).equalsIgnoreCase("o") || cadena.getFrase().substring(i,i+1).equalsIgnoreCase("u")) {
                vocales++;    
            }
        }
        System.out.println("La frase tiene " + vocales + " vocales.");
    }
    
    public void invertirFrase(Cadena cadena){
        String cadenaInvertida = "";
        for (int i = cadena.getLongitudFrase() - 1; i >= 0 ; i--) {
            cadenaInvertida = String.valueOf(cadena.getFrase().charAt(i));
            System.out.print(cadenaInvertida);
        }
        System.out.println("");         
    }
    
    public void vecesRepetido(Cadena cadena){
        
        int reps = 0;
        
        System.out.println("Ingrese una letra");
        String letra = read.next();
             
        for (int i = 0; i < cadena.getLongitudFrase(); i++) {
            if (cadena.getFrase().substring(i,i+1).equalsIgnoreCase(letra)){
                reps++;    
            }
        }
        System.out.println("La letra " + letra + " se repite " + reps + " veces en la frase.");
    }
    
    public void compararLongitud(Cadena cadena){
        read.nextLine();
        System.out.println("Ingrese una nueva frase");
        String frase2 = read.nextLine();

        if (cadena.getLongitudFrase() != frase2.length()) {
            System.out.println("La longitud de las frases son diferentes. La longitud de la frase inicial es de " + cadena.getLongitudFrase() + ", mientras que la longitud de la segunda frase es de " + frase2.length());
        } else {
        System.out.println("La longitud de la frase ingresada es igual a la longitud de la primera frase ingresada");   
        }      
    }
    
    public void unirFrases(Cadena cadena){
                
        System.out.println("Ingrese una nueva frase");
        String frase2 = read.nextLine();

        System.out.println(cadena.getFrase() + " " + frase2);
    }
    
    public void reemplazar(Cadena cadena){
        
        System.out.println("Ingrese un letra");
        String letra = read.next();
        String x = "";
        
        for (int i = 0; i < cadena.getLongitudFrase(); i++) {
            if (cadena.getFrase().substring(i,i+1).equalsIgnoreCase("a")) {
                x = cadena.getFrase().replace("a",letra);
            }
        }
        System.out.println(x);
    }
    
    public boolean contiene(Cadena cadena){
        
        boolean contenedor = true;
        
        System.out.println("Ingrese una letra");
        String letra = read.next();
             
        for (int i = 0; i < cadena.getLongitudFrase(); i++) {
            if (cadena.getFrase().substring(i,i+1).equalsIgnoreCase(letra)){
                contenedor = true;
            }else{
               contenedor = false;
            } 
        }
        if (contenedor = true) {
                System.out.println(contenedor + "La letra " + letra + " sí está en la frase ingresada");
            } else {
                System.out.println(contenedor + "La letra " + letra + " no está en la frase ingresada");
            }
        return contenedor;  
    }
}
        
          
        
        
  

