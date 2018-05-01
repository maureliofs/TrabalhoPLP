package entidade;

public class Caminhao extends Veiculo {
    private int qtdeEixos;

    public Caminhao(int id, String marca, String modelo, int ano, String cor, int potencia, String tipoCombustivel, String placa, int qtdeEixos) {
        super(id, marca, modelo, ano, cor, potencia, tipoCombustivel, placa);
        setQtdeEixos(qtdeEixos);
    }

    public void setQtdeEixos(int qtdeEixos) {
        this.qtdeEixos = qtdeEixos;
    }

    public int getQtdeEixos() {
        return this.qtdeEixos;
    }
}