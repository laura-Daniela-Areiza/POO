/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        Cadena cadena = new Cadena(); 
      
        System.out.println("Ingrese una frase");
        String frase = read.nextLine();
        cadena.setFrase(frase);
        cadena.setLongitudFrase(cadena.getFrase().length());
              
        CadenaServicio servicio = new CadenaServicio();
        
        servicio.mostrarVocales(cadena);
        servicio.invertirFrase(cadena);
        servicio.vecesRepetido(cadena);
        servicio.compararLongitud(cadena);
        servicio.unirFrases(cadena);
        servicio.reemplazar(cadena);
        servicio.contiene(cadena);
        
       
               
    }
} 
   
     
