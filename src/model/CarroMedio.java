package src.model;

public class CarroMedio extends TipoVeiculo{
    @Override
    String tipoDeVeiculo() {
        return "Médio";
    }

    @Override
    double valorDiaria() {
        return 150d;
    }

    @Override
    public String toString() {
        return "Carro Medio";
    }
}
