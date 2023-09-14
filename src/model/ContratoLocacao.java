package src.model;

import java.time.LocalDateTime;

public class ContratoLocacao {
    private LocalDateTime dataAluguel;
    private LocalDateTime dataDevolucao;
    private Veiculo veiculo;
    private int idContrato;
    private int idUltimoContrato = 0;
    private Cliente cliente;

    public ContratoLocacao(LocalDateTime dataAluguel, LocalDateTime dataDevolucao, Veiculo veiculo, Cliente cliente) {
        this.idContrato = ++idUltimoContrato;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = null;
        this.veiculo = veiculo;
        this.cliente = cliente;
    }

    public LocalDateTime getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDateTime dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public int getIdUltimoContrato() {
        return idUltimoContrato;
    }

    public void setIdUltimoContrato(int idUltimoContrato) {
        this.idUltimoContrato = idUltimoContrato;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
