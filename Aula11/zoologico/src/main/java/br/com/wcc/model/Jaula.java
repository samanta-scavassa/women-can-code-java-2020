package br.com.wcc.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jaula<A extends Animal> {
    private List<A> animais = new ArrayList<>();

    public void adicionarAnimais(A... animais) {
        this.animais.addAll(Arrays.asList(animais));
    }

    public List<A> listarAnimais() {
        return this.animais;
    }
}
