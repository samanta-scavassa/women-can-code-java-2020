package br.com.wcc.model;

import java.util.ArrayList;
import java.util.List;

public class Montador {
    private List<Placa> placas = new ArrayList<Placa>();

    public List<Placa> montarPlacas(int numPlacas) {
        for (int i = 0; i < numPlacas; i++) {
            Placa placa = montarPlaca(5);
            placas.add(placa);
        }
        return placas;
    }

    private Placa montarPlaca(int numComponentes) {
        Placa placa = new Placa();
        for (int i = 0; i < numComponentes; i++) {
            placa.addComponente(Componente.escolherComponente());
        }
        return placa;
    }

    @Override
    public String toString() {
        return placas.toString() + "\n";
    }
}
