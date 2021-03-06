package br.com.tech4me.tech4cars.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.tech4cars.view.shared.CarroDTO;

public interface CarroService {
    List<CarroDTO> obterCarros();
    CarroDTO cadastrarCarro(CarroDTO carro);
    Optional<CarroDTO> obterCarroPorId(String id);
    void excluirCarro(String id);
    CarroDTO atualizarAutomovel(String id, CarroDTO novoCarro);

}
