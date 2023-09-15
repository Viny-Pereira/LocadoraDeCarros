package src.service.impl;

import src.model.Cliente;
import src.repository.ClienteRepository;
import src.service.api.Alterar;

public class AlterarCliente implements Alterar<Cliente> {
    VerificacaoCadastroCliente verificacaoCadastroCliente = new VerificacaoCadastroCliente();
    private ClienteRepository clienteRepository = new ClienteRepository();

    @Override
    public void execute(Cliente cliente) {
        if (!verificacaoCadastroCliente.execute(cliente)) {
            clienteRepository.update(cliente);
            System.out.println("NOME DO CLIENTE ATUALIZADO COM SUCESSO");
        } else {

            System.out.println("IDENTIFICACAO DO CLIENTE NÃO ENCONTRADA");
        }


    }
}
