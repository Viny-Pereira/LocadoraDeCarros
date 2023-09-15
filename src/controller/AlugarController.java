package src.controller;


import src.model.Cliente;
import src.model.ContratoLocacao;
import src.model.Veiculo;
import src.service.impl.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
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
    ContratoLocacao contratoLocacao;

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
            }
        }
        while (!verificacaoPlaca) {
            List<Veiculo> listaVeiculos = listarVeiculos.execute();
            for (Veiculo veiculo : listaVeiculos) {
                System.out.println(veiculo);
            }
            System.out.println("DIGITE A PLACA DO VEICULO DESEJADO");
            placa = scanner.next();
            veiculo = buscarVeiculoPorPlaca.execute(placa);
            if (veiculo != null) {
                if (veiculo.getDisponivel()) {
                    verificacaoPlaca = true;
                } else {
                    System.out.println("Veiculo indisponivel");
                }

            }
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("DIGITE A DATA DE ALUGUEL (dd-MM-yyyy HH:mm:ss)");
        String dataAluguel = scanner1.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime dataAluguelFormatada = LocalDateTime.parse(dataAluguel, formatter);
        contratoLocacao = new ContratoLocacao(dataAluguelFormatada, veiculo, cliente);
        cadastrarContrato.execute(contratoLocacao);
        Alugar.execute(veiculo);

    }
}
