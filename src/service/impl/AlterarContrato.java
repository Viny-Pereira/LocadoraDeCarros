package src.service.impl;

import src.model.ContratoLocacao;
import src.repository.ContratoLocacaoRepository;
import src.service.api.Alterar;

public class AlterarContrato implements Alterar<ContratoLocacao> {
    VerificacaoCadastroContrato verificacaoCadastroContrato = new VerificacaoCadastroContrato();
    private ContratoLocacaoRepository contratoLocacaoRepository = new ContratoLocacaoRepository();

    @Override
    public void execute(ContratoLocacao contratoLocacao) {
        if (!verificacaoCadastroContrato.execute(contratoLocacao)) {
            contratoLocacaoRepository.update(contratoLocacao);
        }

    }
}
