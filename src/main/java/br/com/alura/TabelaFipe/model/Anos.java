package br.com.alura.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Anos {

    @JsonAlias("codigo")
    private String codigo;

    @JsonAlias("nome")
    private String nomeAnoModelo;

    public Anos (){}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeAnoModelo() {
        return nomeAnoModelo;
    }

    public void setNomeAnoModelo(String nomeAnoModelo) {
        this.nomeAnoModelo = nomeAnoModelo;
    }
}
