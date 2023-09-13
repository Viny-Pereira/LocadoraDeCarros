package src.service.impl;

import src.model.ContratoLocacao;
import src.model.Veiculo;
import src.utils.TempoDeLocacao;

public class ValorLocacao {
    public double calculoLocacao(ContratoLocacao contratoLocacao) {
        double valorLocacao;
        int diasLocacao = TempoDeLocacao.diasLocacao(contratoLocacao);
        double desconto = Desconto.execute(contratoLocacao);
        Veiculo veiculo = contratoLocacao.getVeiculo();
        double valorDiaria = veiculo.valorDiaria();
        valorLocacao = valorDiaria * diasLocacao * (1 - desconto);
        return valorLocacao;
    }

}
