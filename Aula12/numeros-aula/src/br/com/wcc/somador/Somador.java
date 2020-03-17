package br.com.wcc.somador;

import java.util.List;

public interface Somador <T extends Number> {
    T somar(T num1, T num2);

    T somar(T... numeros);
}
