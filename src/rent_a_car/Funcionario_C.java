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
public class Funcionario_C extends Pessoa_C{

    private String funcao;
    
    public Funcionario_C(int NIF, String nome, String morada, int telefone, String funcao) {
        super(NIF, nome, morada, telefone);
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return super.toString() + funcao; //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
    
    
  
    
    
    
}
