    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author dani_
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double bajo = 0, ideal = 0, sobrepeso = 0, mayores = 0, menores = 0, IMC;
        boolean mayorEdad;  
        
        PersonaServicio servicio= new PersonaServicio();
        
        Persona[] personas = new Persona[4];
        
            personas[0] = servicio.crearPersona();
            IMC = servicio.calcularIMC(personas[0].getPeso(), personas[0].getAltura());
            mayorEdad = servicio.esMayorDeEdad(personas[0].getEdad());
            System.out.println("");

            personas[1] = servicio.crearPersona();
            IMC = servicio.calcularIMC(personas[1].getPeso(), personas[1].getAltura());
            mayorEdad = servicio.esMayorDeEdad(personas[1].getEdad());
            System.out.println("");

            personas[2] = servicio.crearPersona();
            IMC = servicio.calcularIMC(personas[2].getPeso(), personas[2].getAltura());
            mayorEdad = servicio.esMayorDeEdad(personas[2].getEdad());
            System.out.println("");

            personas[3] = servicio.crearPersona();;
            IMC = servicio.calcularIMC(personas[3].getPeso(), personas[3].getAltura());
            mayorEdad = servicio.esMayorDeEdad(personas[3].getEdad());
            System.out.println("");
        
        for (int i = 0; i < personas.length; i++){
 
            if (IMC<0){
                bajo++;
            } else if (IMC==0){
                ideal++;
            } else {
                sobrepeso++;
            }
            
            if (mayorEdad) {
                mayores++;
            } else {
                menores++;
            }
        }
        
        System.out.println("De las personas listadas " + ((bajo/4)*100) + "% están por debajo de su peso ideal.");
        
        System.out.println("De las personas listadas " + ((ideal/4)*100) + "% están en su peso ideal.");
        
        System.out.println("De las personas listadas " + ((sobrepeso/4)*100) + "% están en sobrepeso.");
        
        System.out.println("De las personas listadas " + ((mayores/4)*100) + "% son mayores de edad, y " + ((menores/4)*100) + "% menores.");
    }    
}
