
package rent_a_car;

import java.awt.AWTEventMulticaster;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import util.Consola;

/**
 * Classe que faz a gestao dos daddos entre a classe principal
 * e as demais classes.
 * 
 * @author Mateo Rodriguez
 * @author Juan Marcillo
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
    ArrayList<Servico_C> arr_serv = new ArrayList<>(); // Array dos servicos
    
    //VEICULOS & TIPO DE VEICULOS
    
    /**
     * Recebe um tipo de veiculo, atribui um numero
     * desde 1 com respecto á posiçao 0 do array,
     * e depois é guardado cada tipo de 
     * veiculo no array arr_tipov.
     * @param tv Variable para designar o tipo de veiculo.
     */
    public void NovoTipoVeiculo(TipoVeiculo_C tv) {
        tv.setNumero(arr_tipov.size() + 1);
        arr_tipov.add(tv);
    }
    
    /**
     * Metodo que lista todos os tipos de veiculos do arr_tipov
     * @return String do toString da clase TipoVeiculo_C,
     */
    
    public String ListarTodosTiposVeiculos() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_tipov.size(); i++) {
            str.append(arr_tipov.get(i)).append("\n");
            
        }
        return str.toString();
    }
    
    public String ListarTodosTiposVeiculosMain() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_tipov.size(); i++) {
            str.append(arr_tipov.get(i).getDesignacao()).append("\n");
            
        }
        return str.toString();
    }
    public String NumeroVeiculosxTipos(){
        for (int i = 0; i < arr_tipov.size(); i++) {
           
            return arr_tipov.get(i).ListarTodosVeiculos();
            
        }
        return " ";
    }
    /**
     * Metodo que verifica que o numero do 
     * tipo de veiculo ja exista, porque compara
     * o numero do tipo de veiculo de cada cada posiçao
     * do arr_tipov com o numero recebido
     * @param numero inteiro do numero de tipo de veiculo
     * @return int 0 ou -1, utilizado na logica do metodo InserirVeic na main
     */
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
    
    /**
     * Metodo que permite devolver o tipo de veiculo a depender 
     * da posiçao solicitada.
     * @param pos valor que determina a posiçao do array arr_tipov
     * @return objeto tipo de veiculo
     */
    public TipoVeiculo_C ObterTipoVeicPorNum(int pos) {
        return arr_tipov.get(pos);
    }
    
    /**
     * Metodo que devolve a cantidad de 
     * posiçoes utilizadas do array arr_tipov
     * @return devolve o tamanho do array
     */
    public int getTotalTiposVeic() {
        return arr_tipov.size();
    }
    
    /**
     * Metodo que devolve a cantidad de posiçoes utilizadas
     * do array arr_veic
     * @return devolve o tamanho do array
     */
    public int getTotalVeic(){
        return arr_veic.size();
    }
    
    /**
     * Recebe um veiculo salva o veiculo no arr_veic, 
     * e no arr_veic_tv.
     * @param v objeto do tipo Veiculo_C
     */
    public void NovoVeiculo(Veiculo_C v) {
        arr_veic.add(v);
        v.getTipo().NovoVeiculo(v);

    }
    
    /**
     * Metodo que cria o string dos toString dos veiculos
     * dum tipo especifico
     * @param tipo String que especifica o tipo de veiculo a procurar
     * @return String do toString da classe TipoVeiculo_C, so dos especificados
     */
    public String ObterVeiculosPorTipo(String tipo){
        //StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_tipov.size(); i++) {
            if(arr_tipov.get(i).getDescricao().equalsIgnoreCase(tipo)){
                return arr_tipov.get(i).ListarTodosVeiculos();// <---------------------------------------------
//                for (int j = 0; j < arr_tipov.get(i).getArr_veic_tv().size(); j++) {
//                    str.append(arr_tipov.get(i).getArr_veic_tv().get(j).toString()).append("\n");
//                }
//            }
//        }
//        return str.toString();
            }
        }
        return " ";
    }
    
    /**
     * Metodo que recebe a matricula, e depois compara 
     * com cada matricula já registrada no array arr_veic
     * e se sao iguais, devolve um valor de 0
     * @param matricula variable que tem o valor da matricula
     * @return valor real
     */
    public int VerifMatriculaUnica(int matricula){
        for (int i = 0; i < arr_veic.size(); i++) {
            if(arr_veic.get(i).getMatricula() == matricula){
                return 0;
            }
        }
        return -1;
    }
    
    /**
     * Metodo que recebe o valor da matricula, e depois compara se
     * os valores da matricula dentro do array arr_veic é igual 
     * á variable recebida, se é igual, devolve o valor da posiçao
     * onde se encontra o veiculo com aquela matricula.
     * @param matricula valor da matricula
     * @return Valor real
     */
    public int ObterVeiculoxMatr(int matricula){
        for (int i = 0; i < arr_veic.size(); i++) {
            if(arr_veic.get(i).getMatricula() == matricula){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Metodo que recebe um int pos e devolve o veiculo C
     * que se encontra na posiçao dada pelo int pos
     * @param pos valor que indica a posiçao
     * @return Objeto veiculo c
     */
    public Veiculo_C ObterVeicxposarr(int pos){
        return arr_veic.get(pos);
    }
    
    public int VerifDesigTipoVeic(String designacao){
        for (int i = 0; i < arr_tipov.size(); i++) {
            if(arr_tipov.get(i).getDesignacao().equalsIgnoreCase(designacao)){
                return 0;
            }
        }
        return -1;
    }
    
    //FUNCIONARIOS
    
    /**
     * Recebe um objeto funcionario_c f e guarda num
     * arr_func.
     * @param f objeto funcionario_c f
     */
    public void NovoFuncioanrio(Funcionario_C f){
        arr_func.add(f);
    }
    
    /**
     * 
     * @return 
     */
    public String ListarTodosFunc(){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_func.size(); i++) {
            str.append(arr_func.get(i)).append("\n");
        }
        return str.toString();
    }
    
    /**
     * Recebe o int NIF_func do funcionario e compara com 
     * todos os valores NIF de cada funcionario dentro do
     * arr_cond, se algum NIF é igual ao NIF_func, devolve 
     * um valor 0
     * @param NIF_func variable int que representa o NIF do funcionario
     * @return Valor real
     */
     public int VerifNIFFunc(int NIF_func){
        for (int i = 0; i < arr_func.size(); i++) {
            if(arr_func.get(i).getNIF() == NIF_func){
                return 0;
            }
        }
        return -1;
    }
    
    /**
     * Recebe o int NIF_func do funcionario e compara com 
     * todos os valores NIF de cada conductor dentro do
     * arr_func, se algum NIF é igual ao NIF_func, devolve 
     * um valor 0 
     * @param NIF_func variable int que representa o NIF do funcionario
     * @return valor real
     */
    public int VerifNIFFunc_Cond(int NIF_func){
           for (int i = 0; i < arr_cond.size(); i++){
               if(arr_cond.get(i).getNIF() == NIF_func){
                   return 0;
               }
           }
           return -1;
       }
    
    /**
     * Recebe o int telefone_func do funcionario e compara com 
     * todos os valores de telefone de cada funcionario dentro do
     * arr_func, se algum telefone é igual ao telefone_func, devolve 
     * um valor 0
     * @param telefone_func variable int que representa o telefone do funcionario
     * @return valor real
     */
    public int VerifTelefoneFunc(int telefone_func){
        for (int i = 0; i < arr_func.size(); i++) {
            if(arr_func.get(i).getTelefone() == telefone_func){
                return 0;
            }
        }
        return -1;
    }
    
    /**
     * Recebe o int telefone_func do funcionario e compara com 
     * todos os valores de telefone de cada conductor dentro do
     * arr_cond, se algum telefone do conductor é igual ao telefone_func,
     * devolve um valor 0
     * @param telefone_func variable int que representa o telefone do funcionario
     * @return valor real
     */
     public int VerifTelefoneFunc_Cond(int telefone_func){
        for (int i = 0; i < arr_cond.size(); i++) {
            if(arr_cond.get(i).getTelefone() == telefone_func){
                return 0;
            }
        }
        return -1;
    }
    
     /**
      * Metodo que devolve o o tamanho do array funcionario
      * @return devolve o tamanho do array
      */
    public int getTotalFunc(){
        return arr_func.size();
    }
    
    public int ObterFuncxNIF(int NIF_func){
        for (int i = 0; i < arr_func.size(); i++) {
            if(arr_func.get(i).getNIF() == NIF_func){
                return i;
            }
        }
        return -1;
    }
    
    public int VerifFuncAgente(int pos){
        if(arr_func.get(pos).getFuncao().equalsIgnoreCase("agente"))
            return 0;
        else
            return -1;
    }
    
    public int ObterNumFuncAgentes(){
        int j = 0;
        for (int i = 0; i < arr_func.size(); i++) {
            if(arr_func.get(i).getFuncao().equalsIgnoreCase("agente"))
                j++;
        }
        return j;
    }
    
    //CONDUTORES
    
    /**
     * Recebe um objeto conductor_c c e guarda num
     * arr_cond.
     * @param c objeto conductor_c c
     */
    public void NovoCondutor(Condutor_C c){
        
        arr_cond.add(c);
        
    }
    
    /**
     * Metodo que pesquisa um condutor pelo nif
     * @param NIF int numero nif colocado pelo usuario
     * @return String do toString do condutor especificado
     */
    public String MostrarCondutorxNIF(int NIF){
        
        //StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_cond.size(); i++) {
            if(arr_cond.get(i).getNIF() == NIF){
                return arr_cond.get(i).toString();
            }
        }
        return " ";
    }
    
    /**
     * Recebe o int NIF_cond, depois compara os valores NIF 
     * dentro do arr_cond com o NIF_cond, e sao iguais
     * devolve o a posiçao onde esta o NIF igual.
     * @param NIF_cond valor NIF recebido
     * @return valor real 
     */
    public int ObterCondutorxNIF(int NIF_cond){
        for (int i = 0; i < arr_cond.size(); i++) {
            if(arr_cond.get(i).getNIF() == NIF_cond){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Metodo que deolve o tamanho do array
     * arr_cond.
     * @return tamanho do array
     */
    public int getTotalCond(){
        return arr_cond.size();
    }
    
    /**
     * Metodo que mostra todos os condutores do arr_cond
     * @return String dos toString da classe Condutor_C
     */
    public String ListarTodosCond(){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_cond.size(); i++) {
            str.append(arr_cond.get(i)).append("\n");
        }
        return str.toString();
    }
    
    /**
     * Recebe o int NIF_cond do conductor e compara com 
     * todos os valores NIF de cada conductor dentro do
     * arr_cond, se algum NIF dos conductores é igual ao NIF_cond, devolve 
     * um valor 0 
     * @param NIF_cond variable int que representa o NIF do conductor
     * @return  valor real
     */
    public int VerifNIFCond(int NIF_cond){
        for (int i = 0; i < arr_cond.size(); i++) {
            if(arr_cond.get(i).getNIF() == NIF_cond){
                return 0;
            }
        }
        return -1;
    }
       
    /**
    * Recebe o int NIF_cond do conductor e compara com 
    * todos os valores NIF de cada funcionario dentro do
    * arr_func, se algum NIF dos funcionarios é igual ao NIF_cond, devolve 
    * um valor 0 
    * @param NIF_cond variable int que representa o NIF do conductor
    * @return valor real
    */
    public int VerifNIFCond_Func(int NIF_cond){
           for (int i = 0; i < arr_func.size(); i++){
               if(arr_func.get(i).getNIF() == NIF_cond){
                   return 0;
               }
           }
           return -1;
       }
       
    /**
    * Recebe o int telefone_cond do conductor e compara com 
    * todos os valores de telefone de cada conductor dentro do
    * arr_cond, se algum telefone do conductor é igual ao telefone_cond,
    * devolve um valor 0
    * @param telefone_cond variable int que representa o telefone do conductor
    * @return valor real
    */
    public int VerifTelefoneCond(int telefone_cond){
        for (int i = 0; i < arr_cond.size(); i++) {
            if(arr_cond.get(i).getTelefone() == telefone_cond){
                return 0;
            }
        }
        return -1;
    }
    
    /**
     * Recebe o int telefone_cond do conductor e compara com 
     * todos os valores de telefone de cada funcionario dentro do
     * arr_func, se algum telefone do funcionario é igual ao telefone_cond,
     * devolve um valor 0
     * @param telefone_cond variable int que representa o telefone do conductor
     * @return 
     */
    public int VerifTelefoneCond_Func(int telefone_cond){
        for (int i = 0; i < arr_func.size(); i++) {
            if(arr_func.get(i).getTelefone() == telefone_cond){
                return 0;
            }
        }
        return -1;
    }
    
    /**
     * Recebe o int cartacond do conductor e compara com 
     * todos os valores da carta de conduçao de 
     * cada conductor dentro do arr_cond, 
     * se alguma carta de conduçao do conductor é igual ao cartacond,
     * devolve um valor 0
     * @param cartacond variable int que representa 
     * o numero da carta de conduçao do conductor
     * @return valor real
     */
    public int VerifCartaCond(int cartacond){
        for (int i = 0; i < arr_cond.size(); i++) {
            if(arr_cond.get(i).getNumcartacond() == cartacond){
                return 0;
            }
        }
        return -1;
    
    }
    
    /**
     * Metodo utilizado para obter um condutor do arr_cond
     * utilizando a posicao no array
     * @param pos inteiro da posicao do condutor no array
     * @return Condutor_C, o objeto na posicao especificada
     */
    public Condutor_C Obtercondxposarr(int pos){
        return arr_cond.get(pos);
    }
    
    //OPCAO ALUGUEL
    
    /**
     * Metodo que salva a opcao aluguel criada
     * em Rent_a_car dentro do arr_opalug
     * @param opalug objeto da classe Opcao_aluguel_C
     */
    public void NovaOpcaoAlug(Opcao_aluguel_C opalug){
        opalug.setNum(arr_opalug.size()+1);
        arr_opalug.add(opalug);
    }
    
    /**
     * Metodo utilizado para saber o tamanho do arr_opalug
     * @return int do tamano do arr_opalug
     */
    public int getTotalOpAl(){
        return arr_opalug.size();
    }
    
    /**
     * Metodo que lista todas as opcoes de aluguer
     * @return String do toString da classe Opcao_aluguel_C
     */
    public String ListarTodasOpAl(){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_opalug.size(); i++) {
            str.append(arr_opalug.get(i)).append("\n");
        }
        return str.toString();
    }
    
    /**
     * Metodo utilizado para encontrar uma Opcao_aluguel_C
     * utilizando a posicao do arr_opalug
     * @param pos int da posicao no arr_opalug
     * @return Opcao_aluguel_C, e a opcao de aluguel na posicao especificada
     */
    public Opcao_aluguel_C ObterOpAl(int pos){
        return arr_opalug.get(pos);
    }
    
    //ALUGERES
    
    /**
     * Metodo que salva o aluguer criado
     * em Rent_a_car dentro do arr_alug
     * @param al objeto da classe Aluguer_C
     */
    public void NovoAluguer(Aluguer_C al){
        al.setNumero(arr_alug.size()+1);
        arr_alug.add(al);
    }
    
    /**
     * Metodo que lista todos os alugueres de um tipo espsecifico (1,2,3,4)
     * @param tipoal inteiro que especifica o tipo de aluguer
     * @return String do toString da clase Aluguer_C,
     * so dos alugueres do tipo especificado
     */
    public String ListarAlugxEstado(int tipoal){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_alug.size(); i++) {
            if(arr_alug.get(i).getTipoaluger() == tipoal)
                str.append(arr_alug.get(i)).append("\n");
        }
        return str.toString();
    }
    
    /**
     * Metodo que lista todos os alugueres de um condutor especifico
     * @param cond objeto Condutor_C usado para comparar com o objeto Condutor_C do arr_alug
     * @return String do toString da classe arr_alug so dos alugueres do condutor especificado
     */
    public String ListarAlugxCond(Condutor_C cond){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_alug.size(); i++) {
            if(arr_alug.get(i).getCondutor() == cond)
                str.append(arr_alug.get(i)).append("\n");
        }
        return str.toString();
    }
    
    /**
     * Metodo que classifica os alugueres com tipo 1 (reservado)
     * @return String do toString da classe Aluguer_C 
     */
    public String ListarAlugReserv(){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_alug.size(); i++) {
            if(arr_alug.get(i).getTipoaluger() == 1)
                str.append(arr_alug.get(i)).append("\n");
        }
        return str.toString();
    }
    
    /**
     * Metodo utilizado para obter o tamanho do arr_alug
     * @return int o tamano do array
     */
    public int getTotalAl(){
        return arr_alug.size();
    }
    
    /**
     * Metodo utilizado para obter um aluguer por seu numero
     * @param num numero de aluguer
     * @return Aluguer_C 
     */
    public Aluguer_C ObterAlugxNum(int num){
        return arr_alug.get(num-1);
    }
    
    public int VerifDatas(Calendar DeHE, Calendar DeHL){
        if(DeHE.get(Calendar.YEAR) - DeHL.get(Calendar.YEAR) >= 0){
            if(DeHE.get(Calendar.MONTH) - DeHL.get(Calendar.MONTH) >= 0){
                if(DeHE.get(Calendar.DATE) - DeHL.get(Calendar.DATE) > 0){
                    return 0;
                }
            }
        }
        return -1;
    }
    
    public int VerifDataCartCond(Calendar DeHL, Calendar DCC){
        if(DCC.get(Calendar.YEAR) - DeHL.get(Calendar.YEAR) >= 0){
            if(DCC.get(Calendar.MONTH) - DeHL.get(Calendar.MONTH) >= 0){
                //Diferenca minima entre a data do cartao de conducao e a data de levantamento do veiculo e considerada de 30 dias
                if(DCC.get(Calendar.DAY_OF_YEAR) - DeHL.get(Calendar.DAY_OF_YEAR) >= 30){
                    return 0;
                }
            }
        }
        return -1;
    }
    
    public void AltDeHL(Aluguer_C alug){
        arr_alug.get(alug.getNumero()-1).setDialevantHora(alug.getDialevantHora());
    }
    
    public void AltDeHE(Aluguer_C alug){
        arr_alug.get(alug.getNumero()-1).setDiaentregaHora(alug.getDiaentregaHora());
    }
    
    public void AltLocL(Aluguer_C alug){
        arr_alug.get(alug.getNumero()-1).setLocallevant(alug.getLocallevant());
    }
    
    public void AltLocE(Aluguer_C alug){
        arr_alug.get(alug.getNumero()-1).setLocalentrega(alug.getLocalentrega());
    }
    
    public void AltTipo(Aluguer_C alug){
        arr_alug.get(alug.getNumero()-1).setTipoaluger(alug.getTipoaluger());
    }
//    public void CancelarAlug(int num){
//        arr_alug.remove(num-1);
//    }
    
    //SERVICOS
    
    public void NovoServico(Aluguer_C alug,String condic, int posf, String tipo){
        float comb = 0;
        if(alug.getVeiculo().getNumalugueres() == 0)
            comb = 100;
        else{
            for (int i = 0; i < 10; i++) {
                if(alug.getVeiculo().equals(arr_serv.get(i).getVeic()))
                    comb = arr_serv.get(i).getPerccombdisp();
            }
        }
        Servico_C s = new Servico_C(arr_serv.size()+1, alug, alug.getDialevantHora(), condic, comb, arr_func.get(posf), alug.getVeiculo(), tipo);
        arr_serv.add(s);
    }
    
    //ESTATISTICAS
    
    /**
     * Metodo que calcula o percentagem de alugueres cancelados. 
     * Pescquisa o tipo 3(cancelados) do arr_alug.
     * @return j, o percentagem de alugueres cancelados
     */
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
    
    /**
     * Metodo que calcula o preco de todos os alugueres por ano. 
     * Compara cada um das datas do arr_alug e soma o preco de cada aluguel do mesmo ano
     * @return String com a informacao do toString da clase PrecoxAno_C
     */
    public String PrecototAlugxAno(){
        Calendar dataIni;
        Calendar dataFim;
        int anoi = 0;
        int anof = 0;
        int i, j;
        double prectot = 0;
        int x = 0;
        StringBuilder str = new StringBuilder("");
        
        for (j = 0; j < arr_alug.size(); j++) {
            anoi = arr_alug.get(j).getDiaentregaHora().get(Calendar.YEAR);
            for (i = 0; i < arr_alug.size(); i++) {
                anof = arr_alug.get(i).getDiaentregaHora().get(Calendar.YEAR);
                //Encontra outros alugueres com a mesma data e soma o preco
                if(anoi - anof == 0){
                    prectot += arr_alug.get(i).getPreco();
                    x = 1;
                }
            }
            //So se foram encontrados alugueres com datas iguais
            if(x == 1){
                PrecoxAno_C preca = new PrecoxAno_C(prectot, anof);
                arr_precxano.add(preca);
                str.append(arr_precxano.get(j)).append("\n");
            }
        }    
        return str.toString();
    }
    
    
    /**
     * Metodo que pesquisa no array de alugueres os alugueres que aconteceram em aquele ano e conta quantos alugueres ha por mes
     * @param ano ano escolhido pelo usuario
     * @return String com o toString da clase NumAlugxMesemAnok_C, dos alugueres que foram encontrados 
     */
    public String NumAlugxMes(int ano){
        int conta1 = 0, j = 0;
        int conta2 = 0,conta3 = 0,conta4 = 0,conta5 = 0,conta6 = 0,conta7 = 0,conta8 = 0,conta9 = 0,conta10 = 0,conta11 = 0,conta12 = 0;
        NumAlugxMesemAnok_C naxma = new NumAlugxMesemAnok_C(0, " ", 0);
         StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_alug.size(); i++) {
            //Encontra o ano
            if(arr_alug.get(i).getDiaentregaHora().get(Calendar.YEAR) == ano){
                //Encontra o mes do aluguel
                //Aumenta a conta do mes do aluguel
                //O mes fica salvado na posicao do array arr_numalugxmes
                switch(arr_alug.get(i).getDiaentregaHora().get(Calendar.MONTH)+1){
                    case 1:
                        naxma.setMes("Janeiro");
                        conta1++;
                        naxma.setNumerodealug(conta1);
                        naxma.setNummes(1);
                        arr_numalugxmes.add(naxma);
                        j++;
                        break;
                    case 2:
                        naxma.setMes("Fevereiro");
                        conta2++;
                        naxma.setNumerodealug(conta2);
                        naxma.setNummes(2);
                        arr_numalugxmes.add(naxma);
                        j++;
                        break;
                    case 3:
                        naxma.setMes("Marco");
                        conta3++;
                        naxma.setNumerodealug(conta3);
                        naxma.setNummes(3);
                        arr_numalugxmes.add(naxma);
                        j++;
                        break;
                    case 4:
                        naxma.setMes("Abril");
                        conta4++;
                        naxma.setNumerodealug(conta4);
                        naxma.setNummes(4);
                        arr_numalugxmes.add(naxma);
                        j++;
                        break;
                    case 5:
                        naxma.setMes("Maio");
                        conta5++;
                        naxma.setNumerodealug(conta5);
                        naxma.setNummes(5);
                        arr_numalugxmes.add(naxma);
                        j++;
                        break;
                    case 6:
                        naxma.setMes("Junho");
                        conta6++;
                        naxma.setNumerodealug(conta6);
                        naxma.setNummes(6);
                        arr_numalugxmes.add(naxma);
                        j++;
                        break;
                    case 7:
                        naxma.setMes("Julio");
                        conta7++;
                        naxma.setNumerodealug(conta7);
                        naxma.setNummes(7);
                        arr_numalugxmes.add(naxma);
                        j++;
                        break;
                    case 8:
                        naxma.setMes("Agosto");
                        conta8++;
                        naxma.setNumerodealug(conta8);
                        naxma.setNummes(8);
                        arr_numalugxmes.add(naxma);
                        j++;
                        break;
                    case 9:
                        naxma.setMes("Setembro");
                        conta9++;
                        naxma.setNumerodealug(conta9);
                        naxma.setNummes(9);
                        arr_numalugxmes.add(naxma);
                        j++;
                        break;
                    case 10:
                        naxma.setMes("Outubro");
                        conta10++;
                        naxma.setNumerodealug(conta10);
                        naxma.setNummes(10);
                        arr_numalugxmes.add(naxma);
                        j++;
                        break;
                    case 11:
                        naxma.setMes("Novembro");
                        conta11++;
                        naxma.setNumerodealug(conta11);
                        naxma.setNummes(11);
                        arr_numalugxmes.add(naxma);
                        j++;
                        break;
                    case 12:
                        naxma.setMes("Dezembro");
                        conta12++;
                        naxma.setNumerodealug(conta12);
                        naxma.setNummes(12);
                        arr_numalugxmes.add(naxma);
                        j++;
                        break;
                }
                    str.append(arr_numalugxmes.get(j-1)).append("\n");
            }
        }
        if(j > 0){
            return str.toString();
        }else
            return "Nao ha alugueres nese ano";
    }
    
    //FICHEIROS
    
    /**
     * Metodo que permite salvar os dados dos arrays no ficheiro dados.txt
     * 
     */
    public void SalvarDadosTxt() {  
        try
        {
            FileOutputStream wrt = new FileOutputStream("dados.txt");
            ObjectOutputStream out = new ObjectOutputStream(wrt);
            out.writeObject(arr_tipov);
            out.writeObject(arr_veic);
            out.writeObject(arr_func);
            out.writeObject(arr_cond);
            out.writeObject(arr_opalug);
            out.writeObject(arr_alug);
            out.close();
            wrt.close();
        } 
        catch (IOException ioe) 
        {
            ioe.printStackTrace();
        }
    }
    
    /**
     * Metodo que permite carregar os dados salvados no ficheiro dados.txt
     * 
     */
    public void LerdadosTxt(){
        try
        {
            FileInputStream read = new FileInputStream("dados.txt");
            ObjectInputStream in = new ObjectInputStream(read);
 
            arr_tipov = (ArrayList) in.readObject();
            arr_veic = (ArrayList) in.readObject();
            arr_func = (ArrayList) in.readObject();
            arr_cond = (ArrayList) in.readObject();
            arr_opalug = (ArrayList) in.readObject();
            arr_alug = (ArrayList) in.readObject();
            in.close();
            read.close();
        } 
        catch (IOException ioe) 
        {
            ioe.printStackTrace();
            return;
        } 
        catch (ClassNotFoundException c) 
        {
            System.out.println("Clase nao encontrada");
            c.printStackTrace();
            return;
        }
    }
    
    
}
