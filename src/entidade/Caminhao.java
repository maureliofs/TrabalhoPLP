/* 
 * Trabalho de GCC198 - Paradigmas de Linguagens de Programação
 * Cadastro de Veículos 
 * Copyright 2018 by Marco Aurélio Ferreira de Sousa 
 * Classe responsavel por descrever a sub classe Caminhão e
 * usando o conceito de herança para herdar os atributos da
 * classe pai (Veiculo), além de implementar seus atributos especificos.
 */

package entidade;


/**
 * Classe responsavel por descrever a sub classe Caminhao e
 * usando o conceito de herança para herdar os atributos da
 * classe pai (Veiculo), além de implementar seus atributos especificos.
 * 
 * @author Marco Aurelio Ferreira de Sousa
 * @version 1.0
 */
public class Caminhao extends Veiculo {

    /**
     * Atributo que descreve o valor referente
     * ao numero de eixos do caminhão
     */
    private int qtdeEixos;

     /**
     * Metodo que define os atributos do tipo Caminhão
     * 
     * @param id Id do caminhão para registro.
     * @param marca marca do caminhão
     * @param modelo modelo do caminhão
     * @param ano ano de lançamento do caminhão
     * @param cor cor do caminhão
     * @param potencia potencia do caminhão em cv
     * @param tipoCombustivel tipo de combustivel do caminhão
     * @param placa placa do caminhão
     * @param qtdeEixos numero referente às quantidade de eixos do caminhão
     * @param data data do cadastro do caminhao
     */
    public Caminhao(int id, String marca, String modelo, int ano, String cor, int potencia, String tipoCombustivel, String placa, int qtdeEixos, String data) {
        super(id, marca, modelo, ano, cor, potencia, tipoCombustivel, placa, data);
        setQtdeEixos(qtdeEixos);
    }

    /**
     * método usado para guardar o valor referente ao
     * numero de eixos do caminhão
     * 
     * @param qtdeEixos numero de eixos do caminhão
     */
    public void setQtdeEixos(int qtdeEixos) {
        this.qtdeEixos = qtdeEixos;
    }

    /**
     * Metodo acessador do estado do atributo
     * quantidade de eixos.
     * 
     * @return int Valor qtdeEixos
     */
    public int getQtdeEixos() {
        return this.qtdeEixos;
    }
}