package src.controller;

import src.model.*;
import src.service.impl.CadastrarVeiculo;

import java.util.Scanner;

public class CadastrarVeiculoController {
    Scanner scanner = new Scanner(System.in);
    int opcao;
    Veiculo veiculo;
    TipoVeiculo tipoVeiculo;

    public void execute() {
        System.out.println("Cadastro de Veiculo");
        CadastrarVeiculo cadastrarVeiculo = new CadastrarVeiculo();
        System.out.println("Digite a placa");
        String placa = scanner.next();
        do {
            System.out.println("Qual o tipo de veiculo");
            System.out.println("1 - PEQUENO");
            System.out.println("2 - MEDIO");
            System.out.println("3 - SUV");
            opcao = scanner.nextInt();
        } while (opcao != 1 && opcao != 2 && opcao != 3);

        switch (opcao) {
            case 1 -> {
                tipoVeiculo = new CarroPequeno();
                veiculo = new Veiculo(placa, tipoVeiculo);
            }
            case 2 -> {
                tipoVeiculo = new CarroMedio();
                veiculo = new Veiculo(placa, tipoVeiculo);
            }
            case 3 -> {
                tipoVeiculo = new CarroSUV();
                veiculo = new Veiculo(placa, tipoVeiculo);
            }
            default -> System.out.println("OPÇÃO INVÁLIDA");
        }
        cadastrarVeiculo.execute(veiculo);

    }


}
