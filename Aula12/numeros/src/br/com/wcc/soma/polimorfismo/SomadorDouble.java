package br.com.wcc.soma.polimorfismo;

import java.util.Arrays;

public class SomadorDouble implements Somador<Double> {
    @Override
    public Double add(Double... numbers) {
        return Arrays.stream(numbers).reduce(0.0, Double::sum);
    }
}
