package br.com.tech4me.tech4cars.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.tech4cars.model.Carro;

public interface CarroService {
    List<Carro> obterCarros();
    Carro cadastrarCarro(Carro carro);
    Optional<Carro> obterCarroPorId(String id);
    void excluirCarro(String id);
    Carro atualizarAutomovel(String id, Carro novoCarro);

}
