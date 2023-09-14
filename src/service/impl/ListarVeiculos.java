package src.service.impl;

import src.model.Veiculo;
import src.repository.VeiculosRepository;
import src.service.api.Listar;

import java.util.List;

public class ListarVeiculos implements Listar<Veiculo> {
    VeiculosRepository veiculosRepository = new VeiculosRepository();

    @Override
    public List<Veiculo> execute() {
        return veiculosRepository.findAll();
    }
}
