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
public class VeiculoLigeiro_C extends Veiculo_C implements Serializable{
        private int capbaggagem;
        private int numportas;

    public VeiculoLigeiro_C(int capbaggagem, int numportas, int matricula, int numpessoas, String tipogas, int quilometragem, TipoVeiculo_C tipo) {
        super(matricula, numpessoas, tipogas, quilometragem, tipo);
        this.capbaggagem = capbaggagem;
        this.numportas = numportas;
    }

    /**
     * @return the capbaggagem
     */
    public int getCapbaggagem() {
        return capbaggagem;
    }

    /**
     * @param capbaggagem the capbaggagem to set
     */
    public void setCapbaggagem(int capbaggagem) {
        this.capbaggagem = capbaggagem;
    }

    /**
     * @return the numportas
     */
    public int getNumportas() {
        return numportas;
    }

    /**
     * @param numportas the numportas to set
     */
    public void setNumportas(int numportas) {
        this.numportas = numportas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCapacidade de baggagem: " + capbaggagem +  "\nNumero portas: " + numportas ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
       
    
}
