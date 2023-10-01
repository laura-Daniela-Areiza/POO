/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class PersonaServicio {
    
    Scanner read = new Scanner (System.in);
    
    Persona persona = new Persona();
       
    public Persona crearPersona(){
        
        System.out.print("Por favor, ingrese el nombre de la persona: ");
        persona.setNombre(read.next());
        System.out.print("Por favor, ingrese la edad de la persona: ");
        persona.setEdad(read.nextInt());
        boolean sex =  false;
        while (sex == false){           
            System.out.print("Por favor, ingrese el sexo de la persona. Tenga en cuenta lo siguiente: H = Hombre, M = Mujer, O = Otro: ");
            persona.setSexo(read.next());
            if (persona.getSexo().equalsIgnoreCase("H")|| persona.getSexo().equalsIgnoreCase("M")|| persona.getSexo().equalsIgnoreCase("O")){ 
                sex = true; 
            } else {
                System.out.println("La respuesta ingresada es incorrecta, por favor intentelo nuevamente");
                sex = false;
            }                
        }
        System.out.print("Por favor, ingrese el peso de la persona: ");
        persona.setPeso(read.nextDouble());
        System.out.print("Por favor, ingrese la altura de la persona: ");
        persona.setAltura(read.nextDouble());
        return persona;
    }
    
    public double calcularIMC(double peso, double altura){
        double IMC = persona.getPeso()/Math.pow(persona.getAltura(),2);
        if (IMC < 20) {
            System.out.println("La persona está por debajo de su peso ideal");
            return -1;
        } else if (IMC >= 20 && IMC <=25) {
            System.out.println("La persona está en su peso ideal");
            return 0;
        }else {
            System.out.println("La persona está en sobrepeso"); 
            return 1;
        }   
    }
    
    public boolean esMayorDeEdad(int edad){
        if (persona.getEdad() >= 18) {
            System.out.println("La persona es mayor de edad");
            return true;
        } else {
            System.out.println("La persona es menor de edad");
            return false;
        }
    }
}

    
