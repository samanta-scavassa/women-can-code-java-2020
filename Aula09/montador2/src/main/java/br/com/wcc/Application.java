package br.com.wcc;

import br.com.wcc.model.Componente;
import br.com.wcc.model.Contador;
import br.com.wcc.model.Montador;
import br.com.wcc.model.Placa;

import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Montador montador = new Montador();
        final List<Placa> placas = montador.montarPlacas(5);

        Contador contador = new Contador();
        Map<Componente, Integer> tabelaContador = contador.contaComponentes(placas);
        for (Map.Entry<Componente, Integer> linha : tabelaContador.entrySet()) {
            System.out.println(linha.getKey() + ":" + linha.getValue());
        }
    }
}
