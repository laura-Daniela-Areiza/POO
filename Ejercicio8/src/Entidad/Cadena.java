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
public class Cadena {
    
    private String frase;
    private int longitudFrase;

    public Cadena() {
    }

    public Cadena(String frase, int longitudFrase) {
        this.frase = frase;
        this.longitudFrase = longitudFrase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }

        
}
