package br.com.alura.TabelaFipe.service;

import br.com.alura.TabelaFipe.model.Modelos;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.util.ArrayList;
import java.util.List;

public class ConverterDados {
    private static final ObjectMapper mapper = new ObjectMapper();

    public <T> T obterDados(String json, Class<T> tClass) {
        try {
            return mapper.readValue(json, tClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Falha ao converter JSON para " + tClass.getSimpleName(), e);
        }
    }

    public <T> List<T> obterLista (String json, Class<T> classe) {
        CollectionType lista = mapper.getTypeFactory()
                .constructCollectionType(List.class, classe);

        try {
            return mapper.readValue(json, lista);
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> List<T> extrairModelosEAnos(String json, String campo, Class<T> classe){
        JsonNode rootNode = null;
        try {
            rootNode = mapper.readTree(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        JsonNode dadosNode = rootNode.get(campo);

        List<T> resultados = new ArrayList<>();

        if (dadosNode.isArray()) {
            for (JsonNode item : dadosNode) {
                T objeto = null;
                try {
                    objeto = mapper.treeToValue(item, classe);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
                resultados.add(objeto);
            }
        }

        return resultados;
    }
}
