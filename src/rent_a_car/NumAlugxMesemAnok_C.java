/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent_a_car;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author Mateo
 */
public class NumAlugxMesemAnok_C implements Serializable{
    private int numerodealug = 0;
    private String mes;
    private int nummes;

    public NumAlugxMesemAnok_C(int numerodealug, String mes, int nummes) {
        this.numerodealug = numerodealug;
        this.mes = mes;
        this.nummes = nummes;
    }

    /**
     * @return the numerodealug
     */
    public int getNumerodealug() {
        return numerodealug;
    }

    /**
     * @param numerodealug the numerodealug to set
     */
    public void setNumerodealug(int numerodealug) {
        this.numerodealug = numerodealug;
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the nummes
     */
    public int getNummes() {
        return nummes;
    }

    /**
     * @param nummes the nummes to set
     */
    public void setNummes(int nummes) {
        this.nummes = nummes;
    }

    @Override
    public String toString() {
        return mes + " - numero de alugueres: " + numerodealug;
    }
   
}
