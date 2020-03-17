package br.com.wcc.somador;

import java.util.Arrays;

public class SomadorFloat implements Somador<Float> {

    @Override
    public Float somar(Float num1, Float num2) {
        return Float.sum(num1, num2);
    }

    @Override
    public Float somar(Float... numeros) {
        return Arrays.stream(numeros)
                .reduce(0.0f, Float::sum);
    }
}
