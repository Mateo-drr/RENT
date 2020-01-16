package rent_a_car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import util.Consola;

/**
 * Classe que representa o menu,tambem têm controlo das verficações e dos erros.
 * 
 * @author Mateo Rodriguez
 * @author Juan Marcillo
 */


public class Rent_a_car {
    
    /**
     * Formatos para as datas.
     */
    public static SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
    /**
     * Formato para as datas e horas.
     */
    public static SimpleDateFormat formatoH = new SimpleDateFormat("dd-MM-yyyy HH:mm");
    /**
     * Instância da classe gestao de daddos na main..
     */
    public static GestaoDados_C gd = new GestaoDados_C();
    
    /**
     * É o menu principal
     * @param args 
     */
    public static void main(String[] args) {
        
        int op;     //opcao a escolher do menu principal
        int opsub = -1;  //opcao a escolher nos submenus
        
        CarregarDados();
        
        do {
            op = menu();
            switch (op) {
                case 1:
                    menuCase1(opsub);
                    break;
                case 2:
                    menuCase2(opsub);
                    break;
                case 3:
                    menuCase3(opsub);
                    break;
                case 4:
                    menuCase4(opsub);
                    break;
                case 5:
                    menuCase5(opsub);
                    break;
                case 0:
                    gd.SalvarDadosTxt();
                    System.out.println("O programa terminou...");
            }
            if (op != 0) {
                Consola.sc.nextLine();
            }
        } while (op != 0);
    }

    /**
     * Imprime na ecra o menu principal.
     * @return opcao escolhe o numero de opção.
     */
    public static int menu() {
        System.out.println("\t\tRENT A CAR");
        System.out.println("\n\tNumero de Veic. por tipo:");
        System.out.println(gd.DADOSMENU());
        System.out.println("1.Veiculos");
        System.out.println("2.Funcionarios");
        System.out.println("3.Condutores");
        System.out.println("4.Opcoes de aluguel");
        System.out.println("5.Outras Consultas/Estatisticas");
        System.out.println("0.Sair");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 5);
        return opcao;
    }
        
    //SOUT SUBMENUS
    
    /**
     * Imprime o submenu da opção numero 1.
     * @return opcao escolhe o numero de opção.
     */
    public static int menuVeiculos(){
        System.out.println("1. Adicionar um tipo de Veiculo");
        System.out.println("2. Consultar todos os tipos de Veiculos");
        System.out.println("3. Adicionar um Veiculo");
        System.out.println("4. Consultar por tipo os Veiculos registrados");
        System.out.println("0. Voltar ao menu principal");
        int opcao = Consola.lerInt("Qual a opcao: ", 0, 4);
        return opcao;
    }
    
    /**
     * Imprime o submenu da opção numero 2.
     * @return escolhe o numero de opção.
     */
    public static int menuFuncionarios(){
        System.out.println("1. Adicionar Funcionario");
        System.out.println("2. Consultar Funcionarios");
        System.out.println("0. Voltar ao menu principal");
        int opcao = Consola.lerInt("Qual a opcao: ", 0, 2);
        return opcao;
    }
    /**
     * Imprime o submenu da opção numero 3.
     * @return escolhe o numero de opção.
     */
    public static int menuCondutores(){
        System.out.println("1. Adicionar Condutor");
        System.out.println("2. Consultar Condutor por NIF");
        System.out.println("0. Voltar ao menu principal");
        int opcao = Consola.lerInt("Qual a opcao: ", 0, 2);
        return opcao;
    }
    
    /**
     * Imprime o submenu da opção numero 4.
     * @return escolhe o numero de opção.
     */
    public static int menuAlugueres(){
        System.out.println("1. Adicionar opcao de aluguer");
        System.out.println("2. Consultar opcoes de aluguer");
        System.out.println("3. Registrar aluguer");
        System.out.println("4. Consultar alugueres por estado");
        System.out.println("5. Alterar datas e hora de levantamento");
        System.out.println("6. Alterar datas e hora de entrega");
        System.out.println("7. Alterar locais de levantamentos");
        System.out.println("8. Alterar locais de entrega");
        System.out.println("9. Cancelar aluguer");
        System.out.println("10. Levantar Veiculo");
        System.out.println("11. Entregar Veiculo");
        System.out.println("0. Voltar ao menu principal");
        int opcao = Consola.lerInt("Qual a opcao: ", 0, 11);
        return opcao;
    }
    
    /**
     * Imprime o submenu da opção numero 5.
     * @return escolhe o numero de opção.
     */
    public static int menuEStatisticas(){
        System.out.println("1. Percentagem de reservas canceladas");
        System.out.println("2. Total de veiculos alugados no momento");
        System.out.println("3. Preco total em alugueres por ano");
        System.out.println("4. Numero total de alugueres registrados por mes num determinado ano");
        System.out.println("0. Voltar ao menu principal");
        int opcao = Consola.lerInt("Qual a opcao: ", 0, 4);
        return opcao;
    }
    
    //SUBMENUS
    
    /**
     * Menu da primeira opção do menu principal,
     * menu dos veiculos.
     * @param opsub valor que determina qual case utilizar.
     */
    public static void menuCase1(int opsub){
        
        do{
                        opsub = menuVeiculos();
                        switch(opsub){
                            case 1:
                                InserirTipoVeic();
                                System.out.println("Tipo de Veiculo Criado!");
                                break;
                            case 2:
                                ListartodosTiposdeVeic();
                                break;
                            case 3:
                                InserirVeic();
                                System.out.println("Veiculo Registrado!");
                                break;
                            case 4:
                                ListarVeicxTipo();
                                break;
                            case 0:
                                break;
                        }
                    }while(opsub != 0);
    }
    
    /**
     * Menu da segunda opção do menu principal,
     * menu dos funcionarios.
     * @param opsub valor que determina qual case utilizar.
     */
    public static void menuCase2(int opsub){
        
        do{
                        opsub = menuFuncionarios();
                        switch(opsub){
                            case 1:
                                InserirFunc();
                                System.out.println("Funcionario registrado!\n");
                                break;
                            case 2:
                                ListarFunc();
                                break;
                            case 0:
                                break;
                        }
                    }while(opsub != 0);
        
    }
    
    /**
     * Menu da terceira opção do menu principal,
     * menu dos condutores.
     * @param opsub valor que determina qual case utilizar.
     */
    public static void menuCase3(int opsub){
        
        do{
                        opsub = menuCondutores();
                        switch(opsub){
                            case 1:
                                InserirCondutor();
                                break;
                            case 2:
                                ObterCondutorxNIF();
                                break;
                            case 0:
                                break;
                        }
                    }while(opsub != 0);
        
    }
    
    /**
     * Menu da quarta opção do menu principal,
     * menu dos alugeres.
     * @param opsub valor que determina qual case utilizar.
     */
    public static void menuCase4(int opsub){
        
        do{
                        opsub = menuAlugueres();
                        switch(opsub){
                            case 1:
                                InserirOpcaoAlug();
                                System.out.println("Opcao aluguel criada!");
                                break;
                            case 2:
                                ListarTodasOpcoesAlug();
                                break;
                            case 3:
                                RegistrarAlug();
                                System.out.println("Aluguel registrado!");
                                break;
                            case 4:
                                ListarAlugxEstado();
                                break;
                            case 5:
                                AlterarDeHL();
                                System.out.println("Data e hora de levantamento alteradas!");
                                break;
                            case 6:
                                AlterarDeHE();
                                System.out.println("Data e hora de entrega alteradas!");
                                break;
                            case 7:
                                AlterarLocLev();
                                System.out.println("Local de levantamento alterado!");
                                break;
                            case 8:
                                AlterarLocEnt();
                                System.out.println("Local de entrega alterado!");
                                break;
                            case 9:
                                CancelarAl();
                                System.out.println("Aluguer cancelado");
                                break;
                            case 10:
                                LevantarVeic();
                                System.out.println("O Aluguer foi iniciado e o veiculo levantado!");
                                break;
                            case 11:
                                EntregarVeic();
                                System.out.println("O alugueer foi terminado e o veiculo entregado!");
                                break;
                            case 0:
                                
                                break;
                        }
                    }while(opsub != 0);
        
    }
    
    /**
     * Menu da quinta opção do menu principal,
     * menu das estatísticas.
     * @param opsub valor que determina qual case utilizar.
     */
    public static void menuCase5(int opsub){
        
        do{
            opsub = menuEStatisticas();
            switch(opsub){
                case 1:
                    PercentagemCancel();
                    break;
                case 2:
                    TotalVeicAlug();
                    break;
                case 3:
                    PrecoTotalAlugporAno();
                    //Falta
                    break;
                case 4:
                    NumAlugxMesAno();
                    //Falta
                    break;
                case 0:
                    break;
            }
        }while(opsub != 0);
        
    }
    
    //VEICULOS
    
    /**
     * Permite registrar um novo tipo de veiculo
     */
    public static void InserirTipoVeic(){
        
        int i=0;
        int j = 0;
        String designacao;
        do{
        designacao = Consola.lerString("Insira a designacao do tipo de veiculo: ");
        j = gd.VerifDesigTipoVeic(designacao);
        if(j == 0)
            System.out.println("Designacao ja registrada");
        }while(j == 0);
        String descricao = Consola.lerString("Insira a descricao do tipo de veiculo: ");
        double preco = Consola.lerDouble("Insira o precio deste tipo de veiculo: ", 0, 10000);
        
        TipoVeiculo_C tv = new TipoVeiculo_C(designacao, descricao, preco);
        
        gd.NovoTipoVeiculo(tv);
    }
    
    /**
     * Mostrar uma lista de todos os tipos de veiculos.
     */
    public static void ListartodosTiposdeVeic(){
        if(gd.getTotalTiposVeic() != 0)
        System.out.println(gd.ListarTodosTiposVeiculos());
        else
            System.out.println("Nao a tipos de veiculos inseridos!\n");
    }
    
    /**
     * Permite registrar um novo veiculo.
     */
    public static void InserirVeic(){
        int i;
        int numtipov;
        int matricula;
        
        //Verificacao do numero do tipo de veiculo
        System.out.println(gd.ListarTodosTiposVeiculos());
        do{
            numtipov = Consola.lerInt("Insira o numero do tipo de veiculo: ", 1, 10);
            System.out.println(gd.ListarTodosTiposVeiculos());
            i = gd.VerifNumerotipoveic(numtipov);
            if(i == -1)
                System.out.println("Numero do tipo de veiculo nao existe!");
        }while(i == -1);
        
        //Verificacao da matricula
        do{
            matricula = Consola.lerInt("Insira a matricula: ", 0, 999999999);
            i = gd.VerifMatriculaUnica(matricula);
            if(i == 0)
                System.out.println("Numero de matricula ja existe!");
        }while(i == 0);
        
        int numpessoas = Consola.lerInt("Insira o numero de pessoas que o veiculo pode levar: ", 1, 50);
        String tipogas = Consola.lerString("Insira o tipo de gas: ");
        float quilometragem = Consola.lerFloat("Insira o quilometragem atual: ", 0, 999999999);
        int lig = Consola.lerInt("O veiculo e ligeiro? (1.sim) (0.nao): ", 0, 1);
        boolean ligeiro = (lig == 1);
        
        //Tipo de veiculo
        TipoVeiculo_C tv;
        tv = gd.ObterTipoVeicPorNum(numtipov-1);
        Veiculo_C v;
        
        //Veiculos Ligeiros
        if(ligeiro){
            int capbaggagem = Consola.lerInt("Insira a capacidade de baggagem: ", 1, 50);
            int numportas = Consola.lerInt("Insira o numero de portas: ", 3, 5);
            v = new VeiculoLigeiro_C(capbaggagem, numportas, matricula, numpessoas, tipogas, quilometragem, tv);
        }
        else{
        //Veiculo nao Ligeiro 
           v = new Veiculo_C(matricula, numpessoas, tipogas, quilometragem, tv);
        }
        
        //Salvar veiculo
        gd.NovoVeiculo(v);
    }
    
    //falta verificacao
    
    /**
     * Imprime na ecra a lista de veiculos divididos
     * por seu respectivo tivo de veiculo.
     */
    public static void ListarVeicxTipo(){
        if(gd.getTotalTiposVeic() != 0){
                String tipo = Consola.lerString("Cual e o tipo de veiculo?: ");
                System.out.println(gd.ObterVeiculosPorTipo(tipo));
        }else
            System.out.println("Nao a tipos de veiculos inseridos!");
    }
    
    //FUNCIONARIOS
    /**
     * Registra um novo funcionario.
     */
    public static void InserirFunc(){
        
        int y;
        int i;
        int NIF;
        int telefone; 
        //verificaçao do numero de NIF
        do{
               NIF = Consola.lerInt("Insira o NIF do funcionario: ", 0, 999999999);
               i = gd.VerifNIFFunc(NIF);
               y = gd.VerifNIFFunc_Cond(NIF);
               if(i == 0 || y == 0)
                   System.out.println("Numero de NIF ja existe!");
           }while(i == 0 || y == 0);
        
        String nome = Consola.lerString("Insira o nome do funcionario: ");
        String morada = Consola.lerString("Insira a morada: ");
        
       
        //verificaçao numero de telefone do funcionario
         do{
               telefone = Consola.lerInt("Insira o telefone: ", 0, 999999999);
               i = gd.VerifTelefoneFunc(telefone);
               y = gd.VerifTelefoneFunc_Cond(telefone);
               if(i == 0 || y ==0)
                   System.out.println("Numero de telefone ja registrado!");
           }while(i == 0 || y == 0);
        
         String funcao = Consola.lerString("Qual e a funcao: ");
        
        Funcionario_C f = new Funcionario_C(NIF, nome, morada, telefone, funcao);
        
        gd.NovoFuncioanrio(f);
        
    }
    
    /**
     * Permite imprimir uma lista dos
     * funcionarios já registrados.
     */
    public static void ListarFunc(){
        if(gd.getTotalFunc() != 0)
            System.out.println(gd.ListarTodosFunc());
        else
            System.out.println("Nao a funcionarios registrados!\n");
    }
    
    //CONDUTORES
    
    //falta mostrar alugueres de ese condutor
    
    /**
     * Permite registrar um novo condutor
     */
    public static void InserirCondutor(){
        
        int i;
        int y;
        int x;
        String datax;
        Calendar data = new GregorianCalendar();
        int NIF;
        int telefone; 
        int cartcond;  
        
        // verificaçao NIF
        do{
               NIF = Consola.lerInt("Insira o NIF do condutor: ", 0, 999999999);
               i = gd.VerifNIFCond(NIF);
              y = gd.VerifNIFCond_Func(NIF);
               if(i == 0 || y == 0)
                   System.out.println("Numero de NIF ja existe!");
           }while(i == 0 || y == 0);
        
        String nome = Consola.lerString("Insira o nome do condutor: ");
        String morada = Consola.lerString("Insira a morada: ");
        
        
        //verificaçao numero de telefone do funcionario
         do{
               telefone = Consola.lerInt("Insira o telefone: ", 0, 999999999);
               i = gd.VerifTelefoneCond(telefone);
               y = gd.VerifTelefoneCond_Func(telefone);
               if(i == 0 || y == 0)
                   System.out.println("Numero de telefone ja registrado!");
           }while(i == 0 || y == 0);
         
       
        //verificaçao numero da carta de conduçao
         do{
               cartcond = Consola.lerInt("Insira o numero da carta conducao: ", 0, 999999999);
               i = gd.VerifCartaCond(cartcond);
               if(i == 0)
                   System.out.println("Numero da carta de conduçao ja registrado!");
           }while(i == 0);
        
        //String data = Consola.lerString("Data de validade do cartao (dd/mm/aa): ");
        
        do {
            x = 0;
            try {
                datax = Consola.lerString("Data de validade do cartao (dd-mm-yyyy): ");
                data.setTime(formato.parse(datax));
            } catch (ParseException e) {
                x = 1;
                System.err.println("Data de nascimento com formato inválido!");
            }
        } while (x == 1);
        
        Condutor_C cond = new Condutor_C(NIF, nome, morada, telefone, cartcond, data);
        
        gd.NovoCondutor(cond);
        
    }
    
    /**
     * Permite pesquisar a um condutor
     * a travez de seu NIF
     */
    public static void ObterCondutorxNIF(){
        if(gd.getTotalCond()!= 0){
                int findNIF = Consola.lerInt("Cual e o NIF: ", 0, 999999999);
                System.out.println(gd.MostrarCondutorxNIF(findNIF));
                //System.out.println(gd.ObterCondutorxNIF(findNIF));
                int i = gd.ObterCondutorxNIF(findNIF);
                if( i == -1 ){
                    System.out.println("NIF nao encontrado!");
                }else{
                    Condutor_C cond = gd.Obtercondxposarr(i);
                    System.out.print("Alugueres:");
                    System.out.print(gd.ListarAlugxCond(cond));
                }
            }else
            System.out.println("Nao a condutores registrados!");
    }
    
    //Opcao Alugueres
    
    /**
     * Inserir uma nova opção de aluger
     */
    public static void InserirOpcaoAlug(){
        
        String nome = Consola.lerString("Nome da opcao: ");
        String descri = Consola.lerString("Descricao opcao: ");
        float preco = Consola.lerFloat("Preco da opcao: ", 0, 10000);
        
        Opcao_aluguel_C opal = new Opcao_aluguel_C(nome, descri, preco);
        
        gd.NovaOpcaoAlug(opal);
        
    }
    
    /**
     * Permite imprimir uma lista de todas
     * as opções de alugeres.
     */
    public static void ListarTodasOpcoesAlug(){
        if(gd.getTotalOpAl() != 0)
            System.out.println(gd.ListarTodasOpAl());
        else
            System.out.println("Nao a tipos de veiculos inseridos!\n");
    }
    
    //Alugueres
    
    /**
     * Permite registrar um novo aluger.
     */
    public static void RegistrarAlug(){
        int i = 0;
        int j = 0;
        
        if(gd.getTotalCond() != 0){
            if(gd.getTotalVeic() != 0){
                int PosCond;
                int PosVeic;
                int y;
                char resposta;
                String datay;
                Calendar DeHL = new GregorianCalendar();
                Calendar DeHE = new GregorianCalendar();

                String locallevant = Consola.lerString("Local de levantamento: ");
                String localentrega = Consola.lerString("Local de entrega: ");

                //Posicao condutor no arr_cond
                do{
                    int NIF = Consola.lerInt("NIF do Condutor: ", 0, 999999999);
                    PosCond = gd.ObterCondutorxNIF(NIF);
                    if(PosCond == -1)
                        System.out.println("NIF nao registrado!");
                }while(PosCond == -1);

                //Condutor
                Condutor_C cond = gd.Obtercondxposarr(PosCond);

                //Posicao veiculo no arr_veic
                do{
                    int matr = Consola.lerInt("Matricula do veiculo: ", 0, 999999999);
                    PosVeic = gd.ObterVeiculoxMatr(matr);
                    if(PosCond == -1)
                        System.out.println("Veiculo nao registrado!");
                }while(PosVeic == -1);

                //Veiculo
                Veiculo_C v = gd.ObterVeicxposarr(PosVeic);

                //Num pessoas do veic escolhido
                int nump = v.getNumpessoas();

                //caracteristica reserva
                String caractreserva = Consola.lerString("Caracteristica de la reserva: ");

                //Data e hora lev e ent.
                do{
                    //Data e hora lev.
                    do {
                        y = 0;
                        try {
                            datay = Consola.lerString("Data e hora de levantamento (dd-mm-yyyy HH:mm): ");
                            DeHL.setTime(formatoH.parse(datay));
                        } catch (ParseException e) {
                            y = 1;
                            System.err.println("Data e hora com formato inválido!");
                        }
                    } while (y == 1);

                    //Data e hora ent.
                    do {
                        y = 0;
                        try {
                            datay = Consola.lerString("Data e hora de entrega (dd-mm-yyyy HH:mm): ");
                            DeHE.setTime(formatoH.parse(datay));
                        } catch (ParseException e) {
                            y = 1;
                            System.err.println("Data e hora com formato inválido!");
                        }
                    } while (y == 1);
                    //verificacao que a data de entrega nao seja menor a data de levantamento
                    i = gd.VerifDatas(DeHE, DeHL);
                    if(i == -1){
                        System.out.println("Data de entrega tem que ter uma diferenca minima com a data de levantamento de 1 dia");
                    }else{
                        j = gd.VerifDataCartCond(DeHL, cond.getDatacartcond());
                        if(j == -1){
                            System.out.println("Data de validade do cartao nao e igual ou superior aos 30 dias da data do leventamento");
                            int k = Consola.lerInt("Deseja mudar a data de levantamento(1) ou cancelar o aluguer(0): ", 0,1);
                            if(k == 0){
                                i = 2;
                                j = 2;
                            }
                        }
                    }
                }while(i == -1 || j == -1);
                
                //Se foi escolhido cancelar o aluguer nao salva os dados e sai do metodo
                if(i != 2 && j != 2){
                //tipo de aluguer = 1. reservado
                int tipal = 1;

                //preco sem opcoes extra
                double preco = v.getTipo().getPreco();

                Aluguer_C al = new Aluguer_C(tipal, locallevant, localentrega, DeHE, DeHE, cond, v, nump, caractreserva, preco);

                //Opcao alug
                do{
                    resposta= Consola.lerChar("Pretende associar uma opcao", "SsNn");
                    if(resposta == 'S' || resposta == 's'){
                        System.out.println(gd.ListarTodasOpAl());
                        int num = Consola.lerInt("Numero da opcao a escolher: ", 1, gd.getTotalOpAl());
                        Opcao_aluguel_C op = gd.ObterOpAl(num-1);
                        al.NovaOpcaoAlug(op);
                        preco += op.getPreco();
                    }
                }while(resposta== 'S' || resposta == 's');

                //preco com opcoes extra
                al.setPreco(preco);

                //Salvar aluguer criado
                gd.NovoAluguer(al);
                
                }else{
                    System.out.println("Alguel cancelado");
                }
                
        } else{
                System.out.println("Nao ha veiculos registrado");
            }
    }else{
            System.out.println("Nao ha condutores registrados!");
        }
        
    }
    
    /**
     * Permite imprimir uma lista de alugeres
     * de acordo ao seu respectivo estado.
     */
    public static void ListarAlugxEstado(){
        int tipoal;
        
        System.out.println("Estados dos alugueres:");
        do{
            tipoal = Consola.lerInt("1.Reservado\n2.inciado\n3.cancelado\n4.terminado\nOpçao: ", 1, 4);
            if(tipoal > 4 && tipoal < 1)
                System.out.println("Estado nao existente!");
        }while(tipoal > 4 && tipoal < 1);
        System.out.println(gd.ListarAlugxEstado(tipoal));
    }
    
    /**
     * Permite alterar o dia e a hora
     * do levantamento do veiculo.
     */
    public static void AlterarDeHL(){
        int i = 0;
        int y;
        String datay;
        Calendar DeHL = new GregorianCalendar();
        
        if(gd.getTotalAl() != 0){
            System.out.println(gd.ListarAlugxEstado(1));
            int numero = Consola.lerInt("Escolha o numero do alguer que deseja alterar a data e hora de levantamento: ", 1, gd.getTotalAl());
            Aluguer_C al = gd.ObterAlugxNum(numero);
            do{
                do {
                    y = 0;
                    try {
                        datay = Consola.lerString("Data e hora de levantamento (dd-mm-yyyy HH:mm): ");
                        DeHL.setTime(formatoH.parse(datay));
                    } catch (ParseException e) {
                        y = 1;
                        System.err.println("Data e hora com formato inválido!");
                    }
                } while (y == 1);
                i = gd.VerifDatas(al.getDiaentregaHora(), DeHL);
                if(i == -1)
                    System.out.println("Data de entrega tem que ter uma diferenca minima com a data de levantamento de 1 dia");
            }while(i == -1);
            al.setDialevantHora(DeHL);
            gd.AltDeHL(al);
        }else
            System.out.println("Nao a tipos de veiculos inseridos!\n");
    }
    
    /**
     * Permite alterar o dia e hora 
     * a entrega do veiculo.
     */
    public static void AlterarDeHE(){
        int i = 0;
        int y;
        String datay;
        Calendar DeHE = new GregorianCalendar();
        if(gd.getTotalAl() != 0){
            System.out.println(gd.ListarAlugxEstado(1));
            int numero = Consola.lerInt("Escolha o numero do alguer que deseja alterar a data e hora de entrega: ", 1, gd.getTotalAl());
            Aluguer_C al = gd.ObterAlugxNum(numero);
            do{
                do {
                    y = 0;
                    try {
                        datay = Consola.lerString("Data e hora de entrega (dd-mm-yyyy HH:mm): ");
                        DeHE.setTime(formatoH.parse(datay));
                    } catch (ParseException e) {
                        y = 1;
                        System.err.println("Data e hora com formato inválido!");
                    }
                } while (y == 1);
                i = gd.VerifDatas(DeHE, al.getDialevantHora());
                if(i == -1)
                    System.out.println("Data de entrega tem que ter uma diferenca minima com a data de levantamento de 1 dia");
            }while(i == -1);
            al.setDiaentregaHora(DeHE);
            gd.AltDeHE(al);
        }else
            System.out.println("Nao a tipos de veiculos inseridos!\n");
    }
    
    /**
     * Permite alterar o local
     * de levantamento do veiculo.
     */
    public static void AlterarLocLev(){
        
        if(gd.getTotalAl() != 0){
            System.out.println(gd.ListarAlugxEstado(1));
            int numero = Consola.lerInt("Escolha o numero do alguer que deseja alterar o local de levantamento: ", 1, gd.getTotalAl());
            Aluguer_C al = gd.ObterAlugxNum(numero);
            al.setLocallevant(Consola.lerString("Local de levantamento novo: "));
            gd.AltLocL(al);
        }else
            System.out.println("Nao a alugueres registrados!\n");
        
    }
    
    /**
     * Permite alterar o local de 
     * entrega do veiculo.
     */
    public static void AlterarLocEnt(){
        
        if(gd.getTotalAl() != 0){
            System.out.println(gd.ListarAlugxEstado(1));
            int numero = Consola.lerInt("Escolha o numero do alguer que deseja alterar o local de entrega: ", 1, gd.getTotalAl());
            Aluguer_C al = gd.ObterAlugxNum(numero);
            al.setLocalentrega(Consola.lerString("Local de entrega novo: "));
            gd.AltLocE(al);
        }else
            System.out.println("Nao a alugueres registrados!\n");
    }
    
//    Borra el aluger de la base de datos.    
//    public static void CancelarAl(){
//        if(gd.getTotalAl() != 0){
//            System.out.println(gd.ListarAlugReserv());
//            int numero = Consola.lerInt("Escolha o numero do alguer que deseja cancelar: ", 1, gd.getTotalAl());
//            gd.CancelarAlug(numero);
//        }else
//            System.out.println("Nao a tipos de veiculos inseridos!\n");        
//    }
    
    /**
     * Permite pôr o aluger no
     * estado cancelado.
     */
    public static void CancelarAl(){
        if(gd.getTotalAl() != 0){
            System.out.println(gd.ListarAlugxEstado(1));
            int numero = Consola.lerInt("Escolha o numero do alguer que deseja cancelar: ", 1, gd.getTotalAl());
            Aluguer_C al = gd.ObterAlugxNum(numero);
            al.setTipoaluger(3);
            gd.AltTipo(al);
        }else
            System.out.println("Nao a alugueres registrados!\n");        
    }
    
    /**
     * Permite levantar o veiculo que
     * já começo o aluger.
     */
    public static void LevantarVeic(){
        int i = 0;
        int j = 0;
        if(gd.getTotalAl() != 0){
            int k = gd.ObterNumFuncAgentes();
            if(k != 0){
                do{
                    System.out.println(gd.ListarTodosFunc());
                    int NIF = Consola.lerInt("Cual e o NIF do funcionario a realizar o servico? ", 0, 999999999);
                    i = gd.ObterFuncxNIF(NIF);
                    if(i == -1){
                        System.out.println("NIF escolhido nao registrado!");
                    }else{
                        j = gd.VerifFuncAgente(i);
                        if(j == -1)
                            System.out.println("So os funcionarios agentes podem realizar o servico.");
                    }
                }while(i == -1 || j == -1);
                System.out.println(gd.ListarAlugxEstado(1));
                int numero = Consola.lerInt("Escolha o numero do alguer que deseja iniciar: ", 1, gd.getTotalAl());
                Aluguer_C al = gd.ObterAlugxNum(numero);
                al.setTipoaluger(2);
                gd.AltTipo(al);
                String condic = Consola.lerString("Condicao atual do veiculo: ");
                gd.NovoServicoL(al, condic, i);
                
            }else
                System.out.println("Nao a funcionarios agentes registrados para realizar o servico");
        }else
            System.out.println("Nao a alugueres registrados!\n");        
    }
    
    /**
     * Registra a entrega do veiculo.
     */
    public static void EntregarVeic(){
        int i = 0;
        int j = 0;
        //agregar quilometragem
        if(gd.getTotalAl() != 0){
            int k = gd.ObterNumFuncAgentes();
            if(k != 0){
                do{
                    System.out.println(gd.ListarTodosFunc());
                    int NIF = Consola.lerInt("Cual e o NIF do funcionario a realizar o servico? ", 0, 999999999);
                    i = gd.ObterFuncxNIF(NIF);
                    if(i == -1){
                        System.out.println("NIF escolhido nao registrado!");
                    }else{
                        j = gd.VerifFuncAgente(i);
                        if(j == -1)
                            System.out.println("So os funcionarios agentes podem realizar o servico.");
                    }
                }while(i == -1 || j == -1);
                System.out.println(gd.ListarAlugxEstado(2)); 
                int numero = Consola.lerInt("Escolha o numero do alguer que deseja entregar: ", 1, gd.getTotalAl());
                Aluguer_C al = gd.ObterAlugxNum(numero);
                al.setTipoaluger(4);
                gd.AltTipo(al);
                String condic = Consola.lerString("Condicao atual do veiculo: ");
                float q = Consola.lerFloat("Quilometragem atual: ", al.getVeiculo().getQuilometragem(), 999999999);
                float comb = Consola.lerFloat("Percentagem de combustivel atual: ", 0, 100);
                al.getVeiculo().setQuilometragem(q);
                gd.NovoServicoE(al, condic, i, comb);
            }else
                System.out.println("Nao a funcionarios agentes registrados para realizar o servico");
        }else
            System.out.println("Nao a alugueres registrados!\n");      
    }
    
    //Estatisticas
    
    /**
     * Imprime uma percetagem dos alugeres
     * que estejam no estado cancelado.
     */
    public static void PercentagemCancel(){
        if(gd.getTotalAl() != 0){
            System.out.println("Percentagem de alugures cancelados: " + gd.NumAlugCancel() + "%");
        }else
            System.out.println("Nao ha alugureres registrados");
    }
    
    /**
     * Imprime o numero total de veiculos alugados.
     */
    public static void TotalVeicAlug(){
        if(gd.getTotalAl() != 0){
            float i = gd.getTotalAl() - (gd.NumAlugCancel()*gd.getTotalAl()/100);
            System.out.println("Numero de alugures registrados: " + i);
        }else
            System.out.println("Nao ha alugureres registrados");
    }
    
    /**
     * Imprime a soma total dos preços de alugueres por cada ano.
     */
    public static void PrecoTotalAlugporAno(){
        if(gd.getTotalAl() != 0){
            System.out.println(gd.PrecototAlugxAno());
        }else
            System.out.println("Nao ha alugueres registrados!");
    }
    
    /**
     * Imprime o numero total de alugueres por cada mes de cada ano
     */
    public static void NumAlugxMesAno(){
        if(gd.getTotalAl() != 0){
            //Calendar dataesc = new GregorianCalendar();
            int ano = Consola.lerInt("Cual e o ano? ", 1900, 2112);
            //dataesc.set(ano, 0, 0);
            System.out.println("Numero de alugueres registrados no ano "+ ano); 
            System.out.println(gd.NumAlugxMes(ano));
        }else
            System.out.println("Nao ha alugueres registrados!");
    }   
    
    /**
     * Permite escolher carregar dados já guardados 
     * num ficheiro.txt para iniciar o programa.
     */
    public static void CarregarDados(){
        int i = Consola.lerInt("Deseja carregar os dados anteriores? (1.sim) (0.nao): ", 0, 1);
        if(i == 1){
            gd.LerdadosTxt();
            System.out.println("Dados carregados!");
        }
            
    }
    
}
