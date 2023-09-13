package src.model;

public class CarroPequeno extends TipoVeiculo {
    @Override
    String tipoDeVeiculo() {
        return "Pequeno";
    }

    @Override
    double valorDiaria() {
        return 100d;
    }
}
