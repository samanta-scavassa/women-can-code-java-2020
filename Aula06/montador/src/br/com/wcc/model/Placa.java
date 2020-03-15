package br.com.wcc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Placa que possui até 50 componentes
 */
public class Placa {
    private List<Componente> componentes;

    public Placa() {
        this.componentes = new ArrayList<>();
    }

    public void adicionarComponente(Componente componente) {
        if(componentes.size() > 50) {
            throw new IllegalStateException("Uma placa não pode ter mais de 50 componentes");
        }

        componentes.add(componente);
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    @Override
    public String toString() {
        return "Placa [componentes=" + componentes + "]";
    }
}