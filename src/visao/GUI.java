package visao;

import java.util.Scanner;

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

        return this.scanner.nextInt();
        
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
}