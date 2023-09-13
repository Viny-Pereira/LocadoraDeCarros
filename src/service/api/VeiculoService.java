package src.service.api;

import src.model.Veiculo;

import java.util.List;

public interface VeiculoService {

    boolean removerVeiculo(Veiculo veiculo);

    Veiculo buscarVeiculosPorID(int id);

    //Veiculo buscarVeiculosPorPlaca(String placa);

    List<Veiculo> MostrarVeiculos();

}
