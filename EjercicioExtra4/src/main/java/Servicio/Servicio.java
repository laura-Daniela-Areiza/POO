/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class Servicio {
    
     NIF nif = new NIF();
            
    public NIF crearNif(NIF nif){
        
        char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        NIF n = nif;
     
        Scanner read = new Scanner(System.in);
 
        boolean x = true;

        do {            
            System.out.println("Ingrese su DNI");
            long dniNumber = read.nextLong();
            n.setDniNumber(dniNumber);

            String dniAux = Long.toString(n.getDniNumber());

            char[] characters = dniAux.toCharArray();

                if (dniAux.length() == 8) {
                    x = true;
                    long calcLetra = dniNumber % 23;
                    System.out.println("Resto del DNI/23: " + calcLetra);
                    
                    for (int i = 0; i < letters.length; i++) {
                        if (i == calcLetra) {
                             char nfiLetter = letters[i];
                            n.setLetter(nfiLetter);
                           System.out.println("Letra correspondiente: "+ letters[i] );
                        }
                    }
                    System.out.println(" Su número es: " + n.getDniNumber() + "-" + n.getLetter());
                    
                }else{
                    System.out.println("Su DNI debe contener maximo 8 digitos");
                    x = false;
                }
        } while (x == false);
        
       return n;
       
    }
    
    public void mostrar(NIF nif){
        
        NIF nAux = nif;
        
        System.out.println(nif);

    }
    
}
