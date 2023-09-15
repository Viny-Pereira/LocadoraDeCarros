package src.service.impl;

import src.model.ContratoLocacao;
import src.repository.ContratoLocacaoRepository;
import src.service.api.Cadastrar;

public class CadastrarContrato implements Cadastrar<ContratoLocacao> {
    VerificacaoCadastroContrato verificacaoCadastroContrato = new VerificacaoCadastroContrato();
    private ContratoLocacaoRepository contratoLocacaoRepository = new ContratoLocacaoRepository();

    @Override
    public void execute(ContratoLocacao contratoLocacao) {
        if (verificacaoCadastroContrato.execute(contratoLocacao)) {
            contratoLocacaoRepository.create(contratoLocacao);
            System.out.println("CONTRATO CADASTRADO COM SUCESSO");

        } else {
            System.out.println("CONTRATO JÁ CADASTRADO");
        }

    }
}
