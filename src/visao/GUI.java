package visao;

import java.util.Scanner;

import entidade.Veiculo;
import entidade.Carro;
import entidade.Moto;
import entidade.Camionete;
import entidade.Caminhao;

import java.util.List;
import java.util.ArrayList;

public class GUI {

    private Scanner scanner;

    public GUI() {

        this.scanner = new Scanner(System.in);
    }

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

    public void printarMensagem(String mensagem) { //metodo para printar mensagem
        System.out.println(mensagem);
    }

    public int cadastraVeiculo() {
        clean();
        System.out.println("Cadastrar novo veiculo:");
        System.out.print("Tipo do Veiculo(1-Carro; 2-Moto; 3-Camionete; 4-Caminhao;): ");
        return this.scanner.nextInt();
    }

    private void clean() { //metodo para limpar o console
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

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

    public int getRemoveInformacoes() {
        clean();
        System.out.println("Removendo Veiculo...");

        System.out.print("Digite o ID: ");
        return Integer.parseInt(this.scanner.next());

    }

    public int getBuscaInformacoes() {
        clean();
        System.out.println("Buscando Veiculo...");

        System.out.print("Digite o ID: ");
        return Integer.parseInt(this.scanner.next());

    }

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

    public void tecleEnterParaContinuar(){
        System.out.println("Tecle ENTER para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}