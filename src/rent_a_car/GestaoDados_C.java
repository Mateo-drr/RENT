
package rent_a_car;

import java.awt.AWTEventMulticaster;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import util.Consola;

/**
 *
 * @author Mateo
 */
public class GestaoDados_C {

    ArrayList<Funcionario_C> arr_func = new ArrayList<>(); //Array dos funcionarios
    ArrayList<Condutor_C> arr_cond = new ArrayList<>(); //Array dos condutores
    ArrayList<Veiculo_C> arr_veic = new ArrayList<>(); //Array dos veiculos
    ArrayList<TipoVeiculo_C> arr_tipov = new ArrayList<>(); //Array dos tipos de veiculos
    ArrayList<Opcao_aluguel_C> arr_opalug = new ArrayList<>(); // Array das opcoes de aluguel
    ArrayList<Aluguer_C> arr_alug = new ArrayList<>(); // Array dos alug.
    ArrayList<PrecoxAno_C> arr_precxano = new ArrayList<>(); // Array do preco total por ano
    ArrayList<NumAlugxMesemAnok_C> arr_numalugxmes = new ArrayList<>(); // Array do numero de alugueres por mes em um ano especifico
        
    //VEICULOS & TIPO DE VEICULOS

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
    /*public int VerifDesignaçaoTipoveic(int i){
        for (int j = 0; j < arr_tipov.size(); j++) {
            for (i = 0; i < arr_tipov.size(); i++){
                if(0 == arr_tipov.get(i).getDesignacao().compareTo(arr_tipov.get(i+1).getDesignacao()){
                
                }
                //int x = arr_tipov.get(i).getDesignacao().compareTo(arr_tipov.get(i+1).getDesignacao());
                if(x== 0){
                    return 0;
                }
        }
        }
        return -1;
    }
    */
    public TipoVeiculo_C ObterTipoVeicPorNum(int pos) {
        return arr_tipov.get(pos);
    }
    
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
            if(arr_tipov.get(i).getDescricao().equalsIgnoreCase(tipo)){
                for (int j = 0; j < arr_tipov.get(i).getArr_veic_tv().size(); j++) {
                    str.append(arr_tipov.get(i).getArr_veic_tv().get(j).toString()).append("\n");
                }
            }
        }
        return str.toString();
    }
    
    public int VerifMatriculaUnica(int matricula){
        for (int i = 0; i < arr_veic.size(); i++) {
            if(arr_veic.get(i).getMatricula() == matricula){
                return 0;
            }
        }
        return -1;
    }
    
    public int ObterVeiculoxMatr(int matricula){
        for (int i = 0; i < arr_veic.size(); i++) {
            if(arr_veic.get(i).getMatricula() == matricula){
                return i;
            }
        }
        return -1;
    }
    
    public Veiculo_C ObterVeicxposarr(int pos){
        return arr_veic.get(pos);
    }
    
    //FUNCIONARIOS
    
    public void NovoFuncioanrio(Funcionario_C f){
        arr_func.add(f);
    }
    
    public String ListarTodosFunc(){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_func.size(); i++) {
            str.append(arr_func.get(i)).append("\n");
        }
        return str.toString();
    }
      public int VerifNIFFunc(int NIF){
        for (int i = 0; i < arr_func.size(); i++) {
            if(arr_func.get(i).getNIF() == NIF){
                return 0;
            }
        }
        return -1;
    }
    public int VerifNIFFunc_Cond(int NIF){
           for (int i = 0; i < arr_cond.size(); i++){
               if(arr_cond.get(i).getNIF() == NIF){
                   return 0;
               }
           }
           return -1;
       }
    
    public int VerifTelefoneFunc(int telefone){
        for (int i = 0; i < arr_func.size(); i++) {
            if(arr_func.get(i).getTelefone() == telefone){
                return 0;
            }
        }
        return -1;
    }
     public int VerifTelefoneFunc_Cond(int telefone){
        for (int i = 0; i < arr_cond.size(); i++) {
            if(arr_cond.get(i).getTelefone() == telefone){
                return 0;
            }
        }
        return -1;
    }
    
    public int getTotalFunc(){
        return arr_func.size();
    }
    
    //CONDUTORES
    
    public void NovoCondutor(Condutor_C c){
        
        arr_cond.add(c);
        
    }
    
    public String MostrarCondutorxNIF(int NIF){
        
        //StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_cond.size(); i++) {
            if(arr_cond.get(i).getNIF() == NIF){
                return arr_cond.get(i).toString();
            }
        }
        return "N";
    }
    
    public int ObterCondutorxNIF(int NIF){
        for (int i = 0; i < arr_cond.size(); i++) {
            if(arr_cond.get(i).getNIF() == NIF){
                return i;
            }
        }
        return -1;
    }
    
    public int getTotalCond(){
        return arr_cond.size();
    }
    
    public String ListarTodosCond(){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_cond.size(); i++) {
            str.append(arr_cond.get(i)).append("\n");
        }
        return str.toString();
    }
       public int VerifNIFCond(int NIF){
        for (int i = 0; i < arr_cond.size(); i++) {
            if(arr_cond.get(i).getNIF() == NIF){
                return 0;
            }
        }
        return -1;
    }
       public int VerifNIFCond_Func(int NIF){
           for (int i = 0; i < arr_func.size(); i++){
               if(arr_func.get(i).getNIF() == NIF){
                   return 0;
               }
           }
           return -1;
       }
       
     public int VerifTelefoneCond(int telefone){
        for (int i = 0; i < arr_cond.size(); i++) {
            if(arr_cond.get(i).getTelefone() == telefone){
                return 0;
            }
        }
        return -1;
    }
     
     public int VerifTelefoneCond_Func(int telefone){
        for (int i = 0; i < arr_func.size(); i++) {
            if(arr_func.get(i).getTelefone() == telefone){
                return 0;
            }
        }
        return -1;
    }
     
     public int VerifCartaCond(int cartacond){
        for (int i = 0; i < arr_cond.size(); i++) {
            if(arr_cond.get(i).getNumcartacond() == cartacond){
                return 0;
            }
        }
        return -1;
    
    }
    
    public Condutor_C Obtercondxposarr(int pos){
        return arr_cond.get(pos);
    }
    
    //OPCAO ALUGUEL
    
    public void NovaOpcaoAlug(Opcao_aluguel_C opalug){
        opalug.setNum(arr_opalug.size()+1);
        arr_opalug.add(opalug);
    }
    
    public int getTotalOpAl(){
        return arr_opalug.size();
    }
    
    public String ListarTodasOpAl(){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_opalug.size(); i++) {
            str.append(arr_opalug.get(i)).append("\n");
        }
        return str.toString();
    }
    
    public Opcao_aluguel_C ObterOpAl(int pos){
        return arr_opalug.get(pos);
    }
    
    //ALUGERES
    
    public void NovoAluguer(Aluguer_C al){
        al.setNumero(arr_alug.size()+1);
        arr_alug.add(al);
    }
    
    public String ListarAlugxEstado(int tipoal){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_alug.size(); i++) {
            if(arr_alug.get(i).getTipoaluger() == tipoal)
                str.append(arr_alug.get(i)).append("\n");
        }
        return str.toString();
    }
    
    public String ListarAlugxCond(Condutor_C cond){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_alug.size(); i++) {
            if(arr_alug.get(i).getCondutor() == cond)
                str.append(arr_alug.get(i)).append("\n");
        }
        return str.toString();
    }
    
    public String ListarAlugReserv(){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_alug.size(); i++) {
            if(arr_alug.get(i).getTipoaluger() == 1)
            str.append(arr_alug.get(i)).append("\n");
        }
        return str.toString();
    }
    
    public int getTotalAl(){
        return arr_alug.size();
    }
    
    public Aluguer_C ObterAlugxNum(int num){
        return arr_alug.get(num-1);
    }
    
//    public void CancelarAlug(int num){
//        arr_alug.remove(num-1);
//    }
    
    //ESTATISTICAS
    
    public float NumAlugCancel(){
        float j = 0;
        for (int i = 0; i < arr_alug.size(); i++) {
            if(arr_alug.get(i).getTipoaluger() == 3)
                j++;
        }
        //arr_alug.size() ---> 100%
        // j ----------------> ?
        j = j*100/arr_alug.size();
        return j;
    }
    
    public String PrecototAlugxAno(){
        Calendar dataIni;
        Calendar dataFim;
        int i, j;
        double prectot = 0;
        StringBuilder str = new StringBuilder("");
        
        for (j = 0; j < arr_alug.size(); j++) {
            dataIni = arr_alug.get(j).getDiaentregaHora();
            for (i = 0; i < arr_alug.size(); i++) {
                dataFim = arr_alug.get(i).getDiaentregaHora();
                    if(dataIni.get(Calendar.YEAR) - dataFim.get(Calendar.YEAR) == 0){
                        prectot += arr_alug.get(i).getPreco();
                    }
            }
            arr_precxano.get(j).setAno(dataIni);
            arr_precxano.get(j).setPreco(prectot);
            str.append(arr_precxano.get(j)).append("\n");
        }    
        return str.toString();
    }
    
    public String NumAlugxMes(int ano){
        int conta1 = 0;
        int conta2 = 0,conta3 = 0,conta4 = 0,conta5 = 0,conta6 = 0,conta7 = 0,conta8 = 0,conta9 = 0,conta10 = 0,conta11 = 0,conta12 = 0;
        for (int i = 0; i < arr_alug.size(); i++) {
            //Encontra o ano
            if(arr_alug.get(i).getDiaentregaHora().get(Calendar.YEAR) == ano){
                //Encontra o mes do aluguel
                //Aumenta a conta do mes do aluguel
                //O mes fica salvado na posicao do array arr_numalugxmes
                switch(arr_alug.get(i).getDiaentregaHora().get(Calendar.MONTH)+1){
                    case 1:
                        arr_numalugxmes.get(0).setNumerodealug(conta1++);
                        arr_numalugxmes.get(0).setMes("Janeiro");
                        break;
                    case 2:
                        arr_numalugxmes.get(0).setNumerodealug(conta2++);
                        arr_numalugxmes.get(0).setMes("Fevereiro");
                        break;
                    case 3:
                        arr_numalugxmes.get(0).setNumerodealug(conta3++);
                        arr_numalugxmes.get(0).setMes("Marco");
                        break;
                    case 4:
                        arr_numalugxmes.get(0).setNumerodealug(conta4++);
                        arr_numalugxmes.get(0).setMes("Abril");
                        break;
                    case 5:
                        arr_numalugxmes.get(0).setNumerodealug(conta5++);
                        arr_numalugxmes.get(0).setMes("Maio");
                        break;
                    case 6:
                        arr_numalugxmes.get(0).setNumerodealug(conta6++);
                        arr_numalugxmes.get(0).setMes("Junho");
                        break;
                    case 7:
                        arr_numalugxmes.get(0).setNumerodealug(conta7++);
                        arr_numalugxmes.get(0).setMes("Julio");
                        break;
                    case 8:
                        arr_numalugxmes.get(0).setNumerodealug(conta8++);
                        arr_numalugxmes.get(0).setMes("Agosto");
                        break;
                    case 9:
                        arr_numalugxmes.get(0).setNumerodealug(conta9++);
                        arr_numalugxmes.get(0).setMes("Setembro");
                        break;
                    case 10:
                        arr_numalugxmes.get(0).setNumerodealug(conta10++);
                        arr_numalugxmes.get(0).setMes("Outubro");
                        break;
                    case 11:
                        arr_numalugxmes.get(0).setNumerodealug(conta11++);
                        arr_numalugxmes.get(0).setMes("Novembro");
                        break;
                    case 12:
                        arr_numalugxmes.get(0).setNumerodealug(conta12++);
                        arr_numalugxmes.get(0).setMes("Dezembro");
                        break;
                }
            }
        }
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < 10; i++) {
            str.append(arr_numalugxmes.get(i)).append("\n");
        }
        return str.toString();
    }
    
    
}
