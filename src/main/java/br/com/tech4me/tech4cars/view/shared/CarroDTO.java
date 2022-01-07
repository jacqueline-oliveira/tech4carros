package br.com.tech4me.tech4cars.view.shared;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

public class CarroDTO {
    private String id;
    @NotEmpty(message = "Deve preenche o modelo")
    private String modelo;
    @NotBlank(message = "Precisa informar a marca")
    private String marca;
    @NotBlank(message = "Precisa informar placa")
    @Pattern(regexp = "^[a-zA-Z]{3}[0-9]{4}$")
    private String placa;
    @Positive(message = "Valor deve ser maior que zero")
    private Double valor;
    @Positive(message = "Preço deve ser maior que zero")
    private Double precoCusto;
    
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
    public Double getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    
    
}
