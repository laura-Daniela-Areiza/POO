/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
