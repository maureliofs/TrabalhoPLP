package app;

import dao.ManipuladorDeArquivo;
import visao.GUI;

public class CadastroDeCarros {

    private ManipuladorDeArquivo manipuladorArquivo;
    private GUI gui;

    public CadastroDeCarros() {
        this.manipuladorArquivo = new ManipuladorDeArquivo(); //instanciando o objeto manipuladorAquivo this.(atributo)
        this.gui = new GUI();

    }

    public void execute() { //metodo para executar
        int opcao = this.gui.pegarOpcaoMenu();
    }

}
