/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;

/**
 *
 * @author dani_
 */
public class MatematicaServicio {
    
    Matematica matematica = new Matematica();
    
    public static double devolverMayor(Matematica matematica){
        
        double valor = Math.max(matematica.getNum1(), matematica.getNum2());
        System.out.println("Número 1: " + matematica.getNum1());
        System.out.println("Número 2: " + matematica.getNum2());
        System.out.println("El número mayor es: " + valor);
        return valor;    
    }
    
    public static double calcularPotencia(Matematica matematica){
        double redNum1 = Math.round(Math.max(matematica.getNum1(), matematica.getNum2()));
        double redNum2 = Math.round(Math.min(matematica.getNum1(), matematica.getNum2()));
        double potencia = Math.pow(redNum1,redNum2);
        System.out.println("Redondeo 1: " + redNum1);
        System.out.println("Redondeo 2: " + redNum2);
        System.out.println("Potencia: " + potencia);
        return potencia;   
    }
    
    public static double calculaRaiz(Matematica matematica){
        double valorAbs = Math.abs(Math.min(matematica.getNum1(), matematica.getNum2()));
        double raiz = Math.sqrt(valorAbs);
        System.out.println("Valor absoluto: " + valorAbs);
        System.out.println("Raiz: " + raiz);
        return raiz;
    }
    
}
