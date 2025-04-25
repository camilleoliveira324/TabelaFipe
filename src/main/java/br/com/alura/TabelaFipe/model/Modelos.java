package br.com.alura.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Modelos {

    @JsonAlias("nome")
    private String nomeModelo;

    @JsonAlias("codigo")
    private Long codigoModelo;

    public Modelos(){}

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public Long getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(Long codigoModelo) {
        this.codigoModelo = codigoModelo;
    }
}
