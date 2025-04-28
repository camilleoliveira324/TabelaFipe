package br.com.alura.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Valor {
    @JsonAlias("TipoVeiculo")
    private Integer tipoVeiculo;

    @JsonAlias("Valor")
    private String valor;

    @JsonAlias("Marca")
    private String marca;

    @JsonAlias("AnoModelo")
    private Integer ano;

    @JsonAlias("Modelo")
    private String modelo;

    @JsonAlias({"Combustível", "Combustivel"})
    private String combustivel;

    public Valor(){}

    public Integer getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(Integer tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
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

    @Override
    public String toString() {
        return "Valor{" +
                "valor=" + valor +
                ", marca=" + marca +
                ", ano=" + ano +
                ", modelo='" + modelo + '\'' +
                ", combustivel='" + combustivel + '\'' +
                '}';
    }
}
