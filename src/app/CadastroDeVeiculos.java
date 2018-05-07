/* 
 * Trabalho de GCC198 - Paradigmas de Linguagens de Programação
 * Cadastro de Veículos 
 * Copyright 2018 by Marco Aurélio Ferreira de Sousa 
 * Classe responsavel pelas operações ou comportamentos gerais dos veiculos 
 * (Cadastrar, Listar, Remover e Buscar).
 */

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
import utils.DataSistema;

public class CadastroDeVeiculos {

    private DataSistema dataSistema;
    private ManipuladorDeArquivo manipuladorArquivo;
    private GUI gui;

    public CadastroDeVeiculos() {
        this.manipuladorArquivo = new ManipuladorDeArquivo(); //instanciando o objeto manipuladorAquivo this.(atributo)
        this.gui = new GUI();
        this.dataSistema = new DataSistema();

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
    //verifica se dado um id existe um veiculo registrado com o mesmo valor
    private Boolean existeVeiculo(int id) {
        List<Veiculo> veiculosRegistrados = this.manipuladorArquivo.leVeiculos();
        if (veiculosRegistrados.size() != 0) { 
            for (Veiculo v: veiculosRegistrados) {
                if(v.getId() == id) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    private void cadastraVeiculo() {
        switch(this.gui.cadastraVeiculo()) {
            case 1: //veiculo for carro
                List<String> informacoes = this.gui.getCadastraCarroInformacoes(); //polimorfismo(lista de string)
                if (!existeVeiculo(Integer.parseInt(informacoes.get(0)))) { 
                    this.manipuladorArquivo.salvaVeiculo(new Carro(
                        Integer.parseInt(informacoes.get(0)),
                        informacoes.get(1), 
                        informacoes.get(2),
                        Integer.parseInt(informacoes.get(3)), 
                        informacoes.get(4),
                        Integer.parseInt(informacoes.get(5)),
                        informacoes.get(6),
                        informacoes.get(7), 
                        Integer.parseInt(informacoes.get(8)), 
                        this.dataSistema.returnOnlyDate()
                    ));
                    this.gui.printarMensagem("# VEICULO CADASTRADO COM SUCESSO!");
                    this.gui.tecleEnterParaContinuar();
                } else {
                    this.gui.printarMensagem("# VEICULO COM ID "+informacoes.get(0)+" JA ESTA REGISTRADO. FAVOR INSERIR UM ID NAO CADASTRADO" );
                    this.gui.tecleEnterParaContinuar();
                }
                break;
            case 2: //veiculo for moto
                List<String> informacoesMoto = this.gui.getCadastraMotoInformacoes(); //polimorfismo(lista de string)
                if (!existeVeiculo(Integer.parseInt(informacoesMoto.get(0)))) {
                    this.manipuladorArquivo.salvaVeiculo(new Moto(
                        Integer.parseInt(informacoesMoto.get(0)),
                        informacoesMoto.get(1), 
                        informacoesMoto.get(2),
                        Integer.parseInt(informacoesMoto.get(3)), 
                        informacoesMoto.get(4),
                        Integer.parseInt(informacoesMoto.get(5)),
                        informacoesMoto.get(6),
                        informacoesMoto.get(7), 
                        Integer.parseInt(informacoesMoto.get(8)),
                        this.dataSistema.returnOnlyDate()
                    ));
                    this.gui.printarMensagem("# VEICULO CADASTRADO COM SUCESSO!");
                    this.gui.tecleEnterParaContinuar();
                } else {
                    this.gui.printarMensagem("# VEICULO COM ID "+informacoesMoto.get(0)+" JA ESTA REGISTRADO. FAVOR INSERIR UM ID NAO CADASTRADO" );
                    this.gui.tecleEnterParaContinuar();
                }
                break;
            case 3: // veiculo for camionete
                List<String> informacoesCamionete = this.gui.getCadastraCamioneteInformacoes(); //polimorfismo(lista de string)
                if (!existeVeiculo(Integer.parseInt(informacoesCamionete.get(0)))) { 
                    this.manipuladorArquivo.salvaVeiculo(new Camionete(
                        Integer.parseInt(informacoesCamionete.get(0)),
                        informacoesCamionete.get(1), 
                        informacoesCamionete.get(2),
                        Integer.parseInt(informacoesCamionete.get(3)), 
                        informacoesCamionete.get(4),
                        Integer.parseInt(informacoesCamionete.get(5)),
                        informacoesCamionete.get(6),
                        informacoesCamionete.get(7), 
                        informacoesCamionete.get(8),
                        this.dataSistema.returnOnlyDate()
                    ));
                    this.gui.printarMensagem("# VEICULO CADASTRADO COM SUCESSO!");
                    this.gui.tecleEnterParaContinuar();
                } else {
                    this.gui.printarMensagem("# VEICULO COM ID "+informacoesCamionete.get(0)+" JA ESTA REGISTRADO. FAVOR INSERIR UM ID NAO CADASTRADO" );
                    this.gui.tecleEnterParaContinuar();
                }
                break;
            case 4: //veiculo for caminhão
                List<String> informacoesCaminhao = this.gui.getCadastraCaminhaoInformacoes(); //polimorfismo(lista de string)
                if (!existeVeiculo(Integer.parseInt(informacoesCaminhao.get(0)))) { 
                    this.manipuladorArquivo.salvaVeiculo(new Caminhao(
                        Integer.parseInt(informacoesCaminhao.get(0)),
                        informacoesCaminhao.get(1), 
                        informacoesCaminhao.get(2),
                        Integer.parseInt(informacoesCaminhao.get(3)), 
                        informacoesCaminhao.get(4),
                        Integer.parseInt(informacoesCaminhao.get(5)),
                        informacoesCaminhao.get(6),
                        informacoesCaminhao.get(7), 
                        Integer.parseInt(informacoesCaminhao.get(8)), 
                        this.dataSistema.returnOnlyDate()
                    ));
                    this.gui.printarMensagem("# VEICULO CADASTRADO COM SUCESSO!");
                    this.gui.tecleEnterParaContinuar();
                } else {
                    this.gui.printarMensagem("# VEICULO COM ID "+informacoesCaminhao.get(0)+" JA ESTA REGISTRADO. FAVOR INSERIR UM ID NAO CADASTRADO" );
                    this.gui.tecleEnterParaContinuar();
                }
                break;
        }
        
    }

    private void listaVeiculo() {
        List<Veiculo> veiculos = this.manipuladorArquivo.leVeiculos();
        if (veiculos.size() != 0) { 
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
            return ;
         } 
        this.gui.printarMensagem("# NAO EXISTE VEICULOS REGISTRADOS");
        this.gui.tecleEnterParaContinuar();
        return ;
        
    }

    private void removeVeiculo(int idProcurado) {
        List<Veiculo> veiculos = this.manipuladorArquivo.leVeiculos();
        for (int i=0; i<veiculos.size(); i++) {
            if (idProcurado == veiculos.get(i).getId()) {
                veiculos.remove(i);
                this.manipuladorArquivo.salvaVeiculo(veiculos);
                this.gui.printarMensagem("# VEICULO DE ID " + idProcurado + " REMOVIDO COM SUCESSO!");
                this.gui.tecleEnterParaContinuar();
                return ;
            }
        }
        
        this.gui.printarMensagem("# VEICULO DE ID " + idProcurado + " NÃO ENCONTRADO, FAVOR INFORMAR UM ID VALIDO!");
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
                this.gui.printarMensagem("# VEICULO DE ID " + idProcurado + " ENCONTRADO!");
                this.gui.tecleEnterParaContinuar();
                return ;
            }
        }
        this.gui.printarMensagem("# VEICULO DE ID " + idProcurado + " NAO ENCONTRADO!");
        this.gui.tecleEnterParaContinuar();
    }
}
