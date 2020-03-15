package br.com.wcc.soma;

import java.util.Arrays;

public class Somador {

    public static <T extends Number> T add(Class<T> clazz, T... numbers) {
        if(numbers instanceof Double[]) {
            return clazz.cast(add((Double[]) numbers));
        } else if(numbers instanceof Integer[]) {
            return clazz.cast(add((Integer[]) numbers));
        } else if(numbers instanceof Float[]) {
            return clazz.cast(add((Float[]) numbers));
        }
        return null;
    }

    private static Integer add(Integer... numbers) {
        return Arrays.stream(numbers).reduce(0, Integer::sum);
    }

    private static Double add(Double... numbers) {
        return Arrays.stream(numbers).reduce(0.0, Double::sum);
    }

    private static Float add(Float... numbers) {
        return Arrays.stream(numbers).reduce(0.0f, Float::sum);
    }
}
