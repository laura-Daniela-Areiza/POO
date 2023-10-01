/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author dani_
 */
public class Cuenta {
    
    private int numeroCuenta;
    private long DNICliente;
    private double saldoActual;
    private double interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNICliente, int saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNICliente = DNICliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNICliente() {
        return DNICliente;
    }

    public void setDNICliente(long DNICliente) {
        this.DNICliente = DNICliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
}
