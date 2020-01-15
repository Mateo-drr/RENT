/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent_a_car;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Mateo
 */
public class Aluguer_C implements Serializable{
    
    private int tipoaluger; //1 reservado 2 inciado 3 cancelado 4 terminado
    private String locallevant;
    private String localentrega;
    private Calendar dialevantHora;
    private Calendar diaentregaHora;
    private Condutor_C condutor;
    private Veiculo_C veiculo;
    private int numpessoas;
    private String caractreserva;
    private ArrayList< Opcao_aluguel_C> arr_opalug = new ArrayList<>();
    private double preco;
    private int numero;

    public Aluguer_C(int tipoaluger, String locallevant, String localentrega, Calendar dialevantHora, Calendar diaentregaHora, Condutor_C condutor, Veiculo_C veiculo, int numpessoas, String caractreserva, double preco) {
        this.tipoaluger = tipoaluger;
        this.locallevant = locallevant;
        this.localentrega = localentrega;
        this.dialevantHora = dialevantHora;
        this.diaentregaHora = diaentregaHora;
        this.condutor = condutor;
        this.veiculo = veiculo;
        this.numpessoas = numpessoas;
        this.caractreserva = caractreserva;
        this.preco = preco;
    }

    
    public void NovaOpcaoAlug(Opcao_aluguel_C opalug){
        arr_opalug.add(opalug);
    }
    
    
    public String ListarTodasOpAl(){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_opalug.size(); i++) {
            str.append(arr_opalug.get(i)).append("\n");
        }
        return str.toString();
    }

    /**
     * @return the tipoaluger
     */
    public int getTipoaluger() {
        return tipoaluger;
    }

    /**
     * @param tipoaluger the tipoaluger to set
     */
    public void setTipoaluger(int tipoaluger) {
        this.tipoaluger = tipoaluger;
    }

    /**
     * @return the locallevant
     */
    public String getLocallevant() {
        return locallevant;
    }

    /**
     * @param locallevant the locallevant to set
     */
    public void setLocallevant(String locallevant) {
        this.locallevant = locallevant;
    }

    /**
     * @return the localentrega
     */
    public String getLocalentrega() {
        return localentrega;
    }

    /**
     * @param localentrega the localentrega to set
     */
    public void setLocalentrega(String localentrega) {
        this.localentrega = localentrega;
    }

    /**
     * @return the dialevantHora
     */
    public Calendar getDialevantHora() {
        return dialevantHora;
    }

    /**
     * @param dialevantHora the dialevantHora to set
     */
    public void setDialevantHora(Calendar dialevantHora) {
        this.dialevantHora = dialevantHora;
    }

    /**
     * @return the diaentregaHora
     */
    public Calendar getDiaentregaHora() {
        return diaentregaHora;
    }

    /**
     * @param diaentregaHora the diaentregaHora to set
     */
    public void setDiaentregaHora(Calendar diaentregaHora) {
        this.diaentregaHora = diaentregaHora;
    }

    /**
     * @return the condutor
     */
    public Condutor_C getCondutor() {
        return condutor;
    }

    /**
     * @param condutor the condutor to set
     */
    public void setCondutor(Condutor_C condutor) {
        this.condutor = condutor;
    }

    /**
     * @return the veiculo
     */
    public Veiculo_C getVeiculo() {
        return veiculo;
    }

    /**
     * @param veiculo the veiculo to set
     */
    public void setVeiculo(Veiculo_C veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * @return the numpessoas
     */
    public int getNumpessoas() {
        return numpessoas;
    }

    /**
     * @param numpessoas the numpessoas to set
     */
    public void setNumpessoas(int numpessoas) {
        this.numpessoas = numpessoas;
    }

    /**
     * @return the caractreserva
     */
    public String getCaractreserva() {
        return caractreserva;
    }

    /**
     * @param caractreserva the caractreserva to set
     */
    public void setCaractreserva(String caractreserva) {
        this.caractreserva = caractreserva;
    }

    /**
     * @return the arr_opalug
     */
    public ArrayList< Opcao_aluguel_C> getArr_opalug() {
        return arr_opalug;
    }

    /**
     * @param arr_opalug the arr_opalug to set
     */
    public void setArr_opalug(ArrayList< Opcao_aluguel_C> arr_opalug) {
        this.arr_opalug = arr_opalug;
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

    @Override
    public String toString() {
        return numero+ "-" +tipoaluger + "-" + locallevant + "-" + localentrega + "-" + condutor + "-" + veiculo + "-" + numpessoas + "-" + caractreserva + "-" + preco;
    }
    
    
    
    
    
}
