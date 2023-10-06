/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author dani_
 */
public class Movil {
    
    private String marca;
    private double precio;
    private String modelo;
    private String memriaRAM;
    private String almacenamiento;
    private String[] codigo;

    public Movil() {
    }

    public Movil(String marca, double precio, String modelo, String memriaRAM, String almacenamiento, String[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memriaRAM = memriaRAM;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemriaRAM() {
        return memriaRAM;
    }

    public void setMemriaRAM(String memriaRAM) {
        this.memriaRAM = memriaRAM;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String[] getCodigo() {
        return codigo;
    }

    public void setCodigo(String[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        System.out.println("      ==========         ");
        return "marca: " + marca + "\nprecio: " + precio + "\nmodelo: " + modelo + "\nmemriaRAM: " + memriaRAM + "\nalmacenamiento: " + almacenamiento + "\ncodigo: " +  Arrays.toString(codigo) ;
    }
    
    
}
