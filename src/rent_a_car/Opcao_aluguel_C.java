
package rent_a_car;

import java.io.Serializable;

/**
 * Classe que contêm os dados 
 * de cada opçao de aluguer. 
 * @author Mateo Rodriguez
 * @author Juan Marcillo
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
        return "Numero: " + num + "\nNome: " + nome + "\nDescriçao: " + descri + "\nPreço: " + preco; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
