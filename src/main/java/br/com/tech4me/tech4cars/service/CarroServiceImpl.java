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
    public CarroDTO cadastrarCarro(CarroDTO carro) {
        Carro carroCadastro = new ModelMapper().map(carro, Carro.class);
        carroCadastro = repo.save(carroCadastro);
        return new ModelMapper().map(carroCadastro, CarroDTO.class);
    }

    @Override
    public Optional<CarroDTO> obterCarroPorId(String id) {
        Optional<Carro> carroBusca = repo.findById(id);
        return Optional.of(new ModelMapper().map(carroBusca.get(), CarroDTO.class));
    }

    @Override
    public void excluirCarro(String id) {
        repo.deleteById(id);
    }

    @Override
    public CarroDTO atualizarAutomovel(String id, CarroDTO novoCarro) {
        Carro carroParaAtualizar = new ModelMapper().map(novoCarro, Carro.class);
        carroParaAtualizar.setId(id);
        carroParaAtualizar = repo.save(carroParaAtualizar);
        return new ModelMapper().map(carroParaAtualizar, CarroDTO.class);
    }

    

    
    
}
