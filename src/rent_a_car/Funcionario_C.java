/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent_a_car;

import java.io.Serializable;

/**
 * Classe que representa a um funcionario,
 * contêm os dados de cada funcionario. 
 * @author Mateo Rodriguez
 * @author Juan Marcillo
 */
public class Funcionario_C extends Pessoa_C implements Serializable{

    private String funcao;
    
    public Funcionario_C(int NIF, String nome, String morada, int telefone, String funcao) {
        super(NIF, nome, morada, telefone);
        this.funcao = funcao;
    }

    

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
   
    
    @Override
    public String toString() {
        return super.toString() + "\nFunçao: " + funcao; //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
    
    
    
}
