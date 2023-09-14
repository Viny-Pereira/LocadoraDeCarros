package src.controller;


import src.model.Cliente;
import src.model.ContratoLocacao;
import src.model.Veiculo;
import src.service.impl.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlugarController {
    Scanner scanner = new Scanner(System.in);
    String placa;
    String identificacao;
    Veiculo veiculo;
    Cliente cliente;
    ListarVeiculos listarVeiculos = new ListarVeiculos();
    BuscarVeiculoPorPlaca buscarVeiculoPorPlaca = new BuscarVeiculoPorPlaca();
    BuscarClientePorIdentificacao buscarClientePorIdentificacao = new BuscarClientePorIdentificacao();
    CadastrarContrato cadastrarContrato = new CadastrarContrato();

    boolean verificacaoPlaca = false;
    boolean verificacaoIdentificacao = false;


    public void execute() {
        System.out.println("ALUGAR VEICULO");
        while (!verificacaoIdentificacao) {
            System.out.println("DIGITE A IDENTIFICACAO DO CLIENTE");
            identificacao = scanner.next();
            cliente = buscarClientePorIdentificacao.execute(identificacao);
            if (cliente != null) {
                verificacaoIdentificacao = true;
            } else {
                System.out.println("Cliente não cadastrado");
            }
        }

        while (!verificacaoPlaca) {
            listarVeiculos.execute();
            System.out.println("DIGITE A PLACA DO VEICULO DESEJADO");
            placa = scanner.next();
            veiculo = buscarVeiculoPorPlaca.execute(placa);
            // Criar classe para verificacao
            if (veiculo.getDisponivel()) {
                verificacaoPlaca = true;
                Alugar.execute(veiculo);
            } else {
                System.out.println("Veiculo indisponivel");
            }
        }

        System.out.println("DIGITE A DATA DE ALUGUEL (dd-MM-yyyy HH:mm:ss) ");
        String dataAluguel = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime dataAluguelFormatada = LocalDateTime.parse(dataAluguel, formatter);
        ContratoLocacao contratoLocacao = new ContratoLocacao(dataAluguelFormatada, null, veiculo, cliente);
        cadastrarContrato.execute(contratoLocacao);
        System.out.println("Aluguel realizado com sucesso");
    }
}
