package app;

import dao.ManipuladorDeArquivo;
import entidade.Veiculo;
import entidade.Carro;
import entidade.Moto;
import entidade.Camionete;
import entidade.Caminhao;
import visao.GUI;
import java.util.List;
import java.util.ArrayList;

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
                    removeVeiculo(this.gui.getRemoveInformacoes());
                    break;
                case 4:
                    buscaVeiculo(this.gui.getBuscaInformacoes());
                    break;
                case 99:
                    break;
                default:
                    this.gui.printarMensagem("# OPCAO INVALIDA!");
                    this.gui.tecleEnterParaContinuar();
                    break;
            }
        }
    }

    private void cadastraVeiculo() {
        switch(this.gui.cadastraVeiculo()) {
            case 1:
                List<String> informacoes = this.gui.getCadastraCarroInformacoes(); //polimorfismo(lista de string)
                this.manipuladorArquivo.salvaVeiculo(new Carro(
                    Integer.parseInt(informacoes.get(0)),
                    informacoes.get(1), 
                    informacoes.get(2),
                    Integer.parseInt(informacoes.get(3)), 
                    informacoes.get(4),
                    Integer.parseInt(informacoes.get(5)),
                    informacoes.get(6),
                    informacoes.get(7), 
                    Integer.parseInt(informacoes.get(8))
                ));
                this.gui.printarMensagem("# VEICULO CADASTRADO COM SUCESSO!");
                this.gui.tecleEnterParaContinuar();
                break;
            case 2:
                List<String> informacoesMoto = this.gui.getCadastraMotoInformacoes(); //polimorfismo(lista de string)
                this.manipuladorArquivo.salvaVeiculo(new Moto(
                    Integer.parseInt(informacoesMoto.get(0)),
                    informacoesMoto.get(1), 
                    informacoesMoto.get(2),
                    Integer.parseInt(informacoesMoto.get(3)), 
                    informacoesMoto.get(4),
                    Integer.parseInt(informacoesMoto.get(5)),
                    informacoesMoto.get(6),
                    informacoesMoto.get(7), 
                    Integer.parseInt(informacoesMoto.get(8))
                ));
                this.gui.printarMensagem("# VEICULO CADASTRADO COM SUCESSO!");
                this.gui.tecleEnterParaContinuar();
                break;
            case 3:
                List<String> informacoesCamionete = this.gui.getCadastraCamioneteInformacoes(); //polimorfismo(lista de string)
                this.manipuladorArquivo.salvaVeiculo(new Camionete(
                    Integer.parseInt(informacoesCamionete.get(0)),
                    informacoesCamionete.get(1), 
                    informacoesCamionete.get(2),
                    Integer.parseInt(informacoesCamionete.get(3)), 
                    informacoesCamionete.get(4),
                    Integer.parseInt(informacoesCamionete.get(5)),
                    informacoesCamionete.get(6),
                    informacoesCamionete.get(7), 
                    informacoesCamionete.get(8)
                ));
                this.gui.printarMensagem("# VEICULO CADASTRADO COM SUCESSO!");
                this.gui.tecleEnterParaContinuar();
                break;
            case 4:
                List<String> informacoesCaminhao = this.gui.getCadastraCaminhaoInformacoes(); //polimorfismo(lista de string)
                this.manipuladorArquivo.salvaVeiculo(new Caminhao(
                    Integer.parseInt(informacoesCaminhao.get(0)),
                    informacoesCaminhao.get(1), 
                    informacoesCaminhao.get(2),
                    Integer.parseInt(informacoesCaminhao.get(3)), 
                    informacoesCaminhao.get(4),
                    Integer.parseInt(informacoesCaminhao.get(5)),
                    informacoesCaminhao.get(6),
                    informacoesCaminhao.get(7), 
                    Integer.parseInt(informacoesCaminhao.get(8))
                ));
                this.gui.printarMensagem("# VEICULO CADASTRADO COM SUCESSO!");
                this.gui.tecleEnterParaContinuar();
                break;
        }
        
    }

    private void listaVeiculo() {
        List<Veiculo> veiculos = this.manipuladorArquivo.leVeiculos();
        System.out.println(veiculos.size());
        if (veiculos != null) { 
            for (Veiculo v:veiculos) {
                if (v instanceof Carro) {
                    this.gui.imprimeCarro((Carro) v);

                } else if (v instanceof Moto) {
                    this.gui.imprimeMoto((Moto) v);

                } else if (v instanceof Camionete) {
                    this.gui.imprimeCamionete((Camionete) v);

                } else if (v instanceof Caminhao){
                    this.gui.imprimeCaminhao((Caminhao) v);
                }
            }
            this.gui.printarMensagem("# VEICULOS LISTADOS COM SUCESSO!");
            this.gui.tecleEnterParaContinuar();
        }
    }

    private void removeVeiculo(int idProcurado) {
        List<Veiculo> veiculos = this.manipuladorArquivo.leVeiculos();
        for (int i=0; i<veiculos.size(); i++) {
            if (idProcurado == veiculos.get(i).getId()) {
                veiculos.remove(i);
            }
        }
        this.manipuladorArquivo.salvaVeiculo(veiculos);
        this.gui.printarMensagem("# VEICULO DE ID " + idProcurado + " REMOVIDO COM SUCESSO!");
        this.gui.tecleEnterParaContinuar();
    }

    private void buscaVeiculo(int idProcurado) {
        List<Veiculo> veiculos = this.manipuladorArquivo.leVeiculos();
        for (Veiculo veiculo : veiculos) {
            if (idProcurado == veiculo.getId()) {
                if (veiculo instanceof Carro) {
                    this.gui.imprimeCarro((Carro) veiculo);
                } else if (veiculo instanceof Caminhao) {
                    this.gui.imprimeCaminhao((Caminhao) veiculo);
                } else if (veiculo instanceof Moto) {
                    this.gui.imprimeMoto((Moto) veiculo);
                }else  if (veiculo instanceof Camionete) {
                    this.gui.imprimeCamionete((Camionete) veiculo);
                }
            }
        }
        this.gui.printarMensagem("# VEICULO DE ID " + idProcurado + " ENCONTRADO!");
        this.gui.tecleEnterParaContinuar();
    }
}
