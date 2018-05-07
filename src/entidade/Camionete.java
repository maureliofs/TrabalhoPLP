/* 
 * Trabalho de GCC198 - Paradigmas de Linguagens de Programação
 * Cadastro de Veículos 
 * Copyright 2018 by Marco Aurélio Ferreira de Sousa 
 * Classe responsavel por descrever a sub classe Camionete e
 * usando o conceito de herança para herdar os atributos da
 * classe pai (Veiculo), além de implementar seus atributos especificos.
 */

package entidade;

public class Camionete extends Veiculo {

    /**
     * Atributo que descreve o valor referente
     * ao tipo de cabine da camionete
     */
    private String tipoCabine;

     /**
     * Metodo que define os atributos do tipo Camionete
     * 
     * @param id Id da camionete para registro.
     * @param marca marca da camionete
     * @param modelo modelo da camionete
     * @param ano ano de lançamento da camionete
     * @param cor cor da camionete
     * @param potencia potencia da camionete em cv
     * @param tipoCombustivel tipo de combustivel da camionete
     * @param placa placa da camionete
     * @param tipoCabine tipo da cabine da camionete (simples ou dupla)
     */
    public Camionete(int id, String marca, String modelo, int ano, String cor, int potencia, String tipoCombustivel, String placa, String tipoCabine, String data) {
        super(id, marca, modelo, ano, cor, potencia, tipoCombustivel, placa, data);
        setTipoCabine(tipoCabine);
    }

    /**
     * método usado para guardar o valor referente ao
     * tipo de cabine da camionete
     * 
     * @param tipoCabine tipo de cabine da camionete
     */
    public void setTipoCabine(String tipoCabine) {
        this.tipoCabine = tipoCabine;
    }

    /**
     * Metodo acessador do estado do atributo
     * tipoCabine.
     * 
     * @return String Valor tipoCabine
     */
    public String getTipoCabine() {
        return this.tipoCabine;
    }
}