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

    private File arquivoDeDados; //criando atributo
    private final String caminhoArquivoDeDados = "../data/data.bin";

    public ManipuladorDeArquivo() { //criando construtor da classe
        this.arquivoDeDados = new File(this.caminhoArquivoDeDados);
        if (!this.arquivoDeDados.exists()) {
            try {   
                this.arquivoDeDados = new File(this.caminhoArquivoDeDados);
                this.arquivoDeDados.createNewFile();
                iniciaArquivo();
            } catch (IOException e) {

            } catch (Exception e) {

            }
           
        }
    }

    private void iniciaArquivo() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.caminhoArquivoDeDados));
            oos.writeObject(new ArrayList<Veiculo>());
            oos.flush();
            oos.close();
        } catch (Exception e) {

        }
    }
    public void salvaVeiculo(Veiculo veiculo) {
        try {
            List<Veiculo> veiculosAtuais = leVeiculos();
            veiculosAtuais.add(veiculo);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.caminhoArquivoDeDados, false));
            oos.writeObject(veiculosAtuais);
            oos.flush();
            oos.close();
        } catch (Exception e) {

        }
    }
    public void salvaVeiculo(List<Veiculo> veiculo) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.caminhoArquivoDeDados, false));
            oos.writeObject(veiculo);
            oos.flush();
            oos.close();
        } catch (Exception e) {

        }
    }

    public List<Veiculo> leVeiculos() {
        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        try
        {
            FileInputStream arq = new FileInputStream("../data/data.bin");
            ObjectInputStream loadArq = new ObjectInputStream(arq);
            while(arq.available() > 0)
            {
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