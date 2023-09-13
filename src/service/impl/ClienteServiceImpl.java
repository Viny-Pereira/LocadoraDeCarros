package src.service.impl;

import src.model.Cliente;
import src.repository.ClienteRepository;
import src.service.api.ClienteService;

import java.util.List;

public class ClienteServiceImpl implements ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

/*    @Override
    public boolean adicionarCliente(Cliente cliente) {
        if (buscarClientePorDocumento(cliente.getIdentificacao()) == null) {
            clienteRepository.create(cliente);
            return true;
        } else {
            return false;
        }
    }*/

    @Override
    public boolean removerCliente(Cliente cliente) {
        if (buscarClientePorID(cliente.getId()) != null) {
            clienteRepository.delete(cliente);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Cliente buscarClientePorID(int id) {
        return clienteRepository.findById(id);
    }

/*    @Override
    public Cliente buscarClientePorDocumento(String documento) {
        return clienteRepository.findByDocumento(documento);
    }*/

    @Override
    public List<Cliente> MostrarClientes() {
        return clienteRepository.findAll();
    }
}
