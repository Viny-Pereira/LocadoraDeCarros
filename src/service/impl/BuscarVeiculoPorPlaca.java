package src.service.impl;

import src.model.Veiculo;
import src.repository.VeiculosRepository;
import src.service.api.Buscar;

public class BuscarVeiculoPorPlaca implements Buscar<Veiculo> {
    private VeiculosRepository veiculosRepository = new VeiculosRepository();

    @Override
    public Veiculo execute(String placa) {
        return veiculosRepository.findByPlaca(placa);
    }
}
