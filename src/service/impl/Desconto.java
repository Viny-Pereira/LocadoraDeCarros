package src.service.impl;

import src.model.Cliente;
import src.model.ContratoLocacao;
import src.utils.TempoDeLocacao;

public class Desconto {
    public static double execute(ContratoLocacao contratoLocacao) {
        Cliente cliente = contratoLocacao.getCliente();
        String tipo = cliente.tipo();
        int dias = TempoDeLocacao.diasLocacao(contratoLocacao);
        double desconto = cliente.desconto();
        if (tipo == "PF") {
            if (dias > 5) {
                return desconto;
            }
        }
        if (tipo == "PJ") {
            if (dias > 3) {
                return desconto;
            }
        }

        return 0d;
    }
}
