package src.service.impl;

import src.model.Cliente;
import src.repository.ClienteRepository;
import src.service.api.Buscar;

public class BuscarClientePorIdentificacao implements Buscar<Cliente> {
    private ClienteRepository clienteRepository = new ClienteRepository();

    @Override
    public Cliente execute(String identificacao) {
        Cliente cliente = clienteRepository.findByDocumento(identificacao);
        if (cliente == null) {
            System.out.println("CLIENTE NÃO ENCONTRADO");
        }
        return cliente;
    }
}
