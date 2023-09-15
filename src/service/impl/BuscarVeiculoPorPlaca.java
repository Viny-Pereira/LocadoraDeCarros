package src.service.impl;

import src.model.Veiculo;
import src.repository.VeiculosRepository;
import src.service.api.Buscar;

public class BuscarVeiculoPorPlaca implements Buscar<Veiculo> {
    VerificacaoCadastroVeiculo verificacaoCadastroVeiculo = new VerificacaoCadastroVeiculo();
    private VeiculosRepository veiculosRepository = new VeiculosRepository();

    @Override
    public Veiculo execute(String placa) {
        Veiculo veiculo = veiculosRepository.findByPlaca(placa);
        if (veiculo == null) {
            System.out.println("VEICULO NÃO ENCONTRADO");
        }
        return veiculo;
    }
}
