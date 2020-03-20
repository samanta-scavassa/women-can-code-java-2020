package br.com.wcc.somador;

public interface Somador<T extends Number> {
    T somar(T num1, T num2);

    T somar(T... numeros);
}
