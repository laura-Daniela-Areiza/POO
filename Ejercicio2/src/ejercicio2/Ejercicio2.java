/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Scanner read = new Scanner(System.in);
        
        Circunferencia circun = new Circunferencia(8);
        
        circun.setRadio(10);

        circun.getRadio();  

        circun.crearCircunferencia(10);

        System.out.println("Por favor ingrese el valor del radio");

        circun.setRadio(read.nextInt());

        circun.area();

        circun.perimetro();
        
        System.out.println("El area es igual a: " + circun.area() + "y el perimetro es igual a: " + circun.perimetro());
    }
 
    
}