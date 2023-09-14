package src.controller;

import src.model.Cliente;
import src.model.PessoaFisica;
import src.model.PessoaJuridica;
import src.service.impl.CadastrarCliente;

import java.util.Scanner;

public class CadastrarClienteController {
    Scanner scanner = new Scanner(System.in);
    int opcao;
    Cliente cliente;


    public void execute() {
        System.out.println("Cadastro de Cliente");
        CadastrarCliente cadastrarCliente = new CadastrarCliente();
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        do {
            System.out.println("Pessoa fisica ou Juridica");
            System.out.println("1 - PF");
            System.out.println("2 - PJ");
            opcao = scanner.nextInt();
        } while (opcao != 1 && opcao != 2);

        switch (opcao) {
            case 1 -> {
                System.out.println("PESSOA FISICA");
                System.out.println("DIGITE SEU CPF");
                String CPF = scanner.next();
                System.out.println("DIGITE SUA IDADE");
                int idade = scanner.nextInt();
                cliente = new PessoaFisica(nome, CPF, idade);
            }
            case 2 -> {
                System.out.println("PESSOA JURIDICA");
                System.out.println("DIGITE SEU CNPJ");
                String CNPJ = scanner.next();
                cliente = new PessoaJuridica(nome, CNPJ);
            }
            default -> System.out.println("OPCÃO INVÁLIDA");
        }
        cadastrarCliente.execute(cliente);
        System.out.println("Cliente cadastrado com sucesso");

    }

}
