package br.com.wcc.soma.polimorfismo;

import java.util.Arrays;

public class SomadorFloat implements Somador<Float> {

    @Override
    public Float add(Float... numbers) {
        return Arrays.stream(numbers).reduce(0.0f, Float::sum);
    }
}
