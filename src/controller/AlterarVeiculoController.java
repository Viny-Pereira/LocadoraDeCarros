package src.controller;

import src.model.TipoVeiculo;
import src.model.Veiculo;
import src.service.impl.AlterarVeiculo;
import src.service.impl.BuscarVeiculoPorPlaca;

import java.util.Scanner;

public class AlterarVeiculoController {
    Scanner scanner = new Scanner(System.in);
    BuscarVeiculoPorPlaca buscarVeiculoPorPlaca = new BuscarVeiculoPorPlaca();


    public void execute() {
        System.out.println("Alterar Veiculo");
        AlterarVeiculo alterarVeiculo = new AlterarVeiculo();
        System.out.println("Digite a placa do veiculo desejado");
        String placa = scanner.next();
        Veiculo veiculo = buscarVeiculoPorPlaca.execute(placa);
        System.out.println("Qual a nova placa do veiculo");
        String novaPlaca = scanner.next();
        veiculo.setPlaca(novaPlaca);
        alterarVeiculo.execute(veiculo);
        System.out.println("Placa atualizada com sucesso!");
    }

}
