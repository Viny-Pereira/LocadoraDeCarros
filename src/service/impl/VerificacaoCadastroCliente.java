package src.service.impl;

import src.model.Cliente;
import src.repository.ClienteRepository;
import src.service.api.VerificacaoCadastro;

public class VerificacaoCadastroCliente implements VerificacaoCadastro<Cliente> {
    private ClienteRepository clienteRepository = new ClienteRepository();

    @Override
    public boolean execute(Cliente cliente) {
        if (clienteRepository.findByDocumento(cliente.getIdentificacao()) == null) {
            return true;
        }
        return false;
    }
}
