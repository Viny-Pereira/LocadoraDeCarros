package src.controller;

import src.model.ContratoLocacao;
import src.model.Veiculo;
import src.service.impl.AlterarContrato;
import src.service.impl.AlterarVeiculo;
import src.service.impl.BuscarContratoPorPlaca;
import src.service.impl.ValorLocacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DevolverController {
    Scanner scanner = new Scanner(System.in);
    BuscarContratoPorPlaca buscarContratoPorPlaca = new BuscarContratoPorPlaca();
    AlterarContrato alterarContrato = new AlterarContrato();
    AlterarVeiculo alterarVeiculo = new AlterarVeiculo();
    String placa;
    Veiculo veiculo;
    ContratoLocacao contratoLocacao;
    double valorAPagar;
    boolean verificacaoPlaca = false;
    boolean verificacaoData = false;

    void execute() {
        System.out.println("DEVOLVER VEICULO");
        while (!verificacaoPlaca) {
            System.out.println("DIGITE A PLACA DO VEICULO QUE DESEJA DEVOLVER");
            placa = scanner.next();
            contratoLocacao = buscarContratoPorPlaca.execute(placa);
            if (contratoLocacao != null) {
                verificacaoPlaca = true;
            }
        }
        while (!verificacaoData) {
            try {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("DIGITE A DATA DA DEVOLUCAO (dd-MM-yyyy HH:mm:ss) ");
                String dataDevolucao = scanner1.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                LocalDateTime dataDevolucaoFormatada = LocalDateTime.parse(dataDevolucao, formatter);
                contratoLocacao.setDataDevolucao(dataDevolucaoFormatada);
                veiculo = contratoLocacao.getVeiculo();
                veiculo.setDisponivel(true);
                alterarVeiculo.execute(veiculo);
                verificacaoData = true;
            } catch (Exception e) {
                System.out.println("Formado de data inválido");
            }
        }

        alterarContrato.execute(contratoLocacao);
        System.out.println("Devolucao concluida !");
        valorAPagar = ValorLocacao.calculoLocacao(contratoLocacao);
        System.out.println("Valor a pagar deve ser igual a " + valorAPagar);
    }
}
