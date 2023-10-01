/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;

import java.util.Scanner;
import poo1.entidades.Persona;

/**
 *
 * @author dani_
 */
public class POO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        Persona persona1 = new Persona();
        
//        Persona persona1 = new Persona("Laura Areiza", 27, "Colombiana", "Femenino", 1.50);
                
        persona1.getEstatura();
        persona1.getNombre();
        persona1.getNacionalidad();
        persona1.getGenero();
        persona1.getEdad();
        
        persona1.setEstatura(1.50);
        persona1.setNombre("Laura Areiza");
        persona1.setNacionalidad("Colombiana");
        persona1.getGenero();
        persona1.getEdad();
    
//        persona1.nombre = "Laura Areiza";
//        persona1.edad = leer.nextInt();
//        persona1.nacionalidad = "Colombiana";
//        persona1.genero = "Femenino";
//        persona1.estatura = leer.nextDouble();
        

        System.out.println(persona1.getNombre() + ", " + persona1.getNacionalidad() + ", " + persona1.getGenero() + ", " + persona1.getEstatura() + ", " + persona1.getEdad());       
          
    }
}
