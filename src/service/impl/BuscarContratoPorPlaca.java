package src.service.impl;

import src.model.ContratoLocacao;
import src.model.Veiculo;
import src.repository.ContratoLocacaoRepository;
import src.service.api.Buscar;

public class BuscarContratoPorPlaca implements Buscar<ContratoLocacao> {
    ContratoLocacaoRepository contratoLocacaoRepository = new ContratoLocacaoRepository();

    @Override
    public ContratoLocacao execute(String placa) {
        BuscarVeiculoPorPlaca buscarVeiculoPorPlaca = new BuscarVeiculoPorPlaca();
        Veiculo veiculo = buscarVeiculoPorPlaca.execute(placa);
        if (veiculo == null) {
            return null;
        }
        ContratoLocacao contratoLocacao = contratoLocacaoRepository.findByVeiculo(veiculo);
        if (contratoLocacao == null) {
            System.out.println("CONTRATO NÃO ENCONTRADO");
        }
        return contratoLocacao;
    }
}
