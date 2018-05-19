/*/* 
 * Trabalho de GCC198 - Paradigmas de Linguagens de Programação
 * Cadastro de Veículos 
 * Copyright 2018 by Marco Aurélio Ferreira de Sousa 
 * Classe responsável por pegar a data do sistema
 * e salvar no arquivo como data do cadastro.
 */
package utils;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Esta classe descreve um objeto DataSistema. É usadada pra 
 * gerar uma string no formato de data.
 * 
 * @author Marco Aurelio Ferreira de Sousa
 * @version 1.0
 */
public class DataSistema {

    /**
     * Atributo da classe DateFormat
     */
    private DateFormat dateFormat;

    /**
     * Atributo classe Date
     */
	private Date date;

    /**
     * Contrutor do DataSistema. Instancia a data e o
     * DateFormat
     */
    public DataSistema() {
        date = new Date();
        dateFormat = new SimpleDateFormat("dd-MM-yyyy(HH:mm:ss)");
    }

    /**
     * Esse metodo retorna o formato da data formatada
     * 
     * @return String String date formatted.
     */
    public String returnOnlyDate() {
        dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date).toString();
    }

    
}