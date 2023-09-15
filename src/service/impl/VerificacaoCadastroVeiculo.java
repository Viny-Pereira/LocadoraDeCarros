package src.service.impl;

import src.model.Veiculo;
import src.repository.VeiculosRepository;
import src.service.api.VerificacaoCadastro;

public class VerificacaoCadastroVeiculo implements VerificacaoCadastro<Veiculo> {
    private VeiculosRepository veiculosRepository = new VeiculosRepository();

    @Override
    public boolean execute(Veiculo veiculo) {
        if (veiculosRepository.findByPlaca(veiculo.getPlaca()) == null) {
            return true;
        }
        return false;
    }
}
