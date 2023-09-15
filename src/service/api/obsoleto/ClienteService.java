package src.service.api.obsoleto;

import src.model.Cliente;

import java.util.List;

public interface ClienteService {

    boolean removerCliente(Cliente cliente);

    Cliente buscarClientePorID(int id);

    //Cliente buscarClientePorDocumento(String documento);

    List<Cliente> MostrarClientes();
}
