package br.com.wcc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Montador {
    private static Random RANDOM = new Random();

    private List<Placa> placas = new ArrayList<>();
    private CriadorPlaca criadorPlaca;

    public Montador(CriadorPlaca criadorPlaca) {
        this.criadorPlaca = criadorPlaca;
    }

    public List<Placa> montarPlacas(int numPlacas) {
        for (int i = 0; i < numPlacas; i++) {
            Placa placa = montarPlaca(RANDOM.nextInt(100));
            placas.add(placa);
        }
        return placas;
    }

    private Placa montarPlaca(int numComponentes) {
        Placa placa = criadorPlaca.criarPlaca();
        for (int i = 0; i < numComponentes; i++) {
            try {
                placa.addComponente(Componente.escolherComponente());
            } catch (IllegalArgumentException ex) {
                break;
            }
        }
        return placa;
    }

    @Override
    public String toString() {
        return placas.toString() + "\n";
    }
}
