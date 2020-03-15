package br.com.wcc.soma.polimorfismo;

public interface Somador <T extends Number> {
    T add(T... numbers);
}
