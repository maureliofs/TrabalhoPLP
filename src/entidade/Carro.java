/* 
 * Trabalho de GCC198 - Paradigmas de Linguagens de Programação
 * Cadastro de Veículos 
 * Copyright 2018 by Marco Aurélio Ferreira de Sousa 
 * Classe responsavel por descrever a sub classe Carro e
 * usando o conceito de herança para herdar os atributos da
 * classe pai (Veiculo), além de implementar seus atributos especificos.
 */

package entidade;

/**
 * Classe responsavel por descrever a sub classe Carro e
 * usando o conceito de herança para herdar os atributos da
 * classe pai (Veiculo), além de implementar seus atributos especificos.
 * 
 * @author Marco Aurelio Ferreira de Sousa
 * @version 1.0
 */
public class Carro extends Veiculo {

    /**
     * Atributo que descreve quantidade de portas
     * do carro.
     */
    private int qtdePortas;

    /**
     * Metodo que define os atributos do tipo Carro
     * 
     * @param id Id do carro para registro.
     * @param marca marca do carro
     * @param modelo modelo do carro
     * @param ano ano de lançamento do carro
     * @param cor cor do carro
     * @param potencia potencia do carro em cv
     * @param tipoCombustivel tipo de combustivel do carro
     * @param placa placa do carro
     * @param qtdePortas quantidade de portas que o carro possui
     * @param data data do cadastro do carro
     */
    public Carro(int id, String marca, String modelo, int ano, String cor, int potencia, String tipoCombustivel, String placa, int qtdePortas, String data) {
        super(id, marca, modelo, ano, cor, potencia, tipoCombustivel, placa, data);
        setQtdePortas(qtdePortas);
    }

    /**
     * método usado para guardar o valor referente ao
     * numero de portas do carro
     * 
     * @param qtdePortas quantidade de portas do carro
     */
    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }

    /**
     * Metodo acessador do estado do atributo
     * qtdePortas.
     * 
     * @return int Valor qtdePortas
     */
    public int getQtdePortas() {
        return this.qtdePortas;
    }
}