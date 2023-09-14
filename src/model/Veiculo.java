package src.model;

public class Veiculo {
    private static int ultimoIdVeiculo = 0;
    private Integer id;
    private String placa;
    private TipoVeiculo tipoVeiculo;
    private Boolean isDisponivel;

    public Veiculo(String placa, TipoVeiculo tipoVeiculo) {
        this.id = ++ultimoIdVeiculo;
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
        this.isDisponivel = true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String TipoVeiculo() {
        return tipoVeiculo.tipoDeVeiculo();
    }

    public double valorDiaria() {
        return tipoVeiculo.valorDiaria();
    }

    public Boolean getDisponivel() {
        return isDisponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        isDisponivel = disponivel;
    }

    @Override
    public String toString() {
        return
                "ID: " + id +
                        "\nPlaca: " + placa + '\'' +
                        "\nTipo Veiculo: " + tipoVeiculo +
                        "\nEstá disponive Disponivel: " + isDisponivel;
    }
}
