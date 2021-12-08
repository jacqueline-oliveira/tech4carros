package br.com.tech4me.tech4cars.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.tech4cars.model.Carro;
import br.com.tech4me.tech4cars.repository.CarroRepository;
import br.com.tech4me.tech4cars.view.shared.CarroDTO;

@Service
public class CarroServiceImpl implements CarroService{
    @Autowired
    private CarroRepository repo;

    @Override
    public List<CarroDTO> obterCarros() {
       List<Carro> carros = repo.findAll(); 
       
       return carros.stream()
        .map(c -> new ModelMapper().map(c, CarroDTO.class))
        .collect(Collectors.toList());
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
