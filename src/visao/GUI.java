package visao;

import java.util.Scanner;

public class GUI {

    private Scanner scanner;

    public GUI() {

        this.scanner = new Scanner(System.in);
    }

    public int pegarOpcaoMenu() {
        System.out.println("Bem vindo ao Sistema de Cadastro de Carros");
        System.out.println("Operacoes:");
        System.out.println("1: Cadastrar novo carro");
        System.out.println("2: Listar carros cadastrados");
        System.out.println("3: Remover carro");
        System.out.println("4: Buscar carro");
        System.out.print("Digite sua opcao: ");

        return this.scanner.nextInt();
        
    }

}