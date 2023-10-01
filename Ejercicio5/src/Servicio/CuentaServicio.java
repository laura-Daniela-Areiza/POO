/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class CuentaServicio {
    
    Scanner read = new Scanner(System.in);
    
    Cuenta cuenta1 = new Cuenta();

    public Cuenta crearCuenta(){
               
        System.out.print("Ingrese el numero de cuenta: ");
        cuenta1.setNumeroCuenta(read.nextInt());        
        System.out.print("Ingrese su DNI: ");
        cuenta1.setDNICliente(read.nextLong());
        System.out.print("Ingrese el saldo actual: ");
        cuenta1.setSaldoActual(read.nextInt());
        return cuenta1;
    }
        
    public void ingresar(){
        boolean ingreCorrecto = false;
        while (ingreCorrecto == false) {            
            System.out.print("Ingrese la cantidad de dinero que desea ingresar: ");
            double ingreso = read.nextDouble();        
            if (ingreso < 0) {
                System.out.println("Cantidad de dinero incorrecta. Por favor ingrese una cantidad correcta.");
            } else {
                ingreCorrecto = true;
                double ingresar = cuenta1.getSaldoActual() + ingreso; 
                cuenta1.setSaldoActual(ingresar);
                System.out.println("Su saldo final seria igual a: " + ingresar);    
            }
        }    
    }
    
    public void retirar(){
        boolean retiCorrecto = false;
        
        while (retiCorrecto == false) {            
            System.out.print("Ingrese la cantidad de dinero que desea retirar: ");
            double retiro = read.nextDouble();
            if (retiro < 0 || retiro > cuenta1.getSaldoActual() ) {
                System.out.println("Cantidad de dinero incorrecta. Por favor ingrese una cantidad correcta.");
            } else {
                retiCorrecto = true;
                double retirar = cuenta1.getSaldoActual() - retiro;  
                cuenta1.setSaldoActual(retirar);
                System.out.println("Su saldo final seria igual a: " + retirar);
            }
        }  
    }     
    
    public void extraccionRapida(){
        boolean veinPorcen = false;
        while (veinPorcen == false) {            
            System.out.print("Ingrese la cantidad de dinero que desea retirar: ");
            double retiro = read.nextDouble();
            double extraccionRapida = (cuenta1.getSaldoActual() * 0.20);
            if (retiro <= extraccionRapida) {
                cuenta1.setSaldoActual(cuenta1.getSaldoActual() - retiro);
                System.out.println("Retiro aprobado. Su nuevo saldo es: " + cuenta1.getSaldoActual());
                veinPorcen = true;
            } else {
                System.out.println("Los sentimos, la cantidad de dinero que desea retirar sobrepasa el monto maximo. Intentelo de nuevo.");
                System.out.println("Tenga en cuenta que el monto maximo a retirar es: " + extraccionRapida);
            }
        }
    }
    
    public void consultarSaldo(){
        System.out.print("¿Desea consultar su saldo?: ");
        String rta = read.next();
        if (rta.equalsIgnoreCase("si")){
            System.out.println("Su saldo actual es: " + cuenta1.getSaldoActual());
        }else{
            System.out.println("Gracias");
        }
    }
    
    public void consultarDatos(){
        System.out.print("¿Desea consultar los datos de su cuenta?: ");
        String rta = read.next();
        if (rta.equalsIgnoreCase("si")){
            System.out.println("Su numero de cuenta es: " + cuenta1.getNumeroCuenta());
            System.out.println("Su numero DNI es: " + cuenta1.getDNICliente()); 
            System.out.println("Su saldo actual es: " + cuenta1.getSaldoActual());
        }else{
            System.out.println("Gracias");
        }
    }     
}
