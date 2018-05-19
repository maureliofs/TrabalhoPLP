/* 
 * Trabalho de GCC198 - Paradigmas de Linguagens de Programação
 * Cadastro de Veículos 
 * Copyright 2018 by Marco Aurélio Ferreira de Sousa 
 * Classe responsável por descrever a super classe veiculo de uma 
 * forma geral e seus atributos, ler do teclado as informações 
 * inseridas pelo usuário e retornar para o sistema.
 */

package entidade;

import java.io.Serializable; //condição para que o objeto seja transformado em binario no arquivo

/**
 * Classe responsável por descrever a super classe veiculo de uma 
 * forma geral e seus atributos, ler do teclado as informações 
 * inseridas pelo usuário e retornar para o sistema.
 * 
 * @author Marco Aurelio Ferreira de Sousa
 * @version 1.0
 */
public abstract class Veiculo implements Serializable { //Interface do java que transforma objetos alocados em heap para formato de stream binario.
    private static final long serialVersionUID = -5999520871774420561L;
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int potencia;
    private String tipoCombustivel;
    private String placa;
    private String dataCadastro;
    
    /**
     * Instânciando o objeto Veiculo e seus atributos.
     * 
     * @param id Id do veiculo
     * @param marca marca do veiculo
     * @param modelo modelo do veiculo
     * @param ano ano de lançamento do veiculo
     * @param cor cor do veiculo
     * @param potencia potencia do veiculo em cv
     * @param tipoCombustivel tipo de combustivel do veiculo
     * @param placa placa do veiculo
     * @param data data do cadastro do veiculo
     */
    public Veiculo(int id, String marca, String modelo, int ano, String cor, int potencia, String tipoCombustivel, String placa, String data) {
        setId(id);
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setCor(cor);
        setPotencia(potencia);
        setTipoCombustivel(tipoCombustivel);
        setPlaca(placa);
        setDataCadastro(data);
    }
    /**
     * Método pra modificar o estado do atributo marca
     * 
     * @param marca marca do veiculo
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Método que retorna o estado do atributo marca
     * 
     * @return String marca
     */
    public String getMarca() {
        return this.marca;
    }

    /**
     * Método pra modificar o estado do atributo modelo
     * 
     * @param modelo modelo do veiculo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * Método que retorna o estado do atributo modelo
     * 
     * @return String modelo
     */
    public String getModelo() {
        return this.modelo;
    }

    /**
     * Método pra modificar o estado do atributo ano
     * 
     * @param ano ano do veiculo
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
    /**
     * Método que retorna o estado do atributo ano
     * 
     * @return int ano
     */
    public int getAno() {
        return this.ano;
    }

    /**
     * Método pra modificar o estado do atributo cor
     * 
     * @param cor cor do veiculo
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    /**
     * Método que retorna o estado do atributo cor
     * 
     * @return String cor
     */
    public String getCor() {
        return this.cor;
    }

    /**
     * Método pra modificar o estado do atributo potencia
     * 
     * @param potencia potencia do veiculo
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    /**
     * Método que retorna o estado do atributo potencia
     * 
     * @return int potencia
     */
    public int getPotencia() {
        return this.potencia;
    }

    /**
     * Método pra modificar o estado do atributo tipoCombustivel
     * 
     * @param tipoCombustivel tipo de combustivel do veiculo
     */
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    /**
     * Método que retorna o estado do atributo tipoCombustivel
     * 
     * @return String tipoCombustivel
     */
    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }

    /**
     * Método pra modificar o estado do atributo placa
     * 
     * @param placa placa do veiculo
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    /**
     * Método que retorna o estado do atributo placa
     * 
     * @return String placa
     */
    public String getPlaca() {
        return this.placa;
    }

    /**
     * Método pra modificar o estado do atributo dataCadastro
     * 
     * @param dataCadastro data de cadastro do veiculo
     */
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    /**
     * Método que retorna o estado do atributo dataCadastro
     * 
     * @return String dataCadastro
     */
    public String getDataCadastro() {
        return this.dataCadastro;
    }

    /**
     * Método pra modificar o estado do atributo id
     * 
     * @param id id do veiculo
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Método que retorna o estado do atributo id
     * 
     * @return int id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Sobrescrita do metodo toString da classe Object
     */
    public String toString() {
        return this.hashCode() +
        " " + getId() + 
        " " + getMarca() + 
        " " + getModelo() + 
        " " + getAno() +
        " " + getCor() +
        " " + getPotencia() +
        " " + getTipoCombustivel() +
        " " + getPlaca() +
        " " + getDataCadastro();
    }
}