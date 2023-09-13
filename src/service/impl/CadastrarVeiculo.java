package src.service.impl;

import src.model.Veiculo;
import src.repository.VeiculosRepository;
import src.service.api.Cadastrar;

public class CadastrarVeiculo implements Cadastrar<Veiculo> {
    private VeiculosRepository veiculosRepository;
    @Override
    public boolean execute(Veiculo veiculo) {
        if (veiculosRepository.findByPlaca(veiculo.getPlaca()) == null) {
            veiculosRepository.create(veiculo);
            return true;
        }
        return false;
    }
}
