package src.service.api;

import src.model.Cliente;
import src.model.ContratoLocacao;
import src.model.Veiculo;

import java.util.List;

public interface ContratoLocacaoService {
    boolean adicionarContrato(ContratoLocacao contrato);

    boolean removerContrato(ContratoLocacao contrato);

    ContratoLocacao buscarContratoPorID(int id);

    ContratoLocacao buscarContratoPorVeiculo(Veiculo veiculo);

    List<Cliente> MostrarContratos();
}
