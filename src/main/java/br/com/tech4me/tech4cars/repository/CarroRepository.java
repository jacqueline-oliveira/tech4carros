package br.com.tech4me.tech4cars.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.tech4me.tech4cars.model.Carro;


public interface CarroRepository extends MongoRepository<Carro, String>{
    
}
