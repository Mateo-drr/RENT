/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent_a_car;

import util.Consola;

/**
 *
 * @author Mateo
 */
public class Rent_a_car {

    
    public static GestaoDados_C gd = new GestaoDados_C();
    
    public static void main(String[] args) {
        
        int op;     //opcao a escolher do menu principal
        int opsub = -1;  //opcao a escolher nos submenus
        
        
        
        
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
                    System.out.println("O programa terminou...");
            }
            if (op != 0) {
                Consola.sc.nextLine();
            }
        } while (op != 0);
    }

    public static int menu() {
        System.out.println("1.Veiculos");
        System.out.println("2.Funcionarios");
        System.out.println("3.Condutores");
        System.out.println("4.Opcoes de aluguel");
        System.out.println("5.Outras Consultas/Estatisticas");
        System.out.println("0.Sair");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 5);
        return opcao;
    }
        
    public static int menuVeiculos(){
        System.out.println("1. Adicionar um tipo de Veiculo");
        System.out.println("2. Consultar todos os tipos de Veiculos");
        System.out.println("3. Adicionar um Veiculo");
        System.out.println("4. Consultar por tipo os Veiculos registrados");
        System.out.println("0. Voltar ao menu principal");
        int opcao = Consola.lerInt("Qual a opcao", 0, 4);
        return opcao;
    }
    
    public static int menuFuncionarios(){
        System.out.println("1. Adicionar Funcionario");
        System.out.println("2. Consultar Funcionarios");
        System.out.println("0. Voltar ao menu principal");
        int opcao = Consola.lerInt("Qual a opcao", 0, 2);
        return opcao;
    }
    
    public static int menuCondutores(){
        System.out.println("1. Adicionar Condutor");
        System.out.println("2. Consultar Condutor por NIF");
        System.out.println("0. Voltar ao menu principal");
        int opcao = Consola.lerInt("Qual a opcao", 0, 2);
        return opcao;
    }
    
    public static int menuAlugueres(){
        System.out.println("1. Adicionar opcao de aluguel");
        System.out.println("2. Consultar opcoes de aluguel");
        System.out.println("3. Consultar opcoes de aluguel por estado");
        System.out.println("4. Alterar datas de levantamento");
        System.out.println("5. Alterar locais de levantamentos");
        System.out.println("6. Alterar locais de entrega");
        System.out.println("7. Cancelar aluguer");
        System.out.println("8. Levantar Veiculo");
        System.out.println("9. Entregar Veiculo");
        System.out.println("0. Voltar ao menu principal");
        int opcao = Consola.lerInt("Qual a opcao", 0, 9);
        return opcao;
    }
    
    public static int menuEStatisticas(){
        System.out.println("1. Percentagem de reservas canceladas");
        System.out.println("2. Total de veiculos alugados no momento");
        System.out.println("3. Preco total em alugueres por ano");
        System.out.println("4. Numero total de alugueres registrados por mes num determinado ano");
        System.out.println("0. Voltar ao menu principal");
        int opcao = Consola.lerInt("Qual a opcao", 0, 4);
        return opcao;
    }
    
     public static void menuCase1(int opsub){
        
        do{
                        opsub = menuVeiculos();
                        switch(opsub){
                            case 1:
                                InserirTipoVeic();
                                System.out.println("Tipo de Veiculo Criado!");
                                break;
                            case 2:
                                System.out.println(gd.ListarTodosTiposVeiculos());
                                break;
                            case 3:
                                InserirVeic();
                                System.out.println("Veiculo Registrado!");
                                break;
                            case 4:
                                //System.out.println(gd.);
                                break;
                            case 0:
                                break;
                        }
                    }while(opsub != 0);
    }
    
    public static void menuCase2(int opsub){
        
        do{
                        opsub = menuFuncionarios();
                        switch(opsub){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 0:
                                break;
                        }
                    }while(opsub != 0);
        
    }
    
    public static void menuCase3(int opsub){
        
        do{
                        opsub = menuCondutores();
                        switch(opsub){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 0:
                                break;
                        }
                    }while(opsub != 0);
        
    }
    
    public static void menuCase4(int opsub){
        
        do{
                        opsub = menuAlugueres();
                        switch(opsub){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            case 9:
                                break;
                            case 0:
                                break;
                        }
                    }while(opsub != 0);
        
    }
    
    public static void menuCase5(int opsub){
        
        do{
            opsub = menuEStatisticas();
            switch(opsub){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
            }
        }while(opsub != 0);
        
    }
    
    public static void InserirTipoVeic(){
        
        String designacao = Consola.lerString("Insira a designacao do tipo de veiculo: ");
        String descricao = Consola.lerString("Insira a descricao do tipo de veiculo: ");
        double preco = Consola.lerDouble("Insira o precio deste tipo de veiculo: ", 0, 10000);
        
        TipoVeiculo_C tv = new TipoVeiculo_C(designacao, descricao, preco);
        
        gd.NovoTipoVeiculo(tv);
    }
    
    public static void InserirVeic(){
        int i;
        int numtipov;
        //Verificacao do numero do tipo de veiculo
        do{
            numtipov = Consola.lerInt("Insira o numero do tipo de veiculo: ", 1, 10);
            i = gd.VerifNumerotipoveic(numtipov);
            if(i == -1)
                System.out.println("Numero do tipo de veiculo nao existe!");
        }while(i == -1);
        
        int matricula = Consola.lerInt("Insira a matricula: ", 0, 999999999);
        int numpessoas = Consola.lerInt("Insira o numero de pessoas que o veiculo pode levar: ", 1, 50);
        String tipogas = Consola.lerString("Insira o tipo de gas: ");
        int quilometragem = Consola.lerInt("Insira o quilometragem atual", 0, 999999999);
        int capbaggagem = Consola.lerInt("Insira a capacidade de baggagem", 1, 50);
        int numalugueres = Consola.lerInt("Insira o numero de alugueres do veiculo: ", 0, 999999999);
        
        TipoVeiculo_C tv;
        tv = gd.ObterTipoVeicPorNum(numtipov);
        Veiculo_C v = new Veiculo_C(matricula, numpessoas, tipogas, quilometragem, capbaggagem, numalugueres, tv);
        gd.NovoVeiculo(v);
    }
    
    
    
    
    
    public static void InserirFunc(){
        
        int NIF = Consola.lerInt("NIF do funcionario: ", 0, 999999999);
        String nome = Consola.lerString("Insira o nome do funcionario: ");
        String morada = Consola.lerString("Insira a morada: ");
        int telefone = Consola.lerInt("Insira o telefone: ", 0, 999999999);
        String funcao = Consola.lerString("Qual e a funcao: ");
        
        Funcionario_C f = new Funcionario_C(NIF, nome, morada, telefone, funcao);
        
        gd.NovoFuncioanrio(f);
        
    }
    
    public static void ListarFunc(){
        
    }
    
    
}
