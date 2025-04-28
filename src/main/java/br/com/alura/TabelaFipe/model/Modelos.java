package br.com.alura.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Modelos {

    @JsonAlias("nome")
    private String nomeModelo;

    @JsonAlias("codigo")
    private Integer codigoModelo;

    public Modelos(){}

    public Modelos(String nomeModelo, String codigoModelo) {
        this.nomeModelo = nomeModelo;
        this.codigoModelo = Integer.parseInt(codigoModelo);
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public Integer getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(String codigoModelo) {
        this.codigoModelo = Integer.parseInt(codigoModelo);
    }

    @Override
    public String toString() {
        return "Cód:" + codigoModelo + " Descrição: " + nomeModelo;
    }
}
