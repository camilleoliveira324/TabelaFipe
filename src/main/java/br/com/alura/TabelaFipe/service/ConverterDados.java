package br.com.alura.TabelaFipe.service;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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

    
}
