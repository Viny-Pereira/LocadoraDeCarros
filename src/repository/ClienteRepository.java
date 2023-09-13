package src.repository;

import src.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository implements Repository<Cliente> {
    private static List<Cliente> clientes = new ArrayList<>();

    @Override
    public boolean create(Cliente cliente) {
        clientes.add(cliente);
        return true;
    }

    @Override
    public boolean delete(Cliente cliente) {
        clientes.remove(cliente);
        return true;
    }

    @Override
    public Cliente findById(int id) {
        return clientes.get(id);
    }

    @Override
    public List<Cliente> findAll() {
        return clientes;
    }

    public Cliente findByDocumento(String documento) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdentificacao().equalsIgnoreCase(documento)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public boolean update(Cliente clienteNovo) {
        for (Cliente clienteAnterior : clientes) {
            if (clienteAnterior.getIdentificacao().equalsIgnoreCase(clienteNovo.getIdentificacao())) {
                clientes.remove(clienteAnterior);
                clientes.add(clienteNovo);
                return true;
            }
        }
        return false;
    }
}
