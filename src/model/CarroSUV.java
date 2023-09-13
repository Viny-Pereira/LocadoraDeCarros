package src.model;

public class CarroSUV extends TipoVeiculo {
    @Override
    String tipoDeVeiculo() {
        return "SUV";
    }

    @Override
    double valorDiaria() {
        return 200d;
    }
}
