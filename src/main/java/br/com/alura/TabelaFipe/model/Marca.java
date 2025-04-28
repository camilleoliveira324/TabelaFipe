package br.com.alura.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.StringUtils;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Marca {

    @JsonAlias({"nome", "brand", "marca"})
    private String nomeMarca;

    @JsonAlias({"codigo", "id", "code"})
    private Integer codigoMarca;

    public Marca() {}

    public Marca(String nomeMarca, String codigoMarca) {
        this.nomeMarca = nomeMarca;
        this.codigoMarca = Integer.parseInt(codigoMarca);
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public Integer getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(String codigoMarca) {
        this.codigoMarca = Integer.parseInt(codigoMarca);
    }

    @Override
    public String toString() {
        return "Cód:" + codigoMarca + " Descrição: " + StringUtils.capitalize(nomeMarca); //biblioteca Apache Commons
    }
}
