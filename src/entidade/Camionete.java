package entidade;

public class Camionete extends Veiculo {
    private String tipoCabine;

    public Camionete(String marca, String modelo, int ano, String cor, int potencia, String tipoCombustivel, String placa, String tipoCabine) {
        super(marca, modelo, ano, cor, potencia, tipoCombustivel, placa);
        setTipoCabine(tipoCabine);
    }

    public void setTipoCabine(String tipoCabine) {
        this.tipoCabine = tipoCabine;
    }

    public String getTipoCabine() {
        return this.tipoCabine;
    }
}