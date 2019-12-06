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
public class Condutor_C extends Pessoa_C{

    private int numcartacond;
    //private String datacartcond;
    private Calendar datacartcond = new GregorianCalendar();

    public Condutor_C( int NIF, String nome, String morada, int telefone, int numcartacond, Calendar datacartcond) {
        super(NIF, nome, morada, telefone);
        this.numcartacond = numcartacond;
        this.datacartcond = datacartcond;
    }

    @Override
    public String toString() {
        return super.toString() + "Nunero carta de conduçao: "+ numcartacond +"\nData de validade: "+ datacartcond; //To change body of generated methods, choose Tools | Templates.
    }


    
    
    
}
