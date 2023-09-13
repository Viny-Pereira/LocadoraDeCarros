package src.service.impl;

import src.model.Veiculo;

public class Alugar {
    void execute(Veiculo veiculo) {
        veiculo.setDisponivel(false);
    }

}
