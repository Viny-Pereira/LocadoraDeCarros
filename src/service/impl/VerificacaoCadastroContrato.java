package src.service.impl;

import src.model.ContratoLocacao;
import src.repository.ContratoLocacaoRepository;
import src.service.api.VerificacaoCadastro;

public class VerificacaoCadastroContrato implements VerificacaoCadastro<ContratoLocacao> {
    private ContratoLocacaoRepository contratoLocacaoRepository = new ContratoLocacaoRepository();

    @Override
    public boolean execute(ContratoLocacao contratoLocacao) {
        if (contratoLocacaoRepository.findById(contratoLocacao.getIdContrato()) == null) {
            return true;
        }
        return false;
    }
}
