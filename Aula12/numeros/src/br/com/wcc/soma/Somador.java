package br.com.wcc.soma;

import java.util.Arrays;

public class Somador {

    public static <T extends Number> T add(Class<T> clazz, T... numbers) {
        if(numbers instanceof Double[]) {
            return clazz.cast(Arrays.stream((Double[]) numbers)
                    .reduce(0.0, Double::sum));
        } else if(numbers instanceof Integer[]) {
            return clazz.cast(Arrays.stream((Integer[]) numbers)
                    .reduce(0, Integer::sum));
        } else if(numbers instanceof Float[]) {
            return clazz.cast(Arrays.stream((Float[]) numbers)
                    .reduce(0.0f, Float::sum));
        }
        return null;
    }
}
