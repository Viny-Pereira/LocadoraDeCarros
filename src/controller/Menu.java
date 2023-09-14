package src.controller;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int opcao;

    public Menu() {
    }

    public void execute() {
        do {
            System.out.println("1 - CADASTRAR VEICULO");
            System.out.println("2 - ALTERAR VEICULO");
            System.out.println("3 - BUSCAR VEICULO POR PLACA");
            System.out.println("4 - CADASTRAR CLIENTE");
            System.out.println("5 - ALTERAR CLIENTE");
            System.out.println("6 - ALUGAR VEICULO");
            System.out.println("7 - DEVOLVER VEICULO");
            System.out.println("0 - SAIR");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    CadastrarVeiculoController cadastrarVeiculoController = new CadastrarVeiculoController();
                    cadastrarVeiculoController.execute();
                    break;
                case 2:
                    AlterarVeiculoController alterarVeiculoController = new AlterarVeiculoController();
                    alterarVeiculoController.execute();
                    break;
                case 3:
                    BuscarVeiculoController buscarVeiculoController = new BuscarVeiculoController();
                    buscarVeiculoController.execute();
                    break;
                case 4:
                    CadastrarClienteController cadastrarClienteController = new CadastrarClienteController();
                    cadastrarClienteController.execute();
                    break;
                case 5:
                    AlterarClienteController alterarClienteController = new AlterarClienteController();
                    alterarClienteController.execute();
                    break;
                case 6:
                    AlugarController alugarController = new AlugarController();
                    alugarController.execute();
                    break;
                case 7:
                    DevolverController devolverController = new DevolverController();
                    devolverController.execute();
                    break;
            }
        } while (opcao != 0);

    }
}
