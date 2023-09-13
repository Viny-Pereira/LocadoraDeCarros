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
}
