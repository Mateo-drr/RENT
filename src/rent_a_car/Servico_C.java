/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent_a_car;

import java.util.Calendar;

/**
 *
 * @author Mateo
 */
public class Servico_C {
    private int numero;
    private Aluguer_C alug;
    private Calendar DeH;
    private String condicoesveic;
    private float perccombdisp;
    private Funcionario_C func;
    private Veiculo_C veic;
    private float quilometragem;
    private String tipo;

    public Servico_C(int numero, Aluguer_C alug, Calendar DeH, String condicoesveic, float perccombdisp, Funcionario_C func, Veiculo_C veic, String tipo, float quilometragem) {
        this.numero = numero;
        this.alug = alug;
        this.DeH = DeH;
        this.condicoesveic = condicoesveic;
        this.perccombdisp = perccombdisp;
        this.func = func;
        this.veic = veic;
        this.tipo = tipo;
        this.quilometragem = quilometragem;
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
     * @return the alug
     */
    public Aluguer_C getAlug() {
        return alug;
    }

    /**
     * @param alug the alug to set
     */
    public void setAlug(Aluguer_C alug) {
        this.alug = alug;
    }

    /**
     * @return the DeH
     */
    public Calendar getDeH() {
        return DeH;
    }

    /**
     * @param DeH the DeH to set
     */
    public void setDeH(Calendar DeH) {
        this.DeH = DeH;
    }

    /**
     * @return the condicoesveic
     */
    public String getCondicoesveic() {
        return condicoesveic;
    }

    /**
     * @param condicoesveic the condicoesveic to set
     */
    public void setCondicoesveic(String condicoesveic) {
        this.condicoesveic = condicoesveic;
    }

    /**
     * @return the perccombdisp
     */
    public float getPerccombdisp() {
        return perccombdisp;
    }

    /**
     * @param perccombdisp the perccombdisp to set
     */
    public void setPerccombdisp(float perccombdisp) {
        this.perccombdisp = perccombdisp;
    }

    /**
     * @return the func
     */
    public Funcionario_C getFunc() {
        return func;
    }

    /**
     * @param func the func to set
     */
    public void setFunc(Funcionario_C func) {
        this.func = func;
    }

    /**
     * @return the veic
     */
    public Veiculo_C getVeic() {
        return veic;
    }

    /**
     * @param veic the veic to set
     */
    public void setVeic(Veiculo_C veic) {
        this.veic = veic;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the quilometragem
     */
    public float getQuilometragem() {
        return quilometragem;
    }

    /**
     * @param quilometragem the quilometragem to set
     */
    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
}
