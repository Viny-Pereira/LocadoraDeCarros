package src.service.impl;

import src.model.Veiculo;
import src.repository.VeiculosRepository;
import src.service.api.VeiculoService;

import java.util.List;

public class VeiculoServiceImpl implements VeiculoService {
    VeiculosRepository veiculosRepository = new VeiculosRepository();

/*    @Override
    public boolean adicionarVeiculo(Veiculo veiculo) {
        if (veiculosRepository.findByPlaca(veiculo.getPlaca()) == null) {
            veiculosRepository.create(veiculo);
            return true;
        }
        return true;
    }*/

    @Override
    public boolean removerVeiculo(Veiculo veiculo) {
        if (veiculosRepository.findByPlaca(veiculo.getPlaca()) != null) {
            veiculosRepository.delete(veiculo);
            return true;
        }
        return false;
    }

    @Override
    public Veiculo buscarVeiculosPorID(int id) {
        return veiculosRepository.findById(id);
    }

/*    @Override
    public Veiculo buscarVeiculosPorPlaca(String placa) {
        return veiculosRepository.findByPlaca(placa);
    }*/

    @Override
    public List<Veiculo> MostrarVeiculos() {
        return veiculosRepository.findAll();
    }
}
