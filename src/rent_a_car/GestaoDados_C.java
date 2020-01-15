
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
     * Metodo para copiar cada toString de cada objeto
     * do array arr_tipov, logo devolve o str
     * e o imprime.
     * @return 
     */
    
    public String ListarTodosTiposVeiculos() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr_tipov.size(); i++) {
            str.append(arr_tipov.get(i)).append("\n");
            
        }
        return str.toString();
    }
    
    /**
     * Metodo que verifica que o numero de 
     * tipo de veiculo nao se repita, porque compara
     * cada posiçao do array arr_tipov e se é igual
     * entao devolve o valor 0.
     * @param numero
     * @return 
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
     * @return 
     */
    public TipoVeiculo_C ObterTipoVeicPorNum(int pos) {
        return arr_tipov.get(pos);
    }
    
    /**
     * Metodo que devolve a cantidad de 
     * posiçoes utilizadas do array arr_tipov
     * @return 
     */
    public int getTotalTiposVeic() {
        return arr_tipov.size();
    }
    
    /**
     * Metodo que devolve a cantidad de posiçoes utilizadas
     * do array arr_veic
     * @return 
     */
    public int getTotalVeic(){
        return arr_veic.size();
    }
    
    /**
     * Recebe um veiculo, e é guardado em
     * cada posiçao do arrar arr_veic.
     * @param v variable que representa o veiculo
     */
    public void NovoVeiculo(Veiculo_C v) {
        arr_veic.add(v);
        v.getTipo().NovoVeiculo(v);

    }
    
    /**
     * 
     * @param tipo
     * @return 
     */
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
    
    /**
     * Metodo que recebe a matricula, e depois compara 
     * com cada matricula já registrada no array arr_veic
     * e se sao iguais, devolve um valor de 0
     * @param matricula variable que tem o valor da matricula
     * @return 
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
     * 
     * @param matricula
     * @return 
     */
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
    
    /**
     * Metodo utilizado para obter um condutor do arr_cond utilizando a posicao no array
     * @param pos inteiro da posicao do condutor no array
     * @return Condutor_C, o objeto na posicao especificada
     */
    public Condutor_C Obtercondxposarr(int pos){
        return arr_cond.get(pos);
    }
    
    //OPCAO ALUGUEL
    
    /**
     * Metodo que salva a opcao aluguel criada em Rent_a_car dentro do arr_opalug
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
     * Metodo utilizado para encontrar uma Opcao_aluguel_C utilizando a posicao do arr_opalug
     * @param pos int da posicao no arr_opalug
     * @return Opcao_aluguel_C, e a opcao de aluguel na posicao especificada
     */
    public Opcao_aluguel_C ObterOpAl(int pos){
        return arr_opalug.get(pos);
    }
    
    //ALUGERES
    
    /**
     * Metodo que salva o aluguer criado em Rent_a_car dentro do arr_alug
     * @param al objeto da classe Aluguer_C
     */
    public void NovoAluguer(Aluguer_C al){
        al.setNumero(arr_alug.size()+1);
        arr_alug.add(al);
    }
    
    /**
     * Metodo que lista todos os alugueres de um tipo espsecifico (1,2,3,4)
     * @param tipoal inteiro que especifica o tipo de aluguer
     * @return String do toString da clase Aluguer_C, so dos alugueres do tipo especificado
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
    
//    public void CancelarAlug(int num){
//        arr_alug.remove(num-1);
//    }
    
    //ESTATISTICAS
    
    /**
     * Metodo que calcula o percentagem de alugueres cancelados. Pescquisa o tipo 3(cancelados) do arr_alug.
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
     * Metodo que calcula o preco de todos os alugueres por ano. Compara cada um das datas do arr_alug e soma o preco de cada aluguel do mesmo ano
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
