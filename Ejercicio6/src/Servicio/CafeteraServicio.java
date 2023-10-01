/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class CafeteraServicio {
    
    Scanner read = new Scanner(System.in);
    
    Cafetera nespresso = new Cafetera();
    
    public void llenarCafetera(double cantidadActual, double capacidadMaxima){
        cantidadActual = capacidadMaxima;
        nespresso.setCapacidadMaxima(1000);
        nespresso.setCantidadActual(1000);
    }
    
    public void servirTaza(){
        boolean cafe = true;
        do {            
        System.out.print("Ingrese el tamaño de la taza vacia: ");
            double taza = read.nextDouble();
            if (taza > nespresso.getCantidadActual()) {
                System.out.println("Lo sentimos, No hay la cantidad de cafe ingresada. Por ahora, solo podemos servirle " + nespresso.getCantidadActual());
                System.out.println(" ");
                cafe = false;
                vaciarCafetera();              
            } else {
                System.out.println("Espere un momento, estamos sirviendo su cafe.");
                System.out.println(" ");
                nespresso.setCantidadActual(nespresso.getCantidadActual() - taza);
//                System.out.println(nespresso.getCantidadActual());
            }    
        }while (cafe == true);
        agregarCafe();
      } 
        
    public void vaciarCafetera(){
         System.out.println("La cafetera esta vacia. Por favor, llene la cafetera");
         System.out.println(" ");
        nespresso.setCantidadActual(0);
    }   
    
    public void agregarCafe(){
        boolean cafeIn = false;
        while (cafeIn == false) {
            System.out.print("Por favor ingrese la cantidad de café: ");
            double cafe = read.nextDouble();
            if (cafe > nespresso.getCapacidadMaxima()) {
                System.out.println("Lo sentimos, la cantidad de cafe indicada sobrepasa la capacidad maxima que esta cafetera puede contener");
                System.out.println(" ");
            } else {
                System.out.println("Estamos agregando la cantidad de cafe ingresada");
                System.out.println(" ");
                nespresso.setCantidadActual(nespresso.getCantidadActual() + cafe);
                cafeIn = true;
            }
        }     
        servirTaza();
    }  
}
