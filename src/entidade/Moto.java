package entidade;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, String cor, int potencia, String tipoCombustivel, String placa, int cilindradas) {
        super(marca, modelo, ano, cor, potencia, tipoCombustivel, placa);
        setCilindradas(cilindradas);
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return this.cilindradas;
    }
}