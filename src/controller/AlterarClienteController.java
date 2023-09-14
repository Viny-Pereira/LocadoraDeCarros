package src.controller;

import src.model.Cliente;
import src.service.impl.AlterarCliente;
import src.service.impl.BuscarClientePorIdentificacao;

import java.util.Scanner;

public class AlterarClienteController {
    Scanner scanner = new Scanner(System.in);
    BuscarClientePorIdentificacao buscarClientePorIdentificacao = new BuscarClientePorIdentificacao();

    public void execute() {
        System.out.println("Alterar nome cliente");
        AlterarCliente alterarCliente = new AlterarCliente();
        System.out.println("Digite a identificacao do cliente desejado");
        String identificacao = scanner.next();
        Cliente cliente = buscarClientePorIdentificacao.execute(identificacao);
        System.out.println("Qual o novo nome para o cliente");
        String novoNome = scanner.next();
        cliente.setNome(novoNome);
        alterarCliente.execute(cliente);
        System.out.println("Nome atualizado com sucesso!");
    }
}
