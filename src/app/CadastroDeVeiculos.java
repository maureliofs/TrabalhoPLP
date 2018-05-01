package app;

import dao.ManipuladorDeArquivo;
import visao.GUI;

public class CadastroDeVeiculos {

    private ManipuladorDeArquivo manipuladorArquivo;
    private GUI gui;

    public CadastroDeVeiculos() {
        this.manipuladorArquivo = new ManipuladorDeArquivo(); //instanciando o objeto manipuladorAquivo this.(atributo)
        this.gui = new GUI();

    }

    public void execute() { //metodo para executar

        int opcao = 0;
        while(opcao != 99) {
            opcao = this.gui.pegarOpcaoMenu();
            switch(opcao) {
                case 1:
                    cadastraVeiculo();
                    break;
                case 2:
                    listaVeiculo();
                    break;
                case 3:
                    removeVeiculo();
                    break;
                case 4:
                    buscaVeiculo();
                    break;
                case 99:
                    break;
                default:
                    this.gui.printarMensagem("Opcao Invalida.");
                    break;
            }
        }
    }

    private void cadastraVeiculo() {
        switch(this.gui.cadastraVeiculo()) {
            case 1:
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        
    }

    private void listaVeiculo() {
        
    }

    private void removeVeiculo() {
        
    }

    private void buscaVeiculo() {
        
    }
}
