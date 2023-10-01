/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class RectanguloServicio {
    
    Scanner read = new Scanner(System.in);
    
    Rectangulo rectangulo = new Rectangulo();
    
    public void valorB(){
        System.out.print("Ingrese la medida de la base: ");
        rectangulo.setBase(read.nextInt());  
    }
    
    public void valorH(){
        System.out.print("Ingrese la medida de la altura: ");
        rectangulo.setAltura(read.nextInt());    
    }
    
    public int calcularSuperficie(){
        int superficie = rectangulo.getBase() * rectangulo.getAltura();
        return superficie;
    }
    
    public int calcularPerimetro(){
        int perimetro = (rectangulo.getBase() + rectangulo.getAltura() * 2);
        return perimetro;
    }
    
    public void imprimirRectanguloCompleto(){
        for (int i = 0; i < rectangulo.getAltura(); i++){
            for (int j = 0; j < rectangulo.getBase(); j++) { 
                System.out.print("* "); 
            }
            System.out.println();
        }   
    }
    
    public void imprimirRectangulo(){ 
        for (int i = 0; i < rectangulo.getAltura(); i++) {
            for (int j = 0; j < rectangulo.getBase(); j++) {
                if (i==0 || (i==rectangulo.getAltura()-1) || j==0 || (j==rectangulo.getBase()-1)){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }   
}
