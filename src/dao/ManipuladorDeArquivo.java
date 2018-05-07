/*/* 
 * Trabalho de GCC198 - Paradigmas de Linguagens de Programação
 * Cadastro de Veículos 
 * Copyright 2018 by Marco Aurélio Ferreira de Sousa 
 * Classe responsavel por toda a manipulação do arquivo onde
 * sera guardado todo o banco de dados do programa.
 */

 package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import entidade.Veiculo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.BufferedReader;

public class ManipuladorDeArquivo implements Serializable{ //criando classe

    private static final long serialVersionUID = -5999520871774420561L;
    private File arquivoDeDados; //criando atributo
    private final String caminhoArquivoDeDados = "../data/data.bin";


    /**
     * Metodo responsavel por criar o arquivo onde
     * será salvo o banco de dados do programa
     */
    public ManipuladorDeArquivo() { //criando construtor da classe
        this.arquivoDeDados = new File(this.caminhoArquivoDeDados);
        if (!this.arquivoDeDados.exists()) {
            try {   
                this.arquivoDeDados = new File(this.caminhoArquivoDeDados);
                this.arquivoDeDados.createNewFile();
                iniciaArquivo();
            } catch (IOException e) {
                System.out.println(e.toString());
            } catch (Exception e) {
                System.out.println(e.toString());
            }
           
        }
    }

    /**
     * Metodo responsavel por iniciar o arquivo de dados
     */
    private void iniciaArquivo() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.caminhoArquivoDeDados));
            oos.writeObject(new ArrayList<Veiculo>());
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * Metodo responsavel por salvar no arquivo
     * o veiculo inserido pelo usuario
     * 
     * @param veiculo veiculo inserido
     */
    public void salvaVeiculo(Veiculo veiculo) {
        try {
            List<Veiculo> veiculosAtuais = leVeiculos();
            veiculosAtuais.add(veiculo);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.caminhoArquivoDeDados, false));
            oos.writeObject(veiculosAtuais);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * Metodo responsavel por salvar no arquivo
     * a lista de  veiculos inserido pelo usuario
     * 
     * @param veiculo lista de veiculos inseridos
     */
    public void salvaVeiculo(List<Veiculo> veiculo) { //sobrcarga de metodo salvaVeiculo, um recebe um objeto veiculo e o outros recebe uma lista de veiculos
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.caminhoArquivoDeDados, false));
            oos.writeObject(veiculo);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * Metodo responsavel por ler o arquivo 
     * e devolver para o usuário o veiculo buscado.
     * 
     * @return List<Veiculo> veiculos
     */
    public List<Veiculo> leVeiculos() {
        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        try {
            FileInputStream arq = new FileInputStream("../data/data.bin");
            ObjectInputStream loadArq = new ObjectInputStream(arq);
            while(arq.available() > 0) {
                veiculos = (ArrayList<Veiculo>) loadArq.readObject();
            }
            arq.close();
        } catch(EOFException e) {
            System.out.println(e.toString());
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
       return veiculos;
    }
}