/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent_a_car;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Mateo
 */
public class PrecoxAno_C {
    private double preco = 0;
    private Calendar ano = new GregorianCalendar();

    public PrecoxAno_C(double preco, Calendar ano) {
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
    public Calendar getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(Calendar ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Ano: " + ano.get(Calendar.YEAR) + "Preco: " + preco;
    }
    
    
    
}
