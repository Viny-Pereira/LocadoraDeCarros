package src.service.impl;

import src.model.Veiculo;
import src.repository.VeiculosRepository;
import src.service.api.Alterar;

public class AlterarVeiculo implements Alterar<Veiculo> {
    private VeiculosRepository veiculosRepository = new VeiculosRepository();

    @Override
    public boolean execute(Veiculo veiculo) {
        if (veiculosRepository.findById(veiculo.getId()) != null) {
            veiculosRepository.update(veiculo);
            return true;
        }
        return false;
    }

}
