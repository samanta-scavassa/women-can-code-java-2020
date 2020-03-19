package br.com.wcc.model;

import java.util.ArrayList;
import java.util.List;

public class Placa {
    private List<Componente> componentes = new ArrayList<>();

    public void addComponente(Componente componente) throws IllegalArgumentException {
        if (componentes.size() >= 50) {
            throw new IllegalArgumentException("Ultrapassado o limite de componentes");
        }
        componentes.add(componente);
    }

    @Override
    public String toString() {
        return componentes.toString() + "\n";
    }

    public List<Componente> getComponentes() {
        return componentes;
    }
}
