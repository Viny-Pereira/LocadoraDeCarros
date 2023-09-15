package src.service.impl;

import src.model.Veiculo;
import src.repository.VeiculosRepository;
import src.service.api.Alterar;

public class AlterarVeiculo implements Alterar<Veiculo> {
    VerificacaoCadastroVeiculo verificacaoCadastroVeiculo = new VerificacaoCadastroVeiculo();
    private VeiculosRepository veiculosRepository = new VeiculosRepository();

    @Override
    public void execute(Veiculo veiculo) {
        if (!verificacaoCadastroVeiculo.execute(veiculo)) {
            veiculosRepository.update(veiculo);
            System.out.println("PLACA ATUALIZADO COM SUCESSO");
        } else {
            System.out.println("PLACA NÃO ENCONTRADO");
        }
    }

}
