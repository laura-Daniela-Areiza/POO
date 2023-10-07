/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author dani_
 */
public class NIF {
    
    private long dniNumber;
    private char letter;

    public NIF() {
    }

    public NIF(long dniNumber, char letter) {
        this.dniNumber = dniNumber;
        this.letter = letter;
    }

    public long getDniNumber() {
        return dniNumber;
    }

    public void setDniNumber(long dniNumber) {
        this.dniNumber = dniNumber;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }  

    @Override
    public String toString() {
        return "dniNumber: " + dniNumber + "- letter: " + letter;
    }
    
    
}
