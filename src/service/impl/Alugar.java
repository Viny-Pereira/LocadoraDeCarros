package src.service.impl;

import src.model.Veiculo;

public class Alugar {
    public static void execute(Veiculo veiculo) {
        veiculo.setDisponivel(false);
    }

}
