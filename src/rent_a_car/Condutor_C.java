/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent_a_car;

/**
 *
 * @author Mateo
 */
public class Condutor_C extends Pessoa_C{

    private int numcartacond;
    private String datacartcond;

    public Condutor_C( int NIF, String nome, String morada, int telefone, int numcartacond, String datacartcond) {
        super(NIF, nome, morada, telefone);
        this.numcartacond = numcartacond;
        this.datacartcond = datacartcond;
    }


    
    
    
}
