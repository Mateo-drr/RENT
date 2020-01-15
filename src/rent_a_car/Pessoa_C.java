/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent_a_car;

import java.io.Serializable;

/**
 * Classe que representa uma pessoa (abstracta)
 * @author Mateo
 */
public abstract class Pessoa_C implements Serializable{
    
    private int NIF;
    private String nome;
    private String morada;
    private int telefone;

    /**
     * 
     * @param NIF
     * @param nome
     * @param morada
     * @param telefone 
     */
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

    /**
     * @return the NIF
     */
    public int getNIF() {
        return NIF;
    }

    /**
     * @param NIF the NIF to set
     */
    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * @param morada the morada to set
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    
    
    
    
}
