package src.service.impl;

import src.model.Cliente;
import src.repository.ClienteRepository;
import src.service.api.Cadastrar;

public class CadastrarCliente implements Cadastrar<Cliente> {

    private ClienteRepository clienteRepository = new ClienteRepository();

    @Override
    public boolean execute(Cliente cliente) {
        if (clienteRepository.findByDocumento(cliente.getIdentificacao()) == null) {
            clienteRepository.create(cliente);
            return true;
        } else {
            return false;
        }
    }

}
