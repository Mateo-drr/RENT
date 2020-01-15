/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent_a_car;

import java.io.Serializable;

/**
 *
 * @author Mateo
 */
public class Opcao_aluguel_C implements Serializable{
    
    private String nome;
    private String descri;
    private float preco;
    private int num;

    public Opcao_aluguel_C(String nome, String descri, float preco) {
        this.nome = nome;
        this.descri = descri;
        this.preco = preco;
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
     * @return the descri
     */
    public String getDescri() {
        return descri;
    }

    /**
     * @param descri the descri to set
     */
    public void setDescri(String descri) {
        this.descri = descri;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return num + "-" + nome + "-" + descri + "-" + preco; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
