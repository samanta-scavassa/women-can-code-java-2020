package br.com.wcc;

import br.com.wcc.model.Componente;
import br.com.wcc.model.Contador;
import br.com.wcc.model.Montador;
import br.com.wcc.model.Placa;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Montador montador = new Montador();
        final List<Placa> placas = montador.montarPlacas(15);

        imprimirPlacas(placas);
        imprimirContador(placas);
    }

    private static void imprimirPlacas(List<Placa> placas) {
        System.out.println(placas.stream()
                .map(Placa::toString)
                .collect(Collectors.toList()));
    }

    private static void imprimirContador(List<Placa> placas) {
        Contador contador = new Contador();
        Map<Componente, Integer> tabelaContador = contador.contaComponentes(placas);
        for (Map.Entry<Componente, Integer> linha : tabelaContador.entrySet()) {
            System.out.println(linha.getKey() + ":" + linha.getValue());
        }
    }
}
