package src.controller;

import src.model.Veiculo;
import src.service.impl.BuscarVeiculoPorPlaca;

import java.util.Scanner;

public class BuscarVeiculoController {
    Scanner scanner = new Scanner(System.in);
    int opcao;

    public void execute() {
        System.out.println("Buscar veiculo");
        BuscarVeiculoPorPlaca buscarVeiculoPorPlaca = new BuscarVeiculoPorPlaca();
        System.out.println("Digite a placa");
        String placa = scanner.next();
        Veiculo veiculo = buscarVeiculoPorPlaca.execute(placa);
        if (veiculo != null) {
            System.out.println(veiculo);
        }

    }
}
