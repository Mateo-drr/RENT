/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent_a_car;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Mateo
 */
public class Aluguer_C{
    
    private int tipoaluger; //1 reservado 2 inciado 3 cancelado 4 terminado
    private String locallevant;
    private String localentrega;
    private Calendar dialevantHora;
    private Calendar diaentregaHora;
    private Condutor_C condutor;
    private Veiculo_C veiculo;
    private int numpessoas;
    private String caractreserva;
    private ArrayList< Opcao_aluguel_C> opalug = new ArrayList<>();
    private float preco;

    public Aluguer_C(int tipoaluger, String locallevant, String localentrega, Calendar dialevantHora, Calendar diaentregaHora, Condutor_C condutor, Veiculo_C veiculo, int numpessoas, String caractreserva, float preco) {
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
    
    
    
    
}
