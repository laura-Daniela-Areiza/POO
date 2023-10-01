/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class PuntoServicio {
    
    Scanner read = new Scanner(System.in);
    
    Puntos puntos = new Puntos();
    
    public void  crearPuntos(){
        System.out.print("Ingrese la coordenada carteciana para ubicar en x1: ");
        puntos.setX1(read.nextDouble());
        System.out.print("Ingrese la coordenada carteciana para ubicar en y1: ");
        puntos.setY1(read.nextDouble());
        System.out.print("Ingrese la coordenada carteciana para ubicar en y1: ");
        puntos.setX2(read.nextDouble());
        System.out.print("Ingrese la coordenada carteciana para ubicar en y2: ");
        puntos.setY2(read.nextDouble());   
    }
    
    public double calcularDistancia(){
        double distancia = Math.sqrt(Math.pow((puntos.getX2()-puntos.getX1()), 2)+ Math.pow((puntos.getY2()-puntos.getY1()), 2));
        System.out.println("La distancia entre los dos puntos es: " + distancia);
        return distancia;
    }
    
}
