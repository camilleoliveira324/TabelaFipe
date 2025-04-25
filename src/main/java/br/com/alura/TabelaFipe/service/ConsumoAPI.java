package br.com.alura.TabelaFipe.service;

import br.com.alura.TabelaFipe.ApiException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoAPI {

    String BASE_URL = "https://parallelum.com.br/fipe/api/v1";
    public String obterDados(String endpoint) {
        try {
            String urlCompleta = BASE_URL + "/" + endpoint;
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlCompleta))
                    .build();

            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //Conferir se o status code veio com erro
//            if (response.statusCode() != 200) {
//                throw new ApiException("API retornou código " + response.statusCode());
//            }

            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new ApiException("Falha na comunicação com API: " + e);
        }
    }
}
