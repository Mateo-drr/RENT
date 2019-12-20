/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent_a_car;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Classe que representa um condutor
 * @author Mateo
 */
public class Condutor_C extends Pessoa_C{

    private int numcartacond;
    //private String datacartcond;
    private Calendar datacartcond = new GregorianCalendar();

    /**
     * 
     * @param NIF
     * @param nome
     * @param morada
     * @param telefone
     * @param numcartacond
     * @param datacartcond 
     */
    public Condutor_C( int NIF, String nome, String morada, int telefone, int numcartacond, Calendar datacartcond) {
        super(NIF, nome, morada, telefone);
        this.numcartacond = numcartacond;
        this.datacartcond = datacartcond;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero carta de conduçao: "+ numcartacond +"\nData de validade: "+ datacartcond.get(Calendar.DATE) + "-"+(datacartcond.get(Calendar.MONTH)+1) + "-"+ datacartcond.get(Calendar.YEAR); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the numcartacond
     */
    public int getNumcartacond() {
        return numcartacond;
    }

    /**
     * @param numcartacond the numcartacond to set
     */
    public void setNumcartacond(int numcartacond) {
        this.numcartacond = numcartacond;
    }

    /**
     * @return the datacartcond
     */
    public Calendar getDatacartcond() {
        return datacartcond;
    }

    /**
     * @param datacartcond the datacartcond to set
     */
    public void setDatacartcond(Calendar datacartcond) {
        this.datacartcond = datacartcond;
    }


    
    
    
}
