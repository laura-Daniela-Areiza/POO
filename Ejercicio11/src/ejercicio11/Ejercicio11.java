/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date fecha = fechaIngresada();
        Date fechaActual = fechaActual();
        
        compareDates(fecha, fechaActual);

    }

    public static Date fechaIngresada(){
        
        Scanner read = new Scanner(System.in);
        
        boolean x = false;
        int day = 0;
        int month = 0;
        int year = 0;
        
        do {            
            System.out.println("Ingrese una fecha usando el formato: DD/MM/YY. \nIngrese primero el día");      
            day = read.nextInt();
                        
            if (day > 31) {
                System.out.println("Día incorrecto. Intentelo nuevamente");
                x = false;
            } else {
                x = true;
            }
        } while (x == false);
        
        do {            
            System.out.println("Ahora ingrese el mes");
            month = read.nextInt() - 1;
                        
            if (month > 12) {
                System.out.println("Día incorrecto. Intentelo nuevamente");
                x = false;
            } else {
                x = true;
            }
        } while (x == false);       
        
        System.out.println("Por ultimo, ingrese el año");
        year = read.nextInt();
        
        Date fecha = new Date(day, month, year);
        fecha.setDate(day);
        fecha.setMonth(month);
        fecha.setYear(year);
             
        System.out.println("La fecha ingresada es: " + fecha);
        
        return fecha;
    }
    
    public static Date fechaActual(){
        
        Date fechaActual = new Date();
        
        System.out.println("La fecha actual es: " + fechaActual);
        
        return fechaActual;
    }
    
    public static void compareDates(Date fecha, Date fechaActual){
        
        int diferenciaAnos = fecha.getYear() - fechaActual.getYear();
        
        System.out.println("La diferencia de años entre las dos fechas es: " + Math.abs(diferenciaAnos));
    }
    
    
}
