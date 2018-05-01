package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.BufferedReader;

public class ManipuladorDeArquivo { //criando classe

    private File arquivoDeDados; //criando atributo
    private final String caminhoArquivoDeDados = "../data/data.bin";

    public ManipuladorDeArquivo() { //criando construtor da classe
        this.arquivoDeDados = new File(this.caminhoArquivoDeDados);
        if (!this.arquivoDeDados.exists()) {
            try {
                this.arquivoDeDados = new File(this.caminhoArquivoDeDados);
                this.arquivoDeDados.createNewFile();
            } catch (IOException e) {

            } catch (Exception e) {
                
            }
           
        }
    }
}