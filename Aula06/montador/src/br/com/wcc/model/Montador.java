package br.com.wcc.model;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Montador - classe usada para montar placas com um número aleatório de
 * componentes, não passando de 50
 */
public class Montador {
    private static final Random RANDOM = new Random();
    private static final int MAX_COMPONENTS = 50;

    public static List<Placa> montarPlacas(int numPlacas) {
        return IntStream.range(0, numPlacas)
                .map((i) -> RANDOM.nextInt(MAX_COMPONENTS))
                .mapToObj(Montador::criarPlaca)
                .collect(Collectors.toList());
    }

    private static Placa criarPlaca(int numComponentes) {
        Placa placa = new Placa();
        IntStream.range(0, numComponentes).forEach((i) -> {
            placa.adicionarComponente(Componente.randomComponente());
        });
        return placa;
    }
}