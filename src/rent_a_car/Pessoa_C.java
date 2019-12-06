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
public abstract class Pessoa_C {
    
    protected int NIF;
    protected String nome;
    protected String morada;
    protected int telefone;

    public Pessoa_C(int NIF, String nome, String morada, int telefone) {
        this.NIF = NIF;
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\nNIF: "+ NIF+ "\nNome: "+ nome+ "\nMorada: "+ morada+ "\nTelefone: "+ telefone; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
