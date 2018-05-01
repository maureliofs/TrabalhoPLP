package entidade;

public class Carro extends Veiculo {
    private int qtdePortas;

    public Carro(int id, String marca, String modelo, int ano, String cor, int potencia, String tipoCombustivel, String placa, int qtdePortas) {
        super(id, marca, modelo, ano, cor, potencia, tipoCombustivel, placa);
        setQtdePortas(qtdePortas);
    }

    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }

    public int getQtdePortas() {
        return this.qtdePortas;
    }
}