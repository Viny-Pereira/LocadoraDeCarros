package src.service.impl;

import src.model.Veiculo;
import src.repository.VeiculosRepository;
import src.service.api.Cadastrar;
import src.service.api.VerificacaoCadastro;

public class CadastrarVeiculo implements Cadastrar<Veiculo> {
    VerificacaoCadastro<Veiculo> verificacaoCadastro = new VerificacaoCadastroVeiculo();
    private VeiculosRepository veiculosRepository = new VeiculosRepository();

    @Override
    public void execute(Veiculo veiculo) {
        if (verificacaoCadastro.execute(veiculo)) {
            veiculosRepository.create(veiculo);
            System.out.println("VEICULO CADASTRADO COM SUCESSO");
        } else {
            System.out.println("VEICULO JÁ CADASTRADO");
        }

    }
}
