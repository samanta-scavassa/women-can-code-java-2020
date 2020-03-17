package br.com.wcc.somador;

import java.util.Arrays;

public class SomadorDouble implements Somador<Double> {

    @Override
    public Double somar(Double num1, Double num2) {
        return Double.sum(num1, num2);
    }

    @Override
    public Double somar(Double... numeros) {
        return Arrays.stream(numeros)
                .reduce(0.0, Double::sum);
    }
}
