package src.service.impl;

import src.model.Cliente;
import src.repository.ClienteRepository;
import src.service.api.Buscar;

public class BuscarClientePorIdentificacao implements Buscar<Cliente> {
    private ClienteRepository clienteRepository = new ClienteRepository();

    @Override
    public Cliente execute(String identificacao) {
        return clienteRepository.findByDocumento(identificacao);
    }
}
