package src.repository;

import src.model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculosRepository implements Repository<Veiculo> {

    private static final List<Veiculo> veiculos = new ArrayList<>();

    @Override
    public boolean create(Veiculo veiculo) {
        veiculos.add(veiculo);
        return true;
    }

    @Override
    public boolean delete(Veiculo veiculo) {
        veiculos.remove(veiculo);
        return true;
    }

    @Override
    public Veiculo findById(int id) {
        return veiculos.get(id);
    }

    @Override
    public List<Veiculo> findAll() {
        return veiculos;
    }


    public Veiculo findByPlaca(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                return veiculo;
            }
        }
        return null;
    }

    @Override
    public boolean update(Veiculo veiculo) {
        for (Veiculo veiculoAnterior : veiculos) {
            if (veiculoAnterior.getPlaca().equalsIgnoreCase(veiculo.getPlaca())) {
                veiculos.add(veiculo);
                veiculos.remove(veiculo);
                return true;
            }
        }
        return false;
    }
}
