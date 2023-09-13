package src.service.impl;

import src.model.Veiculo;

public class Devolver {
    void execute(Veiculo veiculo) {
        veiculo.setDisponivel(true);
    }
}
