/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent_a_car;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Mateo
 */
public class PrecoxAno_C implements Serializable{
    private double preco = 0;
    //private Calendar ano = new GregorianCalendar();
    private int ano;
    
    public PrecoxAno_C(double preco, int ano) {
        this.preco = preco;
        this.ano = ano;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "\nAno: " + ano + "\nPreco: " + preco;
    }
    
    
    
}
