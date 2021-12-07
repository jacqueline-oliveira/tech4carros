package br.com.tech4me.tech4cars.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.tech4cars.model.Carro;
import br.com.tech4me.tech4cars.repository.CarroRepository;

@Service
public class CarroServiceImpl implements CarroService{
    @Autowired
    private CarroRepository repo;

    @Override
    public List<Carro> obterCarros() {
       return repo.findAll();
    }

    @Override
    public Carro cadastrarCarro(Carro carro) {
        return repo.save(carro);
    }

    @Override
    public Optional<Carro> obterCarroPorId(String id) {
        return repo.findById(id);
    }

    @Override
    public void excluirCarro(String id) {
        repo.deleteById(id);
    }

    @Override
    public Carro atualizarAutomovel(String id, Carro novoCarro) {
        novoCarro.setId(id);
        return repo.save(novoCarro);
    }

    

    
    
}
