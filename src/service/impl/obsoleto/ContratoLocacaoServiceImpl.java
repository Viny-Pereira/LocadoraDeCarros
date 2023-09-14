package src.service.impl.obsoleto;

import src.model.Cliente;
import src.model.ContratoLocacao;
import src.model.Veiculo;
import src.repository.ContratoLocacaoRepository;
import src.service.api.ContratoLocacaoService;

import java.util.List;

public class ContratoLocacaoServiceImpl implements ContratoLocacaoService {
    ContratoLocacaoRepository contratoLocacaoRepository = new ContratoLocacaoRepository();

    @Override
    public boolean adicionarContrato(ContratoLocacao contrato) {
        if (contratoLocacaoRepository.findByVeiculo(contrato.getVeiculo()) == null) {
            contratoLocacaoRepository.create(contrato);
            return true;
        }
        return false;
    }

    @Override
    public boolean removerContrato(ContratoLocacao contrato) {
        if (contratoLocacaoRepository.findByVeiculo(contrato.getVeiculo()) != null) {
            contratoLocacaoRepository.delete(contrato);
            return true;
        }
        return false;
    }

    @Override
    public ContratoLocacao buscarContratoPorID(int id) {
        return contratoLocacaoRepository.findById(id);
    }

    @Override
    public ContratoLocacao buscarContratoPorVeiculo(Veiculo veiculo) {
        return contratoLocacaoRepository.findByVeiculo(veiculo);
    }

    @Override
    public List<Cliente> MostrarContratos() {
        return null;
    }
}
