/* 
 * Trabalho de GCC198 - Paradigmas de Linguagens de Programação
 * Cadastro de Veículos 
 * Copyright 2018 by Marco Aurélio Ferreira de Sousa 
 * Classe responsável pela execução do software.
 * Contém o método main para ser chamado executando toda a computação.
 */

package app;
/**
 * Classe responsável pela execução do software.
 * Contém o método main para ser chamado executando toda a computação.
 * 
 * @author Marco Aurelio Ferreira de Sousa
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        CadastroDeVeiculos cdc = new CadastroDeVeiculos(); //chama o construtor
        cdc.execute(); //chamo a execução
    }

}