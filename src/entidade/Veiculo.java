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

public abstract class Veiculo implements Serializable { //interface do java que transforma objetos alocados em heap para formato de stream binario.
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

    public void setMarca(String marca) { //modificando o estado do atributo
        this.marca = marca;
    }

    public String getMarca() { //retornando o estado dos atributos
        return this.marca;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }


    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return this.potencia;
    }


    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataCadastro() {
        return this.dataCadastro;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    //sobreescrita do metodo toString da classe object
    @Override
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