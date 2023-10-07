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
public class JuegoAhorcado {
    
    private char [] vectorPalabraBuscar;
    private int letrasEncontradas;
    private int cantidadJugadas;

    public JuegoAhorcado() {
    }

    public JuegoAhorcado(char [] vectorPalabraBuscar, int letrasEncontradas, int cantidadJugadas) {
        this.vectorPalabraBuscar = vectorPalabraBuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadJugadas = cantidadJugadas;
    }

    public char [] getVectorPalabraBuscar() {
        return vectorPalabraBuscar;
    }

    public void setVectorPalabraBuscar(char [] vectorPalabraBuscar) {
        this.vectorPalabraBuscar = vectorPalabraBuscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadJugadas() {
        return cantidadJugadas;
    }

    public void setCantidadJugadas(int cantidadJugadas) {
        this.cantidadJugadas = cantidadJugadas;
    }
    
    

  
    
    
    
    
}
