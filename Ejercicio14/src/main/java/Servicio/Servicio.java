/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class Servicio {
    
    Movil m = new Movil();
    
    public Movil cargarCelular(Movil m){
        
        Scanner read = new Scanner(System.in);
        
        Movil m1 = m;
         
        System.out.println("Por favor ingrese la marca del movil");
        String marca = read.next();
        m1.setMarca(marca);
        
        System.out.println("Por favor ingrese el precio del movil");
        double precio = read.nextDouble();
        m1.setPrecio(precio);
        
        System.out.println("Por favor ingrese el modelo del movil");
        String modelo = read.next();
        m1.setModelo(modelo);
        
        System.out.println("Por favor ingrese el tamaño de la memoria RAM del movil");
        String mRam = read.next();
        m1.setMemriaRAM(mRam);
        
        System.out.println("Por favor ingrese el espacio de almacenamiento del movil");
        String almacenamiento = read.next();
        m1.setAlmacenamiento(almacenamiento);
        
        String[] codigo =  ingresarCodigo(m1);
                
        return m1;

    }
    
    public String[] ingresarCodigo(Movil movil){
               
        Scanner read = new Scanner(System.in);
        
        Movil mAux = movil;
        
        String[] codigo = new String[7];
            
        boolean x = false;
        
        do {
            System.out.println("Por favor ingrese el codigo del movil");
            long cod = read.nextInt();
            
            String c = Long.toString(cod);
            
            char[] characters = c.toCharArray();        
           
            if (c.length() == 7) {
                 
                 int cont = 0;
                 
                 for (char cc : characters) {
                    // Convert the character to a string and store it in the 'codigo' array
                    codigo[cont] = String.valueOf(cc);
                    cont = cont + 1;
                }
                  mAux.setCodigo(codigo);
              
            x =  true;
                
            }else{
               System.out.println("El codigo no deber tener mas de 7 digitos");
            }
         } while (x == false);  
        
        return codigo;
    }

}
