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
public class Veiculo_C{
    
    private int matricula;
    private int numpessoas;
    private String tipogas;
    private int quilometragem;
    private int numalugueres;
    private TipoVeiculo_C tipo;


    public Veiculo_C(int matricula, int numpessoas, String tipogas, int quilometragem, TipoVeiculo_C tipo) {
        this.matricula = matricula;
        this.numpessoas = numpessoas;
        this.tipogas = tipogas;
        this.quilometragem = quilometragem;
        this.tipo = tipo;

    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
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
     * @return the tipogas
     */
    public String getTipogas() {
        return tipogas;
    }

    /**
     * @param tipogas the tipogas to set
     */
    public void setTipogas(String tipogas) {
        this.tipogas = tipogas;
    }

    /**
     * @return the quilometragem
     */
    public int getQuilometragem() {
        return quilometragem;
    }

    /**
     * @param quilometragem the quilometragem to set
     */
    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }


    /**
     * @return the numalugueres
     */
    public int getNumalugueres() {
        return numalugueres;
    }

    /**
     * @param numalugueres the numalugueres to set
     */
    public void setNumalugueres(int numalugueres) {
        this.numalugueres = numalugueres;
    }

    /**
     * @return the tipo
     */
    public TipoVeiculo_C getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoVeiculo_C tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Matricula: "+ matricula + "\nNumero de pessoas: " + numpessoas + "\nTipo Gas: : "+ tipogas + "\nNumero de Alugeres: " + numalugueres + "\nQuilometragem: " + quilometragem +"\nTipo de Veiculo: " + tipo; 
    }
}
