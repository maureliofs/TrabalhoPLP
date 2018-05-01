package entidade;

public class Camionete extends Veiculo {
    private String tipoCabine;

    public Camionete(int id, String marca, String modelo, int ano, String cor, int potencia, String tipoCombustivel, String placa, String tipoCabine) {
        super(id, marca, modelo, ano, cor, potencia, tipoCombustivel, placa);
        setTipoCabine(tipoCabine);
    }

    public void setTipoCabine(String tipoCabine) {
        this.tipoCabine = tipoCabine;
    }

    public String getTipoCabine() {
        return this.tipoCabine;
    }
}