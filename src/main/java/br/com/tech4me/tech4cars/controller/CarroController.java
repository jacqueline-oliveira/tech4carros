package br.com.tech4me.tech4cars.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.tech4cars.model.Carro;
import br.com.tech4me.tech4cars.service.CarroService;

@RestController
@RequestMapping("/api/tech4cars")
public class CarroController {
    @Autowired
    private CarroService servico;
   
    @GetMapping
    public ResponseEntity<List<Carro>> obterCarros() {
        return new ResponseEntity<>(servico.obterCarros(), HttpStatus.FOUND);
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<Carro> obterCarroPorId(@PathVariable String id) {
        Optional<Carro> carro = servico.obterCarroPorId(id);

        if (carro.isPresent()){
          return new ResponseEntity<>(carro.get(), HttpStatus.FOUND);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        
    }

    @PostMapping
    public ResponseEntity<Carro> cadastrarCarro(@RequestBody Carro carro) {
        return new ResponseEntity<>(servico.cadastrarCarro(carro), HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> excluirCarro(@PathVariable String id) {
        servico.excluirCarro(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Carro> atualizarCarro(@PathVariable String id, @RequestBody Carro novoCarro){
        return new ResponseEntity<>(servico.atualizarAutomovel(id, novoCarro), HttpStatus.ACCEPTED);
    }




    
}
