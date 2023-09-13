package src.repository;

import src.model.ContratoLocacao;
import src.model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class ContratoLocacaoRepository implements Repository<ContratoLocacao> {
    private static List<ContratoLocacao> contratos = new ArrayList<>();

    @Override
    public boolean create(ContratoLocacao contratoLocacao) {
        contratos.add(contratoLocacao);

        return true;
    }

    @Override
    public boolean delete(ContratoLocacao contratoLocacao) {
        contratos.remove(contratoLocacao);
        return true;
    }

    @Override
    public boolean update(ContratoLocacao novoContrato) {
        for (ContratoLocacao contratoAntigo : contratos) {
            if (contratoAntigo.getIdContrato() == novoContrato.getIdContrato()) {
                contratos.remove(contratoAntigo);
                contratos.add(novoContrato);
                return true;
            }
        }
        return false;
    }

    @Override
    public ContratoLocacao findById(int id) {
        return contratos.get(id);
    }

    @Override
    public List<ContratoLocacao> findAll() {
        return contratos;
    }

    public ContratoLocacao findByVeiculo(Veiculo veiculo) {
        for (ContratoLocacao contratoLocacao : contratos) {
            if (contratoLocacao.getVeiculo().getId() == (veiculo.getId())) {
                return contratoLocacao;
            }
        }
        return null;
    }

}
