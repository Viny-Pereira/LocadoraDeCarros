package src.service.impl;

import src.model.ContratoLocacao;
import src.repository.ContratoLocacaoRepository;
import src.service.api.Alterar;

public class AlterarContrato implements Alterar<ContratoLocacao> {
    private ContratoLocacaoRepository contratoLocacaoRepository = new ContratoLocacaoRepository();

    @Override
    public boolean execute(ContratoLocacao contratoLocacao) {
        if (contratoLocacaoRepository.findById(contratoLocacao.getIdContrato()) != null) {
            contratoLocacaoRepository.update(contratoLocacao);
            return true;
        }
        return false;
    }
}
