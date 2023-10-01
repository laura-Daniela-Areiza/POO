/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1.entidades;

/**
 *
 * @author dani_
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String nacionalidad;
    private String genero;
    private double estatura;
    
    public Persona(){   
    }
    
     Persona(String nombre, int edad, String nacionalidad, String genero, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.estatura = estatura; 
    }
        
    public double getEstatura(){
    return estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getGenero() {
        return genero;
    }
    
        
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    

}
