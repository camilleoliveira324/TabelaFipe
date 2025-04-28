package br.com.alura.TabelaFipe.main;

import br.com.alura.TabelaFipe.model.Anos;
import br.com.alura.TabelaFipe.model.Marca;
import br.com.alura.TabelaFipe.model.Modelos;
import br.com.alura.TabelaFipe.model.Valor;
import br.com.alura.TabelaFipe.service.ConsumoAPI;
import br.com.alura.TabelaFipe.service.ConverterDados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

        List<Marca> marca = conversor.obterLista(json, Marca.class);

        marca.stream()
                .sorted(Comparator.comparing(Marca::getCodigoMarca))
                .forEach(System.out::println);



        System.out.println("\nDigite o codigo da marca");
        Integer codigoMarca = sc.nextInt();
        sc.nextLine();

        String campo = "modelos";
        opcao += "/" + codigoMarca + "/modelos";
        json = consumoAPI.obterDados(opcao);

        List<Modelos> modelos = conversor.extrairModelosEAnos(json, campo, Modelos.class);
        modelos.stream()
                .sorted(Comparator.comparing(Modelos::getCodigoModelo))
                .forEach(System.out::println);

        //Filtrando modelos
        System.out.println("\nDigite o nome do modelo");
        String filtroModelos = sc.nextLine();

        List<Modelos> modelosFiltrados = modelos.stream()
                .filter(m -> m.getNomeModelo().toLowerCase()
                        .contains(filtroModelos.toLowerCase()))
                .collect(Collectors.toList());

        modelosFiltrados.forEach(System.out::println);


        System.out.println("\nDigite o codigo do modelo");
        Integer codigoModelo = sc.nextInt();
        sc.nextLine();

        opcao += "/" + codigoModelo + "/anos";
        json = consumoAPI.obterDados(opcao);
        List<Anos> anos = conversor.obterLista(json, Anos.class);



        List<Valor> valores = new ArrayList<>();

        for (int i = 0; i < anos.size(); i++) {
            String opcaoAno = opcao + "/" + anos.get(i).getCodigo();
            json = consumoAPI.obterDados(opcaoAno);
            Valor valor = conversor.obterDados(json, Valor.class);
            valores.add(valor);
        }

        System.out.println("\n Todos os veiculos filtrados com avaliações por ano:");
        valores.forEach(System.out::println);


    }
}
