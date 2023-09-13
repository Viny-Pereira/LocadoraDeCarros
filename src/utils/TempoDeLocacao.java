package src.utils;

import src.model.ContratoLocacao;

import java.time.Duration;

public class TempoDeLocacao {
    public static int diasLocacao(ContratoLocacao contratoLocacao) {
        Duration duracaoLocacao = Duration.between(contratoLocacao.getDataAluguel(), contratoLocacao.getDataDevolucao());

        int duracaoLocacaoHoras = (int) Math.ceil((double) duracaoLocacao.toMinutes() / 60);

        if (contratoLocacao.getDataDevolucao().isAfter(contratoLocacao.getDataAluguel())) {
            duracaoLocacaoHoras++;
        }

        long diasAlugados = duracaoLocacaoHoras / 24;

        return (int) diasAlugados;
    }

}
