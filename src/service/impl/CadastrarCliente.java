package src.service.impl;

import src.model.Cliente;
import src.repository.ClienteRepository;
import src.service.api.Cadastrar;

public class CadastrarCliente implements Cadastrar<Cliente> {
    VerificacaoCadastroCliente verificacaoCadastro = new VerificacaoCadastroCliente();
    private ClienteRepository clienteRepository = new ClienteRepository();

    @Override
    public void execute(Cliente cliente) {
        if (verificacaoCadastro.execute(cliente)) {
            clienteRepository.create(cliente);
            System.out.println("CLIENTE CADASTRADO COM SUCESSO");

        } else {
            System.out.println("CLIENTE JÁ CADASTRADO");

        }
    }

}
