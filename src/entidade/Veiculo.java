package entidade;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int potencia;
    private String tipoCombustivel;
    private String placa;
    private String dataCadastro;

    public Veiculo(String marca, String modelo, int ano, String cor, int potencia, String tipoCombustivel, String placa) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setCor(cor);
        setPotencia(potencia);
        setTipoCombustivel(tipoCombustivel);
        setPlaca(placa);
        setDataCadastro("kkkk");
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }


    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return this.potencia;
    }


    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return this.placa;
    }


    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataCadastro() {
        return this.dataCadastro;
    }
}