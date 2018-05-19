/* 
 * Trabalho de GCC198 - Paradigmas de Linguagens de Programação
 * Cadastro de Veículos 
 * Copyright 2018 by Marco Aurélio Ferreira de Sousa 
 * Classe responsavel por descrever toda a interface para o usuario. 
 */

 package visao;

import java.util.Scanner;

import entidade.Veiculo;
import entidade.Carro;
import entidade.Moto;
import entidade.Camionete;
import entidade.Caminhao;

import java.util.List;
import java.util.ArrayList;

/**
 * Classe responsável por toda a interface do programa
 * 
 * @author Marco Aurelio Ferreira de Sousa
 * @version 1.0
 */
public class GUI {

    private Scanner scanner;

    public GUI() {

        this.scanner = new Scanner(System.in);
    }
    /**
     * Método responsável por pegar a opção do usuário
     * referente às operações disponíveis.
     * 
     * @return Integer
     */
    public int pegarOpcaoMenu() {
        clean();
        System.out.println("Bem vindo ao Sistema de Cadastro de Veiculos");
        System.out.println("Operacoes:");
        System.out.println("1: Cadastrar novo veiculo");
        System.out.println("2: Listar veiculos cadastrados");
        System.out.println("3: Remover veiculo");
        System.out.println("4: Buscar veiculo");
        System.out.println("99: Sair");
        System.out.print("Digite sua opcao: ");

        return Integer.parseInt(this.scanner.next());
        
    }

    /**
     * Método para printar na tela
     * 
     * @param mensagem texto à ser printado na tela
     */
    public void printarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    /**
     * Método para cadastrar um veículo e mostrar ao usuário
     * os tipos disponíveis de veiculo.
     * 
     * @return Integer
     */
    public int cadastraVeiculo() {
        clean();
        System.out.println("Cadastrar novo veiculo:");
        System.out.print("Tipo do Veiculo(1-Carro; 2-Moto; 3-Camionete; 4-Caminhao;): ");
        return this.scanner.nextInt();
    }

    /**
     * Método responsável por limpar o console
     */
    private void clean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Método responsável por receber as informações 
     * inseridas pelo usuário ao cadastrar um Veiculo
     * do tipo carro.
     * 
     * @return List
     */
    public List<String> getCadastraCarroInformacoes() {
        List<String> informacoes = new ArrayList<String>();
        clean();
        System.out.println("Adicionando Veiculo...");

        System.out.print("Digite o ID: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a marca: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite o modelo: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite o ano: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a cor: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a potencia em cv: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite o tipo de combustivel: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a placa: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a quantidade de portas: ");
        informacoes.add(this.scanner.next());

        return informacoes;

    }

    /**
     * Método responsável por receber as informações 
     * inseridas pelo usuário ao cadastrar um Veiculo
     * do tipo moto.
     * 
     * @return List
     */
    public List<String> getCadastraMotoInformacoes() {
        List<String> informacoes = new ArrayList<String>();
        clean();
        System.out.println("Adicionando Moto...");

        System.out.print("Digite o ID: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a marca: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite o modelo: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite o ano: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a cor: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a potencia em cv: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite o tipo de combustivel: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a placa: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a quantidade de cilindradas: ");
        informacoes.add(this.scanner.next());

        return informacoes;

    }

    /**
     * Método responsável por receber as informações 
     * inseridas pelo usuário ao cadastrar um Veiculo
     * do tipo camionete.
     * 
     * @return List
     */
    public List<String> getCadastraCamioneteInformacoes() {
        List<String> informacoes = new ArrayList<String>();
        clean();
        System.out.println("Adicionando Camionete...");

        System.out.print("Digite o ID: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a marca: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite o modelo: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite o ano: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a cor: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a potencia em cv: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite o tipo de combustivel: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a placa: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite o tipo de cabine: ");
        informacoes.add(this.scanner.next());

        return informacoes;

    }

    /**
     * Método responsável por receber as informações 
     * inseridas pelo usuário ao cadastrar um Veiculo
     * do tipo caminhão.
     * 
     * @return List
     */
    public List<String> getCadastraCaminhaoInformacoes() {
        List<String> informacoes = new ArrayList<String>();
        clean();
        System.out.println("Adicionando Caminhao...");

        System.out.print("Digite o ID: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a marca: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite o modelo: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite o ano: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a cor: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a potencia em cv: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite o tipo de combustivel: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a placa: ");
        informacoes.add(this.scanner.next());

        System.out.print("Digite a quantidade de eixos: ");
        informacoes.add(this.scanner.next());

        return informacoes;

    }

    /**
     * Método responsável por apagar determinado veiculo
     * usando o id do mesmo
     * 
     * @return Integer
     */
    public int getRemoveInformacoes() {
        clean();
        System.out.println("Removendo Veiculo...");

        System.out.print("Digite o ID: ");
        return Integer.parseInt(this.scanner.next());

    }

    /**
     * Método responsável por buscar determinado veiculo
     * usando o id do mesmo
     * 
     * @return Integer
     */
    public int getBuscaInformacoes() {
        clean();
        System.out.println("Buscando Veiculo...");

        System.out.print("Digite o ID: ");
        return Integer.parseInt(this.scanner.next());

    }

    /**
     * Método responsável por imprimir as informações 
     * que foram cadastradas do Veiculo tipo carro.
     * 
     * @param carro veiculo tipo carro
     */
    public void imprimeCarro(Carro carro) {
        System.out.println("");
        System.out.println("ID: " + carro.getId());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Potencia: " + carro.getPotencia());
        System.out.println("Tipo do Combustivel: " + carro.getTipoCombustivel());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Data: " + carro.getDataCadastro());
        System.out.println("Quantidade de Portas: " + carro.getQtdePortas());
        System.out.println("+--------------------------------------------------------+");
    }

    /**
     * Método responsável por imprimir as informações 
     * que foram cadastradas do Veiculo tipo moto.
     * 
     * @param moto veiculo tipo moto
     */
    public void imprimeMoto(Moto moto) {
        System.out.println("");
        System.out.println("ID: " + moto.getId());
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Potencia: " + moto.getPotencia());
        System.out.println("Tipo do Combustivel: " + moto.getTipoCombustivel());
        System.out.println("Placa: " + moto.getPlaca());
        System.out.println("Data: " + moto.getDataCadastro());
        System.out.println("Cilindradas: " + moto.getCilindradas());
        System.out.println("+--------------------------------------------------------+");
    }

    /**
     * Método responsável por imprimir as informações 
     * que foram cadastradas do Veiculo tipo camionete.
     * 
     * @param camionete veiculo tipo camionete
     */
    public void imprimeCamionete(Camionete camionete) {
        System.out.println("");
        System.out.println("ID: " + camionete.getId());
        System.out.println("Marca: " + camionete.getMarca());
        System.out.println("Modelo: " + camionete.getModelo());
        System.out.println("Ano: " + camionete.getAno());
        System.out.println("Cor: " + camionete.getCor());
        System.out.println("Potencia: " + camionete.getPotencia());
        System.out.println("Tipo do Combustivel: " + camionete.getTipoCombustivel());
        System.out.println("Placa: " + camionete.getPlaca());
        System.out.println("Data: " + camionete.getDataCadastro());
        System.out.println("Cabine: " + camionete.getTipoCabine());
        System.out.println("+--------------------------------------------------------+");
    }

    /**
     * Método responsável por imprimir as informações 
     * que foram cadastradas do Veiculo tipo caminhao.
     * 
     * @param caminhao veiculo tipo caminhao
     */
    public void imprimeCaminhao(Caminhao caminhao) {
        System.out.println("");
        System.out.println("ID: " + caminhao.getId());
        System.out.println("Marca: " + caminhao.getMarca());
        System.out.println("Modelo: " + caminhao.getModelo());
        System.out.println("Ano: " + caminhao.getAno());
        System.out.println("Cor: " + caminhao.getCor());
        System.out.println("Potencia: " + caminhao.getPotencia());
        System.out.println("Tipo do Combustivel: " + caminhao.getTipoCombustivel());
        System.out.println("Placa: " + caminhao.getPlaca());
        System.out.println("Data: " + caminhao.getDataCadastro());
        System.out.println("Cabine: " + caminhao.getQtdeEixos());
        System.out.println("+--------------------------------------------------------+");
    }

    /**
     * Método responsável por pedir ao usuário para teclar enter
     * caso queira fazer outra operação no sistema.
     */
    public void tecleEnterParaContinuar(){
        System.out.println("Tecle ENTER para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}