package br.com.alura.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Valor {
    @JsonAlias("TipoVeiculo")
    private Integer tipoVeiculo;

    @JsonAlias("Valor")
    private Double valor;

    @JsonAlias("Marca")
    private Marca marca;

    @JsonAlias("AnoModelo")
    private Long ano;

    @JsonAlias("Modelo")
    private String modelo;

    @JsonAlias("Combustível")
    private String combustivel;

    public Valor(){}

    public Integer getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(Integer tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Long getAno() {
        return ano;
    }

    public void setAno(Long ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
