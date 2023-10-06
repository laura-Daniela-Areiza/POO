/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class Servicio {
    
    Persona persona = new Persona();
    
    public Persona crearPersona(Persona persona){
        
        Persona p = persona;
        
        Scanner read = new Scanner(System.in);
        
        boolean x = false;
        int day = 0;
        int month = 0;
        int year = 0;
        
        System.out.println("Ingrese su nombre");
        String nombre = read.nextLine();
        p.setName(nombre);

        do {            
            System.out.println("Ingrese fecha de nacimiento usando el formato: DD/MM/YY. \nIngrese primero el día");      
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
        
        p.setDOB(fecha);
        
        return p;
    }
    
    public void calcularEdad(Persona persona){
        
        Persona p1 = persona;
        
        Date DOB = p1.getDOB();
        
        Date fechaActual = new Date();
        
        int diferenciaAnos = DOB.getYear() - fechaActual.getYear();
        
        System.out.println("La persona tiene " + Math.abs(diferenciaAnos) + " años");        
    }
    
    public boolean menorQue(Persona persona, int edad){
        
        Persona pp = persona;
        Date DOB = pp.getDOB();
        Date fechaActual = new Date();
        edad = 30;
        
        int calcularEdad = Math.abs(DOB.getYear() - fechaActual.getYear());
                      
        if (calcularEdad > edad) {
            System.out.println("La persona es mayor a la edad ingresada por parametro");
            return false;
        }else{
            System.out.println("La persona es menor a la edad ingresada por parametro");
            return true;
        }
    }
    
    public void mostrarPersona(Persona persona){
        
        Persona p2 = persona;
        p2.getName();
        p2.getDOB();
        
        System.out.println(p2);
    }
}
