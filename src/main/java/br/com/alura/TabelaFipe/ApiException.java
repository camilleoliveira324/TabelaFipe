package br.com.alura.TabelaFipe;

public class ApiException extends RuntimeException {
    public ApiException(String message) {
        super(message);
    }
}
