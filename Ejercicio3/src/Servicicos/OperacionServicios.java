/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicicos;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class OperacionServicios {

    Scanner read = new Scanner(System.in);
    
    Operacion operaAritmeticas = new Operacion(); 
    
    public void crearOperacion(){
        System.out.println("Ingrese dos numeros enteros");
        operaAritmeticas.setNumero1(read.nextInt());
        operaAritmeticas.setNumero2(read.nextInt());     
    }    
    
    public int sumar(){
        int sumar = operaAritmeticas.getNumero1() + operaAritmeticas.getNumero2();
        return sumar;
    }
    
    public int restar(){
        int restar = operaAritmeticas.getNumero1() - operaAritmeticas.getNumero2();
        return restar;
    }
    
    public int multiplicar(){
        int multiplicar = operaAritmeticas.getNumero1() * operaAritmeticas.getNumero2();
        return multiplicar;
    }
    
    public int dividir(){
        int dividir = operaAritmeticas.getNumero1() / operaAritmeticas.getNumero2();
        return dividir;
    }
               
}
