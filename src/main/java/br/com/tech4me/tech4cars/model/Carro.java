package br.com.tech4me.tech4cars.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("carros")
public class Carro {
    @Id
    private String id;
    private String modelo;
    private String marca;
    private String placa;
    private Double valor;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", valor=" + valor + "]";
    }

    
    
}
