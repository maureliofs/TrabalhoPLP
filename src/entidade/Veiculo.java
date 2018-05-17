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
 * Interface do java que transforma objetos alocados em heap para formato de stream binario.
 */
public abstract class Veiculo implements Serializable {
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