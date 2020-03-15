package br.com.wcc.model;

import java.util.ArrayList;
import java.util.List;

public class Placa {
    private List<Componente> componentes = new ArrayList<Componente>();

    public void addComponente(Componente componente) {
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
