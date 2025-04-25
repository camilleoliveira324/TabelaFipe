package br.com.alura.TabelaFipe.main;

import br.com.alura.TabelaFipe.model.Marca;
import br.com.alura.TabelaFipe.service.ConsumoAPI;
import br.com.alura.TabelaFipe.service.ConverterDados;

import java.util.Scanner;

public class Principal {
    private Scanner sc = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConverterDados conversor = new ConverterDados();

    public void exibeMenu() {
        var menu = """
                *** OPÇÕES ***
                
                Carro
                Moto
                Caminhão
                
                Digite uma das opções para consulta:
                
                """;
        System.out.println(menu);
        String opcao = sc.nextLine();

        if (opcao.toLowerCase().contains("carr")) {
            opcao = "carros/marcas";
        } else if (opcao.toLowerCase().contains("mot")) {
            opcao = "motos/marcas";
        } else {
            opcao = "caminhoes/marcas";
        }

        String json = consumoAPI.obterDados(opcao);

        System.out.println(json);

        Marca marca = conversor.obterDados(json, Marca.class);




    }
}
