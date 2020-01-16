
package rent_a_car;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Classe que permite classificar a cantidade
 * de alugueres dada uma data(mes/ano). 
 * @author Mateo Rodriguez
 * @author Juan Marcillo
 */
public class NumAlugxMesemAnok_C implements Serializable{
    private int numerodealug = 0;
    private String mes;
    private int nummes;
    private Integer nmes;

    public NumAlugxMesemAnok_C(int numerodealug, String mes, int nummes, Integer nmes) {
        this.numerodealug = numerodealug;
        this.mes = mes;
        this.nummes = nummes;
        this.nmes = nmes;
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

    /**
     * @return the nmes
     */
    public Integer getNmes() {
        return nmes;
    }

    /**
     * @param nmes the nmes to set
     */
    public void setNmes(Integer nmes) {
        this.nmes = nmes;
    }
   
}
