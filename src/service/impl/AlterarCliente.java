package src.service.impl;

import src.model.Cliente;
import src.repository.ClienteRepository;
import src.service.api.Alterar;

public class AlterarCliente implements Alterar<Cliente> {
    private ClienteRepository clienteRepository = new ClienteRepository();

    @Override
    public boolean execute(Cliente cliente) {
        if (clienteRepository.findById(cliente.getId()) != null) {
            clienteRepository.update(cliente);
            return true;
        }
        return false;
    }
}
