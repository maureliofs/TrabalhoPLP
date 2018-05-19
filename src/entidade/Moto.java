/* 
 * Trabalho de GCC198 - Paradigmas de Linguagens de Programação
 * Cadastro de Veículos 
 * Copyright 2018 by Marco Aurélio Ferreira de Sousa 
 * Classe responsavel por descrever a sub classe Moto e
 * usando o conceito de herança para herdar os atributos da
 * classe pai (Veiculo), além de implementar seus atributos especificos.
 */

package entidade;


/**
 * Classe responsavel por descrever a sub classe Moto e
 * usando o conceito de herança para herdar os atributos da
 * classe pai (Veiculo), além de implementar seus atributos especificos.
 * 
 * @author Marco Aurelio Ferreira de Sousa
 * @version 1.0
 */
public class Moto extends Veiculo {

    /**
     * Atributo que descreve o valor referente
     * ao numero de cilindradas da moto
     */
    private int cilindradas;

    /**
     * Metodo que define os atributos do tipo Moto
     * 
     * @param id Id da moto para registro.
     * @param marca marca da moto
     * @param modelo modelo da moto
     * @param ano ano de lançamento da moto
     * @param cor cor da moto
     * @param potencia potencia da moto em cv
     * @param tipoCombustivel tipo de combustivel da moto
     * @param placa placa da moto
     * @param cilindradas numero referente às cilindradas da moto
     * @param data data do cadastro da moto
     */
    public Moto(int id, String marca, String modelo, int ano, String cor, int potencia, String tipoCombustivel, String placa, int cilindradas, String data) {
        super(id, marca, modelo, ano, cor, potencia, tipoCombustivel, placa, data);
        setCilindradas(cilindradas);
    }

    /**
     * método usado para guardar o valor referente ao
     * numero de cilindradas da moto
     * 
     * @param cilindradas numero de cilindradas da moto
     */
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    /**
     * Metodo acessador do estado do atributo
     * cilindradas.
     * 
     * @return int Valor cilindradas
     */
    public int getCilindradas() {
        return this.cilindradas;
    }
}