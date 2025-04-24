package br.com.alura.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Marca {

    @JsonAlias({"codigo", "id", "code"})
    private String nomeMarca;

    @JsonAlias({"nome", "brand", "marca"})
    private Long codigoMarca;

    public Marca() {}

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public Long getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(Long codigoMarca) {
        this.codigoMarca = codigoMarca;
    }
}
