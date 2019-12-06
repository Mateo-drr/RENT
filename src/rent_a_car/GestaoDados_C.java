/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent_a_car;

import java.util.ArrayList;
import java.util.Collections;
import util.Consola;

/**
 *
 * @author Mateo
 */
public class GestaoDados_C {

    ArrayList<Funcionario_C> arr_func = new ArrayList<>(); //Array dos funcionarios
    ArrayList<Condutor_C> arr_cond = new ArrayList<>(); //Array dos condutores
    ArrayList<Veiculo_C> arr_veic = new ArrayList<>(); //Array dos veiculos
    ArrayList<TipoVeiculo_C> arr_tipov = new ArrayList<>();

    public void NovoTipoVeiculo(TipoVeiculo_C tv) {
        tv.setNumero(arr_tipov.size() + 1);
        arr_tipov.add(tv);
    }

    public String ListarTodosTiposVeiculos() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_tipov.size(); i++) {
            str.append(arr_tipov.get(i)).append("\n");
            
        }
        return str.toString();
    }
    
    public int VerifNumerotipoveic(int numero) {
        for (int i = 0; i < arr_tipov.size(); i++) {
            if (arr_tipov.get(i).getNumero() == numero) {
                return 0;
            }
        }
        return -1;
    }
    
    public TipoVeiculo_C ObterTipoVeicPorNum(int pos) {
        return arr_tipov.get(pos);
    }
    
//    public String NomeTipoVeicPorNum() {
//        for (int i = 0; i < arr_tipov.size(); i++){
//            return arr_tipov.get(i).getDesignacao();
//        }
//    }

    public int getTotalTiposVeic() {
        return arr_tipov.size();
    }
    
    public int getTotalVeic(){
        return arr_veic.size();
    }

    public void NovoVeiculo(Veiculo_C v) {
        arr_veic.add(v);
        
        v.getTipo().NovoVeiculo(v);

    }

    public String ObterVeiculosPorTipo(String tipo){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_tipov.size(); i++) {
            if(arr_tipov.get(i).getDescricao().equalsIgnoreCase(tipo))
                str.append(arr_tipov.get(i).getArr_veic_tv()).append("\n");
        }
        return str.toString();
    }
    
    public void NovoFuncioanrio(Funcionario_C f){
        arr_func.add(f);
    }
    
    public String ListarFunc(){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_func.size(); i++) {
            str.append(arr_func.get(i)).append("\n");
        }
        return str.toString();
    }
    
}
