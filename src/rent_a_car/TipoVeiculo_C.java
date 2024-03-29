
package rent_a_car;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe que representa um tipo
 * de veiculo, dentro desta classe, se vai classificar
 * cada veiculo de acordo ao tipo de veiculo do que é registrado. 
 * @author Mateo Rodriguez
 * @author Juan Marcillo
 */
public class TipoVeiculo_C implements Serializable{

    private int numero;
    private String designacao;
    private String descricao;
    private double preco;
    private ArrayList<Veiculo_C> arr_veic_tv = new ArrayList<>();

    /**
     * Metodo que salva o objeto Veiculo_C v
     * dentro do array de veiculos, do classe Tipo de veiculos
     * Chamado na gd, no metodo NovoVeiculo
     * @param v objeto de tipo Veiculo_C
     */
    public void NovoVeiculo(Veiculo_C v) {
        arr_veic_tv.add(v);
    }

    /**
     * Metodo que cria o str dos toString da classe Veiculo_C
     * que estao dentro do arr_veic_tv
     * @return String
     */
    public String ListarTodosVeiculos() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_veic_tv.size(); i++) {
            str.append(arr_veic_tv.get(i)).append("\n");

        }
        return str.toString();
    }
    
    
    public TipoVeiculo_C(String designacao, String descricao, double preco) {
        this.designacao = designacao;
        this.descricao = descricao;
        this.preco = preco;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the designacao
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * @param designacao the designacao to set
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
     * @return the arr_veic_tv
     */
    public ArrayList<Veiculo_C> getArr_veic_tv() {
        return arr_veic_tv;
    }

    /**
     * @param arr_veic_tv the arr_veic_tv to set
     */
    public void setArr_veic_tv(ArrayList<Veiculo_C> arr_veic_tv) {
        this.arr_veic_tv = arr_veic_tv;
    }

    @Override
    public String toString() {
        return "Numero: " + numero + "\nDesignacao: " + designacao + "\nDescricao: " + descricao + "\nPreco: " + preco;
    }
            
}
